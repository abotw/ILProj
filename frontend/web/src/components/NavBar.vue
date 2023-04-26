<template>
    <div id="nav-wrap">
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">ILProj</a>
                <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown"
                    aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <router-link
                                class="nav-link active"
                                aria-current="page"
                                href="#"
                                :to="{ name: 'index' }"
                                >首页</router-link
                            >
                        </li>
                        <li class="nav-item">
                            <router-link
                                class="nav-link"
                                aria-current="page"
                                href="#"
                                :to="{ name: 'auth_login' }"
                                >登录</router-link
                            >
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" :to="{name: 'auth_register'}">注册</router-link>
                        </li>
                        <li class="nav-item dropdown">
                            <a
                                class="nav-link dropdown-toggle"
                                href="#"
                                role="button"
                                data-bs-toggle="dropdown"
                                aria-expanded="false">
                                我的
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a class="dropdown-item" href="#"
                                        >PlaceHoder1</a
                                    >
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#"
                                        >PlaceHoder2</a
                                    >
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#"
                                        >PlaceHoder1</a
                                    >
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</template>

<script>
export default {}
</script>

<style scoped>
#nav-wrap {
    --height-header: 3.5rem;
    --bg-base: hsl(0, 0%, 100%);
    --bg-normal: hsl(211, 20%, 93%);
}

#nav-wrap {
    height: var(--height-header);
    box-shadow: 0 0.1875rem 0.5rem var(--bg-normal);
}

nav {
    width: 80%;
    margin: 0 auto;
    
}
</style>
