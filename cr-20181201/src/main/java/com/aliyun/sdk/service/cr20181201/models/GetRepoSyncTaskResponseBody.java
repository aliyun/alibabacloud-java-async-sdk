// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSyncTaskResponseBody</p>
 */
public class GetRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CrossUser")
    private Boolean crossUser;

    @NameInMap("ImageFrom")
    private ImageFrom imageFrom;

    @NameInMap("ImageTo")
    private ImageTo imageTo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("LayerTasks")
    private java.util.List < LayerTasks> layerTasks;

    @NameInMap("Progress")
    private Long progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncBatchTaskId")
    private String syncBatchTaskId;

    @NameInMap("SyncRuleId")
    private String syncRuleId;

    @NameInMap("SyncTaskId")
    private String syncTaskId;

    @NameInMap("SyncTransAccelerate")
    private Boolean syncTransAccelerate;

    @NameInMap("SyncedSize")
    private Long syncedSize;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("TaskTrigger")
    private String taskTrigger;

    private GetRepoSyncTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.crossUser = builder.crossUser;
        this.imageFrom = builder.imageFrom;
        this.imageTo = builder.imageTo;
        this.isSuccess = builder.isSuccess;
        this.layerTasks = builder.layerTasks;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.syncBatchTaskId = builder.syncBatchTaskId;
        this.syncRuleId = builder.syncRuleId;
        this.syncTaskId = builder.syncTaskId;
        this.syncTransAccelerate = builder.syncTransAccelerate;
        this.syncedSize = builder.syncedSize;
        this.taskStatus = builder.taskStatus;
        this.taskTrigger = builder.taskTrigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return crossUser
     */
    public Boolean getCrossUser() {
        return this.crossUser;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return layerTasks
     */
    public java.util.List < LayerTasks> getLayerTasks() {
        return this.layerTasks;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return syncedSize
     */
    public Long getSyncedSize() {
        return this.syncedSize;
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
        private String code; 
        private Boolean crossUser; 
        private ImageFrom imageFrom; 
        private ImageTo imageTo; 
        private Boolean isSuccess; 
        private java.util.List < LayerTasks> layerTasks; 
        private Long progress; 
        private String requestId; 
        private String syncBatchTaskId; 
        private String syncRuleId; 
        private String syncTaskId; 
        private Boolean syncTransAccelerate; 
        private Long syncedSize; 
        private String taskStatus; 
        private String taskTrigger; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the synchronization task is performed across Alibaba Cloud accounts.
         */
        public Builder crossUser(Boolean crossUser) {
            this.crossUser = crossUser;
            return this;
        }

        /**
         * The source address of the image.
         */
        public Builder imageFrom(ImageFrom imageFrom) {
            this.imageFrom = imageFrom;
            return this;
        }

        /**
         * The destination address of the image.
         */
        public Builder imageTo(ImageTo imageTo) {
            this.imageTo = imageTo;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The synchronization tasks for the image layer.
         */
        public Builder layerTasks(java.util.List < LayerTasks> layerTasks) {
            this.layerTasks = layerTasks;
            return this;
        }

        /**
         * The synchronization progress. Valid values:
         * <p>
         * 
         * *   `0`: The synchronization starts or failed.
         * *   `1`: The synchronization is successful.
         */
        public Builder progress(Long progress) {
            this.progress = progress;
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
         * The ID of the synchronization task in which multiple images are synchronized at a time.
         */
        public Builder syncBatchTaskId(String syncBatchTaskId) {
            this.syncBatchTaskId = syncBatchTaskId;
            return this;
        }

        /**
         * The ID of the synchronization rule.
         */
        public Builder syncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }

        /**
         * The ID of the synchronization task.
         */
        public Builder syncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }

        /**
         * Indicates whether transfer acceleration is enabled in the synchronization process.
         */
        public Builder syncTransAccelerate(Boolean syncTransAccelerate) {
            this.syncTransAccelerate = syncTransAccelerate;
            return this;
        }

        /**
         * The size of the image layer that is synchronized. Unit: bytes.
         */
        public Builder syncedSize(Long syncedSize) {
            this.syncedSize = syncedSize;
            return this;
        }

        /**
         * The status of the task. Valid values:
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * The policy that is used to trigger the synchronization task.
         */
        public Builder taskTrigger(String taskTrigger) {
            this.taskTrigger = taskTrigger;
            return this;
        }

        public GetRepoSyncTaskResponseBody build() {
            return new GetRepoSyncTaskResponseBody(this);
        } 

    } 

    public static class ImageFrom extends TeaModel {
        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
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

            /**
             * The tag of the image.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace.
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
    public static class ImageTo extends TeaModel {
        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
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

            /**
             * The tag of the image.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace.
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
    public static class LayerTasks extends TeaModel {
        @NameInMap("ArtifactDigest")
        private String artifactDigest;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("Size")
        private Long size;

        @NameInMap("SyncLayerTaskId")
        private String syncLayerTaskId;

        @NameInMap("SyncedSize")
        private Long syncedSize;

        @NameInMap("TaskStatus")
        private String taskStatus;

        private LayerTasks(Builder builder) {
            this.artifactDigest = builder.artifactDigest;
            this.digest = builder.digest;
            this.size = builder.size;
            this.syncLayerTaskId = builder.syncLayerTaskId;
            this.syncedSize = builder.syncedSize;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayerTasks create() {
            return builder().build();
        }

        /**
         * @return artifactDigest
         */
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return syncLayerTaskId
         */
        public String getSyncLayerTaskId() {
            return this.syncLayerTaskId;
        }

        /**
         * @return syncedSize
         */
        public Long getSyncedSize() {
            return this.syncedSize;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String artifactDigest; 
            private String digest; 
            private Long size; 
            private String syncLayerTaskId; 
            private Long syncedSize; 
            private String taskStatus; 

            /**
             * The digest of the artifact.
             */
            public Builder artifactDigest(String artifactDigest) {
                this.artifactDigest = artifactDigest;
                return this;
            }

            /**
             * The digest of the image layer.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * The size of synchronized image layers.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the synchronization task for the image layer.
             */
            public Builder syncLayerTaskId(String syncLayerTaskId) {
                this.syncLayerTaskId = syncLayerTaskId;
                return this;
            }

            /**
             * The size of the image layer that is synchronized.
             */
            public Builder syncedSize(Long syncedSize) {
                this.syncedSize = syncedSize;
                return this;
            }

            /**
             * The status of the synchronization task. Valid values:
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public LayerTasks build() {
                return new LayerTasks(this);
            } 

        } 

    }
}
