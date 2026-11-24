// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvoiceForIsvResponseBody</p>
 */
public class DescribeInvoiceForIsvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInvoiceForIsvResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvoiceForIsvResponseBody create() {
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
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String count; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeInvoiceForIsvResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paged query. Maximum value: 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The query token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>3v3mzZN1QdVsTPNiT0OkD36LC9I+AJHU9z2oXBmJJOyy4nQl7MIUZUYG6fdbYBk+</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the successful flow node.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInvoiceForIsvResponseBody build() {
            return new DescribeInvoiceForIsvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvoiceForIsvResponseBody</p>
     */
    public static class EvaluateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Boolean agent;

        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("BizTimeStr")
        private String bizTimeStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RealAliyunId")
        private String realAliyunId;

        @com.aliyun.core.annotation.NameInMap("RealAliyunPk")
        private String realAliyunPk;

        private EvaluateList(Builder builder) {
            this.agent = builder.agent;
            this.amount = builder.amount;
            this.bizTimeStr = builder.bizTimeStr;
            this.id = builder.id;
            this.orderType = builder.orderType;
            this.outBizId = builder.outBizId;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.realAliyunId = builder.realAliyunId;
            this.realAliyunPk = builder.realAliyunPk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluateList create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Boolean getAgent() {
            return this.agent;
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return bizTimeStr
         */
        public String getBizTimeStr() {
            return this.bizTimeStr;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
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
         * @return realAliyunId
         */
        public String getRealAliyunId() {
            return this.realAliyunId;
        }

        /**
         * @return realAliyunPk
         */
        public String getRealAliyunPk() {
            return this.realAliyunPk;
        }

        public static final class Builder {
            private Boolean agent; 
            private String amount; 
            private String bizTimeStr; 
            private String id; 
            private String orderType; 
            private String outBizId; 
            private String productCode; 
            private String productName; 
            private String realAliyunId; 
            private String realAliyunPk; 

            private Builder() {
            } 

            private Builder(EvaluateList model) {
                this.agent = model.agent;
                this.amount = model.amount;
                this.bizTimeStr = model.bizTimeStr;
                this.id = model.id;
                this.orderType = model.orderType;
                this.outBizId = model.outBizId;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.realAliyunId = model.realAliyunId;
                this.realAliyunPk = model.realAliyunPk;
            } 

            /**
             * <p>Specifies whether proxy invoicing is used.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder agent(Boolean agent) {
                this.agent = agent;
                return this;
            }

            /**
             * <p>The amount. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The time when the transaction occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 00:00:00</p>
             */
            public Builder bizTimeStr(String bizTimeStr) {
                this.bizTimeStr = bizTimeStr;
                return this;
            }

            /**
             * <p>The ID of the invoicing object.</p>
             * 
             * <strong>example:</strong>
             * <p>9540765</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the order or bill. Valid values:</p>
             * <ul>
             * <li>0: Order.</li>
             * <li>1: Bill.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>2024091610072000****</p>
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmapi00067***</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>Image recognition OCR***</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a></p>
             */
            public Builder realAliyunId(String realAliyunId) {
                this.realAliyunId = realAliyunId;
                return this;
            }

            /**
             * <p>The account to which the order belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>102277855749****</p>
             */
            public Builder realAliyunPk(String realAliyunPk) {
                this.realAliyunPk = realAliyunPk;
                return this;
            }

            public EvaluateList build() {
                return new EvaluateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvoiceForIsvResponseBody</p>
     */
    public static class InvoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InvoiceAmount")
        private String invoiceAmount;

        private InvoiceList(Builder builder) {
            this.id = builder.id;
            this.invoiceAmount = builder.invoiceAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return invoiceAmount
         */
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

        public static final class Builder {
            private String id; 
            private String invoiceAmount; 

            private Builder() {
            } 

            private Builder(InvoiceList model) {
                this.id = model.id;
                this.invoiceAmount = model.invoiceAmount;
            } 

            /**
             * <p>The ID of the invoice object.</p>
             * 
             * <strong>example:</strong>
             * <p>4072040****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The applied invoicing amount. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>99.99</p>
             */
            public Builder invoiceAmount(String invoiceAmount) {
                this.invoiceAmount = invoiceAmount;
                return this;
            }

            public InvoiceList build() {
                return new InvoiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvoiceForIsvResponseBody</p>
     */
    public static class ReceiptUserInfoDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BankAccount")
        private String bankAccount;

        @com.aliyun.core.annotation.NameInMap("BankName")
        private String bankName;

        @com.aliyun.core.annotation.NameInMap("RegAddress")
        private String regAddress;

        @com.aliyun.core.annotation.NameInMap("RegPhone")
        private String regPhone;

        @com.aliyun.core.annotation.NameInMap("TaxNumber")
        private String taxNumber;

        private ReceiptUserInfoDto(Builder builder) {
            this.bankAccount = builder.bankAccount;
            this.bankName = builder.bankName;
            this.regAddress = builder.regAddress;
            this.regPhone = builder.regPhone;
            this.taxNumber = builder.taxNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiptUserInfoDto create() {
            return builder().build();
        }

        /**
         * @return bankAccount
         */
        public String getBankAccount() {
            return this.bankAccount;
        }

        /**
         * @return bankName
         */
        public String getBankName() {
            return this.bankName;
        }

        /**
         * @return regAddress
         */
        public String getRegAddress() {
            return this.regAddress;
        }

        /**
         * @return regPhone
         */
        public String getRegPhone() {
            return this.regPhone;
        }

        /**
         * @return taxNumber
         */
        public String getTaxNumber() {
            return this.taxNumber;
        }

        public static final class Builder {
            private String bankAccount; 
            private String bankName; 
            private String regAddress; 
            private String regPhone; 
            private String taxNumber; 

            private Builder() {
            } 

            private Builder(ReceiptUserInfoDto model) {
                this.bankAccount = model.bankAccount;
                this.bankName = model.bankName;
                this.regAddress = model.regAddress;
                this.regPhone = model.regPhone;
                this.taxNumber = model.taxNumber;
            } 

            /**
             * <p>The bank account.</p>
             * 
             * <strong>example:</strong>
             * <p>000000</p>
             */
            public Builder bankAccount(String bankAccount) {
                this.bankAccount = bankAccount;
                return this;
            }

            /**
             * <p>The name of the bank.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder bankName(String bankName) {
                this.bankName = bankName;
                return this;
            }

            /**
             * <p>The registered address.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou ****</p>
             */
            public Builder regAddress(String regAddress) {
                this.regAddress = regAddress;
                return this;
            }

            /**
             * <p>The registered landline number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571-****</p>
             */
            public Builder regPhone(String regPhone) {
                this.regPhone = regPhone;
                return this;
            }

            /**
             * <p>The unified social credit code of the enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>91420100MA49L5****</p>
             */
            public Builder taxNumber(String taxNumber) {
                this.taxNumber = taxNumber;
                return this;
            }

            public ReceiptUserInfoDto build() {
                return new ReceiptUserInfoDto(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvoiceForIsvResponseBody</p>
     */
    public static class UserAddressDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addressee")
        private String addressee;

        @com.aliyun.core.annotation.NameInMap("AliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
        private String deliveryAddress;

        @com.aliyun.core.annotation.NameInMap("Emails")
        private String emails;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        private UserAddressDto(Builder builder) {
            this.addressee = builder.addressee;
            this.aliyunPk = builder.aliyunPk;
            this.bizType = builder.bizType;
            this.deliveryAddress = builder.deliveryAddress;
            this.emails = builder.emails;
            this.phone = builder.phone;
            this.postalCode = builder.postalCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAddressDto create() {
            return builder().build();
        }

        /**
         * @return addressee
         */
        public String getAddressee() {
            return this.addressee;
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return deliveryAddress
         */
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        /**
         * @return emails
         */
        public String getEmails() {
            return this.emails;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        public static final class Builder {
            private String addressee; 
            private String aliyunPk; 
            private String bizType; 
            private String deliveryAddress; 
            private String emails; 
            private String phone; 
            private String postalCode; 

            private Builder() {
            } 

            private Builder(UserAddressDto model) {
                this.addressee = model.addressee;
                this.aliyunPk = model.aliyunPk;
                this.bizType = model.bizType;
                this.deliveryAddress = model.deliveryAddress;
                this.emails = model.emails;
                this.phone = model.phone;
                this.postalCode = model.postalCode;
            } 

            /**
             * <p>The recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder addressee(String addressee) {
                this.addressee = addressee;
                return this;
            }

            /**
             * <p>The Alibaba Cloud user ID of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>174452687724****</p>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The delivery address.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou ****</p>
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:demo@example.com">demo@example.com</a></p>
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>130********</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The postal code.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            public UserAddressDto build() {
                return new UserAddressDto(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvoiceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvoiceForIsvResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("CheckNotice")
        private String checkNotice;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStr")
        private String createTimeStr;

        @com.aliyun.core.annotation.NameInMap("EvaluateList")
        private java.util.List<EvaluateList> evaluateList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InvoiceId")
        private String invoiceId;

        @com.aliyun.core.annotation.NameInMap("InvoiceList")
        private java.util.List<InvoiceList> invoiceList;

        @com.aliyun.core.annotation.NameInMap("InvoiceTitleRelation")
        private String invoiceTitleRelation;

        @com.aliyun.core.annotation.NameInMap("MaterialType")
        private String materialType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeStr")
        private String modifiedTimeStr;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("ReceiptUserInfoDto")
        private ReceiptUserInfoDto receiptUserInfoDto;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserAddressDto")
        private UserAddressDto userAddressDto;

        @com.aliyun.core.annotation.NameInMap("UserNotice")
        private String userNotice;

        private Result(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.checkNotice = builder.checkNotice;
            this.createTimeStr = builder.createTimeStr;
            this.evaluateList = builder.evaluateList;
            this.id = builder.id;
            this.invoiceId = builder.invoiceId;
            this.invoiceList = builder.invoiceList;
            this.invoiceTitleRelation = builder.invoiceTitleRelation;
            this.materialType = builder.materialType;
            this.modifiedTime = builder.modifiedTime;
            this.modifiedTimeStr = builder.modifiedTimeStr;
            this.price = builder.price;
            this.receiptUserInfoDto = builder.receiptUserInfoDto;
            this.status = builder.status;
            this.title = builder.title;
            this.type = builder.type;
            this.userAddressDto = builder.userAddressDto;
            this.userNotice = builder.userNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return checkNotice
         */
        public String getCheckNotice() {
            return this.checkNotice;
        }

        /**
         * @return createTimeStr
         */
        public String getCreateTimeStr() {
            return this.createTimeStr;
        }

        /**
         * @return evaluateList
         */
        public java.util.List<EvaluateList> getEvaluateList() {
            return this.evaluateList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return invoiceId
         */
        public String getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceList
         */
        public java.util.List<InvoiceList> getInvoiceList() {
            return this.invoiceList;
        }

        /**
         * @return invoiceTitleRelation
         */
        public String getInvoiceTitleRelation() {
            return this.invoiceTitleRelation;
        }

        /**
         * @return materialType
         */
        public String getMaterialType() {
            return this.materialType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifiedTimeStr
         */
        public String getModifiedTimeStr() {
            return this.modifiedTimeStr;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return receiptUserInfoDto
         */
        public ReceiptUserInfoDto getReceiptUserInfoDto() {
            return this.receiptUserInfoDto;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userAddressDto
         */
        public UserAddressDto getUserAddressDto() {
            return this.userAddressDto;
        }

        /**
         * @return userNotice
         */
        public String getUserNotice() {
            return this.userNotice;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String checkNotice; 
            private String createTimeStr; 
            private java.util.List<EvaluateList> evaluateList; 
            private String id; 
            private String invoiceId; 
            private java.util.List<InvoiceList> invoiceList; 
            private String invoiceTitleRelation; 
            private String materialType; 
            private String modifiedTime; 
            private String modifiedTimeStr; 
            private String price; 
            private ReceiptUserInfoDto receiptUserInfoDto; 
            private String status; 
            private String title; 
            private String type; 
            private UserAddressDto userAddressDto; 
            private String userNotice; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.aliyunPk = model.aliyunPk;
                this.checkNotice = model.checkNotice;
                this.createTimeStr = model.createTimeStr;
                this.evaluateList = model.evaluateList;
                this.id = model.id;
                this.invoiceId = model.invoiceId;
                this.invoiceList = model.invoiceList;
                this.invoiceTitleRelation = model.invoiceTitleRelation;
                this.materialType = model.materialType;
                this.modifiedTime = model.modifiedTime;
                this.modifiedTimeStr = model.modifiedTimeStr;
                this.price = model.price;
                this.receiptUserInfoDto = model.receiptUserInfoDto;
                this.status = model.status;
                this.title = model.title;
                this.type = model.type;
                this.userAddressDto = model.userAddressDto;
                this.userNotice = model.userNotice;
            } 

            /**
             * <p>The Alibaba Cloud user ID of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>102277855749****</p>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * <p>The service provider invoice remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder checkNotice(String checkNotice) {
                this.checkNotice = checkNotice;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 00:00:00</p>
             */
            public Builder createTimeStr(String createTimeStr) {
                this.createTimeStr = createTimeStr;
                return this;
            }

            /**
             * <p>The order, bill, or contract number.</p>
             */
            public Builder evaluateList(java.util.List<EvaluateList> evaluateList) {
                this.evaluateList = evaluateList;
                return this;
            }

            /**
             * <p>The ID of the invoice application. This corresponds to the InvoiceId parameter when you call the ModifyInvoiceForIsv operation.</p>
             * 
             * <strong>example:</strong>
             * <p>4072040****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the invoice object.</p>
             * 
             * <strong>example:</strong>
             * <p>4072040****</p>
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The invoice sub-collection.</p>
             */
            public Builder invoiceList(java.util.List<InvoiceList> invoiceList) {
                this.invoiceList = invoiceList;
                return this;
            }

            /**
             * <p>The relationship between the invoice title and the customer real-name information. Valid values: <code>REAL_NAME_MATCH</code> (The real-name information is consistent), <code>PERSONAL_APPLY_ENTERPRISE_TITLE</code> (An individual applies for an enterprise title), <code>ENTERPRISE_MULTI_TITLE</code> (Multiple titles for an enterprise), <code>MASTER_ACCOUNT_OPERATION</code> (Operated by the main account), and <code>OTHER</code> (Other). If not provided, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>REAL_NAME_MATCH</p>
             */
            public Builder invoiceTitleRelation(String invoiceTitleRelation) {
                this.invoiceTitleRelation = invoiceTitleRelation;
                return this;
            }

            /**
             * <p>The invoice issuance type. Valid values:</p>
             * <ul>
             * <li>0: Paper.</li>
             * <li>1: Electronic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * <p>The time when the order status was modified. The time is displayed in GMT.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-04T09:43:18+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The time when the invoice was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 00:00:00</p>
             */
            public Builder modifiedTimeStr(String modifiedTimeStr) {
                this.modifiedTimeStr = modifiedTimeStr;
                return this;
            }

            /**
             * <p>The total invoice amount. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>99.99</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The user information of the invoice applicant.</p>
             */
            public Builder receiptUserInfoDto(ReceiptUserInfoDto receiptUserInfoDto) {
                this.receiptUserInfoDto = receiptUserInfoDto;
                return this;
            }

            /**
             * <p>The invoice status. Valid values: 0: Pending. 1: Invoiced.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The invoice title.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Computing Ltd</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The invoice type. Valid values:</p>
             * <ul>
             * <li>2: Digital electronic general invoice.</li>
             * <li>3: Digital electronic special invoice.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The address information.</p>
             */
            public Builder userAddressDto(UserAddressDto userAddressDto) {
                this.userAddressDto = userAddressDto;
                return this;
            }

            /**
             * <p>The user invoice remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder userNotice(String userNotice) {
                this.userNotice = userNotice;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
