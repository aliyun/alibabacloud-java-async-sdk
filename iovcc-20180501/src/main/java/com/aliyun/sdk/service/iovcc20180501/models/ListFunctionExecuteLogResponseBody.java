// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionExecuteLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionExecuteLogResponseBody</p>
 */
public class ListFunctionExecuteLogResponseBody extends TeaModel {
    @NameInMap("LogList")
    private LogList logList;

    @NameInMap("RequestId")
    private String requestId;

    private ListFunctionExecuteLogResponseBody(Builder builder) {
        this.logList = builder.logList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionExecuteLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logList
     */
    public LogList getLogList() {
        return this.logList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogList logList; 
        private String requestId; 

        /**
         * LogList.
         */
        public Builder logList(LogList logList) {
            this.logList = logList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionExecuteLogResponseBody build() {
            return new ListFunctionExecuteLogResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @NameInMap("BackEndRequestId")
        private String backEndRequestId;

        @NameInMap("Message")
        private String message;

        private Logs(Builder builder) {
            this.backEndRequestId = builder.backEndRequestId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return backEndRequestId
         */
        public String getBackEndRequestId() {
            return this.backEndRequestId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String backEndRequestId; 
            private String message; 

            /**
             * BackEndRequestId.
             */
            public Builder backEndRequestId(String backEndRequestId) {
                this.backEndRequestId = backEndRequestId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("HasNextPage")
        private Boolean hasNextPage;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        private Pagination(Builder builder) {
            this.hasNextPage = builder.hasNextPage;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return hasNextPage
         */
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private Boolean hasNextPage; 
            private Integer pageIndex; 
            private Integer pageSize; 

            /**
             * HasNextPage.
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class LogList extends TeaModel {
        @NameInMap("Logs")
        private java.util.List < Logs> logs;

        @NameInMap("Pagination")
        private Pagination pagination;

        private LogList(Builder builder) {
            this.logs = builder.logs;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return logs
         */
        public java.util.List < Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < Logs> logs; 
            private Pagination pagination; 

            /**
             * Logs.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
}
