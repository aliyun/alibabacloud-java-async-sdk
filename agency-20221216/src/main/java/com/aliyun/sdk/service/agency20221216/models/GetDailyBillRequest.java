// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDailyBillRequest} extends {@link RequestModel}
 *
 * <p>GetDailyBillRequest</p>
 */
public class GetDailyBillRequest extends Request {
    @Query
    @NameInMap("BillOwner")
    @Validation(required = true)
    private String billOwner;

    @Query
    @NameInMap("BillType")
    @Validation(required = true)
    private String billType;

    @Query
    @NameInMap("Date")
    @Validation(required = true)
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
