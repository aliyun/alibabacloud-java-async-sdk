// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishedAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedAppInfoResponseBody</p>
 */
public class ListPublishedAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppModels")
    private java.util.List < AppModels> appModels;

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

    /**
     * @return appModels
     */
    public java.util.List < AppModels> getAppModels() {
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
        private java.util.List < AppModels> appModels; 
        private String nextToken; 
        private String requestId; 

        /**
         * appModels
         */
        public Builder appModels(java.util.List < AppModels> appModels) {
            this.appModels = appModels;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublishedAppInfoResponseBody build() {
            return new ListPublishedAppInfoResponseBody(this);
        } 

    } 

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

            /**
             * AppCenterImageId.
             */
            public Builder appCenterImageId(String appCenterImageId) {
                this.appCenterImageId = appCenterImageId;
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
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppThemeColor.
             */
            public Builder appThemeColor(String appThemeColor) {
                this.appThemeColor = appThemeColor;
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
             * AuthTime.
             */
            public Builder authTime(String authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryType.
             */
            public Builder categoryType(Long categoryType) {
                this.categoryType = categoryType;
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
             * UsedInSession.
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
