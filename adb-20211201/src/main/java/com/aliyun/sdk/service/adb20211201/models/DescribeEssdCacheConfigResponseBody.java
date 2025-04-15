// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEssdCacheConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7EDB8E4-9769-4233-88C7-DCA4C9******</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.enableEssdCache = model.enableEssdCache;
                this.essdCacheSize = model.essdCacheSize;
            } 

            /**
             * <p>Specifies whether to enable the disk cache feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableEssdCache(Boolean enableEssdCache) {
                this.enableEssdCache = enableEssdCache;
                return this;
            }

            /**
             * <p>The disk cache size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
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
