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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DatabaseInstanceId.
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * ForceRestart.
         */
        public Builder forceRestart(Boolean forceRestart) {
            this.putQueryParameter("ForceRestart", forceRestart);
            this.forceRestart = forceRestart;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
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
