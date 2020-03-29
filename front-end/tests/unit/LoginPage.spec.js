import Vue from 'vue'
import LoginPage from '@/views/LoginPage'
import { isTSAnyKeyword } from '@babel/types'

describe('LoginPage.vue', () => {
  it('should render correct contents', () => {
    const Constructor = Vue.extend(LoginPage)
    const vm = new Constructor().$mount()
    expect(vm.$el.querySelector('h1').textContent)
    .toEqual('TaskAgile')
  })
})