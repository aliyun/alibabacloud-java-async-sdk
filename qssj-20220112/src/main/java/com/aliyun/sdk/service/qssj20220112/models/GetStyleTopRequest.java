// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleTopRequest} extends {@link RequestModel}
 *
 * <p>GetStyleTopRequest</p>
 */
public class GetStyleTopRequest extends Request {
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
    @NameInMap("PageIndex")
    private Long pageIndex;

    @Body
    @NameInMap("ShopIds")
    private String shopIds;

    @Body
    @NameInMap("SortOrder")
    @Validation(required = true)
    private Long sortOrder;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("StartPrice")
    private String startPrice;

    @Body
    @NameInMap("TimeDisplay")
    @Validation(required = true)
    private Long timeDisplay;

    private GetStyleTopRequest(Builder builder) {
        super(builder);
        this.brandNames = builder.brandNames;
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.endingPrice = builder.endingPrice;
        this.pageIndex = builder.pageIndex;
        this.shopIds = builder.shopIds;
        this.sortOrder = builder.sortOrder;
        this.startDate = builder.startDate;
        this.startPrice = builder.startPrice;
        this.timeDisplay = builder.timeDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStyleTopRequest create() {
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
     * @return sortOrder
     */
    public Long getSortOrder() {
        return this.sortOrder;
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
     * @return timeDisplay
     */
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

    public static final class Builder extends Request.Builder<GetStyleTopRequest, Builder> {
        private String brandNames; 
        private String cateIds; 
        private String endingDate; 
        private String endingPrice; 
        private Long pageIndex; 
        private String shopIds; 
        private Long sortOrder; 
        private String startDate; 
        private String startPrice; 
        private Long timeDisplay; 

        private Builder() {
            super();
        } 

        private Builder(GetStyleTopRequest request) {
            super(request);
            this.brandNames = request.brandNames;
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.endingPrice = request.endingPrice;
            this.pageIndex = request.pageIndex;
            this.shopIds = request.shopIds;
            this.sortOrder = request.sortOrder;
            this.startDate = request.startDate;
            this.startPrice = request.startPrice;
            this.timeDisplay = request.timeDisplay;
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
         * A short description of struct
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
         * SortOrder.
         */
        public Builder sortOrder(Long sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
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
         * TimeDisplay.
         */
        public Builder timeDisplay(Long timeDisplay) {
            this.putBodyParameter("TimeDisplay", timeDisplay);
            this.timeDisplay = timeDisplay;
            return this;
        }

        @Override
        public GetStyleTopRequest build() {
            return new GetStyleTopRequest(this);
        } 

    } 

}
