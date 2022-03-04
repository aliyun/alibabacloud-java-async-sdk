// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeClustersRequest</p>
 */
public class DescribeClustersRequest extends Request {
    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("clusterType")
    private String clusterType;

    private DescribeClustersRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.clusterType = builder.clusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    public static final class Builder extends Request.Builder<DescribeClustersRequest, Builder> {
        private String name; 
        private String clusterType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClustersRequest request) {
            super(request);
            this.name = request.name;
            this.clusterType = request.clusterType;
        } 

        /**
         * Perform a fuzzy match query based on the cluster Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("clusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        @Override
        public DescribeClustersRequest build() {
            return new DescribeClustersRequest(this);
        } 

    } 

}
