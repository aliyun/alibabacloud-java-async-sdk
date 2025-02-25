// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckUuidValidRequest} extends {@link RequestModel}
 *
 * <p>CheckUuidValidRequest</p>
 */
public class CheckUuidValidRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bluetooth")
    private String bluetooth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private String buildId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChipId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chipId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EtherMac")
    private String etherMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Wlan")
    private String wlan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WosAppVersion")
    private String wosAppVersion;

    private CheckUuidValidRequest(Builder builder) {
        super(builder);
        this.bluetooth = builder.bluetooth;
        this.buildId = builder.buildId;
        this.chipId = builder.chipId;
        this.clientId = builder.clientId;
        this.customId = builder.customId;
        this.etherMac = builder.etherMac;
        this.serialNo = builder.serialNo;
        this.uuid = builder.uuid;
        this.wlan = builder.wlan;
        this.wosAppVersion = builder.wosAppVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUuidValidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bluetooth
     */
    public String getBluetooth() {
        return this.bluetooth;
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return chipId
     */
    public String getChipId() {
        return this.chipId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return etherMac
     */
    public String getEtherMac() {
        return this.etherMac;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return wlan
     */
    public String getWlan() {
        return this.wlan;
    }

    /**
     * @return wosAppVersion
     */
    public String getWosAppVersion() {
        return this.wosAppVersion;
    }

    public static final class Builder extends Request.Builder<CheckUuidValidRequest, Builder> {
        private String bluetooth; 
        private String buildId; 
        private String chipId; 
        private String clientId; 
        private String customId; 
        private String etherMac; 
        private String serialNo; 
        private String uuid; 
        private String wlan; 
        private String wosAppVersion; 

        private Builder() {
            super();
        } 

        private Builder(CheckUuidValidRequest request) {
            super(request);
            this.bluetooth = request.bluetooth;
            this.buildId = request.buildId;
            this.chipId = request.chipId;
            this.clientId = request.clientId;
            this.customId = request.customId;
            this.etherMac = request.etherMac;
            this.serialNo = request.serialNo;
            this.uuid = request.uuid;
            this.wlan = request.wlan;
            this.wosAppVersion = request.wosAppVersion;
        } 

        /**
         * Bluetooth.
         */
        public Builder bluetooth(String bluetooth) {
            this.putBodyParameter("Bluetooth", bluetooth);
            this.bluetooth = bluetooth;
            return this;
        }

        /**
         * BuildId.
         */
        public Builder buildId(String buildId) {
            this.putBodyParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * ChipId.
         */
        public Builder chipId(String chipId) {
            this.putBodyParameter("ChipId", chipId);
            this.chipId = chipId;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * CustomId.
         */
        public Builder customId(String customId) {
            this.putBodyParameter("CustomId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * EtherMac.
         */
        public Builder etherMac(String etherMac) {
            this.putBodyParameter("EtherMac", etherMac);
            this.etherMac = etherMac;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * Wlan.
         */
        public Builder wlan(String wlan) {
            this.putBodyParameter("Wlan", wlan);
            this.wlan = wlan;
            return this;
        }

        /**
         * WosAppVersion.
         */
        public Builder wosAppVersion(String wosAppVersion) {
            this.putBodyParameter("WosAppVersion", wosAppVersion);
            this.wosAppVersion = wosAppVersion;
            return this;
        }

        @Override
        public CheckUuidValidRequest build() {
            return new CheckUuidValidRequest(this);
        } 

    } 

}
