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
         * expiresAt.
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * sourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * uploadUrl.
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
