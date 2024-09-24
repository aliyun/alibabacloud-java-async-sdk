// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonsRequest</p>
 */
public class DescribeAddonsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_profile")
    private String clusterProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_spec")
    private String clusterSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_type")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_version")
    private String clusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private DescribeAddonsRequest(Builder builder) {
        super(builder);
        this.clusterProfile = builder.clusterProfile;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.clusterVersion = builder.clusterVersion;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterProfile
     */
    public String getClusterProfile() {
        return this.clusterProfile;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DescribeAddonsRequest, Builder> {
        private String clusterProfile; 
        private String clusterSpec; 
        private String clusterType; 
        private String clusterVersion; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonsRequest request) {
            super(request);
            this.clusterProfile = request.clusterProfile;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.clusterVersion = request.clusterVersion;
            this.region = request.region;
        } 

        /**
         * The cluster type. Valid values:
         * <p>
         * 
         * *   `Default`: ACK managed cluster
         * *   `Serverless`: ACK Serverless cluster
         * *   `Edge`: ACK Edge cluster
         */
        public Builder clusterProfile(String clusterProfile) {
            this.putQueryParameter("cluster_profile", clusterProfile);
            this.clusterProfile = clusterProfile;
            return this;
        }

        /**
         * If you set `cluster_type` to `ManagedKubernetes` and specify `profile`, you can further specify the edition of the cluster. Valid values:
         * <p>
         * 
         * *   `ack.pro.small`: creates an ACK Pro cluster.
         * *   `ack.standard`: creates an ACK Basic cluster. If you leave the parameter empty, an ACK Basic cluster is created.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * *   `Kubernetes`: ACK dedicated cluster.
         * <p>
         * *   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.
         * *   `ExternalKubernetes`: registered cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The cluster version.
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("cluster_version", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public DescribeAddonsRequest build() {
            return new DescribeAddonsRequest(this);
        } 

    } 

}
