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
 * {@link ResolveWorkItemArtifactAccessResponseBody} extends {@link TeaModel}
 *
 * <p>ResolveWorkItemArtifactAccessResponseBody</p>
 */
public class ResolveWorkItemArtifactAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ResolveWorkItemArtifactAccessResponseBody(Builder builder) {
        this.code = builder.code;
        this.downloadUrl = builder.downloadUrl;
        this.expiresAt = builder.expiresAt;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResolveWorkItemArtifactAccessResponseBody create() {
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
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
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
        private String code; 
        private String downloadUrl; 
        private String expiresAt; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResolveWorkItemArtifactAccessResponseBody model) {
            this.code = model.code;
            this.downloadUrl = model.downloadUrl;
            this.expiresAt = model.expiresAt;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The short-term signed download URL of the artifact. You can send a GET request directly to this URL before it expires.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the URL in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResolveWorkItemArtifactAccessResponseBody build() {
            return new ResolveWorkItemArtifactAccessResponseBody(this);
        } 

    } 

}
