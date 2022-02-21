// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    private Applications applications;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applications
     */
    public Applications getApplications() {
        return this.applications;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Applications applications; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Applications.
         */
        public Builder applications(Applications applications) {
            this.applications = applications;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppInfo")
        private String appInfo;

        private App(Builder builder) {
            this.appId = builder.appId;
            this.appInfo = builder.appInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInfo
         */
        public String getAppInfo() {
            return this.appInfo;
        }

        public static final class Builder {
            private String appId; 
            private String appInfo; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppInfo.
             */
            public Builder appInfo(String appInfo) {
                this.appInfo = appInfo;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class AppList extends TeaModel {
        @NameInMap("App")
        private java.util.List < App> app;

        private AppList(Builder builder) {
            this.app = builder.app;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public java.util.List < App> getApp() {
            return this.app;
        }

        public static final class Builder {
            private java.util.List < App> app; 

            /**
             * App.
             */
            public Builder app(java.util.List < App> app) {
                this.app = app;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @NameInMap("AppList")
        private AppList appList;

        @NameInMap("ClusterName")
        private String clusterName;

        private Application(Builder builder) {
            this.appList = builder.appList;
            this.clusterName = builder.clusterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public AppList getAppList() {
            return this.appList;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        public static final class Builder {
            private AppList appList; 
            private String clusterName; 

            /**
             * AppList.
             */
            public Builder appList(AppList appList) {
                this.appList = appList;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class Applications extends TeaModel {
        @NameInMap("Application")
        private java.util.List < Application> application;

        private Applications(Builder builder) {
            this.application = builder.application;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public java.util.List < Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List < Application> application; 

            /**
             * Application.
             */
            public Builder application(java.util.List < Application> application) {
                this.application = application;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
