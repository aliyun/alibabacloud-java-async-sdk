// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeductOutstandingBalanceRequest} extends {@link RequestModel}
 *
 * <p>DeductOutstandingBalanceRequest</p>
 */
public class DeductOutstandingBalanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeductAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deductAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The Deducted Credit to be offset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder deductAmount(String deductAmount) {
            this.putQueryParameter("DeductAmount", deductAmount);
            this.deductAmount = deductAmount;
            return this;
        }

        /**
         * <p>Account UID of Distribution Customer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1133166938931507</p>
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
