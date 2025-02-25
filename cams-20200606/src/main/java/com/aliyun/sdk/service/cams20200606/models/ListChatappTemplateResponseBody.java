// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * <ul>
         * <li>A value of OK indicates that the call is successful.</li>
         * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
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
         * <p>The list of the templates.</p>
         */
        public Builder listTemplate(java.util.List < ListTemplate> listTemplate) {
            this.listTemplate = listTemplate;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListChatappTemplateResponseBody build() {
            return new ListChatappTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatappTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatappTemplateResponseBody</p>
     */
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
             * <p>The review state of the message template. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The message template is approved.</li>
             * <li><strong>fail</strong>: The message template is rejected.</li>
             * <li><strong>auditing</strong>: The message template is being reviewed.</li>
             * <li><strong>unaudit</strong>: The review is suspended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>The category of the WhatsApp template. Valid values:</p>
             * <ul>
             * <li><strong>UTILITY</strong>: utility template</li>
             * <li><strong>MARKETING</strong>: marketing template</li>
             * <li><strong>AUTHENTICATION</strong>: authentication template</li>
             * </ul>
             * <p>The category of the Viber template. Valid values:</p>
             * <ul>
             * <li><strong>text</strong>: template that contains only text</li>
             * <li><strong>image</strong>: template that contains only an image</li>
             * <li><strong>text_image_button</strong>: template that contains text, an image, and a button</li>
             * <li><strong>text_button</strong>: template that contains text and a button</li>
             * <li><strong>document</strong>: template that contains only a document</li>
             * <li><strong>video</strong>: template that contains only a video</li>
             * <li><strong>text_video</strong>: template that contains text and a video</li>
             * <li><strong>text_video_button</strong>: template that contains text, a video, and a button</li>
             * <li><strong>text_image</strong>: template that contains text and an image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TRANSACTIONAL</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The time when the template was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1711006633000</p>
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>The reason for the review failure.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>744c4b5c79c9432497a075bdfca3****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The name of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>hello_whatsapp</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of the template. Valid values: WHATSAPP and VIBER.</p>
             * 
             * <strong>example:</strong>
             * <p>WHATSAPP</p>
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
