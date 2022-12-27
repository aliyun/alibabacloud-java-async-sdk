// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNCInformationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNCInformationResponseBody</p>
 */
public class DescribeNCInformationResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Desc")
    private String desc;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("Pager")
    private Pager pager;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNCInformationResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.desc = builder.desc;
        this.msg = builder.msg;
        this.pager = builder.pager;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNCInformationResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Data> data; 
        private String desc; 
        private String msg; 
        private Pager pager; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNCInformationResponseBody build() {
            return new DescribeNCInformationResponseBody(this);
        } 

    } 

    public static class Cpu extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Gpu extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Hdd extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Info extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Name")
        private String name;

        @NameInMap("Tag")
        private java.util.List < String > tag;

        @NameInMap("Uuid")
        private String uuid;

        private Info(Builder builder) {
            this.ip = builder.ip;
            this.name = builder.name;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String ip; 
            private String name; 
            private java.util.List < String > tag; 
            private String uuid; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class Memory extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Nvme extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Ssd extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("OversellRatio")
        private Long oversellRatio;

        @NameInMap("Remain")
        private Long remain;

        @NameInMap("ReserveDisable")
        private Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        private Long reserveDisableTotal;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("StatusDisable")
        private Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        private Long statusDisableTotal;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Type")
        private String type;

        @NameInMap("Used")
        private Long used;

        @NameInMap("UsedRatio")
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
    public static class Data extends TeaModel {
        @NameInMap("Cpu")
        private Cpu cpu;

        @NameInMap("Gpu")
        private Gpu gpu;

        @NameInMap("Hdd")
        private Hdd hdd;

        @NameInMap("Info")
        private Info info;

        @NameInMap("Memory")
        private Memory memory;

        @NameInMap("Nvme")
        private Nvme nvme;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("Region")
        private String region;

        @NameInMap("Ssd")
        private Ssd ssd;

        @NameInMap("Virtual")
        private String virtual;

        private Data(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.hdd = builder.hdd;
            this.info = builder.info;
            this.memory = builder.memory;
            this.nvme = builder.nvme;
            this.online = builder.online;
            this.region = builder.region;
            this.ssd = builder.ssd;
            this.virtual = builder.virtual;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return nvme
         */
        public Nvme getNvme() {
            return this.nvme;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return ssd
         */
        public Ssd getSsd() {
            return this.ssd;
        }

        /**
         * @return virtual
         */
        public String getVirtual() {
            return this.virtual;
        }

        public static final class Builder {
            private Cpu cpu; 
            private Gpu gpu; 
            private Hdd hdd; 
            private Info info; 
            private Memory memory; 
            private Nvme nvme; 
            private Boolean online; 
            private String region; 
            private Ssd ssd; 
            private String virtual; 

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
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
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
             * Nvme.
             */
            public Builder nvme(Nvme nvme) {
                this.nvme = nvme;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
    public static class Pager extends TeaModel {
        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
