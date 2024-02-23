// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallTaskDetailResponseBody</p>
 */
public class ListCallTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    @NameInMap("TotalPage")
    private Long totalPage;

    private ListCallTaskDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 
        private Long totalPage; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the task.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of called numbers.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * The total number of pages.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListCallTaskDetailResponseBody build() {
            return new ListCallTaskDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CalledNum")
        private String calledNum;

        @NameInMap("Caller")
        private String caller;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.calledNum = builder.calledNum;
            this.caller = builder.caller;
            this.duration = builder.duration;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calledNum
         */
        public String getCalledNum() {
            return this.calledNum;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String calledNum; 
            private String caller; 
            private Long duration; 
            private Long id; 
            private String status; 

            /**
             * The called number.
             */
            public Builder calledNum(String calledNum) {
                this.calledNum = calledNum;
                return this;
            }

            /**
             * The calling number.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * The call duration. Unit: seconds.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * This parameter is unavailable.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The task state. Valid values:
             * <p>
             * 
             * *   **SUCCESS**: The task was successful.
             * *   **FAIL**: The task failed.
             * *   **INIT**: The task was not started.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
