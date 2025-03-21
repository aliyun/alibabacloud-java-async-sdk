// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceInfoResponseBody</p>
 */
public class QueryDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDeviceInfoResponseBody(Builder builder) {
        this.deviceInfo = builder.deviceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceInfo deviceInfo; 
        private String requestId; 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDeviceInfoResponseBody build() {
            return new QueryDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceInfoResponseBody</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceToken")
        private String deviceToken;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PushEnabled")
        private Boolean pushEnabled;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private DeviceInfo(Builder builder) {
            this.account = builder.account;
            this.alias = builder.alias;
            this.brand = builder.brand;
            this.deviceId = builder.deviceId;
            this.deviceToken = builder.deviceToken;
            this.deviceType = builder.deviceType;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.model = builder.model;
            this.online = builder.online;
            this.phoneNumber = builder.phoneNumber;
            this.pushEnabled = builder.pushEnabled;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceToken
         */
        public String getDeviceToken() {
            return this.deviceToken;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return lastOnlineTime
         */
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return pushEnabled
         */
        public Boolean getPushEnabled() {
            return this.pushEnabled;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String account; 
            private String alias; 
            private String brand; 
            private String deviceId; 
            private String deviceToken; 
            private String deviceType; 
            private String lastOnlineTime; 
            private String model; 
            private Boolean online; 
            private String phoneNumber; 
            private Boolean pushEnabled; 
            private String tags; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceToken.
             */
            public Builder deviceToken(String deviceToken) {
                this.deviceToken = deviceToken;
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
             * LastOnlineTime.
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
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
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * PushEnabled.
             */
            public Builder pushEnabled(Boolean pushEnabled) {
                this.pushEnabled = pushEnabled;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
}
