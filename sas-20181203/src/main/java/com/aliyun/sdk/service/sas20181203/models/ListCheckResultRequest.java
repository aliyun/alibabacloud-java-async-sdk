// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckResultRequest} extends {@link RequestModel}
 *
 * <p>ListCheckResultRequest</p>
 */
public class ListCheckResultRequest extends Request {
    @Query
    @NameInMap("CheckKey")
    private String checkKey;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RequirementIds")
    private java.util.List < Long > requirementIds;

    @Query
    @NameInMap("RiskLevels")
    private java.util.List < String > riskLevels;

    @Query
    @NameInMap("SortTypes")
    private java.util.List < String > sortTypes;

    @Query
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    @Query
    @NameInMap("Vendors")
    private java.util.List < String > vendors;

    private ListCheckResultRequest(Builder builder) {
        super(builder);
        this.checkKey = builder.checkKey;
        this.currentPage = builder.currentPage;
        this.instanceIds = builder.instanceIds;
        this.instanceTypes = builder.instanceTypes;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.requirementIds = builder.requirementIds;
        this.riskLevels = builder.riskLevels;
        this.sortTypes = builder.sortTypes;
        this.standardIds = builder.standardIds;
        this.statuses = builder.statuses;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkKey
     */
    public String getCheckKey() {
        return this.checkKey;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requirementIds
     */
    public java.util.List < Long > getRequirementIds() {
        return this.requirementIds;
    }

    /**
     * @return riskLevels
     */
    public java.util.List < String > getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return sortTypes
     */
    public java.util.List < String > getSortTypes() {
        return this.sortTypes;
    }

    /**
     * @return standardIds
     */
    public java.util.List < Long > getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return vendors
     */
    public java.util.List < String > getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<ListCheckResultRequest, Builder> {
        private String checkKey; 
        private Integer currentPage; 
        private java.util.List < String > instanceIds; 
        private java.util.List < String > instanceTypes; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < Long > requirementIds; 
        private java.util.List < String > riskLevels; 
        private java.util.List < String > sortTypes; 
        private java.util.List < Long > standardIds; 
        private java.util.List < String > statuses; 
        private java.util.List < String > vendors; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckResultRequest request) {
            super(request);
            this.checkKey = request.checkKey;
            this.currentPage = request.currentPage;
            this.instanceIds = request.instanceIds;
            this.instanceTypes = request.instanceTypes;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.requirementIds = request.requirementIds;
            this.riskLevels = request.riskLevels;
            this.sortTypes = request.sortTypes;
            this.standardIds = request.standardIds;
            this.statuses = request.statuses;
            this.vendors = request.vendors;
        } 

        /**
         * CheckKey.
         */
        public Builder checkKey(String checkKey) {
            this.putQueryParameter("CheckKey", checkKey);
            this.checkKey = checkKey;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * RequirementIds.
         */
        public Builder requirementIds(java.util.List < Long > requirementIds) {
            this.putQueryParameter("RequirementIds", requirementIds);
            this.requirementIds = requirementIds;
            return this;
        }

        /**
         * RiskLevels.
         */
        public Builder riskLevels(java.util.List < String > riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * SortTypes.
         */
        public Builder sortTypes(java.util.List < String > sortTypes) {
            this.putQueryParameter("SortTypes", sortTypes);
            this.sortTypes = sortTypes;
            return this;
        }

        /**
         * StandardIds.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * Vendors.
         */
        public Builder vendors(java.util.List < String > vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public ListCheckResultRequest build() {
            return new ListCheckResultRequest(this);
        } 

    } 

}
