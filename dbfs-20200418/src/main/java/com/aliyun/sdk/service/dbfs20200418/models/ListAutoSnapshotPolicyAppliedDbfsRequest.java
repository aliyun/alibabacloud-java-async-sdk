// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPolicyAppliedDbfsRequest} extends {@link RequestModel}
 *
 * <p>ListAutoSnapshotPolicyAppliedDbfsRequest</p>
 */
public class ListAutoSnapshotPolicyAppliedDbfsRequest extends Request {
    @Query
    @NameInMap("FilterKey")
    private String filterKey;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListAutoSnapshotPolicyAppliedDbfsRequest(Builder builder) {
        super(builder);
        this.filterKey = builder.filterKey;
        this.filterValue = builder.filterValue;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoSnapshotPolicyAppliedDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterKey
     */
    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAutoSnapshotPolicyAppliedDbfsRequest, Builder> {
        private String filterKey; 
        private String filterValue; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAutoSnapshotPolicyAppliedDbfsRequest request) {
            super(request);
            this.filterKey = request.filterKey;
            this.filterValue = request.filterValue;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * FilterKey.
         */
        public Builder filterKey(String filterKey) {
            this.putQueryParameter("FilterKey", filterKey);
            this.filterKey = filterKey;
            return this;
        }

        /**
         * FilterValue.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
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
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAutoSnapshotPolicyAppliedDbfsRequest build() {
            return new ListAutoSnapshotPolicyAppliedDbfsRequest(this);
        } 

    } 

}
