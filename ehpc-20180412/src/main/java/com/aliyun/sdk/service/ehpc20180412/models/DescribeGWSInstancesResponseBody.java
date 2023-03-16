// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGWSInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGWSInstancesResponseBody</p>
 */
public class DescribeGWSInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGWSInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGWSInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of visualization instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The page number of the current page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGWSInstancesResponseBody build() {
            return new DescribeGWSInstancesResponseBody(this);
        } 

    } 

    public static class AppInfo extends TeaModel {
        @NameInMap("AppArgs")
        private String appArgs;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppPath")
        private String appPath;

        private AppInfo(Builder builder) {
            this.appArgs = builder.appArgs;
            this.appName = builder.appName;
            this.appPath = builder.appPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfo create() {
            return builder().build();
        }

        /**
         * @return appArgs
         */
        public String getAppArgs() {
            return this.appArgs;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appPath
         */
        public String getAppPath() {
            return this.appPath;
        }

        public static final class Builder {
            private String appArgs; 
            private String appName; 
            private String appPath; 

            /**
             * AppArgs.
             */
            public Builder appArgs(String appArgs) {
                this.appArgs = appArgs;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The execution directory of the application.
             */
            public Builder appPath(String appPath) {
                this.appPath = appPath;
                return this;
            }

            public AppInfo build() {
                return new AppInfo(this);
            } 

        } 

    }
    public static class AppList extends TeaModel {
        @NameInMap("AppInfo")
        private java.util.List < AppInfo> appInfo;

        private AppList(Builder builder) {
            this.appInfo = builder.appInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appInfo
         */
        public java.util.List < AppInfo> getAppInfo() {
            return this.appInfo;
        }

        public static final class Builder {
            private java.util.List < AppInfo> appInfo; 

            /**
             * AppInfo.
             */
            public Builder appInfo(java.util.List < AppInfo> appInfo) {
                this.appInfo = appInfo;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    public static class InstanceInfo extends TeaModel {
        @NameInMap("AppList")
        private AppList appList;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("WorkMode")
        private String workMode;

        private InstanceInfo(Builder builder) {
            this.appList = builder.appList;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.name = builder.name;
            this.status = builder.status;
            this.userName = builder.userName;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public AppList getAppList() {
            return this.appList;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private AppList appList; 
            private String clusterId; 
            private String createTime; 
            private String expireTime; 
            private String instanceId; 
            private String instanceType; 
            private String name; 
            private String status; 
            private String userName; 
            private String workMode; 

            /**
             * The list of application information.
             * <p>
             * 
             * >  If the WorkMode parameter is set to Desktop, an empty value is returned in this parameter.
             */
            public Builder appList(AppList appList) {
                this.appList = appList;
                return this;
            }

            /**
             * The ID of the visualizatio service.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the visualization instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the visualization instance expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the visualization instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the visualization instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The name of the visualization instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the visualization instance. Valid values:
             * <p>
             * 
             * *   Creating: The instance is being created.
             * *   Starting: The instance is being started.
             * *   Stopping: The instance is being stopped.
             * *   Stopped: The instance is stopped.
             * *   Initializing: The instance is being initialized.
             * *   Unregistered: The instance is not registered.
             * *   Registered: The instance is registered.
             * *   InUse: The instance is in use.
             * *   Missing: The instance cannot be found.
             * *   Cloning: An image is being generated based on the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The username of the entity to which the visualization instance is assigned.
             * <p>
             * 
             * >  If the instance is not assigned to a specified user, this parameter is empty.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The working mode of the visualization instance. Valid values:
             * <p>
             * 
             * *   Desktop
             * *   Application
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("InstanceInfo")
        private java.util.List < InstanceInfo> instanceInfo;

        private Instances(Builder builder) {
            this.instanceInfo = builder.instanceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceInfo
         */
        public java.util.List < InstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

        public static final class Builder {
            private java.util.List < InstanceInfo> instanceInfo; 

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(java.util.List < InstanceInfo> instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
