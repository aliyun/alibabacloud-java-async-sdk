// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncTaskRequest</p>
 */
public class CreateRepoSyncTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Override")
    private Boolean override;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Query
    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    private String targetInstanceId;

    @Query
    @NameInMap("TargetNamespace")
    @Validation(required = true)
    private String targetNamespace;

    @Query
    @NameInMap("TargetRegionId")
    @Validation(required = true)
    private String targetRegionId;

    @Query
    @NameInMap("TargetRepoName")
    @Validation(required = true)
    private String targetRepoName;

    @Query
    @NameInMap("TargetTag")
    @Validation(required = true)
    private String targetTag;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;

    private CreateRepoSyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.override = builder.override;
        this.repoId = builder.repoId;
        this.tag = builder.tag;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetNamespace = builder.targetNamespace;
        this.targetRegionId = builder.targetRegionId;
        this.targetRepoName = builder.targetRepoName;
        this.targetTag = builder.targetTag;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncTaskRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetNamespace
     */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    /**
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return this.targetRegionId;
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
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<CreateRepoSyncTaskRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Boolean override; 
        private String repoId; 
        private String tag; 
        private String targetInstanceId; 
        private String targetNamespace; 
        private String targetRegionId; 
        private String targetRepoName; 
        private String targetTag; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.override = request.override;
            this.repoId = request.repoId;
            this.tag = request.tag;
            this.targetInstanceId = request.targetInstanceId;
            this.targetNamespace = request.targetNamespace;
            this.targetRegionId = request.targetRegionId;
            this.targetRepoName = request.targetRepoName;
            this.targetTag = request.targetTag;
            this.targetUserId = request.targetUserId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Override.
         */
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
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

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * TargetNamespace.
         */
        public Builder targetNamespace(String targetNamespace) {
            this.putQueryParameter("TargetNamespace", targetNamespace);
            this.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * TargetRegionId.
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putQueryParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        /**
         * TargetRepoName.
         */
        public Builder targetRepoName(String targetRepoName) {
            this.putQueryParameter("TargetRepoName", targetRepoName);
            this.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * TargetTag.
         */
        public Builder targetTag(String targetTag) {
            this.putQueryParameter("TargetTag", targetTag);
            this.targetTag = targetTag;
            return this;
        }

        /**
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public CreateRepoSyncTaskRequest build() {
            return new CreateRepoSyncTaskRequest(this);
        } 

    } 

}
