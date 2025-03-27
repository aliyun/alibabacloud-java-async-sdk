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
 * {@link DescribeDDoSL7QpsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSL7QpsListResponseBody</p>
 */
public class DescribeDDoSL7QpsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private Integer dataInterval;

    @com.aliyun.core.annotation.NameInMap("DataModule")
    private java.util.List<DataModule> dataModule;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDDoSL7QpsListResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.dataModule = builder.dataModule;
        this.endTime = builder.endTime;
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSL7QpsListResponseBody create() {
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
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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
        private Long recordId; 
        private String requestId; 
        private Long siteId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDDoSL7QpsListResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.dataModule = model.dataModule;
            this.endTime = model.endTime;
            this.recordId = model.recordId;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time granularity of the queried data, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(Integer dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>Application layer time trend data list.</p>
         */
        public Builder dataModule(java.util.List<DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * <p>The end time of the query.</p>
         * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T19:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86510927836942****</p>
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
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
         * <p>Site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start time of the query.</p>
         * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDDoSL7QpsListResponseBody build() {
            return new DescribeDDoSL7QpsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSL7QpsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSL7QpsListResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attack")
        private Long attack;

        @com.aliyun.core.annotation.NameInMap("Normal")
        private Long normal;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private DataModule(Builder builder) {
            this.attack = builder.attack;
            this.normal = builder.normal;
            this.timeStamp = builder.timeStamp;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return attack
         */
        public Long getAttack() {
            return this.attack;
        }

        /**
         * @return normal
         */
        public Long getNormal() {
            return this.normal;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long attack; 
            private Long normal; 
            private String timeStamp; 
            private Long total; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.attack = model.attack;
                this.normal = model.normal;
                this.timeStamp = model.timeStamp;
                this.total = model.total;
            } 

            /**
             * <p>Attack QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder attack(Long attack) {
                this.attack = attack;
                return this;
            }

            /**
             * <p>Normal QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * <p>Data time, following ISO8601 notation and using UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-19T16:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>Total QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
}
