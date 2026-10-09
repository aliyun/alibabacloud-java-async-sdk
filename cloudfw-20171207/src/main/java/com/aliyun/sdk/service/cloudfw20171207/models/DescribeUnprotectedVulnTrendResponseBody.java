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
 * {@link DescribeUnprotectedVulnTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnprotectedVulnTrendResponseBody</p>
 */
public class DescribeUnprotectedVulnTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurProtectedCnt")
    private Integer curProtectedCnt;

    @com.aliyun.core.annotation.NameInMap("CurUnprotectedCnt")
    private Integer curUnprotectedCnt;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeUnprotectedVulnTrendResponseBody(Builder builder) {
        this.curProtectedCnt = builder.curProtectedCnt;
        this.curUnprotectedCnt = builder.curUnprotectedCnt;
        this.dataList = builder.dataList;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnprotectedVulnTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return curProtectedCnt
     */
    public Integer getCurProtectedCnt() {
        return this.curProtectedCnt;
    }

    /**
     * @return curUnprotectedCnt
     */
    public Integer getCurUnprotectedCnt() {
        return this.curUnprotectedCnt;
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
        private Integer curProtectedCnt; 
        private Integer curUnprotectedCnt; 
        private java.util.List<DataList> dataList; 
        private Long endTime; 
        private Integer interval; 
        private String requestId; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(DescribeUnprotectedVulnTrendResponseBody model) {
            this.curProtectedCnt = model.curProtectedCnt;
            this.curUnprotectedCnt = model.curUnprotectedCnt;
            this.dataList = model.dataList;
            this.endTime = model.endTime;
            this.interval = model.interval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The number of protected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder curProtectedCnt(Integer curProtectedCnt) {
            this.curProtectedCnt = curProtectedCnt;
            return this;
        }

        /**
         * <p>The number of unprotected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder curUnprotectedCnt(Integer curUnprotectedCnt) {
            this.curUnprotectedCnt = curUnprotectedCnt;
            return this;
        }

        /**
         * <p>The list of returned data.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731551104</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05BEF2B5-EAAA-509D-9824-E3C7DC17****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1749434787</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeUnprotectedVulnTrendResponseBody build() {
            return new DescribeUnprotectedVulnTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUnprotectedVulnTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUnprotectedVulnTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectedVulnCnt")
        private Integer protectedVulnCnt;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("UnprotectedVulnCnt")
        private Integer unprotectedVulnCnt;

        private DataList(Builder builder) {
            this.protectedVulnCnt = builder.protectedVulnCnt;
            this.time = builder.time;
            this.unprotectedVulnCnt = builder.unprotectedVulnCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return protectedVulnCnt
         */
        public Integer getProtectedVulnCnt() {
            return this.protectedVulnCnt;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return unprotectedVulnCnt
         */
        public Integer getUnprotectedVulnCnt() {
            return this.unprotectedVulnCnt;
        }

        public static final class Builder {
            private Integer protectedVulnCnt; 
            private Long time; 
            private Integer unprotectedVulnCnt; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.protectedVulnCnt = model.protectedVulnCnt;
                this.time = model.time;
                this.unprotectedVulnCnt = model.unprotectedVulnCnt;
            } 

            /**
             * <p>The number of protected vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder protectedVulnCnt(Integer protectedVulnCnt) {
                this.protectedVulnCnt = protectedVulnCnt;
                return this;
            }

            /**
             * <p>The timestamp of the vulnerability scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1525833105</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The number of unprotected vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unprotectedVulnCnt(Integer unprotectedVulnCnt) {
                this.unprotectedVulnCnt = unprotectedVulnCnt;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
