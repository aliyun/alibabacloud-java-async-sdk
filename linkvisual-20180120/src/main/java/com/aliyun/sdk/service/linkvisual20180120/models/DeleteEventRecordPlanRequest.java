// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventRecordPlanRequest</p>
 */
public class DeleteEventRecordPlanRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private DeleteEventRecordPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventRecordPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<DeleteEventRecordPlanRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventRecordPlanRequest request) {
            super(request);
            this.planId = request.planId;
        } 

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public DeleteEventRecordPlanRequest build() {
            return new DeleteEventRecordPlanRequest(this);
        } 

    } 

}
