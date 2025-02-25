// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReadDBInstanceDelayResponseBody</p>
 */
public class DescribeReadDBInstanceDelayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DelayTime")
    private Integer delayTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("ReadDBInstanceId")
    private String readDBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeReadDBInstanceDelayResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.delayTime = builder.delayTime;
        this.items = builder.items;
        this.readDBInstanceId = builder.readDBInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReadDBInstanceDelayResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return delayTime
     */
    public Integer getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return readDBInstanceId
     */
    public String getReadDBInstanceId() {
        return this.readDBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Integer delayTime; 
        private Items items; 
        private String readDBInstanceId; 
        private String requestId; 

        /**
         * <p>The primary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The latency of data replication. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>The latency information.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The read-only instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rr-bp*****</p>
         */
        public Builder readDBInstanceId(String readDBInstanceId) {
            this.readDBInstanceId = readDBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1BDDEA8-452D-450B-AB10-CD5C5BAFC5DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReadDBInstanceDelayResponseBody build() {
            return new DescribeReadDBInstanceDelayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class ReadDBInstanceNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadDBInstanceName")
        private java.util.List<String> readDBInstanceName;

        private ReadDBInstanceNames(Builder builder) {
            this.readDBInstanceName = builder.readDBInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadDBInstanceNames create() {
            return builder().build();
        }

        /**
         * @return readDBInstanceName
         */
        public java.util.List<String> getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

        public static final class Builder {
            private java.util.List<String> readDBInstanceName; 

            /**
             * ReadDBInstanceName.
             */
            public Builder readDBInstanceName(java.util.List<String> readDBInstanceName) {
                this.readDBInstanceName = readDBInstanceName;
                return this;
            }

            public ReadDBInstanceNames build() {
                return new ReadDBInstanceNames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class ReadDelayTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadDelayTime")
        private java.util.List<String> readDelayTime;

        private ReadDelayTimes(Builder builder) {
            this.readDelayTime = builder.readDelayTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadDelayTimes create() {
            return builder().build();
        }

        /**
         * @return readDelayTime
         */
        public java.util.List<String> getReadDelayTime() {
            return this.readDelayTime;
        }

        public static final class Builder {
            private java.util.List<String> readDelayTime; 

            /**
             * ReadDelayTime.
             */
            public Builder readDelayTime(java.util.List<String> readDelayTime) {
                this.readDelayTime = readDelayTime;
                return this;
            }

            public ReadDelayTimes build() {
                return new ReadDelayTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class ReadonlyInstanceDelay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlushLag")
        private String flushLag;

        @com.aliyun.core.annotation.NameInMap("FlushLatency")
        private String flushLatency;

        @com.aliyun.core.annotation.NameInMap("ReadDBInstanceName")
        private String readDBInstanceName;

        @com.aliyun.core.annotation.NameInMap("ReplayLag")
        private String replayLag;

        @com.aliyun.core.annotation.NameInMap("ReplayLatency")
        private String replayLatency;

        @com.aliyun.core.annotation.NameInMap("SendLatency")
        private String sendLatency;

        @com.aliyun.core.annotation.NameInMap("WriteLag")
        private String writeLag;

        @com.aliyun.core.annotation.NameInMap("WriteLatency")
        private String writeLatency;

        private ReadonlyInstanceDelay(Builder builder) {
            this.flushLag = builder.flushLag;
            this.flushLatency = builder.flushLatency;
            this.readDBInstanceName = builder.readDBInstanceName;
            this.replayLag = builder.replayLag;
            this.replayLatency = builder.replayLatency;
            this.sendLatency = builder.sendLatency;
            this.writeLag = builder.writeLag;
            this.writeLatency = builder.writeLatency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadonlyInstanceDelay create() {
            return builder().build();
        }

        /**
         * @return flushLag
         */
        public String getFlushLag() {
            return this.flushLag;
        }

        /**
         * @return flushLatency
         */
        public String getFlushLatency() {
            return this.flushLatency;
        }

        /**
         * @return readDBInstanceName
         */
        public String getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

        /**
         * @return replayLag
         */
        public String getReplayLag() {
            return this.replayLag;
        }

        /**
         * @return replayLatency
         */
        public String getReplayLatency() {
            return this.replayLatency;
        }

        /**
         * @return sendLatency
         */
        public String getSendLatency() {
            return this.sendLatency;
        }

        /**
         * @return writeLag
         */
        public String getWriteLag() {
            return this.writeLag;
        }

        /**
         * @return writeLatency
         */
        public String getWriteLatency() {
            return this.writeLatency;
        }

        public static final class Builder {
            private String flushLag; 
            private String flushLatency; 
            private String readDBInstanceName; 
            private String replayLag; 
            private String replayLatency; 
            private String sendLatency; 
            private String writeLag; 
            private String writeLatency; 

            /**
             * <p>The duration that is allowed for the latency in the persistence of WAL data. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flushLag(String flushLag) {
                this.flushLag = flushLag;
                return this;
            }

            /**
             * <p>The data size that is allowed for the latency in the persistence of WAL data. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flushLatency(String flushLatency) {
                this.flushLatency = flushLatency;
                return this;
            }

            /**
             * <p>The read-only instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rr-bp*****</p>
             */
            public Builder readDBInstanceName(String readDBInstanceName) {
                this.readDBInstanceName = readDBInstanceName;
                return this;
            }

            /**
             * <p>The duration that is allowed for the latency in the playback of WAL data. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replayLag(String replayLag) {
                this.replayLag = replayLag;
                return this;
            }

            /**
             * <p>The data size that is allowed for the latency in the playback of WAL data. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replayLatency(String replayLatency) {
                this.replayLatency = replayLatency;
                return this;
            }

            /**
             * <p>The data size that is allowed for the latency in the sending of WAL data. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sendLatency(String sendLatency) {
                this.sendLatency = sendLatency;
                return this;
            }

            /**
             * <p>The duration that is allowed for the latency in the write-back of WAL data. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder writeLag(String writeLag) {
                this.writeLag = writeLag;
                return this;
            }

            /**
             * <p>The data size that is allowed for the latency in the write-back of WAL data. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder writeLatency(String writeLatency) {
                this.writeLatency = writeLatency;
                return this;
            }

            public ReadonlyInstanceDelay build() {
                return new ReadonlyInstanceDelay(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class ItemsReadonlyInstanceDelay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadonlyInstanceDelay")
        private java.util.List<ReadonlyInstanceDelay> readonlyInstanceDelay;

        private ItemsReadonlyInstanceDelay(Builder builder) {
            this.readonlyInstanceDelay = builder.readonlyInstanceDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsReadonlyInstanceDelay create() {
            return builder().build();
        }

        /**
         * @return readonlyInstanceDelay
         */
        public java.util.List<ReadonlyInstanceDelay> getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

        public static final class Builder {
            private java.util.List<ReadonlyInstanceDelay> readonlyInstanceDelay; 

            /**
             * ReadonlyInstanceDelay.
             */
            public Builder readonlyInstanceDelay(java.util.List<ReadonlyInstanceDelay> readonlyInstanceDelay) {
                this.readonlyInstanceDelay = readonlyInstanceDelay;
                return this;
            }

            public ItemsReadonlyInstanceDelay build() {
                return new ItemsReadonlyInstanceDelay(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class ItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("ReadDBInstanceNames")
        private ReadDBInstanceNames readDBInstanceNames;

        @com.aliyun.core.annotation.NameInMap("ReadDelayTimes")
        private ReadDelayTimes readDelayTimes;

        @com.aliyun.core.annotation.NameInMap("ReadonlyInstanceDelay")
        private ItemsReadonlyInstanceDelay readonlyInstanceDelay;

        private ItemsItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.readDBInstanceNames = builder.readDBInstanceNames;
            this.readDelayTimes = builder.readDelayTimes;
            this.readonlyInstanceDelay = builder.readonlyInstanceDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return readDBInstanceNames
         */
        public ReadDBInstanceNames getReadDBInstanceNames() {
            return this.readDBInstanceNames;
        }

        /**
         * @return readDelayTimes
         */
        public ReadDelayTimes getReadDelayTimes() {
            return this.readDelayTimes;
        }

        /**
         * @return readonlyInstanceDelay
         */
        public ItemsReadonlyInstanceDelay getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private ReadDBInstanceNames readDBInstanceNames; 
            private ReadDelayTimes readDelayTimes; 
            private ItemsReadonlyInstanceDelay readonlyInstanceDelay; 

            /**
             * <p>The primary instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp*****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>An array that consists of information about the read-only instance.</p>
             */
            public Builder readDBInstanceNames(ReadDBInstanceNames readDBInstanceNames) {
                this.readDBInstanceNames = readDBInstanceNames;
                return this;
            }

            /**
             * <p>The latency of data replication.</p>
             */
            public Builder readDelayTimes(ReadDelayTimes readDelayTimes) {
                this.readDelayTimes = readDelayTimes;
                return this;
            }

            /**
             * <p>The information about the write-ahead log (WAL) latency.</p>
             * <blockquote>
             * <p> This parameter is returned only when the primary instance runs PostgreSQL.</p>
             * </blockquote>
             */
            public Builder readonlyInstanceDelay(ItemsReadonlyInstanceDelay readonlyInstanceDelay) {
                this.readonlyInstanceDelay = readonlyInstanceDelay;
                return this;
            }

            public ItemsItems build() {
                return new ItemsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReadDBInstanceDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReadDBInstanceDelayResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<ItemsItems> items;

        private Items(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<ItemsItems> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<ItemsItems> items; 

            /**
             * <p>The latency information.</p>
             */
            public Builder items(java.util.List<ItemsItems> items) {
                this.items = items;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
