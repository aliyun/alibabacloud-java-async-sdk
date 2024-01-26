// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteElasticPlanRequest</p>
 */
public class DeleteElasticPlanRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticPlanName")
    @Validation(required = true)
    private String elasticPlanName;

    private DeleteElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteElasticPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private String elasticPlanName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteElasticPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
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
         * >  You can call the [DescribeElasticPlans](~~601334~~) operation to query the names of scaling plans.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        @Override
        public DeleteElasticPlanRequest build() {
            return new DeleteElasticPlanRequest(this);
        } 

    } 

}
