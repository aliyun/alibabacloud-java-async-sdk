// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublishResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePublishResponseBody</p>
 */
public class CreatePublishResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePublishResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePublishResponseBody build() {
            return new CreatePublishResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CommitId")
        private String commitId;

        @NameInMap("CompletionTime")
        private String completionTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PublishId")
        private String publishId;

        @NameInMap("PublishStatus")
        private String publishStatus;

        @NameInMap("PublishType")
        private String publishType;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SubTasks")
        private java.util.List < java.util.Map<String, String>> subTasks;

        @NameInMap("VersionNumber")
        private String versionNumber;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.commitId = builder.commitId;
            this.completionTime = builder.completionTime;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.envId = builder.envId;
            this.modifiedTime = builder.modifiedTime;
            this.publishId = builder.publishId;
            this.publishStatus = builder.publishStatus;
            this.publishType = builder.publishType;
            this.reason = builder.reason;
            this.startTime = builder.startTime;
            this.subTasks = builder.subTasks;
            this.versionNumber = builder.versionNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return completionTime
         */
        public String getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return publishId
         */
        public String getPublishId() {
            return this.publishId;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return subTasks
         */
        public java.util.List < java.util.Map<String, String>> getSubTasks() {
            return this.subTasks;
        }

        /**
         * @return versionNumber
         */
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public static final class Builder {
            private String appId; 
            private String commitId; 
            private String completionTime; 
            private String createTime; 
            private String description; 
            private String envId; 
            private String modifiedTime; 
            private String publishId; 
            private String publishStatus; 
            private String publishType; 
            private String reason; 
            private String startTime; 
            private java.util.List < java.util.Map<String, String>> subTasks; 
            private String versionNumber; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CommitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * CompletionTime.
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PublishId.
             */
            public Builder publishId(String publishId) {
                this.publishId = publishId;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SubTasks.
             */
            public Builder subTasks(java.util.List < java.util.Map<String, String>> subTasks) {
                this.subTasks = subTasks;
                return this;
            }

            /**
             * VersionNumber.
             */
            public Builder versionNumber(String versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
