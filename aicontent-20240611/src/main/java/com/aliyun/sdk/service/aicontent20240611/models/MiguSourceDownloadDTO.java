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
         * downloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * expiresAt.
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * sourceId.
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
