// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateListResponseBody</p>
 */
public class QuerySmsTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsTemplateList")
    private java.util.List < SmsTemplateList> smsTemplateList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QuerySmsTemplateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smsTemplateList = builder.smsTemplateList;
        this.totalCount = builder.totalCount;
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SmsTemplateList> smsTemplateList; 
        private Long totalCount; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The number of templates per page. Valid values: **1 to 50**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried message templates.
         */
        public Builder smsTemplateList(java.util.List < SmsTemplateList> smsTemplateList) {
            this.smsTemplateList = smsTemplateList;
            return this;
        }

        /**
         * The total number of templates.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySmsTemplateListResponseBody build() {
            return new QuerySmsTemplateListResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RejectDate")
        private String rejectDate;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        @com.aliyun.core.annotation.NameInMap("RejectSubInfo")
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
             * The time when the message template was rejected. Format: yyyy-MM-dd HH:mm:ss.
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * The reason why the message template was rejected.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * The remarks about the rejection.
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
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OuterTemplateType")
        private Integer outerTemplateType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private Reason reason;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private String templateContent;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        private SmsTemplateList(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.createDate = builder.createDate;
            this.orderId = builder.orderId;
            this.outerTemplateType = builder.outerTemplateType;
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
         * @return outerTemplateType
         */
        public Integer getOuterTemplateType() {
            return this.outerTemplateType;
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
            private Integer outerTemplateType; 
            private Reason reason; 
            private String templateCode; 
            private String templateContent; 
            private String templateName; 
            private Integer templateType; 

            /**
             * The approval status of the message template. Valid values:
             * <p>
             * 
             * *   **AUDIT_STATE_INIT**: The message template is pending approval.
             * *   **AUDIT_STATE_PASS**: The message template is approved.
             * *   **AUDIT_STATE_NOT_PASS**: The message template is rejected. You can view the reason in the Reason response parameter.
             * *   **AUDIT_STATE_CANCEL** or **AUDIT_SATE_CANCEL**: The approval is canceled.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * The time when the message template was created. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The ticket ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The type of the message template. We recommend that you specify this parameter. Valid values:
             * <p>
             * 
             * *   **0**: verification code
             * *   **1**: notification message
             * *   **2**: promotional message
             * *   **3**: message sent to countries or regions outside the Chinese mainland
             * *   **7**: digital message
             * 
             * > The template type is the same as the value of the TemplateType parameter in the AddSmsTemplate and ModifySmsTemplate operations.
             */
            public Builder outerTemplateType(Integer outerTemplateType) {
                this.outerTemplateType = outerTemplateType;
                return this;
            }

            /**
             * The approval remarks.
             * <p>
             * 
             * *   If the value of AuditStatus is **AUDIT_STATE_PASS** or **AUDIT_STATE_INIT**, the value of Reason is No Approval Remarks.
             * *   If the value of AuditStatus is **AUDIT_STATE_NOT_PASS**, the reason why the message template is rejected is returned.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the message template.
             * <p>
             * 
             * You can log on to the [Short Message Service (SMS) console](https://dysms.console.aliyun.com/dysms.htm), click **Go China** or **Go Globe** in the left-side navigation pane, and then view the template code on the **Templates** tab. You can also call the [AddSmsTemplate](~~121208~~) operation to obtain the template code.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * The content of the message template.
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * The name of the message template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The type of the message template. Valid values:
             * <p>
             * 
             * *   **0**: notification message
             * *   **1**: promotional message
             * *   **2**: verification code
             * *   **6**: message sent to countries or regions outside the Chinese mainland
             * *   **7**: digital message
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
