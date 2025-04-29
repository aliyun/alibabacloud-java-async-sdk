// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link MonthBillGetRequest} extends {@link RequestModel}
 *
 * <p>MonthBillGetRequest</p>
 */
public class MonthBillGetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_batch")
    private String billBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_month")
    private String billMonth;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private MonthBillGetRequest(Builder builder) {
        super(builder);
        this.billBatch = builder.billBatch;
        this.billMonth = builder.billMonth;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
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
     * @return billBatch
     */
    public String getBillBatch() {
        return this.billBatch;
    }

    /**
     * @return billMonth
     */
    public String getBillMonth() {
        return this.billMonth;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<MonthBillGetRequest, Builder> {
        private String billBatch; 
        private String billMonth; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(MonthBillGetRequest request) {
            super(request);
            this.billBatch = request.billBatch;
            this.billMonth = request.billMonth;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * bill_batch.
         */
        public Builder billBatch(String billBatch) {
            this.putQueryParameter("bill_batch", billBatch);
            this.billBatch = billBatch;
            return this;
        }

        /**
         * bill_month.
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("bill_month", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public MonthBillGetRequest build() {
            return new MonthBillGetRequest(this);
        } 

    } 

}
