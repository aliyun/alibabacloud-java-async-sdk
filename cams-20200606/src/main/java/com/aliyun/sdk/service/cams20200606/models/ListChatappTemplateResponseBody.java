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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 模板列表
         */
        public Builder listTemplate(java.util.List < ListTemplate> listTemplate) {
            this.listTemplate = listTemplate;
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

        private ListTemplate(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.category = builder.category;
            this.language = builder.language;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
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

        public static final class Builder {
            private String auditStatus; 
            private String category; 
            private String language; 
            private String templateCode; 
            private String templateName; 

            /**
             * 审核状态
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * 模板分类
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 语言
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * 模板编码
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * 模板名称
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ListTemplate build() {
                return new ListTemplate(this);
            } 

        } 

    }
}
