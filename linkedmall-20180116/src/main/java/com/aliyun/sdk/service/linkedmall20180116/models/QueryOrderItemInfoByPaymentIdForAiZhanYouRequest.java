// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderItemInfoByPaymentIdForAiZhanYouRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderItemInfoByPaymentIdForAiZhanYouRequest</p>
 */
public class QueryOrderItemInfoByPaymentIdForAiZhanYouRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizUid")
    @Validation(required = true)
    private String bizUid;

    @Query
    @NameInMap("PaymentId")
    @Validation(required = true)
    private String paymentId;

    private QueryOrderItemInfoByPaymentIdForAiZhanYouRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.paymentId = builder.paymentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return paymentId
     */
    public String getPaymentId() {
        return this.paymentId;
    }

    public static final class Builder extends Request.Builder<QueryOrderItemInfoByPaymentIdForAiZhanYouRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String paymentId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.paymentId = request.paymentId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizUid.
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * PaymentId.
         */
        public Builder paymentId(String paymentId) {
            this.putQueryParameter("PaymentId", paymentId);
            this.paymentId = paymentId;
            return this;
        }

        @Override
        public QueryOrderItemInfoByPaymentIdForAiZhanYouRequest build() {
            return new QueryOrderItemInfoByPaymentIdForAiZhanYouRequest(this);
        } 

    } 

}
