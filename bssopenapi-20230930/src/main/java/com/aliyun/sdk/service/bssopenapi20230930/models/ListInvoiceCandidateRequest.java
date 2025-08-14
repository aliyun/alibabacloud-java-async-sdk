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
 * {@link ListInvoiceCandidateRequest} extends {@link RequestModel}
 *
 * <p>ListInvoiceCandidateRequest</p>
 */
public class ListInvoiceCandidateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycles")
    private java.util.List<Integer> billingCycles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessIds")
    private java.util.List<String> businessIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceIssuers")
    private java.util.List<String> invoiceIssuers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<Integer> status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<Integer> types;

    private ListInvoiceCandidateRequest(Builder builder) {
        super(builder);
        this.billingCycles = builder.billingCycles;
        this.businessIds = builder.businessIds;
        this.currentPage = builder.currentPage;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.endTime = builder.endTime;
        this.invoiceIssuers = builder.invoiceIssuers;
        this.nbid = builder.nbid;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvoiceCandidateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingCycles
     */
    public java.util.List<Integer> getBillingCycles() {
        return this.billingCycles;
    }

    /**
     * @return businessIds
     */
    public java.util.List<String> getBusinessIds() {
        return this.businessIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return invoiceIssuers
     */
    public java.util.List<String> getInvoiceIssuers() {
        return this.invoiceIssuers;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public java.util.List<Integer> getStatus() {
        return this.status;
    }

    /**
     * @return types
     */
    public java.util.List<Integer> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListInvoiceCandidateRequest, Builder> {
        private java.util.List<Integer> billingCycles; 
        private java.util.List<String> businessIds; 
        private Integer currentPage; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String endTime; 
        private java.util.List<String> invoiceIssuers; 
        private String nbid; 
        private Integer pageSize; 
        private String startTime; 
        private java.util.List<Integer> status; 
        private java.util.List<Integer> types; 

        private Builder() {
            super();
        } 

        private Builder(ListInvoiceCandidateRequest request) {
            super(request);
            this.billingCycles = request.billingCycles;
            this.businessIds = request.businessIds;
            this.currentPage = request.currentPage;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.endTime = request.endTime;
            this.invoiceIssuers = request.invoiceIssuers;
            this.nbid = request.nbid;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.types = request.types;
        } 

        /**
         * BillingCycles.
         */
        public Builder billingCycles(java.util.List<Integer> billingCycles) {
            String billingCyclesShrink = shrink(billingCycles, "BillingCycles", "json");
            this.putQueryParameter("BillingCycles", billingCyclesShrink);
            this.billingCycles = billingCycles;
            return this;
        }

        /**
         * BusinessIds.
         */
        public Builder businessIds(java.util.List<String> businessIds) {
            String businessIdsShrink = shrink(businessIds, "BusinessIds", "json");
            this.putQueryParameter("BusinessIds", businessIdsShrink);
            this.businessIds = businessIds;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InvoiceIssuers.
         */
        public Builder invoiceIssuers(java.util.List<String> invoiceIssuers) {
            String invoiceIssuersShrink = shrink(invoiceIssuers, "InvoiceIssuers", "json");
            this.putQueryParameter("InvoiceIssuers", invoiceIssuersShrink);
            this.invoiceIssuers = invoiceIssuers;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List<Integer> status) {
            String statusShrink = shrink(status, "Status", "json");
            this.putQueryParameter("Status", statusShrink);
            this.status = status;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List<Integer> types) {
            String typesShrink = shrink(types, "Types", "json");
            this.putQueryParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListInvoiceCandidateRequest build() {
            return new ListInvoiceCandidateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInvoiceCandidateRequest} extends {@link TeaModel}
     *
     * <p>ListInvoiceCandidateRequest</p>
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
