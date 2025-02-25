// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainWithKeyAutoCreationResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyAntChainWithKeyAutoCreationResponseBody</p>
 */
public class ApplyAntChainWithKeyAutoCreationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ApplyAntChainWithKeyAutoCreationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAntChainWithKeyAutoCreationResponseBody create() {
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

        public ApplyAntChainWithKeyAutoCreationResponseBody build() {
            return new ApplyAntChainWithKeyAutoCreationResponseBody(this);
        } 

    } 

    public static class DownloadPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCrtUrl")
        private String caCrtUrl;

        @com.aliyun.core.annotation.NameInMap("ClientCrtUrl")
        private String clientCrtUrl;

        @com.aliyun.core.annotation.NameInMap("SdkUrl")
        private String sdkUrl;

        @com.aliyun.core.annotation.NameInMap("TrustCaUrl")
        private String trustCaUrl;

        private DownloadPath(Builder builder) {
            this.caCrtUrl = builder.caCrtUrl;
            this.clientCrtUrl = builder.clientCrtUrl;
            this.sdkUrl = builder.sdkUrl;
            this.trustCaUrl = builder.trustCaUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadPath create() {
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

            public DownloadPath build() {
                return new DownloadPath(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadPath")
        private DownloadPath downloadPath;

        @com.aliyun.core.annotation.NameInMap("PrivateKey")
        private String privateKey;

        private Result(Builder builder) {
            this.downloadPath = builder.downloadPath;
            this.privateKey = builder.privateKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return downloadPath
         */
        public DownloadPath getDownloadPath() {
            return this.downloadPath;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        public static final class Builder {
            private DownloadPath downloadPath; 
            private String privateKey; 

            /**
             * DownloadPath.
             */
            public Builder downloadPath(DownloadPath downloadPath) {
                this.downloadPath = downloadPath;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
