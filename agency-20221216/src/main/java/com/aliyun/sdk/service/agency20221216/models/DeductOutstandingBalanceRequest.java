// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeductOutstandingBalanceRequest} extends {@link RequestModel}
 *
 * <p>DeductOutstandingBalanceRequest</p>
 */
public class DeductOutstandingBalanceRequest extends Request {
    @Query
    @NameInMap("DeductAmount")
    @Validation(required = true)
    private String deductAmount;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private DeductOutstandingBalanceRequest(Builder builder) {
        super(builder);
        this.deductAmount = builder.deductAmount;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeductOutstandingBalanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deductAmount
     */
    public String getDeductAmount() {
        return this.deductAmount;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DeductOutstandingBalanceRequest, Builder> {
        private String deductAmount; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(DeductOutstandingBalanceRequest request) {
            super(request);
            this.deductAmount = request.deductAmount;
            this.uid = request.uid;
        } 

        /**
         * The Deducted Credit to be offset.
         */
        public Builder deductAmount(String deductAmount) {
            this.putQueryParameter("DeductAmount", deductAmount);
            this.deductAmount = deductAmount;
            return this;
        }

        /**
         * Account UID of Distribution Customer.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DeductOutstandingBalanceRequest build() {
            return new DeductOutstandingBalanceRequest(this);
        } 

    } 

}
