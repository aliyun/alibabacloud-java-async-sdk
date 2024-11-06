// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainUsageDataResponseBody</p>
 */
public class DescribeDcdnDomainUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UsageDataPerInterval")
    private UsageDataPerInterval usageDataPerInterval;

    private DescribeDcdnDomainUsageDataResponseBody(Builder builder) {
        this.area = builder.area;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.usageDataPerInterval = builder.usageDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return usageDataPerInterval
     */
    public UsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public static final class Builder {
        private String area; 
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private String type; 
        private UsageDataPerInterval usageDataPerInterval; 

        /**
         * <p>The billable region where the usage data was collected.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder area(String area) {
            this.area = area;
            return this;
        }

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T22:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>bps</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The traffic that was collected at each interval.</p>
         */
        public Builder usageDataPerInterval(UsageDataPerInterval usageDataPerInterval) {
            this.usageDataPerInterval = usageDataPerInterval;
            return this;
        }

        public DescribeDcdnDomainUsageDataResponseBody build() {
            return new DescribeDcdnDomainUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainUsageDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeakTime")
        private String peakTime;

        @com.aliyun.core.annotation.NameInMap("SpecialValue")
        private String specialValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.peakTime = builder.peakTime;
            this.specialValue = builder.specialValue;
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return peakTime
         */
        public String getPeakTime() {
            return this.peakTime;
        }

        /**
         * @return specialValue
         */
        public String getSpecialValue() {
            return this.specialValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String peakTime; 
            private String specialValue; 
            private String timeStamp; 
            private String value; 

            /**
             * <p>The time of the peak bandwidth value if the <strong>Field</strong> parameter in the request is set to <strong>bps</strong>. Otherwise, this parameter returns the same value as the <strong>TimeStamp</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T21:30:00Z</p>
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * <p>The data usage in a specific scenario.</p>
             * <blockquote>
             * <p> This parameter indicates the data usage in a specific scenario. If no special billable item is specified, ignore this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4233041**</p>
             */
            public Builder specialValue(String specialValue) {
                this.specialValue = specialValue;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T21:30:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The usage.</p>
             * 
             * <strong>example:</strong>
             * <p>4233041**</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainUsageDataResponseBody</p>
     */
    public static class UsageDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private UsageDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public UsageDataPerInterval build() {
                return new UsageDataPerInterval(this);
            } 

        } 

    }
}
