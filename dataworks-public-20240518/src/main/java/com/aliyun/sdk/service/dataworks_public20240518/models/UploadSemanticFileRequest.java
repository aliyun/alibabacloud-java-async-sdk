// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UploadSemanticFileRequest} extends {@link RequestModel}
 *
 * <p>UploadSemanticFileRequest</p>
 */
public class UploadSemanticFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SizeBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sizeBytes;

    private UploadSemanticFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentType = builder.contentType;
        this.fileName = builder.fileName;
        this.sizeBytes = builder.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSemanticFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return sizeBytes
     */
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public static final class Builder extends Request.Builder<UploadSemanticFileRequest, Builder> {
        private String regionId; 
        private String contentType; 
        private String fileName; 
        private Long sizeBytes; 

        private Builder() {
            super();
        } 

        private Builder(UploadSemanticFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentType = request.contentType;
            this.fileName = request.fileName;
            this.sizeBytes = request.sizeBytes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reference.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder sizeBytes(Long sizeBytes) {
            this.putBodyParameter("SizeBytes", sizeBytes);
            this.sizeBytes = sizeBytes;
            return this;
        }

        @Override
        public UploadSemanticFileRequest build() {
            return new UploadSemanticFileRequest(this);
        } 

    } 

}
