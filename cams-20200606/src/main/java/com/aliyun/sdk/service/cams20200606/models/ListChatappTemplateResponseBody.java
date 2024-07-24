// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatappTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatappTemplateResponseBody</p>
 */
public class ListChatappTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ListTemplate")
    private java.util.List < ListTemplate> listTemplate;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListChatappTemplateResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.listTemplate = builder.listTemplate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatappTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List < ListTemplate> listTemplate; 
        private String message; 
        private String requestId; 
        private Integer total; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
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

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListChatappTemplateResponseBody build() {
            return new ListChatappTemplateResponseBody(this);
        } 

    } 

    public static class ListTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private ListTemplate(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.category = builder.category;
            this.language = builder.language;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.reason = builder.reason;
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
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private Long lastUpdateTime; 
            private String reason; 
            private String templateCode; 
            private String templateName; 
            private String templateType; 

            /**
             * The review state of the message template. Valid values:
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
             * The category of the WhatsApp template. Valid values:
             * <p>
             * 
             * *   **UTILITY**: utility template
             * *   **MARKETING**: marketing template
             * *   **AUTHENTICATION**: authentication template
             * 
             * The category of the Viber template. Valid values:
             * 
             * *   **text**: template that contains only text
             * *   **image**: template that contains only an image
             * *   **text_image_button**: template that contains text, an image, and a button
             * *   **text_button**: template that contains text and a button
             * *   **document**: template that contains only a document
             * *   **video**: template that contains only a video
             * *   **text_video**: template that contains text and a video
             * *   **text_video_button**: template that contains text, a video, and a button
             * *   **text_image**: template that contains text and an image
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The language that is used in the message template. For more information, see [Language codes](~~463420~~).
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * The reason for the review failure.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * The type of the template. Valid values: WHATSAPP and VIBER.
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
