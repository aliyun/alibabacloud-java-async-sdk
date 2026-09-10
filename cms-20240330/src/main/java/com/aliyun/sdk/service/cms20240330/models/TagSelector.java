// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link TagSelector} extends {@link TeaModel}
 *
 * <p>TagSelector</p>
 */
public class TagSelector extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<TagCondition> conditions;

    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    private TagSelector(Builder builder) {
        this.conditions = builder.conditions;
        this.expression = builder.expression;
        this.relation = builder.relation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagSelector create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<TagCondition> getConditions() {
        return this.conditions;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    public static final class Builder {
        private java.util.List<TagCondition> conditions; 
        private String expression; 
        private String relation; 

        private Builder() {
        } 

        private Builder(TagSelector model) {
            this.conditions = model.conditions;
            this.expression = model.expression;
            this.relation = model.relation;
        } 

        /**
         * <p>The list of label filter conditions.</p>
         */
        public Builder conditions(java.util.List<TagCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The custom expression in advanced mode, which overwrites conditions and relation.</p>
         * 
         * <strong>example:</strong>
         * <p>env=prod AND region=cn-hangzhou</p>
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * <p>The condition relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        public TagSelector build() {
            return new TagSelector(this);
        } 

    } 

}
