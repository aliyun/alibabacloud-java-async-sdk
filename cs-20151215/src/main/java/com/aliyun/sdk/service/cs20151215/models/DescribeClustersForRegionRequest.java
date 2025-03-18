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
         * <p>The region.</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c8155823d057948c69a****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The specification of the clusters to query. Valid values:</p>
         * <ul>
         * <li>ack.pro.small: ACK Pro clusters.</li>
         * <li>ack.standard: ACK Basic clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>The type of the clusters to query. Valid values:</p>
         * <ul>
         * <li>Kubernetes: ACK dedicated clusters.</li>
         * <li>ManagedKubernetes: ACK managed clusters. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
         * <li>ExternalKubernetes: registered clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Perform a fuzzy search by using the cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cluster</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The subtype of the clusters to query. Valid values:</p>
         * <ul>
         * <li>Default: ACK managed clusters. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
         * <li>Edge: ACK Edge clusters. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
         * <li>Serverless: ACK Serverless clusters. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
         * <li>Lingjun: ACK Lingjun Pro clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Serverless</p>
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
