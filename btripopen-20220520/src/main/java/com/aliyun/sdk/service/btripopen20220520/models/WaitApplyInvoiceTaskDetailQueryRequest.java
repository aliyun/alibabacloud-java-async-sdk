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
 * {@link WaitApplyInvoiceTaskDetailQueryRequest} extends {@link RequestModel}
 *
 * <p>WaitApplyInvoiceTaskDetailQueryRequest</p>
 */
public class WaitApplyInvoiceTaskDetailQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billDate;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private WaitApplyInvoiceTaskDetailQueryRequest(Builder builder) {
        super(builder);
        this.billDate = builder.billDate;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WaitApplyInvoiceTaskDetailQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billDate
     */
    public String getBillDate() {
        return this.billDate;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<WaitApplyInvoiceTaskDetailQueryRequest, Builder> {
        private String billDate; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(WaitApplyInvoiceTaskDetailQueryRequest request) {
            super(request);
            this.billDate = request.billDate;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-01</p>
         */
        public Builder billDate(String billDate) {
            this.putQueryParameter("bill_date", billDate);
            this.billDate = billDate;
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
        public WaitApplyInvoiceTaskDetailQueryRequest build() {
            return new WaitApplyInvoiceTaskDetailQueryRequest(this);
        } 

    } 

}
