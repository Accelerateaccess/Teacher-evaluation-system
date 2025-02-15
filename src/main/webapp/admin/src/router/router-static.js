import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jiaoshirongyu from '@/views/modules/jiaoshirongyu/list'
    import zhuanjia from '@/views/modules/zhuanjia/list'
    import jiaoshiziping from '@/views/modules/jiaoshiziping/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import zhuanjiapingfen from '@/views/modules/zhuanjiapingfen/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    },{
        path:'/pay',
        name:'支付',
        component:pay
    }
      ,{
	path: '/jiaoshirongyu',
        name: '教师荣誉',
        component: jiaoshirongyu
      }
      ,{
	path: '/zhuanjia',
        name: '专家',
        component: zhuanjia
      }
      ,{
	path: '/jiaoshiziping',
        name: '教师自评',
        component: jiaoshiziping
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/zhuanjiapingfen',
        name: '专家评分',
        component: zhuanjiapingfen
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  // mode: 'hash',
 mode: 'history',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
