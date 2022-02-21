// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoSourceCodeRepoRequest</p>
 */
public class UpdateRepoSourceCodeRepoRequest extends Request {
    @Query
    @NameInMap("AutoBuild")
    private String autoBuild;

    @Query
    @NameInMap("CodeRepoId")
    private String codeRepoId;

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
    private String disableCacheBuild;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OverseaBuild")
    private String overseaBuild;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private UpdateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.autoBuild = builder.autoBuild;
        this.codeRepoId = builder.codeRepoId;
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

    public static UpdateRepoSourceCodeRepoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBuild
     */
    public String getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return codeRepoId
     */
    public String getCodeRepoId() {
        return this.codeRepoId;
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
    public String getDisableCacheBuild() {
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
    public String getOverseaBuild() {
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

    public static final class Builder extends Request.Builder<UpdateRepoSourceCodeRepoRequest, Builder> {
        private String autoBuild; 
        private String codeRepoId; 
        private String codeRepoName; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private String disableCacheBuild; 
        private String instanceId; 
        private String overseaBuild; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoSourceCodeRepoRequest response) {
            super(response);
            this.autoBuild = response.autoBuild;
            this.codeRepoId = response.codeRepoId;
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
        public Builder autoBuild(String autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * CodeRepoId.
         */
        public Builder codeRepoId(String codeRepoId) {
            this.putQueryParameter("CodeRepoId", codeRepoId);
            this.codeRepoId = codeRepoId;
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
        public Builder disableCacheBuild(String disableCacheBuild) {
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
        public Builder overseaBuild(String overseaBuild) {
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
        public UpdateRepoSourceCodeRepoRequest build() {
            return new UpdateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
