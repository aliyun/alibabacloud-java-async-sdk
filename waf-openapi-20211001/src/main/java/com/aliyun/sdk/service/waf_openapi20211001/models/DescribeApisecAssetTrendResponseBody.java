// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisecAssetTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecAssetTrendResponseBody</p>
 */
public class DescribeApisecAssetTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecAssetTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecAssetTrendResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecAssetTrendResponseBody build() {
            return new DescribeApisecAssetTrendResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetActive")
        private Long assetActive;

        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Long assetCount;

        @com.aliyun.core.annotation.NameInMap("AssetOffline")
        private Long assetOffline;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.assetActive = builder.assetActive;
            this.assetCount = builder.assetCount;
            this.assetOffline = builder.assetOffline;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetActive
         */
        public Long getAssetActive() {
            return this.assetActive;
        }

        /**
         * @return assetCount
         */
        public Long getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return assetOffline
         */
        public Long getAssetOffline() {
            return this.assetOffline;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long assetActive; 
            private Long assetCount; 
            private Long assetOffline; 
            private Long timestamp; 

            /**
             * AssetActive.
             */
            public Builder assetActive(Long assetActive) {
                this.assetActive = assetActive;
                return this;
            }

            /**
             * AssetCount.
             */
            public Builder assetCount(Long assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * AssetOffline.
             */
            public Builder assetOffline(Long assetOffline) {
                this.assetOffline = assetOffline;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
