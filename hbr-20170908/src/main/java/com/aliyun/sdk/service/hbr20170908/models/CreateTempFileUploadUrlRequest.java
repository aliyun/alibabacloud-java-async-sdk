// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTempFileUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateTempFileUploadUrlRequest</p>
 */
public class CreateTempFileUploadUrlRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    private CreateTempFileUploadUrlRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTempFileUploadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<CreateTempFileUploadUrlRequest, Builder> {
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTempFileUploadUrlRequest request) {
            super(request);
            this.fileName = request.fileName;
        } 

        /**
         * The name of the file to be uploaded.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public CreateTempFileUploadUrlRequest build() {
            return new CreateTempFileUploadUrlRequest(this);
        } 

    } 

}
