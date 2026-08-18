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
 * {@link DeleteRoutineEnvironmentVariablesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineEnvironmentVariablesRequest</p>
 */
public class DeleteRoutineEnvironmentVariablesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvironmentVariableKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> environmentVariableKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteRoutineEnvironmentVariablesRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.environmentVariableKeys = builder.environmentVariableKeys;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineEnvironmentVariablesRequest create() {
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
     * @return environmentVariableKeys
     */
    public java.util.List<String> getEnvironmentVariableKeys() {
        return this.environmentVariableKeys;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteRoutineEnvironmentVariablesRequest, Builder> {
        private String env; 
        private java.util.List<String> environmentVariableKeys; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineEnvironmentVariablesRequest request) {
            super(request);
            this.env = request.env;
            this.environmentVariableKeys = request.environmentVariableKeys;
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
         * <p>[&quot;LOG_LEVEL&quot;]</p>
         */
        public Builder environmentVariableKeys(java.util.List<String> environmentVariableKeys) {
            String environmentVariableKeysShrink = shrink(environmentVariableKeys, "EnvironmentVariableKeys", "json");
            this.putBodyParameter("EnvironmentVariableKeys", environmentVariableKeysShrink);
            this.environmentVariableKeys = environmentVariableKeys;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-routine</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteRoutineEnvironmentVariablesRequest build() {
            return new DeleteRoutineEnvironmentVariablesRequest(this);
        } 

    } 

}
