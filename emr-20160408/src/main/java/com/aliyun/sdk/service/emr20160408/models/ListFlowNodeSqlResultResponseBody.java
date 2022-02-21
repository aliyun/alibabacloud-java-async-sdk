// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeSqlResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowNodeSqlResultResponseBody</p>
 */
public class ListFlowNodeSqlResultResponseBody extends TeaModel {
    @NameInMap("End")
    private Boolean end;

    @NameInMap("HeaderList")
    private HeaderList headerList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RowList")
    private RowList rowList;

    private ListFlowNodeSqlResultResponseBody(Builder builder) {
        this.end = builder.end;
        this.headerList = builder.headerList;
        this.requestId = builder.requestId;
        this.rowList = builder.rowList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowNodeSqlResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return end
     */
    public Boolean getEnd() {
        return this.end;
    }

    /**
     * @return headerList
     */
    public HeaderList getHeaderList() {
        return this.headerList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rowList
     */
    public RowList getRowList() {
        return this.rowList;
    }

    public static final class Builder {
        private Boolean end; 
        private HeaderList headerList; 
        private String requestId; 
        private RowList rowList; 

        /**
         * End.
         */
        public Builder end(Boolean end) {
            this.end = end;
            return this;
        }

        /**
         * HeaderList.
         */
        public Builder headerList(HeaderList headerList) {
            this.headerList = headerList;
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
         * RowList.
         */
        public Builder rowList(RowList rowList) {
            this.rowList = rowList;
            return this;
        }

        public ListFlowNodeSqlResultResponseBody build() {
            return new ListFlowNodeSqlResultResponseBody(this);
        } 

    } 

    public static class HeaderList extends TeaModel {
        @NameInMap("Header")
        private java.util.List < String > header;

        private HeaderList(Builder builder) {
            this.header = builder.header;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderList create() {
            return builder().build();
        }

        /**
         * @return header
         */
        public java.util.List < String > getHeader() {
            return this.header;
        }

        public static final class Builder {
            private java.util.List < String > header; 

            /**
             * Header.
             */
            public Builder header(java.util.List < String > header) {
                this.header = header;
                return this;
            }

            public HeaderList build() {
                return new HeaderList(this);
            } 

        } 

    }
    public static class RowItemList extends TeaModel {
        @NameInMap("rowItem")
        private java.util.List < String > rowItem;

        private RowItemList(Builder builder) {
            this.rowItem = builder.rowItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowItemList create() {
            return builder().build();
        }

        /**
         * @return rowItem
         */
        public java.util.List < String > getRowItem() {
            return this.rowItem;
        }

        public static final class Builder {
            private java.util.List < String > rowItem; 

            /**
             * rowItem.
             */
            public Builder rowItem(java.util.List < String > rowItem) {
                this.rowItem = rowItem;
                return this;
            }

            public RowItemList build() {
                return new RowItemList(this);
            } 

        } 

    }
    public static class Row extends TeaModel {
        @NameInMap("RowIndex")
        private Integer rowIndex;

        @NameInMap("RowItemList")
        private RowItemList rowItemList;

        private Row(Builder builder) {
            this.rowIndex = builder.rowIndex;
            this.rowItemList = builder.rowItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Row create() {
            return builder().build();
        }

        /**
         * @return rowIndex
         */
        public Integer getRowIndex() {
            return this.rowIndex;
        }

        /**
         * @return rowItemList
         */
        public RowItemList getRowItemList() {
            return this.rowItemList;
        }

        public static final class Builder {
            private Integer rowIndex; 
            private RowItemList rowItemList; 

            /**
             * RowIndex.
             */
            public Builder rowIndex(Integer rowIndex) {
                this.rowIndex = rowIndex;
                return this;
            }

            /**
             * RowItemList.
             */
            public Builder rowItemList(RowItemList rowItemList) {
                this.rowItemList = rowItemList;
                return this;
            }

            public Row build() {
                return new Row(this);
            } 

        } 

    }
    public static class RowList extends TeaModel {
        @NameInMap("Row")
        private java.util.List < Row> row;

        private RowList(Builder builder) {
            this.row = builder.row;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowList create() {
            return builder().build();
        }

        /**
         * @return row
         */
        public java.util.List < Row> getRow() {
            return this.row;
        }

        public static final class Builder {
            private java.util.List < Row> row; 

            /**
             * Row.
             */
            public Builder row(java.util.List < Row> row) {
                this.row = row;
                return this;
            }

            public RowList build() {
                return new RowList(this);
            } 

        } 

    }
}
