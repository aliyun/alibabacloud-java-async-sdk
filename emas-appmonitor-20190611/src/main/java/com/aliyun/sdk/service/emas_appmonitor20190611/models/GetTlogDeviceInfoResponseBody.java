// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetTlogDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTlogDeviceInfoResponseBody</p>
 */
public class GetTlogDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTlogDeviceInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTlogDeviceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Long getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private Long errorCode; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTlogDeviceInfoResponseBody model) {
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public GetTlogDeviceInfoResponseBody build() {
            return new GetTlogDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTlogDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTlogDeviceInfoResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppBuild")
        private String appBuild;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("ClientTime")
        private Long clientTime;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("Geo")
        private String geo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Imsi")
        private String imsi;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("ServerTime")
        private Long serverTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Model(Builder builder) {
            this.appBuild = builder.appBuild;
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appVersion = builder.appVersion;
            this.brand = builder.brand;
            this.clientTime = builder.clientTime;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.geo = builder.geo;
            this.id = builder.id;
            this.imsi = builder.imsi;
            this.ip = builder.ip;
            this.os = builder.os;
            this.osVersion = builder.osVersion;
            this.serverTime = builder.serverTime;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return appBuild
         */
        public String getAppBuild() {
            return this.appBuild;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return clientTime
         */
        public Long getClientTime() {
            return this.clientTime;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return geo
         */
        public String getGeo() {
            return this.geo;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imsi
         */
        public String getImsi() {
            return this.imsi;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return serverTime
         */
        public Long getServerTime() {
            return this.serverTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
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
            private String appBuild; 
            private String appId; 
            private String appKey; 
            private String appVersion; 
            private String brand; 
            private Long clientTime; 
            private String deviceId; 
            private String deviceModel; 
            private String geo; 
            private String id; 
            private String imsi; 
            private String ip; 
            private String os; 
            private String osVersion; 
            private Long serverTime; 
            private Long updateTime; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.appBuild = model.appBuild;
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appVersion = model.appVersion;
                this.brand = model.brand;
                this.clientTime = model.clientTime;
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.geo = model.geo;
                this.id = model.id;
                this.imsi = model.imsi;
                this.ip = model.ip;
                this.os = model.os;
                this.osVersion = model.osVersion;
                this.serverTime = model.serverTime;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * AppBuild.
             */
            public Builder appBuild(String appBuild) {
                this.appBuild = appBuild;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>appKey</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
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
             * ClientTime.
             */
            public Builder clientTime(Long clientTime) {
                this.clientTime = clientTime;
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
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * Geo.
             */
            public Builder geo(String geo) {
                this.geo = geo;
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
             * Imsi.
             */
            public Builder imsi(String imsi) {
                this.imsi = imsi;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * ServerTime.
             */
            public Builder serverTime(Long serverTime) {
                this.serverTime = serverTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>userId</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
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

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
