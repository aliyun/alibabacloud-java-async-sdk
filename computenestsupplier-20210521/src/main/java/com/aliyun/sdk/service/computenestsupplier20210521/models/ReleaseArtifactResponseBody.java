// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ReleaseArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseArtifactResponseBody</p>
 */
public class ReleaseArtifactResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("VersionName")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ReleaseArtifactResponseBody model) {
            this.artifactId = model.artifactId;
            this.artifactProperty = model.artifactProperty;
            this.artifactType = model.artifactType;
            this.artifactVersion = model.artifactVersion;
            this.description = model.description;
            this.gmtModified = model.gmtModified;
            this.requestId = model.requestId;
            this.status = model.status;
            this.versionName = model.versionName;
        } 

        /**
         * <p>The ID of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-9feded91880e4c78xxxx</p>
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>The content of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;Url&quot;:&quot;<a href="https://computenest-artifacts-draft-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/130920852836xxxx/cn-hangzhou/service-8072a04e5a134382xxxx/165095355xxxx/changes.txt%5C%22,%5C%22ConfigurationMetadata%5C%22:%5C%22%7B%5C%5C%5C%22WorkDir%5C%5C%5C%22:%5C%5C%5C%22/root%5C%5C%5C%22,%5C%5C%5C%22Platform%5C%5C%5C%22:%5C%5C%5C%22Linux%5C%5C%5C%22,%5C%5C%5C%22CommandType%5C%5C%5C%22:%5C%5C%5C%22RunShellScript%5C%5C%5C%22,%5C%5C%5C%22UpgradeScript%5C%5C%5C%22:%5C%5C%5C%22cd">https://computenest-artifacts-draft-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/130920852836xxxx/cn-hangzhou/service-8072a04e5a134382xxxx/165095355xxxx/changes.txt\&quot;,\&quot;ConfigurationMetadata\&quot;:\&quot;{\\\&quot;WorkDir\\\&quot;:\\\&quot;/root\\\&quot;,\\\&quot;Platform\\\&quot;:\\\&quot;Linux\\\&quot;,\\\&quot;CommandType\\\&quot;:\\\&quot;RunShellScript\\\&quot;,\\\&quot;UpgradeScript\\\&quot;:\\\&quot;cd</a> /root\\ncp changes.txt cpchanges.txt\\nmv changes.txt mvchangge.txt\&quot;}&quot;}&quot;</p>
         */
        public Builder artifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * <p>The type of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The version of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder artifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * <p>The description of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the artifact was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1650954178000</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3818BA7D-3F50-1A44-9FF3-04A52A59XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the artifact. Valid values:</p>
         * <ul>
         * <li>Created: The artifact is created.</li>
         * <li>Scanning: The artifact is being scanned.</li>
         * <li>ScanFailed: The artifact failed to be scanned.</li>
         * <li>Delivering: The artifact is being distributed.</li>
         * <li>Available: The artifact is available.</li>
         * <li>Deleted: The artifact is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The version name of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>V1.0</p>
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
