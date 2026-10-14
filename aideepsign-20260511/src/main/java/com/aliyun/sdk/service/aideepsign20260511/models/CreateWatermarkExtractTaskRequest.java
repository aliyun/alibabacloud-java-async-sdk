// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateWatermarkExtractTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWatermarkExtractTaskRequest</p>
 */
public class CreateWatermarkExtractTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserved")
    private String reserved;

    private CreateWatermarkExtractTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.reserved = builder.reserved;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWatermarkExtractTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    public static final class Builder extends Request.Builder<CreateWatermarkExtractTaskRequest, Builder> {
        private String clientToken; 
        private String fileType; 
        private String fileUrl; 
        private String reserved; 

        private Builder() {
            super();
        } 

        private Builder(CreateWatermarkExtractTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.reserved = request.reserved;
        } 

        /**
         * <p>A reserved idempotency field. Idempotency is not supported. Passing in a value does not cause an error, but it does not produce an idempotency effect.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The file type. Valid values: <code>image</code> and <code>video</code>. The value must be the same as the <code>FileType</code> used when the watermark was embedded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The URL of the file from which the watermark is to be extracted. Images and videos are supported. Only the <code>http/https</code> protocol is supported. Videos must be no longer than 10 minutes and no larger than 100 MB.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/demo.mp4">https://example.com/demo.mp4</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>A reserved field. No valid values are available. Do not pass in this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder reserved(String reserved) {
            this.putQueryParameter("Reserved", reserved);
            this.reserved = reserved;
            return this;
        }

        @Override
        public CreateWatermarkExtractTaskRequest build() {
            return new CreateWatermarkExtractTaskRequest(this);
        } 

    } 

}
