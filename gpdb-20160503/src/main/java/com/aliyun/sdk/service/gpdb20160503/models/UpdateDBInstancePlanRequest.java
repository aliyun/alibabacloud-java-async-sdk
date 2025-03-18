// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>{&quot;pause&quot;:{&quot;executeTime&quot;:&quot;2022-08-30T16:00:00Z&quot;}}</p>
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
         * <li><p>This parameter must be specified only for <strong>periodically executed</strong> plans.</p>
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
         * <p>The ID of the plan.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/449398.html">DescribeDBInstancePlans</a> operation to query the details of plans, including plan IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The start time of the plan. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified only for <strong>periodically executed</strong> plans.</p>
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

        @Override
        public UpdateDBInstancePlanRequest build() {
            return new UpdateDBInstancePlanRequest(this);
        } 

    } 

}
