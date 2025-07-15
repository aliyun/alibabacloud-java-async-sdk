// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListEventSubEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventSubEventResponseBody</p>
 */
public class ListEventSubEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEventSubEventResponseBody(Builder builder) {
        this.count = builder.count;
        this.hasMore = builder.hasMore;
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventSubEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private Boolean hasMore; 
        private java.util.List<Logs> logs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEventSubEventResponseBody model) {
            this.count = model.count;
            this.hasMore = model.hasMore;
            this.logs = model.logs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of callback records returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The callback records.</p>
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC8CB656-A7BA-1811-9D6B-4CC187E988BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEventSubEventResponseBody build() {
            return new ListEventSubEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventSubEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventSubEventResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private Integer cost;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("SubId")
        private String subId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Logs(Builder builder) {
            this.appId = builder.appId;
            this.code = builder.code;
            this.cost = builder.cost;
            this.data = builder.data;
            this.messageId = builder.messageId;
            this.subId = builder.subId;
            this.time = builder.time;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appId; 
            private Integer code; 
            private Integer cost; 
            private String data; 
            private String messageId; 
            private String subId; 
            private String time; 
            private String url; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.appId = model.appId;
                this.code = model.code;
                this.cost = model.cost;
                this.data = model.data;
                this.messageId = model.messageId;
                this.subId = model.subId;
                this.time = model.time;
                this.url = model.url;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9qb1****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The HTTP status code. A value of 200 indicates that the callback was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The callback duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The details about the callback.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MsgId&quot;:&quot;875d5266cbabb1834cc84a105cf68454&quot;,&quot;MsgTimestamp&quot;:1697545591,&quot;SubscribeId&quot;:&quot;09be0d2254cb5a89f4cbd86403ec5343&quot;,&quot;AppId&quot;:&quot;xxx&quot;,&quot;ChannelId&quot;:&quot;9099&quot;,&quot;Contents&quot;:[{&quot;Event&quot;:&quot;UserEvent&quot;,&quot;UserEvent&quot;:{&quot;UserId&quot;:&quot;linux_test&quot;,&quot;EventTag&quot;:&quot;Leave&quot;,&quot;SessionId&quot;:&quot;je7y2sBZJZQ0VBJZrh4LnBkxvGH2WyVs&quot;,&quot;Timestamp&quot;:1697545591,&quot;ChannelProfile&quot;:&quot;interactive_live&quot;,&quot;US&quot;:5068748604047364,&quot;Reason&quot;:1,&quot;Role&quot;:1,&quot;TerminalType&quot;:6,&quot;UserType&quot;:2}}]}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The ID of the callback record.</p>
             * 
             * <strong>example:</strong>
             * <p>875d5266cbabb1834cc84a105cf6****</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The subscription ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ad53276431c****</p>
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * <p>The time when the callback was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-17 20:26:31.988</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****.com/callback</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
