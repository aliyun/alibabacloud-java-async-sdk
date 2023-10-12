// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyIPRequest} extends {@link RequestModel}
 *
 * <p>ApplyIPRequest</p>
 */
public class ApplyIPRequest extends Request {
    @Query
    @NameInMap("BusinessTypeId")
    private String businessTypeId;

    @Query
    @NameInMap("BusinessTypeParams")
    private String businessTypeParams;

    @Query
    @NameInMap("DeviceResourceId")
    private String deviceResourceId;

    @Query
    @NameInMap("DeviceResourceIds")
    private java.util.List < String > deviceResourceIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("IpType")
    @Validation(required = true)
    private String ipType;

    @Query
    @NameInMap("LoopbackPort")
    private String loopbackPort;

    @Query
    @NameInMap("NetLocation")
    private String netLocation;

    @Query
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private ApplyIPRequest(Builder builder) {
        super(builder);
        this.businessTypeId = builder.businessTypeId;
        this.businessTypeParams = builder.businessTypeParams;
        this.deviceResourceId = builder.deviceResourceId;
        this.deviceResourceIds = builder.deviceResourceIds;
        this.instanceId = builder.instanceId;
        this.ipType = builder.ipType;
        this.loopbackPort = builder.loopbackPort;
        this.netLocation = builder.netLocation;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyIPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * @return businessTypeParams
     */
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    /**
     * @return deviceResourceId
     */
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    /**
     * @return deviceResourceIds
     */
    public java.util.List < String > getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return loopbackPort
     */
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    /**
     * @return netLocation
     */
    public String getNetLocation() {
        return this.netLocation;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<ApplyIPRequest, Builder> {
        private String businessTypeId; 
        private String businessTypeParams; 
        private String deviceResourceId; 
        private java.util.List < String > deviceResourceIds; 
        private String instanceId; 
        private String ipType; 
        private String loopbackPort; 
        private String netLocation; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyIPRequest request) {
            super(request);
            this.businessTypeId = request.businessTypeId;
            this.businessTypeParams = request.businessTypeParams;
            this.deviceResourceId = request.deviceResourceId;
            this.deviceResourceIds = request.deviceResourceIds;
            this.instanceId = request.instanceId;
            this.ipType = request.ipType;
            this.loopbackPort = request.loopbackPort;
            this.netLocation = request.netLocation;
            this.setupProjectId = request.setupProjectId;
        } 

        /**
         * BusinessTypeId.
         */
        public Builder businessTypeId(String businessTypeId) {
            this.putQueryParameter("BusinessTypeId", businessTypeId);
            this.businessTypeId = businessTypeId;
            return this;
        }

        /**
         * BusinessTypeParams.
         */
        public Builder businessTypeParams(String businessTypeParams) {
            this.putQueryParameter("BusinessTypeParams", businessTypeParams);
            this.businessTypeParams = businessTypeParams;
            return this;
        }

        /**
         * DeviceResourceId.
         */
        public Builder deviceResourceId(String deviceResourceId) {
            this.putQueryParameter("DeviceResourceId", deviceResourceId);
            this.deviceResourceId = deviceResourceId;
            return this;
        }

        /**
         * DeviceResourceIds.
         */
        public Builder deviceResourceIds(java.util.List < String > deviceResourceIds) {
            String deviceResourceIdsShrink = shrink(deviceResourceIds, "DeviceResourceIds", "json");
            this.putQueryParameter("DeviceResourceIds", deviceResourceIdsShrink);
            this.deviceResourceIds = deviceResourceIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpType.
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * LoopbackPort.
         */
        public Builder loopbackPort(String loopbackPort) {
            this.putQueryParameter("LoopbackPort", loopbackPort);
            this.loopbackPort = loopbackPort;
            return this;
        }

        /**
         * NetLocation.
         */
        public Builder netLocation(String netLocation) {
            this.putQueryParameter("NetLocation", netLocation);
            this.netLocation = netLocation;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public ApplyIPRequest build() {
            return new ApplyIPRequest(this);
        } 

    } 

}
