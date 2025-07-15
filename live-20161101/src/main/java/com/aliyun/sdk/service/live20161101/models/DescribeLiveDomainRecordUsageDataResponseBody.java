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
 * {@link DescribeLiveDomainRecordUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRecordUsageDataResponseBody</p>
 */
public class DescribeLiveDomainRecordUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RecordUsageData")
    private RecordUsageData recordUsageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainRecordUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.recordUsageData = builder.recordUsageData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainRecordUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return recordUsageData
     */
    public RecordUsageData getRecordUsageData() {
        return this.recordUsageData;
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
        private String endTime; 
        private RecordUsageData recordUsageData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainRecordUsageDataResponseBody model) {
            this.endTime = model.endTime;
            this.recordUsageData = model.recordUsageData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The recording data that was collected for each interval.</p>
         */
        public Builder recordUsageData(RecordUsageData recordUsageData) {
            this.recordUsageData = recordUsageData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainRecordUsageDataResponseBody build() {
            return new DescribeLiveDomainRecordUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainRecordUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRecordUsageDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataModule(Builder builder) {
            this.count = builder.count;
            this.domain = builder.domain;
            this.duration = builder.duration;
            this.region = builder.region;
            this.timeStamp = builder.timeStamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long count; 
            private String domain; 
            private Long duration; 
            private String region; 
            private String timeStamp; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.count = model.count;
                this.domain = model.domain;
                this.duration = model.duration;
                this.region = model.region;
                this.timeStamp = model.timeStamp;
                this.type = model.type;
            } 

            /**
             * <p>The number of peak channels.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The main streaming domain. This parameter is returned if the value of the request parameter SplitBy contains <code>domain</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The recording length. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3560</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when recording started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The recording file type. This parameter is returned if the value of the request parameter SplitBy contains <code>record_fmt</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>MP4</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainRecordUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainRecordUsageDataResponseBody</p>
     */
    public static class RecordUsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private RecordUsageData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordUsageData create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(RecordUsageData model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public RecordUsageData build() {
                return new RecordUsageData(this);
            } 

        } 

    }
}
