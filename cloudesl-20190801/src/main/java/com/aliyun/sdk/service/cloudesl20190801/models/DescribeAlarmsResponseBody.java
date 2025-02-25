// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponseBody</p>
 */
public class DescribeAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alarms")
    private Alarms alarms;

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

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAlarmsResponseBody(Builder builder) {
        this.alarms = builder.alarms;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
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

    public static DescribeAlarmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarms
     */
    public Alarms getAlarms() {
        return this.alarms;
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
        private Alarms alarms; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Alarms.
         */
        public Builder alarms(Alarms alarms) {
            this.alarms = alarms;
            return this;
        }

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

        public DescribeAlarmsResponseBody build() {
            return new DescribeAlarmsResponseBody(this);
        } 

    } 

    public static class AlarmInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AlarmTime")
        private String alarmTime;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private String companyId;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private String dealTime;

        @com.aliyun.core.annotation.NameInMap("DealUserId")
        private Long dealUserId;

        @com.aliyun.core.annotation.NameInMap("DeviceBarCode")
        private String deviceBarCode;

        @com.aliyun.core.annotation.NameInMap("DeviceMac")
        private String deviceMac;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("ItemBarCode")
        private String itemBarCode;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        private String storeId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private AlarmInfo(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmStatus = builder.alarmStatus;
            this.alarmTime = builder.alarmTime;
            this.alarmType = builder.alarmType;
            this.companyId = builder.companyId;
            this.dealTime = builder.dealTime;
            this.dealUserId = builder.dealUserId;
            this.deviceBarCode = builder.deviceBarCode;
            this.deviceMac = builder.deviceMac;
            this.deviceType = builder.deviceType;
            this.errorType = builder.errorType;
            this.itemBarCode = builder.itemBarCode;
            this.itemTitle = builder.itemTitle;
            this.model = builder.model;
            this.storeId = builder.storeId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmInfo create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public String getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return alarmTime
         */
        public String getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
        }

        /**
         * @return dealTime
         */
        public String getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealUserId
         */
        public Long getDealUserId() {
            return this.dealUserId;
        }

        /**
         * @return deviceBarCode
         */
        public String getDeviceBarCode() {
            return this.deviceBarCode;
        }

        /**
         * @return deviceMac
         */
        public String getDeviceMac() {
            return this.deviceMac;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return itemBarCode
         */
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String alarmId; 
            private String alarmStatus; 
            private String alarmTime; 
            private String alarmType; 
            private String companyId; 
            private String dealTime; 
            private Long dealUserId; 
            private String deviceBarCode; 
            private String deviceMac; 
            private String deviceType; 
            private String errorType; 
            private String itemBarCode; 
            private String itemTitle; 
            private String model; 
            private String storeId; 
            private String vendor; 

            /**
             * AlarmId.
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * AlarmTime.
             */
            public Builder alarmTime(String alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * DealTime.
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * DealUserId.
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * DeviceBarCode.
             */
            public Builder deviceBarCode(String deviceBarCode) {
                this.deviceBarCode = deviceBarCode;
                return this;
            }

            /**
             * DeviceMac.
             */
            public Builder deviceMac(String deviceMac) {
                this.deviceMac = deviceMac;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * ErrorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
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
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public AlarmInfo build() {
                return new AlarmInfo(this);
            } 

        } 

    }
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmInfo")
        private java.util.List < AlarmInfo> alarmInfo;

        private Alarms(Builder builder) {
            this.alarmInfo = builder.alarmInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarmInfo
         */
        public java.util.List < AlarmInfo> getAlarmInfo() {
            return this.alarmInfo;
        }

        public static final class Builder {
            private java.util.List < AlarmInfo> alarmInfo; 

            /**
             * AlarmInfo.
             */
            public Builder alarmInfo(java.util.List < AlarmInfo> alarmInfo) {
                this.alarmInfo = alarmInfo;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
