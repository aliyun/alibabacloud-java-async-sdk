// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecycleBinDeleteJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRecycleBinDeleteJobRequest</p>
 */
public class CreateRecycleBinDeleteJobRequest extends Request {
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

    private CreateRecycleBinDeleteJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileId = builder.fileId;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecycleBinDeleteJobRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRecycleBinDeleteJobRequest, Builder> {
        private String clientToken; 
        private String fileId; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecycleBinDeleteJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileId = request.fileId;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * > If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the file or directory that you want to permanently delete.
         * <p>
         * 
         * You can call the [ListRecycledDirectoriesAndFiles](~~264193~~) operation to query the value of the FileId parameter.
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

        @Override
        public CreateRecycleBinDeleteJobRequest build() {
            return new CreateRecycleBinDeleteJobRequest(this);
        } 

    } 

}
