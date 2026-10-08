// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Version} extends {@link TeaModel}
 *
 * <p>Version</p>
 */
public class Version extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    private Version(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Version create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String lastModifiedTime; 
        private String versionId; 

        private Builder() {
        } 

        private Builder(Version model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.lastModifiedTime = model.lastModifiedTime;
            this.versionId = model.versionId;
        } 

        /**
         * <p>The time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the layer version.</p>
         * 
         * <strong>example:</strong>
         * <p>my version</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the version was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Version build() {
            return new Version(this);
        } 

    } 

}
