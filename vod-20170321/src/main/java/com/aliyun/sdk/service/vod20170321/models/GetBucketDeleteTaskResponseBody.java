// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetBucketDeleteTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketDeleteTaskResponseBody</p>
 */
public class GetBucketDeleteTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private GetBucketDeleteTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketDeleteTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInfo taskInfo; 

        private Builder() {
        } 

        private Builder(GetBucketDeleteTaskResponseBody model) {
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskInfo.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public GetBucketDeleteTaskResponseBody build() {
            return new GetBucketDeleteTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBucketDeleteTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBucketDeleteTaskResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedMediaRemain")
        private Long attachedMediaRemain;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeleteFiles")
        private Boolean deleteFiles;

        @com.aliyun.core.annotation.NameInMap("ImageRemain")
        private Long imageRemain;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("VideoRemain")
        private Long videoRemain;

        private TaskInfo(Builder builder) {
            this.attachedMediaRemain = builder.attachedMediaRemain;
            this.creationTime = builder.creationTime;
            this.deleteFiles = builder.deleteFiles;
            this.imageRemain = builder.imageRemain;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.storageSize = builder.storageSize;
            this.videoRemain = builder.videoRemain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return attachedMediaRemain
         */
        public Long getAttachedMediaRemain() {
            return this.attachedMediaRemain;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deleteFiles
         */
        public Boolean getDeleteFiles() {
            return this.deleteFiles;
        }

        /**
         * @return imageRemain
         */
        public Long getImageRemain() {
            return this.imageRemain;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return videoRemain
         */
        public Long getVideoRemain() {
            return this.videoRemain;
        }

        public static final class Builder {
            private Long attachedMediaRemain; 
            private String creationTime; 
            private Boolean deleteFiles; 
            private Long imageRemain; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private Long storageSize; 
            private Long videoRemain; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.attachedMediaRemain = model.attachedMediaRemain;
                this.creationTime = model.creationTime;
                this.deleteFiles = model.deleteFiles;
                this.imageRemain = model.imageRemain;
                this.modificationTime = model.modificationTime;
                this.status = model.status;
                this.storageLocation = model.storageLocation;
                this.storageSize = model.storageSize;
                this.videoRemain = model.videoRemain;
            } 

            /**
             * AttachedMediaRemain.
             */
            public Builder attachedMediaRemain(Long attachedMediaRemain) {
                this.attachedMediaRemain = attachedMediaRemain;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeleteFiles.
             */
            public Builder deleteFiles(Boolean deleteFiles) {
                this.deleteFiles = deleteFiles;
                return this;
            }

            /**
             * ImageRemain.
             */
            public Builder imageRemain(Long imageRemain) {
                this.imageRemain = imageRemain;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageLocation.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * VideoRemain.
             */
            public Builder videoRemain(Long videoRemain) {
                this.videoRemain = videoRemain;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
