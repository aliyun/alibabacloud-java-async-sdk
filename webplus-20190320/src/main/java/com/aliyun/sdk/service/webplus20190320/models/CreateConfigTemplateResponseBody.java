// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigTemplateResponseBody</p>
 */
public class CreateConfigTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConfigTemplate")
    private ConfigTemplate configTemplate;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConfigTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.configTemplate = builder.configTemplate;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configTemplate
     */
    public ConfigTemplate getConfigTemplate() {
        return this.configTemplate;
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
        private ConfigTemplate configTemplate; 
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
         * ConfigTemplate.
         */
        public Builder configTemplate(ConfigTemplate configTemplate) {
            this.configTemplate = configTemplate;
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

        public CreateConfigTemplateResponseBody build() {
            return new CreateConfigTemplateResponseBody(this);
        } 

    } 

    public static class ConfigTemplate extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("PkgVersionId")
        private String pkgVersionId;

        @NameInMap("PkgVersionLabel")
        private String pkgVersionLabel;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("TemplateDescription")
        private String templateDescription;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ConfigTemplate(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.pkgVersionId = builder.pkgVersionId;
            this.pkgVersionLabel = builder.pkgVersionLabel;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.templateDescription = builder.templateDescription;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTemplate create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return pkgVersionId
         */
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        /**
         * @return pkgVersionLabel
         */
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return templateDescription
         */
        public String getTemplateDescription() {
            return this.templateDescription;
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Long createTime; 
            private String pkgVersionId; 
            private String pkgVersionLabel; 
            private String stackId; 
            private String stackName; 
            private String templateDescription; 
            private String templateId; 
            private String templateName; 
            private String templateType; 
            private Long updateTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * PkgVersionId.
             */
            public Builder pkgVersionId(String pkgVersionId) {
                this.pkgVersionId = pkgVersionId;
                return this;
            }

            /**
             * PkgVersionLabel.
             */
            public Builder pkgVersionLabel(String pkgVersionLabel) {
                this.pkgVersionLabel = pkgVersionLabel;
                return this;
            }

            /**
             * StackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * TemplateDescription.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
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
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ConfigTemplate build() {
                return new ConfigTemplate(this);
            } 

        } 

    }
}
