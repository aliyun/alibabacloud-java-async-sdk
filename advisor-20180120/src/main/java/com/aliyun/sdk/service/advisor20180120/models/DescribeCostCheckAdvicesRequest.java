// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostCheckAdvicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostCheckAdvicesRequest</p>
 */
public class DescribeCostCheckAdvicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunIdList")
    private java.util.List < Long > assumeAliyunIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private java.util.List < String > tagKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List < String > tagValues;

    private DescribeCostCheckAdvicesRequest(Builder builder) {
        super(builder);
        this.assumeAliyunIdList = builder.assumeAliyunIdList;
        this.checkId = builder.checkId;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
        this.resourceIds = builder.resourceIds;
        this.resourceName = builder.resourceName;
        this.severity = builder.severity;
        this.tagKeys = builder.tagKeys;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostCheckAdvicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunIdList
     */
    public java.util.List < Long > getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
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
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return tagValues
     */
    public java.util.List < String > getTagValues() {
        return this.tagValues;
    }

    public static final class Builder extends Request.Builder<DescribeCostCheckAdvicesRequest, Builder> {
        private java.util.List < Long > assumeAliyunIdList; 
        private String checkId; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > regionIds; 
        private java.util.List < String > resourceIds; 
        private String resourceName; 
        private String severity; 
        private java.util.List < String > tagKeys; 
        private java.util.List < String > tagValues; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostCheckAdvicesRequest request) {
            super(request);
            this.assumeAliyunIdList = request.assumeAliyunIdList;
            this.checkId = request.checkId;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionIds = request.regionIds;
            this.resourceIds = request.resourceIds;
            this.resourceName = request.resourceName;
            this.severity = request.severity;
            this.tagKeys = request.tagKeys;
            this.tagValues = request.tagValues;
        } 

        /**
         * AssumeAliyunIdList.
         */
        public Builder assumeAliyunIdList(java.util.List < Long > assumeAliyunIdList) {
            String assumeAliyunIdListShrink = shrink(assumeAliyunIdList, "AssumeAliyunIdList", "json");
            this.putQueryParameter("AssumeAliyunIdList", assumeAliyunIdListShrink);
            this.assumeAliyunIdList = assumeAliyunIdList;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
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
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * TagKeys.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            String tagKeysShrink = shrink(tagKeys, "TagKeys", "json");
            this.putQueryParameter("TagKeys", tagKeysShrink);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * TagValues.
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            String tagValuesShrink = shrink(tagValues, "TagValues", "json");
            this.putQueryParameter("TagValues", tagValuesShrink);
            this.tagValues = tagValues;
            return this;
        }

        @Override
        public DescribeCostCheckAdvicesRequest build() {
            return new DescribeCostCheckAdvicesRequest(this);
        } 

    } 

}
