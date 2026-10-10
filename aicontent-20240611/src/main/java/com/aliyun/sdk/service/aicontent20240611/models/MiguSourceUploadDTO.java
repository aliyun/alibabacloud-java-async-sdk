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
 * {@link MiguSourceUploadDTO} extends {@link TeaModel}
 *
 * <p>MiguSourceUploadDTO</p>
 */
public class MiguSourceUploadDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("fileType")
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("uploadUrl")
    private String uploadUrl;

    private MiguSourceUploadDTO(Builder builder) {
        this.expiresAt = builder.expiresAt;
        this.fileType = builder.fileType;
        this.sourceId = builder.sourceId;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MiguSourceUploadDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder {
        private String expiresAt; 
        private String fileType; 
        private String sourceId; 
        private String uploadUrl; 

        private Builder() {
        } 

        private Builder(MiguSourceUploadDTO model) {
            this.expiresAt = model.expiresAt;
            this.fileType = model.fileType;
            this.sourceId = model.sourceId;
            this.uploadUrl = model.uploadUrl;
        } 

        /**
         * <p>The expiration time of the upload URL in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-28T12:00:00Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The type of the source file (uppercase). Valid values: VIDEO, IMAGE, AUDIO, and TEXT.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO</p>
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The unique identifier of the source file, used for subsequent generation tasks and downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The OSS pre-signed upload URL. Use the PUT method to upload the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&Signature=xxx">https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&amp;Signature=xxx</a></p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public MiguSourceUploadDTO build() {
            return new MiguSourceUploadDTO(this);
        } 

    } 

}
