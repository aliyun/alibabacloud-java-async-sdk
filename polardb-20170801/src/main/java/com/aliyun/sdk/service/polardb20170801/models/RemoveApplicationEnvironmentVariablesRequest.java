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
 * {@link RemoveApplicationEnvironmentVariablesRequest} extends {@link RequestModel}
 *
 * <p>RemoveApplicationEnvironmentVariablesRequest</p>
 */
public class RemoveApplicationEnvironmentVariablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VariableNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> variableNames;

    private RemoveApplicationEnvironmentVariablesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.restart = builder.restart;
        this.variableNames = builder.variableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveApplicationEnvironmentVariablesRequest create() {
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
     * @return variableNames
     */
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

    public static final class Builder extends Request.Builder<RemoveApplicationEnvironmentVariablesRequest, Builder> {
        private String applicationId; 
        private Boolean restart; 
        private java.util.List<String> variableNames; 

        private Builder() {
            super();
        } 

        private Builder(RemoveApplicationEnvironmentVariablesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.restart = request.restart;
            this.variableNames = request.variableNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-********************</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder variableNames(java.util.List<String> variableNames) {
            String variableNamesShrink = shrink(variableNames, "VariableNames", "json");
            this.putQueryParameter("VariableNames", variableNamesShrink);
            this.variableNames = variableNames;
            return this;
        }

        @Override
        public RemoveApplicationEnvironmentVariablesRequest build() {
            return new RemoveApplicationEnvironmentVariablesRequest(this);
        } 

    } 

}
