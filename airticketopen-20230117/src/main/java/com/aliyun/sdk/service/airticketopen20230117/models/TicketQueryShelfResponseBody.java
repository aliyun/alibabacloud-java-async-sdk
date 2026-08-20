// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketQueryShelfResponseBody} extends {@link TeaModel}
 *
 * <p>TicketQueryShelfResponseBody</p>
 */
public class TicketQueryShelfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TicketQueryShelfResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryShelfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TicketQueryShelfResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TicketQueryShelfResponseBody build() {
            return new TicketQueryShelfResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketQueryShelfResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryShelfResponseBody</p>
     */
    public static class Cells extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpuId")
        private Long spuId;

        @com.aliyun.core.annotation.NameInMap("TicketKindId")
        private Long ticketKindId;

        private Cells(Builder builder) {
            this.spuId = builder.spuId;
            this.ticketKindId = builder.ticketKindId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cells create() {
            return builder().build();
        }

        /**
         * @return spuId
         */
        public Long getSpuId() {
            return this.spuId;
        }

        /**
         * @return ticketKindId
         */
        public Long getTicketKindId() {
            return this.ticketKindId;
        }

        public static final class Builder {
            private Long spuId; 
            private Long ticketKindId; 

            private Builder() {
            } 

            private Builder(Cells model) {
                this.spuId = model.spuId;
                this.ticketKindId = model.ticketKindId;
            } 

            /**
             * SpuId.
             */
            public Builder spuId(Long spuId) {
                this.spuId = spuId;
                return this;
            }

            /**
             * TicketKindId.
             */
            public Builder ticketKindId(Long ticketKindId) {
                this.ticketKindId = ticketKindId;
                return this;
            }

            public Cells build() {
                return new Cells(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryShelfResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryShelfResponseBody</p>
     */
    public static class Tabs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cells")
        private java.util.List<Cells> cells;

        @com.aliyun.core.annotation.NameInMap("TabIndex")
        private Integer tabIndex;

        @com.aliyun.core.annotation.NameInMap("TabName")
        private String tabName;

        private Tabs(Builder builder) {
            this.cells = builder.cells;
            this.tabIndex = builder.tabIndex;
            this.tabName = builder.tabName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tabs create() {
            return builder().build();
        }

        /**
         * @return cells
         */
        public java.util.List<Cells> getCells() {
            return this.cells;
        }

        /**
         * @return tabIndex
         */
        public Integer getTabIndex() {
            return this.tabIndex;
        }

        /**
         * @return tabName
         */
        public String getTabName() {
            return this.tabName;
        }

        public static final class Builder {
            private java.util.List<Cells> cells; 
            private Integer tabIndex; 
            private String tabName; 

            private Builder() {
            } 

            private Builder(Tabs model) {
                this.cells = model.cells;
                this.tabIndex = model.tabIndex;
                this.tabName = model.tabName;
            } 

            /**
             * Cells.
             */
            public Builder cells(java.util.List<Cells> cells) {
                this.cells = cells;
                return this;
            }

            /**
             * TabIndex.
             */
            public Builder tabIndex(Integer tabIndex) {
                this.tabIndex = tabIndex;
                return this;
            }

            /**
             * TabName.
             */
            public Builder tabName(String tabName) {
                this.tabName = tabName;
                return this;
            }

            public Tabs build() {
                return new Tabs(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryShelfResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryShelfResponseBody</p>
     */
    public static class Shelves extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShelfId")
        private Long shelfId;

        @com.aliyun.core.annotation.NameInMap("ShelfIndex")
        private Integer shelfIndex;

        @com.aliyun.core.annotation.NameInMap("ShelfName")
        private String shelfName;

        @com.aliyun.core.annotation.NameInMap("Tabs")
        private java.util.List<Tabs> tabs;

        private Shelves(Builder builder) {
            this.shelfId = builder.shelfId;
            this.shelfIndex = builder.shelfIndex;
            this.shelfName = builder.shelfName;
            this.tabs = builder.tabs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shelves create() {
            return builder().build();
        }

        /**
         * @return shelfId
         */
        public Long getShelfId() {
            return this.shelfId;
        }

        /**
         * @return shelfIndex
         */
        public Integer getShelfIndex() {
            return this.shelfIndex;
        }

        /**
         * @return shelfName
         */
        public String getShelfName() {
            return this.shelfName;
        }

        /**
         * @return tabs
         */
        public java.util.List<Tabs> getTabs() {
            return this.tabs;
        }

        public static final class Builder {
            private Long shelfId; 
            private Integer shelfIndex; 
            private String shelfName; 
            private java.util.List<Tabs> tabs; 

            private Builder() {
            } 

            private Builder(Shelves model) {
                this.shelfId = model.shelfId;
                this.shelfIndex = model.shelfIndex;
                this.shelfName = model.shelfName;
                this.tabs = model.tabs;
            } 

            /**
             * ShelfId.
             */
            public Builder shelfId(Long shelfId) {
                this.shelfId = shelfId;
                return this;
            }

            /**
             * ShelfIndex.
             */
            public Builder shelfIndex(Integer shelfIndex) {
                this.shelfIndex = shelfIndex;
                return this;
            }

            /**
             * ShelfName.
             */
            public Builder shelfName(String shelfName) {
                this.shelfName = shelfName;
                return this;
            }

            /**
             * Tabs.
             */
            public Builder tabs(java.util.List<Tabs> tabs) {
                this.tabs = tabs;
                return this;
            }

            public Shelves build() {
                return new Shelves(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryShelfResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryShelfResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Shelves")
        private java.util.List<Shelves> shelves;

        private Data(Builder builder) {
            this.shelves = builder.shelves;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return shelves
         */
        public java.util.List<Shelves> getShelves() {
            return this.shelves;
        }

        public static final class Builder {
            private java.util.List<Shelves> shelves; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.shelves = model.shelves;
            } 

            /**
             * Shelves.
             */
            public Builder shelves(java.util.List<Shelves> shelves) {
                this.shelves = shelves;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
