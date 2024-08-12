// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceRequest} extends {@link RequestModel}
 *
 * <p>RegisterDeviceRequest</p>
 */
public class RegisterDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bluetooth")
    private String bluetooth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private String buildId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChipId")
    private String chipId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private String cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EtherMac")
    private String etherMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Storage")
    private String storage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Wlan")
    private String wlan;

    private RegisterDeviceRequest(Builder builder) {
        super(builder);
        this.bluetooth = builder.bluetooth;
        this.buildId = builder.buildId;
        this.chipId = builder.chipId;
        this.clientId = builder.clientId;
        this.clientType = builder.clientType;
        this.cpu = builder.cpu;
        this.customId = builder.customId;
        this.etherMac = builder.etherMac;
        this.memory = builder.memory;
        this.model = builder.model;
        this.serialNo = builder.serialNo;
        this.storage = builder.storage;
        this.token = builder.token;
        this.wlan = builder.wlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceRequest create() {
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
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
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
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return wlan
     */
    public String getWlan() {
        return this.wlan;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceRequest, Builder> {
        private String bluetooth; 
        private String buildId; 
        private String chipId; 
        private String clientId; 
        private Integer clientType; 
        private String cpu; 
        private String customId; 
        private String etherMac; 
        private String memory; 
        private String model; 
        private String serialNo; 
        private String storage; 
        private String token; 
        private String wlan; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceRequest request) {
            super(request);
            this.bluetooth = request.bluetooth;
            this.buildId = request.buildId;
            this.chipId = request.chipId;
            this.clientId = request.clientId;
            this.clientType = request.clientType;
            this.cpu = request.cpu;
            this.customId = request.customId;
            this.etherMac = request.etherMac;
            this.memory = request.memory;
            this.model = request.model;
            this.serialNo = request.serialNo;
            this.storage = request.storage;
            this.token = request.token;
            this.wlan = request.wlan;
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
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(String cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
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
         * Memory.
         */
        public Builder memory(String memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
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
         * Storage.
         */
        public Builder storage(String storage) {
            this.putBodyParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
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

        @Override
        public RegisterDeviceRequest build() {
            return new RegisterDeviceRequest(this);
        } 

    } 

}
