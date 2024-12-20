// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvironmentResponseBody build() {
            return new DescribeEnvironmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnvironmentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentResponseBody</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>p_dev</p>
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
    /**
     * 
     * {@link DescribeEnvironmentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String userId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * <p>The ID of the resource associated with the environment, such as the ACK cluster ID or VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxx</p>
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * <p>The profile of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder bindResourceProfile(String bindResourceProfile) {
                this.bindResourceProfile = bindResourceProfile;
                return this;
            }

            /**
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder bindResourceStatus(String bindResourceStatus) {
                this.bindResourceStatus = bindResourceStatus;
                return this;
            }

            /**
             * <p>The retention period of the resource. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder bindResourceStoreDuration(String bindResourceStoreDuration) {
                this.bindResourceStoreDuration = bindResourceStoreDuration;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder bindResourceType(String bindResourceType) {
                this.bindResourceType = bindResourceType;
                return this;
            }

            /**
             * <p>The VPC CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder bindVpcCidr(String bindVpcCidr) {
                this.bindVpcCidr = bindVpcCidr;
                return this;
            }

            /**
             * <p>The status of the database that is bound to the Prometheus instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>UNINSTALLING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>INSTALLING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>UNINSTALLED</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>RUNNING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>MODIFYING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder dbInstanceStatus(String dbInstanceStatus) {
                this.dbInstanceStatus = dbInstanceStatus;
                return this;
            }

            /**
             * <p>The ID of the environment instance.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>env1</p>
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * <p>Environment subtypes:</p>
             * <ul>
             * <li>CS: Currently supports ACK.</li>
             * <li>ECS: ECS is currently supported.</li>
             * <li>Cloud: Currently supports Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACK</p>
             */
            public Builder environmentSubType(String environmentSubType) {
                this.environmentSubType = environmentSubType;
                return this;
            }

            /**
             * <p>The type of the environment. Valid values:</p>
             * <ul>
             * <li>CS: Container Service for Kubernetes (ACK)</li>
             * <li>ECS: Elastic Compute Service</li>
             * <li>Cloud: cloud service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CS</p>
             */
            public Builder environmentType(String environmentType) {
                this.environmentType = environmentType;
                return this;
            }

            /**
             * <p>The payable resource plan. Valid values:</p>
             * <ul>
             * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro.</li>
             * <li>Otherwise, leave the parameter empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CS_Basic</p>
             */
            public Builder feePackage(String feePackage) {
                this.feePackage = feePackage;
                return this;
            }

            /**
             * <p>The name of the Grafana data source.</p>
             * 
             * <strong>example:</strong>
             * <p>datasource1</p>
             */
            public Builder grafaDataSourceName(String grafaDataSourceName) {
                this.grafaDataSourceName = grafaDataSourceName;
                return this;
            }

            /**
             * <p>The unique ID of the Grafana data source.</p>
             * 
             * <strong>example:</strong>
             * <p>zuvw</p>
             */
            public Builder grafanaDatasourceUid(String grafanaDatasourceUid) {
                this.grafanaDatasourceUid = grafanaDatasourceUid;
                return this;
            }

            /**
             * <p>The name of the Grafana directory.</p>
             * 
             * <strong>example:</strong>
             * <p>folder1</p>
             */
            public Builder grafanaFolderTitle(String grafanaFolderTitle) {
                this.grafanaFolderTitle = grafanaFolderTitle;
                return this;
            }

            /**
             * <p>The unique ID of the Grafana directory.</p>
             * 
             * <strong>example:</strong>
             * <p>xyz</p>
             */
            public Builder grafanaFolderUid(String grafanaFolderUid) {
                this.grafanaFolderUid = grafanaFolderUid;
                return this;
            }

            /**
             * <p>The URL of the Grafana directory.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://g.console.aliyun.com/dashboards/f/xxx/yyyy">https://g.console.aliyun.com/dashboards/f/xxx/yyyy</a></p>
             */
            public Builder grafanaFolderUrl(String grafanaFolderUrl) {
                this.grafanaFolderUrl = grafanaFolderUrl;
                return this;
            }

            /**
             * <p>The ID of the Grafana workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>grafana-cn-27a3m8eem0a</p>
             */
            public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
                this.grafanaWorkspaceId = grafanaWorkspaceId;
                return this;
            }

            /**
             * <p>managed type:</p>
             * <ul>
             * <li>none: unmanaged. The default value for ACK clusters.</li>
             * <li>agent: managed agent (including KSM). The default values for ASK, ACS, and AckOne clusters.</li>
             * <li>agent-exporter: managed agent and exporters. The default value for the cloud service type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder managedType(String managedType) {
                this.managedType = managedType;
                return this;
            }

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxyyyyyzzzzz</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>The name of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2vezare****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the security group associated with the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-8vbdgmf4nraiqa9bx0jo</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>13002222xxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vb02uk57qbcktqcvqqqj</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze7yr3f1x8snryaioo7u</p>
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
