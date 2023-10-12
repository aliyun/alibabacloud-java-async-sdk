// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Port} extends {@link TeaModel}
 *
 * <p>Port</p>
 */
public class Port extends TeaModel {
    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @NameInMap("PortName")
    private String portName;

    private Port(Builder builder) {
        this.deviceId = builder.deviceId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.portCollectionId = builder.portCollectionId;
        this.portName = builder.portName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Port create() {
        return builder().build();
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return portCollectionId
     */
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    /**
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    public static final class Builder {
        private String deviceId; 
        private String gmtCreate; 
        private String gmtModified; 
        private String portCollectionId; 
        private String portName; 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * PortCollectionId.
         */
        public Builder portCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }

        /**
         * PortName.
         */
        public Builder portName(String portName) {
            this.portName = portName;
            return this;
        }

        public Port build() {
            return new Port(this);
        } 

    } 

}
