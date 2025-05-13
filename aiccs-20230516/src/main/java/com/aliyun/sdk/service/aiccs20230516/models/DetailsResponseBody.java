// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link DetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DetailsResponseBody</p>
 */
public class DetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private DetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(DetailsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public DetailsResponseBody build() {
            return new DetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DetailsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("CallDesc")
        private String callDesc;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private Long callStatus;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Long callType;

        @com.aliyun.core.annotation.NameInMap("ImportTime")
        private String importTime;

        @com.aliyun.core.annotation.NameInMap("InterceptReason")
        private String interceptReason;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberDesc")
        private String numberDesc;

        @com.aliyun.core.annotation.NameInMap("NumberMD5")
        private String numberMD5;

        @com.aliyun.core.annotation.NameInMap("NumberStatus")
        private Long numberStatus;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private List(Builder builder) {
            this.batchId = builder.batchId;
            this.callDesc = builder.callDesc;
            this.callId = builder.callId;
            this.callStatus = builder.callStatus;
            this.callType = builder.callType;
            this.importTime = builder.importTime;
            this.interceptReason = builder.interceptReason;
            this.number = builder.number;
            this.numberDesc = builder.numberDesc;
            this.numberMD5 = builder.numberMD5;
            this.numberStatus = builder.numberStatus;
            this.tag = builder.tag;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
        }

        /**
         * @return callDesc
         */
        public String getCallDesc() {
            return this.callDesc;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callStatus
         */
        public Long getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return callType
         */
        public Long getCallType() {
            return this.callType;
        }

        /**
         * @return importTime
         */
        public String getImportTime() {
            return this.importTime;
        }

        /**
         * @return interceptReason
         */
        public String getInterceptReason() {
            return this.interceptReason;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberDesc
         */
        public String getNumberDesc() {
            return this.numberDesc;
        }

        /**
         * @return numberMD5
         */
        public String getNumberMD5() {
            return this.numberMD5;
        }

        /**
         * @return numberStatus
         */
        public Long getNumberStatus() {
            return this.numberStatus;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long batchId; 
            private String callDesc; 
            private String callId; 
            private Long callStatus; 
            private Long callType; 
            private String importTime; 
            private String interceptReason; 
            private String number; 
            private String numberDesc; 
            private String numberMD5; 
            private Long numberStatus; 
            private String tag; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.batchId = model.batchId;
                this.callDesc = model.callDesc;
                this.callId = model.callId;
                this.callStatus = model.callStatus;
                this.callType = model.callType;
                this.importTime = model.importTime;
                this.interceptReason = model.interceptReason;
                this.number = model.number;
                this.numberDesc = model.numberDesc;
                this.numberMD5 = model.numberMD5;
                this.numberStatus = model.numberStatus;
                this.tag = model.tag;
                this.taskId = model.taskId;
            } 

            /**
             * <p>批次号</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>呼叫状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder callDesc(String callDesc) {
                this.callDesc = callDesc;
                return this;
            }

            /**
             * <p>外呼ID</p>
             * 
             * <strong>example:</strong>
             * <p>28dd74a4-30ec-43c0-9bec-272924c51eeb</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>呼叫状态</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callStatus(Long callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * <p>外呼类型</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>导入时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-25 15:19:02</p>
             */
            public Builder importTime(String importTime) {
                this.importTime = importTime;
                return this;
            }

            /**
             * <p>拦截原因</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder interceptReason(String interceptReason) {
                this.interceptReason = interceptReason;
                return this;
            }

            /**
             * <p>外呼号码</p>
             * 
             * <strong>example:</strong>
             * <p>188******454</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>号码状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder numberDesc(String numberDesc) {
                this.numberDesc = numberDesc;
                return this;
            }

            /**
             * <p>外呼号码MD5</p>
             * 
             * <strong>example:</strong>
             * <p>cbe1b40f76f2cca4735954886b706ffa</p>
             */
            public Builder numberMD5(String numberMD5) {
                this.numberMD5 = numberMD5;
                return this;
            }

            /**
             * <p>号码状态</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder numberStatus(Long numberStatus) {
                this.numberStatus = numberStatus;
                return this;
            }

            /**
             * <p>用户自定义标签</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>任务ID</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DetailsResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Float totalPage;

        private Model(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Float getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalCount; 
            private Float totalPage; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Float totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
