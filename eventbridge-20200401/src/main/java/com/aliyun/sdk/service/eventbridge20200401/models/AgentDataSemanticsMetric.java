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
 * {@link AgentDataSemanticsMetric} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsMetric</p>
 */
public class AgentDataSemanticsMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.NameInMap("SQLExpression")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
    private String SQLExpression;

    @com.aliyun.core.annotation.NameInMap("Synonyms")
    private java.util.List<String> synonyms;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AgentDataSemanticsMetric(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.SQLExpression = builder.SQLExpression;
        this.synonyms = builder.synonyms;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsMetric create() {
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
     * @return SQLExpression
     */
    public String getSQLExpression() {
        return this.SQLExpression;
    }

    /**
     * @return synonyms
     */
    public java.util.List<String> getSynonyms() {
        return this.synonyms;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String SQLExpression; 
        private java.util.List<String> synonyms; 
        private String type; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsMetric model) {
            this.description = model.description;
            this.name = model.name;
            this.SQLExpression = model.SQLExpression;
            this.synonyms = model.synonyms;
            this.type = model.type;
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
         * <p>总销售额</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM(sales_transactions.totalPrice)</p>
         */
        public Builder SQLExpression(String SQLExpression) {
            this.SQLExpression = SQLExpression;
            return this;
        }

        /**
         * Synonyms.
         */
        public Builder synonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>measure</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AgentDataSemanticsMetric build() {
            return new AgentDataSemanticsMetric(this);
        } 

    } 

}
