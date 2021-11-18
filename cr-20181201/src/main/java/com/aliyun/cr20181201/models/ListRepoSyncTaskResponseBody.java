// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoSyncTaskResponseBody</p>
 */
public class ListRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("SyncTasks")
    private java.util.List < SyncTasks> syncTasks;


    private ListRepoSyncTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.syncTasks = builder.syncTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoSyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return syncTasks
     */
    public java.util.List < SyncTasks> getSyncTasks() {
        return this.syncTasks;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < SyncTasks> syncTasks; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Synchronization task list</p>
         */
        public Builder syncTasks(java.util.List < SyncTasks> syncTasks) {
            this.syncTasks = syncTasks;
            return this;
        }

        public ListRepoSyncTaskResponseBody build() {
            return new ListRepoSyncTaskResponseBody(this);
        } 

    } 

    public static class ImageFrom extends TeaModel {
        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RegionId")
        private String regionId;


        private ImageFrom(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.imageTag = builder.imageTag;
            this.instanceId = builder.instanceId;
            this.repoName = builder.repoName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFrom create() {
            return builder().build();
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String repoNamespaceName; 
            private String imageTag; 
            private String instanceId; 
            private String repoName; 
            private String regionId; 

            /**
             * <p>Repository namespace</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Repository name</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ImageFrom build() {
                return new ImageFrom(this);
            } 

        } 

    }
    public static class ImageTo extends TeaModel {
        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RegionId")
        private String regionId;


        private ImageTo(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.imageTag = builder.imageTag;
            this.instanceId = builder.instanceId;
            this.repoName = builder.repoName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTo create() {
            return builder().build();
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String repoNamespaceName; 
            private String imageTag; 
            private String instanceId; 
            private String repoName; 
            private String regionId; 

            /**
             * <p>Repository namespace</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Repository name</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ImageTo build() {
                return new ImageTo(this);
            } 

        } 

    }
    public static class SyncTasks extends TeaModel {
        @NameInMap("ModifedTime")
        private Long modifedTime;

        @NameInMap("SyncRuleId")
        private String syncRuleId;

        @NameInMap("SyncTaskId")
        private String syncTaskId;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("SyncBatchTaskId")
        private String syncBatchTaskId;

        @NameInMap("CrossUser")
        private Boolean crossUser;

        @NameInMap("TaskTrigger")
        private String taskTrigger;

        @NameInMap("ImageFrom")
        private ImageFrom imageFrom;

        @NameInMap("ImageTo")
        private ImageTo imageTo;


        private SyncTasks(Builder builder) {
            this.modifedTime = builder.modifedTime;
            this.syncRuleId = builder.syncRuleId;
            this.syncTaskId = builder.syncTaskId;
            this.taskStatus = builder.taskStatus;
            this.createTime = builder.createTime;
            this.syncBatchTaskId = builder.syncBatchTaskId;
            this.crossUser = builder.crossUser;
            this.taskTrigger = builder.taskTrigger;
            this.imageFrom = builder.imageFrom;
            this.imageTo = builder.imageTo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncTasks create() {
            return builder().build();
        }

        /**
         * @return modifedTime
         */
        public Long getModifedTime() {
            return this.modifedTime;
        }

        /**
         * @return syncRuleId
         */
        public String getSyncRuleId() {
            return this.syncRuleId;
        }

        /**
         * @return syncTaskId
         */
        public String getSyncTaskId() {
            return this.syncTaskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return syncBatchTaskId
         */
        public String getSyncBatchTaskId() {
            return this.syncBatchTaskId;
        }

        /**
         * @return crossUser
         */
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        /**
         * @return taskTrigger
         */
        public String getTaskTrigger() {
            return this.taskTrigger;
        }

        /**
         * @return imageFrom
         */
        public ImageFrom getImageFrom() {
            return this.imageFrom;
        }

        /**
         * @return imageTo
         */
        public ImageTo getImageTo() {
            return this.imageTo;
        }

        public static final class Builder {
            private Long modifedTime; 
            private String syncRuleId; 
            private String syncTaskId; 
            private String taskStatus; 
            private Long createTime; 
            private String syncBatchTaskId; 
            private Boolean crossUser; 
            private String taskTrigger; 
            private ImageFrom imageFrom; 
            private ImageTo imageTo; 

            /**
             * <p>Modification time</p>
             */
            public Builder modifedTime(Long modifedTime) {
                this.modifedTime = modifedTime;
                return this;
            }

            /**
             * <p>Synchronous rule ID</p>
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * <p>Synchronous task ID</p>
             */
            public Builder syncTaskId(String syncTaskId) {
                this.syncTaskId = syncTaskId;
                return this;
            }

            /**
             * <p>Task Status</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Created</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the batch synchronization task.</p>
             */
            public Builder syncBatchTaskId(String syncBatchTaskId) {
                this.syncBatchTaskId = syncBatchTaskId;
                return this;
            }

            /**
             * <p>Specifies whether to synchronize images across accounts. Valid values:

-"true": synchronizes images across accounts

-"false": synchronizes images with the same account

Default value: "false"</p>
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * <p>Trigger policy</p>
             */
            public Builder taskTrigger(String taskTrigger) {
                this.taskTrigger = taskTrigger;
                return this;
            }

            /**
             * <p>SOURCE image</p>
             */
            public Builder imageFrom(ImageFrom imageFrom) {
                this.imageFrom = imageFrom;
                return this;
            }

            /**
             * <p>Target image</p>
             */
            public Builder imageTo(ImageTo imageTo) {
                this.imageTo = imageTo;
                return this;
            }

            public SyncTasks build() {
                return new SyncTasks(this);
            } 

        } 

    }
}
