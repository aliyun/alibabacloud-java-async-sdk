// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the application group.</p>
         */
        public Builder applicationGroup(ApplicationGroup applicationGroup) {
            this.applicationGroup = applicationGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>92EA60ED-544D-55E9-93D9-237BE9976C0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationGroupResponseBody build() {
            return new GetApplicationGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationGroupResponseBody</p>
     */
    public static class ApplicationGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationSource")
        private String applicationSource;

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
            this.applicationSource = builder.applicationSource;
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
         * @return applicationSource
         */
        public String getApplicationSource() {
            return this.applicationSource;
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
            private String applicationSource; 
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>MyApplication</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * ApplicationSource.
             */
            public Builder applicationSource(String applicationSource) {
                this.applicationSource = applicationSource;
                return this;
            }

            /**
             * <p>The ID of the application group in CloudMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder cmsGroupId(String cmsGroupId) {
                this.cmsGroupId = cmsGroupId;
                return this;
            }

            /**
             * <p>The time when the application group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T10:28:25Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The output of the deployment result.</p>
             * 
             * <strong>example:</strong>
             * <p>{       &quot;Outputs&quot;: [         {           &quot;Description&quot;: &quot;No description given&quot;,           &quot;OutputKey&quot;: &quot;InstanceIds&quot;         }       ],       &quot;StackId&quot;: &quot;6ef4b860-f6e7-4145-8d22-f4a2a32363e1&quot;     }   }</p>
             */
            public Builder deployOutputs(String deployOutputs) {
                this.deployOutputs = deployOutputs;
                return this;
            }

            /**
             * <p>The configuration information of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>{       &quot;TemplateURL&quot;: &quot;<a href="https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json">https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json</a>&quot;,       &quot;Parameters&quot;: {         &quot;ZoneId&quot;: &quot;cn-hangzhou-k&quot;,         &quot;ProjectName&quot;: &quot;test&quot;,         &quot;SystemDiskSize&quot;: 40,         &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,         &quot;SecurityGroupId&quot;: &quot;sg-bp1a4374akk63jl8tddy&quot;,         &quot;VSwitchId&quot;: &quot;vsw-bp1fcvc3zn0jrag86rrlm&quot;,         &quot;SystemDiskCategory&quot;: &quot;cloud_essd&quot;,         &quot;InstancePassword&quot;: &quot;******&quot;,         &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,         &quot;InstanceCount&quot;: 1,         &quot;InternetMaxBandwidthOut&quot;: 0,         &quot;VpcId&quot;: &quot;vpc-bp1i99boyas8i8m9t3skp&quot;,         &quot;EcsImageId&quot;: &quot;centos_8_5_x64_20G_alibase_20211228.vhd&quot;,         &quot;DataDiskSize&quot;: 100,         &quot;EcsInstanceType&quot;: &quot;ecs.s6-c1m4.small&quot;,         &quot;DataDiskCategory&quot;: &quot;cloud_efficiency&quot;,         &quot;EnvironmentCommandId&quot;: &quot;c-hz028fc3g031gcg&quot;       }</p>
             */
            public Builder deployParameters(String deployParameters) {
                this.deployParameters = deployParameters;
                return this;
            }

            /**
             * <p>The ID of the region in which you deploy the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder deployRegionId(String deployRegionId) {
                this.deployRegionId = deployRegionId;
                return this;
            }

            /**
             * <p>The description of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>ApplicationGroup</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder importTagKey(String importTagKey) {
                this.importTagKey = importTagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder importTagValue(String importTagValue) {
                this.importTagValue = importTagValue;
                return this;
            }

            /**
             * <p>The name of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyApplicationGroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operation metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PrometheusConfigMap&quot;:{&quot;模板1&quot;:{&quot;EnablePrometheus&quot;:false}}}</p>
             */
            public Builder operationMetadata(String operationMetadata) {
                this.operationMetadata = operationMetadata;
                return this;
            }

            /**
             * <p>The creation progress of the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The state information of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>Stack CREATE completed successfully</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The time when the application group was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T10:28:25Z</p>
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
