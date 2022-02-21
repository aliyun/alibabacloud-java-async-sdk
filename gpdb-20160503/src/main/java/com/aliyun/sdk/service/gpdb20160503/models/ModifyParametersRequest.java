// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyParametersRequest</p>
 */
public class ModifyParametersRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ForceRestartInstance")
    private Boolean forceRestartInstance;

    @Query
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    private ModifyParametersRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.forceRestartInstance = builder.forceRestartInstance;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return forceRestartInstance
     */
    public Boolean getForceRestartInstance() {
        return this.forceRestartInstance;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<ModifyParametersRequest, Builder> {
        private String DBInstanceId; 
        private Boolean forceRestartInstance; 
        private String parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParametersRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.forceRestartInstance = response.forceRestartInstance;
            this.parameters = response.parameters;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ForceRestartInstance.
         */
        public Builder forceRestartInstance(Boolean forceRestartInstance) {
            this.putQueryParameter("ForceRestartInstance", forceRestartInstance);
            this.forceRestartInstance = forceRestartInstance;
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

        @Override
        public ModifyParametersRequest build() {
            return new ModifyParametersRequest(this);
        } 

    } 

}
