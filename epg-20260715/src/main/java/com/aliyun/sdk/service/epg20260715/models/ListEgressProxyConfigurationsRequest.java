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
 * {@link ListEgressProxyConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>ListEgressProxyConfigurationsRequest</p>
 */
public class ListEgressProxyConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationIds")
    private java.util.List<String> egressProxyConfigurationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationNames")
    private java.util.List<String> egressProxyConfigurationNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
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

    private ListEgressProxyConfigurationsRequest(Builder builder) {
        super(builder);
        this.egressProxyConfigurationIds = builder.egressProxyConfigurationIds;
        this.egressProxyConfigurationNames = builder.egressProxyConfigurationNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.skip = builder.skip;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyConfigurationsRequest create() {
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
     * @return egressProxyConfigurationNames
     */
    public java.util.List<String> getEgressProxyConfigurationNames() {
        return this.egressProxyConfigurationNames;
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

    public static final class Builder extends Request.Builder<ListEgressProxyConfigurationsRequest, Builder> {
        private java.util.List<String> egressProxyConfigurationIds; 
        private java.util.List<String> egressProxyConfigurationNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private Integer skip; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEgressProxyConfigurationsRequest request) {
            super(request);
            this.egressProxyConfigurationIds = request.egressProxyConfigurationIds;
            this.egressProxyConfigurationNames = request.egressProxyConfigurationNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.skip = request.skip;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * <p>The list of egress proxy configuration IDs.</p>
         */
        public Builder egressProxyConfigurationIds(java.util.List<String> egressProxyConfigurationIds) {
            this.putBodyParameter("EgressProxyConfigurationIds", egressProxyConfigurationIds);
            this.egressProxyConfigurationIds = egressProxyConfigurationIds;
            return this;
        }

        /**
         * <p>The list of egress proxy configuration names.</p>
         */
        public Builder egressProxyConfigurationNames(java.util.List<String> egressProxyConfigurationNames) {
            this.putBodyParameter("EgressProxyConfigurationNames", egressProxyConfigurationNames);
            this.egressProxyConfigurationNames = egressProxyConfigurationNames;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page during paging in a paged query. Valid values: 0 to 1000. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>Leave this parameter empty for the first query or when no next query is required.</li>
         * <li>If a next query is required, set this parameter to the value of NextToken returned from the previous API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4jcyx5e****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of entries to skip during paging in a paged query. The value must be greater than or equal to 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>Filters egress proxy configurations by status. Valid values:</p>
         * <ul>
         * <li><p><strong>Provisioning</strong>: The egress proxy configuration is being created.</p>
         * </li>
         * <li><p><strong>Available</strong>: The egress proxy configuration is available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The specifications of the egress proxy configuration are being changed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEgressProxyConfigurationsRequest build() {
            return new ListEgressProxyConfigurationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyConfigurationsRequest} extends {@link TeaModel}
     *
     * <p>ListEgressProxyConfigurationsRequest</p>
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
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
