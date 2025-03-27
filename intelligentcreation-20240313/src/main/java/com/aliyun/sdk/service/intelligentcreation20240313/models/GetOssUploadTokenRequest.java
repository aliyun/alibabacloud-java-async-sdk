// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uploadType")
    private Integer uploadType;

    private GetOssUploadTokenRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.uploadType = builder.uploadType;
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

    /**
     * @return uploadType
     */
    public Integer getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<GetOssUploadTokenRequest, Builder> {
        private String fileName; 
        private String fileType; 
        private Integer uploadType; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUploadTokenRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.uploadType = request.uploadType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8021678.png</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductImage</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * uploadType.
         */
        public Builder uploadType(Integer uploadType) {
            this.putQueryParameter("uploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public GetOssUploadTokenRequest build() {
            return new GetOssUploadTokenRequest(this);
        } 

    } 

}
