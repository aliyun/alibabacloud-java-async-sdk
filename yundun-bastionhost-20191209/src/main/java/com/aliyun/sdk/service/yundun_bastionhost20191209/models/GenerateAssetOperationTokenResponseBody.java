// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAssetOperationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAssetOperationTokenResponseBody</p>
 */
public class GenerateAssetOperationTokenResponseBody extends TeaModel {
    @NameInMap("AssetOperationToken")
    private AssetOperationToken assetOperationToken;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateAssetOperationTokenResponseBody(Builder builder) {
        this.assetOperationToken = builder.assetOperationToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAssetOperationTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetOperationToken
     */
    public AssetOperationToken getAssetOperationToken() {
        return this.assetOperationToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssetOperationToken assetOperationToken; 
        private String requestId; 

        /**
         * AssetOperationToken.
         */
        public Builder assetOperationToken(AssetOperationToken assetOperationToken) {
            this.assetOperationToken = assetOperationToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAssetOperationTokenResponseBody build() {
            return new GenerateAssetOperationTokenResponseBody(this);
        } 

    } 

    public static class AssetOperationToken extends TeaModel {
        @NameInMap("CountLeft")
        private Long countLeft;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("HasCountLimit")
        private Boolean hasCountLimit;

        @NameInMap("MaxRenewCount")
        private Long maxRenewCount;

        @NameInMap("RenewCount")
        private Long renewCount;

        @NameInMap("Token")
        private String token;

        @NameInMap("TokenId")
        private String tokenId;

        private AssetOperationToken(Builder builder) {
            this.countLeft = builder.countLeft;
            this.expireTime = builder.expireTime;
            this.hasCountLimit = builder.hasCountLimit;
            this.maxRenewCount = builder.maxRenewCount;
            this.renewCount = builder.renewCount;
            this.token = builder.token;
            this.tokenId = builder.tokenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetOperationToken create() {
            return builder().build();
        }

        /**
         * @return countLeft
         */
        public Long getCountLeft() {
            return this.countLeft;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return hasCountLimit
         */
        public Boolean getHasCountLimit() {
            return this.hasCountLimit;
        }

        /**
         * @return maxRenewCount
         */
        public Long getMaxRenewCount() {
            return this.maxRenewCount;
        }

        /**
         * @return renewCount
         */
        public Long getRenewCount() {
            return this.renewCount;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenId
         */
        public String getTokenId() {
            return this.tokenId;
        }

        public static final class Builder {
            private Long countLeft; 
            private Long expireTime; 
            private Boolean hasCountLimit; 
            private Long maxRenewCount; 
            private Long renewCount; 
            private String token; 
            private String tokenId; 

            /**
             * CountLeft.
             */
            public Builder countLeft(Long countLeft) {
                this.countLeft = countLeft;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HasCountLimit.
             */
            public Builder hasCountLimit(Boolean hasCountLimit) {
                this.hasCountLimit = hasCountLimit;
                return this;
            }

            /**
             * MaxRenewCount.
             */
            public Builder maxRenewCount(Long maxRenewCount) {
                this.maxRenewCount = maxRenewCount;
                return this;
            }

            /**
             * RenewCount.
             */
            public Builder renewCount(Long renewCount) {
                this.renewCount = renewCount;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * TokenId.
             */
            public Builder tokenId(String tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            public AssetOperationToken build() {
                return new AssetOperationToken(this);
            } 

        } 

    }
}
