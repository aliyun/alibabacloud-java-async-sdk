// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClustersForRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeClustersForRegionRequest</p>
 */
public class DescribeClustersForRegionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("region_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_number")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    private DescribeClustersForRegionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersForRegionRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<DescribeClustersForRegionRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private String profile; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClustersForRegionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.profile = request.profile;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putPathParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * cluster_spec.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * cluster_type.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * page_number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * profile.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        @Override
        public DescribeClustersForRegionRequest build() {
            return new DescribeClustersForRegionRequest(this);
        } 

    } 

}
