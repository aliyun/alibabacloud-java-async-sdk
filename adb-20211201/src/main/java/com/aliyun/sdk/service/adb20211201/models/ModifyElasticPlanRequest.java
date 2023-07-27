// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticPlanRequest</p>
 */
public class ModifyElasticPlanRequest extends Request {
    @Query
    @NameInMap("CronExpression")
    private String cronExpression;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticPlanName")
    @Validation(required = true)
    private String elasticPlanName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TargetSize")
    private String targetSize;

    private ModifyElasticPlanRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.targetSize = builder.targetSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
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

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return targetSize
     */
    public String getTargetSize() {
        return this.targetSize;
    }

    public static final class Builder extends Request.Builder<ModifyElasticPlanRequest, Builder> {
        private String cronExpression; 
        private String DBClusterId; 
        private String elasticPlanName; 
        private String endTime; 
        private String startTime; 
        private String targetSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticPlanRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.targetSize = request.targetSize;
        } 

        /**
         * A CORN expression that specifies the scaling cycle and time for the scaling plan.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the ID of an AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
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
         * >  You can call the [DescribeElasticPlans](~~601334~~) operation to query the name of a scaling plan of a specific cluster.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        /**
         * The time to end the scaling plan.
         * <p>
         * 
         * >  Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The time to start the scaling plan.
         * <p>
         * 
         * >  Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The amount of elastic resources after scaling.
         * <p>
         * 
         * > *   This parameter is not required only if the resource group uses **EIUs** and **Proportional Default Scaling for EIUs** is enabled.
         * > *   You can call the [DescribeElasticPlanSpecifications](~~601278~~) operation to query the specifications that are supported for scaling plans.
         */
        public Builder targetSize(String targetSize) {
            this.putQueryParameter("TargetSize", targetSize);
            this.targetSize = targetSize;
            return this;
        }

        @Override
        public ModifyElasticPlanRequest build() {
            return new ModifyElasticPlanRequest(this);
        } 

    } 

}
