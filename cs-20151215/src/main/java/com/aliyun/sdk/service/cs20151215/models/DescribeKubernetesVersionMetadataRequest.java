// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeKubernetesVersionMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeKubernetesVersionMetadataRequest</p>
 */
public class DescribeKubernetesVersionMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KubernetesVersion")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryUpgradableVersion")
    private Boolean queryUpgradableVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runtime")
    private String runtime;

    private DescribeKubernetesVersionMetadataRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.mode = builder.mode;
        this.profile = builder.profile;
        this.queryUpgradableVersion = builder.queryUpgradableVersion;
        this.region = builder.region;
        this.runtime = builder.runtime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKubernetesVersionMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return queryUpgradableVersion
     */
    public Boolean getQueryUpgradableVersion() {
        return this.queryUpgradableVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    public static final class Builder extends Request.Builder<DescribeKubernetesVersionMetadataRequest, Builder> {
        private String clusterType; 
        private String kubernetesVersion; 
        private String mode; 
        private String profile; 
        private Boolean queryUpgradableVersion; 
        private String region; 
        private String runtime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKubernetesVersionMetadataRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.kubernetesVersion = request.kubernetesVersion;
            this.mode = request.mode;
            this.profile = request.profile;
            this.queryUpgradableVersion = request.queryUpgradableVersion;
            this.region = request.region;
            this.runtime = request.runtime;
        } 

        /**
         * <p>The cluster type that you want to use. Valid values:</p>
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
         * <li><code>ExternalKubernetes</code>: registered cluster.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not set this parameter, the latest Kubernetes version is used.</p>
         * <p>You can create ACK clusters of the latest two Kubernetes versions in the ACK console. You can call the specific ACK API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.9-aliyun.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>The query mode. Valid values:</p>
         * <ul>
         * <li><code>supported</code>: queries all supported Kubernetes versions.</li>
         * <li><code>creatable</code>: queries only Kubernetes versions of clusters that you can create.</li>
         * </ul>
         * <p>If you specify <code>KubernetesVersion</code>, this parameter does not take effect.</p>
         * <p>If you do not specify a query mode, Kubernetes versions of clusters that you can create are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The scenario where clusters are used. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: non-edge computing scenarios</li>
         * <li><code>Edge</code>: edge computing scenarios</li>
         * <li><code>Serverless</code>: serverless scenarios.</li>
         * </ul>
         * <p>Default value: <code>Default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * <p>Specify whether to query the Kubernetes versions available for updates. This parameter takes effect only when the KubernetesVersion parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1.30.1-aliyun.1</p>
         */
        public Builder queryUpgradableVersion(Boolean queryUpgradableVersion) {
            this.putQueryParameter("QueryUpgradableVersion", queryUpgradableVersion);
            this.queryUpgradableVersion = queryUpgradableVersion;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The container runtime type that you want to use. You can specify a runtime type to query only OS images that support the runtime type. Valid values:</p>
         * <ul>
         * <li><code>docker</code>: Docker</li>
         * <li><code>containerd</code>: containerd</li>
         * <li><code>Sandboxed-Container.runv</code>: Sandboxed-Container</li>
         * </ul>
         * <p>If you specify a runtime type, only the OS images that support the specified runtime type are returned.</p>
         * <p>Otherwise, all OS images are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>docker</p>
         */
        public Builder runtime(String runtime) {
            this.putQueryParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        @Override
        public DescribeKubernetesVersionMetadataRequest build() {
            return new DescribeKubernetesVersionMetadataRequest(this);
        } 

    } 

}
