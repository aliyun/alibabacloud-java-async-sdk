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
 * {@link DeleteDBInstancePlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteDBInstancePlanRequest</p>
 */
public class DeleteDBInstancePlanRequest extends Request {
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

    private DeleteDBInstancePlanRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBInstancePlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDBInstancePlanRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDBInstancePlanRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.planId = request.planId;
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

        @Override
        public DeleteDBInstancePlanRequest build() {
            return new DeleteDBInstancePlanRequest(this);
        } 

    } 

}
