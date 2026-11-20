// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ArtifactRelease} extends {@link TeaModel}
 *
 * <p>ArtifactRelease</p>
 */
public class ArtifactRelease extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactRef")
    private String artifactRef;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private ArtifactRelease(Builder builder) {
        this.artifactRef = builder.artifactRef;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.image = builder.image;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactRelease create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactRef
     */
    public String getArtifactRef() {
        return this.artifactRef;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String artifactRef; 
        private String createdAt; 
        private String description; 
        private String image; 
        private String type; 
        private String version; 

        private Builder() {
        } 

        private Builder(ArtifactRelease model) {
            this.artifactRef = model.artifactRef;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.image = model.image;
            this.type = model.type;
            this.version = model.version;
        } 

        /**
         * <p>The artifact reference name.</p>
         * 
         * <strong>example:</strong>
         * <p>python-env</p>
         */
        public Builder artifactRef(String artifactRef) {
            this.artifactRef = artifactRef;
            return this;
        }

        /**
         * <p>The creation time of the artifact release record.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The artifact description.</p>
         * 
         * <strong>example:</strong>
         * <p>Container image for model inference</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The container image address used by the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The artifact version.</p>
         * 
         * <strong>example:</strong>
         * <p>V2.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ArtifactRelease build() {
            return new ArtifactRelease(this);
        } 

    } 

}
