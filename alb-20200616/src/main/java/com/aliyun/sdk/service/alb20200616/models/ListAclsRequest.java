// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclsRequest} extends {@link RequestModel}
 *
 * <p>ListAclsRequest</p>
 */
public class ListAclsRequest extends Request {
    @Query
    @NameInMap("AclIds")
    private java.util.List < String > aclIds;

    @Query
    @NameInMap("AclNames")
    private java.util.List < String > aclNames;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListAclsRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.aclNames = builder.aclNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    /**
     * @return aclNames
     */
    public java.util.List < String > getAclNames() {
        return this.aclNames;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListAclsRequest, Builder> {
        private java.util.List < String > aclIds; 
        private java.util.List < String > aclNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListAclsRequest request) {
            super(request);
            this.aclIds = request.aclIds;
            this.aclNames = request.aclNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * The ACL IDs.
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * The ACL names. You can specify up to 10 ACL names in each request.
         */
        public Builder aclNames(java.util.List < String > aclNames) {
            this.putQueryParameter("AclNames", aclNames);
            this.aclNames = aclNames;
            return this;
        }

        /**
         * The maximum number of entries to return. This parameter is optional. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The resource group ID. You can filter the results based on the specified ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListAclsRequest build() {
            return new ListAclsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
