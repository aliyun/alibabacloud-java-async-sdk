// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketQueryProductRequest} extends {@link RequestModel}
 *
 * <p>TicketQueryProductRequest</p>
 */
public class TicketQueryProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    private TicketQueryProductRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<TicketQueryProductRequest, Builder> {
        private Long accountNo; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(TicketQueryProductRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.productId = request.productId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public TicketQueryProductRequest build() {
            return new TicketQueryProductRequest(this);
        } 

    } 

}
