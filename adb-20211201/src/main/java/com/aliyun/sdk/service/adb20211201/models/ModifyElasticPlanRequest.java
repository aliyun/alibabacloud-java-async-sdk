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

        /**
         * The end time of the scaling plan.
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
         * The start time of the scaling plan.
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
         * The desired specifications of elastic resources after scaling.
         * <p>
         * 
         * > 
         * 
         * *   If the scaling plan uses **EIUs** and **Default Proportional Scaling for EIUs** is enabled, you do not need to specify this parameter. In other cases, you must specify this parameter.
         * 
         * *   You can call the [DescribeElasticPlanSpecifications](~~601278~~) operation to query the specifications that are supported for scaling plans.
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
