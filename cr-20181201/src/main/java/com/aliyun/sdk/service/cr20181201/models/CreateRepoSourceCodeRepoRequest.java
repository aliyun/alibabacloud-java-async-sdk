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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    private CreateRepoSourceCodeRepoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoBuild = builder.autoBuild;
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

    public static CreateRepoSourceCodeRepoRequest create() {
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<CreateRepoSourceCodeRepoRequest, Builder> {
        private String regionId; 
        private Boolean autoBuild; 
        private String codeRepoName; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private Boolean disableCacheBuild; 
        private String instanceId; 
        private Boolean overseaBuild; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSourceCodeRepoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoBuild = request.autoBuild;
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
         * Specifies whether to trigger image building when source code is committed. Valid values:
         * <p>
         * 
         * *   `true`: triggers image building when source code is committed.
         * *   `false`: does not trigger image building when source code is committed.
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
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
         * The type of the source code hosting platform. Valid values: `GITHUB`, `GITLAB`, `GITEE`, `CODE`, and `CODEUP`.
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
        public Builder disableCacheBuild(Boolean disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
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
         * Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:
         * <p>
         * 
         * *   `true`: enables Build With Servers Deployed Outside Chinese Mainland.
         * *   `false`: does not enable Build With Servers Deployed Outside Chinese Mainland.
         */
        public Builder overseaBuild(Boolean overseaBuild) {
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
        public CreateRepoSourceCodeRepoRequest build() {
            return new CreateRepoSourceCodeRepoRequest(this);
        } 

    } 

}
