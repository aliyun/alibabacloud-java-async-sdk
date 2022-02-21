// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStacksRequest} extends {@link RequestModel}
 *
 * <p>DescribeStacksRequest</p>
 */
public class DescribeStacksRequest extends Request {
    @Query
    @NameInMap("CategoryName")
    private String categoryName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RecommendedOnly")
    private Boolean recommendedOnly;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeStacksRequest(Builder builder) {
        super(builder);
        this.categoryName = builder.categoryName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recommendedOnly = builder.recommendedOnly;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStacksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
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
     * @return recommendedOnly
     */
    public Boolean getRecommendedOnly() {
        return this.recommendedOnly;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeStacksRequest, Builder> {
        private String categoryName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean recommendedOnly; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStacksRequest response) {
            super(response);
            this.categoryName = response.categoryName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.recommendedOnly = response.recommendedOnly;
            this.regionId = response.regionId;
        } 

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
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
         * RecommendedOnly.
         */
        public Builder recommendedOnly(Boolean recommendedOnly) {
            this.putQueryParameter("RecommendedOnly", recommendedOnly);
            this.recommendedOnly = recommendedOnly;
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
        public DescribeStacksRequest build() {
            return new DescribeStacksRequest(this);
        } 

    } 

}
