// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeRuleHitsTopUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopUrlResponseBody</p>
 */
public class DescribeRuleHitsTopUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopUrl")
    private java.util.List<RuleHitsTopUrl> ruleHitsTopUrl;

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
    public java.util.List<RuleHitsTopUrl> getRuleHitsTopUrl() {
        return this.ruleHitsTopUrl;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleHitsTopUrl> ruleHitsTopUrl; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3D8AF43B-08EB-51CE-B33A-93AA****9B0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The top 10 URLs that match protection rules.</p>
         */
        public Builder ruleHitsTopUrl(java.util.List<RuleHitsTopUrl> ruleHitsTopUrl) {
            this.ruleHitsTopUrl = ruleHitsTopUrl;
            return this;
        }

        public DescribeRuleHitsTopUrlResponseBody build() {
            return new DescribeRuleHitsTopUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleHitsTopUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleHitsTopUrlResponseBody</p>
     */
    public static class RuleHitsTopUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The number of requests that match protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>21862</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The request URL.</p>
             * <blockquote>
             * <p> The value is Base64-encoded.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d3d3LmFsaXl1bmRvYy5jb20vcGF0aDM=</p>
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
