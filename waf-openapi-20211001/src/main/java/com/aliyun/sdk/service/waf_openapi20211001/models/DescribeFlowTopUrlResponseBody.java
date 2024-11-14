// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFlowTopUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowTopUrlResponseBody</p>
 */
public class DescribeFlowTopUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopUrl")
    private java.util.List < RuleHitsTopUrl> ruleHitsTopUrl;

    private DescribeFlowTopUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopUrl = builder.ruleHitsTopUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowTopUrlResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>520D4E4C-B8EC-5602-ACB6-4D378ACBA28D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 URLs that are used to initiate requests.</p>
         */
        public Builder ruleHitsTopUrl(java.util.List < RuleHitsTopUrl> ruleHitsTopUrl) {
            this.ruleHitsTopUrl = ruleHitsTopUrl;
            return this;
        }

        public DescribeFlowTopUrlResponseBody build() {
            return new DescribeFlowTopUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowTopUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowTopUrlResponseBody</p>
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
             * <p>The total number of requests that are initiated by using the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>181174784</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The URL that is used to initiate requests.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com/path1">www.aliyundoc.com/path1</a></p>
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
