// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloudPreviewoutcallRequest} extends {@link RequestModel}
 *
 * <p>CloudPreviewoutcallRequest</p>
 */
public class CloudPreviewoutcallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupTels")
    private String backupTels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallVariables")
    private String callVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdrIsAsr")
    private Long cdrIsAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidList")
    private String clidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrnId")
    private String crnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialTelTimeout")
    private Long dialTelTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsInvestigation")
    private Long isInvestigation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClid")
    private String obClid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClidAreaCode")
    private String obClidAreaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClidGroup")
    private String obClidGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
    private String requestUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private CloudPreviewoutcallRequest(Builder builder) {
        super(builder);
        this.backupTels = builder.backupTels;
        this.callVariables = builder.callVariables;
        this.cdrIsAsr = builder.cdrIsAsr;
        this.clidList = builder.clidList;
        this.cno = builder.cno;
        this.crnId = builder.crnId;
        this.dialTelTimeout = builder.dialTelTimeout;
        this.enterpriseId = builder.enterpriseId;
        this.isInvestigation = builder.isInvestigation;
        this.obClid = builder.obClid;
        this.obClidAreaCode = builder.obClidAreaCode;
        this.obClidGroup = builder.obClidGroup;
        this.requestUniqueId = builder.requestUniqueId;
        this.tel = builder.tel;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudPreviewoutcallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupTels
     */
    public String getBackupTels() {
        return this.backupTels;
    }

    /**
     * @return callVariables
     */
    public String getCallVariables() {
        return this.callVariables;
    }

    /**
     * @return cdrIsAsr
     */
    public Long getCdrIsAsr() {
        return this.cdrIsAsr;
    }

    /**
     * @return clidList
     */
    public String getClidList() {
        return this.clidList;
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return crnId
     */
    public String getCrnId() {
        return this.crnId;
    }

    /**
     * @return dialTelTimeout
     */
    public Long getDialTelTimeout() {
        return this.dialTelTimeout;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return isInvestigation
     */
    public Long getIsInvestigation() {
        return this.isInvestigation;
    }

    /**
     * @return obClid
     */
    public String getObClid() {
        return this.obClid;
    }

    /**
     * @return obClidAreaCode
     */
    public String getObClidAreaCode() {
        return this.obClidAreaCode;
    }

    /**
     * @return obClidGroup
     */
    public String getObClidGroup() {
        return this.obClidGroup;
    }

    /**
     * @return requestUniqueId
     */
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CloudPreviewoutcallRequest, Builder> {
        private String backupTels; 
        private String callVariables; 
        private Long cdrIsAsr; 
        private String clidList; 
        private String cno; 
        private String crnId; 
        private Long dialTelTimeout; 
        private Long enterpriseId; 
        private Long isInvestigation; 
        private String obClid; 
        private String obClidAreaCode; 
        private String obClidGroup; 
        private String requestUniqueId; 
        private String tel; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(CloudPreviewoutcallRequest request) {
            super(request);
            this.backupTels = request.backupTels;
            this.callVariables = request.callVariables;
            this.cdrIsAsr = request.cdrIsAsr;
            this.clidList = request.clidList;
            this.cno = request.cno;
            this.crnId = request.crnId;
            this.dialTelTimeout = request.dialTelTimeout;
            this.enterpriseId = request.enterpriseId;
            this.isInvestigation = request.isInvestigation;
            this.obClid = request.obClid;
            this.obClidAreaCode = request.obClidAreaCode;
            this.obClidGroup = request.obClidGroup;
            this.requestUniqueId = request.requestUniqueId;
            this.tel = request.tel;
            this.timeout = request.timeout;
        } 

        /**
         * <p>备用外呼号码；tel没呼通时呼叫备用号码，最多支持5个号码，多个之间用逗号分隔</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder backupTels(String backupTels) {
            this.putQueryParameter("BackupTels", backupTels);
            this.backupTels = backupTels;
            return this;
        }

        /**
         * <p>通道变量可以在以下场景中使用：1. 事件推送，作为推送字段使用2. 通话记录中，将字段存储在自定义字段3. 通过SIP-Header方式将字段传到呼叫的下游链路格式如: [{&quot;name&quot;:&quot;mainUniqueId&quot;,&quot;value&quot;:&quot;cdr_main_unique_id&quot;,&quot;type&quot;:&quot;2&quot;},{&quot;name&quot;:&quot;callType&quot;,&quot;value&quot;:&quot;cdr_call_type&quot;,&quot;type&quot;:&quot;2&quot;}]name：变量名称value：变量值type：变量类型，1.普通变量 2.PJSIP_HEADER变量（用于将变量通过SIP-Header方式传到客户侧，最多支持5个）</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;mainUniqueId&quot;,&quot;value&quot;:&quot;cdr_main_unique_id&quot;,&quot;type&quot;:&quot;2&quot;},{&quot;name&quot;:&quot;callType&quot;,&quot;value&quot;:&quot;cdr_call_type&quot;,&quot;type&quot;:&quot;2&quot;}]</p>
         */
        public Builder callVariables(String callVariables) {
            this.putQueryParameter("CallVariables", callVariables);
            this.callVariables = callVariables;
            return this;
        }

        /**
         * <p>此次通话录音是否进行ASR转写；0.不进行 1.进行 默认：1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cdrIsAsr(Long cdrIsAsr) {
            this.putQueryParameter("CdrIsAsr", cdrIsAsr);
            this.cdrIsAsr = cdrIsAsr;
            return this;
        }

        /**
         * <p>外显号码集合, 格式如: [{&quot;clid&quot;:&quot;1708587xxxx&quot;,&quot;priority&quot;:1},{&quot;clid&quot;:&quot;1304412xxxx&quot;,&quot;priority&quot;:2},{&quot;clid&quot;:&quot;0107990xxxx&quot;,&quot;priority&quot;:3}] clid：外显号码（String类型）（必填）priority：优先级（Integer类型）（非必填） 特别说明： 一次呼叫最多允许传10个指定号码；若指定了号码优先级，要求所有传入的号码都必传</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;clid&quot;:&quot;1708587xxxx&quot;,&quot;priority&quot;:1},{&quot;clid&quot;:&quot;1304412xxxx&quot;,&quot;priority&quot;:2},{&quot;clid&quot;:&quot;0107990xxxx&quot;,&quot;priority&quot;:3}]</p>
         */
        public Builder clidList(String clidList) {
            this.putQueryParameter("ClidList", clidList);
            this.clidList = clidList;
            return this;
        }

        /**
         * <p>座席工号；3-10位数字</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>外显导航标识</p>
         * 
         * <strong>example:</strong>
         * <p>12333</p>
         */
        public Builder crnId(String crnId) {
            this.putQueryParameter("CrnId", crnId);
            this.crnId = crnId;
            return this;
        }

        /**
         * <p>呼叫客户侧超时时间；取值范围 5&lt;=dialTelTimeout&lt;=60，默认45(单位:s)</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder dialTelTimeout(Long dialTelTimeout) {
            this.putQueryParameter("DialTelTimeout", dialTelTimeout);
            this.dialTelTimeout = dialTelTimeout;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>是否满意度调查；0.不进行满意度调查 1.进行满意度调查，默认：取企业配置</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isInvestigation(Long isInvestigation) {
            this.putQueryParameter("IsInvestigation", isInvestigation);
            this.isInvestigation = isInvestigation;
            return this;
        }

        /**
         * <p>可传入企业中继号码或设置好的客户侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder obClid(String obClid) {
            this.putQueryParameter("ObClid", obClid);
            this.obClid = obClid;
            return this;
        }

        /**
         * <p>指定外显区号；传入区号，在指定区号下外显号码；如果obClid和obClidAreaCode都传的情况下，按照obClid外显</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        public Builder obClidAreaCode(String obClidAreaCode) {
            this.putQueryParameter("ObClidAreaCode", obClidAreaCode);
            this.obClidAreaCode = obClidAreaCode;
            return this;
        }

        /**
         * <p>客户侧外显号码组；使用clidGroup需要账号支持按标识路由，使用此参数时clid参数无效</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        public Builder obClidGroup(String obClidGroup) {
            this.putQueryParameter("ObClidGroup", obClidGroup);
            this.obClidGroup = obClidGroup;
            return this;
        }

        /**
         * <p>请求唯一id；取值：如果没有传入值则系统会生产。如果是加密的号码，需要URLEncode后传入</p>
         * 
         * <strong>example:</strong>
         * <p>req1234567</p>
         */
        public Builder requestUniqueId(String requestUniqueId) {
            this.putQueryParameter("RequestUniqueId", requestUniqueId);
            this.requestUniqueId = requestUniqueId;
            return this;
        }

        /**
         * <p>需要进行呼叫的客户方电话号码，固话带区号，手机不加0。 当开启号码隐藏设置时，可从弹屏事件中获取customerNumberKey的值，进行外呼；<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A5%E5%8F%A3%E9%83%A8%E5%88%86/%E5%8A%A0%E5%AF%86%E5%A4%96%E5%91%BC%E5%8F%B7%E7%A0%81%E5%8A%A0%E5%AF%86%E8%A7%84%E5%88%99.md">加密外呼</a>；如果是加密的号码，需要URLEncode后传入；当外呼相关配置-支持分机号外呼开启后，此字段可支持传手机号-分机号格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1774821736</p>
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        /**
         * <p>呼叫座席侧超时时间；取值范围 5&lt;=timeout&lt;=60，默认30(单位:s)</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CloudPreviewoutcallRequest build() {
            return new CloudPreviewoutcallRequest(this);
        } 

    } 

}
