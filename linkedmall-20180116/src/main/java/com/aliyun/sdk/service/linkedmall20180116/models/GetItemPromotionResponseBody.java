// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemPromotionResponseBody} extends {@link TeaModel}
 *
 * <p>GetItemPromotionResponseBody</p>
 */
public class GetItemPromotionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ItemPromotionModel")
    private ItemPromotionModel itemPromotionModel;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private GetItemPromotionResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemPromotionModel = builder.itemPromotionModel;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetItemPromotionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return itemPromotionModel
     */
    public ItemPromotionModel getItemPromotionModel() {
        return this.itemPromotionModel;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private ItemPromotionModel itemPromotionModel; 
        private String message; 
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
         * ItemPromotionModel.
         */
        public Builder itemPromotionModel(ItemPromotionModel itemPromotionModel) {
            this.itemPromotionModel = itemPromotionModel;
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

        public GetItemPromotionResponseBody build() {
            return new GetItemPromotionResponseBody(this);
        } 

    } 

    public static class ItemPromotionModel extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExtInfo")
        private java.util.Map < String, ? > extInfo;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PromotionDesc")
        private String promotionDesc;

        @NameInMap("PromotionFlag")
        private Boolean promotionFlag;

        @NameInMap("PromotionId")
        private String promotionId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("SkuPromotion")
        private java.util.Map < String, ? > skuPromotion;

        @NameInMap("StartTime")
        private String startTime;

        private ItemPromotionModel(Builder builder) {
            this.endTime = builder.endTime;
            this.extInfo = builder.extInfo;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.promotionDesc = builder.promotionDesc;
            this.promotionFlag = builder.promotionFlag;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.skuPromotion = builder.skuPromotion;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPromotionModel create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, ? > getExtInfo() {
            return this.extInfo;
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
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionFlag
         */
        public Boolean getPromotionFlag() {
            return this.promotionFlag;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return skuPromotion
         */
        public java.util.Map < String, ? > getSkuPromotion() {
            return this.skuPromotion;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private java.util.Map < String, ? > extInfo; 
            private Long itemId; 
            private String lmItemId; 
            private String promotionDesc; 
            private Boolean promotionFlag; 
            private String promotionId; 
            private String promotionName; 
            private java.util.Map < String, ? > skuPromotion; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, ? > extInfo) {
                this.extInfo = extInfo;
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
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * PromotionFlag.
             */
            public Builder promotionFlag(Boolean promotionFlag) {
                this.promotionFlag = promotionFlag;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * SkuPromotion.
             */
            public Builder skuPromotion(java.util.Map < String, ? > skuPromotion) {
                this.skuPromotion = skuPromotion;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ItemPromotionModel build() {
                return new ItemPromotionModel(this);
            } 

        } 

    }
}
