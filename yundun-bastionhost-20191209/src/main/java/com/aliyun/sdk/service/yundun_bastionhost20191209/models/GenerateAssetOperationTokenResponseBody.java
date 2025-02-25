// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateAssetOperationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAssetOperationTokenResponseBody</p>
 */
public class GenerateAssetOperationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetOperationToken")
    private AssetOperationToken assetOperationToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data returned.</p>
         */
        public Builder assetOperationToken(AssetOperationToken assetOperationToken) {
            this.assetOperationToken = assetOperationToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAssetOperationTokenResponseBody build() {
            return new GenerateAssetOperationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateAssetOperationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateAssetOperationTokenResponseBody</p>
     */
    public static class AssetOperationToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountLeft")
        private Long countLeft;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("HasCountLimit")
        private Boolean hasCountLimit;

        @com.aliyun.core.annotation.NameInMap("MaxRenewCount")
        private Long maxRenewCount;

        @com.aliyun.core.annotation.NameInMap("RenewCount")
        private Long renewCount;

        @com.aliyun.core.annotation.NameInMap("SsoUrl")
        private String ssoUrl;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("TokenId")
        private String tokenId;

        private AssetOperationToken(Builder builder) {
            this.countLeft = builder.countLeft;
            this.expireTime = builder.expireTime;
            this.hasCountLimit = builder.hasCountLimit;
            this.maxRenewCount = builder.maxRenewCount;
            this.renewCount = builder.renewCount;
            this.ssoUrl = builder.ssoUrl;
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
         * @return ssoUrl
         */
        public String getSsoUrl() {
            return this.ssoUrl;
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
            private String ssoUrl; 
            private String token; 
            private String tokenId; 

            /**
             * <p>The remaining number of times that you can use the O&amp;M token.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder countLeft(Long countLeft) {
                this.countLeft = countLeft;
                return this;
            }

            /**
             * <p>The time when the O&amp;M token expires. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1709110797</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the number of times that you can use the O&amp;M token is limited.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasCountLimit(Boolean hasCountLimit) {
                this.hasCountLimit = hasCountLimit;
                return this;
            }

            /**
             * <p>The maximum number of renewals. A value of 0 indicates that renewal is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxRenewCount(Long maxRenewCount) {
                this.maxRenewCount = maxRenewCount;
                return this;
            }

            /**
             * <p>The number of times the O&amp;M token is renewed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renewCount(Long renewCount) {
                this.renewCount = renewCount;
                return this;
            }

            /**
             * SsoUrl.
             */
            public Builder ssoUrl(String ssoUrl) {
                this.ssoUrl = ssoUrl;
                return this;
            }

            /**
             * <p>The O&amp;M token that you apply for.</p>
             * 
             * <strong>example:</strong>
             * <p>NmYyMmEzNmMwYzljNGY******</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The ID of the O&amp;M token.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
