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
 * {@link CreateImageDetectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageDetectionTaskRequest</p>
 */
public class CreateImageDetectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileInfo")
    private FileInfo fileInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private CreateImageDetectionTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.xLoadTest = builder.xLoadTest;
        this.fileInfo = builder.fileInfo;
        this.fileUrl = builder.fileUrl;
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageDetectionTaskRequest create() {
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
     * @return fileInfo
     */
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
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

    public static final class Builder extends Request.Builder<CreateImageDetectionTaskRequest, Builder> {
        private String workspaceId; 
        private Boolean xLoadTest; 
        private FileInfo fileInfo; 
        private String fileUrl; 
        private String requestId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageDetectionTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.xLoadTest = request.xLoadTest;
            this.fileInfo = request.fileInfo;
            this.fileUrl = request.fileUrl;
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
         * fileInfo.
         */
        public Builder fileInfo(FileInfo fileInfo) {
            this.putBodyParameter("fileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * fileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("fileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sfkhwjf</p>
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
        public CreateImageDetectionTaskRequest build() {
            return new CreateImageDetectionTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageDetectionTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateImageDetectionTaskRequest</p>
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
