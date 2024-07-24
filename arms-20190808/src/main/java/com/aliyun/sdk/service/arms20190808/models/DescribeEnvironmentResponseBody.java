// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvironmentResponseBody</p>
 */
public class DescribeEnvironmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvironmentResponseBody build() {
            return new DescribeEnvironmentResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindResourceId")
        private String bindResourceId;

        @com.aliyun.core.annotation.NameInMap("BindResourceProfile")
        private String bindResourceProfile;

        @com.aliyun.core.annotation.NameInMap("BindResourceStatus")
        private String bindResourceStatus;

        @com.aliyun.core.annotation.NameInMap("BindResourceStoreDuration")
        private String bindResourceStoreDuration;

        @com.aliyun.core.annotation.NameInMap("BindResourceType")
        private String bindResourceType;

        @com.aliyun.core.annotation.NameInMap("BindVpcCidr")
        private String bindVpcCidr;

        @com.aliyun.core.annotation.NameInMap("DbInstanceStatus")
        private String dbInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("EnvironmentName")
        private String environmentName;

        @com.aliyun.core.annotation.NameInMap("EnvironmentSubType")
        private String environmentSubType;

        @com.aliyun.core.annotation.NameInMap("EnvironmentType")
        private String environmentType;

        @com.aliyun.core.annotation.NameInMap("FeePackage")
        private String feePackage;

        @com.aliyun.core.annotation.NameInMap("GrafaDataSourceName")
        private String grafaDataSourceName;

        @com.aliyun.core.annotation.NameInMap("GrafanaDatasourceUid")
        private String grafanaDatasourceUid;

        @com.aliyun.core.annotation.NameInMap("GrafanaFolderTitle")
        private String grafanaFolderTitle;

        @com.aliyun.core.annotation.NameInMap("GrafanaFolderUid")
        private String grafanaFolderUid;

        @com.aliyun.core.annotation.NameInMap("GrafanaFolderUrl")
        private String grafanaFolderUrl;

        @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
        private String grafanaWorkspaceId;

        @com.aliyun.core.annotation.NameInMap("ManagedType")
        private String managedType;

