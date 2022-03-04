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
    @NameInMap("cluster_type")
    private String clusterType;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("profile")
    private String profile;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    @Query
    @NameInMap("cluster_spec")
    private String clusterSpec;

    private DescribeClustersV1Request(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.pageNumber = builder.pageNumber;
        this.name = builder.name;
        this.profile = builder.profile;
        this.pageSize = builder.pageSize;
        this.clusterSpec = builder.clusterSpec;
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public static final class Builder extends Request.Builder<DescribeClustersV1Request, Builder> {
        private String clusterType; 
        private Long pageNumber; 
        private String name; 
        private String profile; 
        private Long pageSize; 
        private String clusterSpec; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClustersV1Request request) {
            super(request);
            this.clusterType = request.clusterType;
            this.pageNumber = request.pageNumber;
            this.name = request.name;
            this.profile = request.profile;
            this.pageSize = request.pageSize;
            this.clusterSpec = request.clusterSpec;
        } 

        /**
         * The type of the cluster. Valid values:
         * <p>
         * -"Kubernetes": dedicated cluster.
         * -"ManagedKubernetes": Includes managed clusters, Serverless clusters, and edge clusters.
         * -"Ask":Serverless cluster.
         * -"ExternalKubernetes": registers a cluster.
         * 
         * The value of the cluster type parameter when you query Serverless cluster depends on the value specified when you create Serverless cluster.
         * 
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The current page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The name of the cluster.
         * <p>
         * 
         * Naming rule: the name must be 1 to 63 characters in length and cannot start with a hyphen (-). It must be 1 to 63 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The id of the cluster. When the cluster type is set to "ManagedKubernetes", the cluster type is distinguished by the cluster id. Valid values:
         * <p>
         * -"Default": managed cluster.
         * -"Serverless":Serverless cluster.
         * -"Edge": edge cluster.
         * 
         * The default value is null. The value can be null. If it is null, this field is not used for filtering.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The number of records displayed on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The cluster type. When the cluster type is set to "ManagedKubernetes", the cluster type is distinguished by the cluster type. Valid values:
         * <p>
         * -"ack.pro.small": a professional managed cluster, that is, a ACK Pro cluster.
         * -"ack.standard": Standard managed cluster.
         * 
         * The default value is null. The value can be null. If it is null, this field is not used for filtering.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putQueryParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        @Override
        public DescribeClustersV1Request build() {
            return new DescribeClustersV1Request(this);
        } 

    } 

}
