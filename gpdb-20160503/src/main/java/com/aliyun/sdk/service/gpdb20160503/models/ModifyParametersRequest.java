// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly restart the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceRestartInstance(Boolean forceRestartInstance) {
            this.putQueryParameter("ForceRestartInstance", forceRestartInstance);
            this.forceRestartInstance = forceRestartInstance;
            return this;
        }

        /**
         * <p>The name and value of the parameter to be modified. Specify the parameter in the <code>&lt;Parameter name&gt;:&lt;Parameter value&gt;</code> format.</p>
         * <p>You can call the <a href="~~208310~~">DescribeParameters</a> operation to query the parameters that can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;statement_timeout&quot;:&quot;11800010&quot;}</p>
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
