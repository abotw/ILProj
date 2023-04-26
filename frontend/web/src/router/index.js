import { createRouter, createWebHistory } from 'vue-router'
import LoginView from '../views/auth/LoginView'
import RegisterView from '../views/auth/RegisterView'

const routes = [
  {
    path: '/',
    name: 'index',
  },
  {
    path: '/auth/login/',
    name: 'auth_login',
    component: LoginView,
  },
  {
    path: '/auth/register/',
    name: 'auth_register',
    component: RegisterView,
  }
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
