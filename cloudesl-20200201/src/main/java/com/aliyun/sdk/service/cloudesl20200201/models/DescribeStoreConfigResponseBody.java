// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoreConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoreConfigResponseBody</p>
 */
public class DescribeStoreConfigResponseBody extends TeaModel {
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

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StoreConfigInfo")
    private StoreConfigInfo storeConfigInfo;

    @NameInMap("Success")
    private Boolean success;

    private DescribeStoreConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.storeConfigInfo = builder.storeConfigInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoreConfigResponseBody create() {
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
     * @return storeConfigInfo
     */
    public StoreConfigInfo getStoreConfigInfo() {
        return this.storeConfigInfo;
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
        private String message; 
        private String requestId; 
        private StoreConfigInfo storeConfigInfo; 
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
         * StoreConfigInfo.
         */
        public Builder storeConfigInfo(StoreConfigInfo storeConfigInfo) {
            this.storeConfigInfo = storeConfigInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeStoreConfigResponseBody build() {
            return new DescribeStoreConfigResponseBody(this);
        } 

    } 

    public static class StoreConfigInfo extends TeaModel {
        @NameInMap("EnableNotification")
        private Boolean enableNotification;

        @NameInMap("NotificationSilentTimes")
        private String notificationSilentTimes;

        @NameInMap("NotificationWebHook")
        private String notificationWebHook;

        @NameInMap("StoreId")
        private String storeId;

        private StoreConfigInfo(Builder builder) {
            this.enableNotification = builder.enableNotification;
            this.notificationSilentTimes = builder.notificationSilentTimes;
            this.notificationWebHook = builder.notificationWebHook;
            this.storeId = builder.storeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreConfigInfo create() {
            return builder().build();
        }

        /**
         * @return enableNotification
         */
        public Boolean getEnableNotification() {
            return this.enableNotification;
        }

        /**
         * @return notificationSilentTimes
         */
        public String getNotificationSilentTimes() {
            return this.notificationSilentTimes;
        }

        /**
         * @return notificationWebHook
         */
        public String getNotificationWebHook() {
            return this.notificationWebHook;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        public static final class Builder {
            private Boolean enableNotification; 
            private String notificationSilentTimes; 
            private String notificationWebHook; 
            private String storeId; 

            /**
             * EnableNotification.
             */
            public Builder enableNotification(Boolean enableNotification) {
                this.enableNotification = enableNotification;
                return this;
            }

            /**
             * NotificationSilentTimes.
             */
            public Builder notificationSilentTimes(String notificationSilentTimes) {
                this.notificationSilentTimes = notificationSilentTimes;
                return this;
            }

            /**
             * NotificationWebHook.
             */
            public Builder notificationWebHook(String notificationWebHook) {
                this.notificationWebHook = notificationWebHook;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            public StoreConfigInfo build() {
                return new StoreConfigInfo(this);
            } 

        } 

    }
}
