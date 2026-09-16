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
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRepoConfiguration")
    private RepoConfiguration defaultRepoConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRepoType")
    @Deprecated
    private String defaultRepoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.defaultRepoConfiguration = builder.defaultRepoConfiguration;
        this.defaultRepoType = builder.defaultRepoType;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceRequest create() {
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
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return defaultRepoConfiguration
     */
    public RepoConfiguration getDefaultRepoConfiguration() {
        return this.defaultRepoConfiguration;
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceRequest, Builder> {
        private String regionId; 
        private Boolean autoCreateRepo; 
        private RepoConfiguration defaultRepoConfiguration; 
        private String defaultRepoType; 
        private String instanceId; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateRepo = request.autoCreateRepo;
            this.defaultRepoConfiguration = request.defaultRepoConfiguration;
            this.defaultRepoType = request.defaultRepoType;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
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
         * <p>Whether to automatically create a repository when an image is pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * <p>The default configuration for automatically created repositories.</p>
         */
        public Builder defaultRepoConfiguration(RepoConfiguration defaultRepoConfiguration) {
            String defaultRepoConfigurationShrink = shrink(defaultRepoConfiguration, "DefaultRepoConfiguration", "json");
            this.putQueryParameter("DefaultRepoConfiguration", defaultRepoConfigurationShrink);
            this.defaultRepoConfiguration = defaultRepoConfiguration;
            return this;
        }

        /**
         * <p>The default type for automatically created repositories. This parameter applies only if <code>AutoCreateRepo</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>PUBLIC</code>: a public repository</p>
         * </li>
         * <li><p><code>PRIVATE</code>: a private repository</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
