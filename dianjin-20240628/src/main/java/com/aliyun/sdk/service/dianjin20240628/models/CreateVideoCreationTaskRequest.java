// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link CreateVideoCreationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoCreationTaskRequest</p>
 */
public class CreateVideoCreationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creationInstruction")
    private CreationInstruction creationInstruction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileInfo")
    private FileInfo fileInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageDetectionTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageDetectionTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private CreateVideoCreationTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.xLoadTest = builder.xLoadTest;
        this.creationInstruction = builder.creationInstruction;
        this.fileInfo = builder.fileInfo;
        this.imageDetectionTaskId = builder.imageDetectionTaskId;
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoCreationTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return xLoadTest
     */
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

    /**
     * @return creationInstruction
     */
    public CreationInstruction getCreationInstruction() {
        return this.creationInstruction;
    }

    /**
     * @return fileInfo
     */
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return imageDetectionTaskId
     */
    public String getImageDetectionTaskId() {
        return this.imageDetectionTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateVideoCreationTaskRequest, Builder> {
        private String workspaceId; 
        private Boolean xLoadTest; 
        private CreationInstruction creationInstruction; 
        private FileInfo fileInfo; 
        private String imageDetectionTaskId; 
        private String requestId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoCreationTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.xLoadTest = request.xLoadTest;
            this.creationInstruction = request.creationInstruction;
            this.fileInfo = request.fileInfo;
            this.imageDetectionTaskId = request.imageDetectionTaskId;
            this.requestId = request.requestId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * X-Load-Test.
         */
        public Builder xLoadTest(Boolean xLoadTest) {
            this.putHeaderParameter("X-Load-Test", xLoadTest);
            this.xLoadTest = xLoadTest;
            return this;
        }

        /**
         * creationInstruction.
         */
        public Builder creationInstruction(CreationInstruction creationInstruction) {
            this.putBodyParameter("creationInstruction", creationInstruction);
            this.creationInstruction = creationInstruction;
            return this;
        }

        /**
         * fileInfo.
         */
        public Builder fileInfo(FileInfo fileInfo) {
            this.putBodyParameter("fileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder imageDetectionTaskId(String imageDetectionTaskId) {
            this.putBodyParameter("imageDetectionTaskId", imageDetectionTaskId);
            this.imageDetectionTaskId = imageDetectionTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateVideoCreationTaskRequest build() {
            return new CreateVideoCreationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVideoCreationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoCreationTaskRequest</p>
     */
    public static class CreationInstruction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private CreationInstruction(Builder builder) {
            this.instruction = builder.instruction;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreationInstruction create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String instruction; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(CreationInstruction model) {
                this.instruction = model.instruction;
                this.templateId = model.templateId;
            } 

            /**
             * instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public CreationInstruction build() {
                return new CreationInstruction(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVideoCreationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoCreationTaskRequest</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileTraceId")
        private String fileTraceId;

        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        private FileInfo(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileTraceId = builder.fileTraceId;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileTraceId
         */
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String fileTraceId; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileTraceId = model.fileTraceId;
                this.ossKey = model.ossKey;
            } 

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileTraceId.
             */
            public Builder fileTraceId(String fileTraceId) {
                this.fileTraceId = fileTraceId;
                return this;
            }

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
}
