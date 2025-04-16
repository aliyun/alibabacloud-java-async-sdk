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
 * {@link DescribeACLProtectTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeACLProtectTrendResponseBody</p>
 */
public class DescribeACLProtectTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InProtectCnt")
    private Long inProtectCnt;

    @com.aliyun.core.annotation.NameInMap("InterVPCProtectCnt")
    private Long interVPCProtectCnt;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("OutProtectCnt")
    private Long outProtectCnt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalProtectCnt")
    private Long totalProtectCnt;

    @com.aliyun.core.annotation.NameInMap("TrendList")
    private java.util.List<TrendList> trendList;

    private DescribeACLProtectTrendResponseBody(Builder builder) {
        this.inProtectCnt = builder.inProtectCnt;
        this.interVPCProtectCnt = builder.interVPCProtectCnt;
        this.interval = builder.interval;
        this.outProtectCnt = builder.outProtectCnt;
        this.requestId = builder.requestId;
        this.totalProtectCnt = builder.totalProtectCnt;
        this.trendList = builder.trendList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeACLProtectTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inProtectCnt
     */
    public Long getInProtectCnt() {
        return this.inProtectCnt;
    }

    /**
     * @return interVPCProtectCnt
     */
    public Long getInterVPCProtectCnt() {
        return this.interVPCProtectCnt;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return outProtectCnt
     */
    public Long getOutProtectCnt() {
        return this.outProtectCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalProtectCnt
     */
    public Long getTotalProtectCnt() {
        return this.totalProtectCnt;
    }

    /**
     * @return trendList
     */
    public java.util.List<TrendList> getTrendList() {
        return this.trendList;
    }

    public static final class Builder {
        private Long inProtectCnt; 
        private Long interVPCProtectCnt; 
        private Integer interval; 
        private Long outProtectCnt; 
        private String requestId; 
        private Long totalProtectCnt; 
        private java.util.List<TrendList> trendList; 

        private Builder() {
        } 

        private Builder(DescribeACLProtectTrendResponseBody model) {
            this.inProtectCnt = model.inProtectCnt;
            this.interVPCProtectCnt = model.interVPCProtectCnt;
            this.interval = model.interval;
            this.outProtectCnt = model.outProtectCnt;
            this.requestId = model.requestId;
            this.totalProtectCnt = model.totalProtectCnt;
            this.trendList = model.trendList;
        } 

        /**
         * <p>The number of internal requests that are blocked by the ACL feature.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder inProtectCnt(Long inProtectCnt) {
            this.inProtectCnt = inProtectCnt;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder interVPCProtectCnt(Long interVPCProtectCnt) {
            this.interVPCProtectCnt = interVPCProtectCnt;
            return this;
        }

        /**
         * <p>The interval for returning data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The number of external requests that are blocked by the ACL feature.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder outProtectCnt(Long outProtectCnt) {
            this.outProtectCnt = outProtectCnt;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9063AB86-6FFA-5B2D-A16D-697C966DECA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of requests that are blocked by the ACL feature.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalProtectCnt(Long totalProtectCnt) {
            this.totalProtectCnt = totalProtectCnt;
            return this;
        }

        /**
         * <p>The statistics on the requests that are blocked by the ACL feature.</p>
         */
        public Builder trendList(java.util.List<TrendList> trendList) {
            this.trendList = trendList;
            return this;
        }

        public DescribeACLProtectTrendResponseBody build() {
            return new DescribeACLProtectTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeACLProtectTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLProtectTrendResponseBody</p>
     */
    public static class TrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectCnt")
        private Integer protectCnt;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private TrendList(Builder builder) {
            this.protectCnt = builder.protectCnt;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrendList create() {
            return builder().build();
        }

        /**
         * @return protectCnt
         */
        public Integer getProtectCnt() {
            return this.protectCnt;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer protectCnt; 
            private Long time; 

            private Builder() {
            } 

            private Builder(TrendList model) {
                this.protectCnt = model.protectCnt;
                this.time = model.time;
            } 

            /**
             * <p>The number of requests that are blocked by ACL on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder protectCnt(Integer protectCnt) {
                this.protectCnt = protectCnt;
                return this;
            }

            /**
             * <p>The UNIX timestamp at midnight (00:00:00) of each day, which indicates the date of the current day. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1697299200</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public TrendList build() {
                return new TrendList(this);
            } 

        } 

    }
}
