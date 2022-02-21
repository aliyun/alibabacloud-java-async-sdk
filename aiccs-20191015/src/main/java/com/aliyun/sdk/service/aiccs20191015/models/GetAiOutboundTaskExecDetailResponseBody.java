// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskExecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskExecDetailResponseBody</p>
 */
public class GetAiOutboundTaskExecDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * 任务执行列表
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
         * Id of the request
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

    public static class List extends TeaModel {
        @NameInMap("BatchVersion")
        private Integer batchVersion;

        @NameInMap("BizData")
        private String bizData;

        @NameInMap("CallCount")
        private Integer callCount;

        @NameInMap("CaseId")
        private Long caseId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LastCallResult")
        private String lastCallResult;

        @NameInMap("PhoneNum")
        private String phoneNum;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusDesc")
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
             * 任务批次
             */
            public Builder batchVersion(Integer batchVersion) {
                this.batchVersion = batchVersion;
                return this;
            }

            /**
             * 业务自定义信息
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * 外呼次数
             */
            public Builder callCount(Integer callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * id
             */
            public Builder caseId(Long caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * 号码导入时间戳（毫秒）
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 最后一次外呼结果
             */
            public Builder lastCallResult(String lastCallResult) {
                this.lastCallResult = lastCallResult;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * 执行状态（1：待呼叫，2:呼叫中，3:已完成，4:已终止，5:待重呼）
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 执行状态描述
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
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("HasNextPage")
        private Boolean hasNextPage;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalResults")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageSize; 
            private Integer totalResults; 

            /**
             * 当前页数
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * 是否有下一页
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * 外呼号码执行列表
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * 分页大小
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 总数
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
