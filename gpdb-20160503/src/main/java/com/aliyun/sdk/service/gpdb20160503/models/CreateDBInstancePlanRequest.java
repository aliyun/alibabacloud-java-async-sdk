// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstancePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstancePlanRequest</p>
 */
public class CreateDBInstancePlanRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlanConfig")
    @Validation(required = true)
    private String planConfig;

    @Query
    @NameInMap("PlanDesc")
    private String planDesc;

    @Query
    @NameInMap("PlanEndDate")
    private String planEndDate;

    @Query
    @NameInMap("PlanName")
    @Validation(required = true)
    private String planName;

    @Query
    @NameInMap("PlanScheduleType")
    @Validation(required = true)
    private String planScheduleType;

    @Query
    @NameInMap("PlanStartDate")
    private String planStartDate;

    @Query
    @NameInMap("PlanType")
    @Validation(required = true)
    private String planType;

    private CreateDBInstancePlanRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.planConfig = builder.planConfig;
        this.planDesc = builder.planDesc;
        this.planEndDate = builder.planEndDate;
        this.planName = builder.planName;
        this.planScheduleType = builder.planScheduleType;
        this.planStartDate = builder.planStartDate;
        this.planType = builder.planType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstancePlanRequest create() {
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
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return planScheduleType
     */
    public String getPlanScheduleType() {
        return this.planScheduleType;
    }

    /**
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return this.planStartDate;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
    }

    public static final class Builder extends Request.Builder<CreateDBInstancePlanRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String planConfig; 
        private String planDesc; 
        private String planEndDate; 
        private String planName; 
        private String planScheduleType; 
        private String planStartDate; 
        private String planType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstancePlanRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.planConfig = request.planConfig;
            this.planDesc = request.planDesc;
            this.planEndDate = request.planEndDate;
            this.planName = request.planName;
            this.planScheduleType = request.planScheduleType;
            this.planStartDate = request.planStartDate;
            this.planType = request.planType;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.
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
         * The end time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC. The end time must be later than the start time.
         * <p>
         * 
         * > 
         * 
         * *   This parameter must be specified only when **PlanScheduleType** is set to **Regular**.
         * 
         * *   If you do not specify this parameter, the plan does not end.
         */
        public Builder planEndDate(String planEndDate) {
            this.putQueryParameter("PlanEndDate", planEndDate);
            this.planEndDate = planEndDate;
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
         * The execution mode of the plan. Valid values:
         * <p>
         * 
         * *   **Postpone**: The plan is executed later.
         * *   **Regular**: The plan is executed periodically.
         */
        public Builder planScheduleType(String planScheduleType) {
            this.putQueryParameter("PlanScheduleType", planScheduleType);
            this.planScheduleType = planScheduleType;
            return this;
        }

        /**
         * The start time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   This parameter must be specified only when **PlanScheduleType** is set to **Regular**.
         * 
         * *   If you do not specify this parameter, the plan is executed immediately.
         */
        public Builder planStartDate(String planStartDate) {
            this.putQueryParameter("PlanStartDate", planStartDate);
            this.planStartDate = planStartDate;
            return this;
        }

        /**
         * The type of the plan. Valid values:
         * <p>
         * 
         * *   **PauseResume**: pauses and resumes an instance.
         * *   **Resize**: changes the number of compute nodes.
         * *   **ModifySpec**: changes compute node specifications.
         * 
         * > 
         * 
         * *   You can specify the value to Resize only for instances in Serverless mode.
         * 
         * *   You can specify the value to ModifySpec only for instances in elastic storage mode.
         */
        public Builder planType(String planType) {
            this.putQueryParameter("PlanType", planType);
            this.planType = planType;
            return this;
        }

        @Override
        public CreateDBInstancePlanRequest build() {
            return new CreateDBInstancePlanRequest(this);
        } 

    } 

}
