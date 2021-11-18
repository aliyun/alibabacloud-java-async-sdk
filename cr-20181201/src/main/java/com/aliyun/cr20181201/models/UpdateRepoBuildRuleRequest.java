// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateRepoBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoBuildRuleRequest</p>
 */
public class UpdateRepoBuildRuleRequest extends Request {
    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("DockerfileLocation")
    private String dockerfileLocation;

    @Query
    @NameInMap("BuildRuleId")
    private String buildRuleId;

    @Query
    @NameInMap("PushName")
    private String pushName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("DockerfileName")
    private String dockerfileName;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("PushType")
    private String pushType;


    private UpdateRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.repoId = builder.repoId;
        this.dockerfileLocation = builder.dockerfileLocation;
        this.buildRuleId = builder.buildRuleId;
        this.pushName = builder.pushName;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.dockerfileName = builder.dockerfileName;
        this.imageTag = builder.imageTag;
        this.pushType = builder.pushType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoBuildRuleRequest create() {
        return builder().build();
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return dockerfileLocation
     */
    public String getDockerfileLocation() {
        return this.dockerfileLocation;
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    /**
     * @return pushName
     */
    public String getPushName() {
        return this.pushName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    public static final class Builder extends Request.Builder {
        private String repoId; 
        private String dockerfileLocation; 
        private String buildRuleId; 
        private String pushName; 
        private String regionId; 
        private String instanceId; 
        private String dockerfileName; 
        private String imageTag; 
        private String pushType; 

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Dockerfile position</p>
         */
        public Builder dockerfileLocation(String dockerfileLocation) {
            this.putQueryParameter("DockerfileLocation", dockerfileLocation);
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }

        /**
         * <p>Build Rules ID</p>
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * <p>Trigger name</p>
         */
        public Builder pushName(String pushName) {
            this.putQueryParameter("PushName", pushName);
            this.pushName = pushName;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Dockerfile name</p>
         */
        public Builder dockerfileName(String dockerfileName) {
            this.putQueryParameter("DockerfileName", dockerfileName);
            this.dockerfileName = dockerfileName;
            return this;
        }

        /**
         * <p>Image version</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>The push type. Valid values:

-"Git_tag": TAG triggered

-"Git_branch ": Branch trigger</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        public UpdateRepoBuildRuleRequest build() {
            return new UpdateRepoBuildRuleRequest(this);
        } 

    } 

}
