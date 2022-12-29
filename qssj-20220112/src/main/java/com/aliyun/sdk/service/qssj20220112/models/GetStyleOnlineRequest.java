// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleOnlineRequest} extends {@link RequestModel}
 *
 * <p>GetStyleOnlineRequest</p>
 */
public class GetStyleOnlineRequest extends Request {
    @Query
    @NameInMap("BrandNames")
    private String brandNames;

    @Query
    @NameInMap("CateIds")
    private String cateIds;

    @Query
    @NameInMap("EndingDate")
    private String endingDate;

    @Query
    @NameInMap("PageIndex")
    private Long pageIndex;

    @Query
    @NameInMap("ShopIds")
    private String shopIds;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private GetStyleOnlineRequest(Builder builder) {
        super(builder);
        this.brandNames = builder.brandNames;
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.pageIndex = builder.pageIndex;
        this.shopIds = builder.shopIds;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStyleOnlineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandNames
     */
    public String getBrandNames() {
        return this.brandNames;
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    /**
     * @return endingDate
     */
    public String getEndingDate() {
        return this.endingDate;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return shopIds
     */
    public String getShopIds() {
        return this.shopIds;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetStyleOnlineRequest, Builder> {
        private String brandNames; 
        private String cateIds; 
        private String endingDate; 
        private Long pageIndex; 
        private String shopIds; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetStyleOnlineRequest request) {
            super(request);
            this.brandNames = request.brandNames;
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.pageIndex = request.pageIndex;
            this.shopIds = request.shopIds;
            this.startDate = request.startDate;
        } 

        /**
         * BrandNames.
         */
        public Builder brandNames(String brandNames) {
            this.putQueryParameter("BrandNames", brandNames);
            this.brandNames = brandNames;
            return this;
        }

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * EndingDate.
         */
        public Builder endingDate(String endingDate) {
            this.putQueryParameter("EndingDate", endingDate);
            this.endingDate = endingDate;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * ShopIds.
         */
        public Builder shopIds(String shopIds) {
            this.putQueryParameter("ShopIds", shopIds);
            this.shopIds = shopIds;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetStyleOnlineRequest build() {
            return new GetStyleOnlineRequest(this);
        } 

    } 

}
