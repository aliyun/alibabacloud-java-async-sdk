// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link DeleteEventRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventRecordPlanRequest</p>
 */
public class DeleteEventRecordPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the intelligent alert event recording plan. You can call the <a href="https://help.aliyun.com/document_detail/107907.html">QueryEventRecordPlans</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2e34a1989aa54debac22358aca7f****</p>
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
