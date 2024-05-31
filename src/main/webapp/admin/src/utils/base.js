const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm9m0be/",
            name: "ssm9m0be",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm9m0be/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校在线教师教学学术能力评价系统"
        } 
    }
}
export default base
