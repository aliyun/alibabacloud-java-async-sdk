// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseInstanceParameterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseInstanceParameterRequest</p>
 */
public class ModifyDatabaseInstanceParameterRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DatabaseInstanceId")
    @Validation(required = true)
    private String databaseInstanceId;

    @Query
    @NameInMap("ForceRestart")
    private Boolean forceRestart;

    @Query
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the Simple Database Service instance.
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * Specifies whether to forcibly restart the instance after parameters are modified. Valid values:
         * <p>
         * 
         * *   true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.
         * *   false: does not forcibly restart the instance.
         * 
         * Default value: false.
         */
        public Builder forceRestart(Boolean forceRestart) {
            this.putQueryParameter("ForceRestart", forceRestart);
            this.forceRestart = forceRestart;
            return this;
        }

        /**
         * The JSON strings that consist of instance parameters and the values of the instance parameters. The parameter values are of the string type. Format: {"Parameter name 1":"Parameter value 1","Parameter name 2":"Parameter value 2"...}.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
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
