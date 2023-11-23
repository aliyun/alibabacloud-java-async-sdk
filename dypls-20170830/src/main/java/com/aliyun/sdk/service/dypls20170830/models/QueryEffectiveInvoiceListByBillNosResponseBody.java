// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEffectiveInvoiceListByBillNosResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEffectiveInvoiceListByBillNosResponseBody</p>
 */
public class QueryEffectiveInvoiceListByBillNosResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ReturnValue")
    private ReturnValue returnValue;

    private QueryEffectiveInvoiceListByBillNosResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isSuccess = builder.isSuccess;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEffectiveInvoiceListByBillNosResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return returnValue
     */
    public ReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Boolean isSuccess; 
        private ReturnValue returnValue; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(ReturnValue returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBody build() {
            return new QueryEffectiveInvoiceListByBillNosResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AliCompany")
        private String aliCompany;

        @NameInMap("AliId")
        private Long aliId;

        @NameInMap("Amount")
        private Double amount;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("BuildAmount")
        private Double buildAmount;

        @NameInMap("Category")
        private String category;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("InvoiceNo")
        private String invoiceNo;

        @NameInMap("InvoiceStatus")
        private String invoiceStatus;

        @NameInMap("InvoiceTitle")
        private String invoiceTitle;

        @NameInMap("Language")
        private String language;

        @NameInMap("OrderItemNo")
        private String orderItemNo;

        @NameInMap("ParentContractNo")
        private String parentContractNo;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Site")
        private String site;

        @NameInMap("TaxRegisgerNo")
        private String taxRegisgerNo;

        @NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.aliCompany = builder.aliCompany;
            this.aliId = builder.aliId;
            this.amount = builder.amount;
            this.appCode = builder.appCode;
            this.buildAmount = builder.buildAmount;
            this.category = builder.category;
            this.encryptProps = builder.encryptProps;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceStatus = builder.invoiceStatus;
            this.invoiceTitle = builder.invoiceTitle;
            this.language = builder.language;
            this.orderItemNo = builder.orderItemNo;
            this.parentContractNo = builder.parentContractNo;
            this.sign = builder.sign;
            this.site = builder.site;
            this.taxRegisgerNo = builder.taxRegisgerNo;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliCompany
         */
        public String getAliCompany() {
            return this.aliCompany;
        }

        /**
         * @return aliId
         */
        public Long getAliId() {
            return this.aliId;
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return buildAmount
         */
        public Double getBuildAmount() {
            return this.buildAmount;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return invoiceStatus
         */
        public String getInvoiceStatus() {
            return this.invoiceStatus;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return orderItemNo
         */
        public String getOrderItemNo() {
            return this.orderItemNo;
        }

        /**
         * @return parentContractNo
         */
        public String getParentContractNo() {
            return this.parentContractNo;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return taxRegisgerNo
         */
        public String getTaxRegisgerNo() {
            return this.taxRegisgerNo;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliCompany; 
            private Long aliId; 
            private Double amount; 
            private String appCode; 
            private Double buildAmount; 
            private String category; 
            private java.util.Map < String, String > encryptProps; 
            private String invoiceNo; 
            private String invoiceStatus; 
            private String invoiceTitle; 
            private String language; 
            private String orderItemNo; 
            private String parentContractNo; 
            private String sign; 
            private String site; 
            private String taxRegisgerNo; 
            private String uuid; 

            /**
             * AliCompany.
             */
            public Builder aliCompany(String aliCompany) {
                this.aliCompany = aliCompany;
                return this;
            }

            /**
             * AliId.
             */
            public Builder aliId(Long aliId) {
                this.aliId = aliId;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * BuildAmount.
             */
            public Builder buildAmount(Double buildAmount) {
                this.buildAmount = buildAmount;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * InvoiceNo.
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * InvoiceStatus.
             */
            public Builder invoiceStatus(String invoiceStatus) {
                this.invoiceStatus = invoiceStatus;
                return this;
            }

            /**
             * InvoiceTitle.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * OrderItemNo.
             */
            public Builder orderItemNo(String orderItemNo) {
                this.orderItemNo = orderItemNo;
                return this;
            }

            /**
             * ParentContractNo.
             */
            public Builder parentContractNo(String parentContractNo) {
                this.parentContractNo = parentContractNo;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Site.
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * TaxRegisgerNo.
             */
            public Builder taxRegisgerNo(String taxRegisgerNo) {
                this.taxRegisgerNo = taxRegisgerNo;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class ReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Sign")
        private String sign;

        private ReturnValue(Builder builder) {
            this.encryptProps = builder.encryptProps;
            this.list = builder.list;
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnValue create() {
            return builder().build();
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private java.util.Map < String, String > encryptProps; 
            private java.util.List < List> list; 
            private String sign; 

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            public ReturnValue build() {
                return new ReturnValue(this);
            } 

        } 

    }
}
