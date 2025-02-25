// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecSensorEnabled")
    private String secSensorEnabled;

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
        this.regionId = builder.regionId;
        this.secSensorEnabled = builder.secSensorEnabled;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return secSensorEnabled
     */
    public String getSecSensorEnabled() {
        return this.secSensorEnabled;
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
        private String regionId; 
        private String secSensorEnabled; 
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
            this.regionId = request.regionId;
            this.secSensorEnabled = request.secSensorEnabled;
            this.tag = request.tag;
        } 

        /**
         * <p>The listener IDs.</p>
         */
        public Builder listenerIds(java.util.List<String> listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * <p>The listening protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TCPSSL</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The ID of the NLB instance. You can query up to 20 NLB instances at a time.</p>
         */
        public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
         * <li>If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</li>
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
         * <p>The ID of the region where the NLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder secSensorEnabled(String secSensorEnabled) {
            this.putQueryParameter("SecSensorEnabled", secSensorEnabled);
            this.secSensorEnabled = secSensorEnabled;
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
             * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify up to 10 tag values.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
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
