// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSBpsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSBpsListResponseBody</p>
 */
public class DescribeDDoSBpsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private Integer dataInterval;

    @com.aliyun.core.annotation.NameInMap("DataModule")
    private java.util.List<DataModule> dataModule;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDDoSBpsListResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.dataModule = builder.dataModule;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSBpsListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInterval
     */
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return dataModule
     */
    public java.util.List<DataModule> getDataModule() {
        return this.dataModule;
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

    public static final class Builder {
        private Integer dataInterval; 
        private java.util.List<DataModule> dataModule; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDDoSBpsListResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.dataModule = model.dataModule;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The interval between each piece of data, in seconds.</p>
         * <p>Generated based on the interval between StartTime and EndTime: less than 1 hour, 60s; 1 hour or more but less than 1 day, 300s; 1 day or more but less than a week, 1800s; 1 week or more, 3600s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(Integer dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>A list of network bandwidth data for each time interval.</p>
         */
        public Builder dataModule(java.util.List<DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * <p>The end time for fetching data. In ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
         * <p>The end time must be later than the start time, and the span between start and end times should not exceed 31 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-18T06:19:42Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time for fetching data. In ISO8601 format, using UTC, formatted as: YYYY-MM-DDThh:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14T17:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDDoSBpsListResponseBody build() {
            return new DescribeDDoSBpsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSBpsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSBpsListResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackBps")
        private Long attackBps;

        @com.aliyun.core.annotation.NameInMap("AttackPps")
        private Long attackPps;

        @com.aliyun.core.annotation.NameInMap("NormalBps")
        private Long normalBps;

        @com.aliyun.core.annotation.NameInMap("NormalPps")
        private Long normalPps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        @com.aliyun.core.annotation.NameInMap("TotalPps")
        private Long totalPps;

        private DataModule(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.normalBps = builder.normalBps;
            this.normalPps = builder.normalPps;
            this.timeStamp = builder.timeStamp;
            this.totalBps = builder.totalBps;
            this.totalPps = builder.totalPps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Long getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Long getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return normalBps
         */
        public Long getNormalBps() {
            return this.normalBps;
        }

        /**
         * @return normalPps
         */
        public Long getNormalPps() {
            return this.normalPps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        /**
         * @return totalPps
         */
        public Long getTotalPps() {
            return this.totalPps;
        }

        public static final class Builder {
            private Long attackBps; 
            private Long attackPps; 
            private Long normalBps; 
            private Long normalPps; 
            private String timeStamp; 
            private Long totalBps; 
            private Long totalPps; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.attackBps = model.attackBps;
                this.attackPps = model.attackPps;
                this.normalBps = model.normalBps;
                this.normalPps = model.normalPps;
                this.timeStamp = model.timeStamp;
                this.totalBps = model.totalBps;
                this.totalPps = model.totalPps;
            } 

            /**
             * <p>Attack bandwidth, in bps.</p>
             * 
             * <strong>example:</strong>
             * <p>9000000000</p>
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * <p>Attack PPS.</p>
             * 
             * <strong>example:</strong>
             * <p>9000000</p>
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * <p>Normal business bandwidth, in bps.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000</p>
             */
            public Builder normalBps(Long normalBps) {
                this.normalBps = normalBps;
                return this;
            }

            /**
             * <p>Normal business PPS.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder normalPps(Long normalPps) {
                this.normalPps = normalPps;
                return this;
            }

            /**
             * <p>The timestamp of this data, in ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-14T17:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>Total bandwidth, in bps.</p>
             * 
             * <strong>example:</strong>
             * <p>10000000000</p>
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * <p>Total PPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100000000</p>
             */
            public Builder totalPps(Long totalPps) {
                this.totalPps = totalPps;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
}
