// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link ListAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppsResponseBody</p>
 */
public class ListAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfos")
    private AppInfos appInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("UbsmsStatus")
    private String ubsmsStatus;

    private ListAppsResponseBody(Builder builder) {
        this.appInfos = builder.appInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.ubsmsStatus = builder.ubsmsStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfos
     */
    public AppInfos getAppInfos() {
        return this.appInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return ubsmsStatus
     */
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public static final class Builder {
        private AppInfos appInfos; 
        private String requestId; 
        private Integer total; 
        private String ubsmsStatus; 

        /**
         * AppInfos.
         */
        public Builder appInfos(AppInfos appInfos) {
            this.appInfos = appInfos;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * UbsmsStatus.
         */
        public Builder ubsmsStatus(String ubsmsStatus) {
            this.ubsmsStatus = ubsmsStatus;
            return this;
        }

        public ListAppsResponseBody build() {
            return new ListAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppsResponseBody</p>
     */
    public static class AppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("EncodedIcon")
        private String encodedIcon;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Integer industryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private AppInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.bundleId = builder.bundleId;
            this.encodedIcon = builder.encodedIcon;
            this.industryId = builder.industryId;
            this.name = builder.name;
            this.packageName = builder.packageName;
            this.readonly = builder.readonly;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfo create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return encodedIcon
         */
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        /**
         * @return industryId
         */
        public Integer getIndustryId() {
            return this.industryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String appKey; 
            private String bundleId; 
            private String encodedIcon; 
            private Integer industryId; 
            private String name; 
            private String packageName; 
            private Boolean readonly; 
            private Integer type; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * EncodedIcon.
             */
            public Builder encodedIcon(String encodedIcon) {
                this.encodedIcon = encodedIcon;
                return this;
            }

            /**
             * IndustryId.
             */
            public Builder industryId(Integer industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * Readonly.
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AppInfo build() {
                return new AppInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppsResponseBody</p>
     */
    public static class AppInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInfo")
        private java.util.List<AppInfo> appInfo;

        private AppInfos(Builder builder) {
            this.appInfo = builder.appInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfos create() {
            return builder().build();
        }

        /**
         * @return appInfo
         */
        public java.util.List<AppInfo> getAppInfo() {
            return this.appInfo;
        }

        public static final class Builder {
            private java.util.List<AppInfo> appInfo; 

            /**
             * AppInfo.
             */
            public Builder appInfo(java.util.List<AppInfo> appInfo) {
                this.appInfo = appInfo;
                return this;
            }

            public AppInfos build() {
                return new AppInfos(this);
            } 

        } 

    }
}
