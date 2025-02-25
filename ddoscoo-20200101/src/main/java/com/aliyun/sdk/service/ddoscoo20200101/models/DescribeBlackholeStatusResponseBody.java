// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeBlackholeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlackholeStatusResponseBody</p>
 */
public class DescribeBlackholeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlackholeStatus")
    private java.util.List<BlackholeStatus> blackholeStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<BlackholeStatus> getBlackholeStatus() {
        return this.blackholeStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BlackholeStatus> blackholeStatus; 
        private String requestId; 

        /**
         * <p>An array that consists of the blackhole filtering status of the instance.</p>
         */
        public Builder blackholeStatus(java.util.List<BlackholeStatus> blackholeStatus) {
            this.blackholeStatus = blackholeStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBlackholeStatusResponseBody build() {
            return new DescribeBlackholeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBlackholeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBlackholeStatusResponseBody</p>
     */
    public static class BlackholeStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackStatus")
        private String blackStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>Indicates whether blackhole filtering is triggered for the instance. Valid values:</p>
             * <ul>
             * <li><strong>blackhole</strong>: yes</li>
             * <li><strong>normal</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blackhole</p>
             */
            public Builder blackStatus(String blackStatus) {
                this.blackStatus = blackStatus;
                return this;
            }

            /**
             * <p>The end time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1540196323</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.132</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The start time of blackhole filtering. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1540195323</p>
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
