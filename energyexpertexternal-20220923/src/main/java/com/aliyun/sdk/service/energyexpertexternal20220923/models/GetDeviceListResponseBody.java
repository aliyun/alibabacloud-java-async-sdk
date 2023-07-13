// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceListResponseBody</p>
 */
public class GetDeviceListResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetDeviceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceListResponseBody create() {
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeviceListResponseBody build() {
            return new GetDeviceListResponseBody(this);
        } 

    } 

    public static class Info extends TeaModel {
        @NameInMap("constKva")
        private Integer constKva;

        @NameInMap("ct")
        private Integer ct;

        @NameInMap("magnification")
        private Integer magnification;

        @NameInMap("pressure")
        private Integer pressure;

        @NameInMap("pt")
        private Integer pt;

        private Info(Builder builder) {
            this.constKva = builder.constKva;
            this.ct = builder.ct;
            this.magnification = builder.magnification;
            this.pressure = builder.pressure;
            this.pt = builder.pt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return constKva
         */
        public Integer getConstKva() {
            return this.constKva;
        }

        /**
         * @return ct
         */
        public Integer getCt() {
            return this.ct;
        }

        /**
         * @return magnification
         */
        public Integer getMagnification() {
            return this.magnification;
        }

        /**
         * @return pressure
         */
        public Integer getPressure() {
            return this.pressure;
        }

        /**
         * @return pt
         */
        public Integer getPt() {
            return this.pt;
        }

        public static final class Builder {
            private Integer constKva; 
            private Integer ct; 
            private Integer magnification; 
            private Integer pressure; 
            private Integer pt; 

            /**
             * constKva.
             */
            public Builder constKva(Integer constKva) {
                this.constKva = constKva;
                return this;
            }

            /**
             * ct.
             */
            public Builder ct(Integer ct) {
                this.ct = ct;
                return this;
            }

            /**
             * magnification.
             */
            public Builder magnification(Integer magnification) {
                this.magnification = magnification;
                return this;
            }

            /**
             * pressure.
             */
            public Builder pressure(Integer pressure) {
                this.pressure = pressure;
                return this;
            }

            /**
             * pt.
             */
            public Builder pt(Integer pt) {
                this.pt = pt;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class DeviceList extends TeaModel {
        @NameInMap("deviceId")
        private String deviceId;

        @NameInMap("deviceName")
        private String deviceName;

        @NameInMap("firstTypeName")
        private String firstTypeName;

        @NameInMap("info")
        private Info info;

        @NameInMap("parentDevice")
        private String parentDevice;

        @NameInMap("secondTypeName")
        private String secondTypeName;

        private DeviceList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.firstTypeName = builder.firstTypeName;
            this.info = builder.info;
            this.parentDevice = builder.parentDevice;
            this.secondTypeName = builder.secondTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return firstTypeName
         */
        public String getFirstTypeName() {
            return this.firstTypeName;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return parentDevice
         */
        public String getParentDevice() {
            return this.parentDevice;
        }

        /**
         * @return secondTypeName
         */
        public String getSecondTypeName() {
            return this.secondTypeName;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private String firstTypeName; 
            private Info info; 
            private String parentDevice; 
            private String secondTypeName; 

            /**
             * deviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * deviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * firstTypeName.
             */
            public Builder firstTypeName(String firstTypeName) {
                this.firstTypeName = firstTypeName;
                return this;
            }

            /**
             * info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * parentDevice.
             */
            public Builder parentDevice(String parentDevice) {
                this.parentDevice = parentDevice;
                return this;
            }

            /**
             * secondTypeName.
             */
            public Builder secondTypeName(String secondTypeName) {
                this.secondTypeName = secondTypeName;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("deviceList")
        private java.util.List < DeviceList> deviceList;

        @NameInMap("factoryId")
        private String factoryId;

        @NameInMap("httpCode")
        private Integer httpCode;

        @NameInMap("success")
        private Boolean success;

        private Data(Builder builder) {
            this.code = builder.code;
            this.deviceList = builder.deviceList;
            this.factoryId = builder.factoryId;
            this.httpCode = builder.httpCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return deviceList
         */
        public java.util.List < DeviceList> getDeviceList() {
            return this.deviceList;
        }

        /**
         * @return factoryId
         */
        public String getFactoryId() {
            return this.factoryId;
        }

        /**
         * @return httpCode
         */
        public Integer getHttpCode() {
            return this.httpCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < DeviceList> deviceList; 
            private String factoryId; 
            private Integer httpCode; 
            private Boolean success; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * deviceList.
             */
            public Builder deviceList(java.util.List < DeviceList> deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * factoryId.
             */
            public Builder factoryId(String factoryId) {
                this.factoryId = factoryId;
                return this;
            }

            /**
             * httpCode.
             */
            public Builder httpCode(Integer httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
