// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualWareHouseClassSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualWareHouseClassSetResponseBody</p>
 */
public class DescribeVirtualWareHouseClassSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVirtualWareHouseClassSetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualWareHouseClassSetResponseBody create() {
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVirtualWareHouseClassSetResponseBody build() {
            return new DescribeVirtualWareHouseClassSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualWareHouseClassSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualWareHouseClassSetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheStorageStep")
        private Integer cacheStorageStep;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Integer cpuCores;

        @com.aliyun.core.annotation.NameInMap("MaxCacheStorage")
        private Integer maxCacheStorage;

        @com.aliyun.core.annotation.NameInMap("MemoryGiB")
        private Integer memoryGiB;

        @com.aliyun.core.annotation.NameInMap("MinCacheStorage")
        private Integer minCacheStorage;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.cacheStorageStep = builder.cacheStorageStep;
            this.cpuCores = builder.cpuCores;
            this.maxCacheStorage = builder.maxCacheStorage;
            this.memoryGiB = builder.memoryGiB;
            this.minCacheStorage = builder.minCacheStorage;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cacheStorageStep
         */
        public Integer getCacheStorageStep() {
            return this.cacheStorageStep;
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return maxCacheStorage
         */
        public Integer getMaxCacheStorage() {
            return this.maxCacheStorage;
        }

        /**
         * @return memoryGiB
         */
        public Integer getMemoryGiB() {
            return this.memoryGiB;
        }

        /**
         * @return minCacheStorage
         */
        public Integer getMinCacheStorage() {
            return this.minCacheStorage;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer cacheStorageStep; 
            private Integer cpuCores; 
            private Integer maxCacheStorage; 
            private Integer memoryGiB; 
            private Integer minCacheStorage; 
            private String value; 

            /**
             * CacheStorageStep.
             */
            public Builder cacheStorageStep(Integer cacheStorageStep) {
                this.cacheStorageStep = cacheStorageStep;
                return this;
            }

            /**
             * CpuCores.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * MaxCacheStorage.
             */
            public Builder maxCacheStorage(Integer maxCacheStorage) {
                this.maxCacheStorage = maxCacheStorage;
                return this;
            }

            /**
             * MemoryGiB.
             */
            public Builder memoryGiB(Integer memoryGiB) {
                this.memoryGiB = memoryGiB;
                return this;
            }

            /**
             * MinCacheStorage.
             */
            public Builder minCacheStorage(Integer minCacheStorage) {
                this.minCacheStorage = minCacheStorage;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
