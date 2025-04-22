// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssProduce} extends {@link TeaModel}
 *
 * <p>CssProduce</p>
 */
public class CssProduce extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("buyerId")
    private Long buyerId;

    @com.aliyun.core.annotation.NameInMap("childId")
    private Long childId;

    @com.aliyun.core.annotation.NameInMap("fromApp")
    private String fromApp;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("payerId")
    private Long payerId;

    @com.aliyun.core.annotation.NameInMap("purchases")
    private java.util.List<CssPurchase> purchases;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skipChannel")
    private Boolean skipChannel;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private CssProduce(Builder builder) {
        this.bid = builder.bid;
        this.buyerId = builder.buyerId;
        this.childId = builder.childId;
        this.fromApp = builder.fromApp;
        this.orderId = builder.orderId;
        this.payerId = builder.payerId;
        this.purchases = builder.purchases;
        this.requestId = builder.requestId;
        this.skipChannel = builder.skipChannel;
        this.token = builder.token;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssProduce create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return buyerId
     */
    public Long getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return childId
     */
    public Long getChildId() {
        return this.childId;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return payerId
     */
    public Long getPayerId() {
        return this.payerId;
    }

    /**
     * @return purchases
     */
    public java.util.List<CssPurchase> getPurchases() {
        return this.purchases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skipChannel
     */
    public Boolean getSkipChannel() {
        return this.skipChannel;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String bid; 
        private Long buyerId; 
        private Long childId; 
        private String fromApp; 
        private Long orderId; 
        private Long payerId; 
        private java.util.List<CssPurchase> purchases; 
        private String requestId; 
        private Boolean skipChannel; 
        private String token; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(CssProduce model) {
            this.bid = model.bid;
            this.buyerId = model.buyerId;
            this.childId = model.childId;
            this.fromApp = model.fromApp;
            this.orderId = model.orderId;
            this.payerId = model.payerId;
            this.purchases = model.purchases;
            this.requestId = model.requestId;
            this.skipChannel = model.skipChannel;
            this.token = model.token;
            this.userId = model.userId;
        } 

        /**
         * bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * buyerId.
         */
        public Builder buyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }

        /**
         * childId.
         */
        public Builder childId(Long childId) {
            this.childId = childId;
            return this;
        }

        /**
         * fromApp.
         */
        public Builder fromApp(String fromApp) {
            this.fromApp = fromApp;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * payerId.
         */
        public Builder payerId(Long payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * purchases.
         */
        public Builder purchases(java.util.List<CssPurchase> purchases) {
            this.purchases = purchases;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skipChannel.
         */
        public Builder skipChannel(Boolean skipChannel) {
            this.skipChannel = skipChannel;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public CssProduce build() {
            return new CssProduce(this);
        } 

    } 

}
