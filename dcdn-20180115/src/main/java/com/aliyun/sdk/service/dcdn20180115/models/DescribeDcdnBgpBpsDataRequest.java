// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnBgpBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnBgpBpsDataRequest</p>
 */
public class DescribeDcdnBgpBpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevicePort")
    private String devicePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The name of the device. If you specify this parameter, the data of the device is returned. Otherwise, the data of all devices is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>devicename</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The port of the device. If you specify this parameter, the data of the port is returned. Otherwise, the data of all ports is returned. This parameter takes effect only when the <strong>DeviceName</strong> parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder devicePort(String devicePort) {
            this.putQueryParameter("DevicePort", devicePort);
            this.devicePort = devicePort;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The data collection interval. Unit: seconds. Valid values: 300 and 3600. Default value: 300. The default value of 300 seconds is equal to 5 minutes. The value of this parameter varies based on the time range from the specified start time to the specified end time.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The ISPs. If you need to specify multiple ISPs, separate them with commas (,). If you specify multiple ISPs, the data for the ISPs is aggregated. If you do not specify this parameter, the operation returns the data for all the ISPs.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cu: China Unicom</li>
         * <li>cmi: China Mobile</li>
         * <li>ct: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cu</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The minimum data collection interval is an hour.</p>
         * <p>If you do not set this parameter, data collected in the last 24 hours is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-29T00:00:00Z</p>
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
