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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
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

        @com.aliyun.core.annotation.NameInMap("RealAliyunPk")
        private String realAliyunPk;

        private EvaluateList(Builder builder) {
            this.agent = builder.agent;
            this.amount = builder.amount;
            this.bizTimeStr = builder.bizTimeStr;
            this.id = builder.id;
            this.orderType = builder.orderType;
            this.outBizId = builder.outBizId;
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
                this.realAliyunPk = model.realAliyunPk;
            } 

            /**
             * Agent.
             */
            public Builder agent(Boolean agent) {
                this.agent = agent;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * BizTimeStr.
             */
            public Builder bizTimeStr(String bizTimeStr) {
                this.bizTimeStr = bizTimeStr;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * OutBizId.
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * RealAliyunPk.
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InvoiceAmount.
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
        @com.aliyun.core.annotation.NameInMap("TaxNumber")
        private String taxNumber;

        private ReceiptUserInfoDto(Builder builder) {
            this.taxNumber = builder.taxNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiptUserInfoDto create() {
            return builder().build();
        }

        /**
         * @return taxNumber
         */
        public String getTaxNumber() {
            return this.taxNumber;
        }

        public static final class Builder {
            private String taxNumber; 

            private Builder() {
            } 

            private Builder(ReceiptUserInfoDto model) {
                this.taxNumber = model.taxNumber;
            } 

            /**
             * TaxNumber.
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
             * Addressee.
             */
            public Builder addressee(String addressee) {
                this.addressee = addressee;
                return this;
            }

            /**
             * AliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * DeliveryAddress.
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * Emails.
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * PostalCode.
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

        private Result(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.createTimeStr = builder.createTimeStr;
            this.evaluateList = builder.evaluateList;
            this.id = builder.id;
            this.invoiceId = builder.invoiceId;
            this.invoiceList = builder.invoiceList;
            this.materialType = builder.materialType;
            this.modifiedTime = builder.modifiedTime;
            this.modifiedTimeStr = builder.modifiedTimeStr;
            this.price = builder.price;
            this.receiptUserInfoDto = builder.receiptUserInfoDto;
            this.status = builder.status;
            this.title = builder.title;
            this.type = builder.type;
            this.userAddressDto = builder.userAddressDto;
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

        public static final class Builder {
            private String aliyunPk; 
            private String createTimeStr; 
            private java.util.List<EvaluateList> evaluateList; 
            private String id; 
            private String invoiceId; 
            private java.util.List<InvoiceList> invoiceList; 
            private String materialType; 
            private String modifiedTime; 
            private String modifiedTimeStr; 
            private String price; 
            private ReceiptUserInfoDto receiptUserInfoDto; 
            private String status; 
            private String title; 
            private String type; 
            private UserAddressDto userAddressDto; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.aliyunPk = model.aliyunPk;
                this.createTimeStr = model.createTimeStr;
                this.evaluateList = model.evaluateList;
                this.id = model.id;
                this.invoiceId = model.invoiceId;
                this.invoiceList = model.invoiceList;
                this.materialType = model.materialType;
                this.modifiedTime = model.modifiedTime;
                this.modifiedTimeStr = model.modifiedTimeStr;
                this.price = model.price;
                this.receiptUserInfoDto = model.receiptUserInfoDto;
                this.status = model.status;
                this.title = model.title;
                this.type = model.type;
                this.userAddressDto = model.userAddressDto;
            } 

            /**
             * AliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * CreateTimeStr.
             */
            public Builder createTimeStr(String createTimeStr) {
                this.createTimeStr = createTimeStr;
                return this;
            }

            /**
             * EvaluateList.
             */
            public Builder evaluateList(java.util.List<EvaluateList> evaluateList) {
                this.evaluateList = evaluateList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InvoiceId.
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * InvoiceList.
             */
            public Builder invoiceList(java.util.List<InvoiceList> invoiceList) {
                this.invoiceList = invoiceList;
                return this;
            }

            /**
             * MaterialType.
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifiedTimeStr.
             */
            public Builder modifiedTimeStr(String modifiedTimeStr) {
                this.modifiedTimeStr = modifiedTimeStr;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * ReceiptUserInfoDto.
             */
            public Builder receiptUserInfoDto(ReceiptUserInfoDto receiptUserInfoDto) {
                this.receiptUserInfoDto = receiptUserInfoDto;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserAddressDto.
             */
            public Builder userAddressDto(UserAddressDto userAddressDto) {
                this.userAddressDto = userAddressDto;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
