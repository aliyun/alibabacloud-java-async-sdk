// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSourceCodeRepoRequest</p>
 */
public class CreateRepoSourceCodeRepoRequest extends Request {
    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("CodeRepoNamespaceName")
    private String codeRepoNamespaceName;

    @Query
    @NameInMap("OverseaBuild")
    private Boolean overseaBuild;

    @Query
    @NameInMap("CodeRepoName")
    private String codeRepoName;

    @Query
    @NameInMap("AutoBuild")
    private Boolean autoBuild;

    @Query
    @NameInMap("CodeRepoType")
    private String codeRepoType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("DisableCacheBuild")
    private Boolean disableCacheBuild;


    private CreateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.repoId = builder.repoId;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.overseaBuild = builder.overseaBuild;
        this.codeRepoName = builder.codeRepoName;
        this.autoBuild = builder.autoBuild;
        this.codeRepoType = builder.codeRepoType;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.disableCacheBuild = builder.disableCacheBuild;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSourceCodeRepoRequest create() {
        return builder().build();
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return codeRepoNamespaceName
     */
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    /**
     * @return overseaBuild
     */
    public Boolean getOverseaBuild() {
        return this.overseaBuild;
    }

    /**
     * @return codeRepoName
     */
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    /**
     * @return autoBuild
     */
    public Boolean getAutoBuild() {
        return this.autoBuild;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return disableCacheBuild
     */
    public Boolean getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public static final class Builder extends Request.Builder {
        private String repoId; 
        private String codeRepoNamespaceName; 
        private Boolean overseaBuild; 
        private String codeRepoName; 
        private Boolean autoBuild; 
        private String codeRepoType; 
        private String regionId; 
        private String instanceId; 
        private Boolean disableCacheBuild; 

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
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
         * <p>Specifies whether to enable intelligent building acceleration for overseas sources. Valid values:
-"true": Enable Intelligent Building acceleration for overseas sources

-"false": disable intelligent building acceleration for overseas sources</p>
         */
        public Builder overseaBuild(Boolean overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
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
         * <p>Specifies whether to automatically build the instance. Valid values:

-"true": automatically built

-"false": not automatically built</p>
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * <p>The source code platform type. Valid values: "GITHUB", "GITLAB", "GITEE", "CODE", and "CODEUP"</p>
         */
        public Builder codeRepoType(String codeRepoType) {
            this.putQueryParameter("CodeRepoType", codeRepoType);
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to disable the build cache. Valid values:

-"true": disables the build cache.

-"false": enable cache building</p>
         */
        public Builder disableCacheBuild(Boolean disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        public CreateRepoSourceCodeRepoRequest build() {
            return new CreateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
