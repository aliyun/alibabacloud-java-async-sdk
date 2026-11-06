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
    @com.aliyun.core.annotation.NameInMap("SupportPolicy")
    private String supportPolicy;

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
        this.supportPolicy = builder.supportPolicy;
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
     * @return supportPolicy
     */
    public String getSupportPolicy() {
        return this.supportPolicy;
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
        private String supportPolicy; 
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
            this.supportPolicy = request.supportPolicy;
            this.runtime = request.runtime;
        } 

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster, including ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
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
         * <p>The Kubernetes version of the cluster, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
         * <p>For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>The query mode. Valid values:</p>
         * <ul>
         * <li><code>supported</code>: queries supported versions.</li>
         * <li><code>creatable</code>: queries versions available for cluster creation.</li>
         * </ul>
         * <p>If you specify KubernetesVersion, the query mode is ignored.</p>
         * <p>If you do not specify a query mode, versions available for cluster creation are returned by default.</p>
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
         * <p>The cluster profile used to differentiate cluster scenarios. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: non-edge cluster.</li>
         * <li><code>Edge</code>: edge cluster.</li>
         * <li><code>Serverless</code>: ASK cluster.</li>
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
         * <p>Specifies whether to query the upgradable versions of the cluster version. This parameter takes effect only when the KubernetesVersion parameter is specified. Valid values:</p>
         * <ul>
         * <li><p>true: queries upgradable versions.</p>
         * </li>
         * <li><p>false: does not query upgradable versions.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the region where the cluster is deployed.</p>
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
         * <p>The version support policy. The value is case-sensitive. Valid values:</p>
         * <ul>
         * <li>Standard: standard support. This is the default value.</li>
         * <li>Extended: extended support.
         * If you set this parameter to Extended: when Mode is set to <code>supported</code>, versions in the extended support period are additionally returned; when Mode is set to <code>creatable</code>, the latest extended support patch version of the major version in the extended support period is additionally returned; upgradable_versions returns the extended support patch versions of the major version.
         * Extended support applies only to ACK Pro managed clusters (where ClusterSpec is set to <code>ack.pro.*</code> and Profile is set to <code>Default</code>). Other cluster types (ACK Standard, ACS, ACK Edge managed, and ACK dedicated clusters) do not support extended support. If you specify a version in the extended support period to create or upgrade these clusters, the request will be rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Extended</p>
         */
        public Builder supportPolicy(String supportPolicy) {
            this.putQueryParameter("SupportPolicy", supportPolicy);
            this.supportPolicy = supportPolicy;
            return this;
        }

        /**
         * <p>The runtime type. You can specify a runtime type to filter the system images supported by the runtime. Valid values:</p>
         * <ul>
         * <li><code>docker</code>: Docker runtime.</li>
         * <li><code>containerd</code>: containerd runtime.</li>
         * <li><code>Sandboxed-Container.runv</code>: sandboxed container.</li>
         * </ul>
         * <p>If you specify a runtime type, the image versions supported by the specified runtime are returned.</p>
         * <p>If you do not specify a runtime type, all images are returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
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
