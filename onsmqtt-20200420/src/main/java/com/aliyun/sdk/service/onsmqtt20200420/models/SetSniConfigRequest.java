// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
         * <p>The default certificate. If the domain name that you access cannot match the certificates of the broker, the default certificate is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1533xxxx-cn-hangzhou</p>
         */
        public Builder defaultCertificate(String defaultCertificate) {
            this.putQueryParameter("DefaultCertificate", defaultCertificate);
            this.defaultCertificate = defaultCertificate;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-5yd3xxx</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * <p>The Server Name Indication (SNI) configuration. This parameter is used to map domain names and certificates. Format: Domain name#Certificate ID#Password (if available);Domain name#Certificate ID#Password (if available).</p>
         * 
         * <strong>example:</strong>
         * <p>*.mqtt.aliyuncs.com#15xxxxx-cn-hangzhou;mqtt-test.mqtt.aliyuncs.com#15xxxx9-cn-hangzhou</p>
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
