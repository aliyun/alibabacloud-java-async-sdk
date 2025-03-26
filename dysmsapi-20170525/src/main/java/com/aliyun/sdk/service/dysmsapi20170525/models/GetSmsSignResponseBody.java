// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsSignResponseBody</p>
 */
public class GetSmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyScene")
    private String applyScene;

    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private AuditInfo auditInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("FileUrlList")
    private java.util.List<String> fileUrlList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.NameInMap("RegisterResult")
    private Integer registerResult;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignCode")
    private String signCode;

    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.NameInMap("SignStatus")
    private Long signStatus;

    @com.aliyun.core.annotation.NameInMap("SignTag")
    private String signTag;

    @com.aliyun.core.annotation.NameInMap("SignUsage")
    private String signUsage;

    @com.aliyun.core.annotation.NameInMap("ThirdParty")
    private Boolean thirdParty;

    private GetSmsSignResponseBody(Builder builder) {
        this.applyScene = builder.applyScene;
        this.auditInfo = builder.auditInfo;
        this.code = builder.code;
        this.createDate = builder.createDate;
        this.fileUrlList = builder.fileUrlList;
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.qualificationId = builder.qualificationId;
        this.registerResult = builder.registerResult;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.signCode = builder.signCode;
        this.signName = builder.signName;
        this.signStatus = builder.signStatus;
        this.signTag = builder.signTag;
        this.signUsage = builder.signUsage;
        this.thirdParty = builder.thirdParty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsSignResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyScene
     */
    public String getApplyScene() {
        return this.applyScene;
    }

    /**
     * @return auditInfo
     */
    public AuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return fileUrlList
     */
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return registerResult
     */
    public Integer getRegisterResult() {
        return this.registerResult;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signCode
     */
    public String getSignCode() {
        return this.signCode;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signStatus
     */
    public Long getSignStatus() {
        return this.signStatus;
    }

    /**
     * @return signTag
     */
    public String getSignTag() {
        return this.signTag;
    }

    /**
     * @return signUsage
     */
    public String getSignUsage() {
        return this.signUsage;
    }

    /**
     * @return thirdParty
     */
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public static final class Builder {
        private String applyScene; 
        private AuditInfo auditInfo; 
        private String code; 
        private String createDate; 
        private java.util.List<String> fileUrlList; 
        private String message; 
        private String orderId; 
        private Long qualificationId; 
        private Integer registerResult; 
        private String remark; 
        private String requestId; 
        private String signCode; 
        private String signName; 
        private Long signStatus; 
        private String signTag; 
        private String signUsage; 
        private Boolean thirdParty; 

        private Builder() {
        } 

        private Builder(GetSmsSignResponseBody model) {
            this.applyScene = model.applyScene;
            this.auditInfo = model.auditInfo;
            this.code = model.code;
            this.createDate = model.createDate;
            this.fileUrlList = model.fileUrlList;
            this.message = model.message;
            this.orderId = model.orderId;
            this.qualificationId = model.qualificationId;
            this.registerResult = model.registerResult;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.signCode = model.signCode;
            this.signName = model.signName;
            this.signStatus = model.signStatus;
            this.signTag = model.signTag;
            this.signUsage = model.signUsage;
            this.thirdParty = model.thirdParty;
        } 

        /**
         * <p>Content of application scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
         */
        public Builder applyScene(String applyScene) {
            this.applyScene = applyScene;
            return this;
        }

        /**
         * <p>Audit information.</p>
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * <p>Request status code.</p>
         * <ul>
         * <li>OK indicates a successful request.</li>
         * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Creation date and time of the SMS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 10:02:34</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>更多资料信息，补充上传业务证明文件或业务截图文件列表。</p>
         */
        public Builder fileUrlList(java.util.List<String> fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Work order number.</p>
         * <p>Used by reviewers when querying the review. You need to provide this work order number if you require expedited review.</p>
         * 
         * <strong>example:</strong>
         * <p>20044156924</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Credential ID, the credential ID associated when applying for the signature.</p>
         * 
         * <strong>example:</strong>
         * <p>2004393****</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * RegisterResult.
         */
        public Builder registerResult(Integer registerResult) {
            this.registerResult = registerResult;
            return this;
        }

        /**
         * <p>Explanation of the SMS signature scenario, with a maximum length of 200 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Send verification code text message during login.</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting and issue localization.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SMS signature code.</p>
         * 
         * <strong>example:</strong>
         * <p>SIGN_100000077042023_17174665*****_ZM2kG</p>
         */
        public Builder signCode(String signCode) {
            this.signCode = signCode;
            return this;
        }

        /**
         * <p>SMS signature name.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * <p>Signature review status. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Under review.</li>
         * <li><strong>1</strong>: Approved.</li>
         * <li><strong>2</strong>: Review failed, please check the Reason parameter for the failure cause.</li>
         * <li><strong>10</strong>: Review canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder signStatus(Long signStatus) {
            this.signStatus = signStatus;
            return this;
        }

        /**
         * <p>Signature tag indicating whether the signature is user-defined, system-provided, test, or trial. Values:</p>
         * <ul>
         * <li>2: User-defined signature</li>
         * <li>3: System-provided signature</li>
         * <li>4: Test signature</li>
         * <li>5: Trial signature</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder signTag(String signTag) {
            this.signTag = signTag;
            return this;
        }

        /**
         * <p>scenarios for using signatures.</p>
         * 
         * <strong>example:</strong>
         * <p>App.</p>
         */
        public Builder signUsage(String signUsage) {
            this.signUsage = signUsage;
            return this;
        }

        /**
         * <p>Signature usage indication—self-use or third-party use.</p>
         * <ul>
         * <li><p>false: Self-use (default)</p>
         * </li>
         * <li><p>true: Third-party use</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder thirdParty(Boolean thirdParty) {
            this.thirdParty = thirdParty;
            return this;
        }

        public GetSmsSignResponseBody build() {
            return new GetSmsSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsSignResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsSignResponseBody</p>
     */
    public static class AuditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDate")
        private String auditDate;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        private AuditInfo(Builder builder) {
            this.auditDate = builder.auditDate;
            this.rejectInfo = builder.rejectInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditInfo create() {
            return builder().build();
        }

        /**
         * @return auditDate
         */
        public String getAuditDate() {
            return this.auditDate;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public static final class Builder {
            private String auditDate; 
            private String rejectInfo; 

            private Builder() {
            } 

            private Builder(AuditInfo model) {
                this.auditDate = model.auditDate;
                this.rejectInfo = model.rejectInfo;
            } 

            /**
             * <p>Audit date and time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-03 12:02:34</p>
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * <p>Reasons for not passing the review.</p>
             * 
             * <strong>example:</strong>
             * <p>reason for rejection.</p>
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            public AuditInfo build() {
                return new AuditInfo(this);
            } 

        } 

    }
}
