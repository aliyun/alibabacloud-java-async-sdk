// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeComfyUserDataUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeComfyUserDataUploadUrlRequest</p>
 */
public class DescribeComfyUserDataUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMd5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSizeBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileSizeBytes;

    private DescribeComfyUserDataUploadUrlRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.fileMd5 = builder.fileMd5;
        this.fileName = builder.fileName;
        this.fileSizeBytes = builder.fileSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyUserDataUploadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSizeBytes
     */
    public Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    public static final class Builder extends Request.Builder<DescribeComfyUserDataUploadUrlRequest, Builder> {
        private String contentType; 
        private String fileMd5; 
        private String fileName; 
        private Long fileSizeBytes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComfyUserDataUploadUrlRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.fileMd5 = request.fileMd5;
            this.fileName = request.fileName;
            this.fileSizeBytes = request.fileSizeBytes;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/jpeg</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54d6911ba6d59dbe68990835a409f18c</p>
         */
        public Builder fileMd5(String fileMd5) {
            this.putQueryParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myfile</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder fileSizeBytes(Long fileSizeBytes) {
            this.putQueryParameter("FileSizeBytes", fileSizeBytes);
            this.fileSizeBytes = fileSizeBytes;
            return this;
        }

        @Override
        public DescribeComfyUserDataUploadUrlRequest build() {
            return new DescribeComfyUserDataUploadUrlRequest(this);
        } 

    } 

}
