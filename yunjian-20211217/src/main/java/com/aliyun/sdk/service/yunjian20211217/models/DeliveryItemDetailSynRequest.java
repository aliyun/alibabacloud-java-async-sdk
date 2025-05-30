// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link DeliveryItemDetailSynRequest} extends {@link RequestModel}
 *
 * <p>DeliveryItemDetailSynRequest</p>
 */
public class DeliveryItemDetailSynRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deliveryItemDetailDTOS")
    private java.util.List<DeliveryItemDetailDTOS> deliveryItemDetailDTOS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deliveryItemId")
    private String deliveryItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deliveryPlanId")
    private String deliveryPlanId;

    private DeliveryItemDetailSynRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.channel = builder.channel;
        this.deliveryItemDetailDTOS = builder.deliveryItemDetailDTOS;
        this.deliveryItemId = builder.deliveryItemId;
        this.deliveryPlanId = builder.deliveryPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeliveryItemDetailSynRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return deliveryItemDetailDTOS
     */
    public java.util.List<DeliveryItemDetailDTOS> getDeliveryItemDetailDTOS() {
        return this.deliveryItemDetailDTOS;
    }

    /**
     * @return deliveryItemId
     */
    public String getDeliveryItemId() {
        return this.deliveryItemId;
    }

    /**
     * @return deliveryPlanId
     */
    public String getDeliveryPlanId() {
        return this.deliveryPlanId;
    }

    public static final class Builder extends Request.Builder<DeliveryItemDetailSynRequest, Builder> {
        private String yunUserId; 
        private String channel; 
        private java.util.List<DeliveryItemDetailDTOS> deliveryItemDetailDTOS; 
        private String deliveryItemId; 
        private String deliveryPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DeliveryItemDetailSynRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.channel = request.channel;
            this.deliveryItemDetailDTOS = request.deliveryItemDetailDTOS;
            this.deliveryItemId = request.deliveryItemId;
            this.deliveryPlanId = request.deliveryPlanId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * deliveryItemDetailDTOS.
         */
        public Builder deliveryItemDetailDTOS(java.util.List<DeliveryItemDetailDTOS> deliveryItemDetailDTOS) {
            this.putBodyParameter("deliveryItemDetailDTOS", deliveryItemDetailDTOS);
            this.deliveryItemDetailDTOS = deliveryItemDetailDTOS;
            return this;
        }

        /**
         * deliveryItemId.
         */
        public Builder deliveryItemId(String deliveryItemId) {
            this.putBodyParameter("deliveryItemId", deliveryItemId);
            this.deliveryItemId = deliveryItemId;
            return this;
        }

        /**
         * deliveryPlanId.
         */
        public Builder deliveryPlanId(String deliveryPlanId) {
            this.putBodyParameter("deliveryPlanId", deliveryPlanId);
            this.deliveryPlanId = deliveryPlanId;
            return this;
        }

        @Override
        public DeliveryItemDetailSynRequest build() {
            return new DeliveryItemDetailSynRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeliveryItemDetailSynRequest} extends {@link TeaModel}
     *
     * <p>DeliveryItemDetailSynRequest</p>
     */
    public static class DeliveryItemDetailDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualSupplyTime")
        private String actualSupplyTime;

        @com.aliyun.core.annotation.NameInMap("amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("deliveredAmount")
        private Long deliveredAmount;

        @com.aliyun.core.annotation.NameInMap("deliveryItemId")
        private String deliveryItemId;

        @com.aliyun.core.annotation.NameInMap("deliveryPlanId")
        private String deliveryPlanId;

        @com.aliyun.core.annotation.NameInMap("lastSupplyTime")
        private String lastSupplyTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subDemandSupplyPerformerName")
        private String subDemandSupplyPerformerName;

        @com.aliyun.core.annotation.NameInMap("subDemandSupplyPerformerUid")
        private String subDemandSupplyPerformerUid;

        @com.aliyun.core.annotation.NameInMap("subDemandSupplyPmName")
        private String subDemandSupplyPmName;

        @com.aliyun.core.annotation.NameInMap("subDemandSupplyPmUid")
        private String subDemandSupplyPmUid;

        @com.aliyun.core.annotation.NameInMap("subOrderId")
        private Long subOrderId;

        @com.aliyun.core.annotation.NameInMap("supplyStatus")
        private String supplyStatus;

        @com.aliyun.core.annotation.NameInMap("totalOrderId")
        private Long totalOrderId;

        private DeliveryItemDetailDTOS(Builder builder) {
            this.actualSupplyTime = builder.actualSupplyTime;
            this.amount = builder.amount;
            this.comment = builder.comment;
            this.deliveredAmount = builder.deliveredAmount;
            this.deliveryItemId = builder.deliveryItemId;
            this.deliveryPlanId = builder.deliveryPlanId;
            this.lastSupplyTime = builder.lastSupplyTime;
            this.status = builder.status;
            this.subDemandSupplyPerformerName = builder.subDemandSupplyPerformerName;
            this.subDemandSupplyPerformerUid = builder.subDemandSupplyPerformerUid;
            this.subDemandSupplyPmName = builder.subDemandSupplyPmName;
            this.subDemandSupplyPmUid = builder.subDemandSupplyPmUid;
            this.subOrderId = builder.subOrderId;
            this.supplyStatus = builder.supplyStatus;
            this.totalOrderId = builder.totalOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryItemDetailDTOS create() {
            return builder().build();
        }

        /**
         * @return actualSupplyTime
         */
        public String getActualSupplyTime() {
            return this.actualSupplyTime;
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return deliveredAmount
         */
        public Long getDeliveredAmount() {
            return this.deliveredAmount;
        }

        /**
         * @return deliveryItemId
         */
        public String getDeliveryItemId() {
            return this.deliveryItemId;
        }

        /**
         * @return deliveryPlanId
         */
        public String getDeliveryPlanId() {
            return this.deliveryPlanId;
        }

        /**
         * @return lastSupplyTime
         */
        public String getLastSupplyTime() {
            return this.lastSupplyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subDemandSupplyPerformerName
         */
        public String getSubDemandSupplyPerformerName() {
            return this.subDemandSupplyPerformerName;
        }

        /**
         * @return subDemandSupplyPerformerUid
         */
        public String getSubDemandSupplyPerformerUid() {
            return this.subDemandSupplyPerformerUid;
        }

        /**
         * @return subDemandSupplyPmName
         */
        public String getSubDemandSupplyPmName() {
            return this.subDemandSupplyPmName;
        }

        /**
         * @return subDemandSupplyPmUid
         */
        public String getSubDemandSupplyPmUid() {
            return this.subDemandSupplyPmUid;
        }

        /**
         * @return subOrderId
         */
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return supplyStatus
         */
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

        /**
         * @return totalOrderId
         */
        public Long getTotalOrderId() {
            return this.totalOrderId;
        }

        public static final class Builder {
            private String actualSupplyTime; 
            private Long amount; 
            private String comment; 
            private Long deliveredAmount; 
            private String deliveryItemId; 
            private String deliveryPlanId; 
            private String lastSupplyTime; 
            private String status; 
            private String subDemandSupplyPerformerName; 
            private String subDemandSupplyPerformerUid; 
            private String subDemandSupplyPmName; 
            private String subDemandSupplyPmUid; 
            private Long subOrderId; 
            private String supplyStatus; 
            private Long totalOrderId; 

            private Builder() {
            } 

            private Builder(DeliveryItemDetailDTOS model) {
                this.actualSupplyTime = model.actualSupplyTime;
                this.amount = model.amount;
                this.comment = model.comment;
                this.deliveredAmount = model.deliveredAmount;
                this.deliveryItemId = model.deliveryItemId;
                this.deliveryPlanId = model.deliveryPlanId;
                this.lastSupplyTime = model.lastSupplyTime;
                this.status = model.status;
                this.subDemandSupplyPerformerName = model.subDemandSupplyPerformerName;
                this.subDemandSupplyPerformerUid = model.subDemandSupplyPerformerUid;
                this.subDemandSupplyPmName = model.subDemandSupplyPmName;
                this.subDemandSupplyPmUid = model.subDemandSupplyPmUid;
                this.subOrderId = model.subOrderId;
                this.supplyStatus = model.supplyStatus;
                this.totalOrderId = model.totalOrderId;
            } 

            /**
             * actualSupplyTime.
             */
            public Builder actualSupplyTime(String actualSupplyTime) {
                this.actualSupplyTime = actualSupplyTime;
                return this;
            }

            /**
             * amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * deliveredAmount.
             */
            public Builder deliveredAmount(Long deliveredAmount) {
                this.deliveredAmount = deliveredAmount;
                return this;
            }

            /**
             * deliveryItemId.
             */
            public Builder deliveryItemId(String deliveryItemId) {
                this.deliveryItemId = deliveryItemId;
                return this;
            }

            /**
             * deliveryPlanId.
             */
            public Builder deliveryPlanId(String deliveryPlanId) {
                this.deliveryPlanId = deliveryPlanId;
                return this;
            }

            /**
             * lastSupplyTime.
             */
            public Builder lastSupplyTime(String lastSupplyTime) {
                this.lastSupplyTime = lastSupplyTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subDemandSupplyPerformerName.
             */
            public Builder subDemandSupplyPerformerName(String subDemandSupplyPerformerName) {
                this.subDemandSupplyPerformerName = subDemandSupplyPerformerName;
                return this;
            }

            /**
             * subDemandSupplyPerformerUid.
             */
            public Builder subDemandSupplyPerformerUid(String subDemandSupplyPerformerUid) {
                this.subDemandSupplyPerformerUid = subDemandSupplyPerformerUid;
                return this;
            }

            /**
             * subDemandSupplyPmName.
             */
            public Builder subDemandSupplyPmName(String subDemandSupplyPmName) {
                this.subDemandSupplyPmName = subDemandSupplyPmName;
                return this;
            }

            /**
             * subDemandSupplyPmUid.
             */
            public Builder subDemandSupplyPmUid(String subDemandSupplyPmUid) {
                this.subDemandSupplyPmUid = subDemandSupplyPmUid;
                return this;
            }

            /**
             * subOrderId.
             */
            public Builder subOrderId(Long subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * supplyStatus.
             */
            public Builder supplyStatus(String supplyStatus) {
                this.supplyStatus = supplyStatus;
                return this;
            }

            /**
             * totalOrderId.
             */
            public Builder totalOrderId(Long totalOrderId) {
                this.totalOrderId = totalOrderId;
                return this;
            }

            public DeliveryItemDetailDTOS build() {
                return new DeliveryItemDetailDTOS(this);
            } 

        } 

    }
}
