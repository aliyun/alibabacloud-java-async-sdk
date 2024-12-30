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
 * {@link DescribeUserAssetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAssetResponseBody</p>
 */
public class DescribeUserAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserAssetResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAssetResponseBody create() {
        return builder().build();
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Assets> assets; 
        private String requestId; 

        /**
         * <p>The API statistics.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserAssetResponseBody build() {
            return new DescribeUserAssetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserAssetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAssetResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetNum")
        private Long assetNum;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        private Assets(Builder builder) {
            this.assetNum = builder.assetNum;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return assetNum
         */
        public Long getAssetNum() {
            return this.assetNum;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long assetNum; 
            private Long timeStamp; 

            /**
             * <p>The number of APIs returned.</p>
             * 
             * <strong>example:</strong>
             * <p>134</p>
             */
            public Builder assetNum(Long assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723435200</p>
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
