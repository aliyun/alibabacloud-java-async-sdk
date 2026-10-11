// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link ListEgressProxyIpPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListEgressProxyIpPoolsRequest</p>
 */
public class ListEgressProxyIpPoolsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayIds")
    private java.util.List<String> egressProxyGatewayIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolIds")
    private java.util.List<String> egressProxyIpPoolIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolNames")
    private java.util.List<String> egressProxyIpPoolNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListEgressProxyIpPoolsRequest(Builder builder) {
        super(builder);
        this.egressProxyGatewayIds = builder.egressProxyGatewayIds;
        this.egressProxyIpPoolIds = builder.egressProxyIpPoolIds;
        this.egressProxyIpPoolNames = builder.egressProxyIpPoolNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyIpPoolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyGatewayIds
     */
    public java.util.List<String> getEgressProxyGatewayIds() {
        return this.egressProxyGatewayIds;
    }

    /**
     * @return egressProxyIpPoolIds
     */
    public java.util.List<String> getEgressProxyIpPoolIds() {
        return this.egressProxyIpPoolIds;
    }

    /**
     * @return egressProxyIpPoolNames
     */
    public java.util.List<String> getEgressProxyIpPoolNames() {
        return this.egressProxyIpPoolNames;
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListEgressProxyIpPoolsRequest, Builder> {
        private java.util.List<String> egressProxyGatewayIds; 
        private java.util.List<String> egressProxyIpPoolIds; 
        private java.util.List<String> egressProxyIpPoolNames; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEgressProxyIpPoolsRequest request) {
            super(request);
            this.egressProxyGatewayIds = request.egressProxyGatewayIds;
            this.egressProxyIpPoolIds = request.egressProxyIpPoolIds;
            this.egressProxyIpPoolNames = request.egressProxyIpPoolNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * EgressProxyGatewayIds.
         */
        public Builder egressProxyGatewayIds(java.util.List<String> egressProxyGatewayIds) {
            this.putBodyParameter("EgressProxyGatewayIds", egressProxyGatewayIds);
            this.egressProxyGatewayIds = egressProxyGatewayIds;
            return this;
        }

        /**
         * EgressProxyIpPoolIds.
         */
        public Builder egressProxyIpPoolIds(java.util.List<String> egressProxyIpPoolIds) {
            this.putBodyParameter("EgressProxyIpPoolIds", egressProxyIpPoolIds);
            this.egressProxyIpPoolIds = egressProxyIpPoolIds;
            return this;
        }

        /**
         * EgressProxyIpPoolNames.
         */
        public Builder egressProxyIpPoolNames(java.util.List<String> egressProxyIpPoolNames) {
            this.putBodyParameter("EgressProxyIpPoolNames", egressProxyIpPoolNames);
            this.egressProxyIpPoolNames = egressProxyIpPoolNames;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Skip.
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEgressProxyIpPoolsRequest build() {
            return new ListEgressProxyIpPoolsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyIpPoolsRequest} extends {@link TeaModel}
     *
     * <p>ListEgressProxyIpPoolsRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
