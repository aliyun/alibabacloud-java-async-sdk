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
 * {@link InsInvoiceScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>InsInvoiceScanQueryResponseBody</p>
 */
public class InsInvoiceScanQueryResponseBody extends TeaModel {
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

        private Builder(InsInvoiceScanQueryResponseBody model) {
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
         * <p>210e847f16611516748613869de4f6</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public InsInvoiceScanQueryResponseBody build() {
            return new InsInvoiceScanQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>InsInvoiceScanQueryResponseBody</p>
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
             * <p>金额</p>
             * 
             * <strong>example:</strong>
             * <p>75.21</p>
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
             * <p>货物或应税劳务、服务名称</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>数量</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>规格型号</p>
             * 
             * <strong>example:</strong>
             * <p>66PT11230069</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>税额</p>
             * 
             * <strong>example:</strong>
             * <p>12.79</p>
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            /**
             * <p>税率</p>
             * 
             * <strong>example:</strong>
             * <p>17%</p>
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * <p>单位</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>单价</p>
             * 
             * <strong>example:</strong>
             * <p>75.21</p>
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
     * {@link InsInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>InsInvoiceScanQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount_with_tax")
        private String amountWithTax;

        @com.aliyun.core.annotation.NameInMap("amount_without_tax")
        private String amountWithoutTax;

        @com.aliyun.core.annotation.NameInMap("bill_date")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("check_code")
        private String checkCode;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("drawer")
        private String drawer;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("insurance_company")
        private String insuranceCompany;

        @com.aliyun.core.annotation.NameInMap("insurance_order_id")
        private String insuranceOrderId;

        @com.aliyun.core.annotation.NameInMap("insurance_type")
        private String insuranceType;

        @com.aliyun.core.annotation.NameInMap("invoice_code")
        private String invoiceCode;

        @com.aliyun.core.annotation.NameInMap("invoice_day")
        private String invoiceDay;

        @com.aliyun.core.annotation.NameInMap("invoice_details")
        private java.util.List<InvoiceDetails> invoiceDetails;

        @com.aliyun.core.annotation.NameInMap("invoice_location")
        private String invoiceLocation;

        @com.aliyun.core.annotation.NameInMap("invoice_no")
        private String invoiceNo;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("invoice_type")
        private Integer invoiceType;

        @com.aliyun.core.annotation.NameInMap("machine_code")
        private String machineCode;

        @com.aliyun.core.annotation.NameInMap("ofd_oss_url")
        private String ofdOssUrl;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("oss_url")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("passenger")
        private String passenger;

        @com.aliyun.core.annotation.NameInMap("password_area")
        private String passwordArea;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

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
            this.category = builder.category;
            this.checkCode = builder.checkCode;
            this.costCenter = builder.costCenter;
            this.department = builder.department;
            this.drawer = builder.drawer;
            this.id = builder.id;
            this.insuranceCompany = builder.insuranceCompany;
            this.insuranceOrderId = builder.insuranceOrderId;
            this.insuranceType = builder.insuranceType;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDay = builder.invoiceDay;
            this.invoiceDetails = builder.invoiceDetails;
            this.invoiceLocation = builder.invoiceLocation;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceTitle = builder.invoiceTitle;
            this.invoiceType = builder.invoiceType;
            this.machineCode = builder.machineCode;
            this.ofdOssUrl = builder.ofdOssUrl;
            this.orderId = builder.orderId;
            this.ossUrl = builder.ossUrl;
            this.passenger = builder.passenger;
            this.passwordArea = builder.passwordArea;
            this.project = builder.project;
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
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return checkCode
         */
        public String getCheckCode() {
            return this.checkCode;
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
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
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
         * @return passwordArea
         */
        public String getPasswordArea() {
            return this.passwordArea;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
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
            private Integer category; 
            private String checkCode; 
            private String costCenter; 
            private String department; 
            private String drawer; 
            private String id; 
            private String insuranceCompany; 
            private String insuranceOrderId; 
            private String insuranceType; 
            private String invoiceCode; 
            private String invoiceDay; 
            private java.util.List<InvoiceDetails> invoiceDetails; 
            private String invoiceLocation; 
            private String invoiceNo; 
            private String invoiceTitle; 
            private Integer invoiceType; 
            private String machineCode; 
            private String ofdOssUrl; 
            private Long orderId; 
            private String ossUrl; 
            private String passenger; 
            private String passwordArea; 
            private String project; 
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
                this.category = model.category;
                this.checkCode = model.checkCode;
                this.costCenter = model.costCenter;
                this.department = model.department;
                this.drawer = model.drawer;
                this.id = model.id;
                this.insuranceCompany = model.insuranceCompany;
                this.insuranceOrderId = model.insuranceOrderId;
                this.insuranceType = model.insuranceType;
                this.invoiceCode = model.invoiceCode;
                this.invoiceDay = model.invoiceDay;
                this.invoiceDetails = model.invoiceDetails;
                this.invoiceLocation = model.invoiceLocation;
                this.invoiceNo = model.invoiceNo;
                this.invoiceTitle = model.invoiceTitle;
                this.invoiceType = model.invoiceType;
                this.machineCode = model.machineCode;
                this.ofdOssUrl = model.ofdOssUrl;
                this.orderId = model.orderId;
                this.ossUrl = model.ossUrl;
                this.passenger = model.passenger;
                this.passwordArea = model.passwordArea;
                this.project = model.project;
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
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * <p>校验码</p>
             * 
             * <strong>example:</strong>
             * <p>07122942791187744475</p>
             */
            public Builder checkCode(String checkCode) {
                this.checkCode = checkCode;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>开票人</p>
             */
            public Builder drawer(String drawer) {
                this.drawer = drawer;
                return this;
            }

            /**
             * <p>应用ID</p>
             * 
             * <strong>example:</strong>
             * <p>566</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * insurance_company.
             */
            public Builder insuranceCompany(String insuranceCompany) {
                this.insuranceCompany = insuranceCompany;
                return this;
            }

            /**
             * insurance_order_id.
             */
            public Builder insuranceOrderId(String insuranceOrderId) {
                this.insuranceOrderId = insuranceOrderId;
                return this;
            }

            /**
             * insurance_type.
             */
            public Builder insuranceType(String insuranceType) {
                this.insuranceType = insuranceType;
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
             * <p>发票明细</p>
             */
            public Builder invoiceDetails(java.util.List<InvoiceDetails> invoiceDetails) {
                this.invoiceDetails = invoiceDetails;
                return this;
            }

            /**
             * <p>发票地区</p>
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
             * <p>发票抬头</p>
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
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
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
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
             * passenger.
             */
            public Builder passenger(String passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * <p>密码区</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;87*&gt;&gt;53&gt;5023&gt;-446&gt;/4+83/5* *&gt;5/81&lt;75/1931&gt;4&gt;&gt;</p>
             */
            public Builder passwordArea(String passwordArea) {
                this.passwordArea = passwordArea;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>购方银行信息</p>
             */
            public Builder purchaserBankAccountInfo(String purchaserBankAccountInfo) {
                this.purchaserBankAccountInfo = purchaserBankAccountInfo;
                return this;
            }

            /**
             * <p>购方联系方式</p>
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
             * <p>收款人</p>
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * <p>备注</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>复核人</p>
             */
            public Builder reviewer(String reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            /**
             * <p>销售方银行信息</p>
             */
            public Builder sellerBankAccountInfo(String sellerBankAccountInfo) {
                this.sellerBankAccountInfo = sellerBankAccountInfo;
                return this;
            }

            /**
             * <p>销售方联系方式</p>
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
             * <p>校验码</p>
             * 
             * <strong>example:</strong>
             * <p>4475</p>
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
             * <p>税率</p>
             * 
             * <strong>example:</strong>
             * <p>17%</p>
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * <p>大写金额</p>
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
     * {@link InsInvoiceScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>InsInvoiceScanQueryResponseBody</p>
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
