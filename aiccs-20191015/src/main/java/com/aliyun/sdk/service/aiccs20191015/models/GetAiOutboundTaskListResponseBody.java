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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAiOutboundTaskListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Job list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(List model) {
                this.concurrentRate = model.concurrentRate;
                this.createTime = model.createTime;
                this.description = model.description;
                this.finishCount = model.finishCount;
                this.finishRate = model.finishRate;
                this.handlerId = model.handlerId;
                this.handlerName = model.handlerName;
                this.name = model.name;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.taskId = model.taskId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Concurrent outbound calls.</p>
             * <blockquote>
             * <p>Parameter specific to auto dialing.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder concurrentRate(Integer concurrentRate) {
                this.concurrentRate = concurrentRate;
                return this;
            }

            /**
             * <p>The deadline for job creation. UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615083365000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Job description.</p>
             * 
             * <strong>example:</strong>
             * <p>房产销售</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of completed tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>Job completion rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder finishRate(Float finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * <p>Skill group ID (for predictive dialing) or IVR ID (for auto dialing).</p>
             * 
             * <strong>example:</strong>
             * <p>2468****</p>
             */
            public Builder handlerId(Long handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>Skill group name or IVR name.</p>
             * 
             * <strong>example:</strong>
             * <p>热线技能组</p>
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * <p>Job name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx外呼任务</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Task Status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not started.</li>
             * <li><strong>1</strong>: In progress.</li>
             * <li><strong>2</strong>: System paused.</li>
             * <li><strong>3</strong>: Manually paused.</li>
             * <li><strong>4</strong>: Completed.</li>
             * <li><strong>5</strong>: Stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Task status description.</p>
             * 
             * <strong>example:</strong>
             * <p>未开始</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1763****</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Total number of jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.hasNextPage = model.hasNextPage;
                this.list = model.list;
                this.pageSize = model.pageSize;
                this.totalResults = model.totalResults;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Indicates whether there is a next page. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * <p>Job information.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of data entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
