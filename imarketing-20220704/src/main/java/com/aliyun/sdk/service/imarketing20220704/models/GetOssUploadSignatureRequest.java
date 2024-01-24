// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUploadSignatureRequest} extends {@link RequestModel}
 *
 * <p>GetOssUploadSignatureRequest</p>
 */
public class GetOssUploadSignatureRequest extends Request {
    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileType")
    private String fileType;

    private GetOssUploadSignatureRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadSignatureRequest create() {
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

    public static final class Builder extends Request.Builder<GetOssUploadSignatureRequest, Builder> {
        private String fileName; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUploadSignatureRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileType = request.fileType;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public GetOssUploadSignatureRequest build() {
            return new GetOssUploadSignatureRequest(this);
        } 

    } 

}
