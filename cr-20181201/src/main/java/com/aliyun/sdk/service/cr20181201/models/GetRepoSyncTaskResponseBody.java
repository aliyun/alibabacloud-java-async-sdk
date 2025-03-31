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
 * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSyncTaskResponseBody</p>
 */
public class GetRepoSyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CrossUser")
    private Boolean crossUser;

    @com.aliyun.core.annotation.NameInMap("ImageFrom")
    private ImageFrom imageFrom;

    @com.aliyun.core.annotation.NameInMap("ImageTo")
    private ImageTo imageTo;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("LayerTasks")
    private java.util.List<LayerTasks> layerTasks;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncBatchTaskId")
    private String syncBatchTaskId;

    @com.aliyun.core.annotation.NameInMap("SyncRuleId")
    private String syncRuleId;

    @com.aliyun.core.annotation.NameInMap("SyncTaskId")
    private String syncTaskId;

    @com.aliyun.core.annotation.NameInMap("SyncTransAccelerate")
    private Boolean syncTransAccelerate;

    @com.aliyun.core.annotation.NameInMap("SyncedSize")
    private Long syncedSize;

    @com.aliyun.core.annotation.NameInMap("TaskIssue")
    private String taskIssue;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskTrigger")
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
        this.taskIssue = builder.taskIssue;
        this.taskStatus = builder.taskStatus;
        this.taskTrigger = builder.taskTrigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSyncTaskResponseBody create() {
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
    public java.util.List<LayerTasks> getLayerTasks() {
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
        private String code; 
        private Boolean crossUser; 
        private ImageFrom imageFrom; 
        private ImageTo imageTo; 
        private Boolean isSuccess; 
        private java.util.List<LayerTasks> layerTasks; 
        private Long progress; 
        private String requestId; 
        private String syncBatchTaskId; 
        private String syncRuleId; 
        private String syncTaskId; 
        private Boolean syncTransAccelerate; 
        private Long syncedSize; 
        private String taskIssue; 
        private String taskStatus; 
        private String taskTrigger; 

        private Builder() {
        } 

        private Builder(GetRepoSyncTaskResponseBody model) {
            this.code = model.code;
            this.crossUser = model.crossUser;
            this.imageFrom = model.imageFrom;
            this.imageTo = model.imageTo;
            this.isSuccess = model.isSuccess;
            this.layerTasks = model.layerTasks;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.syncBatchTaskId = model.syncBatchTaskId;
            this.syncRuleId = model.syncRuleId;
            this.syncTaskId = model.syncTaskId;
            this.syncTransAccelerate = model.syncTransAccelerate;
            this.syncedSize = model.syncedSize;
            this.taskIssue = model.taskIssue;
            this.taskStatus = model.taskStatus;
            this.taskTrigger = model.taskTrigger;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the synchronization task is performed across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder crossUser(Boolean crossUser) {
            this.crossUser = crossUser;
            return this;
        }

        /**
         * <p>The source address of the image.</p>
         */
        public Builder imageFrom(ImageFrom imageFrom) {
            this.imageFrom = imageFrom;
            return this;
        }

        /**
         * <p>The destination address of the image.</p>
         */
        public Builder imageTo(ImageTo imageTo) {
            this.imageTo = imageTo;
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
         * <p>The synchronization tasks for the image layer.</p>
         */
        public Builder layerTasks(java.util.List<LayerTasks> layerTasks) {
            this.layerTasks = layerTasks;
            return this;
        }

        /**
         * <p>The synchronization progress. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The synchronization starts or failed.</li>
         * <li><code>1</code>: The synchronization is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A6DEF8B0-5D45-46D6-867D-8C7FF0966B07</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task in which multiple images are synchronized at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>a9434731-95ef-4087-9cf4-369c8e90****</p>
         */
        public Builder syncBatchTaskId(String syncBatchTaskId) {
            this.syncBatchTaskId = syncBatchTaskId;
            return this;
        }

        /**
         * <p>The ID of the synchronization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crsr-cllro6ho3wne****</p>
         */
        public Builder syncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>rst-zxjkiv5oil6f****</p>
         */
        public Builder syncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }

        /**
         * <p>Indicates whether transfer acceleration is enabled in the synchronization process.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder syncTransAccelerate(Boolean syncTransAccelerate) {
            this.syncTransAccelerate = syncTransAccelerate;
            return this;
        }

        /**
         * <p>The size of the image layer that is synchronized. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>23655489</p>
         */
        public Builder syncedSize(Long syncedSize) {
            this.syncedSize = syncedSize;
            return this;
        }

        /**
         * TaskIssue.
         */
        public Builder taskIssue(String taskIssue) {
            this.taskIssue = taskIssue;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The policy that is used to trigger the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder taskTrigger(String taskTrigger) {
            this.taskTrigger = taskTrigger;
            return this;
        }

        public GetRepoSyncTaskResponseBody build() {
            return new GetRepoSyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetRepoSyncTaskResponseBody</p>
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
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-sgedpenzw80e****</p>
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
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
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
     * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetRepoSyncTaskResponseBody</p>
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
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-leqzomz5vijc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eu-west-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
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
     * {@link GetRepoSyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetRepoSyncTaskResponseBody</p>
     */
    public static class LayerTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactDigest")
        private String artifactDigest;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SyncLayerTaskId")
        private String syncLayerTaskId;

        @com.aliyun.core.annotation.NameInMap("SyncedSize")
        private Long syncedSize;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
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

            private Builder() {
            } 

            private Builder(LayerTasks model) {
                this.artifactDigest = model.artifactDigest;
                this.digest = model.digest;
                this.size = model.size;
                this.syncLayerTaskId = model.syncLayerTaskId;
                this.syncedSize = model.syncedSize;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The digest of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
             */
            public Builder artifactDigest(String artifactDigest) {
                this.artifactDigest = artifactDigest;
                return this;
            }

            /**
             * <p>The digest of the image layer.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The size of synchronized image layers.</p>
             * 
             * <strong>example:</strong>
             * <p>23655489</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the synchronization task for the image layer.</p>
             * 
             * <strong>example:</strong>
             * <p>rslt-074x4q20fx2d****</p>
             */
            public Builder syncLayerTaskId(String syncLayerTaskId) {
                this.syncLayerTaskId = syncLayerTaskId;
                return this;
            }

            /**
             * <p>The size of the image layer that is synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>23655489</p>
             */
            public Builder syncedSize(Long syncedSize) {
                this.syncedSize = syncedSize;
                return this;
            }

            /**
             * <p>The status of the synchronization task. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
