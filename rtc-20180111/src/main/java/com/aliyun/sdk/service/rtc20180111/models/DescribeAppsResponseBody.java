// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsResponseBody</p>
 */
public class DescribeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppList")
    private AppList appList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeAppsResponseBody(Builder builder) {
        this.appList = builder.appList;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appList
     */
    public AppList getAppList() {
        return this.appList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private AppList appList; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        /**
         * AppList.
         */
        public Builder appList(AppList appList) {
            this.appList = appList;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAppsResponseBody build() {
            return new DescribeAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class ServiceAreas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceArea")
        private java.util.List < String > serviceArea;

        private ServiceAreas(Builder builder) {
            this.serviceArea = builder.serviceArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAreas create() {
            return builder().build();
        }

        /**
         * @return serviceArea
         */
        public java.util.List < String > getServiceArea() {
            return this.serviceArea;
        }

        public static final class Builder {
            private java.util.List < String > serviceArea; 

            /**
             * ServiceArea.
             */
            public Builder serviceArea(java.util.List < String > serviceArea) {
                this.serviceArea = serviceArea;
                return this;
            }

            public ServiceAreas build() {
                return new ServiceAreas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class App extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BillType")
        private String billType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ServiceAreas")
        private ServiceAreas serviceAreas;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private App(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.billType = builder.billType;
            this.createTime = builder.createTime;
            this.serviceAreas = builder.serviceAreas;
            this.status = builder.status;
            this.version = builder.version;
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
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return serviceAreas
         */
        public ServiceAreas getServiceAreas() {
            return this.serviceAreas;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appType; 
            private String billType; 
            private String createTime; 
            private ServiceAreas serviceAreas; 
            private Integer status; 
            private String version; 

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
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ServiceAreas.
             */
            public Builder serviceAreas(ServiceAreas serviceAreas) {
                this.serviceAreas = serviceAreas;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
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
}
