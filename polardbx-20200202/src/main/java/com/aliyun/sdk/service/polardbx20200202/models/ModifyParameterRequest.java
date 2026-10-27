// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ModifyParameterRequest} extends {@link RequestModel}
 *
 * <p>ModifyParameterRequest</p>
 */
public class ModifyParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamLevel")
    private String paramLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyParameterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.paramLevel = builder.paramLevel;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParameterRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return paramLevel
     */
    public String getParamLevel() {
        return this.paramLevel;
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
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

    public static final class Builder extends Request.Builder<ModifyParameterRequest, Builder> {
        private String clientToken; 
        private String DBInstanceId; 
        private String paramLevel; 
        private String parameterGroupId; 
        private String parameters; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParameterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.paramLevel = request.paramLevel;
            this.parameterGroupId = request.parameterGroupId;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token. It can be any unique string.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasdyuoo</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li><strong>compute</strong>: compute layer parameters</li>
         * <li><strong>storage</strong>: storage layer parameters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        public Builder paramLevel(String paramLevel) {
            this.putQueryParameter("ParamLevel", paramLevel);
            this.paramLevel = paramLevel;
            return this;
        }

        /**
         * <p>The parameter template ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the details of all parameter templates in the specified region, including the parameter template IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rpg-s1y1xy06****fqs7y</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>The parameters in JSON format. The key represents the parameter name, and the value represents the parameter value. Modifiable parameters are dynamically added or removed. Call the <a href="https://help.aliyun.com/document_detail/196856.html">DescribeParameterTemplates</a> operation to obtain the list of modifiable parameters. You can specify multiple parameters at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CONN_POOL_BLOCK_TIMEOUT&quot;:6000}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public ModifyParameterRequest build() {
            return new ModifyParameterRequest(this);
        } 

    } 

}
