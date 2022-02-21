// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataShareInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataShareInstancesRequest</p>
 */
public class DescribeDataShareInstancesRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SearchValue")
    private String searchValue;

    private DescribeDataShareInstancesRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.searchValue = builder.searchValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataShareInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    public static final class Builder extends Request.Builder<DescribeDataShareInstancesRequest, Builder> {
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String searchValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataShareInstancesRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.searchValue = response.searchValue;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchValue.
         */
        public Builder searchValue(String searchValue) {
            this.putQueryParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        @Override
        public DescribeDataShareInstancesRequest build() {
            return new DescribeDataShareInstancesRequest(this);
        } 

    } 

}
