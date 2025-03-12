// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301.models;

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
 * {@link CreateOssUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateOssUploadTokenRequest</p>
 */
public class CreateOssUploadTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    private CreateOssUploadTokenRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssUploadTokenRequest create() {
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

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<CreateOssUploadTokenRequest, Builder> {
        private String fileName; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssUploadTokenRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileType = request.fileType;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public CreateOssUploadTokenRequest build() {
            return new CreateOssUploadTokenRequest(this);
        } 

    } 

}
