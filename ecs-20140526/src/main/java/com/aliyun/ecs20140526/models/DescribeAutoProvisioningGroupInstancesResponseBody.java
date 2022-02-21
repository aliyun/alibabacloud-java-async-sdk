// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupInstancesResponseBody</p>
 */
public class DescribeAutoProvisioningGroupInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Instances")
    private Instances instances;

    private DescribeAutoProvisioningGroupInstancesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupInstancesResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private Instances instances; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of instances in the auto provisioning group.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information of all instances in the auto provisioning group.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBody build() {
            return new DescribeAutoProvisioningGroupInstancesResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsSpot")
        private Boolean isSpot;

        @NameInMap("CPU")
        private Integer CPU;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Memory")
        private Integer memory;

        private Instance(Builder builder) {
            this.status = builder.status;
            this.creationTime = builder.creationTime;
            this.isSpot = builder.isSpot;
            this.CPU = builder.CPU;
            this.instanceId = builder.instanceId;
            this.networkType = builder.networkType;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.ioOptimized = builder.ioOptimized;
            this.osType = builder.osType;
            this.zoneId = builder.zoneId;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isSpot
         */
        public Boolean getIsSpot() {
            return this.isSpot;
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String status; 
            private String creationTime; 
            private Boolean isSpot; 
            private Integer CPU; 
            private String instanceId; 
            private String networkType; 
            private String instanceType; 
            private String regionId; 
            private Boolean ioOptimized; 
            private String osType; 
            private String zoneId; 
            private Integer memory; 

            /**
             * The status of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the instance is a preemptible instance.
             */
            public Builder isSpot(Boolean isSpot) {
                this.isSpot = isSpot;
                return this;
            }

            /**
             * The number of vCPU cores of the instance.
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * The ID of the instance.
             * <p>
             * 
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * -vpc: vpc
             * -classic: classic Network
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the region to which the instance belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the instance is I/O optimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * The operating system type of the instance. Valid values:
             * <p>
             * 
             * -windows: The operating system type is Windows.
             * -linux: the operating system is Linux.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The zone to which the instance belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The memory size. Unit: MiB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
