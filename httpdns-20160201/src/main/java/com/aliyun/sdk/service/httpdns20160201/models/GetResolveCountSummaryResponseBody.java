// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResolveCountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResolveCountSummaryResponseBody</p>
 */
public class GetResolveCountSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResolveSummary")
    private ResolveSummary resolveSummary;

    private GetResolveCountSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resolveSummary = builder.resolveSummary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResolveCountSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resolveSummary
     */
    public ResolveSummary getResolveSummary() {
        return this.resolveSummary;
    }

    public static final class Builder {
        private String requestId; 
        private ResolveSummary resolveSummary; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResolveSummary.
         */
        public Builder resolveSummary(ResolveSummary resolveSummary) {
            this.resolveSummary = resolveSummary;
            return this;
        }

        public GetResolveCountSummaryResponseBody build() {
            return new GetResolveCountSummaryResponseBody(this);
        } 

    } 

    public static class ResolveSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Http")
        private Long http;

        @com.aliyun.core.annotation.NameInMap("Http6")
        private Long http6;

        @com.aliyun.core.annotation.NameInMap("Https")
        private Long https;

        @com.aliyun.core.annotation.NameInMap("Https6")
        private Long https6;

        private ResolveSummary(Builder builder) {
            this.http = builder.http;
            this.http6 = builder.http6;
            this.https = builder.https;
            this.https6 = builder.https6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolveSummary create() {
            return builder().build();
        }

        /**
         * @return http
         */
        public Long getHttp() {
            return this.http;
        }

        /**
         * @return http6
         */
        public Long getHttp6() {
            return this.http6;
        }

        /**
         * @return https
         */
        public Long getHttps() {
            return this.https;
        }

        /**
         * @return https6
         */
        public Long getHttps6() {
            return this.https6;
        }

        public static final class Builder {
            private Long http; 
            private Long http6; 
            private Long https; 
            private Long https6; 

            /**
             * Http.
             */
            public Builder http(Long http) {
                this.http = http;
                return this;
            }

            /**
             * Http6.
             */
            public Builder http6(Long http6) {
                this.http6 = http6;
                return this;
            }

            /**
             * Https.
             */
            public Builder https(Long https) {
                this.https = https;
                return this;
            }

            /**
             * Https6.
             */
            public Builder https6(Long https6) {
                this.https6 = https6;
                return this;
            }

            public ResolveSummary build() {
                return new ResolveSummary(this);
            } 

        } 

    }
}
