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
 * {@link DescribeClustersV1Request} extends {@link RequestModel}
 *
 * <p>DescribeClustersV1Request</p>
 */
public class DescribeClustersV1Request extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region_id")
    private String regionId;

    private DescribeClustersV1Request(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersV1Request create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeClustersV1Request, Builder> {
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private String profile; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClustersV1Request request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.profile = request.profile;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca418e5e6fa2849d78301341700axxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster. Valid values:</p>
         * <ul>
         * <li><code>ack.pro.small</code>: ACK Pro cluster.</li>
         * <li><code>ack.standard</code>: ACK Basic cluster. If you leave the parameter empty, ACK Basic cluster is selected.</li>
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
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
         * <li><code>ExternalKubernetes</code>: registered cluster.</li>
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
         * <p>The cluster name.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
         * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
         * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
         * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
         * </ul>
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
         * <p>The region ID of the clusters. You can use this parameter to query all clusters in the specified region.</p>
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
        public DescribeClustersV1Request build() {
            return new DescribeClustersV1Request(this);
        } 

    } 

}
