// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDBInstancePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstancePlanRequest</p>
 */
public class CreateDBInstancePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanDesc")
    private String planDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanEndDate")
    private String planEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanScheduleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planScheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanStartDate")
    private String planStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
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
         * <p>The execution information of the plan. Specify the parameter in the JSON format. The parameter value varies based on the values of <strong>PlanType</strong> and <strong>PlanScheduleType</strong>. The following section describes the PlanConfig parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pause&quot;:{&quot;planCronTime&quot;:&quot;0 0 12 1/1 * ? &quot;},&quot;resume&quot;:{&quot;planCronTime&quot;:&quot;0 0 0 1/1 * ? &quot;}}</p>
         */
        public Builder planConfig(String planConfig) {
            this.putQueryParameter("PlanConfig", planConfig);
            this.planConfig = planConfig;
            return this;
        }

        /**
         * <p>The description of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test plan</p>
         */
        public Builder planDesc(String planDesc) {
            this.putQueryParameter("PlanDesc", planDesc);
            this.planDesc = planDesc;
            return this;
        }

        /**
         * <p>The end time of the plan. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC. The end time must be later than the start time.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified only when <strong>PlanScheduleType</strong> is set to <strong>Regular</strong>.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the plan stops until the plan is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2023-04-17T23:00Z</p>
         */
        public Builder planEndDate(String planEndDate) {
            this.putQueryParameter("PlanEndDate", planEndDate);
            this.planEndDate = planEndDate;
            return this;
        }

        /**
         * <p>The name of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test-plan</p>
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>The execution mode of the plan. Valid values:</p>
         * <ul>
         * <li><strong>Postpone</strong>: The plan is executed later.</li>
         * <li><strong>Regular</strong>: The plan is executed periodically.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Regular</p>
         */
        public Builder planScheduleType(String planScheduleType) {
            this.putQueryParameter("PlanScheduleType", planScheduleType);
            this.planScheduleType = planScheduleType;
            return this;
        }

        /**
         * <p>The start time of the plan. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified only when <strong>PlanScheduleType</strong> is set to <strong>Regular</strong>.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the current time is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2022-04-17T23:00Z</p>
         */
        public Builder planStartDate(String planStartDate) {
            this.putQueryParameter("PlanStartDate", planStartDate);
            this.planStartDate = planStartDate;
            return this;
        }

        /**
         * <p>The type of the plan. Valid values:</p>
         * <ul>
         * <li><strong>PauseResume</strong>: pauses and resumes an instance.</li>
         * <li><strong>Resize</strong>: changes the number of compute nodes.</li>
         * <li><strong>ModifySpec</strong>: changes compute node specifications.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can specify the value to ModifySpec only for instances in elastic storage mode.</li>
         * <li>You can specify the value to ModifySpec only for instances in elastic storage mode.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PauseResume</p>
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
