// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeItemsRequest</p>
 */
public class DescribeItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BePromotion")
    private Boolean bePromotion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTitle")
    private String itemTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkuId")
    private String skuId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DescribeItemsRequest(Builder builder) {
        super(builder);
        this.bePromotion = builder.bePromotion;
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
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
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
        private String itemBarCode; 
        private Long itemId; 
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
        public Builder itemId(Long itemId) {
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
         * SkuId.
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
