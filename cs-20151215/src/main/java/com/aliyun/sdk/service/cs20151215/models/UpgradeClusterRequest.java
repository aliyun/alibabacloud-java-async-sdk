// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterRequest</p>
 */
public class UpgradeClusterRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("component_name")
    @Deprecated
    private String componentName;

    @Body
    @NameInMap("master_only")
    private Boolean masterOnly;

    @Body
    @NameInMap("next_version")
    private String nextVersion;

    @Body
    @NameInMap("version")
    @Deprecated
    private String version;

    private UpgradeClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.masterOnly = builder.masterOnly;
        this.nextVersion = builder.nextVersion;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return masterOnly
     */
    public Boolean getMasterOnly() {
        return this.masterOnly;
    }

    /**
     * @return nextVersion
     */
    public String getNextVersion() {
        return this.nextVersion;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpgradeClusterRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private Boolean masterOnly; 
        private String nextVersion; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentName = request.componentName;
            this.masterOnly = request.masterOnly;
            this.nextVersion = request.nextVersion;
            this.version = request.version;
        } 

        /**
         * The ID of the cluster that you want to upgrade.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the component. Set the value to `k8s`.
         */
        public Builder componentName(String componentName) {
            this.putBodyParameter("component_name", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * Specifies whether to upgrade only master nodes. Valid values:
         * <p>
         * 
         * *   true: upgrade only master nodes.
         * *   false: upgrade master and worker nodes.
         */
        public Builder masterOnly(Boolean masterOnly) {
            this.putBodyParameter("master_only", masterOnly);
            this.masterOnly = masterOnly;
            return this;
        }

        /**
         * The Kubernetes version to which the cluster can be upgraded.
         */
        public Builder nextVersion(String nextVersion) {
            this.putBodyParameter("next_version", nextVersion);
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * The current Kubernetes version of the cluster. For more information, see [Kubernetes versions](~~185269~~).
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpgradeClusterRequest build() {
            return new UpgradeClusterRequest(this);
        } 

    } 

}
