// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstancesOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesOverviewResponseBody</p>
 */
public class DescribeInstancesOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesOverviewResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array of instances.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E83311F-0EE4-4922-A3BF-730B312B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesOverviewResponseBody build() {
            return new DescribeInstancesOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesOverviewResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instances(Builder builder) {
            this.architectureType = builder.architectureType;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.connectionDomain = builder.connectionDomain;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.engineVersion = builder.engineVersion;
            this.globalInstanceId = builder.globalInstanceId;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.networkType = builder.networkType;
            this.privateIp = builder.privateIp;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return connectionDomain
         */
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
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
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
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
         * @return secondaryZoneId
         */
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String architectureType; 
            private Long capacity; 
            private String chargeType; 
            private String connectionDomain; 
            private String createTime; 
            private String endTime; 
            private String engineVersion; 
            private String globalInstanceId; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private String networkType; 
            private String privateIp; 
            private String regionId; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * <p>The architecture of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cluster</strong>: cluster architecture</li>
             * <li><strong>standard</strong>: standard architecture</li>
             * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The internal endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-07T08:49:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-13T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The database engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the distributed instance.</p>
             * <blockquote>
             * <p>This parameter is returned only when the instance is a child instance of a distributed instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>redis.logic.sharding.2g.2db.0rodb.4proxy.default</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>apitest</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is normal.</li>
             * <li><strong>Creating</strong>: The instance is being created.</li>
             * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
             * <li><strong>Inactive</strong>: The instance is disabled.</li>
             * <li><strong>Flushing</strong>: The instance is being released.</li>
             * <li><strong>Released</strong>: The instance is released.</li>
             * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
             * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
             * <li><strong>Error</strong>: The instance failed to be created.</li>
             * <li><strong>Migrating</strong>: The instance is being migrated.</li>
             * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
             * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
             * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
             * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being changed.</li>
             * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The category of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Tair</strong></li>
             * <li><strong>Redis</strong></li>
             * <li><strong>Memcache</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Redis</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: classic network</li>
             * <li><strong>VPC</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLASSIC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             * <blockquote>
             * <p>This parameter is not returned when the instance is deployed in the classic network.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.49.***</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyiu4ekp****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Instance&quot;s secondary zone id.</p>
             * <blockquote>
             * <p>This parameter is only returned when the instance has a secondary zone ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the instance is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e7clcw529l773d****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1nme44gek34slfc****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
