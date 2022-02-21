// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepoBuildRuleRequest</p>
 */
public class DeleteRepoBuildRuleRequest extends Request {
    @Query
    @NameInMap("BuildRuleId")
    @Validation(required = true)
    private String buildRuleId;

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

    private DeleteRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.buildRuleId = builder.buildRuleId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepoBuildRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
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

    public static final class Builder extends Request.Builder<DeleteRepoBuildRuleRequest, Builder> {
        private String buildRuleId; 
        private String instanceId; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoBuildRuleRequest response) {
            super(response);
            this.buildRuleId = response.buildRuleId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
        } 

        /**
         * BuildRuleId.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
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

        @Override
        public DeleteRepoBuildRuleRequest build() {
            return new DeleteRepoBuildRuleRequest(this);
        } 

    } 

}
