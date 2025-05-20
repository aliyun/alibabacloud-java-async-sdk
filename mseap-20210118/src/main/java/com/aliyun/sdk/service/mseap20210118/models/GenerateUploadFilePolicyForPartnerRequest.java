// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link GenerateUploadFilePolicyForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadFilePolicyForPartnerRequest</p>
 */
public class GenerateUploadFilePolicyForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    private GenerateUploadFilePolicyForPartnerRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadFilePolicyForPartnerRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateUploadFilePolicyForPartnerRequest, Builder> {
        private String bizType; 
        private String fileName; 
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadFilePolicyForPartnerRequest request) {
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
        public GenerateUploadFilePolicyForPartnerRequest build() {
            return new GenerateUploadFilePolicyForPartnerRequest(this);
        } 

    } 

}
