// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetExplorerTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetExplorerTaskResponseBody</p>
 */
public class GetExplorerTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("task")
    private Task task;

    private GetExplorerTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExplorerTaskResponseBody create() {
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetExplorerTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetExplorerTaskResponseBody build() {
            return new GetExplorerTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExplorerTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetExplorerTaskResponseBody</p>
     */
    public static class UploadSignature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private UploadSignature(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.bucketName = builder.bucketName;
            this.key = builder.key;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadSignature create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String bucketName; 
            private String key; 
            private String policy; 
            private String signature; 
            private String url; 

            private Builder() {
            } 

            private Builder(UploadSignature model) {
                this.accessKeyId = model.accessKeyId;
                this.bucketName = model.bucketName;
                this.key = model.key;
                this.policy = model.policy;
                this.signature = model.signature;
                this.url = model.url;
            } 

            /**
             * accessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public UploadSignature build() {
                return new UploadSignature(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExplorerTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetExplorerTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("autoDestroy")
        private Boolean autoDestroy;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentJobId")
        private String currentJobId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("explorerTaskId")
        private String explorerTaskId;

        @com.aliyun.core.annotation.NameInMap("initModuleState")
        private Boolean initModuleState;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
        private Boolean skipPropertyValidation;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        @com.aliyun.core.annotation.NameInMap("terraformVersion")
        private String terraformVersion;

        @com.aliyun.core.annotation.NameInMap("triggerValue")
        private String triggerValue;

        @com.aliyun.core.annotation.NameInMap("uploadSignature")
        private UploadSignature uploadSignature;

        private Task(Builder builder) {
            this.autoApply = builder.autoApply;
            this.autoDestroy = builder.autoDestroy;
            this.createTime = builder.createTime;
            this.currentJobId = builder.currentJobId;
            this.description = builder.description;
            this.explorerTaskId = builder.explorerTaskId;
            this.initModuleState = builder.initModuleState;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.skipPropertyValidation = builder.skipPropertyValidation;
            this.status = builder.status;
            this.taskOutputPath = builder.taskOutputPath;
            this.terraformVersion = builder.terraformVersion;
            this.triggerValue = builder.triggerValue;
            this.uploadSignature = builder.uploadSignature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return autoApply
         */
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        /**
         * @return autoDestroy
         */
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentJobId
         */
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return explorerTaskId
         */
        public String getExplorerTaskId() {
            return this.explorerTaskId;
        }

        /**
         * @return initModuleState
         */
        public Boolean getInitModuleState() {
            return this.initModuleState;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skipPropertyValidation
         */
        public Boolean getSkipPropertyValidation() {
            return this.skipPropertyValidation;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskOutputPath
         */
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        /**
         * @return terraformVersion
         */
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        /**
         * @return triggerValue
         */
        public String getTriggerValue() {
            return this.triggerValue;
        }

        /**
         * @return uploadSignature
         */
        public UploadSignature getUploadSignature() {
            return this.uploadSignature;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private Boolean autoDestroy; 
            private String createTime; 
            private String currentJobId; 
            private String description; 
            private String explorerTaskId; 
            private Boolean initModuleState; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private Boolean skipPropertyValidation; 
            private String status; 
            private String taskOutputPath; 
            private String terraformVersion; 
            private String triggerValue; 
            private UploadSignature uploadSignature; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.autoApply = model.autoApply;
                this.autoDestroy = model.autoDestroy;
                this.createTime = model.createTime;
                this.currentJobId = model.currentJobId;
                this.description = model.description;
                this.explorerTaskId = model.explorerTaskId;
                this.initModuleState = model.initModuleState;
                this.moduleId = model.moduleId;
                this.moduleVersion = model.moduleVersion;
                this.name = model.name;
                this.skipPropertyValidation = model.skipPropertyValidation;
                this.status = model.status;
                this.taskOutputPath = model.taskOutputPath;
                this.terraformVersion = model.terraformVersion;
                this.triggerValue = model.triggerValue;
                this.uploadSignature = model.uploadSignature;
            } 

            /**
             * autoApply.
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * autoDestroy.
             */
            public Builder autoDestroy(Boolean autoDestroy) {
                this.autoDestroy = autoDestroy;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * currentJobId.
             */
            public Builder currentJobId(String currentJobId) {
                this.currentJobId = currentJobId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * explorerTaskId.
             */
            public Builder explorerTaskId(String explorerTaskId) {
                this.explorerTaskId = explorerTaskId;
                return this;
            }

            /**
             * initModuleState.
             */
            public Builder initModuleState(Boolean initModuleState) {
                this.initModuleState = initModuleState;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * skipPropertyValidation.
             */
            public Builder skipPropertyValidation(Boolean skipPropertyValidation) {
                this.skipPropertyValidation = skipPropertyValidation;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskOutputPath.
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            /**
             * terraformVersion.
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * triggerValue.
             */
            public Builder triggerValue(String triggerValue) {
                this.triggerValue = triggerValue;
                return this;
            }

            /**
             * uploadSignature.
             */
            public Builder uploadSignature(UploadSignature uploadSignature) {
                this.uploadSignature = uploadSignature;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
