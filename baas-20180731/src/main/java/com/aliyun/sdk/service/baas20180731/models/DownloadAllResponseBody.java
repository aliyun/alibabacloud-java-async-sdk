// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadAllResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadAllResponseBody</p>
 */
public class DownloadAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DownloadAllResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadAllResponseBody create() {
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

        public DownloadAllResponseBody build() {
            return new DownloadAllResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("BizviewUrl")
        private String bizviewUrl;

        @NameInMap("CertUrl")
        private String certUrl;

        @NameInMap("SdkUrl")
        private String sdkUrl;

        private Result(Builder builder) {
            this.bizviewUrl = builder.bizviewUrl;
            this.certUrl = builder.certUrl;
            this.sdkUrl = builder.sdkUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizviewUrl
         */
        public String getBizviewUrl() {
            return this.bizviewUrl;
        }

        /**
         * @return certUrl
         */
        public String getCertUrl() {
            return this.certUrl;
        }

        /**
         * @return sdkUrl
         */
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public static final class Builder {
            private String bizviewUrl; 
            private String certUrl; 
            private String sdkUrl; 

            /**
             * BizviewUrl.
             */
            public Builder bizviewUrl(String bizviewUrl) {
                this.bizviewUrl = bizviewUrl;
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
             * SdkUrl.
             */
            public Builder sdkUrl(String sdkUrl) {
                this.sdkUrl = sdkUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
