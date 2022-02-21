// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class AppList extends TeaModel {
        @NameInMap("AppArgs")
        private String appArgs;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppPath")
        private String appPath;

        private AppList(Builder builder) {
            this.appArgs = builder.appArgs;
            this.appName = builder.appName;
            this.appPath = builder.appPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
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
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppPath.
             */
            public Builder appPath(String appPath) {
                this.appPath = appPath;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("AppList")
        private java.util.List < AppList> appList;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IsBoundUser")
        private Boolean isBoundUser;

        @NameInMap("MaxBandwidthIn")
        private Long maxBandwidthIn;

        @NameInMap("MaxBandwidthOut")
        private Long maxBandwidthOut;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("StoppedMode")
        private String stoppedMode;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserUid")
        private Long userUid;

        @NameInMap("WorkMode")
        private String workMode;

        private Instances(Builder builder) {
            this.appList = builder.appList;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.expireTime = builder.expireTime;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.isBoundUser = builder.isBoundUser;
            this.maxBandwidthIn = builder.maxBandwidthIn;
            this.maxBandwidthOut = builder.maxBandwidthOut;
            this.name = builder.name;
            this.status = builder.status;
            this.stoppedMode = builder.stoppedMode;
            this.userName = builder.userName;
            this.userUid = builder.userUid;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public java.util.List < AppList> getAppList() {
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
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
         * @return isBoundUser
         */
        public Boolean getIsBoundUser() {
            return this.isBoundUser;
        }

        /**
         * @return maxBandwidthIn
         */
        public Long getMaxBandwidthIn() {
            return this.maxBandwidthIn;
        }

        /**
         * @return maxBandwidthOut
         */
        public Long getMaxBandwidthOut() {
            return this.maxBandwidthOut;
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
         * @return stoppedMode
         */
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userUid
         */
        public Long getUserUid() {
            return this.userUid;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private java.util.List < AppList> appList; 
            private String clusterId; 
            private String createTime; 
            private String domainName; 
            private String expireTime; 
            private String hostName; 
            private String imageId; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceType; 
            private Boolean isBoundUser; 
            private Long maxBandwidthIn; 
            private Long maxBandwidthOut; 
            private String name; 
            private String status; 
            private String stoppedMode; 
            private String userName; 
            private Long userUid; 
            private String workMode; 

            /**
             * AppList.
             */
            public Builder appList(java.util.List < AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IsBoundUser.
             */
            public Builder isBoundUser(Boolean isBoundUser) {
                this.isBoundUser = isBoundUser;
                return this;
            }

            /**
             * MaxBandwidthIn.
             */
            public Builder maxBandwidthIn(Long maxBandwidthIn) {
                this.maxBandwidthIn = maxBandwidthIn;
                return this;
            }

            /**
             * MaxBandwidthOut.
             */
            public Builder maxBandwidthOut(Long maxBandwidthOut) {
                this.maxBandwidthOut = maxBandwidthOut;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StoppedMode.
             */
            public Builder stoppedMode(String stoppedMode) {
                this.stoppedMode = stoppedMode;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserUid.
             */
            public Builder userUid(Long userUid) {
                this.userUid = userUid;
                return this;
            }

            /**
             * WorkMode.
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
