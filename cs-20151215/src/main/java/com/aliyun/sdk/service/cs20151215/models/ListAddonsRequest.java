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
 * {@link ListAddonsRequest} extends {@link RequestModel}
 *
 * <p>ListAddonsRequest</p>
 */
public class ListAddonsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

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
    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region_id")
    private String regionId;

    private ListAddonsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.clusterVersion = builder.clusterVersion;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonsRequest create() {
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
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAddonsRequest, Builder> {
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String clusterVersion; 
        private String profile; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAddonsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.clusterVersion = request.clusterVersion;
            this.profile = request.profile;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID. If you specify a cluster ID, only components used in the specified cluster are queried. Other parameters are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>c02b3e03be10643e8a644a843ffcb****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The specifications of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
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
         * <p>The type of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
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
         * <p>The version of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>1.26.3-aliyun.1</p>
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("cluster_version", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * <p>The subtype of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder profile(String profile) {
            this.putQueryParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * <p>The region of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAddonsRequest build() {
            return new ListAddonsRequest(this);
        } 

    } 

}
