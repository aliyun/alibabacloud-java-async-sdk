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
 * {@link AgentDataSemanticsJoinCondition} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsJoinCondition</p>
 */
public class AgentDataSemanticsJoinCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LeftColumn")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String leftColumn;

    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.NameInMap("RightColumn")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String rightColumn;

    @com.aliyun.core.annotation.NameInMap("SQLExpression")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String SQLExpression;

    private AgentDataSemanticsJoinCondition(Builder builder) {
        this.leftColumn = builder.leftColumn;
        this.mode = builder.mode;
        this.rightColumn = builder.rightColumn;
        this.SQLExpression = builder.SQLExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsJoinCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return leftColumn
     */
    public String getLeftColumn() {
        return this.leftColumn;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return rightColumn
     */
    public String getRightColumn() {
        return this.rightColumn;
    }

    /**
     * @return SQLExpression
     */
    public String getSQLExpression() {
        return this.SQLExpression;
    }

    public static final class Builder {
        private String leftColumn; 
        private String mode; 
        private String rightColumn; 
        private String SQLExpression; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsJoinCondition model) {
            this.leftColumn = model.leftColumn;
            this.mode = model.mode;
            this.rightColumn = model.rightColumn;
            this.SQLExpression = model.SQLExpression;
        } 

        /**
         * LeftColumn.
         */
        public Builder leftColumn(String leftColumn) {
            this.leftColumn = leftColumn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>form</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * RightColumn.
         */
        public Builder rightColumn(String rightColumn) {
            this.rightColumn = rightColumn;
            return this;
        }

        /**
         * SQLExpression.
         */
        public Builder SQLExpression(String SQLExpression) {
            this.SQLExpression = SQLExpression;
            return this;
        }

        public AgentDataSemanticsJoinCondition build() {
            return new AgentDataSemanticsJoinCondition(this);
        } 

    } 

}
