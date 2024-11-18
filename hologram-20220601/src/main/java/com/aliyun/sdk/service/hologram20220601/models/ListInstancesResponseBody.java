// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListInstancesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private java.util.List < InstanceList> instanceList; 
        private String requestId; 
        private String success; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal server error.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of queried instances.</p>
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D1303CD4-AA70-5998-8025-F55B22C50840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private Endpoints(Builder builder) {
            this.enabled = builder.enabled;
            this.endpoint = builder.endpoint;
            this.type = builder.type;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String endpoint; 
            private String type; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcInstanceId; 

            /**
             * <p>Indicates whether the endpoint is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-aaab9ad2d8fb-cn-hangzhou-internal.hologres.aliyuncs.com:80</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The network type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>VPCSingleTunnel</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>virtual private cloud (VPC)</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Intranet</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>internal network</p>
             * <!-- -->
             * </li>
             * <li><p>VPCAnyTunnel</p>
             * <!-- -->
             * 
             * <p>: This value is not supported by new instances</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Internet</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Internet</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9oap28raidjevhuszg4</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6mrahzyu7uorlqqpz5f</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-wwo3665tx004-frontend-st</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>tag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnableHiveAccess")
        private String enableHiveAccess;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LeaderInstanceId")
        private String leaderInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SuspendReason")
        private String suspendReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceList(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.creationTime = builder.creationTime;
            this.enableHiveAccess = builder.enableHiveAccess;
            this.endpoints = builder.endpoints;
            this.expirationTime = builder.expirationTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.leaderInstanceId = builder.leaderInstanceId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.suspendReason = builder.suspendReason;
            this.tags = builder.tags;
            this.version = builder.version;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return enableHiveAccess
         */
        public String getEnableHiveAccess() {
            return this.enableHiveAccess;
        }

        /**
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return leaderInstanceId
         */
        public String getLeaderInstanceId() {
            return this.leaderInstanceId;
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
         * @return suspendReason
         */
        public String getSuspendReason() {
            return this.suspendReason;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String commodityCode; 
            private String creationTime; 
            private String enableHiveAccess; 
            private java.util.List < Endpoints> endpoints; 
            private String expirationTime; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private String leaderInstanceId; 
            private String regionId; 
            private String resourceGroupId; 
            private String suspendReason; 
            private java.util.List < Tags> tags; 
            private String version; 
            private String zoneId; 

            /**
             * <p>The commodity code, which is the same as that on the Billing Management page.</p>
             * 
             * <strong>example:</strong>
             * <p>hologram_postpay_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-16T02:24:05Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether lakehouse acceleration is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableHiveAccess(String enableHiveAccess) {
                this.enableHiveAccess = enableHiveAccess;
                return this;
            }

            /**
             * <p>The list of endpoints.</p>
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The time when the cluster expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-04T16:00:00.000Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PostPaid</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>pay-as-you-go</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>PrePaid</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>subscription</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-aaab9ad2d8fb</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test_instance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Creating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Running</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Suspended</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Allocating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Follower</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>read-only secondary instance</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Standard</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>normal instance</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-2r42sqvxm006</p>
             */
            public Builder leaderInstanceId(String leaderInstanceId) {
                this.leaderInstanceId = leaderInstanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmvscak73zmby</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The reason for the suspension.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder suspendReason(String suspendReason) {
                this.suspendReason = suspendReason;
                return this;
            }

            /**
             * <p>The tags that are added to the resource.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.37</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
