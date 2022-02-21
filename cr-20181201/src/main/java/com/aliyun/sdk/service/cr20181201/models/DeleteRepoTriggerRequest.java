// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepoTriggerRequest</p>
 */
public class DeleteRepoTriggerRequest extends Request {
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
    @NameInMap("TriggerId")
    @Validation(required = true)
    private String triggerId;

    private DeleteRepoTriggerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.triggerId = builder.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepoTriggerRequest create() {
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
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    public static final class Builder extends Request.Builder<DeleteRepoTriggerRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String repoId; 
        private String triggerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoTriggerRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.triggerId = response.triggerId;
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
         * TriggerId.
         */
        public Builder triggerId(String triggerId) {
            this.putQueryParameter("TriggerId", triggerId);
            this.triggerId = triggerId;
            return this;
        }

        @Override
        public DeleteRepoTriggerRequest build() {
            return new DeleteRepoTriggerRequest(this);
        } 

    } 

}
