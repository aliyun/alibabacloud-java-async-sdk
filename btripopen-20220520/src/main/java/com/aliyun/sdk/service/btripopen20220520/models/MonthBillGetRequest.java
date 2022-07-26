// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonthBillGetRequest} extends {@link RequestModel}
 *
 * <p>MonthBillGetRequest</p>
 */
public class MonthBillGetRequest extends Request {
    @Query
    @NameInMap("bill_month")
    private String billMonth;

    private MonthBillGetRequest(Builder builder) {
        super(builder);
        this.billMonth = builder.billMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonthBillGetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billMonth
     */
    public String getBillMonth() {
        return this.billMonth;
    }

    public static final class Builder extends Request.Builder<MonthBillGetRequest, Builder> {
        private String billMonth; 

        private Builder() {
            super();
        } 

        private Builder(MonthBillGetRequest request) {
            super(request);
            this.billMonth = request.billMonth;
        } 

        /**
         * YYYY-MM 出账月份
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("bill_month", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        @Override
        public MonthBillGetRequest build() {
            return new MonthBillGetRequest(this);
        } 

    } 

}
