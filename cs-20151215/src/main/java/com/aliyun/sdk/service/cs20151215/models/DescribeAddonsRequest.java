// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonsRequest</p>
 */
public class DescribeAddonsRequest extends Request {
    @Query
    @NameInMap("region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("cluster_type")
    private String clusterType;

    private DescribeAddonsRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.clusterType = builder.clusterType;
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

    public static final class Builder extends Request.Builder<DescribeAddonsRequest, Builder> {
        private String region; 
        private String clusterType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonsRequest request) {
            super(request);
            this.region = request.region;
            this.clusterType = request.clusterType;
        } 

        /**
         * The region ID of the cluster.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
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
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        @Override
        public DescribeAddonsRequest build() {
            return new DescribeAddonsRequest(this);
        } 

    } 

}
