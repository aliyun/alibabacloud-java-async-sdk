// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeReplicationSlotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationSlotsResponseBody</p>
 */
public class DescribeReplicationSlotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Slots")
    private java.util.List<Slots> slots;

    private DescribeReplicationSlotsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slots = builder.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationSlotsResponseBody create() {
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
     * @return slots
     */
    public java.util.List<Slots> getSlots() {
        return this.slots;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Slots> slots; 

        private Builder() {
        } 

        private Builder(DescribeReplicationSlotsResponseBody model) {
            this.requestId = model.requestId;
            this.slots = model.slots;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of replication slots.</p>
         */
        public Builder slots(java.util.List<Slots> slots) {
            this.slots = slots;
            return this;
        }

        public DescribeReplicationSlotsResponseBody build() {
            return new DescribeReplicationSlotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReplicationSlotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationSlotsResponseBody</p>
     */
    public static class Slots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Plugin")
        private String plugin;

        @com.aliyun.core.annotation.NameInMap("SlotName")
        private String slotName;

        @com.aliyun.core.annotation.NameInMap("SlotStatus")
        private String slotStatus;

        @com.aliyun.core.annotation.NameInMap("SlotType")
        private String slotType;

        @com.aliyun.core.annotation.NameInMap("SubGroupName")
        private String subGroupName;

        @com.aliyun.core.annotation.NameInMap("SubReplayLag")
        private String subReplayLag;

        @com.aliyun.core.annotation.NameInMap("Temporary")
        private String temporary;

        @com.aliyun.core.annotation.NameInMap("WalDelay")
        private String walDelay;

        private Slots(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.database = builder.database;
            this.plugin = builder.plugin;
            this.slotName = builder.slotName;
            this.slotStatus = builder.slotStatus;
            this.slotType = builder.slotType;
            this.subGroupName = builder.subGroupName;
            this.subReplayLag = builder.subReplayLag;
            this.temporary = builder.temporary;
            this.walDelay = builder.walDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slots create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return plugin
         */
        public String getPlugin() {
            return this.plugin;
        }

        /**
         * @return slotName
         */
        public String getSlotName() {
            return this.slotName;
        }

        /**
         * @return slotStatus
         */
        public String getSlotStatus() {
            return this.slotStatus;
        }

        /**
         * @return slotType
         */
        public String getSlotType() {
            return this.slotType;
        }

        /**
         * @return subGroupName
         */
        public String getSubGroupName() {
            return this.subGroupName;
        }

        /**
         * @return subReplayLag
         */
        public String getSubReplayLag() {
            return this.subReplayLag;
        }

        /**
         * @return temporary
         */
        public String getTemporary() {
            return this.temporary;
        }

        /**
         * @return walDelay
         */
        public String getWalDelay() {
            return this.walDelay;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String database; 
            private String plugin; 
            private String slotName; 
            private String slotStatus; 
            private String slotType; 
            private String subGroupName; 
            private String subReplayLag; 
            private String temporary; 
            private String walDelay; 

            private Builder() {
            } 

            private Builder(Slots model) {
                this.DBClusterId = model.DBClusterId;
                this.database = model.database;
                this.plugin = model.plugin;
                this.slotName = model.slotName;
                this.slotStatus = model.slotStatus;
                this.slotType = model.slotType;
                this.subGroupName = model.subGroupName;
                this.subReplayLag = model.subReplayLag;
                this.temporary = model.temporary;
                this.walDelay = model.walDelay;
            } 

            /**
             * <p>The ID of the PolarDB cluster to which the replication slot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-test123456</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The name of the database associated with the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The name of the output plugin used by the logical replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>testPlugin</p>
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            /**
             * <p>The name of the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>testSlot</p>
             */
            public Builder slotName(String slotName) {
                this.slotName = slotName;
                return this;
            }

            /**
             * <p>The status of the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder slotStatus(String slotStatus) {
                this.slotStatus = slotStatus;
                return this;
            }

            /**
             * <p>The type of the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>logical</p>
             */
            public Builder slotType(String slotType) {
                this.slotType = slotType;
                return this;
            }

            /**
             * <p>The child node name of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroup</p>
             */
            public Builder subGroupName(String subGroupName) {
                this.subGroupName = subGroupName;
                return this;
            }

            /**
             * <p>The replay lag value of the subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder subReplayLag(String subReplayLag) {
                this.subReplayLag = subReplayLag;
                return this;
            }

            /**
             * <p>Indicates whether the replication slot is temporary. The value is returned as a string: true or false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder temporary(String temporary) {
                this.temporary = temporary;
                return this;
            }

            /**
             * <p>The WAL latency value.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder walDelay(String walDelay) {
                this.walDelay = walDelay;
                return this;
            }

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
}
