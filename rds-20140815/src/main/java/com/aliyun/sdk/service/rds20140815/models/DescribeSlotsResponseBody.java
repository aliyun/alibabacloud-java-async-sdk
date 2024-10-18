// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlotsResponseBody</p>
 */
public class DescribeSlotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Slots")
    private java.util.List < Slots> slots;

    private DescribeSlotsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slots = builder.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlotsResponseBody create() {
        return builder().build();
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
    public java.util.List < Slots> getSlots() {
        return this.slots;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Slots> slots; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>76AF0609-4195-5DFC-BC78-3AD76FF872BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the replication slot.</p>
         */
        public Builder slots(java.util.List < Slots> slots) {
            this.slots = slots;
            return this;
        }

        public DescribeSlotsResponseBody build() {
            return new DescribeSlotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlotsResponseBody</p>
     */
    public static class Slots extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("SubReplayLag")
        private String subReplayLag;

        @com.aliyun.core.annotation.NameInMap("Temporary")
        private String temporary;

        @com.aliyun.core.annotation.NameInMap("WalDelay")
        private String walDelay;

        private Slots(Builder builder) {
            this.database = builder.database;
            this.plugin = builder.plugin;
            this.slotName = builder.slotName;
            this.slotStatus = builder.slotStatus;
            this.slotType = builder.slotType;
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
            private String database; 
            private String plugin; 
            private String slotName; 
            private String slotStatus; 
            private String slotType; 
            private String subReplayLag; 
            private String temporary; 
            private String walDelay; 

            /**
             * <p>The name of the database in which the replication slot resides.</p>
             * 
             * <strong>example:</strong>
             * <p>db_test01</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The extension used by the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>test_decoding</p>
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            /**
             * <p>The replication slot name.</p>
             * 
             * <strong>example:</strong>
             * <p>slot_test01</p>
             */
            public Builder slotName(String slotName) {
                this.slotName = slotName;
                return this;
            }

            /**
             * <p>The replication slot status. Valid values:</p>
             * <ul>
             * <li>ACTIVE</li>
             * <li>INACTIVE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INACTIVE</p>
             */
            public Builder slotStatus(String slotStatus) {
                this.slotStatus = slotStatus;
                return this;
            }

            /**
             * <p>The replication slot type. Valid values:</p>
             * <ul>
             * <li>physical</li>
             * <li>logical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logical</p>
             */
            public Builder slotType(String slotType) {
                this.slotType = slotType;
                return this;
            }

            /**
             * <p>The latency of the logical subscription on the subscriber node that corresponds to the current replication slot. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subReplayLag(String subReplayLag) {
                this.subReplayLag = subReplayLag;
                return this;
            }

            /**
             * <p>Indicates whether the replication slot is a temporary replication slot. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder temporary(String temporary) {
                this.temporary = temporary;
                return this;
            }

            /**
             * <p>The number of logs accumulated in the replication slot.</p>
             * 
             * <strong>example:</strong>
             * <p>16 MB</p>
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
