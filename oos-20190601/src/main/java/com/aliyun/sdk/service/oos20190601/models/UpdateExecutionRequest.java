// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExecutionRequest} extends {@link RequestModel}
 *
 * <p>UpdateExecutionRequest</p>
 */
public class UpdateExecutionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateExecutionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.executionId = builder.executionId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExecutionRequest create() {
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
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
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

    public static final class Builder extends Request.Builder<UpdateExecutionRequest, Builder> {
        private String clientToken; 
        private String executionId; 
        private String parameters; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExecutionRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.executionId = response.executionId;
            this.parameters = response.parameters;
            this.regionId = response.regionId;
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
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
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
        public UpdateExecutionRequest build() {
            return new UpdateExecutionRequest(this);
        } 

    } 

}
