// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateListResponseBody</p>
 */
public class QuerySmsTemplateListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmsTemplateList")
    private java.util.List < SmsTemplateList> smsTemplateList;

    private QuerySmsTemplateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.smsTemplateList = builder.smsTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsTemplateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return smsTemplateList
     */
    public java.util.List < SmsTemplateList> getSmsTemplateList() {
        return this.smsTemplateList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < SmsTemplateList> smsTemplateList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * SmsTemplateList.
         */
        public Builder smsTemplateList(java.util.List < SmsTemplateList> smsTemplateList) {
            this.smsTemplateList = smsTemplateList;
            return this;
        }

        public QuerySmsTemplateListResponseBody build() {
            return new QuerySmsTemplateListResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @NameInMap("RejectDate")
        private String rejectDate;

        @NameInMap("RejectInfo")
        private String rejectInfo;

        @NameInMap("RejectSubInfo")
        private String rejectSubInfo;

        private Reason(Builder builder) {
            this.rejectDate = builder.rejectDate;
            this.rejectInfo = builder.rejectInfo;
            this.rejectSubInfo = builder.rejectSubInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reason create() {
            return builder().build();
        }

        /**
         * @return rejectDate
         */
        public String getRejectDate() {
            return this.rejectDate;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        /**
         * @return rejectSubInfo
         */
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

        public static final class Builder {
            private String rejectDate; 
            private String rejectInfo; 
            private String rejectSubInfo; 

            /**
             * RejectDate.
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * RejectInfo.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * RejectSubInfo.
             */
            public Builder rejectSubInfo(String rejectSubInfo) {
                this.rejectSubInfo = rejectSubInfo;
                return this;
            }

            public Reason build() {
                return new Reason(this);
            } 

        } 

    }
    public static class SmsTemplateList extends TeaModel {
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("Reason")
        private Reason reason;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateContent")
        private String templateContent;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private Integer templateType;

        private SmsTemplateList(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.createDate = builder.createDate;
            this.orderId = builder.orderId;
            this.reason = builder.reason;
            this.templateCode = builder.templateCode;
            this.templateContent = builder.templateContent;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsTemplateList create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return reason
         */
        public Reason getReason() {
            return this.reason;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String auditStatus; 
            private String createDate; 
            private String orderId; 
            private Reason reason; 
            private String templateCode; 
            private String templateContent; 
            private String templateName; 
            private Integer templateType; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
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
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateContent.
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            public SmsTemplateList build() {
                return new SmsTemplateList(this);
            } 

        } 

    }
}
