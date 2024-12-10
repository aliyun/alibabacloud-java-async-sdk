// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLakeCacheSizeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakeCacheSizeResponseBody</p>
 */
public class DescribeLakeCacheSizeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLakeCacheSizeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakeCacheSizeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public DescribeLakeCacheSizeResponseBody build() {
            return new DescribeLakeCacheSizeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLakeCacheSizeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLakeCacheSizeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("EnableLakeCache")
        private Boolean enableLakeCache;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < String > instances;

        private Data(Builder builder) {
            this.capacity = builder.capacity;
            this.DBClusterId = builder.DBClusterId;
            this.dataSize = builder.dataSize;
            this.enableLakeCache = builder.enableLakeCache;
            this.instances = builder.instances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return enableLakeCache
         */
        public Boolean getEnableLakeCache() {
            return this.enableLakeCache;
        }

        /**
         * @return instances
         */
        public java.util.List < String > getInstances() {
            return this.instances;
        }

        public static final class Builder {
            private Long capacity; 
            private String DBClusterId; 
            private Long dataSize; 
            private Boolean enableLakeCache; 
            private java.util.List < String > instances; 

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * EnableLakeCache.
             */
            public Builder enableLakeCache(Boolean enableLakeCache) {
                this.enableLakeCache = enableLakeCache;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < String > instances) {
                this.instances = instances;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
