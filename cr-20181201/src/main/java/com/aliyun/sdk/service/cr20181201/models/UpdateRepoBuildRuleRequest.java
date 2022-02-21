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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private UpdateRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.buildRuleId = builder.buildRuleId;
        this.dockerfileLocation = builder.dockerfileLocation;
        this.dockerfileName = builder.dockerfileName;
        this.imageTag = builder.imageTag;
        this.instanceId = builder.instanceId;
        this.platforms = builder.platforms;
        this.pushName = builder.pushName;
        this.pushType = builder.pushType;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<UpdateRepoBuildRuleRequest, Builder> {
        private String buildRuleId; 
        private String dockerfileLocation; 
        private String dockerfileName; 
        private String imageTag; 
        private String instanceId; 
        private java.util.List < String > platforms; 
        private String pushName; 
        private String pushType; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoBuildRuleRequest response) {
            super(response);
            this.buildRuleId = response.buildRuleId;
            this.dockerfileLocation = response.dockerfileLocation;
            this.dockerfileName = response.dockerfileName;
            this.imageTag = response.imageTag;
            this.instanceId = response.instanceId;
            this.platforms = response.platforms;
            this.pushName = response.pushName;
            this.pushType = response.pushType;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
        } 

        /**
         * BuildRuleId.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * DockerfileLocation.
         */
        public Builder dockerfileLocation(String dockerfileLocation) {
            this.putQueryParameter("DockerfileLocation", dockerfileLocation);
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }

        /**
         * DockerfileName.
         */
        public Builder dockerfileName(String dockerfileName) {
            this.putQueryParameter("DockerfileName", dockerfileName);
            this.dockerfileName = dockerfileName;
            return this;
        }

        /**
         * ImageTag.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Platforms.
         */
        public Builder platforms(java.util.List < String > platforms) {
            this.putQueryParameter("Platforms", platforms);
            this.platforms = platforms;
            return this;
        }

        /**
         * PushName.
         */
        public Builder pushName(String pushName) {
            this.putQueryParameter("PushName", pushName);
            this.pushName = pushName;
            return this;
        }

        /**
         * PushType.
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
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
         * RepoId.
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
