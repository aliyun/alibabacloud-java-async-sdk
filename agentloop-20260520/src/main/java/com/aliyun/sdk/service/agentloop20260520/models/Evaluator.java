// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link Evaluator} extends {@link TeaModel}
 *
 * <p>Evaluator</p>
 */
public class Evaluator extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.NameInMap("evaluatorRef")
    private String evaluatorRef;

    @com.aliyun.core.annotation.NameInMap("filters")
    private java.util.Map<String, ?> filters;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resultName")
    private String resultName;

    @com.aliyun.core.annotation.NameInMap("resultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("variableExtractorMapping")
    private java.util.Map<String, EvaluatorVariableExtractorMappingValue> variableExtractorMapping;

    @com.aliyun.core.annotation.NameInMap("variableMapping")
    private java.util.Map<String, String> variableMapping;

    private Evaluator(Builder builder) {
        this.config = builder.config;
        this.evaluatorRef = builder.evaluatorRef;
        this.filters = builder.filters;
        this.name = builder.name;
        this.resultName = builder.resultName;
        this.resultType = builder.resultType;
        this.type = builder.type;
        this.variableExtractorMapping = builder.variableExtractorMapping;
        this.variableMapping = builder.variableMapping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Evaluator create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return evaluatorRef
     */
    public String getEvaluatorRef() {
        return this.evaluatorRef;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resultName
     */
    public String getResultName() {
        return this.resultName;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return variableExtractorMapping
     */
    public java.util.Map<String, EvaluatorVariableExtractorMappingValue> getVariableExtractorMapping() {
        return this.variableExtractorMapping;
    }

    /**
     * @return variableMapping
     */
    public java.util.Map<String, String> getVariableMapping() {
        return this.variableMapping;
    }

    public static final class Builder {
        private java.util.Map<String, ?> config; 
        private String evaluatorRef; 
        private java.util.Map<String, ?> filters; 
        private String name; 
        private String resultName; 
        private String resultType; 
        private String type; 
        private java.util.Map<String, EvaluatorVariableExtractorMappingValue> variableExtractorMapping; 
        private java.util.Map<String, String> variableMapping; 

        private Builder() {
        } 

        private Builder(Evaluator model) {
            this.config = model.config;
            this.evaluatorRef = model.evaluatorRef;
            this.filters = model.filters;
            this.name = model.name;
            this.resultName = model.resultName;
            this.resultType = model.resultType;
            this.type = model.type;
            this.variableExtractorMapping = model.variableExtractorMapping;
            this.variableMapping = model.variableMapping;
        } 

        /**
         * <p>The runtime configuration of the evaluator. For inline LLM evaluators, this must include configurations such as prompt. When referencing an existing evaluator, this parameter is typically not required and should only be specified when runtime parameters such as version need to be set.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:&quot;1.0.0&quot;}</p>
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The reference name of a registered evaluator. When specified, the evaluator definition is loaded by this reference with higher priority. Both built-in evaluators and custom evaluators are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Builtin.agent_task_completion</p>
         */
        public Builder evaluatorRef(String evaluatorRef) {
            this.evaluatorRef = evaluatorRef;
            return this;
        }

        /**
         * <p>The evaluator-level data filter conditions. These take effect together with the task-level dataFilter.query.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot;&quot;}</p>
         */
        public Builder filters(java.util.Map<String, ?> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * <p>The evaluator name. Required for inline evaluators when evaluatorRef is not specified. The evaluatorRef or name must be unique within the same task.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_task_completion</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The field name for the evaluation result. Required for inline evaluators. When referencing an existing evaluator, the metricName defined in the evaluator definition is used if this parameter is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_task_completion</p>
         */
        public Builder resultName(String resultName) {
            this.resultName = resultName;
            return this;
        }

        /**
         * <p>The evaluation result type. Required for inline evaluators. When referencing an existing evaluator, defaults to score if not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>The evaluator type. Defaults to LLM if not specified. Inline CODE evaluators are not currently supported. For the CODE type, reference a previously created evaluator by using evaluatorRef.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The variable extraction rule mapping that maps evaluator variables to a portion of the content within an evaluation data field. This is applicable when the variable value is not the entire field but a subset of the field content. This parameter shares the same variable name key space as variableMapping. Each variable can use only one of the two. Duplicate configurations cause an error. When referencing an existing evaluator, the variable names must exist in the evaluator definition. Call ListTraceFieldExtractionsPreview to perform a trial run for validation before saving.</p>
         */
        public Builder variableExtractorMapping(java.util.Map<String, EvaluatorVariableExtractorMappingValue> variableExtractorMapping) {
            this.variableExtractorMapping = variableExtractorMapping;
            return this;
        }

        /**
         * <p>The variable mapping that maps evaluator variables to evaluation data fields. Required for LLM/AGENT inline evaluators. When referencing an existing evaluator, the variable names must exist in the evaluator definition.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}</p>
         */
        public Builder variableMapping(java.util.Map<String, String> variableMapping) {
            this.variableMapping = variableMapping;
            return this;
        }

        public Evaluator build() {
            return new Evaluator(this);
        } 

    } 

}
