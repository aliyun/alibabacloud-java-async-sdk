// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecSuggestionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecSuggestionsResponseBody</p>
 */
public class DescribeApisecSuggestionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecSuggestionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecSuggestionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * <p>The protection suggestions.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecSuggestionsResponseBody build() {
            return new DescribeApisecSuggestionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecSuggestionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecSuggestionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("SuggestId")
        private String suggestId;

        @com.aliyun.core.annotation.NameInMap("SuggestRule")
        private String suggestRule;

        @com.aliyun.core.annotation.NameInMap("SuggestType")
        private String suggestType;

        private Data(Builder builder) {
            this.apiFormat = builder.apiFormat;
            this.matchedHost = builder.matchedHost;
            this.suggestId = builder.suggestId;
            this.suggestRule = builder.suggestRule;
            this.suggestType = builder.suggestType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return suggestId
         */
        public String getSuggestId() {
            return this.suggestId;
        }

        /**
         * @return suggestRule
         */
        public String getSuggestRule() {
            return this.suggestRule;
        }

        /**
         * @return suggestType
         */
        public String getSuggestType() {
            return this.suggestType;
        }

        public static final class Builder {
            private String apiFormat; 
            private String matchedHost; 
            private String suggestId; 
            private String suggestRule; 
            private String suggestType; 

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/apisec/v1/saveinfo</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The domain name or IP address of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>a.aliyun.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>The rule ID of the protection suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>15060a1f8fed40130b7c4a7bf8d8733b</p>
             */
            public Builder suggestId(String suggestId) {
                this.suggestId = suggestId;
                return this;
            }

            /**
             * <p>The rule content of the protection suggestion. The value is a string that consists of multiple parameters in the JSON format. Valid values:</p>
             * <ul>
             * <li><strong>event_tags</strong>: event type</li>
             * <li><strong>black_iplist</strong>: IP address blacklist</li>
             * <li><strong>ip_baseline</strong>: IP address</li>
             * <li><strong>freq_baseline</strong>: throttling frequency</li>
             * <li><strong>client_id_baseline</strong>: client information</li>
             * <li><strong>country_baseline</strong>: country information</li>
             * <li><strong>province_baseline</strong>: province information</li>
             * <li><strong>sensitive_type</strong>: sensitive information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;rule&quot;: &quot;ClientRule&quot;,
             *     &quot;client_id_baseline&quot;: [&quot;Edge&quot;]
             * }</p>
             */
            public Builder suggestRule(String suggestRule) {
                this.suggestRule = suggestRule;
                return this;
            }

            /**
             * <p>The rule type of the protection suggestion. Valid values:</p>
             * <ul>
             * <li><strong>BotRule</strong>: bot management rules</li>
             * <li><strong>BlackIPRule</strong>: IP address blacklist rules</li>
             * <li><strong>WhiteIPRule</strong>: IP address whitelist rules</li>
             * <li><strong>RateLimitRule</strong>: throttling rules</li>
             * <li><strong>ClientRule</strong>: client rules</li>
             * <li><strong>GeoRule</strong>: region-related rules</li>
             * <li><strong>SensitiveRule</strong>: sensitive information rules</li>
             * <li><strong>UnauthRule</strong>: authentication rules</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WhiteIPRule</p>
             */
            public Builder suggestType(String suggestType) {
                this.suggestType = suggestType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
