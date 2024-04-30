// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustinsResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustinsResourceInfoResponseBody</p>
 */
public class DescribeCustinsResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustinsResourceInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustinsResourceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustinsResourceInfoResponseBody build() {
            return new DescribeCustinsResourceInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuAdjustDeadline")
        private String cpuAdjustDeadline;

        @com.aliyun.core.annotation.NameInMap("CpuAdjustableMaxRatio")
        private String cpuAdjustableMaxRatio;

        @com.aliyun.core.annotation.NameInMap("CpuAdjustableMaxValue")
        private String cpuAdjustableMaxValue;

        @com.aliyun.core.annotation.NameInMap("CpuIncreaseRatio")
        private String cpuIncreaseRatio;

        @com.aliyun.core.annotation.NameInMap("CpuIncreaseRatioValue")
        private String cpuIncreaseRatioValue;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("IopsAdjustableMaxValue")
        private String iopsAdjustableMaxValue;

        @com.aliyun.core.annotation.NameInMap("MaxConnAdjustDeadline")
        private String maxConnAdjustDeadline;

        @com.aliyun.core.annotation.NameInMap("MaxConnAdjustableMaxValue")
        private String maxConnAdjustableMaxValue;

        @com.aliyun.core.annotation.NameInMap("MaxConnIncreaseRatio")
        private String maxConnIncreaseRatio;

        @com.aliyun.core.annotation.NameInMap("MaxConnIncreaseRatioValue")
        private String maxConnIncreaseRatioValue;

        @com.aliyun.core.annotation.NameInMap("MaxIopsAdjustDeadline")
        private String maxIopsAdjustDeadline;

        @com.aliyun.core.annotation.NameInMap("MaxIopsIncreaseRatio")
        private String maxIopsIncreaseRatio;

        @com.aliyun.core.annotation.NameInMap("MaxIopsIncreaseRatioValue")
        private String maxIopsIncreaseRatioValue;

        @com.aliyun.core.annotation.NameInMap("MemAdjustableMaxRatio")
        private String memAdjustableMaxRatio;

        @com.aliyun.core.annotation.NameInMap("MemAdjustableMaxValue")
        private String memAdjustableMaxValue;

        @com.aliyun.core.annotation.NameInMap("MemoryAdjustDeadline")
        private String memoryAdjustDeadline;

        @com.aliyun.core.annotation.NameInMap("MemoryIncreaseRatio")
        private String memoryIncreaseRatio;

        @com.aliyun.core.annotation.NameInMap("MemoryIncreaseRatioValue")
        private String memoryIncreaseRatioValue;

        @com.aliyun.core.annotation.NameInMap("OriginCpu")
        private String originCpu;

        @com.aliyun.core.annotation.NameInMap("OriginMaxConn")
        private String originMaxConn;

        @com.aliyun.core.annotation.NameInMap("OriginMaxIops")
        private String originMaxIops;

        @com.aliyun.core.annotation.NameInMap("OriginMemory")
        private String originMemory;

