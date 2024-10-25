// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionResourceResponseBody</p>
 */
public class DescribeRegionResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("Pager")
    private Pager pager;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.desc = builder.desc;
        this.msg = builder.msg;
        this.pager = builder.pager;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return pager
     */
    public Pager getPager() {
        return this.pager;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String desc; 
        private String msg; 
        private Pager pager; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Pager.
         */
        public Builder pager(Pager pager) {
            this.pager = pager;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionResourceResponseBody build() {
            return new DescribeRegionResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class ArmCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private ArmCard(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArmCard create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public ArmCard build() {
                return new ArmCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Bandwidth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Bandwidth(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidth create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Bandwidth build() {
                return new Bandwidth(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class BlockStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private BlockStorage(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockStorage create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public BlockStorage build() {
                return new BlockStorage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Cpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Cpu(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cpu create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Gpu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Gpu(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gpu create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Gpu build() {
                return new Gpu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Hdd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Hdd(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hdd create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Hdd build() {
                return new Hdd(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Ipv4s extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        @com.aliyun.core.annotation.NameInMap("Vlan")
        private String vlan;

        private Ipv4s(Builder builder) {
            this.display = builder.display;
            this.isp = builder.isp;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
            this.vlan = builder.vlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4s create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        /**
         * @return vlan
         */
        public String getVlan() {
            return this.vlan;
        }

        public static final class Builder {
            private String display; 
            private String isp; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 
            private String vlan; 

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            /**
             * Vlan.
             */
            public Builder vlan(String vlan) {
                this.vlan = vlan;
                return this;
            }

            public Ipv4s build() {
                return new Ipv4s(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Ipv6s extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        @com.aliyun.core.annotation.NameInMap("Vlan")
        private String vlan;

        private Ipv6s(Builder builder) {
            this.display = builder.display;
            this.isp = builder.isp;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
            this.vlan = builder.vlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6s create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        /**
         * @return vlan
         */
        public String getVlan() {
            return this.vlan;
        }

        public static final class Builder {
            private String display; 
            private String isp; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 
            private String vlan; 

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            /**
             * Vlan.
             */
            public Builder vlan(String vlan) {
                this.vlan = vlan;
                return this;
            }

            public Ipv6s build() {
                return new Ipv6s(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Memory(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Nvme extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Nvme(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nvme create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Nvme build() {
                return new Nvme(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class OssStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private OssStorage(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssStorage create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public OssStorage build() {
                return new OssStorage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Pangu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Pangu(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pangu create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Pangu build() {
                return new Pangu(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class PcfarmNum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private PcfarmNum(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PcfarmNum create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public PcfarmNum build() {
                return new PcfarmNum(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Ssd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("OversellRatio")
        private Long oversellRatio;

        @com.aliyun.core.annotation.NameInMap("Remain")
        private Long remain;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("UsedRatio")
        private Long usedRatio;

        private Ssd(Builder builder) {
            this.display = builder.display;
            this.oversellRatio = builder.oversellRatio;
            this.remain = builder.remain;
            this.reserveDisable = builder.reserveDisable;
            this.reserveDisableTotal = builder.reserveDisableTotal;
            this.reserved = builder.reserved;
            this.statusDisable = builder.statusDisable;
            this.statusDisableTotal = builder.statusDisableTotal;
            this.total = builder.total;
            this.type = builder.type;
            this.used = builder.used;
            this.usedRatio = builder.usedRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ssd create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return oversellRatio
         */
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        /**
         * @return remain
         */
        public Long getRemain() {
            return this.remain;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return reserveDisableTotal
         */
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return statusDisableTotal
         */
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedRatio
         */
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public static final class Builder {
            private Boolean display; 
            private Long oversellRatio; 
            private Long remain; 
            private Boolean reserveDisable; 
            private Long reserveDisableTotal; 
            private Long reserved; 
            private Boolean statusDisable; 
            private Long statusDisableTotal; 
            private Long total; 
            private String type; 
            private Long used; 
            private Long usedRatio; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * OversellRatio.
             */
            public Builder oversellRatio(Long oversellRatio) {
                this.oversellRatio = oversellRatio;
                return this;
            }

            /**
             * Remain.
             */
            public Builder remain(Long remain) {
                this.remain = remain;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * ReserveDisableTotal.
             */
            public Builder reserveDisableTotal(Long reserveDisableTotal) {
                this.reserveDisableTotal = reserveDisableTotal;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * StatusDisableTotal.
             */
            public Builder statusDisableTotal(Long statusDisableTotal) {
                this.statusDisableTotal = statusDisableTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * UsedRatio.
             */
            public Builder usedRatio(Long usedRatio) {
                this.usedRatio = usedRatio;
                return this;
            }

            public Ssd build() {
                return new Ssd(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("ArmCard")
        private ArmCard armCard;

        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List < String > attributes;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Bandwidth bandwidth;

        @com.aliyun.core.annotation.NameInMap("BlockStorage")
        private BlockStorage blockStorage;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Cpu cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Gpu gpu;

        @com.aliyun.core.annotation.NameInMap("Hdd")
        private Hdd hdd;

        @com.aliyun.core.annotation.NameInMap("HouseId")
        private String houseId;

        @com.aliyun.core.annotation.NameInMap("Ipv4s")
        private java.util.List < Ipv4s> ipv4s;

        @com.aliyun.core.annotation.NameInMap("Ipv6s")
        private java.util.List < Ipv6s> ipv6s;

        @com.aliyun.core.annotation.NameInMap("IspTypes")
        private java.util.List < String > ispTypes;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Nvme")
        private Nvme nvme;

        @com.aliyun.core.annotation.NameInMap("OssStorage")
        private OssStorage ossStorage;

        @com.aliyun.core.annotation.NameInMap("Pangu")
        private Pangu pangu;

        @com.aliyun.core.annotation.NameInMap("PcfarmNum")
        private PcfarmNum pcfarmNum;

        @com.aliyun.core.annotation.NameInMap("Poc")
        private Boolean poc;

        @com.aliyun.core.annotation.NameInMap("ProvinceCode")
        private String provinceCode;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @com.aliyun.core.annotation.NameInMap("Ssd")
        private Ssd ssd;

        @com.aliyun.core.annotation.NameInMap("StatusDisable")
        private Boolean statusDisable;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Virtual")
        private String virtual;

        private Data(Builder builder) {
            this.areaCode = builder.areaCode;
            this.areaName = builder.areaName;
            this.armCard = builder.armCard;
            this.attributes = builder.attributes;
            this.bandwidth = builder.bandwidth;
            this.blockStorage = builder.blockStorage;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.hdd = builder.hdd;
            this.houseId = builder.houseId;
            this.ipv4s = builder.ipv4s;
            this.ipv6s = builder.ipv6s;
            this.ispTypes = builder.ispTypes;
            this.memory = builder.memory;
            this.name = builder.name;
            this.nvme = builder.nvme;
            this.ossStorage = builder.ossStorage;
            this.pangu = builder.pangu;
            this.pcfarmNum = builder.pcfarmNum;
            this.poc = builder.poc;
            this.provinceCode = builder.provinceCode;
            this.provinceName = builder.provinceName;
            this.reserveDisable = builder.reserveDisable;
            this.ssd = builder.ssd;
            this.statusDisable = builder.statusDisable;
            this.type = builder.type;
            this.uuid = builder.uuid;
            this.virtual = builder.virtual;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return armCard
         */
        public ArmCard getArmCard() {
            return this.armCard;
        }

        /**
         * @return attributes
         */
        public java.util.List < String > getAttributes() {
            return this.attributes;
        }

        /**
         * @return bandwidth
         */
        public Bandwidth getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return blockStorage
         */
        public BlockStorage getBlockStorage() {
            return this.blockStorage;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return cpu
         */
        public Cpu getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public Gpu getGpu() {
            return this.gpu;
        }

        /**
         * @return hdd
         */
        public Hdd getHdd() {
            return this.hdd;
        }

        /**
         * @return houseId
         */
        public String getHouseId() {
            return this.houseId;
        }

        /**
         * @return ipv4s
         */
        public java.util.List < Ipv4s> getIpv4s() {
            return this.ipv4s;
        }

        /**
         * @return ipv6s
         */
        public java.util.List < Ipv6s> getIpv6s() {
            return this.ipv6s;
        }

        /**
         * @return ispTypes
         */
        public java.util.List < String > getIspTypes() {
            return this.ispTypes;
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nvme
         */
        public Nvme getNvme() {
            return this.nvme;
        }

        /**
         * @return ossStorage
         */
        public OssStorage getOssStorage() {
            return this.ossStorage;
        }

        /**
         * @return pangu
         */
        public Pangu getPangu() {
            return this.pangu;
        }

        /**
         * @return pcfarmNum
         */
        public PcfarmNum getPcfarmNum() {
            return this.pcfarmNum;
        }

        /**
         * @return poc
         */
        public Boolean getPoc() {
            return this.poc;
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return reserveDisable
         */
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        /**
         * @return ssd
         */
        public Ssd getSsd() {
            return this.ssd;
        }

        /**
         * @return statusDisable
         */
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return virtual
         */
        public String getVirtual() {
            return this.virtual;
        }

        public static final class Builder {
            private String areaCode; 
            private String areaName; 
            private ArmCard armCard; 
            private java.util.List < String > attributes; 
            private Bandwidth bandwidth; 
            private BlockStorage blockStorage; 
            private String countryCode; 
            private String countryName; 
            private Cpu cpu; 
            private Gpu gpu; 
            private Hdd hdd; 
            private String houseId; 
            private java.util.List < Ipv4s> ipv4s; 
            private java.util.List < Ipv6s> ipv6s; 
            private java.util.List < String > ispTypes; 
            private Memory memory; 
            private String name; 
            private Nvme nvme; 
            private OssStorage ossStorage; 
            private Pangu pangu; 
            private PcfarmNum pcfarmNum; 
            private Boolean poc; 
            private String provinceCode; 
            private String provinceName; 
            private Boolean reserveDisable; 
            private Ssd ssd; 
            private Boolean statusDisable; 
            private String type; 
            private String uuid; 
            private String virtual; 

            /**
             * AreaCode.
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * AreaName.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * ArmCard.
             */
            public Builder armCard(ArmCard armCard) {
                this.armCard = armCard;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < String > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Bandwidth bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BlockStorage.
             */
            public Builder blockStorage(BlockStorage blockStorage) {
                this.blockStorage = blockStorage;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Cpu cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Gpu gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Hdd.
             */
            public Builder hdd(Hdd hdd) {
                this.hdd = hdd;
                return this;
            }

            /**
             * HouseId.
             */
            public Builder houseId(String houseId) {
                this.houseId = houseId;
                return this;
            }

            /**
             * Ipv4s.
             */
            public Builder ipv4s(java.util.List < Ipv4s> ipv4s) {
                this.ipv4s = ipv4s;
                return this;
            }

            /**
             * Ipv6s.
             */
            public Builder ipv6s(java.util.List < Ipv6s> ipv6s) {
                this.ipv6s = ipv6s;
                return this;
            }

            /**
             * IspTypes.
             */
            public Builder ispTypes(java.util.List < String > ispTypes) {
                this.ispTypes = ispTypes;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Nvme.
             */
            public Builder nvme(Nvme nvme) {
                this.nvme = nvme;
                return this;
            }

            /**
             * OssStorage.
             */
            public Builder ossStorage(OssStorage ossStorage) {
                this.ossStorage = ossStorage;
                return this;
            }

            /**
             * Pangu.
             */
            public Builder pangu(Pangu pangu) {
                this.pangu = pangu;
                return this;
            }

            /**
             * PcfarmNum.
             */
            public Builder pcfarmNum(PcfarmNum pcfarmNum) {
                this.pcfarmNum = pcfarmNum;
                return this;
            }

            /**
             * Poc.
             */
            public Builder poc(Boolean poc) {
                this.poc = poc;
                return this;
            }

            /**
             * ProvinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            /**
             * ProvinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * ReserveDisable.
             */
            public Builder reserveDisable(Boolean reserveDisable) {
                this.reserveDisable = reserveDisable;
                return this;
            }

            /**
             * Ssd.
             */
            public Builder ssd(Ssd ssd) {
                this.ssd = ssd;
                return this;
            }

            /**
             * StatusDisable.
             */
            public Builder statusDisable(Boolean statusDisable) {
                this.statusDisable = statusDisable;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Virtual.
             */
            public Builder virtual(String virtual) {
                this.virtual = virtual;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionResourceResponseBody</p>
     */
    public static class Pager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Pager(Builder builder) {
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pager create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Pager build() {
                return new Pager(this);
            } 

        } 

    }
}
