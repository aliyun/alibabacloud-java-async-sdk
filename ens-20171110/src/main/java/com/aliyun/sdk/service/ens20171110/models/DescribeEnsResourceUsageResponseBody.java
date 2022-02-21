// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsResourceUsageResponseBody</p>
 */
public class DescribeEnsResourceUsageResponseBody extends TeaModel {
    @NameInMap("EnsResourceUsage")
    private java.util.List < EnsResourceUsage> ensResourceUsage;

    @NameInMap("RequestId")
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
         * EnsResourceUsage.
         */
        public Builder ensResourceUsage(java.util.List < EnsResourceUsage> ensResourceUsage) {
            this.ensResourceUsage = ensResourceUsage;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("ComputeResourceCount")
        private Integer computeResourceCount;

        @NameInMap("CpuSum")
        private Long cpuSum;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DownCount")
        private Integer downCount;

        @NameInMap("ExpiredCount")
        private Integer expiredCount;

        @NameInMap("ExpiringCount")
        private Integer expiringCount;

        @NameInMap("GpuSum")
        private Long gpuSum;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("RunningCount")
        private Integer runningCount;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("StorageSum")
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
             * ComputeResourceCount.
             */
            public Builder computeResourceCount(Integer computeResourceCount) {
                this.computeResourceCount = computeResourceCount;
                return this;
            }

            /**
             * CpuSum.
             */
            public Builder cpuSum(Long cpuSum) {
                this.cpuSum = cpuSum;
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
             * DownCount.
             */
            public Builder downCount(Integer downCount) {
                this.downCount = downCount;
                return this;
            }

            /**
             * ExpiredCount.
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * ExpiringCount.
             */
            public Builder expiringCount(Integer expiringCount) {
                this.expiringCount = expiringCount;
                return this;
            }

            /**
             * GpuSum.
             */
            public Builder gpuSum(Long gpuSum) {
                this.gpuSum = gpuSum;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * RunningCount.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * StorageSum.
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
