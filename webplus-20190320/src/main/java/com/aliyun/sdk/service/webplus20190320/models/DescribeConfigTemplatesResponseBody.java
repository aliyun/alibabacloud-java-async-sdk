// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigTemplatesResponseBody</p>
 */
public class DescribeConfigTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConfigTemplates")
    private ConfigTemplates configTemplates;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeConfigTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.configTemplates = builder.configTemplates;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configTemplates
     */
    public ConfigTemplates getConfigTemplates() {
        return this.configTemplates;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private ConfigTemplates configTemplates; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConfigTemplates.
         */
        public Builder configTemplates(ConfigTemplates configTemplates) {
            this.configTemplates = configTemplates;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeConfigTemplatesResponseBody build() {
            return new DescribeConfigTemplatesResponseBody(this);
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
    public static class ConfigTemplates extends TeaModel {
        @NameInMap("ConfigTemplate")
        private java.util.List < ConfigTemplate> configTemplate;

        private ConfigTemplates(Builder builder) {
            this.configTemplate = builder.configTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTemplates create() {
            return builder().build();
        }

        /**
         * @return configTemplate
         */
        public java.util.List < ConfigTemplate> getConfigTemplate() {
            return this.configTemplate;
        }

        public static final class Builder {
            private java.util.List < ConfigTemplate> configTemplate; 

            /**
             * ConfigTemplate.
             */
            public Builder configTemplate(java.util.List < ConfigTemplate> configTemplate) {
                this.configTemplate = configTemplate;
                return this;
            }

            public ConfigTemplates build() {
                return new ConfigTemplates(this);
            } 

        } 

    }
}
