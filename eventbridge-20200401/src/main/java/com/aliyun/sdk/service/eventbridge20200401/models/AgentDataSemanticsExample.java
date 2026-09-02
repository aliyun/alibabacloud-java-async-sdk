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
 * {@link AgentDataSemanticsExample} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsExample</p>
 */
public class AgentDataSemanticsExample extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<AgentDataSemanticsExampleParameter> parameters;

    @com.aliyun.core.annotation.NameInMap("SQLExpression")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
    private String SQLExpression;

    private AgentDataSemanticsExample(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.SQLExpression = builder.SQLExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsExample create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return parameters
     */
    public java.util.List<AgentDataSemanticsExampleParameter> getParameters() {
        return this.parameters;
    }

    /**
     * @return SQLExpression
     */
    public String getSQLExpression() {
        return this.SQLExpression;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private java.util.List<AgentDataSemanticsExampleParameter> parameters; 
        private String SQLExpression; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsExample model) {
            this.description = model.description;
            this.name = model.name;
            this.parameters = model.parameters;
            this.SQLExpression = model.SQLExpression;
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
         * <p>任意一周销售额超过 150 的高价值客户</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List<AgentDataSemanticsExampleParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT customerID FROM sales_transactions</p>
         */
        public Builder SQLExpression(String SQLExpression) {
            this.SQLExpression = SQLExpression;
            return this;
        }

        public AgentDataSemanticsExample build() {
            return new AgentDataSemanticsExample(this);
        } 

    } 

}
