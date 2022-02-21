// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScanSubDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>GetScanSubDevicesResponseBody</p>
 */
public class GetScanSubDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetScanSubDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanSubDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetScanSubDevicesResponseBody build() {
            return new GetScanSubDevicesResponseBody(this);
        } 

    } 

    public static class SubDeviceList extends TeaModel {
        @NameInMap("AssociatedNvr")
        private String associatedNvr;

        @NameInMap("DeviceMac")
        private String deviceMac;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("Manufacturer")
        private String manufacturer;

        @NameInMap("SubDeviceIp")
        private String subDeviceIp;

        @NameInMap("SubDevicePort")
        private String subDevicePort;

        private SubDeviceList(Builder builder) {
            this.associatedNvr = builder.associatedNvr;
            this.deviceMac = builder.deviceMac;
            this.deviceModel = builder.deviceModel;
            this.deviceSn = builder.deviceSn;
            this.firmwareVersion = builder.firmwareVersion;
            this.manufacturer = builder.manufacturer;
            this.subDeviceIp = builder.subDeviceIp;
            this.subDevicePort = builder.subDevicePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceList create() {
            return builder().build();
        }

        /**
         * @return associatedNvr
         */
        public String getAssociatedNvr() {
            return this.associatedNvr;
        }

        /**
         * @return deviceMac
         */
        public String getDeviceMac() {
            return this.deviceMac;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceSn
         */
        public String getDeviceSn() {
            return this.deviceSn;
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return subDeviceIp
         */
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        /**
         * @return subDevicePort
         */
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

        public static final class Builder {
            private String associatedNvr; 
            private String deviceMac; 
            private String deviceModel; 
            private String deviceSn; 
            private String firmwareVersion; 
            private String manufacturer; 
            private String subDeviceIp; 
            private String subDevicePort; 

            /**
             * AssociatedNvr.
             */
            public Builder associatedNvr(String associatedNvr) {
                this.associatedNvr = associatedNvr;
                return this;
            }

            /**
             * DeviceMac.
             */
            public Builder deviceMac(String deviceMac) {
                this.deviceMac = deviceMac;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DeviceSn.
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
                return this;
            }

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
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
    public static class Data extends TeaModel {
        @NameInMap("SubDeviceList")
        private java.util.List < SubDeviceList> subDeviceList;

        private Data(Builder builder) {
            this.subDeviceList = builder.subDeviceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subDeviceList
         */
        public java.util.List < SubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

        public static final class Builder {
            private java.util.List < SubDeviceList> subDeviceList; 

            /**
             * SubDeviceList.
             */
            public Builder subDeviceList(java.util.List < SubDeviceList> subDeviceList) {
                this.subDeviceList = subDeviceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
