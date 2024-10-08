// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSitesRequest} extends {@link RequestModel}
 *
 * <p>ListSitesRequest</p>
 */
public class ListSitesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coverage")
    private String coverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyEnterprise")
    private Boolean onlyEnterprise;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanSubscribeType")
    private String planSubscribeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteSearchType")
    private String siteSearchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    private java.util.List < TagFilter> tagFilter;

    private ListSitesRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.coverage = builder.coverage;
        this.onlyEnterprise = builder.onlyEnterprise;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planSubscribeType = builder.planSubscribeType;
        this.resourceGroupId = builder.resourceGroupId;
        this.siteName = builder.siteName;
        this.siteSearchType = builder.siteSearchType;
        this.status = builder.status;
        this.tagFilter = builder.tagFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSitesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return onlyEnterprise
     */
    public Boolean getOnlyEnterprise() {
        return this.onlyEnterprise;
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
     * @return planSubscribeType
     */
    public String getPlanSubscribeType() {
        return this.planSubscribeType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return siteSearchType
     */
    public String getSiteSearchType() {
        return this.siteSearchType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagFilter
     */
    public java.util.List < TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static final class Builder extends Request.Builder<ListSitesRequest, Builder> {
        private String accessType; 
        private String coverage; 
        private Boolean onlyEnterprise; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String planSubscribeType; 
        private String resourceGroupId; 
        private String siteName; 
        private String siteSearchType; 
        private String status; 
        private java.util.List < TagFilter> tagFilter; 

        private Builder() {
            super();
        } 

        private Builder(ListSitesRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.coverage = request.coverage;
            this.onlyEnterprise = request.onlyEnterprise;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.planSubscribeType = request.planSubscribeType;
            this.resourceGroupId = request.resourceGroupId;
            this.siteName = request.siteName;
            this.siteSearchType = request.siteSearchType;
            this.status = request.status;
            this.tagFilter = request.tagFilter;
        } 

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * Coverage.
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * OnlyEnterprise.
         */
        public Builder onlyEnterprise(Boolean onlyEnterprise) {
            this.putQueryParameter("OnlyEnterprise", onlyEnterprise);
            this.onlyEnterprise = onlyEnterprise;
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
         * PlanSubscribeType.
         */
        public Builder planSubscribeType(String planSubscribeType) {
            this.putQueryParameter("PlanSubscribeType", planSubscribeType);
            this.planSubscribeType = planSubscribeType;
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
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.putQueryParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        /**
         * SiteSearchType.
         */
        public Builder siteSearchType(String siteSearchType) {
            this.putQueryParameter("SiteSearchType", siteSearchType);
            this.siteSearchType = siteSearchType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagFilter.
         */
        public Builder tagFilter(java.util.List < TagFilter> tagFilter) {
            String tagFilterShrink = shrink(tagFilter, "TagFilter", "json");
            this.putQueryParameter("TagFilter", tagFilterShrink);
            this.tagFilter = tagFilter;
            return this;
        }

        @Override
        public ListSitesRequest build() {
            return new ListSitesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSitesRequest} extends {@link TeaModel}
     *
     * <p>ListSitesRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagFilter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
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

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
