// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link AddContainerClusterRequest} extends {@link RequestModel}
 *
 * <p>AddContainerClusterRequest</p>
 */
public class AddContainerClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of the cluster. Only Container Service for Kubernetes (ACK) clusters are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>description ack pv backup</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the cluster that you want to register.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cca8f35f0e0d84540b49d994511c2c87a</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ack_pv_backup_location</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong>: the classic network</li>
         * <li><strong>VPC</strong>: a virtual private cloud (VPC)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
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
