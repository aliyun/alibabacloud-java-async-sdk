// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceForInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceForInstanceRequest</p>
 */
public class DeleteDeviceForInstanceRequest extends Request {
    @Body
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private String algorithmId;

    @Body
    @NameInMap("DeleteInstanceFlag")
    @Validation(required = true)
    private Boolean deleteInstanceFlag;

    @Body
    @NameInMap("DeviceCount")
    private String deviceCount;

    @Body
    @NameInMap("Devices")
    @Validation(required = true)
    private java.util.List < Devices> devices;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private DeleteDeviceForInstanceRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.deleteInstanceFlag = builder.deleteInstanceFlag;
        this.deviceCount = builder.deviceCount;
        this.devices = builder.devices;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceForInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return deleteInstanceFlag
     */
    public Boolean getDeleteInstanceFlag() {
        return this.deleteInstanceFlag;
    }

    /**
     * @return deviceCount
     */
    public String getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DeleteDeviceForInstanceRequest, Builder> {
        private String algorithmId; 
        private Boolean deleteInstanceFlag; 
        private String deviceCount; 
        private java.util.List < Devices> devices; 
        private String instanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceForInstanceRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.deleteInstanceFlag = response.deleteInstanceFlag;
            this.deviceCount = response.deviceCount;
            this.devices = response.devices;
            this.instanceId = response.instanceId;
            this.projectId = response.projectId;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putBodyParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * DeleteInstanceFlag.
         */
        public Builder deleteInstanceFlag(Boolean deleteInstanceFlag) {
            this.putBodyParameter("DeleteInstanceFlag", deleteInstanceFlag);
            this.deleteInstanceFlag = deleteInstanceFlag;
            return this;
        }

        /**
         * DeviceCount.
         */
        public Builder deviceCount(String deviceCount) {
            this.putBodyParameter("DeviceCount", deviceCount);
            this.deviceCount = deviceCount;
            return this;
        }

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.putBodyParameter("Devices", devices);
            this.devices = devices;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DeleteDeviceForInstanceRequest build() {
            return new DeleteDeviceForInstanceRequest(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("RegionId")
        private String regionId;

        private Devices(Builder builder) {
            this.deviceId = builder.deviceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String deviceId; 
            private String regionId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
