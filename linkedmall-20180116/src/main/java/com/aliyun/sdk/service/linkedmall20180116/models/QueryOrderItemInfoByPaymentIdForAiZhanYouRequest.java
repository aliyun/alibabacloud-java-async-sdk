// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryOrderItemInfoByPaymentIdForAiZhanYouRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderItemInfoByPaymentIdForAiZhanYouRequest</p>
 */
public class QueryOrderItemInfoByPaymentIdForAiZhanYouRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******85759</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P51M******15</p>
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
