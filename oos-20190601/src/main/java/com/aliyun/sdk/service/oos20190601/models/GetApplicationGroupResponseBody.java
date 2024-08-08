// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationGroupResponseBody</p>
 */
public class GetApplicationGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationGroup")
    private ApplicationGroup applicationGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationGroupResponseBody(Builder builder) {
        this.applicationGroup = builder.applicationGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationGroup
     */
    public ApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationGroup applicationGroup; 
        private String requestId; 

        /**
         * The details of the application group.
         */
        public Builder applicationGroup(ApplicationGroup applicationGroup) {
            this.applicationGroup = applicationGroup;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationGroupResponseBody build() {
            return new GetApplicationGroupResponseBody(this);
        } 

    } 

    public static class ApplicationGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CmsGroupId")
        private String cmsGroupId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeployOutputs")
        private String deployOutputs;

        @com.aliyun.core.annotation.NameInMap("DeployParameters")
        private String deployParameters;

        @com.aliyun.core.annotation.NameInMap("DeployRegionId")
        private String deployRegionId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImportTagKey")
        private String importTagKey;

        @com.aliyun.core.annotation.NameInMap("ImportTagValue")
        private String importTagValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperationMetadata")
        private String operationMetadata;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ApplicationGroup(Builder builder) {
            this.applicationName = builder.applicationName;
            this.cmsGroupId = builder.cmsGroupId;
            this.createDate = builder.createDate;
            this.deployOutputs = builder.deployOutputs;
            this.deployParameters = builder.deployParameters;
            this.deployRegionId = builder.deployRegionId;
            this.description = builder.description;
            this.importTagKey = builder.importTagKey;
            this.importTagValue = builder.importTagValue;
            this.name = builder.name;
            this.operationMetadata = builder.operationMetadata;
            this.progress = builder.progress;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGroup create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return cmsGroupId
         */
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return deployOutputs
         */
        public String getDeployOutputs() {
            return this.deployOutputs;
        }

        /**
         * @return deployParameters
         */
        public String getDeployParameters() {
            return this.deployParameters;
        }

        /**
         * @return deployRegionId
         */
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return importTagKey
         */
        public String getImportTagKey() {
            return this.importTagKey;
        }

        /**
         * @return importTagValue
         */
        public String getImportTagValue() {
            return this.importTagValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationMetadata
         */
        public String getOperationMetadata() {
            return this.operationMetadata;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String applicationName; 
            private String cmsGroupId; 
            private String createDate; 
            private String deployOutputs; 
            private String deployParameters; 
            private String deployRegionId; 
            private String description; 
            private String importTagKey; 
            private String importTagValue; 
            private String name; 
            private String operationMetadata; 
            private String progress; 
            private String status; 
            private String statusReason; 
            private String updateDate; 

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The ID of the application group in CloudMonitor.
             */
            public Builder cmsGroupId(String cmsGroupId) {
                this.cmsGroupId = cmsGroupId;
                return this;
            }

            /**
             * The time when the application group was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The output of the deployment result.
             */
            public Builder deployOutputs(String deployOutputs) {
                this.deployOutputs = deployOutputs;
                return this;
            }

            /**
             * The configuration information of the application group.
             */
            public Builder deployParameters(String deployParameters) {
                this.deployParameters = deployParameters;
                return this;
            }

            /**
             * The ID of the region in which you deploy the application group.
             */
            public Builder deployRegionId(String deployRegionId) {
                this.deployRegionId = deployRegionId;
                return this;
            }

            /**
             * The description of the application group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder importTagKey(String importTagKey) {
                this.importTagKey = importTagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder importTagValue(String importTagValue) {
                this.importTagValue = importTagValue;
                return this;
            }

            /**
             * The name of the application group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperationMetadata.
             */
            public Builder operationMetadata(String operationMetadata) {
                this.operationMetadata = operationMetadata;
                return this;
            }

            /**
             * The creation progress of the application instance.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the application group.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state information of the application group.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The time when the application group was last modified.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ApplicationGroup build() {
                return new ApplicationGroup(this);
            } 

        } 

    }
}
