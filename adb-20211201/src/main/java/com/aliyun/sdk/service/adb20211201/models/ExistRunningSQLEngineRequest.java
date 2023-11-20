// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExistRunningSQLEngineRequest} extends {@link RequestModel}
 *
 * <p>ExistRunningSQLEngineRequest</p>
 */
public class ExistRunningSQLEngineRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Body
    @NameInMap("ResourceGroupName")
    @Validation(required = true)
    private String resourceGroupName;

    private ExistRunningSQLEngineRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExistRunningSQLEngineRequest create() {
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

    public static final class Builder extends Request.Builder<ExistRunningSQLEngineRequest, Builder> {
        private String DBClusterId; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ExistRunningSQLEngineRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~612397~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the resource group.
         * <p>
         * 
         * >  You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of the resource group for a cluster.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public ExistRunningSQLEngineRequest build() {
            return new ExistRunningSQLEngineRequest(this);
        } 

    } 

}
