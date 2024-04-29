// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePlansRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstancePlansRequest</p>
 */
public class DescribeDBInstancePlansRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanCreateDate")
    private String planCreateDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanDesc")
    private String planDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanScheduleType")
    private String planScheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanType")
    private String planType;

    private DescribeDBInstancePlansRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.planCreateDate = builder.planCreateDate;
        this.planDesc = builder.planDesc;
        this.planId = builder.planId;
        this.planScheduleType = builder.planScheduleType;
        this.planType = builder.planType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePlansRequest create() {
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
     * @return planCreateDate
     */
    public String getPlanCreateDate() {
        return this.planCreateDate;
    }

    /**
     * @return planDesc
     */
    public String getPlanDesc() {
        return this.planDesc;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return planScheduleType
     */
    public String getPlanScheduleType() {
        return this.planScheduleType;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstancePlansRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String planCreateDate; 
        private String planDesc; 
        private String planId; 
        private String planScheduleType; 
        private String planType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstancePlansRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.planCreateDate = request.planCreateDate;
            this.planDesc = request.planDesc;
            this.planId = request.planId;
            this.planScheduleType = request.planScheduleType;
            this.planType = request.planType;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
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
         * The time used to filter plans. If you specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format, the plans created before this time are returned. The time must be in UTC. If you do not specify this parameter, all plans are returned.
         */
        public Builder planCreateDate(String planCreateDate) {
            this.putQueryParameter("PlanCreateDate", planCreateDate);
            this.planCreateDate = planCreateDate;
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
         * The plan ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstancePlans](~~449398~~) operation to query the information about plans, including plan IDs.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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
         * The type of the plan. Valid values:
         * <p>
         * 
         * *   **PauseResume**: pauses and resumes an instance.
         * *   **Resize**: scales an instance.
         */
        public Builder planType(String planType) {
            this.putQueryParameter("PlanType", planType);
            this.planType = planType;
            return this;
        }

        @Override
        public DescribeDBInstancePlansRequest build() {
            return new DescribeDBInstancePlansRequest(this);
        } 

    } 

}
