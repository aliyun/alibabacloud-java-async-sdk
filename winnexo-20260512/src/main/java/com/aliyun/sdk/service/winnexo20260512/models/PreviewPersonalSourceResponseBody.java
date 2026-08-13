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
 * {@link PreviewPersonalSourceResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewPersonalSourceResponseBody</p>
 */
public class PreviewPersonalSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

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

    private PreviewPersonalSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
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

    public static PreviewPersonalSourceResponseBody create() {
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
        private String fileExt; 
        private String fileName; 
        private String message; 
        private String previewType; 
        private String previewUrl; 
        private String publicUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewPersonalSourceResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.fileExt = model.fileExt;
            this.fileName = model.fileName;
            this.message = model.message;
            this.previewType = model.previewType;
            this.previewUrl = model.previewUrl;
            this.publicUrl = model.publicUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>文本内容（CONTENT类型使用）</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>文件扩展名（OSS_IMM类型使用）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>文件名（OSS_IMM类型使用）</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>预览类型：OSS_IMM / IMAGE / AUDIO / VIDEO / HTML / DING_TALK / VOICE_MEETING / CONTENT</p>
         * 
         * <strong>example:</strong>
         * <p>OSS_IMM</p>
         */
        public Builder previewType(String previewType) {
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>预览URL（OSS_IMM、DING_TALK、VOICE_MEETING使用）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>公开下载URL（可供下载的文件URL）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewPersonalSourceResponseBody build() {
            return new PreviewPersonalSourceResponseBody(this);
        } 

    } 

}
