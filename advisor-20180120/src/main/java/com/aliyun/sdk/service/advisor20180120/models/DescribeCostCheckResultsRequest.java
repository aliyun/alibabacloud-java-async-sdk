// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeCostCheckResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostCheckResultsRequest</p>
 */
public class DescribeCostCheckResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunIdList")
    private java.util.List<Long> assumeAliyunIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<String> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private Integer severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private java.util.List<String> tagKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<TagList> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List<String> tagValues;

    private DescribeCostCheckResultsRequest(Builder builder) {
        super(builder);
        this.assumeAliyunIdList = builder.assumeAliyunIdList;
        this.checkIds = builder.checkIds;
        this.groupBy = builder.groupBy;
        this.product = builder.product;
        this.regionIds = builder.regionIds;
        this.resourceIds = builder.resourceIds;
        this.resourceName = builder.resourceName;
        this.severity = builder.severity;
        this.tagKeys = builder.tagKeys;
        this.tagList = builder.tagList;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostCheckResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunIdList
     */
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    /**
     * @return checkIds
     */
    public java.util.List<String> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionIds
     */
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * @return tagKeys
     */
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return tagList
     */
    public java.util.List<TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return tagValues
     */
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public static final class Builder extends Request.Builder<DescribeCostCheckResultsRequest, Builder> {
        private java.util.List<Long> assumeAliyunIdList; 
        private java.util.List<String> checkIds; 
        private String groupBy; 
        private String product; 
        private java.util.List<String> regionIds; 
        private java.util.List<String> resourceIds; 
        private String resourceName; 
        private Integer severity; 
        private java.util.List<String> tagKeys; 
        private java.util.List<TagList> tagList; 
        private java.util.List<String> tagValues; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostCheckResultsRequest request) {
            super(request);
            this.assumeAliyunIdList = request.assumeAliyunIdList;
            this.checkIds = request.checkIds;
            this.groupBy = request.groupBy;
            this.product = request.product;
            this.regionIds = request.regionIds;
            this.resourceIds = request.resourceIds;
            this.resourceName = request.resourceName;
            this.severity = request.severity;
            this.tagKeys = request.tagKeys;
            this.tagList = request.tagList;
            this.tagValues = request.tagValues;
        } 

        /**
         * AssumeAliyunIdList.
         */
        public Builder assumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
            String assumeAliyunIdListShrink = shrink(assumeAliyunIdList, "AssumeAliyunIdList", "json");
            this.putQueryParameter("AssumeAliyunIdList", assumeAliyunIdListShrink);
            this.assumeAliyunIdList = assumeAliyunIdList;
            return this;
        }

        /**
         * CheckIds.
         */
        public Builder checkIds(java.util.List<String> checkIds) {
            String checkIdsShrink = shrink(checkIds, "CheckIds", "json");
            this.putQueryParameter("CheckIds", checkIdsShrink);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "json");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * TagKeys.
         */
        public Builder tagKeys(java.util.List<String> tagKeys) {
            String tagKeysShrink = shrink(tagKeys, "TagKeys", "json");
            this.putQueryParameter("TagKeys", tagKeysShrink);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(java.util.List<TagList> tagList) {
            String tagListShrink = shrink(tagList, "TagList", "json");
            this.putQueryParameter("TagList", tagListShrink);
            this.tagList = tagList;
            return this;
        }

        /**
         * TagValues.
         */
        public Builder tagValues(java.util.List<String> tagValues) {
            String tagValuesShrink = shrink(tagValues, "TagValues", "json");
            this.putQueryParameter("TagValues", tagValuesShrink);
            this.tagValues = tagValues;
            return this;
        }

        @Override
        public DescribeCostCheckResultsRequest build() {
            return new DescribeCostCheckResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCostCheckResultsRequest} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckResultsRequest</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private java.util.List<String> tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private java.util.List<String> tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(java.util.List<String> tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
