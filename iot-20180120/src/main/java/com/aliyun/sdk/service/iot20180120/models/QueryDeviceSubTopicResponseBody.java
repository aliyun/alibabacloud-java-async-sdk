// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceSubTopicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceSubTopicResponseBody</p>
 */
public class QueryDeviceSubTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TopicList")
    private java.util.List < TopicList> topicList;

    private QueryDeviceSubTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicList = builder.topicList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceSubTopicResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return topicList
     */
    public java.util.List < TopicList> getTopicList() {
        return this.topicList;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TopicList> topicList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * TopicList.
         */
        public Builder topicList(java.util.List < TopicList> topicList) {
            this.topicList = topicList;
            return this;
        }

        public QueryDeviceSubTopicResponseBody build() {
            return new QueryDeviceSubTopicResponseBody(this);
        } 

    } 

    public static class TopicList extends TeaModel {
        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TopicName")
        private String topicName;

        private TopicList(Builder builder) {
            this.timestamp = builder.timestamp;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicList create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long timestamp; 
            private String topicName; 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public TopicList build() {
                return new TopicList(this);
            } 

        } 

    }
}
