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
 * {@link BatchSubmitPreBillRequest} extends {@link RequestModel}
 *
 * <p>BatchSubmitPreBillRequest</p>
 */
public class BatchSubmitPreBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_ip")
    private String appIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_batch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("customer_decision")
    private Integer customerDecision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("values")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> values;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private BatchSubmitPreBillRequest(Builder builder) {
        super(builder);
        this.appIp = builder.appIp;
        this.billBatch = builder.billBatch;
        this.customerDecision = builder.customerDecision;
        this.dimension = builder.dimension;
        this.values = builder.values;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSubmitPreBillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIp
     */
    public String getAppIp() {
        return this.appIp;
    }

    /**
     * @return billBatch
     */
    public String getBillBatch() {
        return this.billBatch;
    }

    /**
     * @return customerDecision
     */
    public Integer getCustomerDecision() {
        return this.customerDecision;
    }

    /**
     * @return dimension
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<BatchSubmitPreBillRequest, Builder> {
        private String appIp; 
        private String billBatch; 
        private Integer customerDecision; 
        private Integer dimension; 
        private java.util.List<String> values; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSubmitPreBillRequest request) {
            super(request);
            this.appIp = request.appIp;
            this.billBatch = request.billBatch;
            this.customerDecision = request.customerDecision;
            this.dimension = request.dimension;
            this.values = request.values;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * app_ip.
         */
        public Builder appIp(String appIp) {
            this.putQueryParameter("app_ip", appIp);
            this.appIp = appIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-21</p>
         */
        public Builder billBatch(String billBatch) {
            this.putQueryParameter("bill_batch", billBatch);
            this.billBatch = billBatch;
            return this;
        }

        /**
         * customer_decision.
         */
        public Builder customerDecision(Integer customerDecision) {
            this.putQueryParameter("customer_decision", customerDecision);
            this.customerDecision = customerDecision;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dimension(Integer dimension) {
            this.putQueryParameter("dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder values(java.util.List<String> values) {
            String valuesShrink = shrink(values, "values", "json");
            this.putQueryParameter("values", valuesShrink);
            this.values = values;
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
        public BatchSubmitPreBillRequest build() {
            return new BatchSubmitPreBillRequest(this);
        } 

    } 

}
