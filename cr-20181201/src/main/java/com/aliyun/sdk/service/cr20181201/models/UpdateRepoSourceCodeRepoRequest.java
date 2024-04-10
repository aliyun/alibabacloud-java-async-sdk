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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private UpdateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoBuild = builder.autoBuild;
        this.codeRepoId = builder.codeRepoId;
        this.codeRepoName = builder.codeRepoName;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.codeRepoType = builder.codeRepoType;
        this.disableCacheBuild = builder.disableCacheBuild;
        this.instanceId = builder.instanceId;
        this.overseaBuild = builder.overseaBuild;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<UpdateRepoSourceCodeRepoRequest, Builder> {
        private String regionId; 
        private String autoBuild; 
        private String codeRepoId; 
        private String codeRepoName; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private String disableCacheBuild; 
        private String instanceId; 
        private String overseaBuild; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoSourceCodeRepoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoBuild = request.autoBuild;
            this.codeRepoId = request.codeRepoId;
            this.codeRepoName = request.codeRepoName;
            this.codeRepoNamespaceName = request.codeRepoNamespaceName;
            this.codeRepoType = request.codeRepoType;
            this.disableCacheBuild = request.disableCacheBuild;
            this.instanceId = request.instanceId;
            this.overseaBuild = request.overseaBuild;
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
         * Specifies whether to enable automatic image building when code is committed. Valid values:
         * <p>
         * 
         * *   `true`: enables automatic image building when code is committed.
         * *   `false`: disables automatic image building when code is committed.
         */
        public Builder autoBuild(String autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * The ID of the source code repository.
         */
        public Builder codeRepoId(String codeRepoId) {
            this.putQueryParameter("CodeRepoId", codeRepoId);
            this.codeRepoId = codeRepoId;
            return this;
        }

        /**
         * The name of the source code repository.
         */
        public Builder codeRepoName(String codeRepoName) {
            this.putQueryParameter("CodeRepoName", codeRepoName);
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * The namespace to which the source code repository belongs.
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.putQueryParameter("CodeRepoNamespaceName", codeRepoNamespaceName);
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * The type of the source code hosting platform. Valid values: GITHUB, GITLAB, GITEE, CODE, and CODEUP.
         */
        public Builder codeRepoType(String codeRepoType) {
            this.putQueryParameter("CodeRepoType", codeRepoType);
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * Specifies whether to disable building caches. Valid values:
         * <p>
         * 
         * *   `true`: disables building caches.
         * *   `false`: enables building caches.
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * The ID of the Container Registry Enterprise Edition instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:
         * <p>
         * 
         * *   `true`: enables Build With Servers Deployed Outside Chinese Mainland.
         * *   `false`: disables Build With Servers Deployed Outside Chinese Mainland.
         */
        public Builder overseaBuild(String overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
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
        public UpdateRepoSourceCodeRepoRequest build() {
            return new UpdateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
