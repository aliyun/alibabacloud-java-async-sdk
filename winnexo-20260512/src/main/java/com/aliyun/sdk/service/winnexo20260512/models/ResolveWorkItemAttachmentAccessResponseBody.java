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
 * {@link ResolveWorkItemAttachmentAccessResponseBody} extends {@link TeaModel}
 *
 * <p>ResolveWorkItemAttachmentAccessResponseBody</p>
 */
public class ResolveWorkItemAttachmentAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessUrl")
    private String accessUrl;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ResolveWorkItemAttachmentAccessResponseBody(Builder builder) {
        this.accessUrl = builder.accessUrl;
        this.code = builder.code;
        this.expiresAt = builder.expiresAt;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResolveWorkItemAttachmentAccessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessUrl
     */
    public String getAccessUrl() {
        return this.accessUrl;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
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

    public static final class Builder {
        private String accessUrl; 
        private String code; 
        private String expiresAt; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResolveWorkItemAttachmentAccessResponseBody model) {
            this.accessUrl = model.accessUrl;
            this.code = model.code;
            this.expiresAt = model.expiresAt;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>附件短期预览地址，过期前可直接 GET</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder accessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>地址过期时间(ISO8601)</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResolveWorkItemAttachmentAccessResponseBody build() {
            return new ResolveWorkItemAttachmentAccessResponseBody(this);
        } 

    } 

}
