// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetHistoryListByBizTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistoryListByBizTypeResponseBody</p>
 */
public class GetHistoryListByBizTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetHistoryListByBizTypeResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryListByBizTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GetHistoryListByBizTypeResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetHistoryListByBizTypeResponseBody build() {
            return new GetHistoryListByBizTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHistoryListByBizTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoryListByBizTypeResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("bizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("extraMessage")
        private Object extraMessage;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("llmAnswer")
        private String llmAnswer;

        @com.aliyun.core.annotation.NameInMap("llmPrompt")
        private String llmPrompt;

        @com.aliyun.core.annotation.NameInMap("llmType")
        private String llmType;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("userQuery")
        private String userQuery;

        private Records(Builder builder) {
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.extraMessage = builder.extraMessage;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.llmAnswer = builder.llmAnswer;
            this.llmPrompt = builder.llmPrompt;
            this.llmType = builder.llmType;
            this.sessionId = builder.sessionId;
            this.userQuery = builder.userQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return extraMessage
         */
        public Object getExtraMessage() {
            return this.extraMessage;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return llmAnswer
         */
        public String getLlmAnswer() {
            return this.llmAnswer;
        }

        /**
         * @return llmPrompt
         */
        public String getLlmPrompt() {
            return this.llmPrompt;
        }

        /**
         * @return llmType
         */
        public String getLlmType() {
            return this.llmType;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return userQuery
         */
        public String getUserQuery() {
            return this.userQuery;
        }

        public static final class Builder {
            private String bizId; 
            private String bizType; 
            private Object extraMessage; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String llmAnswer; 
            private String llmPrompt; 
            private String llmType; 
            private String sessionId; 
            private String userQuery; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.bizId = model.bizId;
                this.bizType = model.bizType;
                this.extraMessage = model.extraMessage;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.llmAnswer = model.llmAnswer;
                this.llmPrompt = model.llmPrompt;
                this.llmType = model.llmType;
                this.sessionId = model.sessionId;
                this.userQuery = model.userQuery;
            } 

            /**
             * bizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * bizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * extraMessage.
             */
            public Builder extraMessage(Object extraMessage) {
                this.extraMessage = extraMessage;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * llmAnswer.
             */
            public Builder llmAnswer(String llmAnswer) {
                this.llmAnswer = llmAnswer;
                return this;
            }

            /**
             * llmPrompt.
             */
            public Builder llmPrompt(String llmPrompt) {
                this.llmPrompt = llmPrompt;
                return this;
            }

            /**
             * llmType.
             */
            public Builder llmType(String llmType) {
                this.llmType = llmType;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * userQuery.
             */
            public Builder userQuery(String userQuery) {
                this.userQuery = userQuery;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHistoryListByBizTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoryListByBizTypeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("totalPages")
        private Long totalPages;

        @com.aliyun.core.annotation.NameInMap("totalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalPages = builder.totalPages;
            this.totalRecords = builder.totalRecords;
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
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalPages; 
            private Long totalRecords; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalPages = model.totalPages;
                this.totalRecords = model.totalRecords;
            } 

            /**
             * currentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * totalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            /**
             * totalRecords.
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
