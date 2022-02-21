// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateResponseBody</p>
 */
public class QuerySmsTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateDate")
    private String createDate;

    @NameInMap("Message")
    private String message;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateCode")
    private String templateCode;

    @NameInMap("TemplateContent")
    private String templateContent;

    @NameInMap("TemplateName")
    private String templateName;

    @NameInMap("TemplateStatus")
    private Integer templateStatus;

    @NameInMap("TemplateType")
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * TemplateStatus.
         */
        public Builder templateStatus(Integer templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * TemplateType.
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
