// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateArtifactRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactRequest</p>
 */
public class CreateArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildProperty")
    private ArtifactBuildProperty artifactBuildProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactProperty")
    private ArtifactProperty artifactProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private java.util.List < String > supportRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    private CreateArtifactRequest(Builder builder) {
        super(builder);
        this.artifactBuildProperty = builder.artifactBuildProperty;
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.description = builder.description;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.supportRegionIds = builder.supportRegionIds;
        this.tag = builder.tag;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactBuildProperty
     */
    public ArtifactBuildProperty getArtifactBuildProperty() {
        return this.artifactBuildProperty;
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
    public ArtifactProperty getArtifactProperty() {
        return this.artifactProperty;
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return supportRegionIds
     */
    public java.util.List < String > getSupportRegionIds() {
        return this.supportRegionIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<CreateArtifactRequest, Builder> {
        private ArtifactBuildProperty artifactBuildProperty; 
        private String artifactId; 
        private ArtifactProperty artifactProperty; 
        private String artifactType; 
        private String description; 
        private String name; 
        private String resourceGroupId; 
        private java.util.List < String > supportRegionIds; 
        private java.util.List < Tag> tag; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactRequest request) {
            super(request);
            this.artifactBuildProperty = request.artifactBuildProperty;
            this.artifactId = request.artifactId;
            this.artifactProperty = request.artifactProperty;
            this.artifactType = request.artifactType;
            this.description = request.description;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.supportRegionIds = request.supportRegionIds;
            this.tag = request.tag;
            this.versionName = request.versionName;
        } 

        /**
         * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
         */
        public Builder artifactBuildProperty(ArtifactBuildProperty artifactBuildProperty) {
            String artifactBuildPropertyShrink = shrink(artifactBuildProperty, "ArtifactBuildProperty", "json");
            this.putQueryParameter("ArtifactBuildProperty", artifactBuildPropertyShrink);
            this.artifactBuildProperty = artifactBuildProperty;
            return this;
        }

        /**
         * <p>The ID of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>The properties of the deployment object.</p>
         */
        public Builder artifactProperty(ArtifactProperty artifactProperty) {
            String artifactPropertyShrink = shrink(artifactProperty, "ArtifactProperty", "json");
            this.putQueryParameter("ArtifactProperty", artifactPropertyShrink);
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * <p>The type of the deployment package. Valid values:</p>
         * <ul>
         * <li>EcsImage: Elastic Compute Service (ECS) image.</li>
         * <li>AcrImage: container image.</li>
         * <li>File: Object Storage Service (OSS) object.</li>
         * <li>Script: script.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsImage</p>
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The description of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>Test artifact</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the deployment package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzkt5buxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The supported regions.</p>
         */
        public Builder supportRegionIds(java.util.List < String > supportRegionIds) {
            this.putQueryParameter("SupportRegionIds", supportRegionIds);
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The version name of the deployment package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreateArtifactRequest build() {
            return new CreateArtifactRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateArtifactRequest} extends {@link TeaModel}
     *
     * <p>CreateArtifactRequest</p>
     */
    public static class ArtifactBuildProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandContent")
        private String commandContent;

        @com.aliyun.core.annotation.NameInMap("CommandType")
        private String commandType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceImageId")
        private String sourceImageId;

        private ArtifactBuildProperty(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandType = builder.commandType;
            this.regionId = builder.regionId;
            this.sourceImageId = builder.sourceImageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactBuildProperty create() {
            return builder().build();
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return commandType
         */
        public String getCommandType() {
            return this.commandType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceImageId
         */
        public String getSourceImageId() {
            return this.sourceImageId;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandType; 
            private String regionId; 
            private String sourceImageId; 

            /**
             * <p>The command content.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a ecs image type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>echo &quot;start run command&quot;</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The command type. Valid values:</p>
             * <ul>
             * <li>RunBatScript: batch command, applicable to Windows instances.</li>
             * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
             * <li>RunShellScript: shell command, applicable to Linux instances.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a ecs image type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RunShellScript</p>
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * <p>The region ID where the source mirror image is located.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a ecs image type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The source image id. Supported Types:</p>
             * <ul>
             * <li><p>Image ID: Pass the Image ID of the Ecs image directly.</p>
             * </li>
             * <li><p>OOS Common Parameter Name: Obtain the corresponding Image ID automatically by using the OOS common parameter name.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a ecs image type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Image ID：m-t4nhenrdc38pe4*****
             * ubuntu_22_04_x64_20G_alibase_20240926.vhd
             * OOS Common Parameter Name：aliyun/services/computenest/images/aliyun_3_2104_python_3_11</p>
             */
            public Builder sourceImageId(String sourceImageId) {
                this.sourceImageId = sourceImageId;
                return this;
            }

            public ArtifactBuildProperty build() {
                return new ArtifactBuildProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateArtifactRequest} extends {@link TeaModel}
     *
     * <p>CreateArtifactRequest</p>
     */
    public static class ArtifactProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityVersion")
        private String commodityVersion;

        @com.aliyun.core.annotation.NameInMap("FileScriptMetadata")
        private String fileScriptMetadata;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("ScriptMetadata")
        private String scriptMetadata;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ArtifactProperty(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityVersion = builder.commodityVersion;
            this.fileScriptMetadata = builder.fileScriptMetadata;
            this.imageId = builder.imageId;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoType = builder.repoType;
            this.scriptMetadata = builder.scriptMetadata;
            this.tag = builder.tag;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactProperty create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityVersion
         */
        public String getCommodityVersion() {
            return this.commodityVersion;
        }

        /**
         * @return fileScriptMetadata
         */
        public String getFileScriptMetadata() {
            return this.fileScriptMetadata;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return scriptMetadata
         */
        public String getScriptMetadata() {
            return this.scriptMetadata;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityVersion; 
            private String fileScriptMetadata; 
            private String imageId; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoType; 
            private String scriptMetadata; 
            private String tag; 
            private String url; 

            /**
             * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is an image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cmjj00xxxx</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity version of the service in Alibaba Cloud Marketplace.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is an image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>V1.0</p>
             */
            public Builder commodityVersion(String commodityVersion) {
                this.commodityVersion = commodityVersion;
                return this;
            }

            /**
             * <p>The script metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;WorkDir&quot;:&quot;/root&quot;,&quot;CommandType&quot;:&quot;RunShellScript&quot;,&quot;Platform&quot;:&quot;Linux&quot;,&quot;Script&quot;:&quot;echo hello&quot;}</p>
             */
            public Builder fileScriptMetadata(String fileScriptMetadata) {
                this.fileScriptMetadata = fileScriptMetadata;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is an image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>m-0xij191j9cuev6xxxxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is an image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>crr-d8o1nponyc2t1gcg</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>wordpress</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoType.
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>The script content.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a script.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ScriptMetadata&quot;:&quot;{&quot;CommandType&quot;:&quot;RunShellScript&quot;,&quot;Platform&quot;:&quot;Linux&quot;,&quot;Script&quot;:&quot;ls&quot;}&quot;}</p>
             */
            public Builder scriptMetadata(String scriptMetadata) {
                this.scriptMetadata = scriptMetadata;
                return this;
            }

            /**
             * <p>The version tag of the image repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The object URL of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ArtifactProperty build() {
                return new ArtifactProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateArtifactRequest} extends {@link TeaModel}
     *
     * <p>CreateArtifactRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
