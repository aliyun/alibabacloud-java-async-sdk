// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFotaTasksResponseBody</p>
 */
public class DescribeFotaTasksResponseBody extends TeaModel {
    @NameInMap("FotaTasks")
    private java.util.List < FotaTasks> fotaTasks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFotaTasksResponseBody(Builder builder) {
        this.fotaTasks = builder.fotaTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFotaTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return fotaTasks
     */
    public java.util.List < FotaTasks> getFotaTasks() {
        return this.fotaTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FotaTasks> fotaTasks; 
        private String requestId; 

        /**
         * FotaTasks.
         */
        public Builder fotaTasks(java.util.List < FotaTasks> fotaTasks) {
            this.fotaTasks = fotaTasks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFotaTasksResponseBody build() {
            return new DescribeFotaTasksResponseBody(this);
        } 

    } 

    public static class FotaTasks extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("FotaProject")
        private String fotaProject;

        @NameInMap("PendingDesktopCount")
        private Integer pendingDesktopCount;

        @NameInMap("PublishTime")
        private String publishTime;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskUid")
        private String taskUid;

        private FotaTasks(Builder builder) {
            this.appVersion = builder.appVersion;
            this.fotaProject = builder.fotaProject;
            this.pendingDesktopCount = builder.pendingDesktopCount;
            this.publishTime = builder.publishTime;
            this.releaseNote = builder.releaseNote;
            this.size = builder.size;
            this.status = builder.status;
            this.taskUid = builder.taskUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaTasks create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return fotaProject
         */
        public String getFotaProject() {
            return this.fotaProject;
        }

        /**
         * @return pendingDesktopCount
         */
        public Integer getPendingDesktopCount() {
            return this.pendingDesktopCount;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskUid
         */
        public String getTaskUid() {
            return this.taskUid;
        }

        public static final class Builder {
            private String appVersion; 
            private String fotaProject; 
            private Integer pendingDesktopCount; 
            private String publishTime; 
            private String releaseNote; 
            private Integer size; 
            private String status; 
            private String taskUid; 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * FotaProject.
             */
            public Builder fotaProject(String fotaProject) {
                this.fotaProject = fotaProject;
                return this;
            }

            /**
             * PendingDesktopCount.
             */
            public Builder pendingDesktopCount(Integer pendingDesktopCount) {
                this.pendingDesktopCount = pendingDesktopCount;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
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
             * TaskUid.
             */
            public Builder taskUid(String taskUid) {
                this.taskUid = taskUid;
                return this;
            }

            public FotaTasks build() {
                return new FotaTasks(this);
            } 

        } 

    }
}
