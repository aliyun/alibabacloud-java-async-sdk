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
 * {@link CreateLoadForecastJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadForecastJobRequest</p>
 */
public class CreateLoadForecastJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HistoryData")
    private java.util.List<HistoryData> historyData;

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
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private CreateLoadForecastJobRequest(Builder builder) {
        super(builder);
        this.deviceType = builder.deviceType;
        this.duration = builder.duration;
        this.freq = builder.freq;
        this.historyData = builder.historyData;
        this.modelVersion = builder.modelVersion;
        this.runDate = builder.runDate;
        this.systemType = builder.systemType;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadForecastJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return historyData
     */
    public java.util.List<HistoryData> getHistoryData() {
        return this.historyData;
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
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<CreateLoadForecastJobRequest, Builder> {
        private String deviceType; 
        private Integer duration; 
        private String freq; 
        private java.util.List<HistoryData> historyData; 
        private String modelVersion; 
        private String runDate; 
        private String systemType; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadForecastJobRequest request) {
            super(request);
            this.deviceType = request.deviceType;
            this.duration = request.duration;
            this.freq = request.freq;
            this.historyData = request.historyData;
            this.modelVersion = request.modelVersion;
            this.runDate = request.runDate;
            this.systemType = request.systemType;
            this.timeZone = request.timeZone;
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
         * HistoryData.
         */
        public Builder historyData(java.util.List<HistoryData> historyData) {
            String historyDataShrink = shrink(historyData, "HistoryData", "json");
            this.putBodyParameter("HistoryData", historyDataShrink);
            this.historyData = historyData;
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
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public CreateLoadForecastJobRequest build() {
            return new CreateLoadForecastJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoadForecastJobRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadForecastJobRequest</p>
     */
    public static class HistoryData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RunTime")
        private String runTime;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private HistoryData(Builder builder) {
            this.runTime = builder.runTime;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryData create() {
            return builder().build();
        }

        /**
         * @return runTime
         */
        public String getRunTime() {
            return this.runTime;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String runTime; 
            private Double value; 

            /**
             * RunTime.
             */
            public Builder runTime(String runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public HistoryData build() {
                return new HistoryData(this);
            } 

        } 

    }
}
