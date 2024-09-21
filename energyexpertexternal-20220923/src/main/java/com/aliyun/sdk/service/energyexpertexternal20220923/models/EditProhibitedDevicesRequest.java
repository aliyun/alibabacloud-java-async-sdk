// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditProhibitedDevicesRequest} extends {@link RequestModel}
 *
 * <p>EditProhibitedDevicesRequest</p>
 */
public class EditProhibitedDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("factoryId")
    private String factoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hvacDeviceConfigVOList")
    private java.util.List < HvacDeviceConfigVOList> hvacDeviceConfigVOList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("systemId")
    private String systemId;

    private EditProhibitedDevicesRequest(Builder builder) {
        super(builder);
        this.factoryId = builder.factoryId;
        this.hvacDeviceConfigVOList = builder.hvacDeviceConfigVOList;
        this.systemId = builder.systemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditProhibitedDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return factoryId
     */
    public String getFactoryId() {
        return this.factoryId;
    }

    /**
     * @return hvacDeviceConfigVOList
     */
    public java.util.List < HvacDeviceConfigVOList> getHvacDeviceConfigVOList() {
        return this.hvacDeviceConfigVOList;
    }

    /**
     * @return systemId
     */
    public String getSystemId() {
        return this.systemId;
    }

    public static final class Builder extends Request.Builder<EditProhibitedDevicesRequest, Builder> {
        private String factoryId; 
        private java.util.List < HvacDeviceConfigVOList> hvacDeviceConfigVOList; 
        private String systemId; 

        private Builder() {
            super();
        } 

        private Builder(EditProhibitedDevicesRequest request) {
            super(request);
            this.factoryId = request.factoryId;
            this.hvacDeviceConfigVOList = request.hvacDeviceConfigVOList;
            this.systemId = request.systemId;
        } 

        /**
         * factoryId.
         */
        public Builder factoryId(String factoryId) {
            this.putBodyParameter("factoryId", factoryId);
            this.factoryId = factoryId;
            return this;
        }

        /**
         * hvacDeviceConfigVOList.
         */
        public Builder hvacDeviceConfigVOList(java.util.List < HvacDeviceConfigVOList> hvacDeviceConfigVOList) {
            this.putBodyParameter("hvacDeviceConfigVOList", hvacDeviceConfigVOList);
            this.hvacDeviceConfigVOList = hvacDeviceConfigVOList;
            return this;
        }

        /**
         * systemId.
         */
        public Builder systemId(String systemId) {
            this.putBodyParameter("systemId", systemId);
            this.systemId = systemId;
            return this;
        }

        @Override
        public EditProhibitedDevicesRequest build() {
            return new EditProhibitedDevicesRequest(this);
        } 

    } 

    public static class HvacDeviceConfigVOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildingId")
        private String buildingId;

        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("deviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("deviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("fenceId")
        private String fenceId;

        @com.aliyun.core.annotation.NameInMap("floorId")
        private String floorId;

        @com.aliyun.core.annotation.NameInMap("isForbidden")
        private Integer isForbidden;

        @com.aliyun.core.annotation.NameInMap("isUnfavorableArea")
        private Integer isUnfavorableArea;

        private HvacDeviceConfigVOList(Builder builder) {
            this.buildingId = builder.buildingId;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.deviceType = builder.deviceType;
            this.fenceId = builder.fenceId;
            this.floorId = builder.floorId;
            this.isForbidden = builder.isForbidden;
            this.isUnfavorableArea = builder.isUnfavorableArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HvacDeviceConfigVOList create() {
            return builder().build();
        }

        /**
         * @return buildingId
         */
        public String getBuildingId() {
            return this.buildingId;
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
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return fenceId
         */
        public String getFenceId() {
            return this.fenceId;
        }

        /**
         * @return floorId
         */
        public String getFloorId() {
            return this.floorId;
        }

        /**
         * @return isForbidden
         */
        public Integer getIsForbidden() {
            return this.isForbidden;
        }

        /**
         * @return isUnfavorableArea
         */
        public Integer getIsUnfavorableArea() {
            return this.isUnfavorableArea;
        }

        public static final class Builder {
            private String buildingId; 
            private String deviceId; 
            private String deviceName; 
            private String deviceType; 
            private String fenceId; 
            private String floorId; 
            private Integer isForbidden; 
            private Integer isUnfavorableArea; 

            /**
             * buildingId.
             */
            public Builder buildingId(String buildingId) {
                this.buildingId = buildingId;
                return this;
            }

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
             * deviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * fenceId.
             */
            public Builder fenceId(String fenceId) {
                this.fenceId = fenceId;
                return this;
            }

            /**
             * floorId.
             */
            public Builder floorId(String floorId) {
                this.floorId = floorId;
                return this;
            }

            /**
             * isForbidden.
             */
            public Builder isForbidden(Integer isForbidden) {
                this.isForbidden = isForbidden;
                return this;
            }

            /**
             * isUnfavorableArea.
             */
            public Builder isUnfavorableArea(Integer isUnfavorableArea) {
                this.isUnfavorableArea = isUnfavorableArea;
                return this;
            }

            public HvacDeviceConfigVOList build() {
                return new HvacDeviceConfigVOList(this);
            } 

        } 

    }
}
