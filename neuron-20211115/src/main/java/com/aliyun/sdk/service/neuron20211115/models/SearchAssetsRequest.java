// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link SearchAssetsRequest} extends {@link RequestModel}
 *
 * <p>SearchAssetsRequest</p>
 */
public class SearchAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("assetIndustrys")
    private java.util.List<String> assetIndustrys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("assetName")
    private String assetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("assetTypes")
    private java.util.List<String> assetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private SearchAssetsRequest(Builder builder) {
        super(builder);
        this.assetIndustrys = builder.assetIndustrys;
        this.assetName = builder.assetName;
        this.assetTypes = builder.assetTypes;
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetIndustrys
     */
    public java.util.List<String> getAssetIndustrys() {
        return this.assetIndustrys;
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * @return assetTypes
     */
    public java.util.List<String> getAssetTypes() {
        return this.assetTypes;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
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

    public static final class Builder extends Request.Builder<SearchAssetsRequest, Builder> {
        private java.util.List<String> assetIndustrys; 
        private String assetName; 
        private java.util.List<String> assetTypes; 
        private Long companyId; 
        private Long marketId; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(SearchAssetsRequest request) {
            super(request);
            this.assetIndustrys = request.assetIndustrys;
            this.assetName = request.assetName;
            this.assetTypes = request.assetTypes;
            this.companyId = request.companyId;
            this.marketId = request.marketId;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * assetIndustrys.
         */
        public Builder assetIndustrys(java.util.List<String> assetIndustrys) {
            String assetIndustrysShrink = shrink(assetIndustrys, "assetIndustrys", "json");
            this.putQueryParameter("assetIndustrys", assetIndustrysShrink);
            this.assetIndustrys = assetIndustrys;
            return this;
        }

        /**
         * assetName.
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("assetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * assetTypes.
         */
        public Builder assetTypes(java.util.List<String> assetTypes) {
            String assetTypesShrink = shrink(assetTypes, "assetTypes", "json");
            this.putQueryParameter("assetTypes", assetTypesShrink);
            this.assetTypes = assetTypes;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public SearchAssetsRequest build() {
            return new SearchAssetsRequest(this);
        } 

    } 

}
