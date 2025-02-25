// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListListenersRequest} extends {@link RequestModel}
 *
 * <p>ListListenersRequest</p>
 */
public class ListListenersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerIds")
    private java.util.List<String> listenerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private java.util.List<String> loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListListenersRequest(Builder builder) {
        super(builder);
        this.listenerIds = builder.listenerIds;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerIds
     */
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List<String> getLoadBalancerIds() {
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListListenersRequest, Builder> {
        private java.util.List<String> listenerIds; 
        private String listenerProtocol; 
        private java.util.List<String> loadBalancerIds; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListListenersRequest request) {
            super(request);
            this.listenerIds = request.listenerIds;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalancerIds = request.loadBalancerIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The listener IDs. You can specify at most 20 listener IDs.</p>
         */
        public Builder listenerIds(java.util.List<String> listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * <p>The listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>QUIC</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The ALB instance ID. You can specify at most 20 instance IDs.</p>
         */
        public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. This parameter is optional. Valid values: <strong>1 to 100</strong>. If you do not specify this parameter, the default value <strong>20</strong> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>If a value is returned for NextToken, you must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListListenersRequest build() {
            return new ListListenersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersRequest} extends {@link TeaModel}
     *
     * <p>ListListenersRequest</p>
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
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
