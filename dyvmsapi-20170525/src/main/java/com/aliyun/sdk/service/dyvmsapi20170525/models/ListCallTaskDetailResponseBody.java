// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCallTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallTaskDetailResponseBody</p>
 */
public class ListCallTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the task.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D692AC3D-CBA8-417F-BEB9-5B73718922D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of called numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListCallTaskDetailResponseBody build() {
            return new ListCallTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNum")
        private String calledNum;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>1300000****</p>
             */
            public Builder calledNum(String calledNum) {
                this.calledNum = calledNum;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571000****</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>The call duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The task state. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The task was successful.</li>
             * <li><strong>FAIL</strong>: The task failed.</li>
             * <li><strong>INIT</strong>: The task was not started.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAIL</p>
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
