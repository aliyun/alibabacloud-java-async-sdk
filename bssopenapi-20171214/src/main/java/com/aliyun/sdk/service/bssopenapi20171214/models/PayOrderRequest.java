// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link PayOrderRequest} extends {@link RequestModel}
 *
 * <p>PayOrderRequest</p>
 */
public class PayOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long buyerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaySubmitUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long paySubmitUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long payerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private PayOrderRequest(Builder builder) {
        super(builder);
        this.buyerId = builder.buyerId;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
        this.orderId = builder.orderId;
        this.paySubmitUid = builder.paySubmitUid;
        this.payerId = builder.payerId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PayOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyerId
     */
    public Long getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return paySubmitUid
     */
    public Long getPaySubmitUid() {
        return this.paySubmitUid;
    }

    /**
     * @return payerId
     */
    public Long getPayerId() {
        return this.payerId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<PayOrderRequest, Builder> {
        private Long buyerId; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 
        private Long orderId; 
        private Long paySubmitUid; 
        private Long payerId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(PayOrderRequest request) {
            super(request);
            this.buyerId = request.buyerId;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
            this.orderId = request.orderId;
            this.paySubmitUid = request.paySubmitUid;
            this.payerId = request.payerId;
            this.token = request.token;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1178418164369806</p>
         */
        public Builder buyerId(Long buyerId) {
            this.putQueryParameter("BuyerId", buyerId);
            this.buyerId = buyerId;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIds);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>260591304500425</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>201437655683478597</p>
         */
        public Builder paySubmitUid(Long paySubmitUid) {
            this.putQueryParameter("PaySubmitUid", paySubmitUid);
            this.paySubmitUid = paySubmitUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>201437655683478597</p>
         */
        public Builder payerId(Long payerId) {
            this.putQueryParameter("PayerId", payerId);
            this.payerId = payerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public PayOrderRequest build() {
            return new PayOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link PayOrderRequest} extends {@link TeaModel}
     *
     * <p>PayOrderRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIds model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
}
