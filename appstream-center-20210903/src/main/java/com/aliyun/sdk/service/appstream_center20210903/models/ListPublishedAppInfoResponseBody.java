// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
 * {@link ListPublishedAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedAppInfoResponseBody</p>
 */
public class ListPublishedAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppModels")
    private java.util.List<AppModels> appModels;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPublishedAppInfoResponseBody(Builder builder) {
        this.appModels = builder.appModels;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAppInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appModels
     */
    public java.util.List<AppModels> getAppModels() {
        return this.appModels;
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

    public static final class Builder {
        private java.util.List<AppModels> appModels; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPublishedAppInfoResponseBody model) {
            this.appModels = model.appModels;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of published applications.</p>
         */
        public Builder appModels(java.util.List<AppModels> appModels) {
            this.appModels = appModels;
            return this;
        }

        /**
         * <p>The starting token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>2NVfhLfgy5b3J5iJyoLQ6x4EULMg1hbhgB9NfnvdK9oj5zwxd17j4TuQkZze3RvhEvBinZYjknujF3Q1M</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DB70F8FE-63A3-587B-8560-CEC258E8B944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublishedAppInfoResponseBody build() {
            return new ListPublishedAppInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedAppInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAppInfoResponseBody</p>
     */
    public static class AppModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
        private String appCenterImageId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppThemeColor")
        private String appThemeColor;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        @com.aliyun.core.annotation.NameInMap("AuthTime")
        private String authTime;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Long categoryType;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("IsAuth")
        private Boolean isAuth;

        @com.aliyun.core.annotation.NameInMap("UsedInSession")
        private Boolean usedInSession;

        private AppModels(Builder builder) {
            this.appCenterImageId = builder.appCenterImageId;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appThemeColor = builder.appThemeColor;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
            this.authTime = builder.authTime;
            this.categoryId = builder.categoryId;
            this.categoryType = builder.categoryType;
            this.iconUrl = builder.iconUrl;
            this.isAuth = builder.isAuth;
            this.usedInSession = builder.usedInSession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppModels create() {
            return builder().build();
        }

        /**
         * @return appCenterImageId
         */
        public String getAppCenterImageId() {
            return this.appCenterImageId;
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
         * @return appThemeColor
         */
        public String getAppThemeColor() {
            return this.appThemeColor;
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
         * @return authTime
         */
        public String getAuthTime() {
            return this.authTime;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryType
         */
        public Long getCategoryType() {
            return this.categoryType;
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
         * @return usedInSession
         */
        public Boolean getUsedInSession() {
            return this.usedInSession;
        }

        public static final class Builder {
            private String appCenterImageId; 
            private String appId; 
            private String appName; 
            private String appThemeColor; 
            private String appVersion; 
            private String appVersionName; 
            private String authTime; 
            private Long categoryId; 
            private Long categoryType; 
            private String iconUrl; 
            private Boolean isAuth; 
            private Boolean usedInSession; 

            private Builder() {
            } 

            private Builder(AppModels model) {
                this.appCenterImageId = model.appCenterImageId;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appThemeColor = model.appThemeColor;
                this.appVersion = model.appVersion;
                this.appVersionName = model.appVersionName;
                this.authTime = model.authTime;
                this.categoryId = model.categoryId;
                this.categoryType = model.categoryType;
                this.iconUrl = model.iconUrl;
                this.isAuth = model.isAuth;
                this.usedInSession = model.usedInSession;
            } 

            /**
             * <p>The application image ID. You can obtain the ID from the Image Management page in the WUYING Cloud App console.</p>
             * 
             * <strong>example:</strong>
             * <p>img-f37nddbjc1lje14st</p>
             */
            public Builder appCenterImageId(String appCenterImageId) {
                this.appCenterImageId = appCenterImageId;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-fxwp4koyr5y2sp4mz</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Microsoft Word</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The theme color of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder appThemeColor(String appThemeColor) {
                this.appThemeColor = appThemeColor;
                return this;
            }

            /**
             * <p>The application version number.</p>
             * 
             * <strong>example:</strong>
             * <p>R2021a</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The application version name.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * <p>The authorization time of the application.
             * The return value is a serialized datetime string from the server in the format of <code>EEE MMM dd HH:mm:ss zzz yyyy</code>, which represents the day of the week, month, day, hour:minute:second, time zone abbreviation, and year in sequence. For example, <code>Wed Jan 14 20:47:02 CST 2026</code>, where <code>CST</code> is the time zone abbreviation of the server\&quot;s time zone (China Standard Time, UTC+08:00).</p>
             * 
             * <strong>example:</strong>
             * <p>Wed Jan 14 20:47:02 CST 2026</p>
             */
            public Builder authTime(String authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * <p>The specific category information of the application, which is the secondary category.
             * Valid values:</p>
             * <ul>
             * <li>1: All applications</li>
             * <li>2: Design software</li>
             * <li>3: Programming and development</li>
             * <li>4: Office essentials</li>
             * <li>5: Input methods</li>
             * <li>6: Image and video</li>
             * <li>7: System tools</li>
             * <li>8: Browsers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The primary category of the application. Valid values:</p>
             * <ul>
             * <li>0: Cloud application</li>
             * <li>1: Cloud game</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryType(Long categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>The URL of the application icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-streaming-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1973619010349344/1634523814270_Matlab.png">https://app-streaming-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1973619010349344/1634523814270_Matlab.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>Indicates whether the user has permissions.
             * The value is True.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isAuth(Boolean isAuth) {
                this.isAuth = isAuth;
                return this;
            }

            /**
             * <p>Indicates whether the application is in use.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder usedInSession(Boolean usedInSession) {
                this.usedInSession = usedInSession;
                return this;
            }

            public AppModels build() {
                return new AppModels(this);
            } 

        } 

    }
}
