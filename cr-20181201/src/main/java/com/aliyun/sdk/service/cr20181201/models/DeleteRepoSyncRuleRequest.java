// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoSyncRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepoSyncRuleRequest</p>
 */
public class DeleteRepoSyncRuleRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SyncRuleId")
    @Validation(required = true)
    private String syncRuleId;

    private DeleteRepoSyncRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.syncRuleId = builder.syncRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepoSyncRuleRequest create() {
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
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteRepoSyncRuleRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String syncRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoSyncRuleRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.syncRuleId = response.syncRuleId;
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
         * SyncRuleId.
         */
        public Builder syncRuleId(String syncRuleId) {
            this.putQueryParameter("SyncRuleId", syncRuleId);
            this.syncRuleId = syncRuleId;
            return this;
        }

        @Override
        public DeleteRepoSyncRuleRequest build() {
            return new DeleteRepoSyncRuleRequest(this);
        } 

    } 

}
