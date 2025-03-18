// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private Applications applications;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListApplicationsResponseBody model) {
            this.applications = model.applications;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about applications.</p>
         */
        public Builder applications(Applications applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class App extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInfo")
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

            private Builder() {
            } 

            private Builder(App model) {
                this.appId = model.appId;
                this.appInfo = model.appInfo;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The information about the application, such as the resource specification, parameter configuration, and resources.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;AppStatus&quot;:{
             *         &quot;Phase&quot;:&quot;RUNNING&quot;,
             *         &quot;StatusDescrip&quot;:&quot;{&quot;status&quot;:&quot;UPDATE_SUCCESS&quot;,&quot;step&quot;:&quot;DONE&quot;,&quot;descrip&quot;:&quot;update to version:1022 success&quot;,&quot;start_time&quot;:&quot;2022-03-01 16:18:22&quot;}&quot;,
             *         &quot;UpdateTime&quot;:&quot;2022-03-01 16:18:22&quot;,
             *         &quot;OrderStatus&quot;:null
             *     },
             *     &quot;ResourceAttribute&quot;:{
             *         &quot;NetSecurityInfo&quot;:null,
             *         &quot;InitConfig&quot;:null,
             *         &quot;InventoryType&quot;:&quot;Ens&quot;,
             *         &quot;InstanceSpec&quot;:&quot;ens.gi6s-c12g1.large&quot;,
             *         &quot;SystemDiskSize&quot;:100,
             *         &quot;DataDiskSize&quot;:0,
             *         &quot;BandwithOut&quot;:5000,
             *         &quot;SchedulingStrategy&quot;:&quot;Disperse&quot;,
             *         &quot;ImageId&quot;:&quot;m-5or73kzkuxytv7hh6wxr6yc5q&quot;,
             *         &quot;ResourceType&quot;:&quot;Linux&quot;,
             *         &quot;AreaLevel&quot;:&quot;National&quot;,
             *         &quot;IpType&quot;:&quot;PublicIP&quot;
             *     },
             *     &quot;WorkloadAttribute&quot;:[
             *         {
             *             &quot;Name&quot;:&quot;andorid&quot;,
             *             &quot;Count&quot;:15,
             *             &quot;ServiceConfig&quot;:{
             *                 &quot;PortsBindConfig&quot;:{
             *                     &quot;NetServiceContainer&quot;:&quot;uravi-service&quot;,
             *                     &quot;Ports&quot;:[
             *                         {
             *                             &quot;Protocol&quot;:&quot;TCP&quot;,
             *                             &quot;BindType&quot;:&quot;Mapping&quot;,
             *                             &quot;StartNodePorts&quot;:&quot;31000-31009&quot;,
             *                             &quot;ContainerPorts&quot;:&quot;4440-4449&quot;
             *                         },
             *                         {
             *                             &quot;Protocol&quot;:&quot;TCP&quot;,
             *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
             *                             &quot;StartNodePorts&quot;:&quot;59000-59000&quot;,
             *                             &quot;ContainerPorts&quot;:&quot;59000-59000&quot;
             *                         },
             *                         {
             *                             &quot;Protocol&quot;:&quot;UDP&quot;,
             *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
             *                             &quot;StartNodePorts&quot;:&quot;40001-40010&quot;,
             *                             &quot;ContainerPorts&quot;:&quot;40001-40010&quot;
             *                         }
             *                     ]
             *                 },
             *                 &quot;ServiceContainerName&quot;:&quot;android&quot;
             *             }
             *         },
             *         {
             *             &quot;Name&quot;:&quot;coturn&quot;,
             *             &quot;Count&quot;:1,
             *             &quot;ServiceConfig&quot;:{
             *                 &quot;PortsBindConfig&quot;:{
             *                     &quot;NetServiceContainer&quot;:&quot;coturn&quot;,
             *                     &quot;Ports&quot;:[
             *                         {
             *                             &quot;Protocol&quot;:&quot;TCP&quot;,
             *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
             *                             &quot;StartNodePorts&quot;:&quot;3478-3478&quot;,
             *                             &quot;ContainerPorts&quot;:&quot;3478-3478&quot;
             *                         },
             *                         {
             *                             &quot;Protocol&quot;:&quot;UDP&quot;,
             *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
             *                             &quot;StartNodePorts&quot;:&quot;3478-3478&quot;,
             *                             &quot;ContainerPorts&quot;:&quot;3478-3478&quot;
             *                         }
             *                     ]
             *                 },
             *                 &quot;ServiceContainerName&quot;:&quot;coturn&quot;
             *             }
             *         },
             *         {
             *             &quot;Name&quot;:&quot;aic-manager&quot;,
             *             &quot;Count&quot;:1,
             *             &quot;ServiceConfig&quot;:null
             *         }
             *     ]
             * }</p>
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
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private java.util.List<App> app;

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
        public java.util.List<App> getApp() {
            return this.app;
        }

        public static final class Builder {
            private java.util.List<App> app; 

            private Builder() {
            } 

            private Builder(AppList model) {
                this.app = model.app;
            } 

            /**
             * App.
             */
            public Builder app(java.util.List<App> app) {
                this.app = app;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppList")
        private AppList appList;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.appList = model.appList;
                this.clusterName = model.clusterName;
            } 

            /**
             * <p>Details about the application.</p>
             */
            public Builder appList(AppList appList) {
                this.appList = appList;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ay-ads-hz-h</p>
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
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private java.util.List<Application> application;

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
        public java.util.List<Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List<Application> application; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.application = model.application;
            } 

            /**
             * Application.
             */
            public Builder application(java.util.List<Application> application) {
                this.application = application;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
