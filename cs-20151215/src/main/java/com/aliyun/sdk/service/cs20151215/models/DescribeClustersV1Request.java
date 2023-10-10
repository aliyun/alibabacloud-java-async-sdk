// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersV1Request} extends {@link RequestModel}
 *
 * <p>DescribeClustersV1Request</p>
 */
public class DescribeClustersV1Request extends Request {
    @Query
    @NameInMap("cluster_spec")
    private String clusterSpec;

    @Query
    @NameInMap("cluster_type")
    private String clusterType;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    @Query
    @NameInMap("profile")
    private String profile;

    @Query
    @NameInMap("region_id")
    private String regionId;

    private DescribeClustersV1Request(Builder builder) {
        super(builder);
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
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.profile = request.profile;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster type, which is available only when the cluster type is set to `ManagedKubernetes`. Valid values:
         * <p>
         * 
         * *   `ack.pro.small`: ACK Pro cluster
         * *   `ack.standard`: ACK Basic cluster
         * 
         * By default, this parameter is left empty, which means that ACK clusters are not filtered by this parameter.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * The type of cluster. Valid values:
         * <p>
         * 
         * *   `Kubernetes`: ACK dedicated cluster
         * *   `ManagedKubernetes`: ACK managed cluster, ACK Serverless cluster, or ACK Edge cluster
         * *   `Ask`: ACK Serverless cluster
         * *   `ExternalKubernetes`: registered cluster
         * 
         * If you want to query ACK Serverless clusters, specify ManagedKubernetes or Ask based on the value that you specified when you created the ACK Serverless clusters.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The cluster name.
         * <p>
         * 
         * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The cluster identifier, which is available only when the cluster type is set to `ManagedKubernetes`. Valid values:
         * <p>
         * 
         * *   `Default`: ACK managed cluster
         * *   `Serverless`: ACK Serverless cluster
         * *   `Edge`: ACK Edge cluster
         * 
         * By default, this parameter is left empty, which means that ACK clusters are not filtered by this parameter.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The region ID of the clusters. You can use this parameter to query all clusters in the specified region.
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
