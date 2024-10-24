// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
         * <p>The time when the message template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04 11:42:17</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The approval remarks.</p>
         * <ul>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the message template is rejected is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A974B78-02BF-4C79-ADF3-90CFBA1B55B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_16703****</p>
         */
        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The content of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>You are applying for mobile registration. The verification code is: ${code}, valid for 5 minutes!</p>
         */
        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun verification code</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The approval status of the message template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The message template is pending approval.</li>
         * <li><strong>1</strong>: The message template is approved.</li>
         * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The message template is rejected. You can view the reason in the Reason response parameter.</li>
         * <li><strong>10</strong>: The approval is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>The type of the message. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: verification code</li>
         * <li><strong>1</strong>: notification message</li>
         * <li><strong>2</strong>: promotional message</li>
         * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
