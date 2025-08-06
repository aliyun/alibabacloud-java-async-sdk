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
 * {@link CreateIntelligentStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateIntelligentStrategyRequest</p>
 */
public class CreateIntelligentStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateIntelligentStrategyRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.executeParams = builder.executeParams;
        this.name = builder.name;
        this.priority = builder.priority;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntelligentStrategyRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateIntelligentStrategyRequest, Builder> {
        private String conditions; 
        private String executeParams; 
        private String name; 
        private Integer priority; 
        private String startTime; 
        private String state; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntelligentStrategyRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.executeParams = request.executeParams;
            this.name = request.name;
            this.priority = request.priority;
            this.startTime = request.startTime;
            this.state = request.state;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder executeParams(String executeParams) {
            this.putQueryParameter("ExecuteParams", executeParams);
            this.executeParams = executeParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateIntelligentStrategyRequest build() {
            return new CreateIntelligentStrategyRequest(this);
        } 

    } 

}
