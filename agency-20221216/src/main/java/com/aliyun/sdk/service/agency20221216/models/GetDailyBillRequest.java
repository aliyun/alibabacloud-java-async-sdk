// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDailyBillRequest} extends {@link RequestModel}
 *
 * <p>GetDailyBillRequest</p>
 */
public class GetDailyBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    private GetDailyBillRequest(Builder builder) {
        super(builder);
        this.billOwner = builder.billOwner;
        this.billType = builder.billType;
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyBillRequest create() {
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
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder extends Request.Builder<GetDailyBillRequest, Builder> {
        private String billOwner; 
        private String billType; 
        private String date; 

        private Builder() {
            super();
        } 

        private Builder(GetDailyBillRequest request) {
            super(request);
            this.billOwner = request.billOwner;
            this.billType = request.billType;
            this.date = request.date;
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
         * BillType. Value Range:</br>
         * <p>
         * 
         * - DailyOrder(Deprecated)
         * - DailyBill (Deprecated)
         * - DailyInstanceBill (Deprecated)
         * - DailyInstanceBillV2
         */
        public Builder billType(String billType) {
            this.putQueryParameter("BillType", billType);
            this.billType = billType;
            return this;
        }

        /**
         * Billing date. Format YYYY-MM-DD
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        @Override
        public GetDailyBillRequest build() {
            return new GetDailyBillRequest(this);
        } 

    } 

}
