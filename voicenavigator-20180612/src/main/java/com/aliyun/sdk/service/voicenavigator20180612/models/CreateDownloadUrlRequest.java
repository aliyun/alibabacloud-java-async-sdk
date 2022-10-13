// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadUrlRequest</p>
 */
public class CreateDownloadUrlRequest extends Request {
    @Query
    @NameInMap("DownloadTaskId")
    @Validation(required = true)
    private String downloadTaskId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    private CreateDownloadUrlRequest(Builder builder) {
        super(builder);
        this.downloadTaskId = builder.downloadTaskId;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadTaskId
     */
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder extends Request.Builder<CreateDownloadUrlRequest, Builder> {
        private String downloadTaskId; 
        private String fileId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadUrlRequest request) {
            super(request);
            this.downloadTaskId = request.downloadTaskId;
            this.fileId = request.fileId;
        } 

        /**
         * DownloadTaskId.
         */
        public Builder downloadTaskId(String downloadTaskId) {
            this.putQueryParameter("DownloadTaskId", downloadTaskId);
            this.downloadTaskId = downloadTaskId;
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

        @Override
        public CreateDownloadUrlRequest build() {
            return new CreateDownloadUrlRequest(this);
        } 

    } 

}
