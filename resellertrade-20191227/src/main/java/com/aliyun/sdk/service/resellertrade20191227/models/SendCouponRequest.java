// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCouponRequest} extends {@link RequestModel}
 *
 * <p>SendCouponRequest</p>
 */
public class SendCouponRequest extends Request {
    @Body
    @NameInMap("Bid")
    private Long bid;

    @Body
    @NameInMap("FromApp")
    private String fromApp;

    @Body
    @NameInMap("Operator")
    private String operator;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SellerId")
    private Long sellerId;

    @Body
    @NameInMap("TemplateId")
    private Long templateId;

    @Body
    @NameInMap("UserAmountModelList")
    private java.util.List < UserAmountModelList> userAmountModelList;

    private SendCouponRequest(Builder builder) {
        super(builder);
        this.bid = builder.bid;
        this.fromApp = builder.fromApp;
        this.operator = builder.operator;
        this.requestId = builder.requestId;
        this.sellerId = builder.sellerId;
        this.templateId = builder.templateId;
        this.userAmountModelList = builder.userAmountModelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCouponRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bid
     */
    public Long getBid() {
        return this.bid;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sellerId
     */
    public Long getSellerId() {
        return this.sellerId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userAmountModelList
     */
    public java.util.List < UserAmountModelList> getUserAmountModelList() {
        return this.userAmountModelList;
    }

    public static final class Builder extends Request.Builder<SendCouponRequest, Builder> {
        private Long bid; 
        private String fromApp; 
        private String operator; 
        private String requestId; 
        private Long sellerId; 
        private Long templateId; 
        private java.util.List < UserAmountModelList> userAmountModelList; 

        private Builder() {
            super();
        } 

        private Builder(SendCouponRequest request) {
            super(request);
            this.bid = request.bid;
            this.fromApp = request.fromApp;
            this.operator = request.operator;
            this.requestId = request.requestId;
            this.sellerId = request.sellerId;
            this.templateId = request.templateId;
            this.userAmountModelList = request.userAmountModelList;
        } 

        /**
         * Bid.
         */
        public Builder bid(Long bid) {
            this.putBodyParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putBodyParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SellerId.
         */
        public Builder sellerId(Long sellerId) {
            this.putBodyParameter("SellerId", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * UserAmountModelList.
         */
        public Builder userAmountModelList(java.util.List < UserAmountModelList> userAmountModelList) {
            this.putBodyParameter("UserAmountModelList", userAmountModelList);
            this.userAmountModelList = userAmountModelList;
            return this;
        }

        @Override
        public SendCouponRequest build() {
            return new SendCouponRequest(this);
        } 

    } 

    public static class UserAmountModelList extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("YouhuiId")
        private Long youhuiId;

        private UserAmountModelList(Builder builder) {
            this.amount = builder.amount;
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.youhuiId = builder.youhuiId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAmountModelList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return youhuiId
         */
        public Long getYouhuiId() {
            return this.youhuiId;
        }

        public static final class Builder {
            private Double amount; 
            private Long uid; 
            private Long userId; 
            private Long youhuiId; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * YouhuiId.
             */
            public Builder youhuiId(Long youhuiId) {
                this.youhuiId = youhuiId;
                return this;
            }

            public UserAmountModelList build() {
                return new UserAmountModelList(this);
            } 

        } 

    }
}
