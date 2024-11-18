// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceSharesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceSharesRequest</p>
 */
public class ListResourceSharesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionName")
    private String permissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareName")
    private String resourceShareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareStatus")
    private String resourceShareStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListResourceSharesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.permissionName = builder.permissionName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareIds = builder.resourceShareIds;
        this.resourceShareName = builder.resourceShareName;
        this.resourceShareStatus = builder.resourceShareStatus;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return permissionName
     */
    public String getPermissionName() {
        return this.permissionName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwner
     */
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return resourceShareIds
     */
    public java.util.List < String > getResourceShareIds() {
        return this.resourceShareIds;
    }

    /**
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * @return resourceShareStatus
     */
    public String getResourceShareStatus() {
        return this.resourceShareStatus;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListResourceSharesRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String permissionName; 
        private String resourceGroupId; 
        private String resourceOwner; 
        private java.util.List < String > resourceShareIds; 
        private String resourceShareName; 
        private String resourceShareStatus; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceSharesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.permissionName = request.permissionName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareIds = request.resourceShareIds;
            this.resourceShareName = request.resourceShareName;
            this.resourceShareStatus = request.resourceShareStatus;
            this.tag = request.tag;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the permission. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunRSDefaultPermissionVSwitch</p>
         */
        public Builder permissionName(String permissionName) {
            this.putQueryParameter("PermissionName", permissionName);
            this.permissionName = permissionName;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The owner of the resource shares. Valid values:</p>
         * <ul>
         * <li>Self: the current account</li>
         * <li>OtherAccounts: an account other than the current account</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Self</p>
         */
        public Builder resourceOwner(String resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The ID of a resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-PqysnzIj****</p>
         */
        public Builder resourceShareIds(java.util.List < String > resourceShareIds) {
            this.putQueryParameter("ResourceShareIds", resourceShareIds);
            this.resourceShareIds = resourceShareIds;
            return this;
        }

        /**
         * <p>The name of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceShareName(String resourceShareName) {
            this.putQueryParameter("ResourceShareName", resourceShareName);
            this.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * <p>The status of the resource share. Valid values:</p>
         * <ul>
         * <li>Active: The resource share is enabled.</li>
         * <li>Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</li>
         * <li>Deleting: The resource share is being deleted.</li>
         * <li>Deleted: The resource share is deleted.</li>
         * </ul>
         * <blockquote>
         * <p> The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder resourceShareStatus(String resourceShareStatus) {
            this.putQueryParameter("ResourceShareStatus", resourceShareStatus);
            this.resourceShareStatus = resourceShareStatus;
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
        public ListResourceSharesRequest build() {
            return new ListResourceSharesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceSharesRequest} extends {@link TeaModel}
     *
     * <p>ListResourceSharesRequest</p>
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
