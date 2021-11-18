// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSyncTaskResponseBody</p>
 */
public class GetRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("SyncRuleId")
    private String syncRuleId;

    @NameInMap("Progress")
    private Long progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncedSize")
    private Long syncedSize;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("SyncTaskId")
    private String syncTaskId;

    @NameInMap("SyncBatchTaskId")
    private String syncBatchTaskId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("TaskTrigger")
    private String taskTrigger;

    @NameInMap("ImageFrom")
    private ImageFrom imageFrom;

    @NameInMap("ImageTo")
    private ImageTo imageTo;

    @NameInMap("LayerTasks")
    private java.util.List < LayerTasks> layerTasks;


    private GetRepoSyncTaskResponseBody(Builder builder) {
        this.syncRuleId = builder.syncRuleId;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.syncedSize = builder.syncedSize;
        this.taskStatus = builder.taskStatus;
        this.syncTaskId = builder.syncTaskId;
        this.syncBatchTaskId = builder.syncBatchTaskId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.taskTrigger = builder.taskTrigger;
        this.imageFrom = builder.imageFrom;
        this.imageTo = builder.imageTo;
        this.layerTasks = builder.layerTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
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
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    /**
     * @return syncBatchTaskId
     */
    public String getSyncBatchTaskId() {
        return this.syncBatchTaskId;
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

    /**
     * @return layerTasks
     */
    public java.util.List < LayerTasks> getLayerTasks() {
        return this.layerTasks;
    }

    public static final class Builder {
        private String syncRuleId; 
        private Long progress; 
        private String requestId; 
        private Long syncedSize; 
        private String taskStatus; 
        private String syncTaskId; 
        private String syncBatchTaskId; 
        private String code; 
        private Boolean isSuccess; 
        private String taskTrigger; 
        private ImageFrom imageFrom; 
        private ImageTo imageTo; 
        private java.util.List < LayerTasks> layerTasks; 

        /**
         * <p>Synchronous rule ID</p>
         */
        public Builder syncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }

        /**
         * <p>The synchronization progress. Valid values:

-"0": indicates that the synchronization has just started or failed.

-"**: indicates that the synchronization is successful.</p>
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Synchronized size</p>
         */
        public Builder syncedSize(Long syncedSize) {
            this.syncedSize = syncedSize;
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
         * <p>Synchronous task ID</p>
         */
        public Builder syncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }

        /**
         * <p>The ID of the synchronization batch task.</p>
         */
        public Builder syncBatchTaskId(String syncBatchTaskId) {
            this.syncBatchTaskId = syncBatchTaskId;
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
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Synchronization task trigger type</p>
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

        /**
         * <p>The list of synchronization tasks at the image layer.</p>
         */
        public Builder layerTasks(java.util.List < LayerTasks> layerTasks) {
            this.layerTasks = layerTasks;
            return this;
        }

        public GetRepoSyncTaskResponseBody build() {
            return new GetRepoSyncTaskResponseBody(this);
        } 

    } 

    public static class ImageFrom extends TeaModel {
        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RegionId")
        private String regionId;


        private ImageFrom(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.instanceId = builder.instanceId;
            this.imageTag = builder.imageTag;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
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
            private String instanceId; 
            private String imageTag; 
            private String repoName; 
            private String regionId; 

            /**
             * <p>Namespace name</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
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
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
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
             * <p>Geographical</p>
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

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RegionId")
        private String regionId;


        private ImageTo(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.instanceId = builder.instanceId;
            this.imageTag = builder.imageTag;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
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
            private String instanceId; 
            private String imageTag; 
            private String repoName; 
            private String regionId; 

            /**
             * <p>Namespace name</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
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
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
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
             * <p>Geographical</p>
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
    public static class LayerTasks extends TeaModel {
        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("SyncedSize")
        private Long syncedSize;

        @NameInMap("Size")
        private Long size;

        @NameInMap("SyncLayerTaskId")
        private String syncLayerTaskId;

        @NameInMap("ArtifactDigest")
        private String artifactDigest;


        private LayerTasks(Builder builder) {
            this.taskStatus = builder.taskStatus;
            this.digest = builder.digest;
            this.syncedSize = builder.syncedSize;
            this.size = builder.size;
            this.syncLayerTaskId = builder.syncLayerTaskId;
            this.artifactDigest = builder.artifactDigest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayerTasks create() {
            return builder().build();
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return syncedSize
         */
        public Long getSyncedSize() {
            return this.syncedSize;
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
         * @return artifactDigest
         */
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        public static final class Builder {
            private String taskStatus; 
            private String digest; 
            private Long syncedSize; 
            private Long size; 
            private String syncLayerTaskId; 
            private String artifactDigest; 

            /**
             * <p>Task Status</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Image digest value</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>Synchronized size</p>
             */
            public Builder syncedSize(Long syncedSize) {
                this.syncedSize = syncedSize;
                return this;
            }

            /**
             * <p>Size</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Synchronization task ID</p>
             */
            public Builder syncLayerTaskId(String syncLayerTaskId) {
                this.syncLayerTaskId = syncLayerTaskId;
                return this;
            }

            /**
             * <p>The digest value of the product.</p>
             */
            public Builder artifactDigest(String artifactDigest) {
                this.artifactDigest = artifactDigest;
                return this;
            }

            public LayerTasks build() {
                return new LayerTasks(this);
            } 

        } 

    }
}
