// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdateApplicationEnvironmentVariablesRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationEnvironmentVariablesRequest</p>
 */
public class UpdateApplicationEnvironmentVariablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Variables")
    private java.util.Map<String, ?> variables;

    private UpdateApplicationEnvironmentVariablesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.restart = builder.restart;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationEnvironmentVariablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationEnvironmentVariablesRequest, Builder> {
        private String applicationId; 
        private Boolean restart; 
        private java.util.Map<String, ?> variables; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationEnvironmentVariablesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.restart = request.restart;
            this.variables = request.variables;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(java.util.Map<String, ?> variables) {
            String variablesShrink = shrink(variables, "Variables", "json");
            this.putQueryParameter("Variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public UpdateApplicationEnvironmentVariablesRequest build() {
            return new UpdateApplicationEnvironmentVariablesRequest(this);
        } 

    } 

}
