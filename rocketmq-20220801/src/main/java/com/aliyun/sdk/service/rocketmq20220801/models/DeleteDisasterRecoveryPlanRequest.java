// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link DeleteDisasterRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteDisasterRecoveryPlanRequest</p>
 */
public class DeleteDisasterRecoveryPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    private DeleteDisasterRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDisasterRecoveryPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<DeleteDisasterRecoveryPlanRequest, Builder> {
        private Long planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDisasterRecoveryPlanRequest request) {
            super(request);
            this.planId = request.planId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public DeleteDisasterRecoveryPlanRequest build() {
            return new DeleteDisasterRecoveryPlanRequest(this);
        } 

    } 

}
