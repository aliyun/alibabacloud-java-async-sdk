// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushDeviceDataRequest} extends {@link RequestModel}
 *
 * <p>PushDeviceDataRequest</p>
 */
public class PushDeviceDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("devices")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Devices> devices;

    private PushDeviceDataRequest(Builder builder) {
        super(builder);
        this.deviceType = builder.deviceType;
        this.devices = builder.devices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDeviceDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    public static final class Builder extends Request.Builder<PushDeviceDataRequest, Builder> {
        private String deviceType; 
        private java.util.List < Devices> devices; 

        private Builder() {
            super();
        } 

        private Builder(PushDeviceDataRequest request) {
            super(request);
            this.deviceType = request.deviceType;
            this.devices = request.devices;
        } 

        /**
         * The type of the device. [View device type definitions](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf)
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("deviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * List of devices to which data is pushed.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.putBodyParameter("devices", devices);
            this.devices = devices;
            return this;
        }

        @Override
        public PushDeviceDataRequest build() {
            return new PushDeviceDataRequest(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map < String, ? > data;

        @com.aliyun.core.annotation.NameInMap("deviceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("recordTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String recordTime;

        private Devices(Builder builder) {
            this.data = builder.data;
            this.deviceId = builder.deviceId;
            this.recordTime = builder.recordTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.Map < String, ? > getData() {
            return this.data;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return recordTime
         */
        public String getRecordTime() {
            return this.recordTime;
        }

        public static final class Builder {
            private java.util.Map < String, ? > data; 
            private String deviceId; 
            private String recordTime; 

            /**
             * Measuring point information To avoid accuracy problems, the measurement point data is uniformly transmitted to the string. The function of missing required fields cannot be used normally. Some functions may be affected due to the lack of recommend fields. For details, please refer to the notes of equipment measuring points in the appendix. [Reference Point Definition](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf
             * <p>
             * )
             */
            public Builder data(java.util.Map < String, ? > data) {
                this.data = data;
                return this;
            }

            /**
             * If the deviceType parameter is set to 12, 13, or 17, you must set the system_id parameter. The field name is still device_id. If the deviceType parameter is set to 15 or 16, no Other situations will be transmitted.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Data generation time of measuring point.
             */
            public Builder recordTime(String recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
