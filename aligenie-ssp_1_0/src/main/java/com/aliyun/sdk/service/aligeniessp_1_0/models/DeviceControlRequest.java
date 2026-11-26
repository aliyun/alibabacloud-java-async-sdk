// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link DeviceControlRequest} extends {@link RequestModel}
 *
 * <p>DeviceControlRequest</p>
 */
public class DeviceControlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlRequest")
    private ControlRequest controlRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    private DeviceControlRequest(Builder builder) {
        super(builder);
        this.controlRequest = builder.controlRequest;
        this.deviceInfo = builder.deviceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceControlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controlRequest
     */
    public ControlRequest getControlRequest() {
        return this.controlRequest;
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static final class Builder extends Request.Builder<DeviceControlRequest, Builder> {
        private ControlRequest controlRequest; 
        private DeviceInfo deviceInfo; 

        private Builder() {
            super();
        } 

        private Builder(DeviceControlRequest request) {
            super(request);
            this.controlRequest = request.controlRequest;
            this.deviceInfo = request.deviceInfo;
        } 

        /**
         * <p>Input parameters for volume control</p>
         */
        public Builder controlRequest(ControlRequest controlRequest) {
            String controlRequestShrink = shrink(controlRequest, "ControlRequest", "json");
            this.putBodyParameter("ControlRequest", controlRequestShrink);
            this.controlRequest = controlRequest;
            return this;
        }

        /**
         * <p>List of device ID information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        @Override
        public DeviceControlRequest build() {
            return new DeviceControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeviceControlRequest} extends {@link TeaModel}
     *
     * <p>DeviceControlRequest</p>
     */
    public static class ControlRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Muted")
        private Boolean muted;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private ControlRequest(Builder builder) {
            this.muted = builder.muted;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlRequest create() {
            return builder().build();
        }

        /**
         * @return muted
         */
        public Boolean getMuted() {
            return this.muted;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Boolean muted; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(ControlRequest model) {
                this.muted = model.muted;
                this.volume = model.volume;
            } 

            /**
             * <p>Indicates whether mute is enabled. If this field is set to true, you must also specify the volume value as 0.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder muted(Boolean muted) {
                this.muted = muted;
                return this;
            }

            /**
             * <p>Target volume value</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public ControlRequest build() {
                return new ControlRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeviceControlRequest} extends {@link TeaModel}
     *
     * <p>DeviceControlRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>Value corresponding to the encoding type. Enter the Project ID of the project where the product resides. You can View this in the Tmall Genie AI platform console.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding Type. Enter PROJECT_ID here.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID. Enter the value of deviceOpenId or deviceUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of Device ID:<br>OPEN_ID: The default Device ID identity.<br>UNION_ID: The organization-dimension Device ID identity. You must request an organization in advance on the Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID of the device. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1*****2</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
}
