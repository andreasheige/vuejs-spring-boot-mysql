<template>
  <footer class="footer">
    <span class="copyright">&copy; 2020 Andreas Heige</span>
    <ul class="footer-links list-inline float-right">
        <li class="list-inline-item"><a href="#">{{ $t("pageFooter.about") }}</a></li>
        <li class="list-inline-item"><a href="#">{{ $t("pageFooter.termOfService" )}}</a></li>
        <li class="list-inline-item"><a href="#">{{ $t("pageFooter.rivacyPolicy") }}</a></li>
        <li class="list-inline-item"><a href="https://github.com/andreasheige" target="_blank">Andreas Heige @ Github</a></li>
    </ul>
  </footer>
</template>

<script>
export default {
    name: 'PageFooter'
}
</script>

<style lang="scss" scooped>
.footer{
    width: 100%;
    font-size: 13px;
    color: #666;
    line-height: 40px;
    border-top: 1px solid #ddd;
    margin-top: 50px;

    .list-inline-kitem{
        margin-right: 10px;
    }

    a{
        color: #666;
    }
}
</style>
