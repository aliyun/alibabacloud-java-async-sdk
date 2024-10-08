// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTerminalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTerminalsResponseBody</p>
 */
public class ListTerminalsResponseBody extends TeaModel {
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

    private ListTerminalsResponseBody(Builder builder) {
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

    public static ListTerminalsResponseBody create() {
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

        public ListTerminalsResponseBody build() {
            return new ListTerminalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTerminalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTerminalsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("BindUserCount")
        private Integer bindUserCount;

        @com.aliyun.core.annotation.NameInMap("BuildId")
        private String buildId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("CurrentConnectDesktop")
        private String currentConnectDesktop;

        @com.aliyun.core.annotation.NameInMap("CurrentLoginUser")
        private String currentLoginUser;

        @com.aliyun.core.annotation.NameInMap("Ipv4")
        private String ipv4;

        @com.aliyun.core.annotation.NameInMap("LastLoginUser")
        private String lastLoginUser;

        @com.aliyun.core.annotation.NameInMap("LocationInfo")
        private String locationInfo;

        @com.aliyun.core.annotation.NameInMap("ManageTime")
        private String manageTime;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("PasswordFreeLoginUser")
        private String passwordFreeLoginUser;

        @com.aliyun.core.annotation.NameInMap("PublicIpv4")
        private String publicIpv4;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SetPasswordFreeLoginUserTime")
        private String setPasswordFreeLoginUserTime;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
        private String terminalGroupId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.bindUserCount = builder.bindUserCount;
            this.buildId = builder.buildId;
            this.clientType = builder.clientType;
            this.currentConnectDesktop = builder.currentConnectDesktop;
            this.currentLoginUser = builder.currentLoginUser;
            this.ipv4 = builder.ipv4;
            this.lastLoginUser = builder.lastLoginUser;
            this.locationInfo = builder.locationInfo;
            this.manageTime = builder.manageTime;
            this.model = builder.model;
            this.online = builder.online;
            this.passwordFreeLoginUser = builder.passwordFreeLoginUser;
            this.publicIpv4 = builder.publicIpv4;
            this.serialNumber = builder.serialNumber;
            this.setPasswordFreeLoginUserTime = builder.setPasswordFreeLoginUserTime;
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
         * @return currentConnectDesktop
         */
        public String getCurrentConnectDesktop() {
            return this.currentConnectDesktop;
        }

        /**
         * @return currentLoginUser
         */
        public String getCurrentLoginUser() {
            return this.currentLoginUser;
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
         * @return manageTime
         */
        public String getManageTime() {
            return this.manageTime;
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
         * @return passwordFreeLoginUser
         */
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        /**
         * @return publicIpv4
         */
        public String getPublicIpv4() {
            return this.publicIpv4;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return setPasswordFreeLoginUserTime
         */
        public String getSetPasswordFreeLoginUserTime() {
            return this.setPasswordFreeLoginUserTime;
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
            private String buildId; 
            private Integer clientType; 
            private String currentConnectDesktop; 
            private String currentLoginUser; 
            private String ipv4; 
            private String lastLoginUser; 
            private String locationInfo; 
            private String manageTime; 
            private String model; 
            private Boolean online; 
            private String passwordFreeLoginUser; 
            private String publicIpv4; 
            private String serialNumber; 
            private String setPasswordFreeLoginUserTime; 
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
             * CurrentConnectDesktop.
             */
            public Builder currentConnectDesktop(String currentConnectDesktop) {
                this.currentConnectDesktop = currentConnectDesktop;
                return this;
            }

            /**
             * CurrentLoginUser.
             */
            public Builder currentLoginUser(String currentLoginUser) {
                this.currentLoginUser = currentLoginUser;
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
             * ManageTime.
             */
            public Builder manageTime(String manageTime) {
                this.manageTime = manageTime;
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
             * PasswordFreeLoginUser.
             */
            public Builder passwordFreeLoginUser(String passwordFreeLoginUser) {
                this.passwordFreeLoginUser = passwordFreeLoginUser;
                return this;
            }

            /**
             * PublicIpv4.
             */
            public Builder publicIpv4(String publicIpv4) {
                this.publicIpv4 = publicIpv4;
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
             * SetPasswordFreeLoginUserTime.
             */
            public Builder setPasswordFreeLoginUserTime(String setPasswordFreeLoginUserTime) {
                this.setPasswordFreeLoginUserTime = setPasswordFreeLoginUserTime;
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
