// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
         * <p>The time that is used to filter plans. If you specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format, the plans that are created before this time are returned. The time must be in UTC. If you do not specify this parameter, all plans are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-17T23:00Z</p>
         */
        public Builder planCreateDate(String planCreateDate) {
            this.putQueryParameter("PlanCreateDate", planCreateDate);
            this.planCreateDate = planCreateDate;
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
         * <p>The plan ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~449398~~">DescribeDBInstancePlans</a> operation to query the information about plans, including plan IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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
         * <p>The type of the plan. Valid values:</p>
         * <ul>
         * <li><strong>PauseResume</strong>: pauses and resumes an instance.</li>
         * <li><strong>Resize</strong>: scales an instance.</li>
         * <li><strong>ModifySpec</strong>: changes compute node specifications.</li>
         * </ul>
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
        public DescribeDBInstancePlansRequest build() {
            return new DescribeDBInstancePlansRequest(this);
        } 

    } 

}
