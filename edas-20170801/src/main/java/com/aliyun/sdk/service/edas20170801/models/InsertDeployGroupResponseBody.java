// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertDeployGroupResponseBody} extends {@link TeaModel}
 *
 * <p>InsertDeployGroupResponseBody</p>
 */
public class InsertDeployGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("DeployGroupEntity")
    private DeployGroupEntity deployGroupEntity;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InsertDeployGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.deployGroupEntity = builder.deployGroupEntity;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertDeployGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return deployGroupEntity
     */
    public DeployGroupEntity getDeployGroupEntity() {
        return this.deployGroupEntity;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private DeployGroupEntity deployGroupEntity; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the instance group.
         */
        public Builder deployGroupEntity(DeployGroupEntity deployGroupEntity) {
            this.deployGroupEntity = deployGroupEntity;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertDeployGroupResponseBody build() {
            return new InsertDeployGroupResponseBody(this);
        } 

    } 

    public static class DeployGroupEntity extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppVersionId")
        private String appVersionId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private Integer groupType;

        @NameInMap("Id")
        private String id;

        @NameInMap("PackageVersionId")
        private String packageVersionId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private DeployGroupEntity(Builder builder) {
            this.appId = builder.appId;
            this.appVersionId = builder.appVersionId;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.id = builder.id;
            this.packageVersionId = builder.packageVersionId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroupEntity create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersionId
         */
        public String getAppVersionId() {
            return this.appVersionId;
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
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public Integer getGroupType() {
            return this.groupType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return packageVersionId
         */
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appId; 
            private String appVersionId; 
            private String clusterId; 
            private Long createTime; 
            private String groupName; 
            private Integer groupType; 
            private String id; 
            private String packageVersionId; 
            private Long updateTime; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The version of the deployment package for the application.
             * <p>
             * 
             * *   If the application is deployed, a string of random numbers is returned.
             * *   If the application is not deployed, the return value is empty.
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the instance group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the instance group. Valid values:
             * <p>
             * 
             * *   0: the default group.
             * *   1: a group for which canary traffic management is not enabled.
             * *   2: a group for which canary traffic management is enabled.
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The ID of the instance group.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The version of the deployment package that was used to deploy an application in the instance group.
             * <p>
             * 
             * *   If an application is deployed in the instance group, a string of random numbers is returned.
             * *   If no application is deployed in the instance group, the return value is empty.
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeployGroupEntity build() {
                return new DeployGroupEntity(this);
            } 

        } 

    }
}
