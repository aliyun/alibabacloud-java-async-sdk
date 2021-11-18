// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoBuildRuleRequest</p>
 */
public class CreateRepoBuildRuleRequest extends Request {
    @Query
    @NameInMap("DockerfileLocation")
    private String dockerfileLocation;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("DockerfileName")
    private String dockerfileName;

    @Query
    @NameInMap("PushName")
    private String pushName;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("PushType")
    private String pushType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private CreateRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.dockerfileLocation = builder.dockerfileLocation;
        this.imageTag = builder.imageTag;
        this.dockerfileName = builder.dockerfileName;
        this.pushName = builder.pushName;
        this.repoId = builder.repoId;
        this.pushType = builder.pushType;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoBuildRuleRequest create() {
        return builder().build();
    }

    /**
     * @return dockerfileLocation
     */
    public String getDockerfileLocation() {
        return this.dockerfileLocation;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return dockerfileName
     */
    public String getDockerfileName() {
        return this.dockerfileName;
    }

    /**
     * @return pushName
     */
    public String getPushName() {
        return this.pushName;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder {
        private String dockerfileLocation; 
        private String imageTag; 
        private String dockerfileName; 
        private String pushName; 
        private String repoId; 
        private String pushType; 
        private String regionId; 
        private String instanceId; 

        /**
         * <p>Dockerfile path</p>
         */
        public Builder dockerfileLocation(String dockerfileLocation) {
            this.putQueryParameter("DockerfileLocation", dockerfileLocation);
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }

        /**
         * <p>Image Tag version</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>Dockerfile file name</p>
         */
        public Builder dockerfileName(String dockerfileName) {
            this.putQueryParameter("DockerfileName", dockerfileName);
            this.dockerfileName = dockerfileName;
            return this;
        }

        /**
         * <p>Source code push branch name</p>
         */
        public Builder pushName(String pushName) {
            this.putQueryParameter("PushName", pushName);
            this.pushName = pushName;
            return this;
        }

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The source code push type. Valid values:

-GIT_TAG: push source code from the Tag

-GIT_BRANCH: push code from Branch</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
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

        public CreateRepoBuildRuleRequest build() {
            return new CreateRepoBuildRuleRequest(this);
        } 

    } 

}
