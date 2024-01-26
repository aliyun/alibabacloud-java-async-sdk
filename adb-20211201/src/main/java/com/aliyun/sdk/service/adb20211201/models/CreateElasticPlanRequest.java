// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticPlanRequest</p>
 */
public class CreateElasticPlanRequest extends Request {
    @Query
    @NameInMap("AutoScale")
    private Boolean autoScale;

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
    @NameInMap("Enabled")
    @Validation(required = true)
    private Boolean enabled;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TargetSize")
    private String targetSize;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateElasticPlanRequest(Builder builder) {
        super(builder);
        this.autoScale = builder.autoScale;
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
        this.enabled = builder.enabled;
        this.endTime = builder.endTime;
        this.resourceGroupName = builder.resourceGroupName;
        this.startTime = builder.startTime;
        this.targetSize = builder.targetSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return this.autoScale;
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateElasticPlanRequest, Builder> {
        private Boolean autoScale; 
        private String cronExpression; 
        private String DBClusterId; 
        private String elasticPlanName; 
        private Boolean enabled; 
        private String endTime; 
        private String resourceGroupName; 
        private String startTime; 
        private String targetSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticPlanRequest request) {
            super(request);
            this.autoScale = request.autoScale;
            this.cronExpression = request.cronExpression;
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
            this.enabled = request.enabled;
            this.endTime = request.endTime;
            this.resourceGroupName = request.resourceGroupName;
            this.startTime = request.startTime;
            this.targetSize = request.targetSize;
            this.type = request.type;
        } 

        /**
         * Specifies whether to enable **Default Proportional Scaling for EIUs**. Valid values:
         * <p>
         * 
         * *   true. In this case, storage resources are scaled along with computing resources, and the TargetSize and CronExpression parameters are not supported.
         * *   false
         * 
         * > 
         * 
         * *   This parameter must be specified when Type is set to WORKER. This parameter is not required when Type is set to EXECUTOR.
         * 
         * *   You can enable Default Proportional Scaling for EIUs for only a single scaling plan of a cluster.
         */
        public Builder autoScale(Boolean autoScale) {
            this.putQueryParameter("AutoScale", autoScale);
            this.autoScale = autoScale;
            return this;
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
         * >  You can call the [DescribeDBClusters](~~454250~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
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
         * >  The name must be 2 to 30 characters in length and can contain letters, digits, and underscores (\_). The name must start with a letter.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        /**
         * Specifies whether to immediately enable the scaling plan after the plan is created. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
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
         * The name of the resource group.
         * <p>
         * 
         * > 
         * 
         * *   If you want to create a scaling plan that uses interactive resource groups, you must specify this parameter. If you want to create a scaling plan that uses elastic I/O units (EIUs), you do not need to specify this parameter.
         * 
         * *   You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the resource group name for a cluster.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
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

        /**
         * The type of the scaling plan. Valid values:
         * <p>
         * 
         * *   EXECUTOR: the interactive resource group type, which indicates the computing resource type.
         * *   WORKER: the EIU type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateElasticPlanRequest build() {
            return new CreateElasticPlanRequest(this);
        } 

    } 

}
