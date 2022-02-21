// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChangeLogListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChangeLogListResponseBody</p>
 */
public class QueryChangeLogListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private Data data;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultLimit")
    private Boolean resultLimit;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
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

        /**
         * CurrentPageNum.
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
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
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
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
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
         * ResultLimit.
         */
        public Builder resultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryChangeLogListResponseBody build() {
            return new QueryChangeLogListResponseBody(this);
        } 

    } 

    public static class ChangeLog extends TeaModel {
        @NameInMap("Details")
        private String details;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Operation")
        private String operation;

        @NameInMap("OperationIPAddress")
        private String operationIPAddress;

        @NameInMap("Result")
        private String result;

        @NameInMap("Time")
        private String time;

        private ChangeLog(Builder builder) {
            this.details = builder.details;
            this.domainName = builder.domainName;
            this.operation = builder.operation;
            this.operationIPAddress = builder.operationIPAddress;
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
            private String result; 
            private String time; 

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
    public static class Data extends TeaModel {
        @NameInMap("ChangeLog")
        private java.util.List < ChangeLog> changeLog;

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
        public java.util.List < ChangeLog> getChangeLog() {
            return this.changeLog;
        }

        public static final class Builder {
            private java.util.List < ChangeLog> changeLog; 

            /**
             * ChangeLog.
             */
            public Builder changeLog(java.util.List < ChangeLog> changeLog) {
                this.changeLog = changeLog;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
