// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link GetUrgentDemandPlanDetailRequest} extends {@link RequestModel}
 *
 * <p>GetUrgentDemandPlanDetailRequest</p>
 */
public class GetUrgentDemandPlanDetailRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    private GetUrgentDemandPlanDetailRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrgentDemandPlanDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<GetUrgentDemandPlanDetailRequest, Builder> {
        private String yunUserId; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(GetUrgentDemandPlanDetailRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.planId = request.planId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>262940</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111223</p>
         */
        public Builder planId(String planId) {
            this.putBodyParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public GetUrgentDemandPlanDetailRequest build() {
            return new GetUrgentDemandPlanDetailRequest(this);
        } 

    } 

}
