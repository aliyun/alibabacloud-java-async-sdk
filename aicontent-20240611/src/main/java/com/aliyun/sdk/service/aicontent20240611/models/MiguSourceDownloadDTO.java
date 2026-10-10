// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link MiguSourceDownloadDTO} extends {@link TeaModel}
 *
 * <p>MiguSourceDownloadDTO</p>
 */
public class MiguSourceDownloadDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    private MiguSourceDownloadDTO(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.expiresAt = builder.expiresAt;
        this.method = builder.method;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MiguSourceDownloadDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String expiresAt; 
        private String method; 
        private String sourceId; 

        private Builder() {
        } 

        private Builder(MiguSourceDownloadDTO model) {
            this.downloadUrl = model.downloadUrl;
            this.expiresAt = model.expiresAt;
            this.method = model.method;
            this.sourceId = model.sourceId;
        } 

        /**
         * <p>The OSS pre-signed download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&Signature=xxx">https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&amp;Signature=xxx</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the download URL, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-28T12:00:00Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The download request method. The value is fixed to GET.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The unique identifier of the source file.</p>
         * 
         * <strong>example:</strong>
         * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public MiguSourceDownloadDTO build() {
            return new MiguSourceDownloadDTO(this);
        } 

    } 

}
