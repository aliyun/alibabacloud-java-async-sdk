// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceListResponseBody</p>
 */
public class GetDeviceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeviceListResponseBody build() {
            return new GetDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceListResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("constKva")
        private Integer constKva;

        @com.aliyun.core.annotation.NameInMap("ct")
        private Integer ct;

        @com.aliyun.core.annotation.NameInMap("magnification")
        private Integer magnification;

        @com.aliyun.core.annotation.NameInMap("pressure")
        private Integer pressure;

        @com.aliyun.core.annotation.NameInMap("pt")
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
             * <p>The rated capacity.
             * Unit is kVA.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder constKva(Integer constKva) {
                this.constKva = constKva;
                return this;
            }

            /**
             * <p>The transformation ratio of current.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ct(Integer ct) {
                this.ct = ct;
                return this;
            }

            /**
             * <p>The magnification ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder magnification(Integer magnification) {
                this.magnification = magnification;
                return this;
            }

            /**
             * <p>The high and low voltage.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pressure(Integer pressure) {
                this.pressure = pressure;
                return this;
            }

            /**
             * <p>The transformation ratio of voltage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link GetDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceListResponseBody</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("deviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("firstTypeName")
        private String firstTypeName;

        @com.aliyun.core.annotation.NameInMap("info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("parentDevice")
        private String parentDevice;

        @com.aliyun.core.annotation.NameInMap("secondTypeName")
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
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pn_69873</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The device name.</p>
             * 
             * <strong>example:</strong>
             * <p>Main transformer 4#</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The level 1 meter type.</p>
             * 
             * <strong>example:</strong>
             * <p>Electric meter</p>
             */
            public Builder firstTypeName(String firstTypeName) {
                this.firstTypeName = firstTypeName;
                return this;
            }

            /**
             * <p>The device information.</p>
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The ID of the parent device.</p>
             * 
             * <strong>example:</strong>
             * <p>pn_6987</p>
             */
            public Builder parentDevice(String parentDevice) {
                this.parentDevice = parentDevice;
                return this;
            }

            /**
             * <p>The level 2 meter type.</p>
             * 
             * <strong>example:</strong>
             * <p>Gateway meter</p>
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
    /**
     * 
     * {@link GetDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("deviceList")
        private java.util.List < DeviceList> deviceList;

        @com.aliyun.core.annotation.NameInMap("factoryId")
        private String factoryId;

        @com.aliyun.core.annotation.NameInMap("httpCode")
        private Integer httpCode;

        @com.aliyun.core.annotation.NameInMap("success")
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
             * <p>The code returned for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The devices.</p>
             */
            public Builder deviceList(java.util.List < DeviceList> deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * <p>The ID of the site.</p>
             * 
             * <strong>example:</strong>
             * <p>pn_95</p>
             */
            public Builder factoryId(String factoryId) {
                this.factoryId = factoryId;
                return this;
            }

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder httpCode(Integer httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
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
