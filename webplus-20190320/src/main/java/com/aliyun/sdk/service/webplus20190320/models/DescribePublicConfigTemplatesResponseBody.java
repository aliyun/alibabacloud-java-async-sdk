// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublicConfigTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePublicConfigTemplatesResponseBody</p>
 */
public class DescribePublicConfigTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PublicConfigTemplates")
    private PublicConfigTemplates publicConfigTemplates;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePublicConfigTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicConfigTemplates = builder.publicConfigTemplates;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePublicConfigTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return publicConfigTemplates
     */
    public PublicConfigTemplates getPublicConfigTemplates() {
        return this.publicConfigTemplates;
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
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private PublicConfigTemplates publicConfigTemplates; 
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
         * PublicConfigTemplates.
         */
        public Builder publicConfigTemplates(PublicConfigTemplates publicConfigTemplates) {
            this.publicConfigTemplates = publicConfigTemplates;
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

        public DescribePublicConfigTemplatesResponseBody build() {
            return new DescribePublicConfigTemplatesResponseBody(this);
        } 

    } 

    public static class PublicConfigTemplate extends TeaModel {
        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("PackageSource")
        private String packageSource;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("TemplateDescription")
        private String templateDescription;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateLogo")
        private String templateLogo;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private PublicConfigTemplate(Builder builder) {
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.packageSource = builder.packageSource;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.templateDescription = builder.templateDescription;
            this.templateId = builder.templateId;
            this.templateLogo = builder.templateLogo;
            this.templateName = builder.templateName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicConfigTemplate create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return packageSource
         */
        public String getPackageSource() {
            return this.packageSource;
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
         * @return templateLogo
         */
        public String getTemplateLogo() {
            return this.templateLogo;
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
            private String categoryName; 
            private Long createTime; 
            private String packageSource; 
            private String stackId; 
            private String stackName; 
            private String templateDescription; 
            private String templateId; 
            private String templateLogo; 
            private String templateName; 
            private Long updateTime; 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
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
             * PackageSource.
             */
            public Builder packageSource(String packageSource) {
                this.packageSource = packageSource;
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
             * TemplateLogo.
             */
            public Builder templateLogo(String templateLogo) {
                this.templateLogo = templateLogo;
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

            public PublicConfigTemplate build() {
                return new PublicConfigTemplate(this);
            } 

        } 

    }
    public static class PublicConfigTemplates extends TeaModel {
        @NameInMap("PublicConfigTemplate")
        private java.util.List < PublicConfigTemplate> publicConfigTemplate;

        private PublicConfigTemplates(Builder builder) {
            this.publicConfigTemplate = builder.publicConfigTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicConfigTemplates create() {
            return builder().build();
        }

        /**
         * @return publicConfigTemplate
         */
        public java.util.List < PublicConfigTemplate> getPublicConfigTemplate() {
            return this.publicConfigTemplate;
        }

        public static final class Builder {
            private java.util.List < PublicConfigTemplate> publicConfigTemplate; 

            /**
             * PublicConfigTemplate.
             */
            public Builder publicConfigTemplate(java.util.List < PublicConfigTemplate> publicConfigTemplate) {
                this.publicConfigTemplate = publicConfigTemplate;
                return this;
            }

            public PublicConfigTemplates build() {
                return new PublicConfigTemplates(this);
            } 

        } 

    }
}
