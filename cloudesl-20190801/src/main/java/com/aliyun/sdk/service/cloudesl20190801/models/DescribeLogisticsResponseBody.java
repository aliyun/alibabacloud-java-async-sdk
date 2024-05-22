// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogisticsResponseBody</p>
 */
public class DescribeLogisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Logistics")
    private Logistics logistics;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeLogisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.logistics = builder.logistics;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
     * @return logistics
     */
    public Logistics getLogistics() {
        return this.logistics;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private Logistics logistics; 
        private String message; 
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
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

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
         * Logistics.
         */
        public Builder logistics(Logistics logistics) {
            this.logistics = logistics;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeLogisticsResponseBody build() {
            return new DescribeLogisticsResponseBody(this);
        } 

    } 

    public static class LogisticsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptStatus")
        private Boolean acceptStatus;

        @com.aliyun.core.annotation.NameInMap("ApMacList")
        private String apMacList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EslMacList")
        private String eslMacList;

        @com.aliyun.core.annotation.NameInMap("HasSend")
        private String hasSend;

        @com.aliyun.core.annotation.NameInMap("LogisticsDocuments")
        private String logisticsDocuments;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PoNumber")
        private String poNumber;

        @com.aliyun.core.annotation.NameInMap("PrNumber")
        private String prNumber;

        private LogisticsInfo(Builder builder) {
            this.acceptStatus = builder.acceptStatus;
            this.apMacList = builder.apMacList;
            this.description = builder.description;
            this.eslMacList = builder.eslMacList;
            this.hasSend = builder.hasSend;
            this.logisticsDocuments = builder.logisticsDocuments;
            this.orderId = builder.orderId;
            this.poNumber = builder.poNumber;
            this.prNumber = builder.prNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsInfo create() {
            return builder().build();
        }

        /**
         * @return acceptStatus
         */
        public Boolean getAcceptStatus() {
            return this.acceptStatus;
        }

        /**
         * @return apMacList
         */
        public String getApMacList() {
            return this.apMacList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eslMacList
         */
        public String getEslMacList() {
            return this.eslMacList;
        }

        /**
         * @return hasSend
         */
        public String getHasSend() {
            return this.hasSend;
        }

        /**
         * @return logisticsDocuments
         */
        public String getLogisticsDocuments() {
            return this.logisticsDocuments;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return poNumber
         */
        public String getPoNumber() {
            return this.poNumber;
        }

        /**
         * @return prNumber
         */
        public String getPrNumber() {
            return this.prNumber;
        }

        public static final class Builder {
            private Boolean acceptStatus; 
            private String apMacList; 
            private String description; 
            private String eslMacList; 
            private String hasSend; 
            private String logisticsDocuments; 
            private String orderId; 
            private String poNumber; 
            private String prNumber; 

            /**
             * AcceptStatus.
             */
            public Builder acceptStatus(Boolean acceptStatus) {
                this.acceptStatus = acceptStatus;
                return this;
            }

            /**
             * ApMacList.
             */
            public Builder apMacList(String apMacList) {
                this.apMacList = apMacList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EslMacList.
             */
            public Builder eslMacList(String eslMacList) {
                this.eslMacList = eslMacList;
                return this;
            }

            /**
             * HasSend.
             */
            public Builder hasSend(String hasSend) {
                this.hasSend = hasSend;
                return this;
            }

            /**
             * LogisticsDocuments.
             */
            public Builder logisticsDocuments(String logisticsDocuments) {
                this.logisticsDocuments = logisticsDocuments;
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
             * PoNumber.
             */
            public Builder poNumber(String poNumber) {
                this.poNumber = poNumber;
                return this;
            }

            /**
             * PrNumber.
             */
            public Builder prNumber(String prNumber) {
                this.prNumber = prNumber;
                return this;
            }

            public LogisticsInfo build() {
                return new LogisticsInfo(this);
            } 

        } 

    }
    public static class Logistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogisticsInfo")
        private java.util.List < LogisticsInfo> logisticsInfo;

        private Logistics(Builder builder) {
            this.logisticsInfo = builder.logisticsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logistics create() {
            return builder().build();
        }

        /**
         * @return logisticsInfo
         */
        public java.util.List < LogisticsInfo> getLogisticsInfo() {
            return this.logisticsInfo;
        }

        public static final class Builder {
            private java.util.List < LogisticsInfo> logisticsInfo; 

            /**
             * LogisticsInfo.
             */
            public Builder logisticsInfo(java.util.List < LogisticsInfo> logisticsInfo) {
                this.logisticsInfo = logisticsInfo;
                return this;
            }

            public Logistics build() {
                return new Logistics(this);
            } 

        } 

    }
}
