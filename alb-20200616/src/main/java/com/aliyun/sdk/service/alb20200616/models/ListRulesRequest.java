// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRulesRequest</p>
 */
public class ListRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerIds")
    private java.util.List < String > listenerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private java.util.List < String > loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List < String > ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListRulesRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.listenerIds = builder.listenerIds;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ruleIds = builder.ruleIds;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return listenerIds
     */
    public java.util.List < String > getListenerIds() {
        return this.listenerIds;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List < String > getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ruleIds
     */
    public java.util.List < String > getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListRulesRequest, Builder> {
        private String direction; 
        private java.util.List < String > listenerIds; 
        private java.util.List < String > loadBalancerIds; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > ruleIds; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListRulesRequest request) {
            super(request);
            this.direction = request.direction;
            this.listenerIds = request.listenerIds;
            this.loadBalancerIds = request.loadBalancerIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ruleIds = request.ruleIds;
            this.tag = request.tag;
        } 

        /**
         * <p>The direction to which the forwarding rule is applied. Valid values:</p>
         * <ul>
         * <li><strong>Request</strong> (default): The forwarding rule is applied to the client requests received by ALB.</li>
         * <li><strong>Response</strong>: The forwarding rule is applied to the responses returned by backend servers.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot set this parameter to Response if you use basic ALB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Request</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The listener IDs.</p>
         */
        public Builder listenerIds(java.util.List < String > listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * <p>The Application Load Balancer (ALB) instance IDs.</p>
         */
        public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Valid values: <strong>1 to 100</strong>.</p>
         * <p>Default value: <strong>20</strong>. If you do not specify this parameter, the default value is used.</p>
         * <blockquote>
         * <p>This parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The starting point of the current query. If you do not specify this parameter, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The forwarding rules.</p>
         */
        public Builder ruleIds(java.util.List < String > ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>The tag.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListRulesRequest build() {
            return new ListRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRulesRequest} extends {@link TeaModel}
     *
     * <p>ListRulesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
