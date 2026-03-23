// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetAttachmentUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAttachmentUploadUrlRequest</p>
 */
public class GetAttachmentUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    private GetAttachmentUploadUrlRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachmentUploadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GetAttachmentUploadUrlRequest, Builder> {
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GetAttachmentUploadUrlRequest request) {
            super(request);
            this.fileName = request.fileName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GetAttachmentUploadUrlRequest build() {
            return new GetAttachmentUploadUrlRequest(this);
        } 

    } 

}
