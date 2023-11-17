// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStorageOrderResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStorageOrderResponseBody</p>
 */
public class QueryStorageOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryStorageOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStorageOrderResponseBody create() {
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

        public QueryStorageOrderResponseBody build() {
            return new QueryStorageOrderResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Copies")
        private Integer copies;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndTimeUTC")
        private String endTimeUTC;

        @NameInMap("IdentityId")
        private String identityId;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderType")
        private Integer orderType;

        @NameInMap("OutOrderNo")
        private String outOrderNo;

        @NameInMap("PaymentStatus")
        private Integer paymentStatus;

        @NameInMap("PreConsume")
        private Integer preConsume;

        @NameInMap("Price")
        private String price;

        @NameInMap("RecordType")
        private Integer recordType;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StartTimeUTC")
        private String startTimeUTC;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.copies = builder.copies;
            this.endTime = builder.endTime;
            this.endTimeUTC = builder.endTimeUTC;
            this.identityId = builder.identityId;
            this.iotId = builder.iotId;
            this.orderId = builder.orderId;
            this.orderType = builder.orderType;
            this.outOrderNo = builder.outOrderNo;
            this.paymentStatus = builder.paymentStatus;
            this.preConsume = builder.preConsume;
            this.price = builder.price;
            this.recordType = builder.recordType;
            this.specification = builder.specification;
            this.startTime = builder.startTime;
            this.startTimeUTC = builder.startTimeUTC;
            this.status = builder.status;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return copies
         */
        public Integer getCopies() {
            return this.copies;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimeUTC
         */
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        /**
         * @return identityId
         */
        public String getIdentityId() {
            return this.identityId;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return outOrderNo
         */
        public String getOutOrderNo() {
            return this.outOrderNo;
        }

        /**
         * @return paymentStatus
         */
        public Integer getPaymentStatus() {
            return this.paymentStatus;
        }

        /**
         * @return preConsume
         */
        public Integer getPreConsume() {
            return this.preConsume;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return recordType
         */
        public Integer getRecordType() {
            return this.recordType;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimeUTC
         */
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String commodityCode; 
            private Integer copies; 
            private String endTime; 
            private String endTimeUTC; 
            private String identityId; 
            private String iotId; 
            private String orderId; 
            private Integer orderType; 
            private String outOrderNo; 
            private Integer paymentStatus; 
            private Integer preConsume; 
            private String price; 
            private Integer recordType; 
            private String specification; 
            private String startTime; 
            private String startTimeUTC; 
            private Integer status; 
            private String userId; 
            private String userName; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * Copies.
             */
            public Builder copies(Integer copies) {
                this.copies = copies;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimeUTC.
             */
            public Builder endTimeUTC(String endTimeUTC) {
                this.endTimeUTC = endTimeUTC;
                return this;
            }

            /**
             * IdentityId.
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
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
             * OrderType.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * OutOrderNo.
             */
            public Builder outOrderNo(String outOrderNo) {
                this.outOrderNo = outOrderNo;
                return this;
            }

            /**
             * PaymentStatus.
             */
            public Builder paymentStatus(Integer paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * PreConsume.
             */
            public Builder preConsume(Integer preConsume) {
                this.preConsume = preConsume;
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
             * RecordType.
             */
            public Builder recordType(Integer recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimeUTC.
             */
            public Builder startTimeUTC(String startTimeUTC) {
                this.startTimeUTC = startTimeUTC;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
