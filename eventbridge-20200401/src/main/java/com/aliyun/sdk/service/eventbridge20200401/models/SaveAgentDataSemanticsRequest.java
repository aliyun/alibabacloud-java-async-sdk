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
 * {@link SaveAgentDataSemanticsRequest} extends {@link RequestModel}
 *
 * <p>SaveAgentDataSemanticsRequest</p>
 */
public class SaveAgentDataSemanticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Examples")
    private java.util.List<AgentDataSemanticsExample> examples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Joins")
    private java.util.List<AgentDataSemanticsJoin> joins;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<AgentDataSemanticsMetric> metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private AgentDataSemanticsText text;

    private SaveAgentDataSemanticsRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.examples = builder.examples;
        this.joins = builder.joins;
        this.metrics = builder.metrics;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAgentDataSemanticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return examples
     */
    public java.util.List<AgentDataSemanticsExample> getExamples() {
        return this.examples;
    }

    /**
     * @return joins
     */
    public java.util.List<AgentDataSemanticsJoin> getJoins() {
        return this.joins;
    }

    /**
     * @return metrics
     */
    public java.util.List<AgentDataSemanticsMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * @return text
     */
    public AgentDataSemanticsText getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SaveAgentDataSemanticsRequest, Builder> {
        private String agentName; 
        private java.util.List<AgentDataSemanticsExample> examples; 
        private java.util.List<AgentDataSemanticsJoin> joins; 
        private java.util.List<AgentDataSemanticsMetric> metrics; 
        private AgentDataSemanticsText text; 

        private Builder() {
            super();
        } 

        private Builder(SaveAgentDataSemanticsRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.examples = request.examples;
            this.joins = request.joins;
            this.metrics = request.metrics;
            this.text = request.text;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bakehouse_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * Examples.
         */
        public Builder examples(java.util.List<AgentDataSemanticsExample> examples) {
            String examplesShrink = shrink(examples, "Examples", "json");
            this.putBodyParameter("Examples", examplesShrink);
            this.examples = examples;
            return this;
        }

        /**
         * Joins.
         */
        public Builder joins(java.util.List<AgentDataSemanticsJoin> joins) {
            String joinsShrink = shrink(joins, "Joins", "json");
            this.putBodyParameter("Joins", joinsShrink);
            this.joins = joins;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<AgentDataSemanticsMetric> metrics) {
            String metricsShrink = shrink(metrics, "Metrics", "json");
            this.putBodyParameter("Metrics", metricsShrink);
            this.metrics = metrics;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(AgentDataSemanticsText text) {
            String textShrink = shrink(text, "Text", "json");
            this.putBodyParameter("Text", textShrink);
            this.text = text;
            return this;
        }

        @Override
        public SaveAgentDataSemanticsRequest build() {
            return new SaveAgentDataSemanticsRequest(this);
        } 

    } 

}
