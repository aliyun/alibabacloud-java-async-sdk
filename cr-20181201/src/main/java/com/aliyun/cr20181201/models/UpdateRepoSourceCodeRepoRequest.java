// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoSourceCodeRepoRequest</p>
 */
public class UpdateRepoSourceCodeRepoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("CodeRepoNamespaceName")
    private String codeRepoNamespaceName;

    @Query
    @NameInMap("CodeRepoType")
    private String codeRepoType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DisableCacheBuild")
    private String disableCacheBuild;

    @Query
    @NameInMap("CodeRepoName")
    private String codeRepoName;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("CodeRepoId")
    private String codeRepoId;

    @Query
    @NameInMap("OverseaBuild")
    private String overseaBuild;

    @Query
    @NameInMap("AutoBuild")
    private String autoBuild;


    private UpdateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.codeRepoType = builder.codeRepoType;
        this.regionId = builder.regionId;
        this.disableCacheBuild = builder.disableCacheBuild;
        this.codeRepoName = builder.codeRepoName;
        this.repoId = builder.repoId;
        this.codeRepoId = builder.codeRepoId;
        this.overseaBuild = builder.overseaBuild;
        this.autoBuild = builder.autoBuild;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoSourceCodeRepoRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return disableCacheBuild
     */
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    /**
     * @return codeRepoName
     */
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return codeRepoId
     */
    public String getCodeRepoId() {
        return this.codeRepoId;
    }

    /**
     * @return overseaBuild
     */
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    /**
     * @return autoBuild
     */
    public String getAutoBuild() {
        return this.autoBuild;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private String regionId; 
        private String disableCacheBuild; 
        private String codeRepoName; 
        private String repoId; 
        private String codeRepoId; 
        private String overseaBuild; 
        private String autoBuild; 

        /**
         * <p>Enterprise Edition instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The namespace of the source code repository.</p>
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.putQueryParameter("CodeRepoNamespaceName", codeRepoNamespaceName);
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * <p>The type of the source code platform. Supported: GITHUB, GITLAB, GITEE, CODEUP, and CODE</p>
         */
        public Builder codeRepoType(String codeRepoType) {
            this.putQueryParameter("CodeRepoType", codeRepoType);
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * <p>The region ID of the enterprise instance.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to disable the build cache. Valid values:
-"true": Disable Cache building

-"false": enables cache building.
</p>
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * <p>Source code repository name</p>
         */
        public Builder codeRepoName(String codeRepoName) {
            this.putQueryParameter("CodeRepoName", codeRepoName);
            this.codeRepoName = codeRepoName;
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
         * <p>Code warehouse ID</p>
         */
        public Builder codeRepoId(String codeRepoId) {
            this.putQueryParameter("CodeRepoId", codeRepoId);
            this.codeRepoId = codeRepoId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the overseas build mode. Valid values:
-"true": enable overseas build mode

-"false": the overseas build mode is disabled.</p>
         */
        public Builder overseaBuild(String overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic build by submitting code. Valid values:

-"true": enable automatic code submission to trigger build

-"false": no open submitted code automatic trigger build</p>
         */
        public Builder autoBuild(String autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        public UpdateRepoSourceCodeRepoRequest build() {
            return new UpdateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
