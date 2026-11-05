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
 * {@link ModifySearchParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifySearchParametersRequest</p>
 */
public class ModifySearchParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    private ModifySearchParametersRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySearchParametersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<ModifySearchParametersRequest, Builder> {
        private String DBClusterId; 
        private String parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifySearchParametersRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.parameters = request.parameters;
        } 

        /**
         * <p>The ID of the primary PolarDB cluster, which is used to locate the Search cluster associated with the current account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>A non-empty JSON object string where the keys are parameter names and all values must be strings, such as 10% for a percentage or 48mb for a capacity. Only parameters that are visible and modifiable in the current version template can be modified. Dynamic parameters take effect and are persisted immediately, whereas static parameters take effect after a restart triggered by the task flow. A successful response only indicates that the task has been accepted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;indices.memory.index_buffer_size&quot;:&quot;10%&quot;,&quot;indices.memory.min_index_buffer_size&quot;:&quot;48mb&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public ModifySearchParametersRequest build() {
            return new ModifySearchParametersRequest(this);
        } 

    } 

}
