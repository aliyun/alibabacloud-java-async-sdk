// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link App} extends {@link TeaModel}
 *
 * <p>App</p>
 */
public class App extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppDescription")
    private String appDescription;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppRegion")
    private Long appRegion;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private Long appType;

    @com.aliyun.core.annotation.NameInMap("EnglishName")
    private String englishName;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    private App(Builder builder) {
        this.appDescription = builder.appDescription;
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.appName = builder.appName;
        this.appRegion = builder.appRegion;
        this.appType = builder.appType;
        this.englishName = builder.englishName;
        this.ownerId = builder.ownerId;
        this.packageName = builder.packageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static App create() {
        return builder().build();
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appRegion
     */
    public Long getAppRegion() {
        return this.appRegion;
    }

    /**
     * @return appType
     */
    public Long getAppType() {
        return this.appType;
    }

    /**
     * @return englishName
     */
    public String getEnglishName() {
        return this.englishName;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    public static final class Builder {
        private String appDescription; 
        private String appId; 
        private String appKey; 
        private String appName; 
        private Long appRegion; 
        private Long appType; 
        private String englishName; 
        private String ownerId; 
        private String packageName; 

        /**
         * AppDescription.
         */
        public Builder appDescription(String appDescription) {
            this.appDescription = appDescription;
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
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
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
         * AppRegion.
         */
        public Builder appRegion(Long appRegion) {
            this.appRegion = appRegion;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Long appType) {
            this.appType = appType;
            return this;
        }

        /**
         * EnglishName.
         */
        public Builder englishName(String englishName) {
            this.englishName = englishName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PackageName.
         */
        public Builder packageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public App build() {
            return new App(this);
        } 

    } 

}
