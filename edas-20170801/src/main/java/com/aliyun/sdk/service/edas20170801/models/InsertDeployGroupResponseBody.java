// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InsertDeployGroupResponseBody} extends {@link TeaModel}
 *
 * <p>InsertDeployGroupResponseBody</p>
 */
public class InsertDeployGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DeployGroupEntity")
    private DeployGroupEntity deployGroupEntity;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InsertDeployGroupResponseBody model) {
            this.code = model.code;
            this.deployGroupEntity = model.deployGroupEntity;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the instance group.</p>
         */
        public Builder deployGroupEntity(DeployGroupEntity deployGroupEntity) {
            this.deployGroupEntity = deployGroupEntity;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3RD9-D3FRE****************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertDeployGroupResponseBody build() {
            return new InsertDeployGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertDeployGroupResponseBody} extends {@link TeaModel}
     *
     * <p>InsertDeployGroupResponseBody</p>
     */
    public static class DeployGroupEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private Integer groupType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PackageVersionId")
        private String packageVersionId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(DeployGroupEntity model) {
                this.appId = model.appId;
                this.appVersionId = model.appVersionId;
                this.clusterId = model.clusterId;
                this.createTime = model.createTime;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.id = model.id;
                this.packageVersionId = model.packageVersionId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-***********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The version of the deployment package for the application.</p>
             * <ul>
             * <li>If the application is deployed, a string of random numbers is returned.</li>
             * <li>If the application is not deployed, the return value is empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>f4c50-16ee-a02b-667</strong></strong>*</p>
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0d247b93-8d62-4e34***********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573627695779</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the instance group. Valid values:</p>
             * <ul>
             * <li>0: the default group.</li>
             * <li>1: a group for which canary traffic management is not enabled.</li>
             * <li>2: a group for which canary traffic management is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>577f4c50-16ee-43d8-a02b-667*********</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
             * <ul>
             * <li>If an application is deployed in the instance group, a string of random numbers is returned.</li>
             * <li>If no application is deployed in the instance group, the return value is empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>7b93-8d62-4e34</strong></strong>*******</p>
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * <p>The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573627695779</p>
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
