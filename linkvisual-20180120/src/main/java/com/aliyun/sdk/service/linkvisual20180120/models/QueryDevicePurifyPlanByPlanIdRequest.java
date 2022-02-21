// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePurifyPlanByPlanIdRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePurifyPlanByPlanIdRequest</p>
 */
public class QueryDevicePurifyPlanByPlanIdRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private QueryDevicePurifyPlanByPlanIdRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePurifyPlanByPlanIdRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDevicePurifyPlanByPlanIdRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePurifyPlanByPlanIdRequest response) {
            super(response);
            this.planId = response.planId;
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
        public QueryDevicePurifyPlanByPlanIdRequest build() {
            return new QueryDevicePurifyPlanByPlanIdRequest(this);
        } 

    } 

}
