// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of the device. <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf">View device type definitions</a></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("deviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>List of devices to which data is pushed.</p>
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

    /**
     * 
     * {@link PushDeviceDataRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceDataRequest</p>
     */
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
             * <p>Measuring point information To avoid accuracy problems, the measurement point data is uniformly transmitted to the string. The function of missing required fields cannot be used normally. Some functions may be affected due to the lack of recommend fields. For details, please refer to the notes of equipment measuring points in the appendix. <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf">Reference Point Definition</a></p>
             * 
             * <strong>example:</strong>
             * <p>{
             *             &quot;dp_imp&quot;: &quot;329.0&quot;,
             *             &quot;F&quot;: &quot;148.0&quot;,
             *             &quot;eq_imp&quot;: &quot;363.0&quot;,
             *             &quot;Ep_imp_1&quot;: &quot;128.0&quot;,
             *             &quot;Ep_imp_2&quot;: &quot;157.0&quot;,
             *             &quot;Ua&quot;: &quot;226.0&quot;,
             *             &quot;Ub&quot;: &quot;285.0&quot;,
             *             &quot;Ep_imp&quot;: &quot;325.0&quot;,
             *             &quot;Uc&quot;: &quot;342.0&quot;,
             *             &quot;Ep_imp_3&quot;: &quot;109.0&quot;,
             *             &quot;Ep_imp_4&quot;: &quot;94.0&quot;,
             *             &quot;P&quot;: &quot;514.0&quot;,
             *             &quot;Pa&quot;: &quot;443.0&quot;,
             *             &quot;Q&quot;: &quot;265.0&quot;,
             *             &quot;dp_exp&quot;: &quot;261.0&quot;,
             *             &quot;eq_exp&quot;: &quot;399.0&quot;,
             *             &quot;COSQ&quot;: &quot;223.0&quot;,
             *             &quot;Ia&quot;: &quot;240.0&quot;,
             *             &quot;Ib&quot;: &quot;216.0&quot;,
             *             &quot;Ic&quot;: &quot;229.0&quot;,
             *             &quot;Ep_exp&quot;: &quot;115.0&quot;,
             *             &quot;VdisPer&quot;: &quot;120.0&quot;
             *         }</p>
             */
            public Builder data(java.util.Map < String, ? > data) {
                this.data = data;
                return this;
            }

            /**
             * <p>If the deviceType parameter is set to 12, 13, or 17, you must set the system_id parameter. The field name is still device_id. If the deviceType parameter is set to 15 or 16, no Other situations will be transmitted.</p>
             * 
             * <strong>example:</strong>
             * <p>device_code_xxx</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>Data generation time of measuring point.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08 18:40:00</p>
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
