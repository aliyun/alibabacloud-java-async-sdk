// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VatInvoiceScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>VatInvoiceScanQueryResponseBody</p>
 */
public class VatInvoiceScanQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private VatInvoiceScanQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VatInvoiceScanQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public VatInvoiceScanQueryResponseBody build() {
            return new VatInvoiceScanQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("amount_with_tax")
        private String amountWithTax;

        @NameInMap("amount_without_tax")
        private String amountWithoutTax;

        @NameInMap("bill_date")
        private String billDate;

        @NameInMap("invoice_code")
        private String invoiceCode;

        @NameInMap("invoice_day")
        private String invoiceDay;

        @NameInMap("invoice_detail")
        private String invoiceDetail;

        @NameInMap("invoice_no")
        private String invoiceNo;

        @NameInMap("invoice_sub_task_id")
        private Long invoiceSubTaskId;

        @NameInMap("invoice_type")
        private Integer invoiceType;

        @NameInMap("invoice_type_desc")
        private String invoiceTypeDesc;

        @NameInMap("oss_url")
        private String ossUrl;

        @NameInMap("purchaser_name")
        private String purchaserName;

        @NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @NameInMap("seller_name")
        private String sellerName;

        @NameInMap("seller_tax_no")
        private String sellerTaxNo;

        @NameInMap("tax_amount")
        private String taxAmount;

        @NameInMap("tax_rate")
        private String taxRate;

        private Items(Builder builder) {
            this.amountWithTax = builder.amountWithTax;
            this.amountWithoutTax = builder.amountWithoutTax;
            this.billDate = builder.billDate;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDay = builder.invoiceDay;
            this.invoiceDetail = builder.invoiceDetail;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceSubTaskId = builder.invoiceSubTaskId;
            this.invoiceType = builder.invoiceType;
            this.invoiceTypeDesc = builder.invoiceTypeDesc;
            this.ossUrl = builder.ossUrl;
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.sellerName = builder.sellerName;
            this.sellerTaxNo = builder.sellerTaxNo;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return amountWithTax
         */
        public String getAmountWithTax() {
            return this.amountWithTax;
        }

        /**
         * @return amountWithoutTax
         */
        public String getAmountWithoutTax() {
            return this.amountWithoutTax;
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return invoiceCode
         */
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        /**
         * @return invoiceDay
         */
        public String getInvoiceDay() {
            return this.invoiceDay;
        }

        /**
         * @return invoiceDetail
         */
        public String getInvoiceDetail() {
            return this.invoiceDetail;
        }

        /**
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return invoiceSubTaskId
         */
        public Long getInvoiceSubTaskId() {
            return this.invoiceSubTaskId;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return invoiceTypeDesc
         */
        public String getInvoiceTypeDesc() {
            return this.invoiceTypeDesc;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return purchaserName
         */
        public String getPurchaserName() {
            return this.purchaserName;
        }

        /**
         * @return purchaserTaxNo
         */
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        /**
         * @return sellerName
         */
        public String getSellerName() {
            return this.sellerName;
        }

        /**
         * @return sellerTaxNo
         */
        public String getSellerTaxNo() {
            return this.sellerTaxNo;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        public static final class Builder {
            private String amountWithTax; 
            private String amountWithoutTax; 
            private String billDate; 
            private String invoiceCode; 
            private String invoiceDay; 
            private String invoiceDetail; 
            private String invoiceNo; 
            private Long invoiceSubTaskId; 
            private Integer invoiceType; 
            private String invoiceTypeDesc; 
            private String ossUrl; 
            private String purchaserName; 
            private String purchaserTaxNo; 
            private String sellerName; 
            private String sellerTaxNo; 
            private String taxAmount; 
            private String taxRate; 

            /**
             * 价税合计金额
             */
            public Builder amountWithTax(String amountWithTax) {
                this.amountWithTax = amountWithTax;
                return this;
            }

            /**
             * 不含税金额
             */
            public Builder amountWithoutTax(String amountWithoutTax) {
                this.amountWithoutTax = amountWithoutTax;
                return this;
            }

            /**
             * 出账日
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * 发票代码
             */
            public Builder invoiceCode(String invoiceCode) {
                this.invoiceCode = invoiceCode;
                return this;
            }

            /**
             * 开票日期
             */
            public Builder invoiceDay(String invoiceDay) {
                this.invoiceDay = invoiceDay;
                return this;
            }

            /**
             * 开票详情
             */
            public Builder invoiceDetail(String invoiceDetail) {
                this.invoiceDetail = invoiceDetail;
                return this;
            }

            /**
             * 发票号码
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * 发票子任务id
             */
            public Builder invoiceSubTaskId(Long invoiceSubTaskId) {
                this.invoiceSubTaskId = invoiceSubTaskId;
                return this;
            }

            /**
             * 发票类型
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * 发票类型描述
             */
            public Builder invoiceTypeDesc(String invoiceTypeDesc) {
                this.invoiceTypeDesc = invoiceTypeDesc;
                return this;
            }

            /**
             * 图片地址，专票已邮寄前为空，普票已开票前为空
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * 购方名称
             */
            public Builder purchaserName(String purchaserName) {
                this.purchaserName = purchaserName;
                return this;
            }

            /**
             * 购方税号
             */
            public Builder purchaserTaxNo(String purchaserTaxNo) {
                this.purchaserTaxNo = purchaserTaxNo;
                return this;
            }

            /**
             * 销方名称
             */
            public Builder sellerName(String sellerName) {
                this.sellerName = sellerName;
                return this;
            }

            /**
             * 销方税号
             */
            public Builder sellerTaxNo(String sellerTaxNo) {
                this.sellerTaxNo = sellerTaxNo;
                return this;
            }

            /**
             * 税额
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * 税率
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("items")
        private java.util.List < Items> items;

        @NameInMap("page_no")
        private Integer pageNo;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_page")
        private Integer totalPage;

        @NameInMap("total_size")
        private Integer totalSize;

        private Module(Builder builder) {
            this.items = builder.items;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalPage = builder.totalPage;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer totalPage; 
            private Integer totalSize; 

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page_no.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_page.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
