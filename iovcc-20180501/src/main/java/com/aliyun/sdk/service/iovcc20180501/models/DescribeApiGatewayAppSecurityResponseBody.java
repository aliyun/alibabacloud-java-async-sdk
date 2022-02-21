// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGatewayAppSecurityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGatewayAppSecurityResponseBody</p>
 */
public class DescribeApiGatewayAppSecurityResponseBody extends TeaModel {
    @NameInMap("ApiGatewayAppSecurity")
    private ApiGatewayAppSecurity apiGatewayAppSecurity;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiGatewayAppSecurityResponseBody(Builder builder) {
        this.apiGatewayAppSecurity = builder.apiGatewayAppSecurity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGatewayAppSecurityResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiGatewayAppSecurity
     */
    public ApiGatewayAppSecurity getApiGatewayAppSecurity() {
        return this.apiGatewayAppSecurity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiGatewayAppSecurity apiGatewayAppSecurity; 
        private String requestId; 

        /**
         * ApiGatewayAppSecurity.
         */
        public Builder apiGatewayAppSecurity(ApiGatewayAppSecurity apiGatewayAppSecurity) {
            this.apiGatewayAppSecurity = apiGatewayAppSecurity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiGatewayAppSecurityResponseBody build() {
            return new DescribeApiGatewayAppSecurityResponseBody(this);
        } 

    } 

    public static class ApiGatewayAppSecurity extends TeaModel {
        @NameInMap("GatewayAppId")
        private String gatewayAppId;

        @NameInMap("GatewayAppKey")
        private String gatewayAppKey;

        @NameInMap("GatewayAppSecret")
        private String gatewayAppSecret;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        private ApiGatewayAppSecurity(Builder builder) {
            this.gatewayAppId = builder.gatewayAppId;
            this.gatewayAppKey = builder.gatewayAppKey;
            this.gatewayAppSecret = builder.gatewayAppSecret;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGatewayAppSecurity create() {
            return builder().build();
        }

        /**
         * @return gatewayAppId
         */
        public String getGatewayAppId() {
            return this.gatewayAppId;
        }

        /**
         * @return gatewayAppKey
         */
        public String getGatewayAppKey() {
            return this.gatewayAppKey;
        }

        /**
         * @return gatewayAppSecret
         */
        public String getGatewayAppSecret() {
            return this.gatewayAppSecret;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public static final class Builder {
            private String gatewayAppId; 
            private String gatewayAppKey; 
            private String gatewayAppSecret; 
            private Long gmtCreate; 
            private Long gmtModified; 

            /**
             * GatewayAppId.
             */
            public Builder gatewayAppId(String gatewayAppId) {
                this.gatewayAppId = gatewayAppId;
                return this;
            }

            /**
             * GatewayAppKey.
             */
            public Builder gatewayAppKey(String gatewayAppKey) {
                this.gatewayAppKey = gatewayAppKey;
                return this;
            }

            /**
             * GatewayAppSecret.
             */
            public Builder gatewayAppSecret(String gatewayAppSecret) {
                this.gatewayAppSecret = gatewayAppSecret;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public ApiGatewayAppSecurity build() {
                return new ApiGatewayAppSecurity(this);
            } 

        } 

    }
}
