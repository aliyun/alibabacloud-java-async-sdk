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
 * {@link ListMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationTaskResponseBody</p>
 */
public class ListMigrationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMigrationTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The array structure.</p>
         */
        public Builder data(java.util.List<Data> data) {
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>451EBE59-5F33-5B15-83C1-78593B9*****</p>
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

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMigrationTaskResponseBody build() {
            return new ListMigrationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

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
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
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
        public Long getId() {
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
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
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
             * <p>The type of the instance.</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-30T06:41:52.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The address of the source instance node.</p>
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
             * <p>test</p>
             */
            public Builder originInstanceName(String originInstanceName) {
                this.originInstanceName = originInstanceName;
                return this;
            }

            /**
             * <p>The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.</p>
             * 
             * <strong>example:</strong>
             * <p>fsdfsdfdsf</p>
             */
            public Builder originInstanceNamespace(String originInstanceNamespace) {
                this.originInstanceNamespace = originInstanceNamespace;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * <p>multiple-nacos</p>
             */
            public Builder targetClusterName(String targetClusterName) {
                this.targetClusterName = targetClusterName;
                return this;
            }

            /**
             * <p>The URL of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-f1******-nacos-ans.mse.aliyuncs.com:8848</p>
             */
            public Builder targetClusterUrl(String targetClusterUrl) {
                this.targetClusterUrl = targetClusterUrl;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-zv*****</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
