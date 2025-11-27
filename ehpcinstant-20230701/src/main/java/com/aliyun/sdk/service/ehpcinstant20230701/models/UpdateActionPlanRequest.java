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
         * <p>The ID of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-hz036ubmx2qmw93k****</p>
         */
        public Builder actionPlanId(String actionPlanId) {
            this.putQueryParameter("ActionPlanId", actionPlanId);
            this.actionPlanId = actionPlanId;
            return this;
        }

        /**
         * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder desiredCapacity(Float desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * <p>Whether to enable the execution plan. Valid values:</p>
         * <ul>
         * <li><p>true: enables the execution plan.</p>
         * </li>
         * <li><p>false: The execution plan is disabled.</p>
         * <p>**</p>
         * <p><strong>Note:</strong> After an execution plan is disabled, the created Instant jobs are not automatically managed by the execution plan.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
