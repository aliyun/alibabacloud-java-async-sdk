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
 * {@link CreateArtifactRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactRequest</p>
 */
public class CreateArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildProperty")
    private ArtifactBuildProperty artifactBuildProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildType")
    private String artifactBuildType;

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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    private java.util.List<String> supportRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    private CreateArtifactRequest(Builder builder) {
        super(builder);
        this.artifactBuildProperty = builder.artifactBuildProperty;
        this.artifactBuildType = builder.artifactBuildType;
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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
        private String artifactBuildType; 
        private String artifactId; 
        private ArtifactProperty artifactProperty; 
        private String artifactType; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String resourceGroupId; 
        private java.util.List<String> supportRegionIds; 
        private java.util.List<Tag> tag; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactRequest request) {
            super(request);
            this.artifactBuildProperty = request.artifactBuildProperty;
            this.artifactBuildType = request.artifactBuildType;
            this.artifactId = request.artifactId;
            this.artifactProperty = request.artifactProperty;
            this.artifactType = request.artifactType;
            this.clientToken = request.clientToken;
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
         * <p>The type of the artifact build task. Valid values:</p>
         * <ul>
         * <li><p>EcsImage: Build ECS (Elastic Container Service) image.</p>
         * </li>
         * <li><p>Dockerfile: Build container image based on Dockerfile.</p>
         * </li>
         * <li><p>Buildpacks: Build container image based on Buildpacks.</p>
         * </li>
         * <li><p>ContainerImage: Rebuild container image by renaming an existing container image.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dockerfile</p>
         */
        public Builder artifactBuildType(String artifactBuildType) {
            this.putQueryParameter("ArtifactBuildType", artifactBuildType);
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
        public Builder supportRegionIds(java.util.List<String> supportRegionIds) {
            this.putQueryParameter("SupportRegionIds", supportRegionIds);
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
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
    public static class BuildArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgumentName")
        private String argumentName;

        @com.aliyun.core.annotation.NameInMap("ArgumentValue")
        private String argumentValue;

        private BuildArgs(Builder builder) {
            this.argumentName = builder.argumentName;
            this.argumentValue = builder.argumentValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildArgs create() {
            return builder().build();
        }

        /**
         * @return argumentName
         */
        public String getArgumentName() {
            return this.argumentName;
        }

        /**
         * @return argumentValue
         */
        public String getArgumentValue() {
            return this.argumentValue;
        }

        public static final class Builder {
            private String argumentName; 
            private String argumentValue; 

            /**
             * <p>The name of a specific build argument.</p>
             * 
             * <strong>example:</strong>
             * <p>ENV</p>
             */
            public Builder argumentName(String argumentName) {
                this.argumentName = argumentName;
                return this;
            }

            /**
             * <p>The value of a specific build argument.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx:latest</p>
             */
            public Builder argumentValue(String argumentValue) {
                this.argumentValue = argumentValue;
                return this;
            }

            public BuildArgs build() {
                return new BuildArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateArtifactRequest} extends {@link TeaModel}
     *
     * <p>CreateArtifactRequest</p>
     */
    public static class CodeRepo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private Long repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        private CodeRepo(Builder builder) {
            this.branch = builder.branch;
            this.endpoint = builder.endpoint;
            this.orgId = builder.orgId;
            this.owner = builder.owner;
            this.platform = builder.platform;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeRepo create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return repoId
         */
        public Long getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        public static final class Builder {
            private String branch; 
            private String endpoint; 
            private String orgId; 
            private String owner; 
            private String platform; 
            private Long repoId; 
            private String repoName; 

            /**
             * <p>The name of the branch in the code repository.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The owner of the code repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the git repository is private.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aliyun-computenest</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The platform type. Valid values: </p>
             * <ul>
             * <li><p>github</p>
             * </li>
             * <li><p>gitee</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>github</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(Long repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the repository.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-computenest/quickstart-Lobexxx</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            public CodeRepo build() {
                return new CodeRepo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateArtifactRequest} extends {@link TeaModel}
     *
     * <p>CreateArtifactRequest</p>
     */
    public static class ArtifactBuildProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildArgs")
        private java.util.List<BuildArgs> buildArgs;

        @com.aliyun.core.annotation.NameInMap("CodeRepo")
        private CodeRepo codeRepo;

        @com.aliyun.core.annotation.NameInMap("CommandContent")
        private String commandContent;

        @com.aliyun.core.annotation.NameInMap("CommandType")
        private String commandType;

        @com.aliyun.core.annotation.NameInMap("DockerfilePath")
        private String dockerfilePath;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceContainerImage")
        private String sourceContainerImage;

        @com.aliyun.core.annotation.NameInMap("SourceImageId")
        private String sourceImageId;

        private ArtifactBuildProperty(Builder builder) {
            this.buildArgs = builder.buildArgs;
            this.codeRepo = builder.codeRepo;
            this.commandContent = builder.commandContent;
            this.commandType = builder.commandType;
            this.dockerfilePath = builder.dockerfilePath;
            this.regionId = builder.regionId;
            this.sourceContainerImage = builder.sourceContainerImage;
            this.sourceImageId = builder.sourceImageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactBuildProperty create() {
            return builder().build();
        }

        /**
         * @return buildArgs
         */
        public java.util.List<BuildArgs> getBuildArgs() {
            return this.buildArgs;
        }

        /**
         * @return codeRepo
         */
        public CodeRepo getCodeRepo() {
            return this.codeRepo;
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
         * @return dockerfilePath
         */
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceContainerImage
         */
        public String getSourceContainerImage() {
            return this.sourceContainerImage;
        }

        /**
         * @return sourceImageId
         */
        public String getSourceImageId() {
            return this.sourceImageId;
        }

        public static final class Builder {
            private java.util.List<BuildArgs> buildArgs; 
            private CodeRepo codeRepo; 
            private String commandContent; 
            private String commandType; 
            private String dockerfilePath; 
            private String regionId; 
            private String sourceContainerImage; 
            private String sourceImageId; 

            /**
             * <p>The build arguments used during the image build process.</p>
             * <blockquote>
             * <p> This parameter is available only if the ArtifactBuildType is Dockerfile type.</p>
             * </blockquote>
             */
            public Builder buildArgs(java.util.List<BuildArgs> buildArgs) {
                this.buildArgs = buildArgs;
                return this;
            }

            /**
             * <p>The address of the code repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the ArtifactBuildType is Dockerfile or Buildpacks type.</p>
             * </blockquote>
             */
            public Builder codeRepo(CodeRepo codeRepo) {
                this.codeRepo = codeRepo;
                return this;
            }

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
             * <p>The relative path to the Dockerfile within the code repository.</p>
             * <blockquote>
             * <p> This parameter is available only if the ArtifactBuildType is Dockerfile type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>./file/Dockerfile</p>
             */
            public Builder dockerfilePath(String dockerfilePath) {
                this.dockerfilePath = dockerfilePath;
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
             * <p>The pull location of the source container image. This is used for the command docker pull ${SourceContainerImage}.</p>
             * <blockquote>
             * <p> This parameter is available only if the ArtifactBuildType is ContainerImage type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pytorch/pytorch:2.5.1-cuda12.4-cudnn9-devel</p>
             */
            public Builder sourceContainerImage(String sourceContainerImage) {
                this.sourceContainerImage = sourceContainerImage;
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

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ArtifactProperty(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityVersion = builder.commodityVersion;
            this.imageId = builder.imageId;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoType = builder.repoType;
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
            private String imageId; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoType; 
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
             * <p>The default repository type. Valid values:</p>
             * <ul>
             * <li><code>Public</code>: a public repository.</li>
             * <li><code>Private</code>: a private repository.</li>
             * </ul>
             * <p>You can specify the RepoType or Summary parameter. The RepoType parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
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
