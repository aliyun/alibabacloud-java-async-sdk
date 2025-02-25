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
 * {@link GetAiOutboundTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskListResponseBody</p>
 */
public class GetAiOutboundTaskListResponseBody extends TeaModel {
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

    private GetAiOutboundTaskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskListResponseBody create() {
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

        public GetAiOutboundTaskListResponseBody build() {
            return new GetAiOutboundTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiOutboundTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentRate")
        private Integer concurrentRate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Integer finishCount;

        @com.aliyun.core.annotation.NameInMap("FinishRate")
        private Float finishRate;

        @com.aliyun.core.annotation.NameInMap("HandlerId")
        private Long handlerId;

        @com.aliyun.core.annotation.NameInMap("HandlerName")
        private String handlerName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private List(Builder builder) {
            this.concurrentRate = builder.concurrentRate;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.finishCount = builder.finishCount;
            this.finishRate = builder.finishRate;
            this.handlerId = builder.handlerId;
            this.handlerName = builder.handlerName;
            this.name = builder.name;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.taskId = builder.taskId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return concurrentRate
         */
        public Integer getConcurrentRate() {
            return this.concurrentRate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return finishRate
         */
        public Float getFinishRate() {
            return this.finishRate;
        }

        /**
         * @return handlerId
         */
        public Long getHandlerId() {
            return this.handlerId;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer concurrentRate; 
            private Long createTime; 
            private String description; 
            private Integer finishCount; 
            private Float finishRate; 
            private Long handlerId; 
            private String handlerName; 
            private String name; 
            private Integer status; 
            private String statusDesc; 
            private Long taskId; 
            private Integer totalCount; 

            /**
             * ConcurrentRate.
             */
            public Builder concurrentRate(Integer concurrentRate) {
                this.concurrentRate = concurrentRate;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FinishCount.
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * FinishRate.
             */
            public Builder finishRate(Float finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * HandlerId.
             */
            public Builder handlerId(Long handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * HandlerName.
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiOutboundTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiOutboundTaskListResponseBody</p>
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
