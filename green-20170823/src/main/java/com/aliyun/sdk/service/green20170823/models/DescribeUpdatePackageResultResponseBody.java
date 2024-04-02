// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpdatePackageResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpdatePackageResultResponseBody</p>
 */
public class DescribeUpdatePackageResultResponseBody extends TeaModel {
    @NameInMap("AppInfo")
    private AppInfo appInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUpdatePackageResultResponseBody(Builder builder) {
        this.appInfo = builder.appInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpdatePackageResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfo
     */
    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppInfo appInfo; 
        private String requestId; 

        /**
         * AppInfo.
         */
        public Builder appInfo(AppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpdatePackageResultResponseBody build() {
            return new DescribeUpdatePackageResultResponseBody(this);
        } 

    } 

    public static class DebugPackageInfo extends TeaModel {
        @NameInMap("Version")
        private String version;

        private DebugPackageInfo(Builder builder) {
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DebugPackageInfo create() {
            return builder().build();
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String version; 

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DebugPackageInfo build() {
                return new DebugPackageInfo(this);
            } 

        } 

    }
    public static class PackageInfo extends TeaModel {
        @NameInMap("Version")
        private String version;

        private PackageInfo(Builder builder) {
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageInfo create() {
            return builder().build();
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String version; 

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PackageInfo build() {
                return new PackageInfo(this);
            } 

        } 

    }
    public static class AppInfo extends TeaModel {
        @NameInMap("DebugPackageInfo")
        private DebugPackageInfo debugPackageInfo;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PackageInfo")
        private PackageInfo packageInfo;

        @NameInMap("PackageName")
        private String packageName;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Type")
        private Integer type;

        private AppInfo(Builder builder) {
            this.debugPackageInfo = builder.debugPackageInfo;
            this.endDate = builder.endDate;
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.packageInfo = builder.packageInfo;
            this.packageName = builder.packageName;
            this.startDate = builder.startDate;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfo create() {
            return builder().build();
        }

        /**
         * @return debugPackageInfo
         */
        public DebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageInfo
         */
        public PackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private DebugPackageInfo debugPackageInfo; 
            private String endDate; 
            private String icon; 
            private Long id; 
            private String name; 
            private PackageInfo packageInfo; 
            private String packageName; 
            private String startDate; 
            private Integer type; 

            /**
             * DebugPackageInfo.
             */
            public Builder debugPackageInfo(DebugPackageInfo debugPackageInfo) {
                this.debugPackageInfo = debugPackageInfo;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * PackageInfo.
             */
            public Builder packageInfo(PackageInfo packageInfo) {
                this.packageInfo = packageInfo;
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
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
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
}
