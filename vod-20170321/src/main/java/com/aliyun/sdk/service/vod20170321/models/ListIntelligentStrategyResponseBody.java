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
 * {@link ListIntelligentStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntelligentStrategyResponseBody</p>
 */
public class ListIntelligentStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IntelligentStrategyList")
    private java.util.List<IntelligentStrategyList> intelligentStrategyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListIntelligentStrategyResponseBody(Builder builder) {
        this.intelligentStrategyList = builder.intelligentStrategyList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntelligentStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intelligentStrategyList
     */
    public java.util.List<IntelligentStrategyList> getIntelligentStrategyList() {
        return this.intelligentStrategyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<IntelligentStrategyList> intelligentStrategyList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListIntelligentStrategyResponseBody model) {
            this.intelligentStrategyList = model.intelligentStrategyList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * IntelligentStrategyList.
         */
        public Builder intelligentStrategyList(java.util.List<IntelligentStrategyList> intelligentStrategyList) {
            this.intelligentStrategyList = intelligentStrategyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListIntelligentStrategyResponseBody build() {
            return new ListIntelligentStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntelligentStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntelligentStrategyResponseBody</p>
     */
    public static class IntelligentStrategyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private String conditions;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteParams")
        private String executeParams;

        @com.aliyun.core.annotation.NameInMap("MatchLimit")
        private Long matchLimit;

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

        private IntelligentStrategyList(Builder builder) {
            this.conditions = builder.conditions;
            this.creationTime = builder.creationTime;
            this.executeParams = builder.executeParams;
            this.matchLimit = builder.matchLimit;
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

        public static IntelligentStrategyList create() {
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
         * @return matchLimit
         */
        public Long getMatchLimit() {
            return this.matchLimit;
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
            private Long matchLimit; 
            private String modifiedTime; 
            private String name; 
            private Integer priority; 
            private String startTime; 
            private String state; 
            private String strategyId; 
            private String type; 

            private Builder() {
            } 

            private Builder(IntelligentStrategyList model) {
                this.conditions = model.conditions;
                this.creationTime = model.creationTime;
                this.executeParams = model.executeParams;
                this.matchLimit = model.matchLimit;
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
             * MatchLimit.
             */
            public Builder matchLimit(Long matchLimit) {
                this.matchLimit = matchLimit;
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

            public IntelligentStrategyList build() {
                return new IntelligentStrategyList(this);
            } 

        } 

    }
}
