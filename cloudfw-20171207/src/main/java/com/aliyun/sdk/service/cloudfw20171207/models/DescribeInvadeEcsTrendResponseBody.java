// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInvadeEcsTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEcsTrendResponseBody</p>
 */
public class DescribeInvadeEcsTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("InvadeEcsCount")
    private Integer invadeEcsCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeInvadeEcsTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.invadeEcsCount = builder.invadeEcsCount;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEcsTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return invadeEcsCount
     */
    public Integer getInvadeEcsCount() {
        return this.invadeEcsCount;
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long endTime; 
        private Integer interval; 
        private Integer invadeEcsCount; 
        private String requestId; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(DescribeInvadeEcsTrendResponseBody model) {
            this.dataList = model.dataList;
            this.endTime = model.endTime;
            this.interval = model.interval;
            this.invadeEcsCount = model.invadeEcsCount;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * InvadeEcsCount.
         */
        public Builder invadeEcsCount(Integer invadeEcsCount) {
            this.invadeEcsCount = invadeEcsCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeInvadeEcsTrendResponseBody build() {
            return new DescribeInvadeEcsTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvadeEcsTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEcsTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private DataList(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private Long time; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.ecsCount = model.ecsCount;
                this.time = model.time;
            } 

            /**
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
