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
         * ArtifactRef.
         */
        public Builder artifactRef(String artifactRef) {
            this.artifactRef = artifactRef;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Version.
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
