// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateInvoiceRequest} extends {@link RequestModel}
 *
 * <p>CreateInvoiceRequest</p>
 */
public class CreateInvoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceCandidateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> invoiceCandidateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer invoiceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceRemark")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String invoiceRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceTitleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invoiceTitleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer invoiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecipientEmails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> recipientEmails;

    private CreateInvoiceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.invoiceCandidateIds = builder.invoiceCandidateIds;
        this.invoiceMode = builder.invoiceMode;
        this.invoiceRemark = builder.invoiceRemark;
        this.invoiceTitleId = builder.invoiceTitleId;
        this.invoiceType = builder.invoiceType;
        this.nbid = builder.nbid;
        this.recipientEmails = builder.recipientEmails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInvoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return invoiceCandidateIds
     */
    public java.util.List<String> getInvoiceCandidateIds() {
        return this.invoiceCandidateIds;
    }

    /**
     * @return invoiceMode
     */
    public Integer getInvoiceMode() {
        return this.invoiceMode;
    }

    /**
     * @return invoiceRemark
     */
    public String getInvoiceRemark() {
        return this.invoiceRemark;
    }

    /**
     * @return invoiceTitleId
     */
    public String getInvoiceTitleId() {
        return this.invoiceTitleId;
    }

    /**
     * @return invoiceType
     */
    public Integer getInvoiceType() {
        return this.invoiceType;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return recipientEmails
     */
    public java.util.List<String> getRecipientEmails() {
        return this.recipientEmails;
    }

    public static final class Builder extends Request.Builder<CreateInvoiceRequest, Builder> {
        private String amount; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private java.util.List<String> invoiceCandidateIds; 
        private Integer invoiceMode; 
        private String invoiceRemark; 
        private String invoiceTitleId; 
        private Integer invoiceType; 
        private String nbid; 
        private java.util.List<String> recipientEmails; 

        private Builder() {
            super();
        } 

        private Builder(CreateInvoiceRequest request) {
            super(request);
            this.amount = request.amount;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.invoiceCandidateIds = request.invoiceCandidateIds;
            this.invoiceMode = request.invoiceMode;
            this.invoiceRemark = request.invoiceRemark;
            this.invoiceTitleId = request.invoiceTitleId;
            this.invoiceType = request.invoiceType;
            this.nbid = request.nbid;
            this.recipientEmails = request.recipientEmails;
        } 

        /**
         * Amount.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder invoiceCandidateIds(java.util.List<String> invoiceCandidateIds) {
            String invoiceCandidateIdsShrink = shrink(invoiceCandidateIds, "InvoiceCandidateIds", "json");
            this.putQueryParameter("InvoiceCandidateIds", invoiceCandidateIdsShrink);
            this.invoiceCandidateIds = invoiceCandidateIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder invoiceMode(Integer invoiceMode) {
            this.putQueryParameter("InvoiceMode", invoiceMode);
            this.invoiceMode = invoiceMode;
            return this;
        }

        /**
         * InvoiceRemark.
         */
        public Builder invoiceRemark(String invoiceRemark) {
            this.putQueryParameter("InvoiceRemark", invoiceRemark);
            this.invoiceRemark = invoiceRemark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder invoiceTitleId(String invoiceTitleId) {
            this.putQueryParameter("InvoiceTitleId", invoiceTitleId);
            this.invoiceTitleId = invoiceTitleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder invoiceType(Integer invoiceType) {
            this.putQueryParameter("InvoiceType", invoiceType);
            this.invoiceType = invoiceType;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder recipientEmails(java.util.List<String> recipientEmails) {
            String recipientEmailsShrink = shrink(recipientEmails, "RecipientEmails", "json");
            this.putQueryParameter("RecipientEmails", recipientEmailsShrink);
            this.recipientEmails = recipientEmails;
            return this;
        }

        @Override
        public CreateInvoiceRequest build() {
            return new CreateInvoiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInvoiceRequest} extends {@link TeaModel}
     *
     * <p>CreateInvoiceRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIds model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
}
