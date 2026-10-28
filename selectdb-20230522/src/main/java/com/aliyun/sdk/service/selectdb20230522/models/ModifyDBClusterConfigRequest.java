// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifyDBClusterConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterConfigRequest</p>
 */
public class ModifyDBClusterConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParallelOperation")
    private Boolean parallelOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    private ModifyDBClusterConfigRequest(Builder builder) {
        super(builder);
        this.configKey = builder.configKey;
        this.DBClusterId = builder.DBClusterId;
        this.DBInstanceId = builder.DBInstanceId;
        this.parallelOperation = builder.parallelOperation;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.switchTimeMode = builder.switchTimeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return parallelOperation
     */
    public Boolean getParallelOperation() {
        return this.parallelOperation;
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

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterConfigRequest, Builder> {
        private String configKey; 
        private String DBClusterId; 
        private String DBInstanceId; 
        private Boolean parallelOperation; 
        private String parameters; 
        private String regionId; 
        private String switchTimeMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterConfigRequest request) {
            super(request);
            this.configKey = request.configKey;
            this.DBClusterId = request.DBClusterId;
            this.DBInstanceId = request.DBInstanceId;
            this.parallelOperation = request.parallelOperation;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.switchTimeMode = request.switchTimeMode;
        } 

        /**
         * <p>The configuration file to modify. The value is fixed to be.conf for compute clusters and fe.conf for frontend clusters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>be.conf</p>
         */
        public Builder configKey(String configKey) {
            this.putQueryParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213c8*****-be</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213c8*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to perform operations on cluster nodes in parallel.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelOperation(Boolean parallelOperation) {
            this.putQueryParameter("ParallelOperation", parallelOperation);
            this.parallelOperation = parallelOperation;
            return this;
        }

        /**
         * <p>The JSON string of parameters and their values.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param1_name&quot;:&quot;param1_value&quot;,&quot;param2_name&quot;:&quot;param2_value&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The upgrade mode. If you leave this parameter empty, the upgrade is performed immediately. If you set this parameter to 1, the upgrade is performed during the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        @Override
        public ModifyDBClusterConfigRequest build() {
            return new ModifyDBClusterConfigRequest(this);
        } 

    } 

}
