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
 * {@link GetIntelligentStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntelligentStrategyResponseBody</p>
 */
public class GetIntelligentStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IntelligentStrategy")
    private IntelligentStrategy intelligentStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIntelligentStrategyResponseBody(Builder builder) {
        this.intelligentStrategy = builder.intelligentStrategy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntelligentStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intelligentStrategy
     */
    public IntelligentStrategy getIntelligentStrategy() {
        return this.intelligentStrategy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IntelligentStrategy intelligentStrategy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIntelligentStrategyResponseBody model) {
            this.intelligentStrategy = model.intelligentStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * IntelligentStrategy.
         */
        public Builder intelligentStrategy(IntelligentStrategy intelligentStrategy) {
            this.intelligentStrategy = intelligentStrategy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntelligentStrategyResponseBody build() {
            return new GetIntelligentStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIntelligentStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntelligentStrategyResponseBody</p>
     */
    public static class IntelligentStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private String conditions;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteParams")
        private String executeParams;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IntelligentStrategy(Builder builder) {
            this.conditions = builder.conditions;
            this.creationTime = builder.creationTime;
            this.executeParams = builder.executeParams;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.priority = builder.priority;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.strategyId = builder.strategyId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntelligentStrategy create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public String getConditions() {
            return this.conditions;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return executeParams
         */
        public String getExecuteParams() {
            return this.executeParams;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String conditions; 
            private String creationTime; 
            private String executeParams; 
            private String modifiedTime; 
            private String name; 
            private Integer priority; 
            private String startTime; 
            private String state; 
            private String strategyId; 
            private String type; 

            private Builder() {
            } 

            private Builder(IntelligentStrategy model) {
                this.conditions = model.conditions;
                this.creationTime = model.creationTime;
                this.executeParams = model.executeParams;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.priority = model.priority;
                this.startTime = model.startTime;
                this.state = model.state;
                this.strategyId = model.strategyId;
                this.type = model.type;
            } 

            /**
             * Conditions.
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ExecuteParams.
             */
            public Builder executeParams(String executeParams) {
                this.executeParams = executeParams;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IntelligentStrategy build() {
                return new IntelligentStrategy(this);
            } 

        } 

    }
}
