// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopUrlResponseBody</p>
 */
public class DescribeRuleHitsTopUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHitsTopUrl")
    private java.util.List < RuleHitsTopUrl> ruleHitsTopUrl;

    private DescribeRuleHitsTopUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopUrl = builder.ruleHitsTopUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopUrl
     */
    public java.util.List < RuleHitsTopUrl> getRuleHitsTopUrl() {
        return this.ruleHitsTopUrl;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopUrl> ruleHitsTopUrl; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of the top 10 URLs that trigger protection rules.
         */
        public Builder ruleHitsTopUrl(java.util.List < RuleHitsTopUrl> ruleHitsTopUrl) {
            this.ruleHitsTopUrl = ruleHitsTopUrl;
            return this;
        }

        public DescribeRuleHitsTopUrlResponseBody build() {
            return new DescribeRuleHitsTopUrlResponseBody(this);
        } 

    } 

    public static class RuleHitsTopUrl extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Url")
        private String url;

        private RuleHitsTopUrl(Builder builder) {
            this.count = builder.count;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopUrl create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long count; 
            private String url; 

            /**
             * The number of requests from the URL that match protection rules.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The request URL.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RuleHitsTopUrl build() {
                return new RuleHitsTopUrl(this);
            } 

        } 

    }
}
