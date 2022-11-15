// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrderResponseBody</p>
 */
public class ListOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String localizedMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOrderResponseBody build() {
            return new ListOrderResponseBody(this);
        } 

    } 

    public static class DeliveryInfo extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("BuyerMessage")
        private String buyerMessage;

        @NameInMap("Mail")
        private String mail;

        @NameInMap("Receiver")
        private String receiver;

        @NameInMap("ZipCode")
        private String zipCode;

        private DeliveryInfo(Builder builder) {
            this.address = builder.address;
            this.buyerMessage = builder.buyerMessage;
            this.mail = builder.mail;
            this.receiver = builder.receiver;
            this.zipCode = builder.zipCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return buyerMessage
         */
        public String getBuyerMessage() {
            return this.buyerMessage;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return zipCode
         */
        public String getZipCode() {
            return this.zipCode;
        }

        public static final class Builder {
            private String address; 
            private String buyerMessage; 
            private String mail; 
            private String receiver; 
            private String zipCode; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * BuyerMessage.
             */
            public Builder buyerMessage(String buyerMessage) {
                this.buyerMessage = buyerMessage;
                return this;
            }

            /**
             * Mail.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * ZipCode.
             */
            public Builder zipCode(String zipCode) {
                this.zipCode = zipCode;
                return this;
            }

            public DeliveryInfo build() {
                return new DeliveryInfo(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("AliFee")
        private String aliFee;

        @NameInMap("ApnName")
        private String apnName;

        @NameInMap("ApnRegion")
        private String apnRegion;

        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("BuyNum")
        private Integer buyNum;

        @NameInMap("CardPayCount")
        private Integer cardPayCount;

        @NameInMap("CredentialNo")
        private String credentialNo;

        @NameInMap("CredentialPackage")
        private String credentialPackage;

        @NameInMap("DataLevel")
        private String dataLevel;

        @NameInMap("DeliveryInfo")
        private DeliveryInfo deliveryInfo;

        @NameInMap("ExpressNoList")
        private java.util.List < String > expressNoList;

        @NameInMap("FlowType")
        private String flowType;

        @NameInMap("FunctionFee")
        private Integer functionFee;

        @NameInMap("OrderDetailUrl")
        private String orderDetailUrl;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderInfo")
        private String orderInfo;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("PayDuration")
        private String payDuration;

        @NameInMap("PayTime")
        private String payTime;

        @NameInMap("PoolCapacity")
        private String poolCapacity;

        @NameInMap("PoolCapacityUnit")
        private String poolCapacityUnit;

        @NameInMap("PoolNo")
        private String poolNo;

        @NameInMap("ResourceQuantity")
        private Long resourceQuantity;

        @NameInMap("Vendor")
        private String vendor;

        private List(Builder builder) {
            this.aliFee = builder.aliFee;
            this.apnName = builder.apnName;
            this.apnRegion = builder.apnRegion;
            this.billingCycle = builder.billingCycle;
            this.buyNum = builder.buyNum;
            this.cardPayCount = builder.cardPayCount;
            this.credentialNo = builder.credentialNo;
            this.credentialPackage = builder.credentialPackage;
            this.dataLevel = builder.dataLevel;
            this.deliveryInfo = builder.deliveryInfo;
            this.expressNoList = builder.expressNoList;
            this.flowType = builder.flowType;
            this.functionFee = builder.functionFee;
            this.orderDetailUrl = builder.orderDetailUrl;
            this.orderId = builder.orderId;
            this.orderInfo = builder.orderInfo;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.payDuration = builder.payDuration;
            this.payTime = builder.payTime;
            this.poolCapacity = builder.poolCapacity;
            this.poolCapacityUnit = builder.poolCapacityUnit;
            this.poolNo = builder.poolNo;
            this.resourceQuantity = builder.resourceQuantity;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliFee
         */
        public String getAliFee() {
            return this.aliFee;
        }

        /**
         * @return apnName
         */
        public String getApnName() {
            return this.apnName;
        }

        /**
         * @return apnRegion
         */
        public String getApnRegion() {
            return this.apnRegion;
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return buyNum
         */
        public Integer getBuyNum() {
            return this.buyNum;
        }

        /**
         * @return cardPayCount
         */
        public Integer getCardPayCount() {
            return this.cardPayCount;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return credentialPackage
         */
        public String getCredentialPackage() {
            return this.credentialPackage;
        }

        /**
         * @return dataLevel
         */
        public String getDataLevel() {
            return this.dataLevel;
        }

        /**
         * @return deliveryInfo
         */
        public DeliveryInfo getDeliveryInfo() {
            return this.deliveryInfo;
        }

        /**
         * @return expressNoList
         */
        public java.util.List < String > getExpressNoList() {
            return this.expressNoList;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return functionFee
         */
        public Integer getFunctionFee() {
            return this.functionFee;
        }

        /**
         * @return orderDetailUrl
         */
        public String getOrderDetailUrl() {
            return this.orderDetailUrl;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderInfo
         */
        public String getOrderInfo() {
            return this.orderInfo;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return payDuration
         */
        public String getPayDuration() {
            return this.payDuration;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return poolCapacity
         */
        public String getPoolCapacity() {
            return this.poolCapacity;
        }

        /**
         * @return poolCapacityUnit
         */
        public String getPoolCapacityUnit() {
            return this.poolCapacityUnit;
        }

        /**
         * @return poolNo
         */
        public String getPoolNo() {
            return this.poolNo;
        }

        /**
         * @return resourceQuantity
         */
        public Long getResourceQuantity() {
            return this.resourceQuantity;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String aliFee; 
            private String apnName; 
            private String apnRegion; 
            private String billingCycle; 
            private Integer buyNum; 
            private Integer cardPayCount; 
            private String credentialNo; 
            private String credentialPackage; 
            private String dataLevel; 
            private DeliveryInfo deliveryInfo; 
            private java.util.List < String > expressNoList; 
            private String flowType; 
            private Integer functionFee; 
            private String orderDetailUrl; 
            private String orderId; 
            private String orderInfo; 
            private String orderStatus; 
            private String orderType; 
            private String payDuration; 
            private String payTime; 
            private String poolCapacity; 
            private String poolCapacityUnit; 
            private String poolNo; 
            private Long resourceQuantity; 
            private String vendor; 

            /**
             * AliFee.
             */
            public Builder aliFee(String aliFee) {
                this.aliFee = aliFee;
                return this;
            }

            /**
             * ApnName.
             */
            public Builder apnName(String apnName) {
                this.apnName = apnName;
                return this;
            }

            /**
             * ApnRegion.
             */
            public Builder apnRegion(String apnRegion) {
                this.apnRegion = apnRegion;
                return this;
            }

            /**
             * BillingCycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * BuyNum.
             */
            public Builder buyNum(Integer buyNum) {
                this.buyNum = buyNum;
                return this;
            }

            /**
             * CardPayCount.
             */
            public Builder cardPayCount(Integer cardPayCount) {
                this.cardPayCount = cardPayCount;
                return this;
            }

            /**
             * CredentialNo.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * CredentialPackage.
             */
            public Builder credentialPackage(String credentialPackage) {
                this.credentialPackage = credentialPackage;
                return this;
            }

            /**
             * DataLevel.
             */
            public Builder dataLevel(String dataLevel) {
                this.dataLevel = dataLevel;
                return this;
            }

            /**
             * DeliveryInfo.
             */
            public Builder deliveryInfo(DeliveryInfo deliveryInfo) {
                this.deliveryInfo = deliveryInfo;
                return this;
            }

            /**
             * ExpressNoList.
             */
            public Builder expressNoList(java.util.List < String > expressNoList) {
                this.expressNoList = expressNoList;
                return this;
            }

            /**
             * FlowType.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * FunctionFee.
             */
            public Builder functionFee(Integer functionFee) {
                this.functionFee = functionFee;
                return this;
            }

            /**
             * OrderDetailUrl.
             */
            public Builder orderDetailUrl(String orderDetailUrl) {
                this.orderDetailUrl = orderDetailUrl;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderInfo.
             */
            public Builder orderInfo(String orderInfo) {
                this.orderInfo = orderInfo;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
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
             * PayDuration.
             */
            public Builder payDuration(String payDuration) {
                this.payDuration = payDuration;
                return this;
            }

            /**
             * PayTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * PoolCapacity.
             */
            public Builder poolCapacity(String poolCapacity) {
                this.poolCapacity = poolCapacity;
                return this;
            }

            /**
             * PoolCapacityUnit.
             */
            public Builder poolCapacityUnit(String poolCapacityUnit) {
                this.poolCapacityUnit = poolCapacityUnit;
                return this;
            }

            /**
             * PoolNo.
             */
            public Builder poolNo(String poolNo) {
                this.poolNo = poolNo;
                return this;
            }

            /**
             * ResourceQuantity.
             */
            public Builder resourceQuantity(Long resourceQuantity) {
                this.resourceQuantity = resourceQuantity;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageCount; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
