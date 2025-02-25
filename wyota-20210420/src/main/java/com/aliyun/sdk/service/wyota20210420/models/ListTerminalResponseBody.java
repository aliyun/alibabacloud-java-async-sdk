// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>ListTerminalResponseBody</p>
 */
public class ListTerminalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTerminalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String nextToken; 
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListTerminalResponseBody build() {
            return new ListTerminalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTerminalResponseBody} extends {@link TeaModel}
     *
     * <p>ListTerminalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("BindUserCount")
        private Integer bindUserCount;

        @com.aliyun.core.annotation.NameInMap("BindUserId")
        private String bindUserId;

        @com.aliyun.core.annotation.NameInMap("BuildId")
        private String buildId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("InManage")
        private Boolean inManage;

        @com.aliyun.core.annotation.NameInMap("Ipv4")
        private String ipv4;

        @com.aliyun.core.annotation.NameInMap("LastLoginUser")
        @Deprecated
        private String lastLoginUser;

        @com.aliyun.core.annotation.NameInMap("LocationInfo")
        private String locationInfo;

        @com.aliyun.core.annotation.NameInMap("LockSettings")
        private Boolean lockSettings;

        @com.aliyun.core.annotation.NameInMap("LoginUser")
        private String loginUser;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private Boolean onlineStatus;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
        private String terminalGroupId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.bindUserCount = builder.bindUserCount;
            this.bindUserId = builder.bindUserId;
            this.buildId = builder.buildId;
            this.clientType = builder.clientType;
            this.desktopId = builder.desktopId;
            this.inManage = builder.inManage;
            this.ipv4 = builder.ipv4;
            this.lastLoginUser = builder.lastLoginUser;
            this.locationInfo = builder.locationInfo;
            this.lockSettings = builder.lockSettings;
            this.loginUser = builder.loginUser;
            this.model = builder.model;
            this.onlineStatus = builder.onlineStatus;
            this.serialNumber = builder.serialNumber;
            this.terminalGroupId = builder.terminalGroupId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return bindUserCount
         */
        public Integer getBindUserCount() {
            return this.bindUserCount;
        }

        /**
         * @return bindUserId
         */
        public String getBindUserId() {
            return this.bindUserId;
        }

        /**
         * @return buildId
         */
        public String getBuildId() {
            return this.buildId;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return inManage
         */
        public Boolean getInManage() {
            return this.inManage;
        }

        /**
         * @return ipv4
         */
        public String getIpv4() {
            return this.ipv4;
        }

        /**
         * @return lastLoginUser
         */
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        /**
         * @return locationInfo
         */
        public String getLocationInfo() {
            return this.locationInfo;
        }

        /**
         * @return lockSettings
         */
        public Boolean getLockSettings() {
            return this.lockSettings;
        }

        /**
         * @return loginUser
         */
        public String getLoginUser() {
            return this.loginUser;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return onlineStatus
         */
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return terminalGroupId
         */
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alias; 
            private Integer bindUserCount; 
            private String bindUserId; 
            private String buildId; 
            private Integer clientType; 
            private String desktopId; 
            private Boolean inManage; 
            private String ipv4; 
            private String lastLoginUser; 
            private String locationInfo; 
            private Boolean lockSettings; 
            private String loginUser; 
            private String model; 
            private Boolean onlineStatus; 
            private String serialNumber; 
            private String terminalGroupId; 
            private String uuid; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BindUserCount.
             */
            public Builder bindUserCount(Integer bindUserCount) {
                this.bindUserCount = bindUserCount;
                return this;
            }

            /**
             * BindUserId.
             */
            public Builder bindUserId(String bindUserId) {
                this.bindUserId = bindUserId;
                return this;
            }

            /**
             * BuildId.
             */
            public Builder buildId(String buildId) {
                this.buildId = buildId;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * InManage.
             */
            public Builder inManage(Boolean inManage) {
                this.inManage = inManage;
                return this;
            }

            /**
             * Ipv4.
             */
            public Builder ipv4(String ipv4) {
                this.ipv4 = ipv4;
                return this;
            }

            /**
             * LastLoginUser.
             */
            public Builder lastLoginUser(String lastLoginUser) {
                this.lastLoginUser = lastLoginUser;
                return this;
            }

            /**
             * LocationInfo.
             */
            public Builder locationInfo(String locationInfo) {
                this.locationInfo = locationInfo;
                return this;
            }

            /**
             * LockSettings.
             */
            public Builder lockSettings(Boolean lockSettings) {
                this.lockSettings = lockSettings;
                return this;
            }

            /**
             * LoginUser.
             */
            public Builder loginUser(String loginUser) {
                this.loginUser = loginUser;
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
             * OnlineStatus.
             */
            public Builder onlineStatus(Boolean onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * TerminalGroupId.
             */
            public Builder terminalGroupId(String terminalGroupId) {
                this.terminalGroupId = terminalGroupId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
