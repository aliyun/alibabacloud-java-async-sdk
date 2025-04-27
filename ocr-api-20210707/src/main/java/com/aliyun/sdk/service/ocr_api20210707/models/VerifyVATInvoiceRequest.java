// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

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
 * {@link VerifyVATInvoiceRequest} extends {@link RequestModel}
 *
 * <p>VerifyVATInvoiceRequest</p>
 */
public class VerifyVATInvoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceCode")
    private String invoiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invoiceDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceKind")
    private Integer invoiceKind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invoiceNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceSum")
    private String invoiceSum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private VerifyVATInvoiceRequest(Builder builder) {
        super(builder);
        this.invoiceCode = builder.invoiceCode;
        this.invoiceDate = builder.invoiceDate;
        this.invoiceKind = builder.invoiceKind;
        this.invoiceNo = builder.invoiceNo;
        this.invoiceSum = builder.invoiceSum;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyVATInvoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invoiceCode
     */
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    /**
     * @return invoiceDate
     */
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * @return invoiceKind
     */
    public Integer getInvoiceKind() {
        return this.invoiceKind;
    }

    /**
     * @return invoiceNo
     */
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    /**
     * @return invoiceSum
     */
    public String getInvoiceSum() {
        return this.invoiceSum;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<VerifyVATInvoiceRequest, Builder> {
        private String invoiceCode; 
        private String invoiceDate; 
        private Integer invoiceKind; 
        private String invoiceNo; 
        private String invoiceSum; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(VerifyVATInvoiceRequest request) {
            super(request);
            this.invoiceCode = request.invoiceCode;
            this.invoiceDate = request.invoiceDate;
            this.invoiceKind = request.invoiceKind;
            this.invoiceNo = request.invoiceNo;
            this.invoiceSum = request.invoiceSum;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * InvoiceCode.
         */
        public Builder invoiceCode(String invoiceCode) {
            this.putQueryParameter("InvoiceCode", invoiceCode);
            this.invoiceCode = invoiceCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder invoiceDate(String invoiceDate) {
            this.putQueryParameter("InvoiceDate", invoiceDate);
            this.invoiceDate = invoiceDate;
            return this;
        }

        /**
         * InvoiceKind.
         */
        public Builder invoiceKind(Integer invoiceKind) {
            this.putQueryParameter("InvoiceKind", invoiceKind);
            this.invoiceKind = invoiceKind;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder invoiceNo(String invoiceNo) {
            this.putQueryParameter("InvoiceNo", invoiceNo);
            this.invoiceNo = invoiceNo;
            return this;
        }

        /**
         * InvoiceSum.
         */
        public Builder invoiceSum(String invoiceSum) {
            this.putQueryParameter("InvoiceSum", invoiceSum);
            this.invoiceSum = invoiceSum;
            return this;
        }

        /**
         * VerifyCode.
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public VerifyVATInvoiceRequest build() {
            return new VerifyVATInvoiceRequest(this);
        } 

    } 

}
