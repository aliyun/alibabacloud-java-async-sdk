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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
    private Integer intervalMinutes;

    private UpdateActionPlanRequest(Builder builder) {
        super(builder);
        this.actionPlanId = builder.actionPlanId;
        this.desiredCapacity = builder.desiredCapacity;
        this.enabled = builder.enabled;
        this.intervalMinutes = builder.intervalMinutes;
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

    /**
     * @return intervalMinutes
     */
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public static final class Builder extends Request.Builder<UpdateActionPlanRequest, Builder> {
        private String actionPlanId; 
        private Float desiredCapacity; 
        private String enabled; 
        private Integer intervalMinutes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateActionPlanRequest request) {
            super(request);
            this.actionPlanId = request.actionPlanId;
            this.desiredCapacity = request.desiredCapacity;
            this.enabled = request.enabled;
            this.intervalMinutes = request.intervalMinutes;
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
         * <p>The expected resource scale of the execution plan. If ResourceType is set to VcpuCapacity, this field indicates that the execution plan expects to maintain 10,000 vCPUs.</p>
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
         * <p>Specifies whether to enable the execution plan. Valid values:</p>
         * <ul>
         * <li><p>true: Enables the execution plan.</p>
         * </li>
         * <li><p>false: Disables the execution plan.</p>
         * <blockquote>
         * <p>Notice: After the execution plan is disabled, already created Instant jobs are no longer automatically managed by the execution plan.</p>
         * </blockquote>
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

        /**
         * <p>The scheduling interval of the execution plan. Unit: minutes. Valid values: 10 to 10080. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder intervalMinutes(Integer intervalMinutes) {
            this.putQueryParameter("IntervalMinutes", intervalMinutes);
            this.intervalMinutes = intervalMinutes;
            return this;
        }

        @Override
        public UpdateActionPlanRequest build() {
            return new UpdateActionPlanRequest(this);
        } 

    } 

}
