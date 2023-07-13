// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Subscription} extends {@link TeaModel}
 *
 * <p>Subscription</p>
 */
public class Subscription extends TeaModel {
    @NameInMap("Conditions")
    private java.util.List < Conditions> conditions;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @NameInMap("Relation")
    private String relation;

    @NameInMap("StrategyUuid")
    private String strategyUuid;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Uuid")
    private String uuid;

    private Subscription(Builder builder) {
        this.conditions = builder.conditions;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.name = builder.name;
        this.relation = builder.relation;
        this.strategyUuid = builder.strategyUuid;
        this.updateTime = builder.updateTime;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Subscription create() {
        return builder().build();
    }

    /**
     * @return conditions
     */
    public java.util.List < Conditions> getConditions() {
        return this.conditions;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return strategyUuid
     */
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private java.util.List < Conditions> conditions; 
        private String createTime; 
        private String description; 
        private String name; 
        private String relation; 
        private String strategyUuid; 
        private String updateTime; 
        private String uuid; 

        /**
         * Conditions.
         */
        public Builder conditions(java.util.List < Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * Relation.
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * StrategyUuid.
         */
        public Builder strategyUuid(String strategyUuid) {
            this.strategyUuid = strategyUuid;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Subscription build() {
            return new Subscription(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("Field")
        private String field;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String operator; 
            private String value; 

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
}
