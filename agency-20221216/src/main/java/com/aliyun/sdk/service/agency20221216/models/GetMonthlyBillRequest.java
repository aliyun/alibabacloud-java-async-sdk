// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonthlyBillRequest} extends {@link RequestModel}
 *
 * <p>GetMonthlyBillRequest</p>
 */
public class GetMonthlyBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private String month;

    private GetMonthlyBillRequest(Builder builder) {
        super(builder);
        this.billOwner = builder.billOwner;
        this.billType = builder.billType;
        this.month = builder.month;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonthlyBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwner
     */
    public String getBillOwner() {
        return this.billOwner;
    }

    /**
     * @return billType
     */
    public String getBillType() {
        return this.billType;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return this.month;
    }

    public static final class Builder extends Request.Builder<GetMonthlyBillRequest, Builder> {
        private String billOwner; 
        private String billType; 
        private String month; 

        private Builder() {
            super();
        } 

        private Builder(GetMonthlyBillRequest request) {
            super(request);
            this.billOwner = request.billOwner;
            this.billType = request.billType;
            this.month = request.month;
        } 

        /**
         * Bill Owner type. Value Range:</br>
         * <p>
         * 1: Master account</br>
         * 2: Sub account</br>
         */
        public Builder billOwner(String billOwner) {
            this.putQueryParameter("BillOwner", billOwner);
            this.billOwner = billOwner;
            return this;
        }

        /**
         * Value Range:
         * <p>
         * 
         * - MonthlyInvoice
         * - MonthRefundInvoice
         * - MonthlySummary
         * - MonthlyInstanceAddAdjustBill 
         * - MonthlyInstanceRefundBill
         * - MonthlyAddAdjustInvoce
         * - MonthlyRefundAdjustInvoce 
         * - MonthlyInstanceConsumeV2 
         * - MarginReportV2
         */
        public Builder billType(String billType) {
            this.putQueryParameter("BillType", billType);
            this.billType = billType;
            return this;
        }

        /**
         * Billing Month, Format is YYYY-MM
         */
        public Builder month(String month) {
            this.putQueryParameter("Month", month);
            this.month = month;
            return this;
        }

        @Override
        public GetMonthlyBillRequest build() {
            return new GetMonthlyBillRequest(this);
        } 

    } 

}
