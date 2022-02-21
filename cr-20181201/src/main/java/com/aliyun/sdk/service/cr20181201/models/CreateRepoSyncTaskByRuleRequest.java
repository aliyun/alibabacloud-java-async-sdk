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
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
        private String regionId; 
        private String repoId; 
        private String syncRuleId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSyncTaskByRuleRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.syncRuleId = response.syncRuleId;
            this.tag = response.tag;
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

        /**
         * SyncRuleId.
         */
        public Builder syncRuleId(String syncRuleId) {
            this.putQueryParameter("SyncRuleId", syncRuleId);
            this.syncRuleId = syncRuleId;
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

        @Override
        public CreateRepoSyncTaskByRuleRequest build() {
            return new CreateRepoSyncTaskByRuleRequest(this);
        } 

    } 

}
