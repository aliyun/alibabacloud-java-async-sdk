// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonRequest</p>
 */
public class DescribeAddonRequest extends Request {
    @Path
    @NameInMap("addon_name")
    private String addonName;

    @Query
    @NameInMap("cluster_id")
    private String clusterId;

    @Query
    @NameInMap("cluster_spec")
    private String clusterSpec;

    @Query
    @NameInMap("cluster_type")
    private String clusterType;

    @Query
    @NameInMap("cluster_version")
    private String clusterVersion;

    @Query
    @NameInMap("profile")
    private String profile;

    @Query
    @NameInMap("region_id")
    private String regionId;

    @Query
    @NameInMap("version")
    private String version;

    private DescribeAddonRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.clusterVersion = builder.clusterVersion;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeAddonRequest, Builder> {
        private String addonName; 
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String clusterVersion; 
        private String profile; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.clusterId = request.clusterId;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.clusterVersion = request.clusterVersion;
            this.profile = request.profile;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * The name of the component.
         */
        public Builder addonName(String addonName) {
            this.putPathParameter("addon_name", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * The ID of the cluster. If you specify a cluster ID, only components used in the cluster are queried. Other parameters are ignored.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The specifications of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * The type of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The version of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("cluster_version", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * The subtype of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The region ID. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The version of the component. If you do not specify this parameter, the latest version of the component is queried.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeAddonRequest build() {
            return new DescribeAddonRequest(this);
        } 

    } 

}
