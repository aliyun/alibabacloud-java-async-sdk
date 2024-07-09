// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeZonesRequest</p>
 */
public class DescribeZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryRegionId")
    private String queryRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryVpcId")
    private String queryVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTag")
    private java.util.List < ResourceTag> resourceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneTag")
    private java.util.List < String > zoneTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneType")
    private String zoneType;

    private DescribeZonesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryRegionId = builder.queryRegionId;
        this.queryVpcId = builder.queryVpcId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceTag = builder.resourceTag;
        this.searchMode = builder.searchMode;
        this.zoneTag = builder.zoneTag;
        this.zoneType = builder.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return queryRegionId
     */
    public String getQueryRegionId() {
        return this.queryRegionId;
    }

    /**
     * @return queryVpcId
     */
    public String getQueryVpcId() {
        return this.queryVpcId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceTag
     */
    public java.util.List < ResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return zoneTag
     */
    public java.util.List < String > getZoneTag() {
        return this.zoneTag;
    }

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
    }

    public static final class Builder extends Request.Builder<DescribeZonesRequest, Builder> {
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryRegionId; 
        private String queryVpcId; 
        private String resourceGroupId; 
        private java.util.List < ResourceTag> resourceTag; 
        private String searchMode; 
        private java.util.List < String > zoneTag; 
        private String zoneType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryRegionId = request.queryRegionId;
            this.queryVpcId = request.queryVpcId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceTag = request.resourceTag;
            this.searchMode = request.searchMode;
            this.zoneTag = request.zoneTag;
            this.zoneType = request.zoneType;
        } 

        /**
         * The keyword of the zone name. The search is performed in the %KeyWord % mode and is not case-sensitive.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder queryRegionId(String queryRegionId) {
            this.putQueryParameter("QueryRegionId", queryRegionId);
            this.queryRegionId = queryRegionId;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID.
         */
        public Builder queryVpcId(String queryVpcId) {
            this.putQueryParameter("QueryVpcId", queryVpcId);
            this.queryVpcId = queryVpcId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tag added to the resource.
         */
        public Builder resourceTag(java.util.List < ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * The search mode. Valid values:
         * <p>
         * 
         * *   **LIKE (default)**: fuzzy search
         * *   **EXACT**: exact search
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * The type of the cloud service.
         */
        public Builder zoneTag(java.util.List < String > zoneTag) {
            this.putQueryParameter("ZoneTag", zoneTag);
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * The type of zones to query. Default value: AUTH_ZONE.
         * <p>
         * 
         * Valid values:
         * 
         * *   **AUTH_ZONE**: authoritative zone
         * *   **CLOUD_PRODUCT_ZONE**: authoritative zone for cloud services
         */
        public Builder zoneType(String zoneType) {
            this.putQueryParameter("ZoneType", zoneType);
            this.zoneType = zoneType;
            return this;
        }

        @Override
        public DescribeZonesRequest build() {
            return new DescribeZonesRequest(this);
        } 

    } 

    public static class ResourceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResourceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTag create() {
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
             * The key of tag N added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTag build() {
                return new ResourceTag(this);
            } 

        } 

    }
}
