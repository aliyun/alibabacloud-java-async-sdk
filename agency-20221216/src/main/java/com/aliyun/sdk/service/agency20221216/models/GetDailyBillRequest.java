// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
         * <p>Bill Owner type. Value Range:</br>
         * 1: Master account</br>
         * 2: Sub account</br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder billOwner(String billOwner) {
            this.putQueryParameter("BillOwner", billOwner);
            this.billOwner = billOwner;
            return this;
        }

        /**
         * <p>BillType. Value Range:</br></p>
         * <ul>
         * <li>DailyOrder(Deprecated)</li>
         * <li>DailyBill (Deprecated)</li>
         * <li>DailyInstanceBill (Deprecated)</li>
         * <li>DailyInstanceBillV2</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DailyInstanceBillV2</p>
         */
        public Builder billType(String billType) {
            this.putQueryParameter("BillType", billType);
            this.billType = billType;
            return this;
        }

        /**
         * <p>Billing date. Format YYYY-MM-DD</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-24</p>
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
