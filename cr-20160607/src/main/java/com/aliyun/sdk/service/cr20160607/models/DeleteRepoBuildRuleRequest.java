// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

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
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("BuildRuleId")
    @Validation(required = true)
    private Long buildRuleId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteRepoBuildRuleRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.buildRuleId = builder.buildRuleId;
        this.regionId = builder.regionId;
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
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return buildRuleId
     */
    public Long getBuildRuleId() {
        return this.buildRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteRepoBuildRuleRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private Long buildRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepoBuildRuleRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.buildRuleId = response.buildRuleId;
            this.regionId = response.regionId;
        } 

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * BuildRuleId.
         */
        public Builder buildRuleId(Long buildRuleId) {
            this.putPathParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
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

        @Override
        public DeleteRepoBuildRuleRequest build() {
            return new DeleteRepoBuildRuleRequest(this);
        } 

    } 

}
