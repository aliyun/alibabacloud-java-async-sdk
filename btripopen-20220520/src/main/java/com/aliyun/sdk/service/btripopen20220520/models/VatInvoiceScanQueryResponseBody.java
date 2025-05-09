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
 * {@link VatInvoiceScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>VatInvoiceScanQueryResponseBody</p>
 */
public class VatInvoiceScanQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(VatInvoiceScanQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210e842b16611337974412836dae27</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public VatInvoiceScanQueryResponseBody build() {
            return new VatInvoiceScanQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VatInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>VatInvoiceScanQueryResponseBody</p>
     */
    public static class InvoiceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("item_name")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("tax")
        private String tax;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("unit_price")
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

            private Builder() {
            } 

            private Builder(InvoiceDetails model) {
                this.amount = model.amount;
                this.index = model.index;
                this.itemName = model.itemName;
                this.quantity = model.quantity;
                this.specification = model.specification;
                this.tax = model.tax;
                this.taxRate = model.taxRate;
                this.unit = model.unit;
                this.unitPrice = model.unitPrice;
            } 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>行号</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link VatInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>VatInvoiceScanQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount_with_tax")
        private String amountWithTax;

        @com.aliyun.core.annotation.NameInMap("amount_without_tax")
        private String amountWithoutTax;

        @com.aliyun.core.annotation.NameInMap("bill_date")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("check_code")
        private String checkCode;

        @com.aliyun.core.annotation.NameInMap("drawer")
        private String drawer;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("invoice_code")
        private String invoiceCode;

        @com.aliyun.core.annotation.NameInMap("invoice_day")
        private String invoiceDay;

        @com.aliyun.core.annotation.NameInMap("invoice_detail")
        private String invoiceDetail;

        @com.aliyun.core.annotation.NameInMap("invoice_details")
        private java.util.List<InvoiceDetails> invoiceDetails;

        @com.aliyun.core.annotation.NameInMap("invoice_location")
        private String invoiceLocation;

        @com.aliyun.core.annotation.NameInMap("invoice_no")
        private String invoiceNo;

        @com.aliyun.core.annotation.NameInMap("invoice_sub_task_id")
        private Long invoiceSubTaskId;

        @com.aliyun.core.annotation.NameInMap("invoice_type")
        private Integer invoiceType;

        @com.aliyun.core.annotation.NameInMap("invoice_type_desc")
        private String invoiceTypeDesc;

        @com.aliyun.core.annotation.NameInMap("machine_code")
        private String machineCode;

        @com.aliyun.core.annotation.NameInMap("ofd_oss_url")
        private String ofdOssUrl;

        @com.aliyun.core.annotation.NameInMap("oss_url")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("password_area")
        private String passwordArea;

        @com.aliyun.core.annotation.NameInMap("pdf_oss_url")
        private String pdfOssUrl;

        @com.aliyun.core.annotation.NameInMap("purchaser_bank_account_info")
        private String purchaserBankAccountInfo;

        @com.aliyun.core.annotation.NameInMap("purchaser_contact_info")
        private String purchaserContactInfo;

        @com.aliyun.core.annotation.NameInMap("purchaser_name")
        private String purchaserName;

        @com.aliyun.core.annotation.NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @com.aliyun.core.annotation.NameInMap("recipient")
        private String recipient;

        @com.aliyun.core.annotation.NameInMap("remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("reviewer")
        private String reviewer;

        @com.aliyun.core.annotation.NameInMap("seller_bank_account_info")
        private String sellerBankAccountInfo;

        @com.aliyun.core.annotation.NameInMap("seller_contact_info")
        private String sellerContactInfo;

        @com.aliyun.core.annotation.NameInMap("seller_name")
        private String sellerName;

        @com.aliyun.core.annotation.NameInMap("seller_tax_no")
        private String sellerTaxNo;

        @com.aliyun.core.annotation.NameInMap("smart_check_code")
        private String smartCheckCode;

        @com.aliyun.core.annotation.NameInMap("tax_amount")
        private String taxAmount;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("total_amount_in_words")
        private String totalAmountInWords;

        @com.aliyun.core.annotation.NameInMap("xml_oss_url")
        private String xmlOssUrl;

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
            this.ofdOssUrl = builder.ofdOssUrl;
            this.ossUrl = builder.ossUrl;
            this.passwordArea = builder.passwordArea;
            this.pdfOssUrl = builder.pdfOssUrl;
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
            this.xmlOssUrl = builder.xmlOssUrl;
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
        public java.util.List<InvoiceDetails> getInvoiceDetails() {
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
         * @return ofdOssUrl
         */
        public String getOfdOssUrl() {
            return this.ofdOssUrl;
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
         * @return pdfOssUrl
         */
        public String getPdfOssUrl() {
            return this.pdfOssUrl;
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

        /**
         * @return xmlOssUrl
         */
        public String getXmlOssUrl() {
            return this.xmlOssUrl;
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
            private java.util.List<InvoiceDetails> invoiceDetails; 
            private String invoiceLocation; 
            private String invoiceNo; 
            private Long invoiceSubTaskId; 
            private Integer invoiceType; 
            private String invoiceTypeDesc; 
            private String machineCode; 
            private String ofdOssUrl; 
            private String ossUrl; 
            private String passwordArea; 
            private String pdfOssUrl; 
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
            private String xmlOssUrl; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.amountWithTax = model.amountWithTax;
                this.amountWithoutTax = model.amountWithoutTax;
                this.billDate = model.billDate;
                this.checkCode = model.checkCode;
                this.drawer = model.drawer;
                this.id = model.id;
                this.invoiceCode = model.invoiceCode;
                this.invoiceDay = model.invoiceDay;
                this.invoiceDetail = model.invoiceDetail;
                this.invoiceDetails = model.invoiceDetails;
                this.invoiceLocation = model.invoiceLocation;
                this.invoiceNo = model.invoiceNo;
                this.invoiceSubTaskId = model.invoiceSubTaskId;
                this.invoiceType = model.invoiceType;
                this.invoiceTypeDesc = model.invoiceTypeDesc;
                this.machineCode = model.machineCode;
                this.ofdOssUrl = model.ofdOssUrl;
                this.ossUrl = model.ossUrl;
                this.passwordArea = model.passwordArea;
                this.pdfOssUrl = model.pdfOssUrl;
                this.purchaserBankAccountInfo = model.purchaserBankAccountInfo;
                this.purchaserContactInfo = model.purchaserContactInfo;
                this.purchaserName = model.purchaserName;
                this.purchaserTaxNo = model.purchaserTaxNo;
                this.recipient = model.recipient;
                this.remarks = model.remarks;
                this.reviewer = model.reviewer;
                this.sellerBankAccountInfo = model.sellerBankAccountInfo;
                this.sellerContactInfo = model.sellerContactInfo;
                this.sellerName = model.sellerName;
                this.sellerTaxNo = model.sellerTaxNo;
                this.smartCheckCode = model.smartCheckCode;
                this.taxAmount = model.taxAmount;
                this.taxRate = model.taxRate;
                this.totalAmountInWords = model.totalAmountInWords;
                this.xmlOssUrl = model.xmlOssUrl;
            } 

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
            public Builder invoiceDetails(java.util.List<InvoiceDetails> invoiceDetails) {
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
             * <p>机器码</p>
             * 
             * <strong>example:</strong>
             * <p>661619906841</p>
             */
            public Builder machineCode(String machineCode) {
                this.machineCode = machineCode;
                return this;
            }

            /**
             * ofd_oss_url.
             */
            public Builder ofdOssUrl(String ofdOssUrl) {
                this.ofdOssUrl = ofdOssUrl;
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
             * pdf_oss_url.
             */
            public Builder pdfOssUrl(String pdfOssUrl) {
                this.pdfOssUrl = pdfOssUrl;
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

            /**
             * xml_oss_url.
             */
            public Builder xmlOssUrl(String xmlOssUrl) {
                this.xmlOssUrl = xmlOssUrl;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link VatInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>VatInvoiceScanQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page_no")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("total_size")
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
        public java.util.List<Items> getItems() {
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
            private java.util.List<Items> items; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer totalPage; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.items = model.items;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalPage = model.totalPage;
                this.totalSize = model.totalSize;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
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
