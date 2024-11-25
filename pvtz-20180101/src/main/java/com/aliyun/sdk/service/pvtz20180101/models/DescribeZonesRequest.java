// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The keyword of the zone name. The value is not case-sensitive. You can set SearchMode to LIKE or EXACT. The default value of SearchMode is LIKE.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the virtual private cloud (VPC) associated with the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder queryRegionId(String queryRegionId) {
            this.putQueryParameter("QueryRegionId", queryRegionId);
            this.queryRegionId = queryRegionId;
            return this;
        }

        /**
         * <p>The ID of the VPC associated with the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8zvrvr1payllgz38****</p>
         */
        public Builder queryVpcId(String queryVpcId) {
            this.putQueryParameter("QueryVpcId", queryVpcId);
            this.queryVpcId = queryVpcId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the zone belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz2qj7awz****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags added to the zone.</p>
         */
        public Builder resourceTag(java.util.List < ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * <p>The search mode. The value of Keyword is the search scope. Valid values:</p>
         * <ul>
         * <li><strong>LIKE</strong> (default): fuzzy search</li>
         * <li><strong>EXACT</strong>: exact search</li>
         * </ul>
         * <p>Default value: <strong>LIKE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>LIKE</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>The types of cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p>BLINK</p>
         */
        public Builder zoneTag(java.util.List < String > zoneTag) {
            this.putQueryParameter("ZoneTag", zoneTag);
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * <p>The zone type. Valid values:</p>
         * <ul>
         * <li><strong>AUTH_ZONE</strong>: authoritative zone</li>
         * <li><strong>CLOUD_PRODUCT_ZONE</strong>: authoritative zone for cloud services</li>
         * </ul>
         * <p>Default value: <strong>AUTH_ZONE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_PRODUCT_ZONE</p>
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

    /**
     * 
     * {@link DescribeZonesRequest} extends {@link TeaModel}
     *
     * <p>DescribeZonesRequest</p>
     */
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
             * <p>The key of tag N added to the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>daily</p>
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
