// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOssUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>GetOssUploadTokenRequest</p>
 */
public class GetOssUploadTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    private GetOssUploadTokenRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetOssUploadTokenRequest, Builder> {
        private String fileName; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUploadTokenRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileType = request.fileType;
        } 

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public GetOssUploadTokenRequest build() {
            return new GetOssUploadTokenRequest(this);
        } 

    } 

}
