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
 * {@link MonthBillSplitGetRequest} extends {@link RequestModel}
 *
 * <p>MonthBillSplitGetRequest</p>
 */
public class MonthBillSplitGetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_batch")
    private String billBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_month")
    private String billMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_split_key_list")
    private java.util.List<String> billSplitKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_split_mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billSplitMode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private MonthBillSplitGetRequest(Builder builder) {
        super(builder);
        this.billBatch = builder.billBatch;
        this.billMonth = builder.billMonth;
        this.billSplitKeyList = builder.billSplitKeyList;
        this.billSplitMode = builder.billSplitMode;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonthBillSplitGetRequest create() {
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
     * @return billSplitKeyList
     */
    public java.util.List<String> getBillSplitKeyList() {
        return this.billSplitKeyList;
    }

    /**
     * @return billSplitMode
     */
    public String getBillSplitMode() {
        return this.billSplitMode;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<MonthBillSplitGetRequest, Builder> {
        private String billBatch; 
        private String billMonth; 
        private java.util.List<String> billSplitKeyList; 
        private String billSplitMode; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(MonthBillSplitGetRequest request) {
            super(request);
            this.billBatch = request.billBatch;
            this.billMonth = request.billMonth;
            this.billSplitKeyList = request.billSplitKeyList;
            this.billSplitMode = request.billSplitMode;
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
         * bill_split_key_list.
         */
        public Builder billSplitKeyList(java.util.List<String> billSplitKeyList) {
            String billSplitKeyListShrink = shrink(billSplitKeyList, "bill_split_key_list", "json");
            this.putQueryParameter("bill_split_key_list", billSplitKeyListShrink);
            this.billSplitKeyList = billSplitKeyList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>by_invoice_third_part_id</p>
         */
        public Builder billSplitMode(String billSplitMode) {
            this.putQueryParameter("bill_split_mode", billSplitMode);
            this.billSplitMode = billSplitMode;
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
        public MonthBillSplitGetRequest build() {
            return new MonthBillSplitGetRequest(this);
        } 

    } 

}
