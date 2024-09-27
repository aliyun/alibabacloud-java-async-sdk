// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDBInstancePlanStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDBInstancePlanStatusRequest</p>
 */
public class SetDBInstancePlanStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planStatus;

    private SetDBInstancePlanStatusRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.planId = builder.planId;
        this.planStatus = builder.planStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDBInstancePlanStatusRequest create() {
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return planStatus
     */
    public String getPlanStatus() {
        return this.planStatus;
    }

    public static final class Builder extends Request.Builder<SetDBInstancePlanStatusRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String planId; 
        private String planStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetDBInstancePlanStatusRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.planId = request.planId;
            this.planStatus = request.planStatus;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
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
         * <p>The ID of the plan.</p>
         * <blockquote>
         * <p> You can call the <a href="~~449398~~">DescribeDBInstancePlans</a> operation to query the details of plans, including plan IDs.</p>
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
         * <p>Specifies whether to enable or disable the plan. Valid values:</p>
         * <ul>
         * <li><strong>disable</strong>: disables the plan.</li>
         * <li><strong>enable</strong>: enables the plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder planStatus(String planStatus) {
            this.putQueryParameter("PlanStatus", planStatus);
            this.planStatus = planStatus;
            return this;
        }

        @Override
        public SetDBInstancePlanStatusRequest build() {
            return new SetDBInstancePlanStatusRequest(this);
        } 

    } 

}
