// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetResolveCountSummaryResponseBody model) {
            this.requestId = model.requestId;
            this.resolveSummary = model.resolveSummary;
        } 

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

    /**
     * 
     * {@link GetResolveCountSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetResolveCountSummaryResponseBody</p>
     */
    public static class ResolveSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Doh")
        private Long doh;

        @com.aliyun.core.annotation.NameInMap("Http")
        private Long http;

        @com.aliyun.core.annotation.NameInMap("Http6")
        private Long http6;

        @com.aliyun.core.annotation.NameInMap("HttpAes")
        private String httpAes;

        @com.aliyun.core.annotation.NameInMap("Https")
        private Long https;

        @com.aliyun.core.annotation.NameInMap("Https6")
        private Long https6;

        @com.aliyun.core.annotation.NameInMap("HttpsAes")
        private String httpsAes;

        private ResolveSummary(Builder builder) {
            this.doh = builder.doh;
            this.http = builder.http;
            this.http6 = builder.http6;
            this.httpAes = builder.httpAes;
            this.https = builder.https;
            this.https6 = builder.https6;
            this.httpsAes = builder.httpsAes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolveSummary create() {
            return builder().build();
        }

        /**
         * @return doh
         */
        public Long getDoh() {
            return this.doh;
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
         * @return httpAes
         */
        public String getHttpAes() {
            return this.httpAes;
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

        /**
         * @return httpsAes
         */
        public String getHttpsAes() {
            return this.httpsAes;
        }

        public static final class Builder {
            private Long doh; 
            private Long http; 
            private Long http6; 
            private String httpAes; 
            private Long https; 
            private Long https6; 
            private String httpsAes; 

            private Builder() {
            } 

            private Builder(ResolveSummary model) {
                this.doh = model.doh;
                this.http = model.http;
                this.http6 = model.http6;
                this.httpAes = model.httpAes;
                this.https = model.https;
                this.https6 = model.https6;
                this.httpsAes = model.httpsAes;
            } 

            /**
             * Doh.
             */
            public Builder doh(Long doh) {
                this.doh = doh;
                return this;
            }

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
             * HttpAes.
             */
            public Builder httpAes(String httpAes) {
                this.httpAes = httpAes;
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

            /**
             * HttpsAes.
             */
            public Builder httpsAes(String httpsAes) {
                this.httpsAes = httpsAes;
                return this;
            }

            public ResolveSummary build() {
                return new ResolveSummary(this);
            } 

        } 

    }
}
