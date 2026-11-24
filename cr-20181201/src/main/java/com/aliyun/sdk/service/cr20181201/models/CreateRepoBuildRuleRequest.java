// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateRepoBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoBuildRuleRequest</p>
 */
public class CreateRepoBuildRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildArgs")
    private java.util.List<String> buildArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DockerfileLocation")
    private String dockerfileLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DockerfileName")
    private String dockerfileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platforms")
    private java.util.List<String> platforms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoId;

    private CreateRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildArgs = builder.buildArgs;
        this.dockerfileLocation = builder.dockerfileLocation;
        this.dockerfileName = builder.dockerfileName;
        this.imageTag = builder.imageTag;
        this.instanceId = builder.instanceId;
        this.platforms = builder.platforms;
        this.pushName = builder.pushName;
        this.pushType = builder.pushType;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoBuildRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return buildArgs
     */
    public java.util.List<String> getBuildArgs() {
        return this.buildArgs;
    }

    /**
     * @return dockerfileLocation
     */
    public String getDockerfileLocation() {
        return this.dockerfileLocation;
    }

    /**
     * @return dockerfileName
     */
    public String getDockerfileName() {
        return this.dockerfileName;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return platforms
     */
    public java.util.List<String> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return pushName
     */
    public String getPushName() {
        return this.pushName;
    }

    /**
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<CreateRepoBuildRuleRequest, Builder> {
        private String regionId; 
        private java.util.List<String> buildArgs; 
        private String dockerfileLocation; 
        private String dockerfileName; 
        private String imageTag; 
        private String instanceId; 
        private java.util.List<String> platforms; 
        private String pushName; 
        private String pushType; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoBuildRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildArgs = request.buildArgs;
            this.dockerfileLocation = request.dockerfileLocation;
            this.dockerfileName = request.dockerfileName;
            this.imageTag = request.imageTag;
            this.instanceId = request.instanceId;
            this.platforms = request.platforms;
            this.pushName = request.pushName;
            this.pushType = request.pushType;
            this.repoId = request.repoId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The build arguments.</p>
         */
        public Builder buildArgs(java.util.List<String> buildArgs) {
            this.putQueryParameter("BuildArgs", buildArgs);
            this.buildArgs = buildArgs;
            return this;
        }

        /**
         * <p>The Dockerfile path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder dockerfileLocation(String dockerfileLocation) {
            this.putQueryParameter("DockerfileLocation", dockerfileLocation);
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }

        /**
         * <p>The Dockerfile name.</p>
         * 
         * <strong>example:</strong>
         * <p>Dockerfile</p>
         */
        public Builder dockerfileName(String dockerfileName) {
            this.putQueryParameter("DockerfileName", dockerfileName);
            this.dockerfileName = dockerfileName;
            return this;
        }

        /**
         * <p>The image version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.9.5</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The image architecture. Valid values:</p>
         * <ul>
         * <li><p><code>linux/amd64</code></p>
         * </li>
         * <li><p><code>linux/arm64</code></p>
         * </li>
         * <li><p><code>linux/386</code></p>
         * </li>
         * <li><p><code>linux/arm/v7</code></p>
         * </li>
         * <li><p><code>linux/arm/v6</code></p>
         * </li>
         * </ul>
         * <p>Default value: <code>linux/amd64</code>.</p>
         */
        public Builder platforms(java.util.List<String> platforms) {
            this.putQueryParameter("Platforms", platforms);
            this.platforms = platforms;
            return this;
        }

        /**
         * <p>The trigger name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder pushName(String pushName) {
            this.putQueryParameter("PushName", pushName);
            this.pushName = pushName;
            return this;
        }

        /**
         * <p>The push type. Valid values:</p>
         * <ul>
         * <li><p><code>GIT_TAG</code>: Triggered by tag.</p>
         * </li>
         * <li><p><code>GIT_BRANCH</code>: Triggered by branch.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GIT_BRANCH</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * <p>The image repository ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-8dz3aedjqlmk****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public CreateRepoBuildRuleRequest build() {
            return new CreateRepoBuildRuleRequest(this);
        } 

    } 

}
