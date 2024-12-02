// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateArtifactResponseBody</p>
 */
public class UpdateArtifactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildProperty")
    private String artifactBuildProperty;

    @com.aliyun.core.annotation.NameInMap("ArtifactBuildType")
    private String artifactBuildType;

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

    @com.aliyun.core.annotation.NameInMap("StatusDetail")
    private String statusDetail;

    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private String supportRegionIds;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private UpdateArtifactResponseBody(Builder builder) {
        this.artifactBuildProperty = builder.artifactBuildProperty;
        this.artifactBuildType = builder.artifactBuildType;
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.statusDetail = builder.statusDetail;
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
     * @return artifactBuildProperty
     */
    public String getArtifactBuildProperty() {
        return this.artifactBuildProperty;
    }

    /**
     * @return artifactBuildType
     */
    public String getArtifactBuildType() {
        return this.artifactBuildType;
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
     * @return statusDetail
     */
    public String getStatusDetail() {
        return this.statusDetail;
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
        private String artifactBuildProperty; 
        private String artifactBuildType; 
        private String artifactId; 
        private String artifactProperty; 
        private String artifactType; 
        private String artifactVersion; 
        private String description; 
        private String gmtModified; 
        private String requestId; 
        private String status; 
        private String statusDetail; 
        private String supportRegionIds; 
        private String versionName; 

        /**
         * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;RegionId&quot;:&quot;xxx&quot;, &quot;SourceImageId&quot;:&quot;xxx&quot;, &quot;&quot;:&quot;xxx&quot;, &quot;CommandType&quot;:&quot;xxx&quot;, &quot;CommandContent&quot;:&quot;xxx&quot;}&quot;</p>
         */
        public Builder artifactBuildProperty(String artifactBuildProperty) {
            this.artifactBuildProperty = artifactBuildProperty;
            return this;
        }

        /**
         * ArtifactBuildType.
         */
        public Builder artifactBuildType(String artifactBuildType) {
            this.artifactBuildType = artifactBuildType;
            return this;
        }

        /**
         * <p>The ID of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>The properties of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CommodityCode&quot;:&quot;cmjj0005xxxx&quot;,&quot;CommodityVersion&quot;:&quot;V2022xxxx&quot;}</p>
         */
        public Builder artifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * <p>The type of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsImage</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder artifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * <p>The description of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the deployment package was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:55Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the deployment package. Valid values:</p>
         * <ul>
         * <li>Created: The deployment package is created.</li>
         * <li>Scanning: The deployment package is being scanned.</li>
         * <li>ScanFailed: The deployment package failed to be scanned.</li>
         * <li>Delivering: The deployment package is being distributed.</li>
         * <li>Available: The deployment package is available.</li>
         * <li>Deleted: The deployment package is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusDetail.
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        /**
         * <p>The ID of the region that supports the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *             &quot;cn-beijing&quot;,
         *             &quot;cn-hangzhou&quot;,
         *             &quot;cn-shanghai&quot;
         *         ]</p>
         */
        public Builder supportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * <p>The name of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
