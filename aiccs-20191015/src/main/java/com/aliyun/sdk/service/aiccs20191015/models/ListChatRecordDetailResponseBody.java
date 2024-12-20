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
 * {@link ListChatRecordDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatRecordDetailResponseBody</p>
 */
public class ListChatRecordDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultData")
    private ResultData resultData;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListChatRecordDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultData = builder.resultData;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatRecordDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return resultData
     */
    public ResultData getResultData() {
        return this.resultData;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultData resultData; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * ResultData.
         */
        public Builder resultData(ResultData resultData) {
            this.resultData = resultData;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListChatRecordDetailResponseBody build() {
            return new ListChatRecordDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatRecordDetailResponseBody</p>
     */
    public static class MessageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("MsgType")
        private String msgType;

        @com.aliyun.core.annotation.NameInMap("SenderName")
        private String senderName;

        @com.aliyun.core.annotation.NameInMap("SenderType")
        private Long senderType;

        private MessageList(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.msgType = builder.msgType;
            this.senderName = builder.senderName;
            this.senderType = builder.senderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return msgType
         */
        public String getMsgType() {
            return this.msgType;
        }

        /**
         * @return senderName
         */
        public String getSenderName() {
            return this.senderName;
        }

        /**
         * @return senderType
         */
        public Long getSenderType() {
            return this.senderType;
        }

        public static final class Builder {
            private String content; 
            private Long createTime; 
            private String msgType; 
            private String senderName; 
            private Long senderType; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * MsgType.
             */
            public Builder msgType(String msgType) {
                this.msgType = msgType;
                return this;
            }

            /**
             * SenderName.
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * SenderType.
             */
            public Builder senderType(Long senderType) {
                this.senderType = senderType;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChatRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatRecordDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MessageList")
        private java.util.List<MessageList> messageList;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.messageList = builder.messageList;
            this.servicerName = builder.servicerName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return messageList
         */
        public java.util.List<MessageList> getMessageList() {
            return this.messageList;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private java.util.List<MessageList> messageList; 
            private String servicerName; 
            private Long startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MessageList.
             */
            public Builder messageList(java.util.List<MessageList> messageList) {
                this.messageList = messageList;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChatRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatRecordDetailResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("OnePageSize")
        private Long onePageSize;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
        private Long totalResults;

        private ResultData(Builder builder) {
            this.currentPage = builder.currentPage;
            this.data = builder.data;
            this.onePageSize = builder.onePageSize;
            this.totalPage = builder.totalPage;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return onePageSize
         */
        public Long getOnePageSize() {
            return this.onePageSize;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalResults
         */
        public Long getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private Long currentPage; 
            private java.util.List<Data> data; 
            private Long onePageSize; 
            private Long totalPage; 
            private Long totalResults; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * OnePageSize.
             */
            public Builder onePageSize(Long onePageSize) {
                this.onePageSize = onePageSize;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * TotalResults.
             */
            public Builder totalResults(Long totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
}
