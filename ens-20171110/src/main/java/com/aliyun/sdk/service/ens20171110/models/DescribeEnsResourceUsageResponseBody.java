// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsResourceUsageResponseBody</p>
 */
public class DescribeEnsResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnsResourceUsage")
    private java.util.List<EnsResourceUsage> ensResourceUsage;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensResourceUsage
     */
    public java.util.List<EnsResourceUsage> getEnsResourceUsage() {
        return this.ensResourceUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EnsResourceUsage> ensResourceUsage; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEnsResourceUsageResponseBody model) {
            this.ensResourceUsage = model.ensResourceUsage;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The resource usage data.</p>
         */
        public Builder ensResourceUsage(java.util.List<EnsResourceUsage> ensResourceUsage) {
            this.ensResourceUsage = ensResourceUsage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E	 Request ID.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsResourceUsageResponseBody build() {
            return new DescribeEnsResourceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsResourceUsageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EnsResourceUsage model) {
                this.computeResourceCount = model.computeResourceCount;
                this.cpuSum = model.cpuSum;
                this.diskCount = model.diskCount;
                this.downCount = model.downCount;
                this.expiredCount = model.expiredCount;
                this.expiringCount = model.expiringCount;
                this.gpuSum = model.gpuSum;
                this.instanceCount = model.instanceCount;
                this.runningCount = model.runningCount;
                this.serviceType = model.serviceType;
                this.storageSum = model.storageSum;
            } 

            /**
             * <p>The number of edge services. This parameter is available only when you set the ServiceType parameter to 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder computeResourceCount(Integer computeResourceCount) {
                this.computeResourceCount = computeResourceCount;
                return this;
            }

            /**
             * <p>The CPU usage. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuSum(Long cpuSum) {
                this.cpuSum = cpuSum;
                return this;
            }

            /**
             * <p>The number of data disks.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * <p>The number of stopped VMs.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder downCount(Integer downCount) {
                this.downCount = downCount;
                return this;
            }

            /**
             * <p>The number of expired VM instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * <p>The number of VM instances that are about to expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expiringCount(Integer expiringCount) {
                this.expiringCount = expiringCount;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder gpuSum(Long gpuSum) {
                this.gpuSum = gpuSum;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * <p>The type of the service. Valid values:</p>
             * <ul>
             * <li>1: subscription instance.</li>
             * <li>2: edge service instance.</li>
             * <li>3: pay-as-you-go instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The total disk size.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
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
