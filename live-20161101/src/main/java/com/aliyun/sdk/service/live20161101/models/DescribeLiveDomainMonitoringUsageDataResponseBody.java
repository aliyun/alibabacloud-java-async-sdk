// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainMonitoringUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainMonitoringUsageDataResponseBody</p>
 */
public class DescribeLiveDomainMonitoringUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("MonitoringData")
    private MonitoringData monitoringData;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainMonitoringUsageDataResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.monitoringData = builder.monitoringData;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainMonitoringUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return monitoringData
     */
    public MonitoringData getMonitoringData() {
        return this.monitoringData;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder {
        private String domainName; 
        private String endTime; 
        private String instanceId; 
        private MonitoringData monitoringData; 
        private String region; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainMonitoringUsageDataResponseBody model) {
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.instanceId = model.instanceId;
            this.monitoringData = model.monitoringData;
            this.region = model.region;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-10T22:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>e62af24d-a354-3b0c-9f1f-da592c4b****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The live monitoring data.</p>
         */
        public Builder monitoringData(MonitoringData monitoringData) {
            this.monitoringData = monitoringData;
            return this;
        }

        /**
         * <p>The region of the live center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBody build() {
            return new DescribeLiveDomainMonitoringUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainMonitoringUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainMonitoringUsageDataResponseBody</p>
     */
    public static class MonitoringDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private MonitoringDataItem(Builder builder) {
            this.domainName = builder.domainName;
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.resolution = builder.resolution;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoringDataItem create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String domainName; 
            private Integer duration; 
            private String instanceId; 
            private String region; 
            private String resolution; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(MonitoringDataItem model) {
                this.domainName = model.domainName;
                this.duration = model.duration;
                this.instanceId = model.instanceId;
                this.region = model.region;
                this.resolution = model.resolution;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The domain name. This field is valid only when you specify domain for the <strong>SplitBy</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The duration. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the monitoring session. This field is valid only when you specify instance for the <strong>SplitBy</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>e62af24d-a354-3b0c-9f1f-da592c4b****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region of the live center. This field is valid only when you specify Region for the <strong>SplitBy</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The resolution. This field is valid only when you specify resolution for the <strong>SplitBy</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>720P</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public MonitoringDataItem build() {
                return new MonitoringDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainMonitoringUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainMonitoringUsageDataResponseBody</p>
     */
    public static class MonitoringData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitoringDataItem")
        private java.util.List<MonitoringDataItem> monitoringDataItem;

        private MonitoringData(Builder builder) {
            this.monitoringDataItem = builder.monitoringDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoringData create() {
            return builder().build();
        }

        /**
         * @return monitoringDataItem
         */
        public java.util.List<MonitoringDataItem> getMonitoringDataItem() {
            return this.monitoringDataItem;
        }

        public static final class Builder {
            private java.util.List<MonitoringDataItem> monitoringDataItem; 

            private Builder() {
            } 

            private Builder(MonitoringData model) {
                this.monitoringDataItem = model.monitoringDataItem;
            } 

            /**
             * MonitoringDataItem.
             */
            public Builder monitoringDataItem(java.util.List<MonitoringDataItem> monitoringDataItem) {
                this.monitoringDataItem = monitoringDataItem;
                return this;
            }

            public MonitoringData build() {
                return new MonitoringData(this);
            } 

        } 

    }
}
