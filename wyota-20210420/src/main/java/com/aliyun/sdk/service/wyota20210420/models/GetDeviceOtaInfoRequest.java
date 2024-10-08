// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceOtaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceOtaInfoRequest</p>
 */
public class GetDeviceOtaInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsVersion")
    private String osVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetVersionType")
    private String targetVersionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private GetDeviceOtaInfoRequest(Builder builder) {
        super(builder);
        this.baseVersion = builder.baseVersion;
        this.channel = builder.channel;
        this.deviceId = builder.deviceId;
        this.model = builder.model;
        this.networkType = builder.networkType;
        this.osVersion = builder.osVersion;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.targetVersionType = builder.targetVersionType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseVersion
     */
    public String getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetVersionType
     */
    public String getTargetVersionType() {
        return this.targetVersionType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetDeviceOtaInfoRequest, Builder> {
        private String baseVersion; 
        private String channel; 
        private String deviceId; 
        private String model; 
        private String networkType; 
        private String osVersion; 
        private String region; 
        private String regionId; 
        private String targetVersionType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceOtaInfoRequest request) {
            super(request);
            this.baseVersion = request.baseVersion;
            this.channel = request.channel;
            this.deviceId = request.deviceId;
            this.model = request.model;
            this.networkType = request.networkType;
            this.osVersion = request.osVersion;
            this.region = request.region;
            this.regionId = request.regionId;
            this.targetVersionType = request.targetVersionType;
            this.tenantId = request.tenantId;
        } 

        /**
         * BaseVersion.
         */
        public Builder baseVersion(String baseVersion) {
            this.putBodyParameter("BaseVersion", baseVersion);
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * OsVersion.
         */
        public Builder osVersion(String osVersion) {
            this.putBodyParameter("OsVersion", osVersion);
            this.osVersion = osVersion;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TargetVersionType.
         */
        public Builder targetVersionType(String targetVersionType) {
            this.putBodyParameter("TargetVersionType", targetVersionType);
            this.targetVersionType = targetVersionType;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetDeviceOtaInfoRequest build() {
            return new GetDeviceOtaInfoRequest(this);
        } 

    } 

}
