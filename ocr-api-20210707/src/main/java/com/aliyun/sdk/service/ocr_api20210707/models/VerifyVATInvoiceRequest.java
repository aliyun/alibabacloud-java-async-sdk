// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyVATInvoiceRequest} extends {@link RequestModel}
 *
 * <p>VerifyVATInvoiceRequest</p>
 */
public class VerifyVATInvoiceRequest extends Request {
    @Query
    @NameInMap("InvoiceCode")
    private String invoiceCode;

    @Query
    @NameInMap("InvoiceDate")
    @Validation(required = true)
    private String invoiceDate;

    @Query
    @NameInMap("InvoiceKind")
    private Integer invoiceKind;

    @Query
    @NameInMap("InvoiceNo")
    @Validation(required = true)
    private String invoiceNo;

    @Query
    @NameInMap("InvoiceSum")
    private String invoiceSum;

    @Query
    @NameInMap("VerifyCode")
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
         * InvoiceDate.
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
         * InvoiceNo.
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
