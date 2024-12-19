// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcePrincipalName")
    private java.util.List<String> resourcePrincipalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
        this.resourcePrincipalName = builder.resourcePrincipalName;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourcePrincipalName
     */
    public java.util.List<String> getResourcePrincipalName() {
        return this.resourcePrincipalName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String nextToken; 
        private Integer pageSize; 
        private java.util.List<String> resourceId; 
        private java.util.List<String> resourcePrincipalName; 
        private String resourceType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.resourceId = request.resourceId;
            this.resourcePrincipalName = request.resourcePrincipalName;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
        } 

        /**
         * <p>The token that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. If a response is truncated because it reaches the value of PageSize, the value of IsTruncated will be true. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of resource N.</p>
         * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource ID is the ID of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
         * </blockquote>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of resource N.</p>
         * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource name is the name of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
         * </blockquote>
         */
        public Builder resourcePrincipalName(java.util.List<String> resourcePrincipalName) {
            this.putQueryParameter("ResourcePrincipalName", resourcePrincipalName);
            this.resourcePrincipalName = resourcePrincipalName;
            return this;
        }

        /**
         * <p>The type of the resource. Valid value:</p>
         * <ul>
         * <li>user: a RAM user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tag value.</p>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTagResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListTagResourcesRequest</p>
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
             * <p>The key of tag N.</p>
             * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
             * 
             * <strong>example:</strong>
             * <p>operator</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
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
