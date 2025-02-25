// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLFUAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListLFUAppResponseBody</p>
 */
public class ListLFUAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListLFUAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLFUAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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

        public ListLFUAppResponseBody build() {
            return new ListLFUAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLFUAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListLFUAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("IsAuth")
        private Boolean isAuth;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
            this.iconUrl = builder.iconUrl;
            this.isAuth = builder.isAuth;
            this.osType = builder.osType;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return appVersionName
         */
        public String getAppVersionName() {
            return this.appVersionName;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return isAuth
         */
        public Boolean getIsAuth() {
            return this.isAuth;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String appVersionName; 
            private String iconUrl; 
            private Boolean isAuth; 
            private String osType; 
            private String requestId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * AppVersionName.
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * IsAuth.
             */
            public Builder isAuth(Boolean isAuth) {
                this.isAuth = isAuth;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
