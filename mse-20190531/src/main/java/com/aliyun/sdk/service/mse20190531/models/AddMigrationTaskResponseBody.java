// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>AddMigrationTaskResponseBody</p>
 */
public class AddMigrationTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AddMigrationTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMigrationTaskResponseBody create() {
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

        public AddMigrationTaskResponseBody build() {
            return new AddMigrationTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Id")
        private String id;

        @NameInMap("OriginInstanceAddress")
        private String originInstanceAddress;

        @NameInMap("OriginInstanceName")
        private String originInstanceName;

        @NameInMap("OriginInstanceNamespace")
        private String originInstanceNamespace;

        @NameInMap("ProjectDesc")
        private String projectDesc;

        @NameInMap("TargetClusterName")
        private String targetClusterName;

        @NameInMap("TargetClusterUrl")
        private String targetClusterUrl;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.clusterType = builder.clusterType;
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
             * The ID of the task.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The source instance node address.
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
             * The list of namespaces. This parameter is optional if the source instance is a Nacos instance.
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
