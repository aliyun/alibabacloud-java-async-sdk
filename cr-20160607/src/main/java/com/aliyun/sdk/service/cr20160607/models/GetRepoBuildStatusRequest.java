// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoBuildStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRepoBuildStatusRequest</p>
 */
public class GetRepoBuildStatusRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("BuildId")
    @Validation(required = true)
    private String buildId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetRepoBuildStatusRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.buildId = builder.buildId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoBuildStatusRequest create() {
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
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetRepoBuildStatusRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private String buildId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoBuildStatusRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.buildId = response.buildId;
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
         * BuildId.
         */
        public Builder buildId(String buildId) {
            this.putPathParameter("BuildId", buildId);
            this.buildId = buildId;
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
        public GetRepoBuildStatusRequest build() {
            return new GetRepoBuildStatusRequest(this);
        } 

    } 

}
