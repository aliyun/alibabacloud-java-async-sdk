// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncTaskRequest</p>
 */
public class CreateRepoSyncTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetRepoName")
    private String targetRepoName;

    @Query
    @NameInMap("TargetTag")
    private String targetTag;

    @Query
    @NameInMap("Override")
    private Boolean override;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("TargetRegionId")
    private String targetRegionId;

    @Query
    @NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("TargetNamespace")
    private String targetNamespace;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;


    private CreateRepoSyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.targetRepoName = builder.targetRepoName;
        this.targetTag = builder.targetTag;
        this.override = builder.override;
        this.repoId = builder.repoId;
        this.targetRegionId = builder.targetRegionId;
        this.targetInstanceId = builder.targetInstanceId;
        this.instanceId = builder.instanceId;
        this.targetNamespace = builder.targetNamespace;
        this.tag = builder.tag;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncTaskRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetRepoName
     */
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    /**
     * @return targetTag
     */
    public String getTargetTag() {
        return this.targetTag;
    }

    /**
     * @return override
     */
    public Boolean getOverride() {
        return this.override;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return targetNamespace
     */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String targetRepoName; 
        private String targetTag; 
        private Boolean override; 
        private String repoId; 
        private String targetRegionId; 
        private String targetInstanceId; 
        private String instanceId; 
        private String targetNamespace; 
        private String tag; 
        private String targetUserId; 

        /**
         * <p>The region ID of the source instance.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the target instance image repository.</p>
         */
        public Builder targetRepoName(String targetRepoName) {
            this.putQueryParameter("TargetRepoName", targetRepoName);
            this.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * <p>Target instance image Tag</p>
         */
        public Builder targetTag(String targetTag) {
            this.putQueryParameter("TargetTag", targetTag);
            this.targetTag = targetTag;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly overwrite an existing image:

-"true": forcibly overwrites existing images.

-"false": Does not forcibly overwrite existing images</p>
         */
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
            return this;
        }

        /**
         * <p>The ID of the source instance image repository.</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The region ID of the target instance.</p>
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putQueryParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        /**
         * <p>Target instance ID</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>SOURCE instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Target instance namespace</p>
         */
        public Builder targetNamespace(String targetNamespace) {
            this.putQueryParameter("TargetNamespace", targetNamespace);
            this.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * <p>SOURCE instance image Tag</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Target instance resides account UID</p>
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        public CreateRepoSyncTaskRequest build() {
            return new CreateRepoSyncTaskRequest(this);
        } 

    } 

}
