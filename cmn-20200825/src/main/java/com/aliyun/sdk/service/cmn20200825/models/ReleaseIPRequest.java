// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseIPRequest} extends {@link RequestModel}
 *
 * <p>ReleaseIPRequest</p>
 */
public class ReleaseIPRequest extends Request {
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
    private String ipType;

    @Query
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private ReleaseIPRequest(Builder builder) {
        super(builder);
        this.deviceResourceId = builder.deviceResourceId;
        this.deviceResourceIds = builder.deviceResourceIds;
        this.instanceId = builder.instanceId;
        this.ipType = builder.ipType;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseIPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<ReleaseIPRequest, Builder> {
        private String deviceResourceId; 
        private java.util.List < String > deviceResourceIds; 
        private String instanceId; 
        private String ipType; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseIPRequest request) {
            super(request);
            this.deviceResourceId = request.deviceResourceId;
            this.deviceResourceIds = request.deviceResourceIds;
            this.instanceId = request.instanceId;
            this.ipType = request.ipType;
            this.setupProjectId = request.setupProjectId;
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
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public ReleaseIPRequest build() {
            return new ReleaseIPRequest(this);
        } 

    } 

}
