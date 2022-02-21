// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBindersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBindersResponseBody</p>
 */
public class DescribeBindersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("EslItemBindInfos")
    private java.util.List < EslItemBindInfos> eslItemBindInfos;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBindersResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.eslItemBindInfos = builder.eslItemBindInfos;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBindersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return eslItemBindInfos
     */
    public java.util.List < EslItemBindInfos> getEslItemBindInfos() {
        return this.eslItemBindInfos;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < EslItemBindInfos> eslItemBindInfos; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * EslItemBindInfos.
         */
        public Builder eslItemBindInfos(java.util.List < EslItemBindInfos> eslItemBindInfos) {
            this.eslItemBindInfos = eslItemBindInfos;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBindersResponseBody build() {
            return new DescribeBindersResponseBody(this);
        } 

    } 

    public static class EslItemBindInfos extends TeaModel {
        @NameInMap("ActionPrice")
        private String actionPrice;

        @NameInMap("BePromotion")
        private Boolean bePromotion;

        @NameInMap("BindId")
        private String bindId;

        @NameInMap("EslBarCode")
        private String eslBarCode;

        @NameInMap("EslConnectAp")
        private String eslConnectAp;

        @NameInMap("EslModel")
        private String eslModel;

        @NameInMap("EslPic")
        private String eslPic;

        @NameInMap("EslStatus")
        private String eslStatus;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("ItemBarCode")
        private String itemBarCode;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemShortTitle")
        private String itemShortTitle;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("OriginalPrice")
        private String originalPrice;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("PromotionEnd")
        private String promotionEnd;

        @NameInMap("PromotionStart")
        private String promotionStart;

        @NameInMap("PromotionText")
        private String promotionText;

        @NameInMap("SkuId")
        private String skuId;

        @NameInMap("StoreId")
        private String storeId;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateSceneId")
        private String templateSceneId;

        private EslItemBindInfos(Builder builder) {
            this.actionPrice = builder.actionPrice;
            this.bePromotion = builder.bePromotion;
            this.bindId = builder.bindId;
            this.eslBarCode = builder.eslBarCode;
            this.eslConnectAp = builder.eslConnectAp;
            this.eslModel = builder.eslModel;
            this.eslPic = builder.eslPic;
            this.eslStatus = builder.eslStatus;
            this.gmtModified = builder.gmtModified;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemShortTitle = builder.itemShortTitle;
            this.itemTitle = builder.itemTitle;
            this.originalPrice = builder.originalPrice;
            this.priceUnit = builder.priceUnit;
            this.promotionEnd = builder.promotionEnd;
            this.promotionStart = builder.promotionStart;
            this.promotionText = builder.promotionText;
            this.skuId = builder.skuId;
            this.storeId = builder.storeId;
            this.templateId = builder.templateId;
            this.templateSceneId = builder.templateSceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslItemBindInfos create() {
            return builder().build();
        }

        /**
         * @return actionPrice
         */
        public String getActionPrice() {
            return this.actionPrice;
        }

        /**
         * @return bePromotion
         */
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        /**
         * @return bindId
         */
        public String getBindId() {
            return this.bindId;
        }

        /**
         * @return eslBarCode
         */
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        /**
         * @return eslConnectAp
         */
        public String getEslConnectAp() {
            return this.eslConnectAp;
        }

        /**
         * @return eslModel
         */
        public String getEslModel() {
            return this.eslModel;
        }

        /**
         * @return eslPic
         */
        public String getEslPic() {
            return this.eslPic;
        }

        /**
         * @return eslStatus
         */
        public String getEslStatus() {
            return this.eslStatus;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return itemShortTitle
         */
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return promotionEnd
         */
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        /**
         * @return promotionStart
         */
        public String getPromotionStart() {
            return this.promotionStart;
        }

        /**
         * @return promotionText
         */
        public String getPromotionText() {
            return this.promotionText;
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

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateSceneId
         */
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public static final class Builder {
            private String actionPrice; 
            private Boolean bePromotion; 
            private String bindId; 
            private String eslBarCode; 
            private String eslConnectAp; 
            private String eslModel; 
            private String eslPic; 
            private String eslStatus; 
            private String gmtModified; 
            private String itemBarCode; 
            private String itemId; 
            private String itemShortTitle; 
            private String itemTitle; 
            private String originalPrice; 
            private String priceUnit; 
            private String promotionEnd; 
            private String promotionStart; 
            private String promotionText; 
            private String skuId; 
            private String storeId; 
            private String templateId; 
            private String templateSceneId; 

            /**
             * ActionPrice.
             */
            public Builder actionPrice(String actionPrice) {
                this.actionPrice = actionPrice;
                return this;
            }

            /**
             * BePromotion.
             */
            public Builder bePromotion(Boolean bePromotion) {
                this.bePromotion = bePromotion;
                return this;
            }

            /**
             * BindId.
             */
            public Builder bindId(String bindId) {
                this.bindId = bindId;
                return this;
            }

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * EslConnectAp.
             */
            public Builder eslConnectAp(String eslConnectAp) {
                this.eslConnectAp = eslConnectAp;
                return this;
            }

            /**
             * EslModel.
             */
            public Builder eslModel(String eslModel) {
                this.eslModel = eslModel;
                return this;
            }

            /**
             * EslPic.
             */
            public Builder eslPic(String eslPic) {
                this.eslPic = eslPic;
                return this;
            }

            /**
             * EslStatus.
             */
            public Builder eslStatus(String eslStatus) {
                this.eslStatus = eslStatus;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemShortTitle.
             */
            public Builder itemShortTitle(String itemShortTitle) {
                this.itemShortTitle = itemShortTitle;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * PromotionEnd.
             */
            public Builder promotionEnd(String promotionEnd) {
                this.promotionEnd = promotionEnd;
                return this;
            }

            /**
             * PromotionStart.
             */
            public Builder promotionStart(String promotionStart) {
                this.promotionStart = promotionStart;
                return this;
            }

            /**
             * PromotionText.
             */
            public Builder promotionText(String promotionText) {
                this.promotionText = promotionText;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateSceneId.
             */
            public Builder templateSceneId(String templateSceneId) {
                this.templateSceneId = templateSceneId;
                return this;
            }

            public EslItemBindInfos build() {
                return new EslItemBindInfos(this);
            } 

        } 

    }
}
