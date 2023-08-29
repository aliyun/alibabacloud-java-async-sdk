// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnBgpBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnBgpBpsDataRequest</p>
 */
public class DescribeDcdnBgpBpsDataRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DevicePort")
    private String devicePort;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnBgpBpsDataRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.devicePort = builder.devicePort;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.isp = builder.isp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnBgpBpsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return devicePort
     */
    public String getDevicePort() {
        return this.devicePort;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnBgpBpsDataRequest, Builder> {
        private String deviceName; 
        private String devicePort; 
        private String endTime; 
        private String interval; 
        private String isp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnBgpBpsDataRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.devicePort = request.devicePort;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.isp = request.isp;
            this.startTime = request.startTime;
        } 

        /**
         * The name of the device. If you specify this parameter, the data of the device is returned. Otherwise, the data of all devices is returned.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * The port of the device. If you specify this parameter, the data of the port is returned. Otherwise, the data of all ports is returned. This parameter takes effect only when the **DeviceName** parameter is specified.
         */
        public Builder devicePort(String devicePort) {
            this.putQueryParameter("DevicePort", devicePort);
            this.devicePort = devicePort;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The data collection interval. Unit: seconds. Valid values: 300 and 3600. Default value: 300. The default value of 300 seconds is equal to 5 minutes. The value of this parameter varies based on the time range from the specified start time to the specified end time.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The ISPs. If you need to specify multiple ISPs, separate them with commas (,). If you specify multiple ISPs, the data for the ISPs is aggregated. If you do not specify this parameter, the operation returns the data for all the ISPs.
         * <p>
         * 
         * Valid values:
         * 
         * *   cu: China Unicom
         * *   cmi: China Mobile
         * *   ct: China Telecom
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * The minimum data collection interval is an hour.
         * 
         * If you do not set this parameter, data collected in the last 24 hours is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnBgpBpsDataRequest build() {
            return new DescribeDcdnBgpBpsDataRequest(this);
        } 

    } 

}
