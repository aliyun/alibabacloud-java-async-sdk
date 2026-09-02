// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AgentDataSemanticsJoin} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsJoin</p>
 */
public class AgentDataSemanticsJoin extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Condition")
    @com.aliyun.core.annotation.Validation(required = true)
    private AgentDataSemanticsJoinCondition condition;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.NameInMap("LeftTable")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512)
    private String leftTable;

    @com.aliyun.core.annotation.NameInMap("RelationshipType")
    private String relationshipType;

    @com.aliyun.core.annotation.NameInMap("RightTable")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512)
    private String rightTable;

    private AgentDataSemanticsJoin(Builder builder) {
        this.condition = builder.condition;
        this.description = builder.description;
        this.leftTable = builder.leftTable;
        this.relationshipType = builder.relationshipType;
        this.rightTable = builder.rightTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsJoin create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public AgentDataSemanticsJoinCondition getCondition() {
        return this.condition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return leftTable
     */
    public String getLeftTable() {
        return this.leftTable;
    }

    /**
     * @return relationshipType
     */
    public String getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * @return rightTable
     */
    public String getRightTable() {
        return this.rightTable;
    }

    public static final class Builder {
        private AgentDataSemanticsJoinCondition condition; 
        private String description; 
        private String leftTable; 
        private String relationshipType; 
        private String rightTable; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsJoin model) {
            this.condition = model.condition;
            this.description = model.description;
            this.leftTable = model.leftTable;
            this.relationshipType = model.relationshipType;
            this.rightTable = model.rightTable;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder condition(AgentDataSemanticsJoinCondition condition) {
            this.condition = condition;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>samples.bakehouse.sales_transactions</p>
         */
        public Builder leftTable(String leftTable) {
            this.leftTable = leftTable;
            return this;
        }

        /**
         * RelationshipType.
         */
        public Builder relationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>samples.bakehouse.customers</p>
         */
        public Builder rightTable(String rightTable) {
            this.rightTable = rightTable;
            return this;
        }

        public AgentDataSemanticsJoin build() {
            return new AgentDataSemanticsJoin(this);
        } 

    } 

}
