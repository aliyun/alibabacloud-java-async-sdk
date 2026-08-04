// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link BatchDeleteTopicsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteTopicsResponseBody</p>
 */
public class BatchDeleteTopicsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchDeleteTopicsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTopicsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchDeleteTopicsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public BatchDeleteTopicsResponseBody build() {
            return new BatchDeleteTopicsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchDeleteTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchDeleteTopicsResponseBody</p>
     */
    public static class TopicDeleteResultItemVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("DynamicCode")
        private String dynamicCode;

        @com.aliyun.core.annotation.NameInMap("DynamicMessage")
        private String dynamicMessage;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private TopicDeleteResultItemVO(Builder builder) {
            this.code = builder.code;
            this.dynamicCode = builder.dynamicCode;
            this.dynamicMessage = builder.dynamicMessage;
            this.message = builder.message;
            this.status = builder.status;
            this.success = builder.success;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicDeleteResultItemVO create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return dynamicCode
         */
        public String getDynamicCode() {
            return this.dynamicCode;
        }

        /**
         * @return dynamicMessage
         */
        public String getDynamicMessage() {
            return this.dynamicMessage;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Integer code; 
            private String dynamicCode; 
            private String dynamicMessage; 
            private String message; 
            private String status; 
            private Boolean success; 
            private String topic; 

            private Builder() {
            } 

            private Builder(TopicDeleteResultItemVO model) {
                this.code = model.code;
                this.dynamicCode = model.dynamicCode;
                this.dynamicMessage = model.dynamicMessage;
                this.message = model.message;
                this.status = model.status;
                this.success = model.success;
                this.topic = model.topic;
            } 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * DynamicCode.
             */
            public Builder dynamicCode(String dynamicCode) {
                this.dynamicCode = dynamicCode;
                return this;
            }

            /**
             * DynamicMessage.
             */
            public Builder dynamicMessage(String dynamicMessage) {
                this.dynamicMessage = dynamicMessage;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public TopicDeleteResultItemVO build() {
                return new TopicDeleteResultItemVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchDeleteTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchDeleteTopicsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicDeleteResultItemVO")
        private java.util.List<TopicDeleteResultItemVO> topicDeleteResultItemVO;

        private Results(Builder builder) {
            this.topicDeleteResultItemVO = builder.topicDeleteResultItemVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return topicDeleteResultItemVO
         */
        public java.util.List<TopicDeleteResultItemVO> getTopicDeleteResultItemVO() {
            return this.topicDeleteResultItemVO;
        }

        public static final class Builder {
            private java.util.List<TopicDeleteResultItemVO> topicDeleteResultItemVO; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.topicDeleteResultItemVO = model.topicDeleteResultItemVO;
            } 

            /**
             * TopicDeleteResultItemVO.
             */
            public Builder topicDeleteResultItemVO(java.util.List<TopicDeleteResultItemVO> topicDeleteResultItemVO) {
                this.topicDeleteResultItemVO = topicDeleteResultItemVO;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchDeleteTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchDeleteTopicsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.failedCount = builder.failedCount;
            this.results = builder.results;
            this.successCount = builder.successCount;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer failedCount; 
            private Results results; 
            private Integer successCount; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedCount = model.failedCount;
                this.results = model.results;
                this.successCount = model.successCount;
                this.total = model.total;
            } 

            /**
             * FailedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
