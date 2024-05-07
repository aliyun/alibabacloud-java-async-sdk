// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMigrationTaskResponseBody</p>
 */
public class UpdateMigrationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateMigrationTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMigrationTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The data structure.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The message returned.
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

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateMigrationTaskResponseBody build() {
            return new UpdateMigrationTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceAddress")
        private String originInstanceAddress;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceName")
        private String originInstanceName;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceNamespace")
        private String originInstanceNamespace;

        @com.aliyun.core.annotation.NameInMap("ProjectDesc")
        private String projectDesc;

        @com.aliyun.core.annotation.NameInMap("TargetClusterName")
        private String targetClusterName;

        @com.aliyun.core.annotation.NameInMap("TargetClusterUrl")
        private String targetClusterUrl;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.clusterType = builder.clusterType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.originInstanceAddress = builder.originInstanceAddress;
            this.originInstanceName = builder.originInstanceName;
            this.originInstanceNamespace = builder.originInstanceNamespace;
            this.projectDesc = builder.projectDesc;
            this.targetClusterName = builder.targetClusterName;
            this.targetClusterUrl = builder.targetClusterUrl;
            this.targetInstanceId = builder.targetInstanceId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return originInstanceAddress
         */
        public String getOriginInstanceAddress() {
            return this.originInstanceAddress;
        }

        /**
         * @return originInstanceName
         */
        public String getOriginInstanceName() {
            return this.originInstanceName;
        }

        /**
         * @return originInstanceNamespace
         */
        public String getOriginInstanceNamespace() {
            return this.originInstanceNamespace;
        }

        /**
         * @return projectDesc
         */
        public String getProjectDesc() {
            return this.projectDesc;
        }

        /**
         * @return targetClusterName
         */
        public String getTargetClusterName() {
            return this.targetClusterName;
        }

        /**
         * @return targetClusterUrl
         */
        public String getTargetClusterUrl() {
            return this.targetClusterUrl;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clusterType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String originInstanceAddress; 
            private String originInstanceName; 
            private String originInstanceNamespace; 
            private String projectDesc; 
            private String targetClusterName; 
            private String targetClusterUrl; 
            private String targetInstanceId; 
            private String userId; 

            /**
             * The type of the instance.
             * <p>
             * 
             * *   Nacos-Ans
             * *   ZooKeeper
             * *   Eureka
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The address of the source instance node.
             */
            public Builder originInstanceAddress(String originInstanceAddress) {
                this.originInstanceAddress = originInstanceAddress;
                return this;
            }

            /**
             * The name of the source instance.
             */
            public Builder originInstanceName(String originInstanceName) {
                this.originInstanceName = originInstanceName;
                return this;
            }

            /**
             * The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.
             */
            public Builder originInstanceNamespace(String originInstanceNamespace) {
                this.originInstanceNamespace = originInstanceNamespace;
                return this;
            }

            /**
             * The description.
             */
            public Builder projectDesc(String projectDesc) {
                this.projectDesc = projectDesc;
                return this;
            }

            /**
             * The name of the destination instance.
             */
            public Builder targetClusterName(String targetClusterName) {
                this.targetClusterName = targetClusterName;
                return this;
            }

            /**
             * The URL of the destination instance.
             */
            public Builder targetClusterUrl(String targetClusterUrl) {
                this.targetClusterUrl = targetClusterUrl;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
