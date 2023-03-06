// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatappTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatappTemplateResponseBody</p>
 */
public class ListChatappTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ListTemplate")
    private java.util.List < ListTemplate> listTemplate;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListChatappTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.listTemplate = builder.listTemplate;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatappTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return listTemplate
     */
    public java.util.List < ListTemplate> getListTemplate() {
        return this.listTemplate;
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
        private java.util.List < ListTemplate> listTemplate; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A code of OK indicates that the call is successful.
         * *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message templates.
         */
        public Builder listTemplate(java.util.List < ListTemplate> listTemplate) {
            this.listTemplate = listTemplate;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListChatappTemplateResponseBody build() {
            return new ListChatappTemplateResponseBody(this);
        } 

    } 

    public static class ListTemplate extends TeaModel {
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("Category")
        private String category;

        @NameInMap("Language")
        private String language;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        private ListTemplate(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.category = builder.category;
            this.language = builder.language;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListTemplate create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
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
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String auditStatus; 
            private String category; 
            private String language; 
            private String templateCode; 
            private String templateName; 
            private String templateType; 

            /**
             * The review status of the message template. Valid values:
             * <p>
             * 
             * *   **pass**: The message template is approved.
             * *   **fail**: The message template is rejected.
             * *   **auditing**: The message template is being reviewed.
             * *   **unaudit**: The review is suspended.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * The category of the message template. Valid values:
             * <p>
             * 
             * *   **ACCOUNT_UPDATE**: account update
             * *   **PAYMENT_UPDATE**: payment update
             * *   **PERSONAL_FINANCE\_UPDATE**: personal finance update
             * *   **SHIPPING_UPDATE**: traffic update
             * *   **RESERVATION_UPDATE**: reservation update
             * *   **ISSUE_RESOLUTION**: issue resolution
             * *   **APPOINTMENT_UPDATE**: appointment update
             * *   **TRANSPORTATION_UPDATE**: logistics information update
             * *   **TICKET_UPDATE**: ticket update
             * *   **ALERT_UPDATE**: alert update
             * *   **AUTO_REPLY**: auto reply
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The language that is used in the message template.
             */
            public Builder language(String language) {
                this.language = language;
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
             * The name of the message template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * 模板类型，取值为WHATSAPP/VIBER
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public ListTemplate build() {
                return new ListTemplate(this);
            } 

        } 

    }
}
