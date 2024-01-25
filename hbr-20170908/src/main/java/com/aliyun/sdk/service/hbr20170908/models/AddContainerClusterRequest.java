// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddContainerClusterRequest} extends {@link RequestModel}
 *
 * <p>AddContainerClusterRequest</p>
 */
public class AddContainerClusterRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    private AddContainerClusterRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.description = builder.description;
        this.identifier = builder.identifier;
        this.name = builder.name;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContainerClusterRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<AddContainerClusterRequest, Builder> {
        private String clusterType; 
        private String description; 
        private String identifier; 
        private String name; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(AddContainerClusterRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.description = request.description;
            this.identifier = request.identifier;
            this.name = request.name;
            this.networkType = request.networkType;
        } 

        /**
         * The type of the cluster. Only Container Service for Kubernetes (ACK) clusters are supported.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The description of the cluster.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the cluster that you want to register.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The network type of the cluster. Valid values:
         * <p>
         * 
         * *   **CLASSIC**: the classic network
         * *   **VPC**: a virtual private cloud (VPC)
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public AddContainerClusterRequest build() {
            return new AddContainerClusterRequest(this);
        } 

    } 

}
