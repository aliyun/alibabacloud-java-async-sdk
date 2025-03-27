// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeFreeUserAssetCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFreeUserAssetCountResponseBody</p>
 */
public class DescribeFreeUserAssetCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Asset")
    private Asset asset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFreeUserAssetCountResponseBody(Builder builder) {
        this.asset = builder.asset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFreeUserAssetCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asset
     */
    public Asset getAsset() {
        return this.asset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Asset asset; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFreeUserAssetCountResponseBody model) {
            this.asset = model.asset;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The asset statistics provided by basic detection.</p>
         */
        public Builder asset(Asset asset) {
            this.asset = asset;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30488BF0-FD58-52DD-B396-D014549F43A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFreeUserAssetCountResponseBody build() {
            return new DescribeFreeUserAssetCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFreeUserAssetCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFreeUserAssetCountResponseBody</p>
     */
    public static class Asset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetActive")
        private Long assetActive;

        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Long assetCount;

        @com.aliyun.core.annotation.NameInMap("AssetOffline")
        private Long assetOffline;

        private Asset(Builder builder) {
            this.assetActive = builder.assetActive;
            this.assetCount = builder.assetCount;
            this.assetOffline = builder.assetOffline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Asset create() {
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

        public static final class Builder {
            private Long assetActive; 
            private Long assetCount; 
            private Long assetOffline; 

            private Builder() {
            } 

            private Builder(Asset model) {
                this.assetActive = model.assetActive;
                this.assetCount = model.assetCount;
                this.assetOffline = model.assetOffline;
            } 

            /**
             * <p>The number of active APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder assetActive(Long assetActive) {
                this.assetActive = assetActive;
                return this;
            }

            /**
             * <p>The total number of APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder assetCount(Long assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The number of deactivated APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder assetOffline(Long assetOffline) {
                this.assetOffline = assetOffline;
                return this;
            }

            public Asset build() {
                return new Asset(this);
            } 

        } 

    }
}