        private Data(Builder builder) {
            this.cpuAdjustDeadline = builder.cpuAdjustDeadline;
            this.cpuAdjustableMaxRatio = builder.cpuAdjustableMaxRatio;
            this.cpuAdjustableMaxValue = builder.cpuAdjustableMaxValue;
            this.cpuIncreaseRatio = builder.cpuIncreaseRatio;
            this.cpuIncreaseRatioValue = builder.cpuIncreaseRatioValue;
            this.DBInstanceId = builder.DBInstanceId;
            this.iopsAdjustableMaxValue = builder.iopsAdjustableMaxValue;
            this.maxConnAdjustDeadline = builder.maxConnAdjustDeadline;
            this.maxConnAdjustableMaxValue = builder.maxConnAdjustableMaxValue;
            this.maxConnIncreaseRatio = builder.maxConnIncreaseRatio;
            this.maxConnIncreaseRatioValue = builder.maxConnIncreaseRatioValue;
            this.maxIopsAdjustDeadline = builder.maxIopsAdjustDeadline;
            this.maxIopsIncreaseRatio = builder.maxIopsIncreaseRatio;
            this.maxIopsIncreaseRatioValue = builder.maxIopsIncreaseRatioValue;
            this.memAdjustableMaxRatio = builder.memAdjustableMaxRatio;
            this.memAdjustableMaxValue = builder.memAdjustableMaxValue;
            this.memoryAdjustDeadline = builder.memoryAdjustDeadline;
            this.memoryIncreaseRatio = builder.memoryIncreaseRatio;
            this.memoryIncreaseRatioValue = builder.memoryIncreaseRatioValue;
            this.originCpu = builder.originCpu;
            this.originMaxConn = builder.originMaxConn;
            this.originMaxIops = builder.originMaxIops;
            this.originMemory = builder.originMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cpuAdjustDeadline
         */
        public String getCpuAdjustDeadline() {
            return this.cpuAdjustDeadline;
        }

        /**
         * @return cpuAdjustableMaxRatio
         */
        public String getCpuAdjustableMaxRatio() {
            return this.cpuAdjustableMaxRatio;
        }

        /**
         * @return cpuAdjustableMaxValue
         */
        public String getCpuAdjustableMaxValue() {
            return this.cpuAdjustableMaxValue;
        }

        /**
         * @return cpuIncreaseRatio
         */
        public String getCpuIncreaseRatio() {
            return this.cpuIncreaseRatio;
        }

        /**
         * @return cpuIncreaseRatioValue
         */
        public String getCpuIncreaseRatioValue() {
            return this.cpuIncreaseRatioValue;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return iopsAdjustableMaxValue
         */
        public String getIopsAdjustableMaxValue() {
            return this.iopsAdjustableMaxValue;
        }

        /**
         * @return maxConnAdjustDeadline
         */
        public String getMaxConnAdjustDeadline() {
            return this.maxConnAdjustDeadline;
        }

        /**
         * @return maxConnAdjustableMaxValue
         */
        public String getMaxConnAdjustableMaxValue() {
            return this.maxConnAdjustableMaxValue;
        }

        /**
         * @return maxConnIncreaseRatio
         */
        public String getMaxConnIncreaseRatio() {
            return this.maxConnIncreaseRatio;
        }

        /**
         * @return maxConnIncreaseRatioValue
         */
        public String getMaxConnIncreaseRatioValue() {
            return this.maxConnIncreaseRatioValue;
        }

        /**
         * @return maxIopsAdjustDeadline
         */
        public String getMaxIopsAdjustDeadline() {
            return this.maxIopsAdjustDeadline;
        }

        /**
         * @return maxIopsIncreaseRatio
         */
        public String getMaxIopsIncreaseRatio() {
            return this.maxIopsIncreaseRatio;
        }

        /**
         * @return maxIopsIncreaseRatioValue
         */
        public String getMaxIopsIncreaseRatioValue() {
            return this.maxIopsIncreaseRatioValue;
        }

        /**
         * @return memAdjustableMaxRatio
         */
        public String getMemAdjustableMaxRatio() {
            return this.memAdjustableMaxRatio;
        }

        /**
         * @return memAdjustableMaxValue
         */
        public String getMemAdjustableMaxValue() {
            return this.memAdjustableMaxValue;
        }

        /**
         * @return memoryAdjustDeadline
         */
        public String getMemoryAdjustDeadline() {
            return this.memoryAdjustDeadline;
        }

        /**
         * @return memoryIncreaseRatio
         */
        public String getMemoryIncreaseRatio() {
            return this.memoryIncreaseRatio;
        }

        /**
         * @return memoryIncreaseRatioValue
         */
        public String getMemoryIncreaseRatioValue() {
            return this.memoryIncreaseRatioValue;
        }

        /**
         * @return originCpu
         */
        public String getOriginCpu() {
            return this.originCpu;
        }

        /**
         * @return originMaxConn
         */
        public String getOriginMaxConn() {
            return this.originMaxConn;
        }

        /**
         * @return originMaxIops
         */
        public String getOriginMaxIops() {
            return this.originMaxIops;
        }

        /**
         * @return originMemory
         */
        public String getOriginMemory() {
            return this.originMemory;
        }

        public static final class Builder {
            private String cpuAdjustDeadline; 
            private String cpuAdjustableMaxRatio; 
            private String cpuAdjustableMaxValue; 
            private String cpuIncreaseRatio; 
            private String cpuIncreaseRatioValue; 
            private String DBInstanceId; 
            private String iopsAdjustableMaxValue; 
            private String maxConnAdjustDeadline; 
            private String maxConnAdjustableMaxValue; 
            private String maxConnIncreaseRatio; 
            private String maxConnIncreaseRatioValue; 
            private String maxIopsAdjustDeadline; 
            private String maxIopsIncreaseRatio; 
            private String maxIopsIncreaseRatioValue; 
            private String memAdjustableMaxRatio; 
            private String memAdjustableMaxValue; 
            private String memoryAdjustDeadline; 
            private String memoryIncreaseRatio; 
            private String memoryIncreaseRatioValue; 
            private String originCpu; 
            private String originMaxConn; 
            private String originMaxIops; 
            private String originMemory; 

            /**
             * The deadline for the CPU adjustment.
             */
            public Builder cpuAdjustDeadline(String cpuAdjustDeadline) {
                this.cpuAdjustDeadline = cpuAdjustDeadline;
                return this;
            }

            /**
             * The maximum percentage of the system CPU resources that the instance can use.
             */
            public Builder cpuAdjustableMaxRatio(String cpuAdjustableMaxRatio) {
                this.cpuAdjustableMaxRatio = cpuAdjustableMaxRatio;
                return this;
            }

            /**
             * The maximum CPU utilization.
             */
            public Builder cpuAdjustableMaxValue(String cpuAdjustableMaxValue) {
                this.cpuAdjustableMaxValue = cpuAdjustableMaxValue;
                return this;
            }

            /**
             * The CPU utilization.
             */
            public Builder cpuIncreaseRatio(String cpuIncreaseRatio) {
                this.cpuIncreaseRatio = cpuIncreaseRatio;
                return this;
            }

            /**
             * The CPU utilization. Unit: percentage.
             */
            public Builder cpuIncreaseRatioValue(String cpuIncreaseRatioValue) {
                this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The maximum IOPS.
             */
            public Builder iopsAdjustableMaxValue(String iopsAdjustableMaxValue) {
                this.iopsAdjustableMaxValue = iopsAdjustableMaxValue;
                return this;
            }

            /**
             * The deadline for the adjustment of the maximum number of connections.
             */
            public Builder maxConnAdjustDeadline(String maxConnAdjustDeadline) {
                this.maxConnAdjustDeadline = maxConnAdjustDeadline;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnAdjustableMaxValue(String maxConnAdjustableMaxValue) {
                this.maxConnAdjustableMaxValue = maxConnAdjustableMaxValue;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnIncreaseRatio(String maxConnIncreaseRatio) {
                this.maxConnIncreaseRatio = maxConnIncreaseRatio;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnIncreaseRatioValue(String maxConnIncreaseRatioValue) {
                this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
                return this;
            }

            /**
             * The deadline for the adjustment of the maximum IOPS.
             */
            public Builder maxIopsAdjustDeadline(String maxIopsAdjustDeadline) {
                this.maxIopsAdjustDeadline = maxIopsAdjustDeadline;
                return this;
            }

            /**
             * The maximum IOPS.
             */
            public Builder maxIopsIncreaseRatio(String maxIopsIncreaseRatio) {
                this.maxIopsIncreaseRatio = maxIopsIncreaseRatio;
                return this;
            }

            /**
             * The maximum IOPS that can be supported by the instance.
             */
            public Builder maxIopsIncreaseRatioValue(String maxIopsIncreaseRatioValue) {
                this.maxIopsIncreaseRatioValue = maxIopsIncreaseRatioValue;
                return this;
            }

            /**
             * The maximum percentage of the system memory that the instance can use.
             */
            public Builder memAdjustableMaxRatio(String memAdjustableMaxRatio) {
                this.memAdjustableMaxRatio = memAdjustableMaxRatio;
                return this;
            }

            /**
             * The maximum value of the resources to be evaluated.
             */
            public Builder memAdjustableMaxValue(String memAdjustableMaxValue) {
                this.memAdjustableMaxValue = memAdjustableMaxValue;
                return this;
            }

            /**
             * The deadline for the memory adjustment.
             */
            public Builder memoryAdjustDeadline(String memoryAdjustDeadline) {
                this.memoryAdjustDeadline = memoryAdjustDeadline;
                return this;
            }

            /**
             * The memory increase percentage.
             */
            public Builder memoryIncreaseRatio(String memoryIncreaseRatio) {
                this.memoryIncreaseRatio = memoryIncreaseRatio;
                return this;
            }

            /**
             * The memory usage. Unit: MB.
             */
            public Builder memoryIncreaseRatioValue(String memoryIncreaseRatioValue) {
                this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
                return this;
            }

            /**
             * The number of CPUs of the instance.
             */
            public Builder originCpu(String originCpu) {
                this.originCpu = originCpu;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder originMaxConn(String originMaxConn) {
                this.originMaxConn = originMaxConn;
                return this;
            }

            /**
             * The maximum IOPS.
             */
            public Builder originMaxIops(String originMaxIops) {
                this.originMaxIops = originMaxIops;
                return this;
            }

            /**
             * The actual memory used. Unit: MB.
             */
            public Builder originMemory(String originMemory) {
                this.originMemory = originMemory;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
