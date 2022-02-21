// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlockStatusResponseBody</p>
 */
public class DescribeBlockStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusList.
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
        @NameInMap("BlockStatus")
        private String blockStatus;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Line")
        private String line;

        @NameInMap("StartTime")
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
             * BlockStatus.
             */
            public Builder blockStatus(String blockStatus) {
                this.blockStatus = blockStatus;
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
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * StartTime.
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
        @NameInMap("BlockStatusList")
        private java.util.List < BlockStatusList> blockStatusList;

        @NameInMap("Ip")
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
             * BlockStatusList.
             */
            public Builder blockStatusList(java.util.List < BlockStatusList> blockStatusList) {
                this.blockStatusList = blockStatusList;
                return this;
            }

            /**
             * Ip.
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
