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

        /**
         * DataInterval.
         */
        public Builder dataInterval(Integer dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DataModule.
         */
        public Builder dataModule(java.util.List<DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * StartTime.
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

            /**
             * Attack.
             */
            public Builder attack(Long attack) {
                this.attack = attack;
                return this;
            }

            /**
             * Normal.
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Total.
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
