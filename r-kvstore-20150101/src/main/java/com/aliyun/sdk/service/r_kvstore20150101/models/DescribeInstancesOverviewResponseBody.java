// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesOverviewResponseBody</p>
 */
public class DescribeInstancesOverviewResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
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

        public DescribeInstancesOverviewResponseBody build() {
            return new DescribeInstancesOverviewResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("ArchitectureType")
        private String architectureType;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ConnectionDomain")
        private String connectionDomain;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
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
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ConnectionDomain.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * GlobalInstanceId.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
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
