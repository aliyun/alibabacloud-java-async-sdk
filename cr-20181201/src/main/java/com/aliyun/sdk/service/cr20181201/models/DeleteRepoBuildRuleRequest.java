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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildRuleId")
    @Validation(required = true)
    private String buildRuleId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private DeleteRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildRuleId = builder.buildRuleId;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<DeleteRepoBuildRuleRequest, Builder> {
        private String regionId; 
        private String buildRuleId; 
        private String instanceId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoBuildRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildRuleId = request.buildRuleId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
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
         * The ID of the image building rule.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
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

        @Override
        public DeleteRepoBuildRuleRequest build() {
            return new DeleteRepoBuildRuleRequest(this);
        } 

    } 

}
