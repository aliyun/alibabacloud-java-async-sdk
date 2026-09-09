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
 * {@link ListInvoiceCandidateResponseBody} extends {@link TeaModel}
 *
 * <p>ListInvoiceCandidateResponseBody</p>
 */
public class ListInvoiceCandidateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInvoiceCandidateResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvoiceCandidateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Object metadata; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInvoiceCandidateResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.metadata = model.metadata;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of data entries.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The metadata of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInvoiceCandidateResponseBody build() {
            return new ListInvoiceCandidateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInvoiceCandidateResponseBody} extends {@link TeaModel}
     *
     * <p>ListInvoiceCandidateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptedOffsetAmount")
        private String acceptedOffsetAmount;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private Integer billingCycle;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private String businessId;

        @com.aliyun.core.annotation.NameInMap("BusinessTime")
        private String businessTime;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InvoiceIssuer")
        private String invoiceIssuer;

        @com.aliyun.core.annotation.NameInMap("InvoiceableAmount")
        private String invoiceableAmount;

        @com.aliyun.core.annotation.NameInMap("InvoicedAmount")
        private String invoicedAmount;

        @com.aliyun.core.annotation.NameInMap("OffsetAmount")
        private String offsetAmount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccountId")
        private Long resourceOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccountName")
        private String resourceOwnerAccountName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.acceptedOffsetAmount = builder.acceptedOffsetAmount;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.billingCycle = builder.billingCycle;
            this.businessId = builder.businessId;
            this.businessTime = builder.businessTime;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.invoiceIssuer = builder.invoiceIssuer;
            this.invoiceableAmount = builder.invoiceableAmount;
            this.invoicedAmount = builder.invoicedAmount;
            this.offsetAmount = builder.offsetAmount;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.resourceOwnerAccountId = builder.resourceOwnerAccountId;
            this.resourceOwnerAccountName = builder.resourceOwnerAccountName;
            this.status = builder.status;
            this.totalAmount = builder.totalAmount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acceptedOffsetAmount
         */
        public String getAcceptedOffsetAmount() {
            return this.acceptedOffsetAmount;
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return billingCycle
         */
        public Integer getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return invoiceIssuer
         */
        public String getInvoiceIssuer() {
            return this.invoiceIssuer;
        }

        /**
         * @return invoiceableAmount
         */
        public String getInvoiceableAmount() {
            return this.invoiceableAmount;
        }

        /**
         * @return invoicedAmount
         */
        public String getInvoicedAmount() {
            return this.invoicedAmount;
        }

        /**
         * @return offsetAmount
         */
        public String getOffsetAmount() {
            return this.offsetAmount;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return resourceOwnerAccountId
         */
        public Long getResourceOwnerAccountId() {
            return this.resourceOwnerAccountId;
        }

        /**
         * @return resourceOwnerAccountName
         */
        public String getResourceOwnerAccountName() {
            return this.resourceOwnerAccountName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String acceptedOffsetAmount; 
            private Long accountId; 
            private String accountName; 
            private Integer billingCycle; 
            private String businessId; 
            private String businessTime; 
            private String commodityCode; 
            private String commodityName; 
            private String createTime; 
            private String id; 
            private String invoiceIssuer; 
            private String invoiceableAmount; 
            private String invoicedAmount; 
            private String offsetAmount; 
            private String productCode; 
            private String productName; 
            private Long resourceOwnerAccountId; 
            private String resourceOwnerAccountName; 
            private Integer status; 
            private String totalAmount; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acceptedOffsetAmount = model.acceptedOffsetAmount;
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.billingCycle = model.billingCycle;
                this.businessId = model.businessId;
                this.businessTime = model.businessTime;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.createTime = model.createTime;
                this.id = model.id;
                this.invoiceIssuer = model.invoiceIssuer;
                this.invoiceableAmount = model.invoiceableAmount;
                this.invoicedAmount = model.invoicedAmount;
                this.offsetAmount = model.offsetAmount;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.resourceOwnerAccountId = model.resourceOwnerAccountId;
                this.resourceOwnerAccountName = model.resourceOwnerAccountName;
                this.status = model.status;
                this.totalAmount = model.totalAmount;
                this.type = model.type;
            } 

            /**
             * <p>The accepted offset amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder acceptedOffsetAmount(String acceptedOffsetAmount) {
                this.acceptedOffsetAmount = acceptedOffsetAmount;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1990699401005016</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试账号</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The billing cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>202506</p>
             */
            public Builder billingCycle(Integer billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The business document number.</p>
             * 
             * <strong>example:</strong>
             * <p>202506</p>
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The time when the business event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-01 00:00:00</p>
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>pts</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity name.</p>
             * 
             * <strong>example:</strong>
             * <p>性能测试</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-91 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the invoice candidate.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The invoice issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_SERVICE</p>
             */
            public Builder invoiceIssuer(String invoiceIssuer) {
                this.invoiceIssuer = invoiceIssuer;
                return this;
            }

            /**
             * <p>The invoiceable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder invoiceableAmount(String invoiceableAmount) {
                this.invoiceableAmount = invoiceableAmount;
                return this;
            }

            /**
             * <p>The invoiced amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder invoicedAmount(String invoicedAmount) {
                this.invoicedAmount = invoicedAmount;
                return this;
            }

            /**
             * <p>The offset amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder offsetAmount(String offsetAmount) {
                this.offsetAmount = offsetAmount;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>pts</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>性能测试</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The ID of the resource owner account.</p>
             * 
             * <strong>example:</strong>
             * <p>1990699401005016</p>
             */
            public Builder resourceOwnerAccountId(Long resourceOwnerAccountId) {
                this.resourceOwnerAccountId = resourceOwnerAccountId;
                return this;
            }

            /**
             * <p>The name of the resource owner account.</p>
             * 
             * <strong>example:</strong>
             * <p>测试账号</p>
             */
            public Builder resourceOwnerAccountName(String resourceOwnerAccountName) {
                this.resourceOwnerAccountName = resourceOwnerAccountName;
                return this;
            }

            /**
             * <p>The status of the invoice candidate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The type of the invoice candidate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
