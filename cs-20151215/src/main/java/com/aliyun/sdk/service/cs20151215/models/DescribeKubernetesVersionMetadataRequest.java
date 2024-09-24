// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The cluster type that you want to use. Valid values:
         * <p>
         * 
         * *   `Kubernetes`: ACK dedicated cluster.
         * *   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.
         * *   `ExternalKubernetes`: registered cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not set this parameter, the latest Kubernetes version is used.
         * <p>
         * 
         * You can create ACK clusters of the latest two Kubernetes versions in the ACK console. You can call the specific ACK API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * The query mode. Valid values:
         * <p>
         * 
         * *   `supported`: queries all supported versions.
         * *   `creatable`: queries only versions that allow you to create clusters.
         * 
         * If you specify `KubernetesVersion`, this parameter does not take effect.
         * 
         * Default value: creatable.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The scenario where clusters are used. Valid values:
         * <p>
         * 
         * *   `Default`: non-edge computing scenarios
         * *   `Edge`: edge computing scenarios
         * *   `Serverless`: serverless scenarios.
         * 
         * Default value: `Default`.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * Specify whether to query the Kubernetes versions available for updates. This parameter takes effect only when the KubernetesVersion parameter is specified.
         */
        public Builder queryUpgradableVersion(Boolean queryUpgradableVersion) {
            this.putQueryParameter("QueryUpgradableVersion", queryUpgradableVersion);
            this.queryUpgradableVersion = queryUpgradableVersion;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The container runtime type that you want to use. You can specify a runtime type to query only OS images that support the runtime type. Valid values:
         * <p>
         * 
         * *   `docker`: Docker
         * *   `containerd`: containerd
         * *   `Sandboxed-Container.runv`: Sandboxed-Container
         * 
         * If you specify a runtime type, only the OS images that support the specified runtime type are returned.
         * 
         * Otherwise, all OS images are returned.
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
