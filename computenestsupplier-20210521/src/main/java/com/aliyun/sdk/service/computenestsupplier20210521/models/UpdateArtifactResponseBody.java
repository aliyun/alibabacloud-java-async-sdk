// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateArtifactResponseBody</p>
 */
public class UpdateArtifactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("ArtifactProperty")
    private String artifactProperty;

    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
    private String artifactVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private String supportRegionIds;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private UpdateArtifactResponseBody(Builder builder) {
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supportRegionIds = builder.supportRegionIds;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateArtifactResponseBody create() {
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
     * @return supportRegionIds
     */
    public String getSupportRegionIds() {
        return this.supportRegionIds;
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
        private String supportRegionIds; 
        private String versionName; 

        /**
         * The ID of the deployment package.
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * The properties of the deployment package.
         */
        public Builder artifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * The type of the deployment package.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * The version of the deployment package.
         */
        public Builder artifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * The description of the deployment package.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time when the deployment package was modified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the deployment package. Valid values:
         * <p>
         * 
         * *   Created: The deployment package is created.
         * *   Scanning: The deployment package is being scanned.
         * *   ScanFailed: The deployment package failed to be scanned.
         * *   Delivering: The deployment package is being distributed.
         * *   Available: The deployment package is available.
         * *   Deleted: The deployment package is deleted.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ID of the region that supports the deployment package.
         */
        public Builder supportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * The name of the deployment package.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public UpdateArtifactResponseBody build() {
            return new UpdateArtifactResponseBody(this);
        } 

    } 

}
