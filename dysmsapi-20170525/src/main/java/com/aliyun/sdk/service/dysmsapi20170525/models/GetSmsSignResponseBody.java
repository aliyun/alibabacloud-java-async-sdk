// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > fileUrlList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

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
    public java.util.List < String > getFileUrlList() {
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
        private java.util.List < String > fileUrlList; 
        private String message; 
        private String orderId; 
        private Long qualificationId; 
        private String remark; 
        private String requestId; 
        private String signCode; 
        private String signName; 
        private Long signStatus; 
        private String signTag; 
        private String signUsage; 
        private Boolean thirdParty; 

        /**
         * ApplyScene.
         */
        public Builder applyScene(String applyScene) {
            this.applyScene = applyScene;
            return this;
        }

        /**
         * AuditInfo.
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * FileUrlList.
         */
        public Builder fileUrlList(java.util.List < String > fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * QualificationId.
         */
        public Builder qualificationId(Long qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SignCode.
         */
        public Builder signCode(String signCode) {
            this.signCode = signCode;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * SignStatus.
         */
        public Builder signStatus(Long signStatus) {
            this.signStatus = signStatus;
            return this;
        }

        /**
         * SignTag.
         */
        public Builder signTag(String signTag) {
            this.signTag = signTag;
            return this;
        }

        /**
         * SignUsage.
         */
        public Builder signUsage(String signUsage) {
            this.signUsage = signUsage;
            return this;
        }

        /**
         * ThirdParty.
         */
        public Builder thirdParty(Boolean thirdParty) {
            this.thirdParty = thirdParty;
            return this;
        }

        public GetSmsSignResponseBody build() {
            return new GetSmsSignResponseBody(this);
        } 

    } 

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

            /**
             * AuditDate.
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * RejectInfo.
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
