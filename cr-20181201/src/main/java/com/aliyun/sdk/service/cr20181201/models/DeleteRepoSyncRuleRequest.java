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
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SyncRuleId")
    @Validation(required = true)
    private String syncRuleId;

    private DeleteRepoSyncRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
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
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteRepoSyncRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String syncRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoSyncRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.syncRuleId = request.syncRuleId;
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
         * The ID of the synchronization rule.
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
