const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师荣誉","menuJump":"列表","tableName":"jiaoshirongyu"}],"menu":"教师荣誉管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"专家","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师自评","menuJump":"列表","tableName":"jiaoshiziping"}],"menu":"教师自评管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"专家评分","menuJump":"列表","tableName":"zhuanjiapingfen"}],"menu":"专家评分管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","修改","查看"],"menu":"教师荣誉","menuJump":"列表","tableName":"jiaoshirongyu"}],"menu":"教师荣誉管理"},{"child":[{"buttons":["新增","查看","修改"],"menu":"教师自评","menuJump":"列表","tableName":"jiaoshiziping"}],"menu":"教师自评管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"教师荣誉","menuJump":"列表","tableName":"jiaoshirongyu"}],"menu":"教师荣誉管理"},{"child":[{"buttons":["查看"],"menu":"教师自评","menuJump":"列表","tableName":"jiaoshiziping"}],"menu":"教师自评管理"},{"child":[{"buttons":["新增","查看","修改"],"menu":"专家评分","menuJump":"列表","tableName":"zhuanjiapingfen"}],"menu":"专家评分管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"专家","tableName":"zhuanjia"}]
    }
}
export default menu;