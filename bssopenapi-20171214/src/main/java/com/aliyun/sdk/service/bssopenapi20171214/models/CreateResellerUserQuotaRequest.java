// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResellerUserQuotaRequest} extends {@link RequestModel}
 *
 * <p>CreateResellerUserQuotaRequest</p>
 */
public class CreateResellerUserQuotaRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true)
    private String amount;

    @Query
    @NameInMap("Currency")
    @Validation(required = true)
    private String currency;

    @Query
    @NameInMap("OutBizId")
    private String outBizId;

    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    private CreateResellerUserQuotaRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.outBizId = builder.outBizId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResellerUserQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<CreateResellerUserQuotaRequest, Builder> {
        private String amount; 
        private String currency; 
        private String outBizId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResellerUserQuotaRequest response) {
            super(response);
            this.amount = response.amount;
            this.currency = response.currency;
            this.outBizId = response.outBizId;
            this.ownerId = response.ownerId;
        } 

        /**
         * Amount.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * OutBizId.
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public CreateResellerUserQuotaRequest build() {
            return new CreateResellerUserQuotaRequest(this);
        } 

    } 

}
