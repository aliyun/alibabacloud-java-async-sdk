// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionMetaResponseBody</p>
 */
public class DescribeSubscriptionMetaResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubscriptionMetaList")
    private java.util.List < SubscriptionMetaList> subscriptionMetaList;

    @NameInMap("Success")
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
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * SubscriptionMetaList.
         */
        public Builder subscriptionMetaList(java.util.List < SubscriptionMetaList> subscriptionMetaList) {
            this.subscriptionMetaList = subscriptionMetaList;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("Checkpoint")
        private Long checkpoint;

        @NameInMap("DBList")
        private String DBList;

        @NameInMap("DProxyUrl")
        private String DProxyUrl;

        @NameInMap("Sid")
        private String sid;

        @NameInMap("Topic")
        private String topic;

        private SubscriptionMetaList(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.DBList = builder.DBList;
            this.DProxyUrl = builder.DProxyUrl;
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
         * @return DProxyUrl
         */
        public String getDProxyUrl() {
            return this.DProxyUrl;
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
            private String DProxyUrl; 
            private String sid; 
            private String topic; 

            /**
             * Checkpoint.
             */
            public Builder checkpoint(Long checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * DBList.
             */
            public Builder DBList(String DBList) {
                this.DBList = DBList;
                return this;
            }

            /**
             * DProxyUrl.
             */
            public Builder DProxyUrl(String DProxyUrl) {
                this.DProxyUrl = DProxyUrl;
                return this;
            }

            /**
             * Sid.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * Topic.
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
