// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListRestoreTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRestoreTasksResponseBody</p>
 */
public class ListRestoreTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreTasks")
    private java.util.List<RestoreTasks> restoreTasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRestoreTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.restoreTasks = builder.restoreTasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRestoreTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreTasks
     */
    public java.util.List<RestoreTasks> getRestoreTasks() {
        return this.restoreTasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RestoreTasks> restoreTasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRestoreTasksResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.restoreTasks = model.restoreTasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>464C8CB6-A548-5206-B83C-D32A8E43EC21</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of restore tasks.</p>
         */
        public Builder restoreTasks(java.util.List<RestoreTasks> restoreTasks) {
            this.restoreTasks = restoreTasks;
            return this;
        }

        /**
         * <p>Total data count under the current request conditions (optional; not returned by default).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRestoreTasksResponseBody build() {
            return new ListRestoreTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRestoreTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListRestoreTasksResponseBody</p>
     */
    public static class RestoreTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RestoreTaskId")
        private String restoreTaskId;

        @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDetail")
        private String statusDetail;

        private RestoreTasks(Builder builder) {
            this.backupId = builder.backupId;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.modifiedTime = builder.modifiedTime;
            this.restoreTaskId = builder.restoreTaskId;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreTasks create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return restoreTaskId
         */
        public String getRestoreTaskId() {
            return this.restoreTaskId;
        }

        /**
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public static final class Builder {
            private String backupId; 
            private String createTime; 
            private String endTime; 
            private String modifiedTime; 
            private String restoreTaskId; 
            private String serviceInstanceId; 
            private String startTime; 
            private String status; 
            private String statusDetail; 

            private Builder() {
            } 

            private Builder(RestoreTasks model) {
                this.backupId = model.backupId;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.modifiedTime = model.modifiedTime;
                this.restoreTaskId = model.restoreTaskId;
                this.serviceInstanceId = model.serviceInstanceId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
            } 

            /**
             * <p>The backup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>backup-728f128bf92c4e3da970</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-07T11:37:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-27T18:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-07T12:16:16Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the restore task.</p>
             * 
             * <strong>example:</strong>
             * <p>restore-xxxxxx</p>
             */
            public Builder restoreTaskId(String restoreTaskId) {
                this.restoreTaskId = restoreTaskId;
                return this;
            }

            /**
             * <p>The ID of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>si-8c367c27c84e44a79d36</p>
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
                return this;
            }

            /**
             * <p>The time when the update started.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-27T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the service instance. Valid values:</p>
             * <ul>
             * <li>Restoring</li>
             * <li>Restored</li>
             * <li>RestoreFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Restoring</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the service instance deployment information.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxx  failed, error message: error</p>
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            public RestoreTasks build() {
                return new RestoreTasks(this);
            } 

        } 

    }
}
