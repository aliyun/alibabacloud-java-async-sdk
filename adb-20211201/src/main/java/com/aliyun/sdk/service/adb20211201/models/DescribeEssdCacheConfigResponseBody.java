// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEssdCacheConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEssdCacheConfigResponseBody</p>
 */
public class DescribeEssdCacheConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEssdCacheConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEssdCacheConfigResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String requestId; 

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

        public DescribeEssdCacheConfigResponseBody build() {
            return new DescribeEssdCacheConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEssdCacheConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEssdCacheConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableEssdCache")
        private Boolean enableEssdCache;

        @com.aliyun.core.annotation.NameInMap("EssdCacheSize")
        private Integer essdCacheSize;

        private Data(Builder builder) {
            this.enableEssdCache = builder.enableEssdCache;
            this.essdCacheSize = builder.essdCacheSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableEssdCache
         */
        public Boolean getEnableEssdCache() {
            return this.enableEssdCache;
        }

        /**
         * @return essdCacheSize
         */
        public Integer getEssdCacheSize() {
            return this.essdCacheSize;
        }

        public static final class Builder {
            private Boolean enableEssdCache; 
            private Integer essdCacheSize; 

            /**
             * EnableEssdCache.
             */
            public Builder enableEssdCache(Boolean enableEssdCache) {
                this.enableEssdCache = enableEssdCache;
                return this;
            }

            /**
             * EssdCacheSize.
             */
            public Builder essdCacheSize(Integer essdCacheSize) {
                this.essdCacheSize = essdCacheSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
