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
 * {@link TicketQueryPriceStockRequest} extends {@link RequestModel}
 *
 * <p>TicketQueryPriceStockRequest</p>
 */
public class TicketQueryPriceStockRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private TicketQueryPriceStockRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.endDate = builder.endDate;
        this.productId = builder.productId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryPriceStockRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<TicketQueryPriceStockRequest, Builder> {
        private Long accountNo; 
        private String endDate; 
        private String productId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(TicketQueryPriceStockRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.endDate = request.endDate;
            this.productId = request.productId;
            this.startDate = request.startDate;
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
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

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public TicketQueryPriceStockRequest build() {
            return new TicketQueryPriceStockRequest(this);
        } 

    } 

}
