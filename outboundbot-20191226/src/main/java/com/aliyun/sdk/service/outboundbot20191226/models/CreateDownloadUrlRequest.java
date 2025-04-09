// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadUrlRequest</p>
 */
public class CreateDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downloadTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>137da36b41304bcd999a0a7895dc6881</p>
         */
        public Builder downloadTaskId(String downloadTaskId) {
            this.putQueryParameter("DownloadTaskId", downloadTaskId);
            this.downloadTaskId = downloadTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6f91885fa24b4c408d8f4eb392fd8ae6</p>
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
