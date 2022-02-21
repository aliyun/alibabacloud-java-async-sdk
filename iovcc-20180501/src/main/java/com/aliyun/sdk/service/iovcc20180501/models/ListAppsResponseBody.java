// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppsResponseBody</p>
 */
public class ListAppsResponseBody extends TeaModel {
    @NameInMap("Apps")
    private java.util.List < Apps> apps;

    @NameInMap("RequestId")
    private String requestId;

    private ListAppsResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apps
     */
    public java.util.List < Apps> getApps() {
        return this.apps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Apps> apps; 
        private String requestId; 

        /**
         * Apps.
         */
        public Builder apps(java.util.List < Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAppsResponseBody build() {
            return new ListAppsResponseBody(this);
        } 

    } 

    public static class Apps extends TeaModel {
        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppPackage")
        private String appPackage;

        @NameInMap("OsType")
        private Integer osType;

        private Apps(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appPackage = builder.appPackage;
            this.osType = builder.osType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
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
         * @return appPackage
         */
        public String getAppPackage() {
            return this.appPackage;
        }

        /**
         * @return osType
         */
        public Integer getOsType() {
            return this.osType;
        }

        public static final class Builder {
            private String appKey; 
            private String appName; 
            private String appPackage; 
            private Integer osType; 

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
             * AppPackage.
             */
            public Builder appPackage(String appPackage) {
                this.appPackage = appPackage;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(Integer osType) {
                this.osType = osType;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}
