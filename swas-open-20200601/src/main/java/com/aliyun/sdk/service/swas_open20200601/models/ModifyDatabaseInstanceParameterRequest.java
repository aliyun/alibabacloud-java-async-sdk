// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ModifyDatabaseInstanceParameterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseInstanceParameterRequest</p>
 */
public class ModifyDatabaseInstanceParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceRestart")
    private Boolean forceRestart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDatabaseInstanceParameterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.databaseInstanceId = builder.databaseInstanceId;
        this.forceRestart = builder.forceRestart;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseInstanceParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseInstanceId
     */
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    /**
     * @return forceRestart
     */
    public Boolean getForceRestart() {
        return this.forceRestart;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseInstanceParameterRequest, Builder> {
        private String clientToken; 
        private String databaseInstanceId; 
        private Boolean forceRestart; 
        private String parameters; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseInstanceParameterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.databaseInstanceId = request.databaseInstanceId;
            this.forceRestart = request.forceRestart;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the Simple Database Service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db-38263fa955774501a2ae1bdaed6f****</p>
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
         * <ul>
         * <li>true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
         * <li>false: does not forcibly restart the instance.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceRestart(Boolean forceRestart) {
            this.putQueryParameter("ForceRestart", forceRestart);
            this.forceRestart = forceRestart;
            return this;
        }

        /**
         * <p>The JSON strings that consist of instance parameters and the values of the instance parameters. The parameter values are of the string type. Format: {&quot;Parameter name 1&quot;:&quot;Parameter value 1&quot;,&quot;Parameter name 2&quot;:&quot;Parameter value 2&quot;...}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;delayed_insert_timeout&quot;:&quot;600&quot;,&quot;max_length_for_sort_data&quot;:&quot;2048&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID of the Simple Database Service instance. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDatabaseInstanceParameterRequest build() {
            return new ModifyDatabaseInstanceParameterRequest(this);
        } 

    } 

}
