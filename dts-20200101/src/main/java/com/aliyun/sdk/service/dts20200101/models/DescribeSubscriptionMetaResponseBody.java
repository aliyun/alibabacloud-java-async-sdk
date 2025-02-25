// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
    private java.util.List<SubscriptionMetaList> subscriptionMetaList;

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
    public java.util.List<SubscriptionMetaList> getSubscriptionMetaList() {
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
        private java.util.List<SubscriptionMetaList> subscriptionMetaList; 
        private String success; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C12E7A51-09A4-5796-94BE-08B6DA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the subtasks.</p>
         */
        public Builder subscriptionMetaList(java.util.List<SubscriptionMetaList> subscriptionMetaList) {
            this.subscriptionMetaList = subscriptionMetaList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSubscriptionMetaResponseBody build() {
            return new DescribeSubscriptionMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSubscriptionMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionMetaResponseBody</p>
     */
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
             * <p>The consumer offset of the subtask. It is a UNIX timestamp that is generated when the client consumes the first data record. Unit: seconds.</p>
             * <blockquote>
             * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1610524452</p>
             */
            public Builder checkpoint(Long checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The objects of the subtask. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;:{&quot;name&quot;:&quot;dtstestdata&quot;,&quot;all&quot;:false,&quot;Table&quot;:{&quot;order&quot;:{&quot;name&quot;:&quot;order&quot;,&quot;all&quot;:true}}}}</p>
             */
            public Builder DBList(String DBList) {
                this.DBList = DBList;
                return this;
            }

            /**
             * <p>The endpoint and port number of the change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-hangzhou.aliyuncs.com:18001</p>
             */
            public Builder dProxyUrl(String dProxyUrl) {
                this.dProxyUrl = dProxyUrl;
                return this;
            }

            /**
             * <p>The consumer group ID of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>z38m91gg2******</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>The topic of the subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1n0x0x5tz******_dtstestdata_version2</p>
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
