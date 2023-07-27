// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanSpecificationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticPlanSpecificationsRequest</p>
 */
public class DescribeElasticPlanSpecificationsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeElasticPlanSpecificationsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.resourceGroupName = builder.resourceGroupName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlanSpecificationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeElasticPlanSpecificationsRequest, Builder> {
        private String DBClusterId; 
        private String resourceGroupName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticPlanSpecificationsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.resourceGroupName = request.resourceGroupName;
            this.type = request.type;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~454250~~) operation to query the ID of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the resource group.
         * <p>
         * 
         * > *   This parameter is required only when you query the resource specifications that can be scaled for an interactive resource group.
         * > *   You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of a resource group within a specific cluster.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * The type of the scaling plan. Valid values:
         * <p>
         * 
         * *   EXECUTOR: interactive resource groups, which fall into the computing resource category.
         * *   WORKER: EIUs.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeElasticPlanSpecificationsRequest build() {
            return new DescribeElasticPlanSpecificationsRequest(this);
        } 

    } 

}
