// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecycleBinRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRecycleBinRestoreJobRequest</p>
 */
public class CreateRecycleBinRestoreJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetFileId;

    private CreateRecycleBinRestoreJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileId = builder.fileId;
        this.fileSystemId = builder.fileSystemId;
        this.targetFileId = builder.targetFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecycleBinRestoreJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return targetFileId
     */
    public String getTargetFileId() {
        return this.targetFileId;
    }

    public static final class Builder extends Request.Builder<CreateRecycleBinRestoreJobRequest, Builder> {
        private String clientToken; 
        private String fileId; 
        private String fileSystemId; 
        private String targetFileId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecycleBinRestoreJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileId = request.fileId;
            this.fileSystemId = request.fileSystemId;
            this.targetFileId = request.targetFileId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         * 
         * > If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the file or directory that you want to restore.
         * <p>
         * 
         * You can call the [ListRecycleBinJobs](~~264192~~) operation to query the value of the FileId parameter.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The ID of the directory to which the file is restored.
         */
        public Builder targetFileId(String targetFileId) {
            this.putQueryParameter("TargetFileId", targetFileId);
            this.targetFileId = targetFileId;
            return this;
        }

        @Override
        public CreateRecycleBinRestoreJobRequest build() {
            return new CreateRecycleBinRestoreJobRequest(this);
        } 

    } 

}
