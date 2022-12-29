// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStoreSalesVolumeTopRequest} extends {@link RequestModel}
 *
 * <p>GetStoreSalesVolumeTopRequest</p>
 */
public class GetStoreSalesVolumeTopRequest extends Request {
    @Body
    @NameInMap("BrandNames")
    private String brandNames;

    @Body
    @NameInMap("CateIds")
    private String cateIds;

    @Body
    @NameInMap("EndingDate")
    private String endingDate;

    @Body
    @NameInMap("EndingPrice")
    private String endingPrice;

    @Body
    @NameInMap("EndingSalesVolume")
    private String endingSalesVolume;

    @Body
    @NameInMap("PageIndex")
    private Long pageIndex;

    @Body
    @NameInMap("ShopIds")
    private String shopIds;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("StartPrice")
    private String startPrice;

    @Body
    @NameInMap("StartSalesVolume")
    private String startSalesVolume;

    private GetStoreSalesVolumeTopRequest(Builder builder) {
        super(builder);
        this.brandNames = builder.brandNames;
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.endingPrice = builder.endingPrice;
        this.endingSalesVolume = builder.endingSalesVolume;
        this.pageIndex = builder.pageIndex;
        this.shopIds = builder.shopIds;
        this.startDate = builder.startDate;
        this.startPrice = builder.startPrice;
        this.startSalesVolume = builder.startSalesVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreSalesVolumeTopRequest create() {
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
     * @return endingPrice
     */
    public String getEndingPrice() {
        return this.endingPrice;
    }

    /**
     * @return endingSalesVolume
     */
    public String getEndingSalesVolume() {
        return this.endingSalesVolume;
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

    /**
     * @return startPrice
     */
    public String getStartPrice() {
        return this.startPrice;
    }

    /**
     * @return startSalesVolume
     */
    public String getStartSalesVolume() {
        return this.startSalesVolume;
    }

    public static final class Builder extends Request.Builder<GetStoreSalesVolumeTopRequest, Builder> {
        private String brandNames; 
        private String cateIds; 
        private String endingDate; 
        private String endingPrice; 
        private String endingSalesVolume; 
        private Long pageIndex; 
        private String shopIds; 
        private String startDate; 
        private String startPrice; 
        private String startSalesVolume; 

        private Builder() {
            super();
        } 

        private Builder(GetStoreSalesVolumeTopRequest request) {
            super(request);
            this.brandNames = request.brandNames;
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.endingPrice = request.endingPrice;
            this.endingSalesVolume = request.endingSalesVolume;
            this.pageIndex = request.pageIndex;
            this.shopIds = request.shopIds;
            this.startDate = request.startDate;
            this.startPrice = request.startPrice;
            this.startSalesVolume = request.startSalesVolume;
        } 

        /**
         * BrandNames.
         */
        public Builder brandNames(String brandNames) {
            this.putBodyParameter("BrandNames", brandNames);
            this.brandNames = brandNames;
            return this;
        }

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * EndingDate.
         */
        public Builder endingDate(String endingDate) {
            this.putBodyParameter("EndingDate", endingDate);
            this.endingDate = endingDate;
            return this;
        }

        /**
         * EndingPrice.
         */
        public Builder endingPrice(String endingPrice) {
            this.putBodyParameter("EndingPrice", endingPrice);
            this.endingPrice = endingPrice;
            return this;
        }

        /**
         * EndingSalesVolume.
         */
        public Builder endingSalesVolume(String endingSalesVolume) {
            this.putBodyParameter("EndingSalesVolume", endingSalesVolume);
            this.endingSalesVolume = endingSalesVolume;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Long pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * ShopIds.
         */
        public Builder shopIds(String shopIds) {
            this.putBodyParameter("ShopIds", shopIds);
            this.shopIds = shopIds;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * StartPrice.
         */
        public Builder startPrice(String startPrice) {
            this.putBodyParameter("StartPrice", startPrice);
            this.startPrice = startPrice;
            return this;
        }

        /**
         * StartSalesVolume.
         */
        public Builder startSalesVolume(String startSalesVolume) {
            this.putBodyParameter("StartSalesVolume", startSalesVolume);
            this.startSalesVolume = startSalesVolume;
            return this;
        }

        @Override
        public GetStoreSalesVolumeTopRequest build() {
            return new GetStoreSalesVolumeTopRequest(this);
        } 

    } 

}
