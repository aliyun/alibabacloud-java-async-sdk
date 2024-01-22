// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeApplyResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeApplyResponseBody</p>
 */
public class ChangeApplyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    @NameInMap("error_code")
    private String errorCode;

    @NameInMap("error_data")
    private Object errorData;

    @NameInMap("error_msg")
    private String errorMsg;

    @NameInMap("status")
    private Integer status;

    @NameInMap("success")
    private Boolean success;

    private ChangeApplyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeApplyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChangeApplyResponseBody build() {
            return new ChangeApplyResponseBody(this);
        } 

    } 

    public static class Passengers extends TeaModel {
        @NameInMap("document")
        private String document;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("last_name")
        private String lastName;

        private Passengers(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Passengers create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        public static final class Builder {
            private String document; 
            private String firstName; 
            private String lastName; 

            /**
             * document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Passengers build() {
                return new Passengers(this);
            } 

        } 

    }
    public static class ChangeOrders extends TeaModel {
        @NameInMap("change_order_num")
        private Long changeOrderNum;

        @NameInMap("change_order_status")
        private Integer changeOrderStatus;

        @NameInMap("fail_reason")
        private String failReason;

        @NameInMap("passengers")
        private java.util.List < Passengers> passengers;

        private ChangeOrders(Builder builder) {
            this.changeOrderNum = builder.changeOrderNum;
            this.changeOrderStatus = builder.changeOrderStatus;
            this.failReason = builder.failReason;
            this.passengers = builder.passengers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrders create() {
            return builder().build();
        }

        /**
         * @return changeOrderNum
         */
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        /**
         * @return changeOrderStatus
         */
        public Integer getChangeOrderStatus() {
            return this.changeOrderStatus;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return passengers
         */
        public java.util.List < Passengers> getPassengers() {
            return this.passengers;
        }

        public static final class Builder {
            private Long changeOrderNum; 
            private Integer changeOrderStatus; 
            private String failReason; 
            private java.util.List < Passengers> passengers; 

            /**
             * change_order_num.
             */
            public Builder changeOrderNum(Long changeOrderNum) {
                this.changeOrderNum = changeOrderNum;
                return this;
            }

            /**
             * change_order_status.
             */
            public Builder changeOrderStatus(Integer changeOrderStatus) {
                this.changeOrderStatus = changeOrderStatus;
                return this;
            }

            /**
             * fail_reason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * passengers.
             */
            public Builder passengers(java.util.List < Passengers> passengers) {
                this.passengers = passengers;
                return this;
            }

            public ChangeOrders build() {
                return new ChangeOrders(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("change_orders")
        private java.util.List < ChangeOrders> changeOrders;

        @NameInMap("order_num")
        private Long orderNum;

        private Data(Builder builder) {
            this.changeOrders = builder.changeOrders;
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeOrders
         */
        public java.util.List < ChangeOrders> getChangeOrders() {
            return this.changeOrders;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private java.util.List < ChangeOrders> changeOrders; 
            private Long orderNum; 

            /**
             * change_orders.
             */
            public Builder changeOrders(java.util.List < ChangeOrders> changeOrders) {
                this.changeOrders = changeOrders;
                return this;
            }

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
