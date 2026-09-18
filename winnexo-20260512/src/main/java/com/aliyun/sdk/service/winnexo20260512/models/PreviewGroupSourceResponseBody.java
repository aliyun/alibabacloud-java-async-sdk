// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link PreviewGroupSourceResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewGroupSourceResponseBody</p>
 */
public class PreviewGroupSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("degraded")
    private Boolean degraded;

    @com.aliyun.core.annotation.NameInMap("fileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("previewType")
    private String previewType;

    @com.aliyun.core.annotation.NameInMap("previewUrl")
    private String previewUrl;

    @com.aliyun.core.annotation.NameInMap("publicUrl")
    private String publicUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PreviewGroupSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.degraded = builder.degraded;
        this.fileExt = builder.fileExt;
        this.fileName = builder.fileName;
        this.message = builder.message;
        this.previewType = builder.previewType;
        this.previewUrl = builder.previewUrl;
        this.publicUrl = builder.publicUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewGroupSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return degraded
     */
    public Boolean getDegraded() {
        return this.degraded;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return previewType
     */
    public String getPreviewType() {
        return this.previewType;
    }

    /**
     * @return previewUrl
     */
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * @return publicUrl
     */
    public String getPublicUrl() {
        return this.publicUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private Boolean degraded; 
        private String fileExt; 
        private String fileName; 
        private String message; 
        private String previewType; 
        private String previewUrl; 
        private String publicUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewGroupSourceResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.degraded = model.degraded;
            this.fileExt = model.fileExt;
            this.fileName = model.fileName;
            this.message = model.message;
            this.previewType = model.previewType;
            this.previewUrl = model.previewUrl;
            this.publicUrl = model.publicUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The text content. This field is used for the CONTENT preview type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Indicates whether the preview is degraded to a download, meaning the resource cannot be opened in the online previewer. Valid values:</p>
         * <ul>
         * <li>true: The preview is degraded to a download.</li>
         * <li>false: The resource can be previewed online.</li>
         * </ul>
         */
        public Builder degraded(Boolean degraded) {
            this.degraded = degraded;
            return this;
        }

        /**
         * <p>The file name extension. This field is used for the OSS_IMM preview type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>The file name. This field is used for the OSS_IMM preview type.</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The error details.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The preview type. Valid values: OSS_IMM, IMAGE, AUDIO, VIDEO, HTML, DING_TALK, VOICE_MEETING, and CONTENT.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS_IMM</p>
         */
        public Builder previewType(String previewType) {
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>The preview URL. This field is used for the OSS_IMM, DING_TALK, and VOICE_MEETING preview types.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>The public download URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewGroupSourceResponseBody build() {
            return new PreviewGroupSourceResponseBody(this);
        } 

    } 

}
