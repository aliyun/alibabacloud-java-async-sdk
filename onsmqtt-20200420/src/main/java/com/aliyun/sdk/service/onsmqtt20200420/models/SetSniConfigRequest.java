// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSniConfigRequest} extends {@link RequestModel}
 *
 * <p>SetSniConfigRequest</p>
 */
public class SetSniConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SniConfig")
    private String sniConfig;

    private SetSniConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defaultCertificate = builder.defaultCertificate;
        this.mqttInstanceId = builder.mqttInstanceId;
        this.sniConfig = builder.sniConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSniConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return defaultCertificate
     */
    public String getDefaultCertificate() {
        return this.defaultCertificate;
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return sniConfig
     */
    public String getSniConfig() {
        return this.sniConfig;
    }

    public static final class Builder extends Request.Builder<SetSniConfigRequest, Builder> {
        private String regionId; 
        private String defaultCertificate; 
        private String mqttInstanceId; 
        private String sniConfig; 

        private Builder() {
            super();
        } 

        private Builder(SetSniConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defaultCertificate = request.defaultCertificate;
            this.mqttInstanceId = request.mqttInstanceId;
            this.sniConfig = request.sniConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder defaultCertificate(String defaultCertificate) {
            this.putQueryParameter("DefaultCertificate", defaultCertificate);
            this.defaultCertificate = defaultCertificate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * SniConfig.
         */
        public Builder sniConfig(String sniConfig) {
            this.putQueryParameter("SniConfig", sniConfig);
            this.sniConfig = sniConfig;
            return this;
        }

        @Override
        public SetSniConfigRequest build() {
            return new SetSniConfigRequest(this);
        } 

    } 

}
