// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemGuideRetailPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemGuideRetailPriceResponseBody</p>
 */
public class QueryItemGuideRetailPriceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private QueryItemGuideRetailPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemGuideRetailPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private java.util.List < Model> model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryItemGuideRetailPriceResponseBody build() {
            return new QueryItemGuideRetailPriceResponseBody(this);
        } 

    } 

    public static class SkuModels extends TeaModel {
        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("GuideRetailPrice")
        private Long guideRetailPrice;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LowGuideRetailPrice")
        private Long lowGuideRetailPrice;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("ReservedPrice")
        private Long reservedPrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuTitle")
        private String skuTitle;

        @NameInMap("Status")
        private Integer status;

        private SkuModels(Builder builder) {
            this.distributionMallId = builder.distributionMallId;
            this.guideRetailPrice = builder.guideRetailPrice;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lowGuideRetailPrice = builder.lowGuideRetailPrice;
            this.priceCent = builder.priceCent;
            this.reservedPrice = builder.reservedPrice;
            this.skuId = builder.skuId;
            this.skuTitle = builder.skuTitle;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuModels create() {
            return builder().build();
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return guideRetailPrice
         */
        public Long getGuideRetailPrice() {
            return this.guideRetailPrice;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lowGuideRetailPrice
         */
        public Long getLowGuideRetailPrice() {
            return this.lowGuideRetailPrice;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return reservedPrice
         */
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String distributionMallId; 
            private Long guideRetailPrice; 
            private Long itemId; 
            private String lmItemId; 
            private Long lowGuideRetailPrice; 
            private Long priceCent; 
            private Long reservedPrice; 
            private Long skuId; 
            private String skuTitle; 
            private Integer status; 

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * GuideRetailPrice.
             */
            public Builder guideRetailPrice(Long guideRetailPrice) {
                this.guideRetailPrice = guideRetailPrice;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * LowGuideRetailPrice.
             */
            public Builder lowGuideRetailPrice(Long lowGuideRetailPrice) {
                this.lowGuideRetailPrice = lowGuideRetailPrice;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * ReservedPrice.
             */
            public Builder reservedPrice(Long reservedPrice) {
                this.reservedPrice = reservedPrice;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SkuModels build() {
                return new SkuModels(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("GuideRetailPriceScope")
        private String guideRetailPriceScope;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LowGuideRetailPriceScope")
        private String lowGuideRetailPriceScope;

        @NameInMap("ReservedPrice")
        private Long reservedPrice;

        @NameInMap("ReservedPriceScope")
        private String reservedPriceScope;

        @NameInMap("SkuModels")
        private java.util.List < SkuModels> skuModels;

        private Model(Builder builder) {
            this.distributionMallId = builder.distributionMallId;
            this.guideRetailPriceScope = builder.guideRetailPriceScope;
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.lowGuideRetailPriceScope = builder.lowGuideRetailPriceScope;
            this.reservedPrice = builder.reservedPrice;
            this.reservedPriceScope = builder.reservedPriceScope;
            this.skuModels = builder.skuModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return guideRetailPriceScope
         */
        public String getGuideRetailPriceScope() {
            return this.guideRetailPriceScope;
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
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lowGuideRetailPriceScope
         */
        public String getLowGuideRetailPriceScope() {
            return this.lowGuideRetailPriceScope;
        }

        /**
         * @return reservedPrice
         */
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        /**
         * @return reservedPriceScope
         */
        public String getReservedPriceScope() {
            return this.reservedPriceScope;
        }

        /**
         * @return skuModels
         */
        public java.util.List < SkuModels> getSkuModels() {
            return this.skuModels;
        }

        public static final class Builder {
            private String distributionMallId; 
            private String guideRetailPriceScope; 
            private Long itemId; 
            private String itemTitle; 
            private String lmItemId; 
            private String lowGuideRetailPriceScope; 
            private Long reservedPrice; 
            private String reservedPriceScope; 
            private java.util.List < SkuModels> skuModels; 

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * GuideRetailPriceScope.
             */
            public Builder guideRetailPriceScope(String guideRetailPriceScope) {
                this.guideRetailPriceScope = guideRetailPriceScope;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * LowGuideRetailPriceScope.
             */
            public Builder lowGuideRetailPriceScope(String lowGuideRetailPriceScope) {
                this.lowGuideRetailPriceScope = lowGuideRetailPriceScope;
                return this;
            }

            /**
             * ReservedPrice.
             */
            public Builder reservedPrice(Long reservedPrice) {
                this.reservedPrice = reservedPrice;
                return this;
            }

            /**
             * ReservedPriceScope.
             */
            public Builder reservedPriceScope(String reservedPriceScope) {
                this.reservedPriceScope = reservedPriceScope;
                return this;
            }

            /**
             * SkuModels.
             */
            public Builder skuModels(java.util.List < SkuModels> skuModels) {
                this.skuModels = skuModels;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
