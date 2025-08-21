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
 * {@link DeleteActionPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteActionPlanRequest</p>
 */
public class DeleteActionPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionPlanId")
    private String actionPlanId;

    private DeleteActionPlanRequest(Builder builder) {
        super(builder);
        this.actionPlanId = builder.actionPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteActionPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteActionPlanRequest, Builder> {
        private String actionPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteActionPlanRequest request) {
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
        public DeleteActionPlanRequest build() {
            return new DeleteActionPlanRequest(this);
        } 

    } 

}
