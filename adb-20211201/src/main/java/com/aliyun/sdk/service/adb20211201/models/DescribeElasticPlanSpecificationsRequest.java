// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanSpecificationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticPlanSpecificationsRequest</p>
 */
public class DescribeElasticPlanSpecificationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~454250~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
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
         * > 
         * 
         * *   This parameter must be specified only when you query the resource specifications that are supported by an interactive resource group.
         * 
         * *   You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of a resource group within a cluster.
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
         * *   EXECUTOR: the interactive resource group type, which specifies the computing resource type.
         * *   WORKER: the elastic I/O unit (EIU) type.
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
