// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link EnvironmentConfiguration} extends {@link TeaModel}
 *
 * <p>EnvironmentConfiguration</p>
 */
public class EnvironmentConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("variables")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EnvironmentVariable> variables;

    private EnvironmentConfiguration(Builder builder) {
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return variables
     */
    public java.util.List<EnvironmentVariable> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private java.util.List<EnvironmentVariable> variables; 

        private Builder() {
        } 

        private Builder(EnvironmentConfiguration model) {
            this.variables = model.variables;
        } 

        /**
         * <p>环境变量条目列表，每个条目包含 name、value 和可选 description</p>
         * <p>This parameter is required.</p>
         */
        public Builder variables(java.util.List<EnvironmentVariable> variables) {
            this.variables = variables;
            return this;
        }

        public EnvironmentConfiguration build() {
            return new EnvironmentConfiguration(this);
        } 

    } 

}
