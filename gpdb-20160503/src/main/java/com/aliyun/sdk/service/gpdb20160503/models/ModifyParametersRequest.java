// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyParametersRequest</p>
 */
public class ModifyParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceRestartInstance")
    private Boolean forceRestartInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifyParametersRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.forceRestartInstance = request.forceRestartInstance;
            this.parameters = request.parameters;
        } 

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Specifies whether to forcibly restart the instance. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder forceRestartInstance(Boolean forceRestartInstance) {
            this.putQueryParameter("ForceRestartInstance", forceRestartInstance);
            this.forceRestartInstance = forceRestartInstance;
            return this;
        }

        /**
         * The name and value of the parameter to be modified. Specify the parameter in the `<Parameter name>:<Parameter value>` format.
         * <p>
         * 
         * You can call the [DescribeParameters](~~208310~~) operation to query the parameters that can be modified.
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
