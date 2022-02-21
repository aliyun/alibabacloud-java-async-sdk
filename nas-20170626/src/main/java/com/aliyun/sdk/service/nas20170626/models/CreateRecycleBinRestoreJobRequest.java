// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecycleBinRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRecycleBinRestoreJobRequest</p>
 */
public class CreateRecycleBinRestoreJobRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("TargetFileId")
    @Validation(required = true)
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

        private Builder(CreateRecycleBinRestoreJobRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.fileId = response.fileId;
            this.fileSystemId = response.fileSystemId;
            this.targetFileId = response.targetFileId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * TargetFileId.
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
