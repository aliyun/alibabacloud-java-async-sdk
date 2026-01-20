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
 * {@link Evaluator} extends {@link TeaModel}
 *
 * <p>Evaluator</p>
 */
public class Evaluator extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.NameInMap("dataScope")
    private String dataScope;

    @com.aliyun.core.annotation.NameInMap("filters")
    private java.util.Map<String, String> filters;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resultName")
    private String resultName;

    @com.aliyun.core.annotation.NameInMap("resultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("variableMapping")
    private java.util.Map<String, String> variableMapping;

    private Evaluator(Builder builder) {
        this.config = builder.config;
        this.dataScope = builder.dataScope;
        this.filters = builder.filters;
        this.name = builder.name;
        this.resultName = builder.resultName;
        this.resultType = builder.resultType;
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
     * @return dataScope
     */
    public String getDataScope() {
        return this.dataScope;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, String> getFilters() {
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
     * @return variableMapping
     */
    public java.util.Map<String, String> getVariableMapping() {
        return this.variableMapping;
    }

    public static final class Builder {
        private java.util.Map<String, ?> config; 
        private String dataScope; 
        private java.util.Map<String, String> filters; 
        private String name; 
        private String resultName; 
        private String resultType; 
        private java.util.Map<String, String> variableMapping; 

        private Builder() {
        } 

        private Builder(Evaluator model) {
            this.config = model.config;
            this.dataScope = model.dataScope;
            this.filters = model.filters;
            this.name = model.name;
            this.resultName = model.resultName;
            this.resultType = model.resultType;
            this.variableMapping = model.variableMapping;
        } 

        /**
         * config.
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }

        /**
         * dataScope.
         */
        public Builder dataScope(String dataScope) {
            this.dataScope = dataScope;
            return this;
        }

        /**
         * filters.
         */
        public Builder filters(java.util.Map<String, String> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resultName.
         */
        public Builder resultName(String resultName) {
            this.resultName = resultName;
            return this;
        }

        /**
         * resultType.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * variableMapping.
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
