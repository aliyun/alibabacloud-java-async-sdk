// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceInfoRequest</p>
 */
public class DescribeDeviceInfoRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("DeviceToken")
    private String deviceToken;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDeviceInfoRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.deviceToken = builder.deviceToken;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceInfoRequest create() {
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
     * @return deviceToken
     */
    public String getDeviceToken() {
        return this.deviceToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceInfoRequest, Builder> {
        private String deviceId; 
        private String deviceToken; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceInfoRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.deviceToken = response.deviceToken;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceToken.
         */
        public Builder deviceToken(String deviceToken) {
            this.putQueryParameter("DeviceToken", deviceToken);
            this.deviceToken = deviceToken;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDeviceInfoRequest build() {
            return new DescribeDeviceInfoRequest(this);
        } 

    } 

}
