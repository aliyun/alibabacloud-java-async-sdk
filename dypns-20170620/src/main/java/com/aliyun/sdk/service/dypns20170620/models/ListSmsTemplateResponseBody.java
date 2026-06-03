// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link ListSmsTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmsTemplateResponseBody</p>
 */
public class ListSmsTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSmsTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmsTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSmsTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSmsTemplateResponseBody build() {
            return new ListSmsTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmsTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmsTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("BizUrl")
        private String bizUrl;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Integer businessType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private Long createDate;

        @com.aliyun.core.annotation.NameInMap("DefaultFlag")
        private Boolean defaultFlag;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
        private String smsTemplateCode;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateContent")
        private String smsTemplateContent;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateName")
        private String smsTemplateName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.auditResult = builder.auditResult;
            this.bizUrl = builder.bizUrl;
            this.businessType = builder.businessType;
            this.createDate = builder.createDate;
            this.defaultFlag = builder.defaultFlag;
            this.remark = builder.remark;
            this.smsTemplateCode = builder.smsTemplateCode;
            this.smsTemplateContent = builder.smsTemplateContent;
            this.smsTemplateName = builder.smsTemplateName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return bizUrl
         */
        public String getBizUrl() {
            return this.bizUrl;
        }

        /**
         * @return businessType
         */
        public Integer getBusinessType() {
            return this.businessType;
        }

        /**
         * @return createDate
         */
        public Long getCreateDate() {
            return this.createDate;
        }

        /**
         * @return defaultFlag
         */
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return smsTemplateCode
         */
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        /**
         * @return smsTemplateContent
         */
        public String getSmsTemplateContent() {
            return this.smsTemplateContent;
        }

        /**
         * @return smsTemplateName
         */
        public String getSmsTemplateName() {
            return this.smsTemplateName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String auditResult; 
            private String bizUrl; 
            private Integer businessType; 
            private Long createDate; 
            private Boolean defaultFlag; 
            private String remark; 
            private String smsTemplateCode; 
            private String smsTemplateContent; 
            private String smsTemplateName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditResult = model.auditResult;
                this.bizUrl = model.bizUrl;
                this.businessType = model.businessType;
                this.createDate = model.createDate;
                this.defaultFlag = model.defaultFlag;
                this.remark = model.remark;
                this.smsTemplateCode = model.smsTemplateCode;
                this.smsTemplateContent = model.smsTemplateContent;
                this.smsTemplateName = model.smsTemplateName;
                this.status = model.status;
            } 

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * BizUrl.
             */
            public Builder bizUrl(String bizUrl) {
                this.bizUrl = bizUrl;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(Integer businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(Long createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DefaultFlag.
             */
            public Builder defaultFlag(Boolean defaultFlag) {
                this.defaultFlag = defaultFlag;
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
             * SmsTemplateCode.
             */
            public Builder smsTemplateCode(String smsTemplateCode) {
                this.smsTemplateCode = smsTemplateCode;
                return this;
            }

            /**
             * SmsTemplateContent.
             */
            public Builder smsTemplateContent(String smsTemplateContent) {
                this.smsTemplateContent = smsTemplateContent;
                return this;
            }

            /**
             * SmsTemplateName.
             */
            public Builder smsTemplateName(String smsTemplateName) {
                this.smsTemplateName = smsTemplateName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
