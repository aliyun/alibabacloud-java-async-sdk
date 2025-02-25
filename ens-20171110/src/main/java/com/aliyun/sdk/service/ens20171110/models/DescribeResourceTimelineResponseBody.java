// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeResourceTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceTimelineResponseBody</p>
 */
public class DescribeResourceTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableEvents")
    private java.util.List<AvailableEvents> availableEvents;

    @com.aliyun.core.annotation.NameInMap("BizEvents")
    private java.util.List<BizEvents> bizEvents;

    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("InventoryEvents")
    private java.util.List<InventoryEvents> inventoryEvents;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReserveEvents")
    private java.util.List<ReserveEvents> reserveEvents;

    private DescribeResourceTimelineResponseBody(Builder builder) {
        this.availableEvents = builder.availableEvents;
        this.bizEvents = builder.bizEvents;
        this.desc = builder.desc;
        this.inventoryEvents = builder.inventoryEvents;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.reserveEvents = builder.reserveEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceTimelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableEvents
     */
    public java.util.List<AvailableEvents> getAvailableEvents() {
        return this.availableEvents;
    }

    /**
     * @return bizEvents
     */
    public java.util.List<BizEvents> getBizEvents() {
        return this.bizEvents;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return inventoryEvents
     */
    public java.util.List<InventoryEvents> getInventoryEvents() {
        return this.inventoryEvents;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reserveEvents
     */
    public java.util.List<ReserveEvents> getReserveEvents() {
        return this.reserveEvents;
    }

    public static final class Builder {
        private java.util.List<AvailableEvents> availableEvents; 
        private java.util.List<BizEvents> bizEvents; 
        private String desc; 
        private java.util.List<InventoryEvents> inventoryEvents; 
        private String msg; 
        private String requestId; 
        private java.util.List<ReserveEvents> reserveEvents; 

        /**
         * AvailableEvents.
         */
        public Builder availableEvents(java.util.List<AvailableEvents> availableEvents) {
            this.availableEvents = availableEvents;
            return this;
        }

        /**
         * BizEvents.
         */
        public Builder bizEvents(java.util.List<BizEvents> bizEvents) {
            this.bizEvents = bizEvents;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * InventoryEvents.
         */
        public Builder inventoryEvents(java.util.List<InventoryEvents> inventoryEvents) {
            this.inventoryEvents = inventoryEvents;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReserveEvents.
         */
        public Builder reserveEvents(java.util.List<ReserveEvents> reserveEvents) {
            this.reserveEvents = reserveEvents;
            return this;
        }

        public DescribeResourceTimelineResponseBody build() {
            return new DescribeResourceTimelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceTimelineResponseBody</p>
     */
    public static class AvailableEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AvailableEvents(Builder builder) {
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableEvents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String occurrenceTime; 
            private String reason; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvailableEvents build() {
                return new AvailableEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceTimelineResponseBody</p>
     */
    public static class BizEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BizEvents(Builder builder) {
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizEvents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String occurrenceTime; 
            private String reason; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BizEvents build() {
                return new BizEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceTimelineResponseBody</p>
     */
    public static class InventoryEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InventoryEvents(Builder builder) {
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InventoryEvents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String occurrenceTime; 
            private String reason; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InventoryEvents build() {
                return new InventoryEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceTimelineResponseBody</p>
     */
    public static class ReserveEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ReserveEvents(Builder builder) {
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReserveEvents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String occurrenceTime; 
            private String reason; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReserveEvents build() {
                return new ReserveEvents(this);
            } 

        } 

    }
}
