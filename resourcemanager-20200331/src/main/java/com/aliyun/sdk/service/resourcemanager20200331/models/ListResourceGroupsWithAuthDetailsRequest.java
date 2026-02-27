// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListResourceGroupsWithAuthDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsWithAuthDetailsRequest</p>
 */
public class ListResourceGroupsWithAuthDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeTags")
    private Boolean includeTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List<String> resourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<ResourceTypes> resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListResourceGroupsWithAuthDetailsRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.includeTags = builder.includeTags;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceTypes = builder.resourceTypes;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsWithAuthDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return includeTags
     */
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<ResourceTypes> getResourceTypes() {
        return this.resourceTypes;
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

    public static final class Builder extends Request.Builder<ListResourceGroupsWithAuthDetailsRequest, Builder> {
        private String displayName; 
        private Boolean includeTags; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> resourceGroupIds; 
        private String resourceRegionId; 
        private java.util.List<ResourceTypes> resourceTypes; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsWithAuthDetailsRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.includeTags = request.includeTags;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupIds = request.resourceGroupIds;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceTypes = request.resourceTypes;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * <p>The display name of the resource group. This parameter specifies a filter condition for the query. Fuzzy search is supported.</p>
         * <p>The display name can be a maximum of 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestRG-BVT1</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether to return the information of tags. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * <blockquote>
         * <p> If you set a tag filter condition, the tag information is returned regardless of the <code>IncludeTags</code> value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeTags(Boolean includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * <p>The identifier of the resource group. This parameter specifies a filter condition for the query. Fuzzy search is supported.</p>
         * <p>The identifier can be a maximum of 50 characters in length and can contain letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>prod-rg</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IDs of the resource groups that you want to query.</p>
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * <p>The ID of the region where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>The resource types.</p>
         */
        public Builder resourceTypes(java.util.List<ResourceTypes> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The status of the resource group. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>Creating: The resource group is being created.</li>
         * <li>OK: The resource group is created.</li>
         * <li>PendingDelete: The resource group is waiting to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public ListResourceGroupsWithAuthDetailsRequest build() {
            return new ListResourceGroupsWithAuthDetailsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsRequest} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsRequest</p>
     */
    public static class ResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        private ResourceTypes(Builder builder) {
            this.resourceTypeCode = builder.resourceTypeCode;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return resourceTypeCode
         */
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String resourceTypeCode; 
            private String service; 

            private Builder() {
            } 

            private Builder(ResourceTypes model) {
                this.resourceTypeCode = model.resourceTypeCode;
                this.service = model.service;
            } 

            /**
             * <p>The resource type.</p>
             * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The service code.</p>
             * <p>You can obtain the code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsRequest} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsRequest</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
