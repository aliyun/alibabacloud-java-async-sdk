// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDevicesRequest} extends {@link RequestModel}
 *
 * <p>BindDevicesRequest</p>
 */
public class BindDevicesRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("SubDeviceList")
    @Validation(required = true)
    private java.util.List < SubDeviceList> subDeviceList;

    private BindDevicesRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
        this.subDeviceList = builder.subDeviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return subDeviceList
     */
    public java.util.List < SubDeviceList> getSubDeviceList() {
        return this.subDeviceList;
    }

    public static final class Builder extends Request.Builder<BindDevicesRequest, Builder> {
        private String corpId; 
        private String deviceId; 
        private java.util.List < SubDeviceList> subDeviceList; 

        private Builder() {
            super();
        } 

        private Builder(BindDevicesRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
            this.subDeviceList = response.subDeviceList;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * SubDeviceList.
         */
        public Builder subDeviceList(java.util.List < SubDeviceList> subDeviceList) {
            this.putBodyParameter("SubDeviceList", subDeviceList);
            this.subDeviceList = subDeviceList;
            return this;
        }

        @Override
        public BindDevicesRequest build() {
            return new BindDevicesRequest(this);
        } 

    } 

    public static class SubDeviceList extends TeaModel {
        @NameInMap("AccessProtocol")
        private String accessProtocol;

        @NameInMap("LoginName")
        @Validation(required = true)
        private String loginName;

        @NameInMap("PIN")
        @Validation(required = true)
        private String PIN;

        @NameInMap("SubDeviceIp")
        @Validation(required = true)
        private String subDeviceIp;

        @NameInMap("SubDeviceName")
        private String subDeviceName;

        @NameInMap("SubDevicePort")
        @Validation(required = true)
        private String subDevicePort;

        private SubDeviceList(Builder builder) {
            this.accessProtocol = builder.accessProtocol;
            this.loginName = builder.loginName;
            this.PIN = builder.PIN;
            this.subDeviceIp = builder.subDeviceIp;
            this.subDeviceName = builder.subDeviceName;
            this.subDevicePort = builder.subDevicePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceList create() {
            return builder().build();
        }

        /**
         * @return accessProtocol
         */
        public String getAccessProtocol() {
            return this.accessProtocol;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return PIN
         */
        public String getPIN() {
            return this.PIN;
        }

        /**
         * @return subDeviceIp
         */
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        /**
         * @return subDeviceName
         */
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        /**
         * @return subDevicePort
         */
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

        public static final class Builder {
            private String accessProtocol; 
            private String loginName; 
            private String PIN; 
            private String subDeviceIp; 
            private String subDeviceName; 
            private String subDevicePort; 

            /**
             * AccessProtocol.
             */
            public Builder accessProtocol(String accessProtocol) {
                this.accessProtocol = accessProtocol;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * PIN.
             */
            public Builder PIN(String PIN) {
                this.PIN = PIN;
                return this;
            }

            /**
             * SubDeviceIp.
             */
            public Builder subDeviceIp(String subDeviceIp) {
                this.subDeviceIp = subDeviceIp;
                return this;
            }

            /**
             * SubDeviceName.
             */
            public Builder subDeviceName(String subDeviceName) {
                this.subDeviceName = subDeviceName;
                return this;
            }

            /**
             * SubDevicePort.
             */
            public Builder subDevicePort(String subDevicePort) {
                this.subDevicePort = subDevicePort;
                return this;
            }

            public SubDeviceList build() {
                return new SubDeviceList(this);
            } 

        } 

    }
}
