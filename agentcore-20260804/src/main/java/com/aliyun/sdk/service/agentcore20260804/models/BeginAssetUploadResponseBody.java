// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link BeginAssetUploadResponseBody} extends {@link TeaModel}
 *
 * <p>BeginAssetUploadResponseBody</p>
 */
public class BeginAssetUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private BeginAssetUploadResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginAssetUploadResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BeginAssetUploadResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>包含 assetId、uploadId、实际 status、contentType，以及有效 UPLOADING 会话的 uploadUrl、headers 和 expiresAt。携带 sourceETag 的 Begin 复用当前上传目标时，可返回 PENDING、PROCESSING 或 COMPLETED，此时不返回上传地址，无需再次上传或确认；应依据 status 判断是否完成。显式提供相同 clientToken 且未传 sourceETag 的 PENDING 重放仍须通过 CompleteAssetUpload 补交调度。完成 PUT 上传后，CompleteAssetUpload 必须传回此 uploadId。uploadUrl 统一使用 OSS 公网地址；不返回固定上传方法或固定大小上限。签名到期不代表上传意图失效。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BeginAssetUploadResponseBody build() {
            return new BeginAssetUploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BeginAssetUploadResponseBody} extends {@link TeaModel}
     *
     * <p>BeginAssetUploadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("uploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("uploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.assetId = builder.assetId;
            this.contentType = builder.contentType;
            this.expiresAt = builder.expiresAt;
            this.headers = builder.headers;
            this.status = builder.status;
            this.uploadId = builder.uploadId;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String assetId; 
            private String contentType; 
            private String expiresAt; 
            private java.util.Map<String, String> headers; 
            private String status; 
            private String uploadId; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetId = model.assetId;
                this.contentType = model.contentType;
                this.expiresAt = model.expiresAt;
                this.headers = model.headers;
                this.status = model.status;
                this.uploadId = model.uploadId;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>本次上传所属资产的稳定 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>平台校验或推导后的原件 MIME 类型；返回上传签名时与 headers 中的 Content-Type 一致，上传必须原样携带。</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>ISO 8601 UTC 时间，仅随有效 UPLOADING 会话的 uploadUrl 返回；客户端 token 幂等重放（须显式提供并命中最近一次 Begin 保存的 token）或来源版本去重命中有效上传会话时可获取刷新后的签名。签名过期不等于上传意图过期。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:15:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>仅随有效 UPLOADING 会话的 uploadUrl 返回。上传必须原样带入的签名请求头，包括 Content-Type 及不可覆盖写入约束所需的头；不得自行增加、更改或省略参与签名的头。旧上传地址也不得改写已存在的原件对象。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Content-Type&quot;:&quot;application/pdf&quot;}</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>新登记上传为 UPLOADING；客户端 token 幂等重放（须显式提供并命中最近一次 Begin 保存的 token）或来源版本去重均返回实际状态，仅 UPLOADING 且上传意图有效时可签发 URL。携带 sourceETag 的 Begin 复用当前上传目标时，可返回 PENDING、PROCESSING 或 COMPLETED，无需再次上传或确认；PENDING 按相同 taskKey 补交调度，不递增加工代次。显式提供相同 clientToken 且未传 sourceETag 的 PENDING 重放仍须通过 CompleteAssetUpload 补交调度。版本相同不表示处理完成。客户端 token 幂等命中 FAILED 时返回失败状态；新的上传意图遇到 FAILED 或上传意图过期时按规则创建新会话。</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOADING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>本次上传会话的稳定标识，完成 PUT 上传后调用 CompleteAssetUpload 时必传。客户端提供的 clientToken 命中最近一次 Begin 保存的 token 且规范化请求相同，或指定稳定 assetId、overwrite=true 并满足 sourceETag 去重条件时复用当前 uploadId 和加工代次；来源版本去重不要求提供 clientToken。其他合法的新上传意图生成新的 uploadId 和内部原件路径，未提供 clientToken 不保证跨请求重试幂等。</p>
             * 
             * <strong>example:</strong>
             * <p>upload-001</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * <p>仅限该资产原件对象的短期预签名 PUT URL，统一使用 OSS 公网地址；仅 UPLOADING 且上传意图有效时返回。客户端 token 幂等重放（须显式提供并命中最近一次 Begin 保存的 token）或来源版本去重命中有效上传会话时刷新同一对象路径的签名，不用于覆盖已确认上传的原件；PENDING、PROCESSING、COMPLETED 或 FAILED 均不返回。不得记录到普通日志。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/tenants/1234567890123456/workspaces/ws-001/kb/kb-001/assets/asset-001/original/upload-001/source?signature=REDACTED">https://example.com/tenants/1234567890123456/workspaces/ws-001/kb/kb-001/assets/asset-001/original/upload-001/source?signature=REDACTED</a></p>
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
