// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayConfigRequest</p>
 */
public class UpdateGatewayConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    private UpdateGatewayConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.configName = builder.configName;
        this.configValue = builder.configValue;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayConfigRequest, Builder> {
        private String acceptLanguage; 
        private String configName; 
        private String configValue; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.configName = request.configName;
            this.configValue = request.configValue;
            this.gatewayUniqueId = request.gatewayUniqueId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EnableK8sSourceWorkloadFilter</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("ConfigName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;filterOpt&quot;:&quot;EQUAL&quot;,&quot;labelKey&quot;:&quot;key&quot;,&quot;labelValue&quot;:&quot;value&quot;}</p>
         */
        public Builder configValue(String configValue) {
            this.putQueryParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-b525dc1adf3c486ab96224a6346*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public UpdateGatewayConfigRequest build() {
            return new UpdateGatewayConfigRequest(this);
        } 

    } 

}
