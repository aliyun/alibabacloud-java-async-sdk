// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadFilePolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadFilePolicyRequest</p>
 */
public class GenerateUploadFilePolicyRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileType")
    private String fileType;

    private GenerateUploadFilePolicyRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadFilePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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

    public static final class Builder extends Request.Builder<GenerateUploadFilePolicyRequest, Builder> {
        private String bizType; 
        private String fileName; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadFilePolicyRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
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
        public GenerateUploadFilePolicyRequest build() {
            return new GenerateUploadFilePolicyRequest(this);
        } 

    } 

}
