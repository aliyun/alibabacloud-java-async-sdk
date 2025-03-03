// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateFundAccountTransferRequest} extends {@link RequestModel}
 *
 * <p>CreateFundAccountTransferRequest</p>
 */
public class CreateFundAccountTransferRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FinanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String financeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromFundAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromFundAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToFundAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toFundAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransferType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transferType;

    private CreateFundAccountTransferRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.financeType = builder.financeType;
        this.fromFundAccountId = builder.fromFundAccountId;
        this.remark = builder.remark;
        this.toFundAccountId = builder.toFundAccountId;
        this.transferType = builder.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFundAccountTransferRequest create() {
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
     * @return financeType
     */
    public String getFinanceType() {
        return this.financeType;
    }

    /**
     * @return fromFundAccountId
     */
    public Long getFromFundAccountId() {
        return this.fromFundAccountId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return toFundAccountId
     */
    public Long getToFundAccountId() {
        return this.toFundAccountId;
    }

    /**
     * @return transferType
     */
    public String getTransferType() {
        return this.transferType;
    }

    public static final class Builder extends Request.Builder<CreateFundAccountTransferRequest, Builder> {
        private String amount; 
        private String currency; 
        private String financeType; 
        private Long fromFundAccountId; 
        private String remark; 
        private Long toFundAccountId; 
        private String transferType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFundAccountTransferRequest request) {
            super(request);
            this.amount = request.amount;
            this.currency = request.currency;
            this.financeType = request.financeType;
            this.fromFundAccountId = request.fromFundAccountId;
            this.remark = request.remark;
            this.toFundAccountId = request.toFundAccountId;
            this.transferType = request.transferType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder amount(String amount) {
            this.putBodyParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cash</p>
         */
        public Builder financeType(String financeType) {
            this.putBodyParameter("FinanceType", financeType);
            this.financeType = financeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123212323</p>
         */
        public Builder fromFundAccountId(Long fromFundAccountId) {
            this.putBodyParameter("FromFundAccountId", fromFundAccountId);
            this.fromFundAccountId = fromFundAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>转账的备注</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11112231</p>
         */
        public Builder toFundAccountId(Long toFundAccountId) {
            this.putBodyParameter("ToFundAccountId", toFundAccountId);
            this.toFundAccountId = toFundAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grant</p>
         */
        public Builder transferType(String transferType) {
            this.putBodyParameter("TransferType", transferType);
            this.transferType = transferType;
            return this;
        }

        @Override
        public CreateFundAccountTransferRequest build() {
            return new CreateFundAccountTransferRequest(this);
        } 

    } 

}
