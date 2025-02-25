// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoBuildRuleRequest</p>
 */
public class UpdateRepoBuildRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildArgs")
    private java.util.List < String > buildArgs;

    @Query
    @NameInMap("BuildRuleId")
    @Validation(required = true)
    private String buildRuleId;

    @Query
    @NameInMap("DockerfileLocation")
    private String dockerfileLocation;

    @Query
    @NameInMap("DockerfileName")
    private String dockerfileName;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Platforms")
    private java.util.List < String > platforms;

    @Query
    @NameInMap("PushName")
    private String pushName;

    @Query
    @NameInMap("PushType")
    private String pushType;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private UpdateRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildArgs = builder.buildArgs;
        this.buildRuleId = builder.buildRuleId;
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

    public static UpdateRepoBuildRuleRequest create() {
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
    public java.util.List < String > getBuildArgs() {
        return this.buildArgs;
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
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
    public java.util.List < String > getPlatforms() {
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

    public static final class Builder extends Request.Builder<UpdateRepoBuildRuleRequest, Builder> {
        private String regionId; 
        private java.util.List < String > buildArgs; 
        private String buildRuleId; 
        private String dockerfileLocation; 
        private String dockerfileName; 
        private String imageTag; 
        private String instanceId; 
        private java.util.List < String > platforms; 
        private String pushName; 
        private String pushType; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoBuildRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildArgs = request.buildArgs;
            this.buildRuleId = request.buildRuleId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Building arguments.
         */
        public Builder buildArgs(java.util.List < String > buildArgs) {
            this.putQueryParameter("BuildArgs", buildArgs);
            this.buildArgs = buildArgs;
            return this;
        }

        /**
         * The ID of the building rule.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * The path of the Dockerfile.
         */
        public Builder dockerfileLocation(String dockerfileLocation) {
            this.putQueryParameter("DockerfileLocation", dockerfileLocation);
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }

        /**
         * The name of the Dockerfile.
         */
        public Builder dockerfileName(String dockerfileName) {
            this.putQueryParameter("DockerfileName", dockerfileName);
            this.dockerfileName = dockerfileName;
            return this;
        }

        /**
         * The tag of the image.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Architecture for image building. Valid values:
         * <p>
         * 
         * *   `linux/amd64`
         * *   `linux/arm64`
         * *   `linux/386`
         * *   `linux/arm/v7`
         * *   `linux/arm/v6`
         * 
         * Default value: `linux/amd64`
         */
        public Builder platforms(java.util.List < String > platforms) {
            this.putQueryParameter("Platforms", platforms);
            this.platforms = platforms;
            return this;
        }

        /**
         * The name of the push that triggers the building rule.
         */
        public Builder pushName(String pushName) {
            this.putQueryParameter("PushName", pushName);
            this.pushName = pushName;
            return this;
        }

        /**
         * The type of the push that triggers the building rule. Valid values:
         * <p>
         * 
         * *   `GIT_TAG`: tag push
         * *   `GIT_BRANCH`: branch push
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * The ID of the image repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public UpdateRepoBuildRuleRequest build() {
            return new UpdateRepoBuildRuleRequest(this);
        } 

    } 

}
