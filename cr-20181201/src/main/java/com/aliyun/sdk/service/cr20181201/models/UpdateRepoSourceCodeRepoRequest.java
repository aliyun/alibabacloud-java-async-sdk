// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoSourceCodeRepoRequest</p>
 */
public class UpdateRepoSourceCodeRepoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBuild")
    private String autoBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeRepoId")
    private String codeRepoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeRepoName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeRepoNamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeRepoNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeRepoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeRepoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableCacheBuild")
    private String disableCacheBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverseaBuild")
    private String overseaBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic image building when code is committed. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables automatic image building when code is committed.</li>
         * <li><code>false</code>: disables automatic image building when code is committed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoBuild(String autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * <p>The ID of the source code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-cp7d6sget5r****</p>
         */
        public Builder codeRepoId(String codeRepoId) {
            this.putQueryParameter("CodeRepoId", codeRepoId);
            this.codeRepoId = codeRepoId;
            return this;
        }

        /**
         * <p>The name of the source code repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>repo</p>
         */
        public Builder codeRepoName(String codeRepoName) {
            this.putQueryParameter("CodeRepoName", codeRepoName);
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * <p>The namespace to which the source code repository belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.putQueryParameter("CodeRepoNamespaceName", codeRepoNamespaceName);
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * <p>The type of the source code hosting platform. Valid values: GITHUB, GITLAB, GITEE, CODE, and CODEUP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GITHUB</p>
         */
        public Builder codeRepoType(String codeRepoType) {
            this.putQueryParameter("CodeRepoType", codeRepoType);
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * <p>Specifies whether to disable building caches. Valid values:</p>
         * <ul>
         * <li><code>true</code>: disables building caches.</li>
         * <li><code>false</code>: enables building caches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-shac42yvqzvq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Build With Servers Deployed Outside Chinese Mainland.</li>
         * <li><code>false</code>: disables Build With Servers Deployed Outside Chinese Mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overseaBuild(String overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-gzsrlevmvoa****</p>
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
