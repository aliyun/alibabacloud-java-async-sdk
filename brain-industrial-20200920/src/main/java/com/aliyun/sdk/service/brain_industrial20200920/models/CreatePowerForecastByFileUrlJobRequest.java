// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePowerForecastByFileUrlJobRequest} extends {@link RequestModel}
 *
 * <p>CreatePowerForecastByFileUrlJobRequest</p>
 */
public class CreatePowerForecastByFileUrlJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessKey")
    private String businessKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Freq")
    private String freq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HistoryUrl")
    private String historyUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private Location location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunDate")
    private String runDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemType")
    private String systemType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeColumn")
    private String timeColumn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValueColumn")
    private String valueColumn;

    private CreatePowerForecastByFileUrlJobRequest(Builder builder) {
        super(builder);
        this.businessKey = builder.businessKey;
        this.deviceType = builder.deviceType;
        this.duration = builder.duration;
        this.freq = builder.freq;
        this.historyUrl = builder.historyUrl;
        this.location = builder.location;
        this.modelVersion = builder.modelVersion;
        this.runDate = builder.runDate;
        this.systemType = builder.systemType;
        this.timeColumn = builder.timeColumn;
        this.timeZone = builder.timeZone;
        this.valueColumn = builder.valueColumn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePowerForecastByFileUrlJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessKey
     */
    public String getBusinessKey() {
        return this.businessKey;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return freq
     */
    public String getFreq() {
        return this.freq;
    }

    /**
     * @return historyUrl
     */
    public String getHistoryUrl() {
        return this.historyUrl;
    }

    /**
     * @return location
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return runDate
     */
    public String getRunDate() {
        return this.runDate;
    }

    /**
     * @return systemType
     */
    public String getSystemType() {
        return this.systemType;
    }

    /**
     * @return timeColumn
     */
    public String getTimeColumn() {
        return this.timeColumn;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return valueColumn
     */
    public String getValueColumn() {
        return this.valueColumn;
    }

    public static final class Builder extends Request.Builder<CreatePowerForecastByFileUrlJobRequest, Builder> {
        private String businessKey; 
        private String deviceType; 
        private Integer duration; 
        private String freq; 
        private String historyUrl; 
        private Location location; 
        private String modelVersion; 
        private String runDate; 
        private String systemType; 
        private String timeColumn; 
        private String timeZone; 
        private String valueColumn; 

        private Builder() {
            super();
        } 

        private Builder(CreatePowerForecastByFileUrlJobRequest request) {
            super(request);
            this.businessKey = request.businessKey;
            this.deviceType = request.deviceType;
            this.duration = request.duration;
            this.freq = request.freq;
            this.historyUrl = request.historyUrl;
            this.location = request.location;
            this.modelVersion = request.modelVersion;
            this.runDate = request.runDate;
            this.systemType = request.systemType;
            this.timeColumn = request.timeColumn;
            this.timeZone = request.timeZone;
            this.valueColumn = request.valueColumn;
        } 

        /**
         * BusinessKey.
         */
        public Builder businessKey(String businessKey) {
            this.putBodyParameter("BusinessKey", businessKey);
            this.businessKey = businessKey;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Freq.
         */
        public Builder freq(String freq) {
            this.putBodyParameter("Freq", freq);
            this.freq = freq;
            return this;
        }

        /**
         * HistoryUrl.
         */
        public Builder historyUrl(String historyUrl) {
            this.putBodyParameter("HistoryUrl", historyUrl);
            this.historyUrl = historyUrl;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(Location location) {
            String locationShrink = shrink(location, "Location", "json");
            this.putBodyParameter("Location", locationShrink);
            this.location = location;
            return this;
        }

        /**
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.putBodyParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * RunDate.
         */
        public Builder runDate(String runDate) {
            this.putBodyParameter("RunDate", runDate);
            this.runDate = runDate;
            return this;
        }

        /**
         * SystemType.
         */
        public Builder systemType(String systemType) {
            this.putBodyParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        /**
         * TimeColumn.
         */
        public Builder timeColumn(String timeColumn) {
            this.putBodyParameter("TimeColumn", timeColumn);
            this.timeColumn = timeColumn;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * ValueColumn.
         */
        public Builder valueColumn(String valueColumn) {
            this.putBodyParameter("ValueColumn", valueColumn);
            this.valueColumn = valueColumn;
            return this;
        }

        @Override
        public CreatePowerForecastByFileUrlJobRequest build() {
            return new CreatePowerForecastByFileUrlJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePowerForecastByFileUrlJobRequest} extends {@link TeaModel}
     *
     * <p>CreatePowerForecastByFileUrlJobRequest</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Altitude")
        private Double altitude;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private Double latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private Double longitude;

        private Location(Builder builder) {
            this.altitude = builder.altitude;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return altitude
         */
        public Double getAltitude() {
            return this.altitude;
        }

        /**
         * @return latitude
         */
        public Double getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Double getLongitude() {
            return this.longitude;
        }

        public static final class Builder {
            private Double altitude; 
            private Double latitude; 
            private Double longitude; 

            private Builder() {
            } 

            private Builder(Location model) {
                this.altitude = model.altitude;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
            } 

            /**
             * Altitude.
             */
            public Builder altitude(Double altitude) {
                this.altitude = altitude;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(Double longitude) {
                this.longitude = longitude;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
}
