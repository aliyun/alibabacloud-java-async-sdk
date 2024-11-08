// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancePackageStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePackageStatesResponseBody</p>
 */
public class ListInstancePackageStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PackageStates")
    private java.util.List < PackageStates> packageStates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstancePackageStatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.packageStates = builder.packageStates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePackageStatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return packageStates
     */
    public java.util.List < PackageStates> getPackageStates() {
        return this.packageStates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private java.util.List < PackageStates> packageStates; 
        private String requestId; 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PackageStates.
         */
        public Builder packageStates(java.util.List < PackageStates> packageStates) {
            this.packageStates = packageStates;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1306108F-610C-40FD-AAD5-XXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePackageStatesResponseBody build() {
            return new ListInstancePackageStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancePackageStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancePackageStatesResponseBody</p>
     */
    public static class PackageStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Publisher")
        private String publisher;

        @com.aliyun.core.annotation.NameInMap("TemplateCategory")
        private String templateCategory;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("TemplateVersionName")
        private String templateVersionName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PackageStates(Builder builder) {
            this.description = builder.description;
            this.parameters = builder.parameters;
            this.publisher = builder.publisher;
            this.templateCategory = builder.templateCategory;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.templateVersionName = builder.templateVersionName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageStates create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        /**
         * @return templateCategory
         */
        public String getTemplateCategory() {
            return this.templateCategory;
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
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return templateVersionName
         */
        public String getTemplateVersionName() {
            return this.templateVersionName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String description; 
            private String parameters; 
            private String publisher; 
            private String templateCategory; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String templateVersionName; 
            private String updateTime; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Publisher.
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * TemplateCategory.
             */
            public Builder templateCategory(String templateCategory) {
                this.templateCategory = templateCategory;
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
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * TemplateVersionName.
             */
            public Builder templateVersionName(String templateVersionName) {
                this.templateVersionName = templateVersionName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PackageStates build() {
                return new PackageStates(this);
            } 

        } 

    }
}
