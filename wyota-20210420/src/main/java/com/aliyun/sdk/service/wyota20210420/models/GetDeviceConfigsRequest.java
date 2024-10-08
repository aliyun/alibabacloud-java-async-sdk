// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceConfigsRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceConfigsRequest</p>
 */
public class GetDeviceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UrclVersion")
    private String urclVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserCustomId")
    private String userCustomId;

    private GetDeviceConfigsRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.networkType = builder.networkType;
        this.region = builder.region;
        this.serialNo = builder.serialNo;
        this.urclVersion = builder.urclVersion;
        this.userCustomId = builder.userCustomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return urclVersion
     */
    public String getUrclVersion() {
        return this.urclVersion;
    }

    /**
     * @return userCustomId
     */
    public String getUserCustomId() {
        return this.userCustomId;
    }

    public static final class Builder extends Request.Builder<GetDeviceConfigsRequest, Builder> {
        private String deviceId; 
        private String networkType; 
        private String region; 
        private String serialNo; 
        private String urclVersion; 
        private String userCustomId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceConfigsRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.networkType = request.networkType;
            this.region = request.region;
            this.serialNo = request.serialNo;
            this.urclVersion = request.urclVersion;
            this.userCustomId = request.userCustomId;
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
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * UrclVersion.
         */
        public Builder urclVersion(String urclVersion) {
            this.putBodyParameter("UrclVersion", urclVersion);
            this.urclVersion = urclVersion;
            return this;
        }

        /**
         * UserCustomId.
         */
        public Builder userCustomId(String userCustomId) {
            this.putBodyParameter("UserCustomId", userCustomId);
            this.userCustomId = userCustomId;
            return this;
        }

        @Override
        public GetDeviceConfigsRequest build() {
            return new GetDeviceConfigsRequest(this);
        } 

    } 

}
