// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>DisableElasticPlanRequest</p>
 */
public class DisableElasticPlanRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticPlanName")
    @Validation(required = true)
    private String elasticPlanName;

    private DisableElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableElasticPlanRequest create() {
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
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public static final class Builder extends Request.Builder<DisableElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private String elasticPlanName; 

        private Builder() {
            super();
        } 

        private Builder(DisableElasticPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
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
         * The name of the scaling plan.
         * <p>
         * 
         * >  You can call the [DescribeElasticPlans](~~601334~~) operation to query the name of a scaling plan for a specific cluster.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        @Override
        public DisableElasticPlanRequest build() {
            return new DisableElasticPlanRequest(this);
        } 

    } 

}
