// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackholeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlackholeStatusResponseBody</p>
 */
public class DescribeBlackholeStatusResponseBody extends TeaModel {
    @NameInMap("BlackholeStatus")
    private java.util.List < BlackholeStatus> blackholeStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBlackholeStatusResponseBody(Builder builder) {
        this.blackholeStatus = builder.blackholeStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackholeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return blackholeStatus
     */
    public java.util.List < BlackholeStatus> getBlackholeStatus() {
        return this.blackholeStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BlackholeStatus> blackholeStatus; 
        private String requestId; 

        /**
         * An array that consists of the blackhole filtering status of the instance.
         */
        public Builder blackholeStatus(java.util.List < BlackholeStatus> blackholeStatus) {
            this.blackholeStatus = blackholeStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBlackholeStatusResponseBody build() {
            return new DescribeBlackholeStatusResponseBody(this);
        } 

    } 

    public static class BlackholeStatus extends TeaModel {
        @NameInMap("BlackStatus")
        private String blackStatus;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("StartTime")
        private Long startTime;

        private BlackholeStatus(Builder builder) {
            this.blackStatus = builder.blackStatus;
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackholeStatus create() {
            return builder().build();
        }

        /**
         * @return blackStatus
         */
        public String getBlackStatus() {
            return this.blackStatus;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String blackStatus; 
            private Long endTime; 
            private String ip; 
            private Long startTime; 

            /**
             * Indicates whether blackhole filtering is triggered for the instance. Valid values:
             * <p>
             * 
             * *   **blackhole**: yes
             * *   **normal**: no
             */
            public Builder blackStatus(String blackStatus) {
                this.blackStatus = blackStatus;
                return this;
            }

            /**
             * The end time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The start time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public BlackholeStatus build() {
                return new BlackholeStatus(this);
            } 

        } 

    }
}
