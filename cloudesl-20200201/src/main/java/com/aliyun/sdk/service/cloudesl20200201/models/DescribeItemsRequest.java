// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeItemsRequest</p>
 */
public class DescribeItemsRequest extends Request {
    @Body
    @NameInMap("BePromotion")
    private Boolean bePromotion;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("ItemBarCode")
    private String itemBarCode;

    @Body
    @NameInMap("ItemId")
    private String itemId;

    @Body
    @NameInMap("ItemTitle")
    private String itemTitle;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SkuId")
    private String skuId;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private DescribeItemsRequest(Builder builder) {
        super(builder);
        this.bePromotion = builder.bePromotion;
        this.extraParams = builder.extraParams;
        this.itemBarCode = builder.itemBarCode;
        this.itemId = builder.itemId;
        this.itemTitle = builder.itemTitle;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skuId = builder.skuId;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bePromotion
     */
    public Boolean getBePromotion() {
        return this.bePromotion;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return itemTitle
     */
    public String getItemTitle() {
        return this.itemTitle;
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
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DescribeItemsRequest, Builder> {
        private Boolean bePromotion; 
        private String extraParams; 
        private String itemBarCode; 
        private String itemId; 
        private String itemTitle; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skuId; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeItemsRequest request) {
            super(request);
            this.bePromotion = request.bePromotion;
            this.extraParams = request.extraParams;
            this.itemBarCode = request.itemBarCode;
            this.itemId = request.itemId;
            this.itemTitle = request.itemTitle;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skuId = request.skuId;
            this.storeId = request.storeId;
        } 

        /**
         * BePromotion.
         */
        public Builder bePromotion(Boolean bePromotion) {
            this.putBodyParameter("BePromotion", bePromotion);
            this.bePromotion = bePromotion;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putBodyParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemTitle.
         */
        public Builder itemTitle(String itemTitle) {
            this.putBodyParameter("ItemTitle", itemTitle);
            this.itemTitle = itemTitle;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SkuID。
         */
        public Builder skuId(String skuId) {
            this.putBodyParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public DescribeItemsRequest build() {
            return new DescribeItemsRequest(this);
        } 

    } 

}
