// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceRangeRequest} extends {@link RequestModel}
 *
 * <p>GetPriceRangeRequest</p>
 */
public class GetPriceRangeRequest extends Request {
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
    @NameInMap("Section")
    private Long section;

    @Body
    @NameInMap("ShopIds")
    private String shopIds;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    private GetPriceRangeRequest(Builder builder) {
        super(builder);
        this.brandNames = builder.brandNames;
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.section = builder.section;
        this.shopIds = builder.shopIds;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceRangeRequest create() {
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
     * @return section
     */
    public Long getSection() {
        return this.section;
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

    public static final class Builder extends Request.Builder<GetPriceRangeRequest, Builder> {
        private String brandNames; 
        private String cateIds; 
        private String endingDate; 
        private Long section; 
        private String shopIds; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetPriceRangeRequest request) {
            super(request);
            this.brandNames = request.brandNames;
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.section = request.section;
            this.shopIds = request.shopIds;
            this.startDate = request.startDate;
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
         * Section.
         */
        public Builder section(Long section) {
            this.putBodyParameter("Section", section);
            this.section = section;
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

        @Override
        public GetPriceRangeRequest build() {
            return new GetPriceRangeRequest(this);
        } 

    } 

}
