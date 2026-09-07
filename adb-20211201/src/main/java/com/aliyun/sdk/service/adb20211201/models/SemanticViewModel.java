// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SemanticViewModel} extends {@link TeaModel}
 *
 * <p>SemanticViewModel</p>
 */
public class SemanticViewModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("ViewName")
    private String viewName;

    @com.aliyun.core.annotation.NameInMap("ViewSchema")
    private String viewSchema;

    private SemanticViewModel(Builder builder) {
        this.comment = builder.comment;
        this.definition = builder.definition;
        this.score = builder.score;
        this.viewName = builder.viewName;
        this.viewSchema = builder.viewSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SemanticViewModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return viewName
     */
    public String getViewName() {
        return this.viewName;
    }

    /**
     * @return viewSchema
     */
    public String getViewSchema() {
        return this.viewSchema;
    }

    public static final class Builder {
        private String comment; 
        private String definition; 
        private Double score; 
        private String viewName; 
        private String viewSchema; 

        private Builder() {
        } 

        private Builder(SemanticViewModel model) {
            this.comment = model.comment;
            this.definition = model.definition;
            this.score = model.score;
            this.viewName = model.viewName;
            this.viewSchema = model.viewSchema;
        } 

        /**
         * <p>The annotation for the semantic view</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个定义销售额相关指标的视图</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The YAML definition of the semantic view</p>
         * 
         * <strong>example:</strong>
         * <p>name: revenue_analysis
         * description: &quot;Semantic view for analyzing revenue across products and customers&quot;</p>
         * <p>tables:</p>
         * <ul>
         * <li><p>name: customers
         * description: &quot;Customer information&quot;
         * base_table:
         *   schema: sales_db
         *   table: customers
         * dimensions:</p>
         * <ul>
         * <li>name: customer_name
         * synonyms: [&quot;client name&quot;, &quot;customer&quot;]
         * description: &quot;Full name of the customer&quot;
         * expr: c_name
         * data_type: VARCHAR</li>
         * <li>name: customer_segment
         * synonyms: [&quot;segment&quot;, &quot;market segment&quot;]
         * description: &quot;Customer market segment&quot;
         * expr: c_mktsegment
         * data_type: VARCHAR
         * is_enum: true</li>
         * </ul>
         * </li>
         * <li><p>name: orders
         * description: &quot;Order information&quot;
         * base_table:
         *   schema: sales_db
         *   table: orders
         * dimensions:</p>
         * <ul>
         * <li>name: order_date
         * description: &quot;Date when order was placed&quot;
         * expr: o_orderdate
         * data_type: DATE</li>
         * <li>name: order_year
         * description: &quot;Year when order was placed&quot;
         * expr: YEAR(o_orderdate)
         * data_type: NUMBER
         * facts:</li>
         * <li>name: order_total
         * description: &quot;Total order amount&quot;
         * expr: o_totalprice
         * data_type: NUMBER
         * metrics:</li>
         * <li>name: total_orders
         * description: &quot;Total number of orders&quot;
         * expr: COUNT(*)</li>
         * <li>name: total_revenue
         * description: &quot;Total revenue of orders&quot;
         * expr: SUM(o_totalprice)</li>
         * <li>name: average_order_value
         * description: &quot;Average order value&quot;
         * expr: AVG(o_totalprice)</li>
         * </ul>
         * </li>
         * </ul>
         * <p>relationships:</p>
         * <ul>
         * <li>name: orders_to_customers
         * left_table: orders
         * right_table: customers
         * relationship_columns:<ul>
         * <li>left_column: o_custkey
         * right_column: c_custkey</li>
         * </ul>
         * </li>
         * </ul>
         * <p>metrics:</p>
         * <ul>
         * <li>name: revenue_per_customer
         * description: &quot;Average revenue per customer&quot;
         * expr: orders.total_revenue / customers.customer_count</li>
         * </ul>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>The vector retrieval match score (defaults to 1; during retrieval queries, it is a decimal between 0 and 1 representing vector similarity)</p>
         * 
         * <strong>example:</strong>
         * <p>0.81</p>
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The name of the semantic view</p>
         * 
         * <strong>example:</strong>
         * <p>revenue_analysis</p>
         */
        public Builder viewName(String viewName) {
            this.viewName = viewName;
            return this;
        }

        /**
         * <p>The schema where the semantic view resides</p>
         * 
         * <strong>example:</strong>
         * <p>sales_db</p>
         */
        public Builder viewSchema(String viewSchema) {
            this.viewSchema = viewSchema;
            return this;
        }

        public SemanticViewModel build() {
            return new SemanticViewModel(this);
        } 

    } 

}
