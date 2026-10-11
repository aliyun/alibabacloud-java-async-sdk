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
 * {@link ListEgressProxyGatewaysRequest} extends {@link RequestModel}
 *
 * <p>ListEgressProxyGatewaysRequest</p>
 */
public class ListEgressProxyGatewaysRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationIds")
    private java.util.List<String> egressProxyConfigurationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayIds")
    private java.util.List<String> egressProxyGatewayIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayNames")
    private java.util.List<String> egressProxyGatewayNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcIds")
    private java.util.List<String> vpcIds;

    private ListEgressProxyGatewaysRequest(Builder builder) {
        super(builder);
        this.egressProxyConfigurationIds = builder.egressProxyConfigurationIds;
        this.egressProxyGatewayIds = builder.egressProxyGatewayIds;
        this.egressProxyGatewayNames = builder.egressProxyGatewayNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.skip = builder.skip;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyGatewaysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyConfigurationIds
     */
    public java.util.List<String> getEgressProxyConfigurationIds() {
        return this.egressProxyConfigurationIds;
    }

    /**
     * @return egressProxyGatewayIds
     */
    public java.util.List<String> getEgressProxyGatewayIds() {
        return this.egressProxyGatewayIds;
    }

    /**
     * @return egressProxyGatewayNames
     */
    public java.util.List<String> getEgressProxyGatewayNames() {
        return this.egressProxyGatewayNames;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return vpcIds
     */
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public static final class Builder extends Request.Builder<ListEgressProxyGatewaysRequest, Builder> {
        private java.util.List<String> egressProxyConfigurationIds; 
        private java.util.List<String> egressProxyGatewayIds; 
        private java.util.List<String> egressProxyGatewayNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private Integer skip; 
        private String status; 
        private java.util.List<Tag> tag; 
        private java.util.List<String> vpcIds; 

        private Builder() {
            super();
        } 

        private Builder(ListEgressProxyGatewaysRequest request) {
            super(request);
            this.egressProxyConfigurationIds = request.egressProxyConfigurationIds;
            this.egressProxyGatewayIds = request.egressProxyGatewayIds;
            this.egressProxyGatewayNames = request.egressProxyGatewayNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.skip = request.skip;
            this.status = request.status;
            this.tag = request.tag;
            this.vpcIds = request.vpcIds;
        } 

        /**
         * EgressProxyConfigurationIds.
         */
        public Builder egressProxyConfigurationIds(java.util.List<String> egressProxyConfigurationIds) {
            this.putBodyParameter("EgressProxyConfigurationIds", egressProxyConfigurationIds);
            this.egressProxyConfigurationIds = egressProxyConfigurationIds;
            return this;
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
         * EgressProxyGatewayNames.
         */
        public Builder egressProxyGatewayNames(java.util.List<String> egressProxyGatewayNames) {
            this.putBodyParameter("EgressProxyGatewayNames", egressProxyGatewayNames);
            this.egressProxyGatewayNames = egressProxyGatewayNames;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * VpcIds.
         */
        public Builder vpcIds(java.util.List<String> vpcIds) {
            this.putBodyParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        @Override
        public ListEgressProxyGatewaysRequest build() {
            return new ListEgressProxyGatewaysRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyGatewaysRequest} extends {@link TeaModel}
     *
     * <p>ListEgressProxyGatewaysRequest</p>
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
