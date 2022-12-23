// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAITemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListAITemplateResponseBody</p>
 */
public class ListAITemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateInfoList")
    private java.util.List < TemplateInfoList> templateInfoList;

    private ListAITemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateInfoList = builder.templateInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAITemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateInfoList
     */
    public java.util.List < TemplateInfoList> getTemplateInfoList() {
        return this.templateInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TemplateInfoList> templateInfoList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the AI templates.
         */
        public Builder templateInfoList(java.util.List < TemplateInfoList> templateInfoList) {
            this.templateInfoList = templateInfoList;
            return this;
        }

        public ListAITemplateResponseBody build() {
            return new ListAITemplateResponseBody(this);
        } 

    } 

    public static class TemplateInfoList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Source")
        private String source;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        private TemplateInfoList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.modifyTime = builder.modifyTime;
            this.source = builder.source;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfoList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
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
            private String creationTime; 
            private String isDefault; 
            private String modifyTime; 
            private String source; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private String templateType; 

            /**
             * The time when the AI template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the template is the default AI template. Valid values:
             * <p>
             * 
             * *   **Default**
             * *   **NotDefault**
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The time when the AI template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The source of the AI template. Valid values:
             * <p>
             * 
             * *   **System**
             * *   **Custom**
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The detailed configurations of the AI template. The value is a JSON string.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * The ID of the AI template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the AI template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The type of the AI template. Valid values:
             * <p>
             * 
             * *   **AIMediaAudit**: automated review
             * *   **AIImage**: smart thumbnail
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public TemplateInfoList build() {
                return new TemplateInfoList(this);
            } 

        } 

    }
}