        @com.aliyun.core.annotation.NameInMap("PrometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("PrometheusInstanceName")
        private String prometheusInstanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Data(Builder builder) {
            this.bindResourceId = builder.bindResourceId;
            this.bindResourceProfile = builder.bindResourceProfile;
            this.bindResourceStatus = builder.bindResourceStatus;
            this.bindResourceStoreDuration = builder.bindResourceStoreDuration;
            this.bindResourceType = builder.bindResourceType;
            this.bindVpcCidr = builder.bindVpcCidr;
            this.dbInstanceStatus = builder.dbInstanceStatus;
            this.environmentId = builder.environmentId;
            this.environmentName = builder.environmentName;
            this.environmentSubType = builder.environmentSubType;
            this.environmentType = builder.environmentType;
            this.feePackage = builder.feePackage;
            this.grafaDataSourceName = builder.grafaDataSourceName;
            this.grafanaDatasourceUid = builder.grafanaDatasourceUid;
            this.grafanaFolderTitle = builder.grafanaFolderTitle;
            this.grafanaFolderUid = builder.grafanaFolderUid;
            this.grafanaFolderUrl = builder.grafanaFolderUrl;
            this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
            this.managedType = builder.managedType;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.prometheusInstanceName = builder.prometheusInstanceName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindResourceId
         */
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        /**
         * @return bindResourceProfile
         */
        public String getBindResourceProfile() {
            return this.bindResourceProfile;
        }

        /**
         * @return bindResourceStatus
         */
        public String getBindResourceStatus() {
            return this.bindResourceStatus;
        }

        /**
         * @return bindResourceStoreDuration
         */
        public String getBindResourceStoreDuration() {
            return this.bindResourceStoreDuration;
        }

        /**
         * @return bindResourceType
         */
        public String getBindResourceType() {
            return this.bindResourceType;
        }

        /**
         * @return bindVpcCidr
         */
        public String getBindVpcCidr() {
            return this.bindVpcCidr;
        }

        /**
         * @return dbInstanceStatus
         */
        public String getDbInstanceStatus() {
            return this.dbInstanceStatus;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return environmentName
         */
        public String getEnvironmentName() {
            return this.environmentName;
        }

        /**
         * @return environmentSubType
         */
        public String getEnvironmentSubType() {
            return this.environmentSubType;
        }

        /**
         * @return environmentType
         */
        public String getEnvironmentType() {
            return this.environmentType;
        }

        /**
         * @return feePackage
         */
        public String getFeePackage() {
            return this.feePackage;
        }

        /**
         * @return grafaDataSourceName
         */
        public String getGrafaDataSourceName() {
            return this.grafaDataSourceName;
        }

        /**
         * @return grafanaDatasourceUid
         */
        public String getGrafanaDatasourceUid() {
            return this.grafanaDatasourceUid;
        }

        /**
         * @return grafanaFolderTitle
         */
        public String getGrafanaFolderTitle() {
            return this.grafanaFolderTitle;
        }

        /**
         * @return grafanaFolderUid
         */
        public String getGrafanaFolderUid() {
            return this.grafanaFolderUid;
        }

        /**
         * @return grafanaFolderUrl
         */
        public String getGrafanaFolderUrl() {
            return this.grafanaFolderUrl;
        }

        /**
         * @return grafanaWorkspaceId
         */
        public String getGrafanaWorkspaceId() {
            return this.grafanaWorkspaceId;
        }

        /**
         * @return managedType
         */
        public String getManagedType() {
            return this.managedType;
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return prometheusInstanceName
         */
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String bindResourceId; 
            private String bindResourceProfile; 
            private String bindResourceStatus; 
            private String bindResourceStoreDuration; 
            private String bindResourceType; 
            private String bindVpcCidr; 
            private String dbInstanceStatus; 
            private String environmentId; 
            private String environmentName; 
            private String environmentSubType; 
            private String environmentType; 
            private String feePackage; 
            private String grafaDataSourceName; 
            private String grafanaDatasourceUid; 
            private String grafanaFolderTitle; 
            private String grafanaFolderUid; 
            private String grafanaFolderUrl; 
            private String grafanaWorkspaceId; 
            private String managedType; 
            private String prometheusInstanceId; 
            private String prometheusInstanceName; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private java.util.List < Tags> tags; 
            private String userId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * The ID of the resource associated with the environment, such as the ACK cluster ID or VPC ID.
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * The profile of the resource.
             */
            public Builder bindResourceProfile(String bindResourceProfile) {
                this.bindResourceProfile = bindResourceProfile;
                return this;
            }

            /**
             * The status of the resource.
             */
            public Builder bindResourceStatus(String bindResourceStatus) {
                this.bindResourceStatus = bindResourceStatus;
                return this;
            }

            /**
             * The retention period of the resource. Unit: days.
             */
            public Builder bindResourceStoreDuration(String bindResourceStoreDuration) {
                this.bindResourceStoreDuration = bindResourceStoreDuration;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder bindResourceType(String bindResourceType) {
                this.bindResourceType = bindResourceType;
                return this;
            }

            /**
             * The VPC CIDR block.
             */
            public Builder bindVpcCidr(String bindVpcCidr) {
                this.bindVpcCidr = bindVpcCidr;
                return this;
            }

            /**
             * The status of the database that is bound to the Prometheus instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   UNINSTALLING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   INSTALLING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   UNINSTALLED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RUNNING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   MODIFYING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder dbInstanceStatus(String dbInstanceStatus) {
                this.dbInstanceStatus = dbInstanceStatus;
                return this;
            }

            /**
             * The ID of the environment instance.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The environment name.
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * Environment subtypes:
             * <p>
             * - CS: Currently supports ACK.
             * - ECS: ECS is currently supported.
             * - Cloud: Currently supports Cloud.
             */
            public Builder environmentSubType(String environmentSubType) {
                this.environmentSubType = environmentSubType;
                return this;
            }

            /**
             * The type of the environment. Valid values:
             * <p>
             * 
             * *   CS: Container Service for Kubernetes (ACK)
             * *   ECS: Elastic Compute Service
             * *   Cloud: cloud service
             */
            public Builder environmentType(String environmentType) {
                this.environmentType = environmentType;
                return this;
            }

            /**
             * The payable resource plan. Valid values:
             * <p>
             * 
             * *   If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro.
             * *   Otherwise, leave the parameter empty.
             */
            public Builder feePackage(String feePackage) {
                this.feePackage = feePackage;
                return this;
            }

            /**
             * The name of the Grafana data source.
             */
            public Builder grafaDataSourceName(String grafaDataSourceName) {
                this.grafaDataSourceName = grafaDataSourceName;
                return this;
            }

            /**
             * The unique ID of the Grafana data source.
             */
            public Builder grafanaDatasourceUid(String grafanaDatasourceUid) {
                this.grafanaDatasourceUid = grafanaDatasourceUid;
                return this;
            }

            /**
             * The name of the Grafana directory.
             */
            public Builder grafanaFolderTitle(String grafanaFolderTitle) {
                this.grafanaFolderTitle = grafanaFolderTitle;
                return this;
            }

            /**
             * The unique ID of the Grafana directory.
             */
            public Builder grafanaFolderUid(String grafanaFolderUid) {
                this.grafanaFolderUid = grafanaFolderUid;
                return this;
            }

            /**
             * The URL of the Grafana directory.
             */
            public Builder grafanaFolderUrl(String grafanaFolderUrl) {
                this.grafanaFolderUrl = grafanaFolderUrl;
                return this;
            }

            /**
             * The ID of the Grafana workspace.
             */
            public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
                this.grafanaWorkspaceId = grafanaWorkspaceId;
                return this;
            }

            /**
             * managed type:
             * <p>
             * - none: unmanaged. The default value for ACK clusters.
             * - agent: managed agent (including KSM). The default values for ASK, ACS, and AckOne clusters.
             * - agent-exporter: managed agent and exporters. The default value for the cloud service type.
             */
            public Builder managedType(String managedType) {
                this.managedType = managedType;
                return this;
            }

            /**
             * The ID of the Prometheus instance.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * The name of the Prometheus instance.
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The security group ID bound to the environment.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The switch ID bound to the environment.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
