/*global Vue*/
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import PersonPage from '@/components/Person'
import IndexPage from '@/pages/IndexPage'
import NavPage from '@/pages/NavPage'
import SearchPage from '@/pages/SearchPage'
import ComponentPage from '@/pages/ComponentIndex'
import WXPage from '@/pages/WXPage'
import ScanPage from '@/pages/ScanPage'

Vue.use(Router)
const basePath='http://192.168.31.241:8080/dist';

module.exports = new Router({
	mode: 'history', 
  routes: [
    {
      path: '/',
      component: NavPage
    },
     {
      path: '/NavPage',
      component: NavPage
    },
    {
      path: '/IndexPage',
      component: IndexPage
    },
    {
    	path: '/Person',
    	component: PersonPage
    },
    {
      path: '/HelloWorld',
      component: HelloWorld
    },
    {
    	path: '/SearchPage',
        component: SearchPage
    },
    {
    	path: '/WXPage',
        component: WXPage
    },
    {
    	path: '/ComponentPage',
        component: ComponentPage
    },
    {
    	path: '/ScanPage',
        component: ScanPage
    }
  ]
})
