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
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: managed cluster.</li>
         * <li><code>Serverless</code>: serverless cluster.</li>
         * <li><code>Edge</code>: edge cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder clusterProfile(String clusterProfile) {
            this.putQueryParameter("cluster_profile", clusterProfile);
            this.clusterProfile = clusterProfile;
            return this;
        }

        /**
         * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>, you can further specify the cluster specification.</p>
         * <ul>
         * <li><p><code>ack.pro.small</code>: Pro cluster.</p>
         * </li>
         * <li><p><code>ack.standard</code>: Basic cluster (selected by default if this parameter is left empty).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>Kubernetes</code>: ACK dedicated cluster.</p>
         * </li>
         * <li><p><code>ManagedKubernetes</code>: ACK ACK cluster types, including ACK ACK clusters (ACK Pro and ACK Basic), ACK Serverless clusters (Pro and Basic), ACK Edge clusters (Pro and Basic), and ACK Lingjun clusters (Pro).</p>
         * </li>
         * <li><p><code>ExternalKubernetes</code>: registered cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.24.6-aliyun.1</p>
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("cluster_version", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * <p>The ID of the region where the cluster resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
