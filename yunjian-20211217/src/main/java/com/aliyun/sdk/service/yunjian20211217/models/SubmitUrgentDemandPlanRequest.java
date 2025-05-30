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
 * {@link SubmitUrgentDemandPlanRequest} extends {@link RequestModel}
 *
 * <p>SubmitUrgentDemandPlanRequest</p>
 */
public class SubmitUrgentDemandPlanRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private SubmitUrgentDemandPlanRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.planId = builder.planId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitUrgentDemandPlanRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SubmitUrgentDemandPlanRequest, Builder> {
        private String yunUserId; 
        private String planId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitUrgentDemandPlanRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.planId = request.planId;
            this.userId = request.userId;
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
            this.putQueryParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>262940</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SubmitUrgentDemandPlanRequest build() {
            return new SubmitUrgentDemandPlanRequest(this);
        } 

    } 

}
