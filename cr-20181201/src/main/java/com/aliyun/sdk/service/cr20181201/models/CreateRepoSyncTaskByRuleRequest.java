// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSyncTaskByRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncTaskByRuleRequest</p>
 */
public class CreateRepoSyncTaskByRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("SyncRuleId")
    @Validation(required = true)
    private String syncRuleId;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private CreateRepoSyncTaskByRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.syncRuleId = builder.syncRuleId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncTaskByRuleRequest create() {
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRepoSyncTaskByRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoId; 
        private String syncRuleId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSyncTaskByRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.syncRuleId = request.syncRuleId;
            this.tag = request.tag;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * The ID of the synchronization rule.
         */
        public Builder syncRuleId(String syncRuleId) {
            this.putQueryParameter("SyncRuleId", syncRuleId);
            this.syncRuleId = syncRuleId;
            return this;
        }

        /**
         * The version of the image to be synchronized.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRepoSyncTaskByRuleRequest build() {
            return new CreateRepoSyncTaskByRuleRequest(this);
        } 

    } 

}
