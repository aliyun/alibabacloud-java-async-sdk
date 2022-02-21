// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSourceCodeRepoRequest</p>
 */
public class CreateRepoSourceCodeRepoRequest extends Request {
    @Query
    @NameInMap("AutoBuild")
    private Boolean autoBuild;

    @Query
    @NameInMap("CodeRepoName")
    @Validation(required = true)
    private String codeRepoName;

    @Query
    @NameInMap("CodeRepoNamespaceName")
    @Validation(required = true)
    private String codeRepoNamespaceName;

    @Query
    @NameInMap("CodeRepoType")
    @Validation(required = true)
    private String codeRepoType;

    @Query
    @NameInMap("DisableCacheBuild")
    private Boolean disableCacheBuild;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OverseaBuild")
    private Boolean overseaBuild;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private CreateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.autoBuild = builder.autoBuild;
        this.codeRepoName = builder.codeRepoName;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.codeRepoType = builder.codeRepoType;
        this.disableCacheBuild = builder.disableCacheBuild;
        this.instanceId = builder.instanceId;
        this.overseaBuild = builder.overseaBuild;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSourceCodeRepoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBuild
     */
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return codeRepoName
     */
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    /**
     * @return codeRepoNamespaceName
     */
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    /**
     * @return codeRepoType
     */
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    /**
     * @return disableCacheBuild
     */
    public Boolean getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return overseaBuild
     */
    public Boolean getOverseaBuild() {
        return this.overseaBuild;
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

    public static final class Builder extends Request.Builder<CreateRepoSourceCodeRepoRequest, Builder> {
        private Boolean autoBuild; 
        private String codeRepoName; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private Boolean disableCacheBuild; 
        private String instanceId; 
        private Boolean overseaBuild; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSourceCodeRepoRequest response) {
            super(response);
            this.autoBuild = response.autoBuild;
            this.codeRepoName = response.codeRepoName;
            this.codeRepoNamespaceName = response.codeRepoNamespaceName;
            this.codeRepoType = response.codeRepoType;
            this.disableCacheBuild = response.disableCacheBuild;
            this.instanceId = response.instanceId;
            this.overseaBuild = response.overseaBuild;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
        } 

        /**
         * AutoBuild.
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * CodeRepoName.
         */
        public Builder codeRepoName(String codeRepoName) {
            this.putQueryParameter("CodeRepoName", codeRepoName);
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * CodeRepoNamespaceName.
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.putQueryParameter("CodeRepoNamespaceName", codeRepoNamespaceName);
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * CodeRepoType.
         */
        public Builder codeRepoType(String codeRepoType) {
            this.putQueryParameter("CodeRepoType", codeRepoType);
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * DisableCacheBuild.
         */
        public Builder disableCacheBuild(Boolean disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
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
         * OverseaBuild.
         */
        public Builder overseaBuild(Boolean overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
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
        public CreateRepoSourceCodeRepoRequest build() {
            return new CreateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
