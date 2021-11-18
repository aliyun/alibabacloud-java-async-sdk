// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSyncTaskByRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncTaskByRuleRequest</p>
 */
public class CreateRepoSyncTaskByRuleRequest extends Request {
    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SyncRuleId")
    private String syncRuleId;


    private CreateRepoSyncTaskByRuleRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.regionId = builder.regionId;
        this.syncRuleId = builder.syncRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncTaskByRuleRequest create() {
        return builder().build();
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public static final class Builder extends Request.Builder {
        private String tag; 
        private String instanceId; 
        private String repoId; 
        private String regionId; 
        private String syncRuleId; 

        /**
         * <p>The version of the image to be synchronized.</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
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
         * <p>Synchronous rule ID</p>
         */
        public Builder syncRuleId(String syncRuleId) {
            this.putQueryParameter("SyncRuleId", syncRuleId);
            this.syncRuleId = syncRuleId;
            return this;
        }

        public CreateRepoSyncTaskByRuleRequest build() {
            return new CreateRepoSyncTaskByRuleRequest(this);
        } 

    } 

}
