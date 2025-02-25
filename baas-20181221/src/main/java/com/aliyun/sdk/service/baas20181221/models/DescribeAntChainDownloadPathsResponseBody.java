// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainDownloadPathsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainDownloadPathsResponseBody</p>
 */
public class DescribeAntChainDownloadPathsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeAntChainDownloadPathsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainDownloadPathsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainDownloadPathsResponseBody build() {
            return new DescribeAntChainDownloadPathsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCrtUrl")
        private String caCrtUrl;

        @com.aliyun.core.annotation.NameInMap("ClientCrtUrl")
        private String clientCrtUrl;

        @com.aliyun.core.annotation.NameInMap("SdkUrl")
        private String sdkUrl;

        @com.aliyun.core.annotation.NameInMap("TrustCaUrl")
        private String trustCaUrl;

        private Result(Builder builder) {
            this.caCrtUrl = builder.caCrtUrl;
            this.clientCrtUrl = builder.clientCrtUrl;
            this.sdkUrl = builder.sdkUrl;
            this.trustCaUrl = builder.trustCaUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return caCrtUrl
         */
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        /**
         * @return clientCrtUrl
         */
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        /**
         * @return sdkUrl
         */
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        /**
         * @return trustCaUrl
         */
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

        public static final class Builder {
            private String caCrtUrl; 
            private String clientCrtUrl; 
            private String sdkUrl; 
            private String trustCaUrl; 

            /**
             * CaCrtUrl.
             */
            public Builder caCrtUrl(String caCrtUrl) {
                this.caCrtUrl = caCrtUrl;
                return this;
            }

            /**
             * ClientCrtUrl.
             */
            public Builder clientCrtUrl(String clientCrtUrl) {
                this.clientCrtUrl = clientCrtUrl;
                return this;
            }

            /**
             * SdkUrl.
             */
            public Builder sdkUrl(String sdkUrl) {
                this.sdkUrl = sdkUrl;
                return this;
            }

            /**
             * TrustCaUrl.
             */
            public Builder trustCaUrl(String trustCaUrl) {
                this.trustCaUrl = trustCaUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
