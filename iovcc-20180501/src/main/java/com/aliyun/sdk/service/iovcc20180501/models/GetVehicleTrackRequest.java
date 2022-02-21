// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVehicleTrackRequest} extends {@link RequestModel}
 *
 * <p>GetVehicleTrackRequest</p>
 */
public class GetVehicleTrackRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Vin")
    private String vin;

    private GetVehicleTrackRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.endTime = builder.endTime;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.vin = builder.vin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVehicleTrackRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return vin
     */
    public String getVin() {
        return this.vin;
    }

    public static final class Builder extends Request.Builder<GetVehicleTrackRequest, Builder> {
        private String deviceId; 
        private Long endTime; 
        private String projectId; 
        private String regionId; 
        private Long startTime; 
        private String vin; 

        private Builder() {
            super();
        } 

        private Builder(GetVehicleTrackRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.endTime = response.endTime;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.vin = response.vin;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 项目ID
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

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Vin.
         */
        public Builder vin(String vin) {
            this.putQueryParameter("Vin", vin);
            this.vin = vin;
            return this;
        }

        @Override
        public GetVehicleTrackRequest build() {
            return new GetVehicleTrackRequest(this);
        } 

    } 

}
