// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionLogResponseBody</p>
 */
public class ListFunctionLogResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("Paginator")
    private Paginator paginator;

    @NameInMap("RequestId")
    private String requestId;

    private ListFunctionLogResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.paginator = builder.paginator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return paginator
     */
    public Paginator getPaginator() {
        return this.paginator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Paginator paginator; 
        private String requestId; 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Paginator.
         */
        public Builder paginator(Paginator paginator) {
            this.paginator = paginator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionLogResponseBody build() {
            return new ListFunctionLogResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("Contents")
        private java.util.List < String > contents;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Levels")
        private java.util.List < String > levels;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Timestamps")
        private java.util.List < String > timestamps;

        private DataList(Builder builder) {
            this.contents = builder.contents;
            this.functionName = builder.functionName;
            this.levels = builder.levels;
            this.requestId = builder.requestId;
            this.spaceId = builder.spaceId;
            this.status = builder.status;
            this.timestamps = builder.timestamps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return levels
         */
        public java.util.List < String > getLevels() {
            return this.levels;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamps
         */
        public java.util.List < String > getTimestamps() {
            return this.timestamps;
        }

        public static final class Builder {
            private java.util.List < String > contents; 
            private String functionName; 
            private java.util.List < String > levels; 
            private String requestId; 
            private String spaceId; 
            private String status; 
            private java.util.List < String > timestamps; 

            /**
             * Contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Levels.
             */
            public Builder levels(java.util.List < String > levels) {
                this.levels = levels;
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
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Timestamps.
             */
            public Builder timestamps(java.util.List < String > timestamps) {
                this.timestamps = timestamps;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Paginator extends TeaModel {
        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Paginator(Builder builder) {
            this.pageCount = builder.pageCount;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paginator create() {
            return builder().build();
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageCount; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Paginator build() {
                return new Paginator(this);
            } 

        } 

    }
}
