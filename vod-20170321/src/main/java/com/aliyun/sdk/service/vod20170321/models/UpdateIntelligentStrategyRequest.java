// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateIntelligentStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntelligentStrategyRequest</p>
 */
public class UpdateIntelligentStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteParams")
    private String executeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    private UpdateIntelligentStrategyRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.executeParams = builder.executeParams;
        this.name = builder.name;
        this.priority = builder.priority;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntelligentStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return executeParams
     */
    public String getExecuteParams() {
        return this.executeParams;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<UpdateIntelligentStrategyRequest, Builder> {
        private String conditions; 
        private String executeParams; 
        private String name; 
        private Integer priority; 
        private String startTime; 
        private String state; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntelligentStrategyRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.executeParams = request.executeParams;
            this.name = request.name;
            this.priority = request.priority;
            this.startTime = request.startTime;
            this.state = request.state;
            this.strategyId = request.strategyId;
        } 

        /**
         * Conditions.
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * ExecuteParams.
         */
        public Builder executeParams(String executeParams) {
            this.putQueryParameter("ExecuteParams", executeParams);
            this.executeParams = executeParams;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public UpdateIntelligentStrategyRequest build() {
            return new UpdateIntelligentStrategyRequest(this);
        } 

    } 

}
