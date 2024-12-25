// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DeleteFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileRequest</p>
 */
public class DeleteFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    private DeleteFileRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder extends Request.Builder<DeleteFileRequest, Builder> {
        private String fileId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileRequest request) {
            super(request);
            this.fileId = request.fileId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f-167131acd45omat771813f7141d28db2f7</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        @Override
        public DeleteFileRequest build() {
            return new DeleteFileRequest(this);
        } 

    } 

}
