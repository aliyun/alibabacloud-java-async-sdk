// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateResponseBody</p>
 */
public class QuerySmsTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private Integer templateStatus;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Integer templateType;

    private QuerySmsTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.createDate = builder.createDate;
        this.message = builder.message;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.templateCode = builder.templateCode;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateStatus = builder.templateStatus;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsTemplateResponseBody create() {
        return builder().build();
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return templateStatus
     */
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return templateType
     */
    public Integer getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String code; 
        private String createDate; 
        private String message; 
        private String reason; 
        private String requestId; 
        private String templateCode; 
        private String templateContent; 
        private String templateName; 
        private Integer templateStatus; 
        private Integer templateType; 

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
         * The time when the message template was created.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
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
         * The approval remarks.
         * <p>
         * 
         * *   If the value of AuditStatus is **AUDIT_STATE_PASS** or **AUDIT_STATE_INIT**, the value of Reason is No Approval Remarks.
         * *   If the value of AuditStatus is **AUDIT_STATE_NOT_PASS**, the reason why the message template is rejected is returned.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * The code of the message template.
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
         * The approval status of the message template. Valid values:
         * <p>
         * 
         * *   **0**: The message template is pending approval.
         * *   **1**: The message template is approved.
         * *   **AUDIT_STATE_NOT_PASS**: The message template is rejected. You can view the reason in the Reason response parameter.
         * *   **10**: The approval is canceled.
         */
        public Builder templateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * The type of the message. Valid values:
         * <p>
         * 
         * *   **0**: verification code
         * *   **1**: notification message
         * *   **2**: promotional message
         * *   **3**: message sent to countries or regions outside the Chinese mainland
         */
        public Builder templateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }

        public QuerySmsTemplateResponseBody build() {
            return new QuerySmsTemplateResponseBody(this);
        } 

    } 

}
