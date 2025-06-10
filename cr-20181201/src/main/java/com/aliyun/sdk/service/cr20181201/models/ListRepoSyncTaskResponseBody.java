// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoSyncTaskResponseBody</p>
 */
public class ListRepoSyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncTasks")
    private java.util.List<SyncTasks> syncTasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRepoSyncTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.syncTasks = builder.syncTasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoSyncTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return syncTasks
     */
    public java.util.List<SyncTasks> getSyncTasks() {
        return this.syncTasks;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SyncTasks> syncTasks; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRepoSyncTaskResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.syncTasks = model.syncTasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7640819A-FB5B-4E25-A227-97717F62****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried synchronization tasks.</p>
         */
        public Builder syncTasks(java.util.List<SyncTasks> syncTasks) {
            this.syncTasks = syncTasks;
            return this;
        }

        /**
         * <p>The total number of the queried synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoSyncTaskResponseBody build() {
            return new ListRepoSyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoSyncTaskResponseBody</p>
     */
    public static class ImageFrom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        private ImageFrom(Builder builder) {
            this.imageTag = builder.imageTag;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFrom create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public static final class Builder {
            private String imageTag; 
            private String instanceId; 
            private String regionId; 
            private String repoName; 
            private String repoNamespaceName; 

            private Builder() {
            } 

            private Builder(ImageFrom model) {
                this.imageTag = model.imageTag;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
            } 

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-kmsiwlxxdcva****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            public ImageFrom build() {
                return new ImageFrom(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoSyncTaskResponseBody</p>
     */
    public static class ImageTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        private ImageTo(Builder builder) {
            this.imageTag = builder.imageTag;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTo create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public static final class Builder {
            private String imageTag; 
            private String instanceId; 
            private String regionId; 
            private String repoName; 
            private String repoNamespaceName; 

            private Builder() {
            } 

            private Builder(ImageTo model) {
                this.imageTag = model.imageTag;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
            } 

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-k77rd2eo9zttneqo</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            public ImageTo build() {
                return new ImageTo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoSyncTaskResponseBody</p>
     */
    public static class SyncTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossUser")
        private Boolean crossUser;

        @com.aliyun.core.annotation.NameInMap("CustomLink")
        private Boolean customLink;

        @com.aliyun.core.annotation.NameInMap("ImageFrom")
        private ImageFrom imageFrom;

        @com.aliyun.core.annotation.NameInMap("ImageTo")
        private ImageTo imageTo;

        @com.aliyun.core.annotation.NameInMap("ModifedTime")
        private Long modifedTime;

        @com.aliyun.core.annotation.NameInMap("SyncBatchTaskId")
        private String syncBatchTaskId;

        @com.aliyun.core.annotation.NameInMap("SyncRuleId")
        private String syncRuleId;

        @com.aliyun.core.annotation.NameInMap("SyncTaskId")
        private String syncTaskId;

        @com.aliyun.core.annotation.NameInMap("SyncTransAccelerate")
        private Boolean syncTransAccelerate;

        @com.aliyun.core.annotation.NameInMap("TaskIssue")
        private String taskIssue;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskTrigger")
        private String taskTrigger;

        private SyncTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.crossUser = builder.crossUser;
            this.customLink = builder.customLink;
            this.imageFrom = builder.imageFrom;
            this.imageTo = builder.imageTo;
            this.modifedTime = builder.modifedTime;
            this.syncBatchTaskId = builder.syncBatchTaskId;
            this.syncRuleId = builder.syncRuleId;
            this.syncTaskId = builder.syncTaskId;
            this.syncTransAccelerate = builder.syncTransAccelerate;
            this.taskIssue = builder.taskIssue;
            this.taskStatus = builder.taskStatus;
            this.taskTrigger = builder.taskTrigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncTasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crossUser
         */
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        /**
         * @return customLink
         */
        public Boolean getCustomLink() {
            return this.customLink;
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

        /**
         * @return modifedTime
         */
        public Long getModifedTime() {
            return this.modifedTime;
        }

        /**
         * @return syncBatchTaskId
         */
        public String getSyncBatchTaskId() {
            return this.syncBatchTaskId;
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
         * @return syncTransAccelerate
         */
        public Boolean getSyncTransAccelerate() {
            return this.syncTransAccelerate;
        }

        /**
         * @return taskIssue
         */
        public String getTaskIssue() {
            return this.taskIssue;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskTrigger
         */
        public String getTaskTrigger() {
            return this.taskTrigger;
        }

        public static final class Builder {
            private Long createTime; 
            private Boolean crossUser; 
            private Boolean customLink; 
            private ImageFrom imageFrom; 
            private ImageTo imageTo; 
            private Long modifedTime; 
            private String syncBatchTaskId; 
            private String syncRuleId; 
            private String syncTaskId; 
            private Boolean syncTransAccelerate; 
            private String taskIssue; 
            private String taskStatus; 
            private String taskTrigger; 

            private Builder() {
            } 

            private Builder(SyncTasks model) {
                this.createTime = model.createTime;
                this.crossUser = model.crossUser;
                this.customLink = model.customLink;
                this.imageFrom = model.imageFrom;
                this.imageTo = model.imageTo;
                this.modifedTime = model.modifedTime;
                this.syncBatchTaskId = model.syncBatchTaskId;
                this.syncRuleId = model.syncRuleId;
                this.syncTaskId = model.syncTaskId;
                this.syncTransAccelerate = model.syncTransAccelerate;
                this.taskIssue = model.taskIssue;
                this.taskStatus = model.taskStatus;
                this.taskTrigger = model.taskTrigger;
            } 

            /**
             * <p>The time when the synchronization task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1572839126000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the synchronization task is performed across Alibaba Cloud accounts. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The image synchronization task is performed across accounts.</li>
             * <li><code>false</code>: The image synchronization task is performed within the same account.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * <p>Indicates whether a custom synchronization link is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder customLink(Boolean customLink) {
                this.customLink = customLink;
                return this;
            }

            /**
             * <p>The information about the source image.</p>
             */
            public Builder imageFrom(ImageFrom imageFrom) {
                this.imageFrom = imageFrom;
                return this;
            }

            /**
             * <p>The information about the destination image.</p>
             */
            public Builder imageTo(ImageTo imageTo) {
                this.imageTo = imageTo;
                return this;
            }

            /**
             * <p>The time when the synchronization task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1572839133000</p>
             */
            public Builder modifedTime(Long modifedTime) {
                this.modifedTime = modifedTime;
                return this;
            }

            /**
             * <p>The ID of the image synchronization batch tasks, which is the same as the value of SyncRecordId in the request.</p>
             * <blockquote>
             * <p> If an image meets multiple synchronization rules and multiple synchronization tasks are generated for the image, these synchronization tasks use the same SyncBatchTaskId.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>15DEEB56-9271-4FDD-AC4D-C3A5CC2C****</p>
             */
            public Builder syncBatchTaskId(String syncBatchTaskId) {
                this.syncBatchTaskId = syncBatchTaskId;
                return this;
            }

            /**
             * <p>The ID of the synchronization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>crsr-7lph66uloi6h****</p>
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>rst-4kfd7fk6pohk****</p>
             */
            public Builder syncTaskId(String syncTaskId) {
                this.syncTaskId = syncTaskId;
                return this;
            }

            /**
             * <p>Indicates whether the synchronization transfer acceleration feature is enabled for the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder syncTransAccelerate(Boolean syncTransAccelerate) {
                this.syncTransAccelerate = syncTransAccelerate;
                return this;
            }

            /**
             * <p>The error message that is returned if the synchronization task fails.</p>
             * <blockquote>
             * <p> The system uses this parameter to return an error message if the synchronization task fails.</p>
             * </blockquote>
             * <p>Valid value:</p>
             * <ul>
             * <li>OSS_POLICY_UNAUTHORIZED: Container Registry is not granted permissions to access Object Storage Service (OSS).</li>
             * <li>TAG_CONFLICT: The destination repository contains an image that has the same tag as the source image, and image tag immutability is enabled for the destination repository.</li>
             * <li>UNSUPPORTED_FORMAT: The manifest or config format of the image to be synchronized is not supported.</li>
             * <li>INTERNAL_ERROR: The synchronization task failed due to internal issues on the server.</li>
             * <li>NETWORK_ERROR: The synchronization task failed due to unstable network connection.</li>
             * <li>DATA_LENGTH_EXCEEDED: The manifest or config of the image is oversized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_ERROR</p>
             */
            public Builder taskIssue(String taskIssue) {
                this.taskIssue = taskIssue;
                return this;
            }

            /**
             * <p>The status of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The policy that is configured to trigger the synchronization task. Valid values:</p>
             * <ul>
             * <li><code>PASSIVE</code>: automatically triggers the synchronization task.</li>
             * <li><code>INITIATIVE</code>: manually triggers the synchronization task.</li>
             * </ul>
             * <p>Default value: <code>PASSIVE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSIVE</p>
             */
            public Builder taskTrigger(String taskTrigger) {
                this.taskTrigger = taskTrigger;
                return this;
            }

            public SyncTasks build() {
                return new SyncTasks(this);
            } 

        } 

    }
}
