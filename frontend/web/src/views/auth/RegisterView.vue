<template>
    <div id="auth-container">
        <div class="auth-form-container">
            <div class="welcome">欢迎注册</div>
            <div class="content">
                <div class="auth-form-header">
                    <h1>注册</h1>
                </div>
                <form @submit.prevent="register">
                    <!-- 开始 注册信息 -->
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label"
                            >邮箱地址</label
                        >
                        <input
                            v-model="user.email"
                            @blur="onBlur"
                            type="email"
                            class="form-control"
                            id="exampleInputEmail1"
                            aria-describedby="emailHelp" />
                        <div id="emailHelp" class="form-text">
                            你的电子邮箱地址。
                        </div>
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">密码</label>
                        <input
                            v-model="user.pwd"
                            @blur="onBlur"
                            type="password"
                            class="form-control"
                            id="pwd" />
                    </div>
                    <div class="mb-3">
                        <label for="re-pwd" class="form-label">重复密码</label>
                        <input
                            v-model="user.repwd"
                            @blur="onBlur"
                            type="password"
                            class="form-control"
                            id="re-pwd" />
                    </div>
                    <div class="mb-3">
                        <label for="nickname" class="form-label">昵称</label>
                        <input
                            v-model="user.username"
                            @blur="onBlur"
                            type="text"
                            class="form-control"
                            id="nickname" />
                    </div>
                    <div class="tip">
                        如果你是教师，请在注册成功后前往个人中心的账号页面申请教师权限
                    </div>
                    <div class="mb-3 form-check">
                        <input
                            v-model="user.remember_me"
                            type="checkbox"
                            class="form-check-input"
                            id="exampleCheck1" />
                        <label class="form-check-label" for="exampleCheck1"
                            >记住密码</label
                        >
                    </div>
                    <!-- 结束 注册信息-->
                    <div class="err-msg">{{ err_msg }}</div>
                    <button type="submit" class="btn btn-primary">注册</button>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
import { ref } from 'vue'
export default {
    name: 'RegisterView',
    setup() {
        let user = {
            email: '',
            pwd: '',
            repwd: '',
            username: '',
            remember_me: false,
        }
        let err_msg = ref('')

        const register = () => {
            console.log(user)
        }

        const onBlur = () => {
            if (user.email === '' || user.email === null)
                err_msg.value = "请输入邮箱地址"
            else if (user.pwd === '')
                err_msg.value = "请输入密码"
            else if (user.repwd === '')
                err_msg.value = "请再次输入密码"
            else if (user.username === '')
                err_msg.value = "请输入昵称"
            else
                err_msg.value = ""
        }

        return {
            user,
            err_msg,
            register,
            onBlur,
        }
    }
}
</script>

<style scoped>
#auth-container {
    --height-header: 3.5rem;
    --height-exclude-header: calc(100vh - var(--height-header));
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 32px 0 24px;
    min-height: calc(var(--height-exclude-header) - 10px);
}
.auth-form-container {
    display: flex;
    position: relative;
    background: #f6f7f9;
    box-shadow: 0 0.125rem 0.625rem 0 rgba(12, 96, 209, 0.1);
    min-width: 400px;
}

.welcome {
    width: 400px;
    background: #eaedf0;
    padding: 2rem;
    /*  */
    position: relative;
    overflow: hidden;
}

.content {
    padding: 3em 2em;
    display: flex;
    flex-direction: column;
    align-items: center;
    min-width: 24rem;
}

.auth-form-header {
    display: flex;
    align-items: flex-end;
    justify-content: space-between;
    width: 100%;
    margin-bottom: 1rem;
}

.auth-form-header h1 {
    font-size: 30px;
}

form {
    width: 100%;
}

button.btn.btn-primary {
    float: right;
}

.err-msg {
    color: #d93e36;
    margin: 10px 0;
}
/* 
1. 请填写邮箱地址
2. 请填写密码
3. 请填写昵称
4. 两次输入的密码不一致
*/

.tip {
    font-size: 14px;
    color: hsl(0, 0%, 45%);
    margin: 0 0 1em;
}
</style>
