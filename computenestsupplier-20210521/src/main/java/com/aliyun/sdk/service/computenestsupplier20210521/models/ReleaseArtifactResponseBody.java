// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseArtifactResponseBody</p>
 */
public class ReleaseArtifactResponseBody extends TeaModel {
    @NameInMap("ArtifactId")
    private String artifactId;

    @NameInMap("ArtifactProperty")
    private String artifactProperty;

    @NameInMap("ArtifactType")
    private String artifactType;

    @NameInMap("ArtifactVersion")
    private String artifactVersion;

    @NameInMap("Description")
    private String description;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("VersionName")
    private String versionName;

    private ReleaseArtifactResponseBody(Builder builder) {
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseArtifactResponseBody create() {
        return builder().build();
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return artifactProperty
     */
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return artifactVersion
     */
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String artifactId; 
        private String artifactProperty; 
        private String artifactType; 
        private String artifactVersion; 
        private String description; 
        private String gmtModified; 
        private String requestId; 
        private String status; 
        private String versionName; 

        /**
         * ArtifactId.
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * ArtifactProperty.
         */
        public Builder artifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * ArtifactType.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * ArtifactVersion.
         */
        public Builder artifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
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
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public ReleaseArtifactResponseBody build() {
            return new ReleaseArtifactResponseBody(this);
        } 

    } 

}
