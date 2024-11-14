// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFlowTopResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowTopResourceResponseBody</p>
 */
public class DescribeFlowTopResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopResource")
    private java.util.List < RuleHitsTopResource> ruleHitsTopResource;

    private DescribeFlowTopResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopResource = builder.ruleHitsTopResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowTopResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopResource
     */
    public java.util.List < RuleHitsTopResource> getRuleHitsTopResource() {
        return this.ruleHitsTopResource;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopResource> ruleHitsTopResource; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8F0E0B9A-B518-5C6D-BEFC-A373DDE4F652</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 protected objects that receive requests.</p>
         */
        public Builder ruleHitsTopResource(java.util.List < RuleHitsTopResource> ruleHitsTopResource) {
            this.ruleHitsTopResource = ruleHitsTopResource;
            return this;
        }

        public DescribeFlowTopResourceResponseBody build() {
            return new DescribeFlowTopResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowTopResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowTopResourceResponseBody</p>
     */
    public static class RuleHitsTopResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        private RuleHitsTopResource(Builder builder) {
            this.count = builder.count;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopResource create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private Long count; 
            private String resource; 

            /**
             * <p>The total number of requests received by the protected object in a specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>181174784</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The protected object.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public RuleHitsTopResource build() {
                return new RuleHitsTopResource(this);
            } 

        } 

    }
}
