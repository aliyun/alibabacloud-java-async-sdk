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
 * {@link ListRtcMPUEventSubRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListRtcMPUEventSubRecordResponseBody</p>
 */
public class ListRtcMPUEventSubRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRtcMPUEventSubRecordResponseBody(Builder builder) {
        this.count = builder.count;
        this.hasMore = builder.hasMore;
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRtcMPUEventSubRecordResponseBody create() {
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

        private Builder(ListRtcMPUEventSubRecordResponseBody model) {
            this.count = model.count;
            this.hasMore = model.hasMore;
            this.logs = model.logs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRtcMPUEventSubRecordResponseBody build() {
            return new ListRtcMPUEventSubRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRtcMPUEventSubRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUEventSubRecordResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private Long cost;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("HTTPCode")
        private String HTTPCode;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("SubId")
        private String subId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Logs(Builder builder) {
            this.appId = builder.appId;
            this.callbackUrl = builder.callbackUrl;
            this.cost = builder.cost;
            this.data = builder.data;
            this.HTTPCode = builder.HTTPCode;
            this.msgId = builder.msgId;
            this.subId = builder.subId;
            this.time = builder.time;
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
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
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
        public String getData() {
            return this.data;
        }

        /**
         * @return HTTPCode
         */
        public String getHTTPCode() {
            return this.HTTPCode;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
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

        public static final class Builder {
            private String appId; 
            private String callbackUrl; 
            private Long cost; 
            private String data; 
            private String HTTPCode; 
            private String msgId; 
            private String subId; 
            private String time; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.appId = model.appId;
                this.callbackUrl = model.callbackUrl;
                this.cost = model.cost;
                this.data = model.data;
                this.HTTPCode = model.HTTPCode;
                this.msgId = model.msgId;
                this.subId = model.subId;
                this.time = model.time;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAppId</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://testcallback***.com/callback">http://testcallback***.com/callback</a></p>
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * <p>The callback duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>For more information about the callback, see <a href="https://help.aliyun.com/document_detail/2804583.html">CreateRtcMPUEventSub</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EventType&quot;:1,&quot;MsgId&quot;:&quot;42bba8b5-94ab-468c-9dae-9b501dd6c***&quot;,&quot;AppId&quot;:&quot;rtcdev&quot;,&quot;SubId&quot;:&quot;Sub-9799B2C45009799B2C4***&quot;,&quot;TaskId&quot;:&quot;mpucallbacktest&quot;,&quot;CallbackTs&quot;:1712656430***,&quot;Payload&quot;:{&quot;DstUrl&quot;:&quot;rtmp://domain/app/stream?auth&quot;,&quot;EventTs&quot;:1712656430***,&quot;EventCode&quot;:1,&quot;ErrorCode&quot;:0,&quot;ErrorMessage&quot;:&quot;&quot;}}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The HTTP status code. 200 indicates that the callback is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder HTTPCode(String HTTPCode) {
                this.HTTPCode = HTTPCode;
                return this;
            }

            /**
             * <p>The ID of the callback record.</p>
             * 
             * <strong>example:</strong>
             * <p>42bba8b5-********-9b501dd6cb6e</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The ID of the subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>Sub-<strong><strong><strong>9799B2C4500</strong></strong></strong></p>
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * <p>The time when the callback was invoked. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01T00:00:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
