// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleOrderResponseBody} extends {@link TeaModel}
 *
 * <p>SingleOrderResponseBody</p>
 */
public class SingleOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SingleOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SingleOrderResponseBody build() {
            return new SingleOrderResponseBody(this);
        } 

    } 

    public static class EcsGroupList extends TeaModel {
        @NameInMap("CpuCount")
        private Integer cpuCount;

        @NameInMap("DiskCapacity")
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostGroupType")
        private String hostGroupType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MemorySize")
        private Integer memorySize;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("SystemDiskCapacity")
        private Integer systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        private Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        private String systemDiskType;

        private EcsGroupList(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupType = builder.hostGroupType;
            this.instanceType = builder.instanceType;
            this.memorySize = builder.memorySize;
            this.nodeCount = builder.nodeCount;
            this.systemDiskCapacity = builder.systemDiskCapacity;
            this.systemDiskCount = builder.systemDiskCount;
            this.systemDiskType = builder.systemDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsGroupList create() {
            return builder().build();
        }

        /**
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return diskCapacity
         */
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return systemDiskCapacity
         */
        public Integer getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        /**
         * @return systemDiskCount
         */
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        /**
         * @return systemDiskType
         */
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

        public static final class Builder {
            private Integer cpuCount; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String instanceType; 
            private Integer memorySize; 
            private Integer nodeCount; 
            private Integer systemDiskCapacity; 
            private Integer systemDiskCount; 
            private String systemDiskType; 

            /**
             * CpuCount.
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * DiskCapacity.
             */
            public Builder diskCapacity(Integer diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * DiskCount.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
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
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * SystemDiskCapacity.
             */
            public Builder systemDiskCapacity(Integer systemDiskCapacity) {
                this.systemDiskCapacity = systemDiskCapacity;
                return this;
            }

            /**
             * SystemDiskCount.
             */
            public Builder systemDiskCount(Integer systemDiskCount) {
                this.systemDiskCount = systemDiskCount;
                return this;
            }

            /**
             * SystemDiskType.
             */
            public Builder systemDiskType(String systemDiskType) {
                this.systemDiskType = systemDiskType;
                return this;
            }

            public EcsGroupList build() {
                return new EcsGroupList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterSize")
        private Integer clusterSize;

        @NameInMap("ClusterStatus")
        private Integer clusterStatus;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EcsGroupList")
        private java.util.List < EcsGroupList> ecsGroupList;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("StorageSize")
        private Integer storageSize;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterSize = builder.clusterSize;
            this.clusterStatus = builder.clusterStatus;
            this.deployMode = builder.deployMode;
            this.duration = builder.duration;
            this.ecsGroupList = builder.ecsGroupList;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.packageType = builder.packageType;
            this.pricingCycle = builder.pricingCycle;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterSize
         */
        public Integer getClusterSize() {
            return this.clusterSize;
        }

        /**
         * @return clusterStatus
         */
        public Integer getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return ecsGroupList
         */
        public java.util.List < EcsGroupList> getEcsGroupList() {
            return this.ecsGroupList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String clusterId; 
            private Integer clusterSize; 
            private Integer clusterStatus; 
            private String deployMode; 
            private Integer duration; 
            private java.util.List < EcsGroupList> ecsGroupList; 
            private String instanceId; 
            private String orderId; 
            private String packageType; 
            private String pricingCycle; 
            private Integer storageSize; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterSize.
             */
            public Builder clusterSize(Integer clusterSize) {
                this.clusterSize = clusterSize;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(Integer clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EcsGroupList.
             */
            public Builder ecsGroupList(java.util.List < EcsGroupList> ecsGroupList) {
                this.ecsGroupList = ecsGroupList;
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
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
