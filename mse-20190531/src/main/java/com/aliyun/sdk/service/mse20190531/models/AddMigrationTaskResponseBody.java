// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>AddMigrationTaskResponseBody</p>
 */
public class AddMigrationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is processed successfully.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7466566F-F30F-4A29-965D-3E0AF21D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddMigrationTaskResponseBody build() {
            return new AddMigrationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>AddMigrationTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

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

        @com.aliyun.core.annotation.NameInMap("SyncType")
        private String syncType;

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
            this.id = builder.id;
            this.originInstanceAddress = builder.originInstanceAddress;
            this.originInstanceName = builder.originInstanceName;
            this.originInstanceNamespace = builder.originInstanceNamespace;
            this.projectDesc = builder.projectDesc;
            this.syncType = builder.syncType;
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
         * @return syncType
         */
        public String getSyncType() {
            return this.syncType;
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
            private String syncType; 
            private String targetClusterName; 
            private String targetClusterUrl; 
            private String targetInstanceId; 
            private String userId; 

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li>Nacos-Ans</li>
             * <li>ZooKeeper</li>
             * <li>Eureka</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Nacos-Ans</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The endpoint of the source instance node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1:8848</p>
             */
            public Builder originInstanceAddress(String originInstanceAddress) {
                this.originInstanceAddress = originInstanceAddress;
                return this;
            }

            /**
             * <p>The name of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Source instance</p>
             */
            public Builder originInstanceName(String originInstanceName) {
                this.originInstanceName = originInstanceName;
                return this;
            }

            /**
             * <p>The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.</p>
             * 
             * <strong>example:</strong>
             * <p>namesapceId1,namesapceId2</p>
             */
            public Builder originInstanceNamespace(String originInstanceNamespace) {
                this.originInstanceNamespace = originInstanceNamespace;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>testsdfsdfsd</p>
             */
            public Builder projectDesc(String projectDesc) {
                this.projectDesc = projectDesc;
                return this;
            }

            /**
             * SyncType.
             */
            public Builder syncType(String syncType) {
                this.syncType = syncType;
                return this;
            }

            /**
             * <p>The name of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Destination instance</p>
             */
            public Builder targetClusterName(String targetClusterName) {
                this.targetClusterName = targetClusterName;
                return this;
            }

            /**
             * <p>The URL of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-94d****-nacos-ans.mse.aliyuncs.com:8848</p>
             */
            public Builder targetClusterUrl(String targetClusterUrl) {
                this.targetClusterUrl = targetClusterUrl;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-7pp2w*****</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>183876217*****</p>
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
