// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetActionPlanRequest} extends {@link RequestModel}
 *
 * <p>GetActionPlanRequest</p>
 */
public class GetActionPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionPlanId")
    private String actionPlanId;

    private GetActionPlanRequest(Builder builder) {
        super(builder);
        this.actionPlanId = builder.actionPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActionPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlanId
     */
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    public static final class Builder extends Request.Builder<GetActionPlanRequest, Builder> {
        private String actionPlanId; 

        private Builder() {
            super();
        } 

        private Builder(GetActionPlanRequest request) {
            super(request);
            this.actionPlanId = request.actionPlanId;
        } 

        /**
         * ActionPlanId.
         */
        public Builder actionPlanId(String actionPlanId) {
            this.putQueryParameter("ActionPlanId", actionPlanId);
            this.actionPlanId = actionPlanId;
            return this;
        }

        @Override
        public GetActionPlanRequest build() {
            return new GetActionPlanRequest(this);
        } 

    } 

}
