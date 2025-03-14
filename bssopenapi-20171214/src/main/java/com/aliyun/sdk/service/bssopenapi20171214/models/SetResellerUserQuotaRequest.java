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
 * {@link SetResellerUserQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetResellerUserQuotaRequest</p>
 */
public class SetResellerUserQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutBizId")
    private String outBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerId;

    private SetResellerUserQuotaRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.outBizId = builder.outBizId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetResellerUserQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return outBizId
     */
    public String getOutBizId() {
        return this.outBizId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetResellerUserQuotaRequest, Builder> {
        private String amount; 
        private String currency; 
        private String outBizId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetResellerUserQuotaRequest request) {
            super(request);
            this.amount = request.amount;
            this.currency = request.currency;
            this.outBizId = request.outBizId;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>The quota of a quota ledger. Unit: CNY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>750</p>
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>You do not need to set the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * <p>The ID of the business.</p>
         * 
         * <strong>example:</strong>
         * <p>OD2022040818295234777795624764689</p>
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetResellerUserQuotaRequest build() {
            return new SetResellerUserQuotaRequest(this);
        } 

    } 

}
