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
 * {@link CreateEssOptJobRequest} extends {@link RequestModel}
 *
 * <p>CreateEssOptJobRequest</p>
 */
public class CreateEssOptJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElecPrice")
    private java.util.List<ElecPrice> elecPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Freq")
    private String freq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenPrice")
    private java.util.List<GenPrice> genPrice;

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
    @com.aliyun.core.annotation.NameInMap("SystemData")
    private java.util.List<SystemData> systemData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopoType")
    private String topoType;

    private CreateEssOptJobRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.elecPrice = builder.elecPrice;
        this.freq = builder.freq;
        this.genPrice = builder.genPrice;
        this.location = builder.location;
        this.modelVersion = builder.modelVersion;
        this.runDate = builder.runDate;
        this.systemData = builder.systemData;
        this.timeZone = builder.timeZone;
        this.topoType = builder.topoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEssOptJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return elecPrice
     */
    public java.util.List<ElecPrice> getElecPrice() {
        return this.elecPrice;
    }

    /**
     * @return freq
     */
    public String getFreq() {
        return this.freq;
    }

    /**
     * @return genPrice
     */
    public java.util.List<GenPrice> getGenPrice() {
        return this.genPrice;
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
     * @return systemData
     */
    public java.util.List<SystemData> getSystemData() {
        return this.systemData;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return topoType
     */
    public String getTopoType() {
        return this.topoType;
    }

    public static final class Builder extends Request.Builder<CreateEssOptJobRequest, Builder> {
        private Integer duration; 
        private java.util.List<ElecPrice> elecPrice; 
        private String freq; 
        private java.util.List<GenPrice> genPrice; 
        private Location location; 
        private String modelVersion; 
        private String runDate; 
        private java.util.List<SystemData> systemData; 
        private String timeZone; 
        private String topoType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEssOptJobRequest request) {
            super(request);
            this.duration = request.duration;
            this.elecPrice = request.elecPrice;
            this.freq = request.freq;
            this.genPrice = request.genPrice;
            this.location = request.location;
            this.modelVersion = request.modelVersion;
            this.runDate = request.runDate;
            this.systemData = request.systemData;
            this.timeZone = request.timeZone;
            this.topoType = request.topoType;
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
         * ElecPrice.
         */
        public Builder elecPrice(java.util.List<ElecPrice> elecPrice) {
            String elecPriceShrink = shrink(elecPrice, "ElecPrice", "json");
            this.putBodyParameter("ElecPrice", elecPriceShrink);
            this.elecPrice = elecPrice;
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
         * GenPrice.
         */
        public Builder genPrice(java.util.List<GenPrice> genPrice) {
            String genPriceShrink = shrink(genPrice, "GenPrice", "json");
            this.putBodyParameter("GenPrice", genPriceShrink);
            this.genPrice = genPrice;
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
         * SystemData.
         */
        public Builder systemData(java.util.List<SystemData> systemData) {
            String systemDataShrink = shrink(systemData, "SystemData", "json");
            this.putBodyParameter("SystemData", systemDataShrink);
            this.systemData = systemData;
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
         * TopoType.
         */
        public Builder topoType(String topoType) {
            this.putBodyParameter("TopoType", topoType);
            this.topoType = topoType;
            return this;
        }

        @Override
        public CreateEssOptJobRequest build() {
            return new CreateEssOptJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEssOptJobRequest} extends {@link TeaModel}
     *
     * <p>CreateEssOptJobRequest</p>
     */
    public static class ElecPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        private ElecPrice(Builder builder) {
            this.dataTime = builder.dataTime;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElecPrice create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String dataTime; 
            private String price; 

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            public ElecPrice build() {
                return new ElecPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEssOptJobRequest} extends {@link TeaModel}
     *
     * <p>CreateEssOptJobRequest</p>
     */
    public static class GenPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        private GenPrice(Builder builder) {
            this.dataTime = builder.dataTime;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenPrice create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String dataTime; 
            private String price; 

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            public GenPrice build() {
                return new GenPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEssOptJobRequest} extends {@link TeaModel}
     *
     * <p>CreateEssOptJobRequest</p>
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
    /**
     * 
     * {@link CreateEssOptJobRequest} extends {@link TeaModel}
     *
     * <p>CreateEssOptJobRequest</p>
     */
    public static class SystemData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryData")
        private java.util.List<java.util.Map<String, ?>> historyData;

        @com.aliyun.core.annotation.NameInMap("SystemId")
        private String systemId;

        @com.aliyun.core.annotation.NameInMap("SystemParams")
        private java.util.Map<String, ?> systemParams;

        @com.aliyun.core.annotation.NameInMap("SystemType")
        private String systemType;

        private SystemData(Builder builder) {
            this.historyData = builder.historyData;
            this.systemId = builder.systemId;
            this.systemParams = builder.systemParams;
            this.systemType = builder.systemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemData create() {
            return builder().build();
        }

        /**
         * @return historyData
         */
        public java.util.List<java.util.Map<String, ?>> getHistoryData() {
            return this.historyData;
        }

        /**
         * @return systemId
         */
        public String getSystemId() {
            return this.systemId;
        }

        /**
         * @return systemParams
         */
        public java.util.Map<String, ?> getSystemParams() {
            return this.systemParams;
        }

        /**
         * @return systemType
         */
        public String getSystemType() {
            return this.systemType;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> historyData; 
            private String systemId; 
            private java.util.Map<String, ?> systemParams; 
            private String systemType; 

            /**
             * HistoryData.
             */
            public Builder historyData(java.util.List<java.util.Map<String, ?>> historyData) {
                this.historyData = historyData;
                return this;
            }

            /**
             * SystemId.
             */
            public Builder systemId(String systemId) {
                this.systemId = systemId;
                return this;
            }

            /**
             * SystemParams.
             */
            public Builder systemParams(java.util.Map<String, ?> systemParams) {
                this.systemParams = systemParams;
                return this;
            }

            /**
             * SystemType.
             */
            public Builder systemType(String systemType) {
                this.systemType = systemType;
                return this;
            }

            public SystemData build() {
                return new SystemData(this);
            } 

        } 

    }
}
