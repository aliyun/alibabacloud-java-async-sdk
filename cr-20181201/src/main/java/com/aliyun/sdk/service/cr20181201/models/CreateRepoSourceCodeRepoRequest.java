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
 * {@link CreateRepoSourceCodeRepoRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSourceCodeRepoRequest</p>
 */
public class CreateRepoSourceCodeRepoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBuild")
    private Boolean autoBuild;

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
    private Boolean disableCacheBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverseaBuild")
    private Boolean overseaBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic building. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables automatic building.</p>
         * </li>
         * <li><p><code>false</code>: disables automatic building.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
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
         * <p>The namespace name of the source code repository.</p>
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
         * <p>The type of the source code platform. Valid values: <code>GITHUB</code>, <code>GITLAB</code>, <code>GITEE</code>, <code>CODE</code>, and <code>CODEUP</code>.</p>
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
         * <p>Specifies whether to disable the build cache. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: disables the build cache.</p>
         * </li>
         * <li><p><code>false</code>: enables the build cache.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableCacheBuild(Boolean disableCacheBuild) {
            this.putQueryParameter("DisableCacheBuild", disableCacheBuild);
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>Specifies whether to enable intelligent build acceleration for overseas sources. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables intelligent build acceleration for overseas sources.</p>
         * </li>
         * <li><p><code>false</code>: disables intelligent build acceleration for overseas sources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overseaBuild(Boolean overseaBuild) {
            this.putQueryParameter("OverseaBuild", overseaBuild);
            this.overseaBuild = overseaBuild;
            return this;
        }

        /**
         * <p>The image repository ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-gzsrlevmvoaq****</p>
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
