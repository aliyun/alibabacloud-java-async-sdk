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
 * {@link CreateWatermarkEmbedTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWatermarkEmbedTaskRequest</p>
 */
public class CreateWatermarkEmbedTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Level")
    @com.aliyun.core.annotation.Validation(required = true)
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserved")
    private String reserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkContent")
    private String watermarkContent;

    private CreateWatermarkEmbedTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.level = builder.level;
        this.reserved = builder.reserved;
        this.watermarkContent = builder.watermarkContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWatermarkEmbedTaskRequest create() {
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
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    /**
     * @return watermarkContent
     */
    public String getWatermarkContent() {
        return this.watermarkContent;
    }

    public static final class Builder extends Request.Builder<CreateWatermarkEmbedTaskRequest, Builder> {
        private String clientToken; 
        private String fileType; 
        private String fileUrl; 
        private String level; 
        private String reserved; 
        private String watermarkContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateWatermarkEmbedTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.level = request.level;
            this.reserved = request.reserved;
            this.watermarkContent = request.watermarkContent;
        } 

        /**
         * <p>A reserved idempotency field. This field is not supported. Passing a value does not cause an error, but it does not produce an idempotency effect.</p>
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
         * <p>The file type. Valid values:</p>
         * <ul>
         * <li>image: image.</li>
         * <li>video: video.</li>
         * </ul>
         * <p>The value must match the actual file type.</p>
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
         * <p>The URL of the file to be processed. Images and videos are supported. Only the HTTP and HTTPS protocols are supported. Videos must be no longer than 10 minutes and no larger than 100 MB.</p>
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
         * <p>The embedding strength. Valid values: 0 to 5. A higher strength provides better robustness but lower visual quality.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2&quot;</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>A reserved field. No valid values are available. Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder reserved(String reserved) {
            this.putQueryParameter("Reserved", reserved);
            this.reserved = reserved;
            return this;
        }

        /**
         * <p>The watermark content. The embedded content can be restored to the original text by calling the extraction operation.</p>
         * 
         * <strong>example:</strong>
         * <p>wm-e2e-85970647</p>
         */
        public Builder watermarkContent(String watermarkContent) {
            this.putQueryParameter("WatermarkContent", watermarkContent);
            this.watermarkContent = watermarkContent;
            return this;
        }

        @Override
        public CreateWatermarkEmbedTaskRequest build() {
            return new CreateWatermarkEmbedTaskRequest(this);
        } 

    } 

}
