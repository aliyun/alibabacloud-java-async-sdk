// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceConfigRequest</p>
 */
public class ModifyInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigName")
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyInstanceConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configName = builder.configName;
        this.configValue = builder.configValue;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceConfigRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceConfigRequest, Builder> {
        private String clientToken; 
        private String configName; 
        private String configValue; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configName = request.configName;
            this.configValue = request.configValue;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>eip、nat</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("ConfigName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The name of the configuration item that you want to modify. Configure this parameter together with the ConfigValue parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>on、off</p>
         */
        public Builder configValue(String configValue) {
            this.putQueryParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyInstanceConfigRequest build() {
            return new ModifyInstanceConfigRequest(this);
        } 

    } 

}
