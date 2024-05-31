<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="专家账号" prop="zhuanjiazhanghao">
          <el-input v-model="ruleForm.zhuanjiazhanghao" 
              placeholder="专家账号" clearable  :readonly="ro.zhuanjiazhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="专家账号" prop="zhuanjiazhanghao">
              <el-input v-model="ruleForm.zhuanjiazhanghao" 
                placeholder="专家账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="专家姓名" prop="zhuanjiaxingming">
          <el-input v-model="ruleForm.zhuanjiaxingming" 
              placeholder="专家姓名" clearable  :readonly="ro.zhuanjiaxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="专家姓名" prop="zhuanjiaxingming">
              <el-input v-model="ruleForm.zhuanjiaxingming" 
                placeholder="专家姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教学能力" prop="jiaoyujiaoxuezhishi">
          <el-input v-model="ruleForm.jiaoyujiaoxuezhishi" 
              placeholder="教学能力" clearable  :readonly="ro.jiaoyujiaoxuezhishi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教学能力" prop="jiaoyujiaoxuezhishi">
              <el-input v-model="ruleForm.jiaoyujiaoxuezhishi" 
                placeholder="教学能力" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教研项目" prop="jiaoxuesheji">
          <el-input v-model="ruleForm.jiaoxuesheji" 
              placeholder="教研项目" clearable  :readonly="ro.jiaoxuesheji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教研项目" prop="jiaoxuesheji">
              <el-input v-model="ruleForm.jiaoxuesheji" 
                placeholder="教研项目" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="科研能力" prop="meitihejishushiyong">
          <el-input v-model="ruleForm.meitihejishushiyong" 
              placeholder="科研能力" clearable  :readonly="ro.meitihejishushiyong"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="科研能力" prop="meitihejishushiyong">
              <el-input v-model="ruleForm.meitihejishushiyong" 
                placeholder="科研能力" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="社会服务能力" prop="xinxibiaoda">
          <el-input v-model="ruleForm.xinxibiaoda" 
              placeholder="社会服务能力" clearable  :readonly="ro.xinxibiaoda"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="社会服务能力" prop="xinxibiaoda">
              <el-input v-model="ruleForm.xinxibiaoda" 
                placeholder="社会服务能力" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="文化传承能力" prop="jiaoxuezuzhi">
          <el-input v-model="ruleForm.jiaoxuezuzhi" 
              placeholder="文化传承能力" clearable  :readonly="ro.jiaoxuezuzhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="文化传承能力" prop="jiaoxuezuzhi">
              <el-input v-model="ruleForm.jiaoxuezuzhi" 
                placeholder="文化传承能力" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教学职位" prop="jiaoxueguanli">
          <el-input v-model="ruleForm.jiaoxueguanli" 
              placeholder="教学职位" clearable  :readonly="ro.jiaoxueguanli"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教学职位" prop="jiaoxueguanli">
              <el-input v-model="ruleForm.jiaoxueguanli" 
                placeholder="教学职位" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教研论文" prop="jiaoxuepingjia">
          <el-input v-model="ruleForm.jiaoxuepingjia" 
              placeholder="教研论文" clearable  :readonly="ro.jiaoxuepingjia"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教研论文" prop="jiaoxuepingjia">
              <el-input v-model="ruleForm.jiaoxuepingjia" 
                placeholder="教研论文" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教学反思" prop="jiaoxuefansi">
          <el-input v-model="ruleForm.jiaoxuefansi" 
              placeholder="教学反思" clearable  :readonly="ro.jiaoxuefansi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教学反思" prop="jiaoxuefansi">
              <el-input v-model="ruleForm.jiaoxuefansi" 
                placeholder="教学反思" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教材出版" prop="jiaoxueyanjiu">
          <el-input v-model="ruleForm.jiaoxueyanjiu" 
              placeholder="教材出版" clearable  :readonly="ro.jiaoxueyanjiu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教材出版" prop="jiaoxueyanjiu">
              <el-input v-model="ruleForm.jiaoxueyanjiu" 
                placeholder="教材出版" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="学术交流" prop="xueshujiaoliu">
          <el-input v-model="ruleForm.xueshujiaoliu" 
              placeholder="学术交流" clearable  :readonly="ro.xueshujiaoliu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="学术交流" prop="xueshujiaoliu">
              <el-input v-model="ruleForm.xueshujiaoliu" 
                placeholder="学术交流" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="总分" prop="zongfen">
            <el-input v-model="zongfen"
                placeholder="总分" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zongfen" label="总分" prop="zongfen">
              <el-input v-model="ruleForm.zongfen" 
                placeholder="总分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="教师姓名" prop="jiaoshixingming">
          <el-input v-model="ruleForm.jiaoshixingming" 
              placeholder="教师姓名" clearable  :readonly="ro.jiaoshixingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="教师姓名" prop="jiaoshixingming">
              <el-input v-model="ruleForm.jiaoshixingming" 
                placeholder="教师姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="教师账号" prop="jiaoshizhanghao">
          <el-select  @change="jiaoshizhanghaoChange" v-model="ruleForm.jiaoshizhanghao" placeholder="请选择教师账号">
            <el-option
                v-for="(item,index) in jiaoshizhanghaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.jiaoshizhanghao" label="教师账号" prop="jiaoshizhanghao">
              <el-input v-model="ruleForm.jiaoshizhanghao" 
                placeholder="教师账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机" prop="shouji">
              <el-input v-model="ruleForm.shouji" 
                placeholder="手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(252, 125, 125, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"0px"},
      id: '',
      type: '',
      ro:{
	zhuanjiazhanghao : false,
	zhuanjiaxingming : false,
	jiaoyujiaoxuezhishi : false,
	jiaoxuesheji : false,
	meitihejishushiyong : false,
	xinxibiaoda : false,
	jiaoxuezuzhi : false,
	jiaoxueguanli : false,
	jiaoxuepingjia : false,
	jiaoxuefansi : false,
	jiaoxueyanjiu : false,
	xueshujiaoliu : false,
	zongfen : false,
	jiaoshixingming : false,
	jiaoshizhanghao : false,
	shouji : false,
      },
      ruleForm: {
        zhuanjiazhanghao: '',
        zhuanjiaxingming: '',
        jiaoyujiaoxuezhishi: '',
        jiaoxuesheji: '',
        meitihejishushiyong: '',
        xinxibiaoda: '',
        jiaoxuezuzhi: '',
        jiaoxueguanli: '',
        jiaoxuepingjia: '',
        jiaoxuefansi: '',
        jiaoxueyanjiu: '',
        xueshujiaoliu: '',
        zongfen: '',
        jiaoshixingming: '',
        jiaoshizhanghao: '',
        shouji: '',
      },
          jiaoshizhanghaoOptions: [],
      rules: {
          zhuanjiazhanghao: [
          ],
          zhuanjiaxingming: [
          ],
          jiaoyujiaoxuezhishi: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxuesheji: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          meitihejishushiyong: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          xinxibiaoda: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxuezuzhi: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxueguanli: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxuepingjia: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxuefansi: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoxueyanjiu: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          xueshujiaoliu: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          zongfen: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiaoshixingming: [
          ],
          jiaoshizhanghao: [
          ],
          shouji: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
    zongfen: {
      get: function () {
        return 0+parseFloat(this.ruleForm.jiaoyujiaoxuezhishi==""?0:this.ruleForm.jiaoyujiaoxuezhishi)+parseFloat(this.ruleForm.jiaoxuesheji==""?0:this.ruleForm.jiaoxuesheji)+parseFloat(this.ruleForm.meitihejishushiyong==""?0:this.ruleForm.meitihejishushiyong)+parseFloat(this.ruleForm.xinxibiaoda==""?0:this.ruleForm.xinxibiaoda)+parseFloat(this.ruleForm.jiaoxuezuzhi==""?0:this.ruleForm.jiaoxuezuzhi)+parseFloat(this.ruleForm.jiaoxueguanli==""?0:this.ruleForm.jiaoxueguanli)+parseFloat(this.ruleForm.jiaoxuepingjia==""?0:this.ruleForm.jiaoxuepingjia)+parseFloat(this.ruleForm.jiaoxuefansi==""?0:this.ruleForm.jiaoxuefansi)+parseFloat(this.ruleForm.jiaoxueyanjiu==""?0:this.ruleForm.jiaoxueyanjiu)+parseFloat(this.ruleForm.xueshujiaoliu==""?0:this.ruleForm.xueshujiaoliu) || 0
      }
    },
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='zhuanjiazhanghao'){
            this.ruleForm.zhuanjiazhanghao = obj[o];
	    this.ro.zhuanjiazhanghao = true;
            continue;
          }
          if(o=='zhuanjiaxingming'){
            this.ruleForm.zhuanjiaxingming = obj[o];
	    this.ro.zhuanjiaxingming = true;
            continue;
          }
          if(o=='jiaoyujiaoxuezhishi'){
            this.ruleForm.jiaoyujiaoxuezhishi = obj[o];
	    this.ro.jiaoyujiaoxuezhishi = true;
            continue;
          }
          if(o=='jiaoxuesheji'){
            this.ruleForm.jiaoxuesheji = obj[o];
	    this.ro.jiaoxuesheji = true;
            continue;
          }
          if(o=='meitihejishushiyong'){
            this.ruleForm.meitihejishushiyong = obj[o];
	    this.ro.meitihejishushiyong = true;
            continue;
          }
          if(o=='xinxibiaoda'){
            this.ruleForm.xinxibiaoda = obj[o];
	    this.ro.xinxibiaoda = true;
            continue;
          }
          if(o=='jiaoxuezuzhi'){
            this.ruleForm.jiaoxuezuzhi = obj[o];
	    this.ro.jiaoxuezuzhi = true;
            continue;
          }
          if(o=='jiaoxueguanli'){
            this.ruleForm.jiaoxueguanli = obj[o];
	    this.ro.jiaoxueguanli = true;
            continue;
          }
          if(o=='jiaoxuepingjia'){
            this.ruleForm.jiaoxuepingjia = obj[o];
	    this.ro.jiaoxuepingjia = true;
            continue;
          }
          if(o=='jiaoxuefansi'){
            this.ruleForm.jiaoxuefansi = obj[o];
	    this.ro.jiaoxuefansi = true;
            continue;
          }
          if(o=='jiaoxueyanjiu'){
            this.ruleForm.jiaoxueyanjiu = obj[o];
	    this.ro.jiaoxueyanjiu = true;
            continue;
          }
          if(o=='xueshujiaoliu'){
            this.ruleForm.xueshujiaoliu = obj[o];
	    this.ro.xueshujiaoliu = true;
            continue;
          }
          if(o=='zongfen'){
            this.ruleForm.zongfen = obj[o];
	    this.ro.zongfen = true;
            continue;
          }
          if(o=='jiaoshixingming'){
            this.ruleForm.jiaoshixingming = obj[o];
	    this.ro.jiaoshixingming = true;
            continue;
          }
          if(o=='jiaoshizhanghao'){
            this.ruleForm.jiaoshizhanghao = obj[o];
	    this.ro.jiaoshizhanghao = true;
            continue;
          }
          if(o=='shouji'){
            this.ruleForm.shouji = obj[o];
	    this.ro.shouji = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.zhuanjiazhanghao!=''&&json.zhuanjiazhanghao){
              		this.ruleForm.zhuanjiazhanghao = json.zhuanjiazhanghao
		}
		if(json.zhuanjiaxingming!=''&&json.zhuanjiaxingming){
              		this.ruleForm.zhuanjiaxingming = json.zhuanjiaxingming
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/jiaoshi/jiaoshizhanghao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.jiaoshizhanghaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
    },
    // 下二随
    jiaoshizhanghaoChange () {
      this.$http({
        url: `follow/jiaoshi/jiaoshizhanghao?columnValue=`+ this.ruleForm.jiaoshizhanghao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.jiaoshixingming){
                this.ruleForm.jiaoshixingming = data.data.jiaoshixingming
              }
              if(data.data.shouji){
                this.ruleForm.shouji = data.data.shouji
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `zhuanjiapingfen/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
        this.ruleForm.zongfen = this.zongfen
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
















      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `zhuanjiapingfen/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.zhuanjiapingfenCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zhuanjiapingfenCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
