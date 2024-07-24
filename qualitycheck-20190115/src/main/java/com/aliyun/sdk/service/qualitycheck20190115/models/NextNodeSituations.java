// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NextNodeSituations} extends {@link TeaModel}
 *
 * <p>NextNodeSituations</p>
 */
public class NextNodeSituations extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionGroup")
    private java.util.List < ConditionGroup> conditionGroup;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private NextNodeSituations(Builder builder) {
        this.conditionGroup = builder.conditionGroup;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NextNodeSituations create() {
        return builder().build();
    }

    /**
     * @return conditionGroup
     */
    public java.util.List < ConditionGroup> getConditionGroup() {
        return this.conditionGroup;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < ConditionGroup> conditionGroup; 
        private String type; 

        /**
         * ConditionGroup.
         */
        public Builder conditionGroup(java.util.List < ConditionGroup> conditionGroup) {
            this.conditionGroup = conditionGroup;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public NextNodeSituations build() {
            return new NextNodeSituations(this);
        } 

    } 

    public static class ConditionGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < JudgeNodeMetaDesc > conditions;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ConditionGroup(Builder builder) {
            this.conditions = builder.conditions;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionGroup create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < JudgeNodeMetaDesc > getConditions() {
            return this.conditions;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < JudgeNodeMetaDesc > conditions; 
            private String type; 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List < JudgeNodeMetaDesc > conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConditionGroup build() {
                return new ConditionGroup(this);
            } 

        } 

    }
}
