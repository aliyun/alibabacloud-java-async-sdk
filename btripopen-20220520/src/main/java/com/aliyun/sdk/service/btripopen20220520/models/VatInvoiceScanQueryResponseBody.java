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

    public static class InvoiceDetails extends TeaModel {
        @NameInMap("amount")
        private String amount;

        @NameInMap("index")
        private String index;

        @NameInMap("item_name")
        private String itemName;

        @NameInMap("quantity")
        private String quantity;

        @NameInMap("specification")
        private String specification;

        @NameInMap("tax")
        private String tax;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("unit")
        private String unit;

        @NameInMap("unit_price")
        private String unitPrice;

        private InvoiceDetails(Builder builder) {
            this.amount = builder.amount;
            this.index = builder.index;
            this.itemName = builder.itemName;
            this.quantity = builder.quantity;
            this.specification = builder.specification;
            this.tax = builder.tax;
            this.taxRate = builder.taxRate;
            this.unit = builder.unit;
            this.unitPrice = builder.unitPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return tax
         */
        public String getTax() {
            return this.tax;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return unitPrice
         */
        public String getUnitPrice() {
            return this.unitPrice;
        }

        public static final class Builder {
            private String amount; 
            private String index; 
            private String itemName; 
            private String quantity; 
            private String specification; 
            private String tax; 
            private String taxRate; 
            private String unit; 
            private String unitPrice; 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 行号
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * item_name.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * unit_price.
             */
            public Builder unitPrice(String unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            public InvoiceDetails build() {
                return new InvoiceDetails(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("amount_with_tax")
        private String amountWithTax;

        @NameInMap("amount_without_tax")
        private String amountWithoutTax;

        @NameInMap("bill_date")
        private String billDate;

        @NameInMap("check_code")
        private String checkCode;

        @NameInMap("drawer")
        private String drawer;

        @NameInMap("id")
        private String id;

        @NameInMap("invoice_code")
        private String invoiceCode;

        @NameInMap("invoice_day")
        private String invoiceDay;

        @NameInMap("invoice_detail")
        private String invoiceDetail;

        @NameInMap("invoice_details")
        private java.util.List < InvoiceDetails> invoiceDetails;

        @NameInMap("invoice_location")
        private String invoiceLocation;

        @NameInMap("invoice_no")
        private String invoiceNo;

        @NameInMap("invoice_sub_task_id")
        private Long invoiceSubTaskId;

        @NameInMap("invoice_type")
        private Integer invoiceType;

        @NameInMap("invoice_type_desc")
        private String invoiceTypeDesc;

        @NameInMap("machine_code")
        private String machineCode;

        @NameInMap("oss_url")
        private String ossUrl;

        @NameInMap("password_area")
        private String passwordArea;

        @NameInMap("purchaser_bank_account_info")
        private String purchaserBankAccountInfo;

        @NameInMap("purchaser_contact_info")
        private String purchaserContactInfo;

        @NameInMap("purchaser_name")
        private String purchaserName;

        @NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @NameInMap("recipient")
        private String recipient;

        @NameInMap("remarks")
        private String remarks;

        @NameInMap("reviewer")
        private String reviewer;

        @NameInMap("seller_bank_account_info")
        private String sellerBankAccountInfo;

        @NameInMap("seller_contact_info")
        private String sellerContactInfo;

        @NameInMap("seller_name")
        private String sellerName;

        @NameInMap("seller_tax_no")
        private String sellerTaxNo;

        @NameInMap("smart_check_code")
        private String smartCheckCode;

        @NameInMap("tax_amount")
        private String taxAmount;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("total_amount_in_words")
        private String totalAmountInWords;

        private Items(Builder builder) {
            this.amountWithTax = builder.amountWithTax;
            this.amountWithoutTax = builder.amountWithoutTax;
            this.billDate = builder.billDate;
            this.checkCode = builder.checkCode;
            this.drawer = builder.drawer;
            this.id = builder.id;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDay = builder.invoiceDay;
            this.invoiceDetail = builder.invoiceDetail;
            this.invoiceDetails = builder.invoiceDetails;
            this.invoiceLocation = builder.invoiceLocation;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceSubTaskId = builder.invoiceSubTaskId;
            this.invoiceType = builder.invoiceType;
            this.invoiceTypeDesc = builder.invoiceTypeDesc;
            this.machineCode = builder.machineCode;
            this.ossUrl = builder.ossUrl;
            this.passwordArea = builder.passwordArea;
            this.purchaserBankAccountInfo = builder.purchaserBankAccountInfo;
            this.purchaserContactInfo = builder.purchaserContactInfo;
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.recipient = builder.recipient;
            this.remarks = builder.remarks;
            this.reviewer = builder.reviewer;
            this.sellerBankAccountInfo = builder.sellerBankAccountInfo;
            this.sellerContactInfo = builder.sellerContactInfo;
            this.sellerName = builder.sellerName;
            this.sellerTaxNo = builder.sellerTaxNo;
            this.smartCheckCode = builder.smartCheckCode;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.totalAmountInWords = builder.totalAmountInWords;
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
         * @return checkCode
         */
        public String getCheckCode() {
            return this.checkCode;
        }

        /**
         * @return drawer
         */
        public String getDrawer() {
            return this.drawer;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return invoiceDetails
         */
        public java.util.List < InvoiceDetails> getInvoiceDetails() {
            return this.invoiceDetails;
        }

        /**
         * @return invoiceLocation
         */
        public String getInvoiceLocation() {
            return this.invoiceLocation;
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
         * @return machineCode
         */
        public String getMachineCode() {
            return this.machineCode;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return passwordArea
         */
        public String getPasswordArea() {
            return this.passwordArea;
        }

        /**
         * @return purchaserBankAccountInfo
         */
        public String getPurchaserBankAccountInfo() {
            return this.purchaserBankAccountInfo;
        }

        /**
         * @return purchaserContactInfo
         */
        public String getPurchaserContactInfo() {
            return this.purchaserContactInfo;
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
         * @return recipient
         */
        public String getRecipient() {
            return this.recipient;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return reviewer
         */
        public String getReviewer() {
            return this.reviewer;
        }

        /**
         * @return sellerBankAccountInfo
         */
        public String getSellerBankAccountInfo() {
            return this.sellerBankAccountInfo;
        }

        /**
         * @return sellerContactInfo
         */
        public String getSellerContactInfo() {
            return this.sellerContactInfo;
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
         * @return smartCheckCode
         */
        public String getSmartCheckCode() {
            return this.smartCheckCode;
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

        /**
         * @return totalAmountInWords
         */
        public String getTotalAmountInWords() {
            return this.totalAmountInWords;
        }

        public static final class Builder {
            private String amountWithTax; 
            private String amountWithoutTax; 
            private String billDate; 
            private String checkCode; 
            private String drawer; 
            private String id; 
            private String invoiceCode; 
            private String invoiceDay; 
            private String invoiceDetail; 
            private java.util.List < InvoiceDetails> invoiceDetails; 
            private String invoiceLocation; 
            private String invoiceNo; 
            private Long invoiceSubTaskId; 
            private Integer invoiceType; 
            private String invoiceTypeDesc; 
            private String machineCode; 
            private String ossUrl; 
            private String passwordArea; 
            private String purchaserBankAccountInfo; 
            private String purchaserContactInfo; 
            private String purchaserName; 
            private String purchaserTaxNo; 
            private String recipient; 
            private String remarks; 
            private String reviewer; 
            private String sellerBankAccountInfo; 
            private String sellerContactInfo; 
            private String sellerName; 
            private String sellerTaxNo; 
            private String smartCheckCode; 
            private String taxAmount; 
            private String taxRate; 
            private String totalAmountInWords; 

            /**
             * amount_with_tax.
             */
            public Builder amountWithTax(String amountWithTax) {
                this.amountWithTax = amountWithTax;
                return this;
            }

            /**
             * amount_without_tax.
             */
            public Builder amountWithoutTax(String amountWithoutTax) {
                this.amountWithoutTax = amountWithoutTax;
                return this;
            }

            /**
             * bill_date.
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * check_code.
             */
            public Builder checkCode(String checkCode) {
                this.checkCode = checkCode;
                return this;
            }

            /**
             * drawer.
             */
            public Builder drawer(String drawer) {
                this.drawer = drawer;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * invoice_code.
             */
            public Builder invoiceCode(String invoiceCode) {
                this.invoiceCode = invoiceCode;
                return this;
            }

            /**
             * invoice_day.
             */
            public Builder invoiceDay(String invoiceDay) {
                this.invoiceDay = invoiceDay;
                return this;
            }

            /**
             * invoice_detail.
             */
            public Builder invoiceDetail(String invoiceDetail) {
                this.invoiceDetail = invoiceDetail;
                return this;
            }

            /**
             * invoice_details.
             */
            public Builder invoiceDetails(java.util.List < InvoiceDetails> invoiceDetails) {
                this.invoiceDetails = invoiceDetails;
                return this;
            }

            /**
             * invoice_location.
             */
            public Builder invoiceLocation(String invoiceLocation) {
                this.invoiceLocation = invoiceLocation;
                return this;
            }

            /**
             * invoice_no.
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * invoice_sub_task_id.
             */
            public Builder invoiceSubTaskId(Long invoiceSubTaskId) {
                this.invoiceSubTaskId = invoiceSubTaskId;
                return this;
            }

            /**
             * invoice_type.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * invoice_type_desc.
             */
            public Builder invoiceTypeDesc(String invoiceTypeDesc) {
                this.invoiceTypeDesc = invoiceTypeDesc;
                return this;
            }

            /**
             * 机器码
             */
            public Builder machineCode(String machineCode) {
                this.machineCode = machineCode;
                return this;
            }

            /**
             * oss_url.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * password_area.
             */
            public Builder passwordArea(String passwordArea) {
                this.passwordArea = passwordArea;
                return this;
            }

            /**
             * purchaser_bank_account_info.
             */
            public Builder purchaserBankAccountInfo(String purchaserBankAccountInfo) {
                this.purchaserBankAccountInfo = purchaserBankAccountInfo;
                return this;
            }

            /**
             * purchaser_contact_info.
             */
            public Builder purchaserContactInfo(String purchaserContactInfo) {
                this.purchaserContactInfo = purchaserContactInfo;
                return this;
            }

            /**
             * purchaser_name.
             */
            public Builder purchaserName(String purchaserName) {
                this.purchaserName = purchaserName;
                return this;
            }

            /**
             * purchaser_tax_no.
             */
            public Builder purchaserTaxNo(String purchaserTaxNo) {
                this.purchaserTaxNo = purchaserTaxNo;
                return this;
            }

            /**
             * recipient.
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * reviewer.
             */
            public Builder reviewer(String reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            /**
             * seller_bank_account_info.
             */
            public Builder sellerBankAccountInfo(String sellerBankAccountInfo) {
                this.sellerBankAccountInfo = sellerBankAccountInfo;
                return this;
            }

            /**
             * seller_contact_info.
             */
            public Builder sellerContactInfo(String sellerContactInfo) {
                this.sellerContactInfo = sellerContactInfo;
                return this;
            }

            /**
             * seller_name.
             */
            public Builder sellerName(String sellerName) {
                this.sellerName = sellerName;
                return this;
            }

            /**
             * seller_tax_no.
             */
            public Builder sellerTaxNo(String sellerTaxNo) {
                this.sellerTaxNo = sellerTaxNo;
                return this;
            }

            /**
             * smart_check_code.
             */
            public Builder smartCheckCode(String smartCheckCode) {
                this.smartCheckCode = smartCheckCode;
                return this;
            }

            /**
             * tax_amount.
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * total_amount_in_words.
             */
            public Builder totalAmountInWords(String totalAmountInWords) {
                this.totalAmountInWords = totalAmountInWords;
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
