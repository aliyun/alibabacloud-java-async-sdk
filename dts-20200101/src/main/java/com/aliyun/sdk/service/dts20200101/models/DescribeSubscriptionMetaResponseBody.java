// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionMetaResponseBody</p>
 */
public class DescribeSubscriptionMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscriptionMetaList")
    private java.util.List < SubscriptionMetaList> subscriptionMetaList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSubscriptionMetaResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.subscriptionMetaList = builder.subscriptionMetaList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscriptionMetaList
     */
    public java.util.List < SubscriptionMetaList> getSubscriptionMetaList() {
        return this.subscriptionMetaList;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private java.util.List < SubscriptionMetaList> subscriptionMetaList; 
        private String success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the subtasks.
         */
        public Builder subscriptionMetaList(java.util.List < SubscriptionMetaList> subscriptionMetaList) {
            this.subscriptionMetaList = subscriptionMetaList;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSubscriptionMetaResponseBody build() {
            return new DescribeSubscriptionMetaResponseBody(this);
        } 

    } 

    public static class SubscriptionMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private Long checkpoint;

        @com.aliyun.core.annotation.NameInMap("DBList")
        private String DBList;

        @com.aliyun.core.annotation.NameInMap("DProxyUrl")
        private String dProxyUrl;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private SubscriptionMetaList(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.DBList = builder.DBList;
            this.dProxyUrl = builder.dProxyUrl;
            this.sid = builder.sid;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionMetaList create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public Long getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return DBList
         */
        public String getDBList() {
            return this.DBList;
        }

        /**
         * @return dProxyUrl
         */
        public String getDProxyUrl() {
            return this.dProxyUrl;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long checkpoint; 
            private String DBList; 
            private String dProxyUrl; 
            private String sid; 
            private String topic; 

            /**
             * The consumer offset of the subtask. It is a UNIX timestamp that is generated when the client consumes the first data record. Unit: seconds.
             * <p>
             * 
             * >  You can use a search engine to obtain a UNIX timestamp converter.
             */
            public Builder checkpoint(Long checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The objects of the subtask. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder DBList(String DBList) {
                this.DBList = DBList;
                return this;
            }

            /**
             * The endpoint and port number of the change tracking instance.
             */
            public Builder dProxyUrl(String dProxyUrl) {
                this.dProxyUrl = dProxyUrl;
                return this;
            }

            /**
             * The consumer group ID of the subtask.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * The topic of the subtask.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SubscriptionMetaList build() {
                return new SubscriptionMetaList(this);
            } 

        } 

    }
}
