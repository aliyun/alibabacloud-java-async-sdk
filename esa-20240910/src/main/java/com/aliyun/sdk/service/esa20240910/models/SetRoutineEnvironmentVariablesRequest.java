// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetRoutineEnvironmentVariablesRequest} extends {@link RequestModel}
 *
 * <p>SetRoutineEnvironmentVariablesRequest</p>
 */
public class SetRoutineEnvironmentVariablesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, EnvironmentVariablesValue> environmentVariables;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private SetRoutineEnvironmentVariablesRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.environmentVariables = builder.environmentVariables;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRoutineEnvironmentVariablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, EnvironmentVariablesValue> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<SetRoutineEnvironmentVariablesRequest, Builder> {
        private String env; 
        private java.util.Map<String, EnvironmentVariablesValue> environmentVariables; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(SetRoutineEnvironmentVariablesRequest request) {
            super(request);
            this.env = request.env;
            this.environmentVariables = request.environmentVariables;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;EnvironmentVariables&quot;: {
         *         &quot;Env_Key_1&quot;: {
         *             &quot;Type&quot;: &quot;plain_text&quot;,
         *             &quot;Value&quot;: &quot;value&quot;
         *         },
         *         &quot;PASSWORD&quot;: {
         *             &quot;Type&quot;: &quot;secret_text&quot;,
         *             &quot;Value&quot;: &quot;secret-password&quot;
         *         }
         *     }</p>
         */
        public Builder environmentVariables(java.util.Map<String, EnvironmentVariablesValue> environmentVariables) {
            String environmentVariablesShrink = shrink(environmentVariables, "EnvironmentVariables", "json");
            this.putBodyParameter("EnvironmentVariables", environmentVariablesShrink);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public SetRoutineEnvironmentVariablesRequest build() {
            return new SetRoutineEnvironmentVariablesRequest(this);
        } 

    } 

}
