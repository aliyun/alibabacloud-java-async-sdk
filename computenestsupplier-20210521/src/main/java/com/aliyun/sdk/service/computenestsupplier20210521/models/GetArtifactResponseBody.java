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
 * {@link GetArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactResponseBody</p>
 */
public class GetArtifactResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("MaxVersion")
    private Long maxVersion;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PermissionType")
    private String permissionType;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private String progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusDetail")
    private String statusDetail;

    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private String supportRegionIds;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetArtifactResponseBody(Builder builder) {
        this.artifactBuildProperty = builder.artifactBuildProperty;
        this.artifactBuildType = builder.artifactBuildType;
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.maxVersion = builder.maxVersion;
        this.name = builder.name;
        this.permissionType = builder.permissionType;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.statusDetail = builder.statusDetail;
        this.supportRegionIds = builder.supportRegionIds;
        this.tags = builder.tags;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return permissionType
     */
    public String getPermissionType() {
        return this.permissionType;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private Long maxVersion; 
        private String name; 
        private String permissionType; 
        private String progress; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String statusDetail; 
        private String supportRegionIds; 
        private java.util.List<Tags> tags; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(GetArtifactResponseBody model) {
            this.artifactBuildProperty = model.artifactBuildProperty;
            this.artifactBuildType = model.artifactBuildType;
            this.artifactId = model.artifactId;
            this.artifactProperty = model.artifactProperty;
            this.artifactType = model.artifactType;
            this.artifactVersion = model.artifactVersion;
            this.description = model.description;
            this.gmtModified = model.gmtModified;
            this.maxVersion = model.maxVersion;
            this.name = model.name;
            this.permissionType = model.permissionType;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.statusDetail = model.statusDetail;
            this.supportRegionIds = model.supportRegionIds;
            this.tags = model.tags;
            this.versionName = model.versionName;
        } 

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
         * <p>The type of the deployment package to be built.</p>
         * 
         * <strong>example:</strong>
         * <p>Dockerfile</p>
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
         * <p>The latest version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxVersion(Long maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * <p>The name of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Permission fields are applicable to container image artifact and Helm Chart artifact They can only change from Automatic to Public. Options:</p>
         * <ul>
         * <li>Public</li>
         * <li>Automatic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder permissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }

        /**
         * <p>The distribution progress of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(String progress) {
            this.progress = progress;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzkt5buxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the deployment package. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The description of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;/usr/local/share/aliyun-assist/work/script/t-hz04zm90y6og0sg.sh: line 1: pip: command not found&quot;</p>
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        /**
         * <p>The ID of the region that supports the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou&quot;,&quot;cn-beijing&quot;]</p>
         */
        public Builder supportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * <p>The tags of the deployment package.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The version name of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetArtifactResponseBody build() {
            return new GetArtifactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArtifactResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
