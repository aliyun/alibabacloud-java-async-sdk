// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RuleCondition} extends {@link TeaModel}
 *
 * <p>RuleCondition</p>
 */
public class RuleCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("position")
    private String position;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("valueType")
    private String valueType;

    private RuleCondition(Builder builder) {
        this.name = builder.name;
        this.position = builder.position;
        this.relation = builder.relation;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuleCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder {
        private String name; 
        private String position; 
        private String relation; 
        private String value; 
        private String valueType; 

        private Builder() {
        } 

        private Builder(RuleCondition model) {
            this.name = model.name;
            this.position = model.position;
            this.relation = model.relation;
            this.value = model.value;
            this.valueType = model.valueType;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * position.
         */
        public Builder position(String position) {
            this.position = position;
            return this;
        }

        /**
         * relation.
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * valueType.
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public RuleCondition build() {
            return new RuleCondition(this);
        } 

    } 

}
