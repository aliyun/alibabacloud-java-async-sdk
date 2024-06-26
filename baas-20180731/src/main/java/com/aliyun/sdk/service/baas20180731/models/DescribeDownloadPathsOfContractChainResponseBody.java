// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadPathsOfContractChainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadPathsOfContractChainResponseBody</p>
 */
public class DescribeDownloadPathsOfContractChainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeDownloadPathsOfContractChainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadPathsOfContractChainResponseBody create() {
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

        public DescribeDownloadPathsOfContractChainResponseBody build() {
            return new DescribeDownloadPathsOfContractChainResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaUrl")
        private String caUrl;

        @com.aliyun.core.annotation.NameInMap("CertUrl")
        private String certUrl;

        @com.aliyun.core.annotation.NameInMap("TrustCaUrl")
        private String trustCaUrl;

        private Result(Builder builder) {
            this.caUrl = builder.caUrl;
            this.certUrl = builder.certUrl;
            this.trustCaUrl = builder.trustCaUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return caUrl
         */
        public String getCaUrl() {
            return this.caUrl;
        }

        /**
         * @return certUrl
         */
        public String getCertUrl() {
            return this.certUrl;
        }

        /**
         * @return trustCaUrl
         */
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

        public static final class Builder {
            private String caUrl; 
            private String certUrl; 
            private String trustCaUrl; 

            /**
             * CaUrl.
             */
            public Builder caUrl(String caUrl) {
                this.caUrl = caUrl;
                return this;
            }

            /**
             * CertUrl.
             */
            public Builder certUrl(String certUrl) {
                this.certUrl = certUrl;
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
