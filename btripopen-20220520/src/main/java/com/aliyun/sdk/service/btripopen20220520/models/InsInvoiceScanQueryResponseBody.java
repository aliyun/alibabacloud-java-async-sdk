// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsInvoiceScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>InsInvoiceScanQueryResponseBody</p>
 */
public class InsInvoiceScanQueryResponseBody extends TeaModel {
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

    private InsInvoiceScanQueryResponseBody(Builder builder) {
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

    public static InsInvoiceScanQueryResponseBody create() {
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

        public InsInvoiceScanQueryResponseBody build() {
            return new InsInvoiceScanQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("amount_with_tax")
        private String amountWithTax;

        @NameInMap("amount_without_tax")
        private String amountWithoutTax;

        @NameInMap("bill_date")
        private String billDate;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("department")
        private String department;

        @NameInMap("insurance_company")
        private String insuranceCompany;

        @NameInMap("insurance_order_id")
        private String insuranceOrderId;

        @NameInMap("insurance_type")
        private String insuranceType;

        @NameInMap("invoice_code")
        private String invoiceCode;

        @NameInMap("invoice_day")
        private String invoiceDay;

        @NameInMap("invoice_no")
        private String invoiceNo;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("oss_url")
        private String ossUrl;

        @NameInMap("passenger")
        private String passenger;

        @NameInMap("project")
        private String project;

        @NameInMap("purchaser_name")
        private String purchaserName;

        @NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @NameInMap("real_invoice_title")
        private String realInvoiceTitle;

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
            this.costCenter = builder.costCenter;
            this.department = builder.department;
            this.insuranceCompany = builder.insuranceCompany;
            this.insuranceOrderId = builder.insuranceOrderId;
            this.insuranceType = builder.insuranceType;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDay = builder.invoiceDay;
            this.invoiceNo = builder.invoiceNo;
            this.orderId = builder.orderId;
            this.ossUrl = builder.ossUrl;
            this.passenger = builder.passenger;
            this.project = builder.project;
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.realInvoiceTitle = builder.realInvoiceTitle;
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
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return insuranceCompany
         */
        public String getInsuranceCompany() {
            return this.insuranceCompany;
        }

        /**
         * @return insuranceOrderId
         */
        public String getInsuranceOrderId() {
            return this.insuranceOrderId;
        }

        /**
         * @return insuranceType
         */
        public String getInsuranceType() {
            return this.insuranceType;
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
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return passenger
         */
        public String getPassenger() {
            return this.passenger;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
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
         * @return realInvoiceTitle
         */
        public String getRealInvoiceTitle() {
            return this.realInvoiceTitle;
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
            private String costCenter; 
            private String department; 
            private String insuranceCompany; 
            private String insuranceOrderId; 
            private String insuranceType; 
            private String invoiceCode; 
            private String invoiceDay; 
            private String invoiceNo; 
            private Long orderId; 
            private String ossUrl; 
            private String passenger; 
            private String project; 
            private String purchaserName; 
            private String purchaserTaxNo; 
            private String realInvoiceTitle; 
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
             * 成本中心
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * 部门
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 保险公司
             */
            public Builder insuranceCompany(String insuranceCompany) {
                this.insuranceCompany = insuranceCompany;
                return this;
            }

            /**
             * 保单号
             */
            public Builder insuranceOrderId(String insuranceOrderId) {
                this.insuranceOrderId = insuranceOrderId;
                return this;
            }

            /**
             * 险种
             */
            public Builder insuranceType(String insuranceType) {
                this.insuranceType = insuranceType;
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
             * 发票号码
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * 订单号
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
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
             * 乘机人
             */
            public Builder passenger(String passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * 项目
             */
            public Builder project(String project) {
                this.project = project;
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
             * 发票抬头
             */
            public Builder realInvoiceTitle(String realInvoiceTitle) {
                this.realInvoiceTitle = realInvoiceTitle;
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
