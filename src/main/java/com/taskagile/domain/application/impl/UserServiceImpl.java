package com.taskagile.domain.application.impl;

import com.taskagile.domain.application.UserService;
import com.taskagile.domain.application.commands.RegistrationCommand;
import com.taskagile.domain.common.event.DomainEventPublisher;
import com.taskagile.domain.common.mail.MailManager;
import com.taskagile.domain.common.mail.MessageVariable;
import com.taskagile.domain.model.user.RegistrationException;
import com.taskagile.domain.model.user.RegistrationManagment;
import com.taskagile.domain.model.user.User;
import com.taskagile.domain.model.user.events.UserRegisteredEvent;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private RegistrationManagment registrationManagment;
    private DomainEventPublisher domainEventPublisher;
    private MailManager mailManager;

    public UserServiceImpl(RegistrationManagment registartionManagment,
                           DomainEventPublisher domainEventPUblisher,
                           MailManager mailManager){
      this.registrationManagment = registartionManagment;
      this.domainEventPublisher = domainEventPublisher;
      this.mailManager = mailManager;
    }

    @Override
    public void register(RegistrationCommand command) throws RegistrationException {
      Assert.notNull(command, "Parameter `command` must not be null");
      User newUser = registrationManagment.register(
        command.getUsername(),
        command.getEmailAddress(),
        command.getPassword());
  
      sendWelcomeMessage(newUser);
      domainEventPublisher.publish(new UserRegisteredEvent(newUser));
    }
  

    private void sendWelcomeMessage(User user){
      mailManager.send(
        user.getEmailAddress(),
        "Welcome to TaskAgile",
        "welcome.ftl",
        MessageVariable.from("user", user)
      );
    }

}
