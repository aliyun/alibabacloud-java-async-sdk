// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsRequest</p>
 */
public class ListResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtKey")
    private String bizExtKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupType")
    private Integer resourceGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ListResourceGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizExtKey = builder.bizExtKey;
        this.keyword = builder.keyword;
        this.resourceGroupType = builder.resourceGroupType;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsRequest create() {
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
     * @return bizExtKey
     */
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return resourceGroupType
     */
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupsRequest, Builder> {
        private String regionId; 
        private String bizExtKey; 
        private String keyword; 
        private Integer resourceGroupType; 
        private String resourceManagerResourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizExtKey = request.bizExtKey;
            this.keyword = request.keyword;
            this.resourceGroupType = request.resourceGroupType;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The category of the resource group. Valid values:
         * <p>
         * 
         * *   default (default): shared resource group
         * *   single: exclusive resource group
         */
        public Builder bizExtKey(String bizExtKey) {
            this.putQueryParameter("BizExtKey", bizExtKey);
            this.bizExtKey = bizExtKey;
            return this;
        }

        /**
         * The keyword that is used for fuzzy match by resource group name and identifier.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The type of the resource group that you want to query. Valid values:
         * <p>
         * 
         * *   0: DataWorks
         * *   1: scheduling
         * *   2: MaxCompute
         * *   3: Platform for AI (PAI)
         * *   4: Data Integration
         * *   7: exclusive resource group for scheduling (An ID is generated for the purchased resource when you purchase an exclusive resource group for scheduling.)
         * *   9: DataService Studio
         * *   Default value: 1
         * 
         * If the value indicates a compute engine, the resource groups to query are the ones that were created when you purchased the compute engine.
         */
        public Builder resourceGroupType(Integer resourceGroupType) {
            this.putQueryParameter("ResourceGroupType", resourceGroupType);
            this.resourceGroupType = resourceGroupType;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListResourceGroupsRequest build() {
            return new ListResourceGroupsRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
