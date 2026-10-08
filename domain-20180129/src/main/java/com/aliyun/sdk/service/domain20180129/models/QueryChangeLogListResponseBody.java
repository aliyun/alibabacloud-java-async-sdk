// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryChangeLogListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChangeLogListResponseBody</p>
 */
public class QueryChangeLogListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultLimit")
    private Boolean resultLimit;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryChangeLogListResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.resultLimit = builder.resultLimit;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChangeLogListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultLimit
     */
    public Boolean getResultLimit() {
        return this.resultLimit;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private Data data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Boolean resultLimit; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(QueryChangeLogListResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.requestId = model.requestId;
            this.resultLimit = model.resultLimit;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether a previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The API returns a maximum of 1,000 recent records per query, regardless of the specified page size. If your query matches more than 1,000 records, <strong>ResultLimit</strong> is <strong>true</strong>. To retrieve all results, narrow the time range and query again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryChangeLogListResponseBody build() {
            return new QueryChangeLogListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryChangeLogListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChangeLogListResponseBody</p>
     */
    public static class ChangeLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private String details;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("OperationIPAddress")
        private String operationIPAddress;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ChangeLog(Builder builder) {
            this.details = builder.details;
            this.domainName = builder.domainName;
            this.operation = builder.operation;
            this.operationIPAddress = builder.operationIPAddress;
            this.remark = builder.remark;
            this.result = builder.result;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeLog create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return operationIPAddress
         */
        public String getOperationIPAddress() {
            return this.operationIPAddress;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String details; 
            private String domainName; 
            private String operation; 
            private String operationIPAddress; 
            private String remark; 
            private String result; 
            private String time; 

            private Builder() {
            } 

            private Builder(ChangeLog model) {
                this.details = model.details;
                this.domainName = model.domainName;
                this.operation = model.operation;
                this.operationIPAddress = model.operationIPAddress;
                this.remark = model.remark;
                this.result = model.result;
                this.time = model.time;
            } 

            /**
             * Details.
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * OperationIPAddress.
             */
            public Builder operationIPAddress(String operationIPAddress) {
                this.operationIPAddress = operationIPAddress;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ChangeLog build() {
                return new ChangeLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChangeLogListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChangeLogListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private java.util.List<ChangeLog> changeLog;

        private Data(Builder builder) {
            this.changeLog = builder.changeLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeLog
         */
        public java.util.List<ChangeLog> getChangeLog() {
            return this.changeLog;
        }

        public static final class Builder {
            private java.util.List<ChangeLog> changeLog; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeLog = model.changeLog;
            } 

            /**
             * ChangeLog.
             */
            public Builder changeLog(java.util.List<ChangeLog> changeLog) {
                this.changeLog = changeLog;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
