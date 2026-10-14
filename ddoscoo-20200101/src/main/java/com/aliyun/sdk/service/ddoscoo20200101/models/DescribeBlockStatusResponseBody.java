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
 * {@link DescribeBlockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlockStatusResponseBody</p>
 */
public class DescribeBlockStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<StatusList> statusList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StatusList> getStatusList() {
        return this.statusList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatusList> statusList; 

        private Builder() {
        } 

        private Builder(DescribeBlockStatusResponseBody model) {
            this.requestId = model.requestId;
            this.statusList = model.statusList;
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

        /**
         * <p>The near-origin traffic diversion configurations of the Anti-DDoS Pro and Anti-DDoS Premium instances.</p>
         */
        public Builder statusList(java.util.List<StatusList> statusList) {
            this.statusList = statusList;
            return this;
        }

        public DescribeBlockStatusResponseBody build() {
            return new DescribeBlockStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBlockStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBlockStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BlockStatusList model) {
                this.blockStatus = model.blockStatus;
                this.endTime = model.endTime;
                this.line = model.line;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The traffic blocking status. Valid values:</p>
             * <ul>
             * <li><strong>areablock</strong>: Blocked.</li>
             * <li><strong>normal</strong>: Normal (not blocked).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>areablock</p>
             */
            public Builder blockStatus(String blockStatus) {
                this.blockStatus = blockStatus;
                return this;
            }

            /**
             * <p>The end time of the blocking. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1540196323</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The type of the blocked line. Valid values:</p>
             * <ul>
             * <li><strong>ct</strong>: China Telecom international line.</li>
             * <li><strong>cut</strong>: China Unicom international line.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cut</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The start time of the blocking. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1540195323</p>
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
    /**
     * 
     * {@link DescribeBlockStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBlockStatusResponseBody</p>
     */
    public static class StatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockStatusList")
        private java.util.List<BlockStatusList> blockStatusList;

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
        public java.util.List<BlockStatusList> getBlockStatusList() {
            return this.blockStatusList;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<BlockStatusList> blockStatusList; 
            private String ip; 

            private Builder() {
            } 

            private Builder(StatusList model) {
                this.blockStatusList = model.blockStatusList;
                this.ip = model.ip;
            } 

            /**
             * <p>The near-origin traffic diversion configurations.</p>
             */
            public Builder blockStatusList(java.util.List<BlockStatusList> blockStatusList) {
                this.blockStatusList = blockStatusList;
                return this;
            }

            /**
             * <p>The IP address of the Anti-DDoS Pro and Anti-DDoS Premium instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.XX.XX.88</p>
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
