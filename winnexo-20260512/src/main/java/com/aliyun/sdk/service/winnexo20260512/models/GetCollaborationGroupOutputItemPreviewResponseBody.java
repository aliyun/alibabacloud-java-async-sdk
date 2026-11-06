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
         * <p>公共业务状态码，由后端Code字段映射；错误时用于识别失败原因。</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.Auth.TenantAccessDenied</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>可直接展示的文本正文或预览提示；不提供正文的文件类型可为空。</p>
         * 
         * <strong>example:</strong>
         * <h1>技术方案</h1>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>是否降级为下载。true时应展示下载入口，不要按在线文档预览器处理。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder degraded(Boolean degraded) {
            this.degraded = degraded;
            return this;
        }

        /**
         * <p>短期签名下载地址；普通文件有效期3600秒，邮件正文可为空。过期后重新调用本接口。示例仅展示URL格式，不包含真实签名。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/download/document.md">https://example.com/download/document.md</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>文件扩展名，不含点；无扩展名时可为空。</p>
         * 
         * <strong>example:</strong>
         * <p>md</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>文件名，包含扩展名；无文件名时可为空。</p>
         * 
         * <strong>example:</strong>
         * <p>codex-r2-a-baseline.md</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>对话生成文件的产出明细ID。取GetNodeDetail返回的artifacts中ref.kind为USER_OUTPUT_ITEM的ref.id；不是artifactId。</p>
         * 
         * <strong>example:</strong>
         * <p>51469466</p>
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>公共错误说明，由后端Message字段映射；错误时描述失败原因。</p>
         * 
         * <strong>example:</strong>
         * <p>无权访问租户 2147483647，用户不属于该租户</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>预览方式，例如CONTENT为文本正文，HTML为网页，IMAGE为图片，AUDIO为音频，VIDEO为视频，OSS_IMM为文档预览。</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT</p>
         */
        public Builder previewType(String previewType) {
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>短期预览地址；正文可直接展示时可为空。地址过期后重新调用本接口。示例仅展示URL格式，不是可访问凭证。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>请求追踪ID，由后端RequestId字段映射，用于排查调用失败。</p>
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
