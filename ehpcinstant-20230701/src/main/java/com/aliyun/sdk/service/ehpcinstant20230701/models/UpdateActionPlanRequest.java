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
 * {@link UpdateActionPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateActionPlanRequest</p>
 */
public class UpdateActionPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionPlanId")
    private String actionPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Float desiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private String enabled;

    private UpdateActionPlanRequest(Builder builder) {
        super(builder);
        this.actionPlanId = builder.actionPlanId;
        this.desiredCapacity = builder.desiredCapacity;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateActionPlanRequest create() {
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

    /**
     * @return desiredCapacity
     */
    public Float getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return this.enabled;
    }

    public static final class Builder extends Request.Builder<UpdateActionPlanRequest, Builder> {
        private String actionPlanId; 
        private Float desiredCapacity; 
        private String enabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateActionPlanRequest request) {
            super(request);
            this.actionPlanId = request.actionPlanId;
            this.desiredCapacity = request.desiredCapacity;
            this.enabled = request.enabled;
        } 

        /**
         * ActionPlanId.
         */
        public Builder actionPlanId(String actionPlanId) {
            this.putQueryParameter("ActionPlanId", actionPlanId);
            this.actionPlanId = actionPlanId;
            return this;
        }

        /**
         * DesiredCapacity.
         */
        public Builder desiredCapacity(Float desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(String enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        @Override
        public UpdateActionPlanRequest build() {
            return new UpdateActionPlanRequest(this);
        } 

    } 

}
