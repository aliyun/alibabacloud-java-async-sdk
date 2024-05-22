// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsResourceUsageResponseBody</p>
 */
public class DescribeEnsResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnsResourceUsage")
    private java.util.List < EnsResourceUsage> ensResourceUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsResourceUsageResponseBody(Builder builder) {
        this.ensResourceUsage = builder.ensResourceUsage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return ensResourceUsage
     */
    public java.util.List < EnsResourceUsage> getEnsResourceUsage() {
        return this.ensResourceUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EnsResourceUsage> ensResourceUsage; 
        private String requestId; 

        /**
         * The resource usage data.
         */
        public Builder ensResourceUsage(java.util.List < EnsResourceUsage> ensResourceUsage) {
            this.ensResourceUsage = ensResourceUsage;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsResourceUsageResponseBody build() {
            return new DescribeEnsResourceUsageResponseBody(this);
        } 

    } 

    public static class EnsResourceUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResourceCount")
        private Integer computeResourceCount;

        @com.aliyun.core.annotation.NameInMap("CpuSum")
        private Long cpuSum;

        @com.aliyun.core.annotation.NameInMap("DiskCount")
        private Integer diskCount;

        @com.aliyun.core.annotation.NameInMap("DownCount")
        private Integer downCount;

        @com.aliyun.core.annotation.NameInMap("ExpiredCount")
        private Integer expiredCount;

        @com.aliyun.core.annotation.NameInMap("ExpiringCount")
        private Integer expiringCount;

        @com.aliyun.core.annotation.NameInMap("GpuSum")
        private Long gpuSum;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("RunningCount")
        private Integer runningCount;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("StorageSum")
        private Long storageSum;

        private EnsResourceUsage(Builder builder) {
            this.computeResourceCount = builder.computeResourceCount;
            this.cpuSum = builder.cpuSum;
            this.diskCount = builder.diskCount;
            this.downCount = builder.downCount;
            this.expiredCount = builder.expiredCount;
            this.expiringCount = builder.expiringCount;
            this.gpuSum = builder.gpuSum;
            this.instanceCount = builder.instanceCount;
            this.runningCount = builder.runningCount;
            this.serviceType = builder.serviceType;
            this.storageSum = builder.storageSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsResourceUsage create() {
            return builder().build();
        }

        /**
         * @return computeResourceCount
         */
        public Integer getComputeResourceCount() {
            return this.computeResourceCount;
        }

        /**
         * @return cpuSum
         */
        public Long getCpuSum() {
            return this.cpuSum;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return downCount
         */
        public Integer getDownCount() {
            return this.downCount;
        }

        /**
         * @return expiredCount
         */
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        /**
         * @return expiringCount
         */
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        /**
         * @return gpuSum
         */
        public Long getGpuSum() {
            return this.gpuSum;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return storageSum
         */
        public Long getStorageSum() {
            return this.storageSum;
        }

        public static final class Builder {
            private Integer computeResourceCount; 
            private Long cpuSum; 
            private Integer diskCount; 
            private Integer downCount; 
            private Integer expiredCount; 
            private Integer expiringCount; 
            private Long gpuSum; 
            private Integer instanceCount; 
            private Integer runningCount; 
            private String serviceType; 
            private Long storageSum; 

            /**
             * The number of edge services. This parameter is available only when you set the ServiceType parameter to 2.
             */
            public Builder computeResourceCount(Integer computeResourceCount) {
                this.computeResourceCount = computeResourceCount;
                return this;
            }

            /**
             * The CPU usage. Unit: cores.
             */
            public Builder cpuSum(Long cpuSum) {
                this.cpuSum = cpuSum;
                return this;
            }

            /**
             * The number of data disks.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * The number of stopped VMs.
             */
            public Builder downCount(Integer downCount) {
                this.downCount = downCount;
                return this;
            }

            /**
             * The number of expired VM instances.
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * The number of VM instances that are about to expire.
             */
            public Builder expiringCount(Integer expiringCount) {
                this.expiringCount = expiringCount;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder gpuSum(Long gpuSum) {
                this.gpuSum = gpuSum;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The number of running instances.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * The type of the service. Valid values:
             * <p>
             * 
             * *   1: subscription instance.
             * *   2: edge service instance.
             * *   3: pay-as-you-go instance.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The total disk size.
             */
            public Builder storageSum(Long storageSum) {
                this.storageSum = storageSum;
                return this;
            }

            public EnsResourceUsage build() {
                return new EnsResourceUsage(this);
            } 

        } 

    }
}
