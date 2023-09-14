// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlotsResponseBody</p>
 */
public class DescribeSlotsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Slots")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of information about replication slots.
         */
        public Builder slots(java.util.List < Slots> slots) {
            this.slots = slots;
            return this;
        }

        public DescribeSlotsResponseBody build() {
            return new DescribeSlotsResponseBody(this);
        } 

    } 

    public static class Slots extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Plugin")
        private String plugin;

        @NameInMap("SlotName")
        private String slotName;

        @NameInMap("SlotStatus")
        private String slotStatus;

        @NameInMap("SlotType")
        private String slotType;

        @NameInMap("SubReplayLag")
        private String subReplayLag;

        @NameInMap("Temporary")
        private String temporary;

        @NameInMap("WalDelay")
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
             * The name of the database in which the replication slot resides.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The extension that is used by the replication slot.
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            /**
             * The name of the replication slot.
             */
            public Builder slotName(String slotName) {
                this.slotName = slotName;
                return this;
            }

            /**
             * The status of the replication slot.
             * <p>
             * 
             * Valid values:
             * 
             * *   ACTIVE
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   INACTIVE
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder slotStatus(String slotStatus) {
                this.slotStatus = slotStatus;
                return this;
            }

            /**
             * The type of the replication slot.
             */
            public Builder slotType(String slotType) {
                this.slotType = slotType;
                return this;
            }

            /**
             * The current Replication Slot corresponds to the specific delay of the logical subscription of the subscriber, in seconds (s)
             */
            public Builder subReplayLag(String subReplayLag) {
                this.subReplayLag = subReplayLag;
                return this;
            }

            /**
             * Indicates whether the replication slot is temporary.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder temporary(String temporary) {
                this.temporary = temporary;
                return this;
            }

            /**
             * The number of logs that are accumulated for the replication slot.
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
