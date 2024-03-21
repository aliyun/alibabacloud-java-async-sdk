// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

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
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    private GenerateUploadFilePolicyRequest(Builder builder) {
        super(builder);
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
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<GenerateUploadFilePolicyRequest, Builder> {
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadFilePolicyRequest request) {
            super(request);
            this.fileType = request.fileType;
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
