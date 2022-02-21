// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEslDevicesResponseBody</p>
 */
public class DescribeEslDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("EslDevices")
    private java.util.List < EslDevices> eslDevices;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEslDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.eslDevices = builder.eslDevices;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDevicesResponseBody create() {
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
     * @return eslDevices
     */
    public java.util.List < EslDevices> getEslDevices() {
        return this.eslDevices;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < EslDevices> eslDevices; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

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
         * EslDevices.
         */
        public Builder eslDevices(java.util.List < EslDevices> eslDevices) {
            this.eslDevices = eslDevices;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEslDevicesResponseBody build() {
            return new DescribeEslDevicesResponseBody(this);
        } 

    } 

    public static class EslDevices extends TeaModel {
        @NameInMap("BatteryLevel")
        private Integer batteryLevel;

        @NameInMap("EslBarCode")
        private String eslBarCode;

        @NameInMap("EslSignal")
        private Integer eslSignal;

        @NameInMap("EslStatus")
        private String eslStatus;

        @NameInMap("LastCommunicateTime")
        private String lastCommunicateTime;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("Model")
        private String model;

        @NameInMap("ScreenHeight")
        private Integer screenHeight;

        @NameInMap("ScreenWidth")
        private Integer screenWidth;

        @NameInMap("StoreId")
        private String storeId;

        @NameInMap("Type")
        private String type;

        private EslDevices(Builder builder) {
            this.batteryLevel = builder.batteryLevel;
            this.eslBarCode = builder.eslBarCode;
            this.eslSignal = builder.eslSignal;
            this.eslStatus = builder.eslStatus;
            this.lastCommunicateTime = builder.lastCommunicateTime;
            this.mac = builder.mac;
            this.model = builder.model;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
            this.storeId = builder.storeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslDevices create() {
            return builder().build();
        }

        /**
         * @return batteryLevel
         */
        public Integer getBatteryLevel() {
            return this.batteryLevel;
        }

        /**
         * @return eslBarCode
         */
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        /**
         * @return eslSignal
         */
        public Integer getEslSignal() {
            return this.eslSignal;
        }

        /**
         * @return eslStatus
         */
        public String getEslStatus() {
            return this.eslStatus;
        }

        /**
         * @return lastCommunicateTime
         */
        public String getLastCommunicateTime() {
            return this.lastCommunicateTime;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return screenHeight
         */
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer batteryLevel; 
            private String eslBarCode; 
            private Integer eslSignal; 
            private String eslStatus; 
            private String lastCommunicateTime; 
            private String mac; 
            private String model; 
            private Integer screenHeight; 
            private Integer screenWidth; 
            private String storeId; 
            private String type; 

            /**
             * BatteryLevel.
             */
            public Builder batteryLevel(Integer batteryLevel) {
                this.batteryLevel = batteryLevel;
                return this;
            }

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * EslSignal.
             */
            public Builder eslSignal(Integer eslSignal) {
                this.eslSignal = eslSignal;
                return this;
            }

            /**
             * EslStatus.
             */
            public Builder eslStatus(String eslStatus) {
                this.eslStatus = eslStatus;
                return this;
            }

            /**
             * LastCommunicateTime.
             */
            public Builder lastCommunicateTime(String lastCommunicateTime) {
                this.lastCommunicateTime = lastCommunicateTime;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ScreenHeight.
             */
            public Builder screenHeight(Integer screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * ScreenWidth.
             */
            public Builder screenWidth(Integer screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EslDevices build() {
                return new EslDevices(this);
            } 

        } 

    }
}
