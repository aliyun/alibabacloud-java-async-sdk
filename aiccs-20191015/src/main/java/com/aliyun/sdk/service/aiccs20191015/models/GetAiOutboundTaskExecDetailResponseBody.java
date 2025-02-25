// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAiOutboundTaskExecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskExecDetailResponseBody</p>
 */
public class GetAiOutboundTaskExecDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAiOutboundTaskExecDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskExecDetailResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetAiOutboundTaskExecDetailResponseBody build() {
            return new GetAiOutboundTaskExecDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiOutboundTaskExecDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskExecDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchVersion")
        private Integer batchVersion;

        @com.aliyun.core.annotation.NameInMap("BizData")
        private String bizData;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Integer callCount;

        @com.aliyun.core.annotation.NameInMap("CaseId")
        private Long caseId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("LastCallResult")
        private String lastCallResult;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
        private String phoneNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private Integer statusDesc;

        private List(Builder builder) {
            this.batchVersion = builder.batchVersion;
            this.bizData = builder.bizData;
            this.callCount = builder.callCount;
            this.caseId = builder.caseId;
            this.createTime = builder.createTime;
            this.lastCallResult = builder.lastCallResult;
            this.phoneNum = builder.phoneNum;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return batchVersion
         */
        public Integer getBatchVersion() {
            return this.batchVersion;
        }

        /**
         * @return bizData
         */
        public String getBizData() {
            return this.bizData;
        }

        /**
         * @return callCount
         */
        public Integer getCallCount() {
            return this.callCount;
        }

        /**
         * @return caseId
         */
        public Long getCaseId() {
            return this.caseId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastCallResult
         */
        public String getLastCallResult() {
            return this.lastCallResult;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public Integer getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private Integer batchVersion; 
            private String bizData; 
            private Integer callCount; 
            private Long caseId; 
            private Long createTime; 
            private String lastCallResult; 
            private String phoneNum; 
            private Integer status; 
            private Integer statusDesc; 

            /**
             * BatchVersion.
             */
            public Builder batchVersion(Integer batchVersion) {
                this.batchVersion = batchVersion;
                return this;
            }

            /**
             * BizData.
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * CallCount.
             */
            public Builder callCount(Integer callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * CaseId.
             */
            public Builder caseId(Long caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastCallResult.
             */
            public Builder lastCallResult(String lastCallResult) {
                this.lastCallResult = lastCallResult;
                return this;
            }

            /**
             * PhoneNum.
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(Integer statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiOutboundTaskExecDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskExecDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("HasNextPage")
        private Boolean hasNextPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
        private Integer totalResults;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.hasNextPage = builder.hasNextPage;
            this.list = builder.list;
            this.pageSize = builder.pageSize;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return hasNextPage
         */
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalResults
         */
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Boolean hasNextPage; 
            private java.util.List<List> list; 
            private Integer pageSize; 
            private Integer totalResults; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * HasNextPage.
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
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
             * TotalResults.
             */
            public Builder totalResults(Integer totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
