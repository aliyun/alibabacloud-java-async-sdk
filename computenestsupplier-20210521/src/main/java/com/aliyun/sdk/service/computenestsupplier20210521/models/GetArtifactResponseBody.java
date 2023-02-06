// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactResponseBody</p>
 */
public class GetArtifactResponseBody extends TeaModel {
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

    @NameInMap("MaxVersion")
    private Long maxVersion;

    @NameInMap("Name")
    private String name;

    @NameInMap("Progress")
    private String progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("SupportRegionIds")
    private String supportRegionIds;

    @NameInMap("VersionName")
    private String versionName;

    private GetArtifactResponseBody(Builder builder) {
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.maxVersion = builder.maxVersion;
        this.name = builder.name;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supportRegionIds = builder.supportRegionIds;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactResponseBody create() {
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
     * @return maxVersion
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return this.progress;
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
        private Long maxVersion; 
        private String name; 
        private String progress; 
        private String requestId; 
        private String status; 
        private String supportRegionIds; 
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
         * MaxVersion.
         */
        public Builder maxVersion(Long maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(String progress) {
            this.progress = progress;
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
         * SupportRegionIds.
         */
        public Builder supportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetArtifactResponseBody build() {
            return new GetArtifactResponseBody(this);
        } 

    } 

}
