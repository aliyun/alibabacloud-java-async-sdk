// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link BackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>BackupFileResponseBody</p>
 */
public class BackupFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private BackupFileResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackupFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<Data> data; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(BackupFileResponseBody model) {
            this.count = model.count;
            this.data = model.data;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The number of instances that are backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The object that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the batch task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-22ex666a5mco5****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public BackupFileResponseBody build() {
            return new BackupFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BackupFileResponseBody} extends {@link TeaModel}
     *
     * <p>BackupFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("BackupFileId")
        private String backupFileId;

        @com.aliyun.core.annotation.NameInMap("BackupFileName")
        private String backupFileName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.backupFileId = builder.backupFileId;
            this.backupFileName = builder.backupFileName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return backupFileId
         */
        public String getBackupFileId() {
            return this.backupFileId;
        }

        /**
         * @return backupFileName
         */
        public String getBackupFileName() {
            return this.backupFileName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private String backupFileId; 
            private String backupFileName; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.androidInstanceId = model.androidInstanceId;
                this.backupFileId = model.backupFileId;
                this.backupFileName = model.backupFileName;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the cloud phone instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-34pqe4r0kd9kn****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The ID of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>bf-b0qbg3pbpjkn7****</p>
             */
            public Builder backupFileId(String backupFileId) {
                this.backupFileId = backupFileId;
                return this;
            }

            /**
             * <p>The name of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>a-58ftsoo90p0qa****.ab</p>
             */
            public Builder backupFileName(String backupFileName) {
                this.backupFileName = backupFileName;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-22ex666a5mco5****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
