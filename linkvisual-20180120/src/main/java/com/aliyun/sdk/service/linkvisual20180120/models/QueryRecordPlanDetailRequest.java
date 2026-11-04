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
 * {@link QueryRecordPlanDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordPlanDetailRequest</p>
 */
public class QueryRecordPlanDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    private QueryRecordPlanDetailRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordPlanDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryRecordPlanDetailRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordPlanDetailRequest request) {
            super(request);
            this.planId = request.planId;
        } 

        /**
         * <p>The ID of the recording plan. You can call <a href="https://help.aliyun.com/document_detail/107896.html">QueryRecordPlans</a> to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b60bf0dd55944c19d7817442bc9****</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public QueryRecordPlanDetailRequest build() {
            return new QueryRecordPlanDetailRequest(this);
        } 

    } 

}
