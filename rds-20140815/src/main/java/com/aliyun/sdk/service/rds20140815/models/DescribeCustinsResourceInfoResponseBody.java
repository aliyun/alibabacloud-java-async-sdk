// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCustinsResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustinsResourceInfoResponseBody</p>
 */
public class DescribeCustinsResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D4D4BE8A-DD46-440A-BFCD-EE31DA81C9DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustinsResourceInfoResponseBody build() {
            return new DescribeCustinsResourceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustinsResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustinsResourceInfoResponseBody</p>
     */
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
             * <p>The deadline for the CPU adjustment.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25</p>
             */
            public Builder cpuAdjustDeadline(String cpuAdjustDeadline) {
                this.cpuAdjustDeadline = cpuAdjustDeadline;
                return this;
            }

            /**
             * <p>The maximum percentage of the system CPU resources that the instance can use.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder cpuAdjustableMaxRatio(String cpuAdjustableMaxRatio) {
                this.cpuAdjustableMaxRatio = cpuAdjustableMaxRatio;
                return this;
            }

            /**
             * <p>The maximum CPU utilization.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder cpuAdjustableMaxValue(String cpuAdjustableMaxValue) {
                this.cpuAdjustableMaxValue = cpuAdjustableMaxValue;
                return this;
            }

            /**
             * <p>The CPU utilization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpuIncreaseRatio(String cpuIncreaseRatio) {
                this.cpuIncreaseRatio = cpuIncreaseRatio;
                return this;
            }

            /**
             * <p>The CPU utilization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cpuIncreaseRatioValue(String cpuIncreaseRatioValue) {
                this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-wz92gn1ll9fe5d3a4</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder iopsAdjustableMaxValue(String iopsAdjustableMaxValue) {
                this.iopsAdjustableMaxValue = iopsAdjustableMaxValue;
                return this;
            }

            /**
             * <p>The deadline for the adjustment of the maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25</p>
             */
            public Builder maxConnAdjustDeadline(String maxConnAdjustDeadline) {
                this.maxConnAdjustDeadline = maxConnAdjustDeadline;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConnAdjustableMaxValue(String maxConnAdjustableMaxValue) {
                this.maxConnAdjustableMaxValue = maxConnAdjustableMaxValue;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConnIncreaseRatio(String maxConnIncreaseRatio) {
                this.maxConnIncreaseRatio = maxConnIncreaseRatio;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxConnIncreaseRatioValue(String maxConnIncreaseRatioValue) {
                this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
                return this;
            }

            /**
             * <p>The deadline for the adjustment of the maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25</p>
             */
            public Builder maxIopsAdjustDeadline(String maxIopsAdjustDeadline) {
                this.maxIopsAdjustDeadline = maxIopsAdjustDeadline;
                return this;
            }

            /**
             * <p>The maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxIopsIncreaseRatio(String maxIopsIncreaseRatio) {
                this.maxIopsIncreaseRatio = maxIopsIncreaseRatio;
                return this;
            }

            /**
             * <p>The maximum IOPS that can be supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxIopsIncreaseRatioValue(String maxIopsIncreaseRatioValue) {
                this.maxIopsIncreaseRatioValue = maxIopsIncreaseRatioValue;
                return this;
            }

            /**
             * <p>The maximum percentage of the system memory that the instance can use.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder memAdjustableMaxRatio(String memAdjustableMaxRatio) {
                this.memAdjustableMaxRatio = memAdjustableMaxRatio;
                return this;
            }

            /**
             * <p>The maximum value of the resources to be evaluated.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder memAdjustableMaxValue(String memAdjustableMaxValue) {
                this.memAdjustableMaxValue = memAdjustableMaxValue;
                return this;
            }

            /**
             * <p>The deadline for the memory adjustment.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25</p>
             */
            public Builder memoryAdjustDeadline(String memoryAdjustDeadline) {
                this.memoryAdjustDeadline = memoryAdjustDeadline;
                return this;
            }

            /**
             * <p>The memory increase percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25</p>
             */
            public Builder memoryIncreaseRatio(String memoryIncreaseRatio) {
                this.memoryIncreaseRatio = memoryIncreaseRatio;
                return this;
            }

            /**
             * <p>The memory usage. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder memoryIncreaseRatioValue(String memoryIncreaseRatioValue) {
                this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
                return this;
            }

            /**
             * <p>The number of CPUs of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder originCpu(String originCpu) {
                this.originCpu = originCpu;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder originMaxConn(String originMaxConn) {
                this.originMaxConn = originMaxConn;
                return this;
            }

            /**
             * <p>The maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder originMaxIops(String originMaxIops) {
                this.originMaxIops = originMaxIops;
                return this;
            }

            /**
             * <p>The actual memory used. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
