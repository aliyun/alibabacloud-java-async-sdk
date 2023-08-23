// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAssetIPTrafficInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAssetIPTrafficInfoResponseBody</p>
 */
public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("InBps")
    private Long inBps;

    @NameInMap("InPps")
    private Long inPps;

    @NameInMap("NewConn")
    private Long newConn;

    @NameInMap("OutBps")
    private Long outBps;

    @NameInMap("OutPps")
    private Long outPps;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SessionCount")
    private Long sessionCount;

    @NameInMap("StartTime")
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
         * The end of the time range that is queried. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The network throughput, which indicates the inbound traffic rate. Unit: bit/s.
         */
        public Builder inBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }

        /**
         * The network throughput, which indicates the inbound packet rate. Unit: packets per second (pps).
         */
        public Builder inPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }

        /**
         * The number of new connections.
         */
        public Builder newConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }

        /**
         * The network throughput, which indicates the outbound traffic rate. Unit: bit/s.
         */
        public Builder outBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }

        /**
         * The network throughput, which indicates the outbound packet rate. Unit: pps.
         */
        public Builder outPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of requests.
         */
        public Builder sessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }

        /**
         * The beginning of the time range that is queried. The value is a UNIX timestamp. Unit: seconds.
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
