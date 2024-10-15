// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserAssetIPTrafficInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAssetIPTrafficInfoResponseBody</p>
 */
public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("InBps")
    private Long inBps;

    @com.aliyun.core.annotation.NameInMap("InPps")
    private Long inPps;

    @com.aliyun.core.annotation.NameInMap("NewConn")
    private Long newConn;

    @com.aliyun.core.annotation.NameInMap("OutBps")
    private Long outBps;

    @com.aliyun.core.annotation.NameInMap("OutPps")
    private Long outPps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionCount")
    private Long sessionCount;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeUserAssetIPTrafficInfoResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.inBps = builder.inBps;
        this.inPps = builder.inPps;
        this.newConn = builder.newConn;
        this.outBps = builder.outBps;
        this.outPps = builder.outPps;
        this.requestId = builder.requestId;
        this.sessionCount = builder.sessionCount;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAssetIPTrafficInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return inBps
     */
    public Long getInBps() {
        return this.inBps;
    }

    /**
     * @return inPps
     */
    public Long getInPps() {
        return this.inPps;
    }

    /**
     * @return newConn
     */
    public Long getNewConn() {
        return this.newConn;
    }

    /**
     * @return outBps
     */
    public Long getOutBps() {
        return this.outBps;
    }

    /**
     * @return outPps
     */
    public Long getOutPps() {
        return this.outPps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionCount
     */
    public Long getSessionCount() {
        return this.sessionCount;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private Long inBps; 
        private Long inPps; 
        private Long newConn; 
        private Long outBps; 
        private Long outPps; 
        private String requestId; 
        private Long sessionCount; 
        private Long startTime; 

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656923760</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The network throughput, which indicates the inbound traffic rate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4520</p>
         */
        public Builder inBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }

        /**
         * <p>The inbound network throughput, which indicates the number of packets that are sent inbound per second. Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        public Builder inPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }

        /**
         * <p>The new connection creation rate.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder newConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }

        /**
         * <p>The network throughput, which indicates the outbound traffic rate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4180</p>
         */
        public Builder outBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }

        /**
         * <p>The outbound network throughput, which indicates the number of packets that are sent outbound per second. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>224</p>
         */
        public Builder outPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder sessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656837360</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeUserAssetIPTrafficInfoResponseBody build() {
            return new DescribeUserAssetIPTrafficInfoResponseBody(this);
        } 

    } 

}
