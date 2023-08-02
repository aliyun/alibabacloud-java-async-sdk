// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDBInstancePlanStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDBInstancePlanStatusRequest</p>
 */
public class SetDBInstancePlanStatusRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("PlanStatus")
    @Validation(required = true)
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
         * Specifies whether to enable or disable the plan. Valid values:
         * <p>
         * 
         * *   **disable**: disables the plan.
         * *   **enable**: enables the plan.
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
