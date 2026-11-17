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
 * {@link GetCollaborationGroupOutputItemPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetCollaborationGroupOutputItemPreviewResponseBody</p>
 */
public class GetCollaborationGroupOutputItemPreviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("degraded")
    private Boolean degraded;

    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("fileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("itemId")
    private String itemId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("previewType")
    private String previewType;

    @com.aliyun.core.annotation.NameInMap("previewUrl")
    private String previewUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCollaborationGroupOutputItemPreviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.degraded = builder.degraded;
        this.downloadUrl = builder.downloadUrl;
        this.fileExt = builder.fileExt;
        this.fileName = builder.fileName;
        this.itemId = builder.itemId;
        this.message = builder.message;
        this.previewType = builder.previewType;
        this.previewUrl = builder.previewUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCollaborationGroupOutputItemPreviewResponseBody create() {
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
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
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
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private Boolean degraded; 
        private String downloadUrl; 
        private String fileExt; 
        private String fileName; 
        private String itemId; 
        private String message; 
        private String previewType; 
        private String previewUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCollaborationGroupOutputItemPreviewResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.degraded = model.degraded;
            this.downloadUrl = model.downloadUrl;
            this.fileExt = model.fileExt;
            this.fileName = model.fileName;
            this.itemId = model.itemId;
            this.message = model.message;
            this.previewType = model.previewType;
            this.previewUrl = model.previewUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The common business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.Auth.TenantAccessDenied</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The text content or preview prompt. This field can be empty.</p>
         * 
         * <strong>example:</strong>
         * <h1>Technical solution</h1>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Indicates whether the preview is downgraded to a download preview.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder degraded(Boolean degraded) {
            this.degraded = degraded;
            return this;
        }

        /**
         * <p>The short-term signed download URL. This field can be empty. If the URL expires, call this operation again.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/download/document.md">https://example.com/download/document.md</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The file name extension. This field can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>md</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>The file name. This field can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>codex-r2-a-baseline.md</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The output detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51469466</p>
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The common error description.</p>
         * 
         * <strong>example:</strong>
         * <p>Access denied to tenant 2147483647 because the user does not belong to the tenant</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The preview type.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT</p>
         */
        public Builder previewType(String previewType) {
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>The short-term preview URL. This field can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCollaborationGroupOutputItemPreviewResponseBody build() {
            return new GetCollaborationGroupOutputItemPreviewResponseBody(this);
        } 

    } 

}
