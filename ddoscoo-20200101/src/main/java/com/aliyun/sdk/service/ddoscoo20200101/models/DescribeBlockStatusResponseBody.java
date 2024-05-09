// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlockStatusResponseBody</p>
 */
public class DescribeBlockStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List < StatusList> statusList;

    private DescribeBlockStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusList
     */
    public java.util.List < StatusList> getStatusList() {
        return this.statusList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StatusList> statusList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of details of the Diversion from Origin Server configurations of the instance.
         */
        public Builder statusList(java.util.List < StatusList> statusList) {
            this.statusList = statusList;
            return this;
        }

        public DescribeBlockStatusResponseBody build() {
            return new DescribeBlockStatusResponseBody(this);
        } 

    } 

    public static class BlockStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockStatus")
        private String blockStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private BlockStatusList(Builder builder) {
            this.blockStatus = builder.blockStatus;
            this.endTime = builder.endTime;
            this.line = builder.line;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockStatusList create() {
            return builder().build();
        }

        /**
         * @return blockStatus
         */
        public String getBlockStatus() {
            return this.blockStatus;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String blockStatus; 
            private Long endTime; 
            private String line; 
            private Long startTime; 

            /**
             * The blocking status of the network traffic. Valid values:
             * <p>
             * 
             * *   **areablock**: Network traffic is blocked.
             * *   **normal**: Network traffic is not blocked.
             */
            public Builder blockStatus(String blockStatus) {
                this.blockStatus = blockStatus;
                return this;
            }

            /**
             * The end time of the blocking. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The Internet service provider (ISP) line from which the traffic is blocked. Valid values:
             * <p>
             * 
             * *   **ct**: China Telecom (International)
             * *   **cut**: China Unicom (International)
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * The start time of the blocking. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public BlockStatusList build() {
                return new BlockStatusList(this);
            } 

        } 

    }
    public static class StatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockStatusList")
        private java.util.List < BlockStatusList> blockStatusList;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private StatusList(Builder builder) {
            this.blockStatusList = builder.blockStatusList;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusList create() {
            return builder().build();
        }

        /**
         * @return blockStatusList
         */
        public java.util.List < BlockStatusList> getBlockStatusList() {
            return this.blockStatusList;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < BlockStatusList> blockStatusList; 
            private String ip; 

            /**
             * An array that consists of details of the Diversion from Origin Server configuration.
             */
            public Builder blockStatusList(java.util.List < BlockStatusList> blockStatusList) {
                this.blockStatusList = blockStatusList;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public StatusList build() {
                return new StatusList(this);
            } 

        } 

    }
}
