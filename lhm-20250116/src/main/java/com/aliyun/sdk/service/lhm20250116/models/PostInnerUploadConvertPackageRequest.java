// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link PostInnerUploadConvertPackageRequest} extends {@link RequestModel}
 *
 * <p>PostInnerUploadConvertPackageRequest</p>
 */
public class PostInnerUploadConvertPackageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileContentBase64")
    private String fileContentBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private PostInnerUploadConvertPackageRequest(Builder builder) {
        super(builder);
        this.fileContentBase64 = builder.fileContentBase64;
        this.fileName = builder.fileName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostInnerUploadConvertPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileContentBase64
     */
    public String getFileContentBase64() {
        return this.fileContentBase64;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<PostInnerUploadConvertPackageRequest, Builder> {
        private String fileContentBase64; 
        private String fileName; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(PostInnerUploadConvertPackageRequest request) {
            super(request);
            this.fileContentBase64 = request.fileContentBase64;
            this.fileName = request.fileName;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The file content, Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>U0VMRUNUICogRlJPTSB0Ow==</p>
         */
        public Builder fileContentBase64(String fileContentBase64) {
            this.putBodyParameter("fileContentBase64", fileContentBase64);
            this.fileContentBase64 = fileContentBase64;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_file</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public PostInnerUploadConvertPackageRequest build() {
            return new PostInnerUploadConvertPackageRequest(this);
        } 

    } 

}
