// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDBInstancePlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateDBInstancePlanRequest</p>
 */
public class UpdateDBInstancePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanConfig")
    private String planConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanDesc")
    private String planDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanEndDate")
    private String planEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanStartDate")
    private String planStartDate;

    private UpdateDBInstancePlanRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.planConfig = builder.planConfig;
        this.planDesc = builder.planDesc;
        this.planEndDate = builder.planEndDate;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.planStartDate = builder.planStartDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDBInstancePlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return planConfig
     */
    public String getPlanConfig() {
        return this.planConfig;
    }

    /**
     * @return planDesc
     */
    public String getPlanDesc() {
        return this.planDesc;
    }

    /**
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return this.planEndDate;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return this.planStartDate;
    }

    public static final class Builder extends Request.Builder<UpdateDBInstancePlanRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String planConfig; 
        private String planDesc; 
        private String planEndDate; 
        private String planId; 
        private String planName; 
        private String planStartDate; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDBInstancePlanRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.planConfig = request.planConfig;
            this.planDesc = request.planDesc;
            this.planEndDate = request.planEndDate;
            this.planId = request.planId;
            this.planName = request.planName;
            this.planStartDate = request.planStartDate;
        } 

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The execution information of the plan. Specify the parameter in the JSON format. The parameter value varies based on the values of **PlanType** and **PlanScheduleType**. The following section describes the PlanConfig parameter.
         */
        public Builder planConfig(String planConfig) {
            this.putQueryParameter("PlanConfig", planConfig);
            this.planConfig = planConfig;
            return this;
        }

        /**
         * The description of the plan.
         */
        public Builder planDesc(String planDesc) {
            this.putQueryParameter("PlanDesc", planDesc);
            this.planDesc = planDesc;
            return this;
        }

        /**
         * The end time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC. The end time must be later than the start time.
         * <p>
         * 
         * > 
         * 
         * *   This parameter must be specified only for **periodically executed** plans.
         * 
         * *   If you do not specify this parameter, the plan stops until the plan is deleted.
         */
        public Builder planEndDate(String planEndDate) {
            this.putQueryParameter("PlanEndDate", planEndDate);
            this.planEndDate = planEndDate;
            return this;
        }

        /**
         * The ID of the plan.
         * <p>
         * 
         * >  You can call the [DescribeDBInstancePlans](~~449398~~) operation to query the details of plans, including plan IDs.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * The name of the plan.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * The start time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   This parameter must be specified only for **periodically executed** plans.
         * 
         * *   If you do not specify this parameter, the current time is used.
         */
        public Builder planStartDate(String planStartDate) {
            this.putQueryParameter("PlanStartDate", planStartDate);
            this.planStartDate = planStartDate;
            return this;
        }

        @Override
        public UpdateDBInstancePlanRequest build() {
            return new UpdateDBInstancePlanRequest(this);
        } 

    } 

}
