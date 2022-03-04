// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKubernetesVersionMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeKubernetesVersionMetadataRequest</p>
 */
public class DescribeKubernetesVersionMetadataRequest extends Request {
    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("runtime")
    private String runtime;

    @Query
    @NameInMap("KubernetesVersion")
    private String kubernetesVersion;

    @Query
    @NameInMap("Profile")
    private String profile;

    private DescribeKubernetesVersionMetadataRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.clusterType = builder.clusterType;
        this.runtime = builder.runtime;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.profile = builder.profile;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<DescribeKubernetesVersionMetadataRequest, Builder> {
        private String region; 
        private String clusterType; 
        private String runtime; 
        private String kubernetesVersion; 
        private String profile; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKubernetesVersionMetadataRequest request) {
            super(request);
            this.region = request.region;
            this.clusterType = request.clusterType;
            this.runtime = request.runtime;
            this.kubernetesVersion = request.kubernetesVersion;
            this.profile = request.profile;
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
         * The type of the cluster. Valid values:
         * <p>
         * 
         * -"Kubernetes": dedicated cluster.
         * -"ManagedKubernetes": managed cluster.
         * -"Ask":Serverless cluster.
         * -"ExternalKubernetes": registers a cluster.
         * 
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The runtime type. You can specify the runtime type to filter system images that are supported during runtime. Valid values:
         * <p>
         * 
         * -"docker":docker runtime.
         * -"containerd": the containerd runtime.
         * -"Sandboxed-Container.runv ": security sandbox.
         * 
         * If the runtime type is specified, the image version supported by the specified runtime is returned.
         * 
         * If the runtime type is not specified, all images are returned by default.
         */
        public Builder runtime(String runtime) {
            this.putQueryParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The cluster version, which is consistent with the baseline version of the Kubernetes community. We recommend that you select the latest version. If not specified, the latest version is used by default.
         * <p>
         * 
         * Currently, you can create two latest clusters in the ACK console. You can use the API to create other Kubernetes clusters. For more information about the Kubernetes versions supported by ACK, see [Kubernetes release overview](~~ 185269 ~~).
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * The type of the scenario-oriented cluster. Valid values:
         * <p>
         * 
         * -"Default": non-edge cluster.
         * -"Edge": edge scenario cluster.
         * 
         * Default value: "Default ".
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        @Override
        public DescribeKubernetesVersionMetadataRequest build() {
            return new DescribeKubernetesVersionMetadataRequest(this);
        } 

    } 

}
