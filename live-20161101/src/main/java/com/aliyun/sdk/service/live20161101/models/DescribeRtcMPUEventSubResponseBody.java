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
 * {@link DescribeRtcMPUEventSubResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcMPUEventSubResponseBody</p>
 */
public class DescribeRtcMPUEventSubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubInfo")
    private SubInfo subInfo;

    private DescribeRtcMPUEventSubResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subInfo = builder.subInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcMPUEventSubResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subInfo
     */
    public SubInfo getSubInfo() {
        return this.subInfo;
    }

    public static final class Builder {
        private String requestId; 
        private SubInfo subInfo; 

        private Builder() {
        } 

        private Builder(DescribeRtcMPUEventSubResponseBody model) {
            this.requestId = model.requestId;
            this.subInfo = model.subInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the subscription.</p>
         */
        public Builder subInfo(SubInfo subInfo) {
            this.subInfo = subInfo;
            return this;
        }

        public DescribeRtcMPUEventSubResponseBody build() {
            return new DescribeRtcMPUEventSubResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcMPUEventSubResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcMPUEventSubResponseBody</p>
     */
    public static class SubInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("ChannelIds")
        private String channelIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SubId")
        private String subId;

        private SubInfo(Builder builder) {
            this.appId = builder.appId;
            this.callbackUrl = builder.callbackUrl;
            this.channelIds = builder.channelIds;
            this.createTime = builder.createTime;
            this.subId = builder.subId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubInfo create() {
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
         * @return channelIds
         */
        public String getChannelIds() {
            return this.channelIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        public static final class Builder {
            private String appId; 
            private String callbackUrl; 
            private String channelIds; 
            private String createTime; 
            private String subId; 

            private Builder() {
            } 

            private Builder(SubInfo model) {
                this.appId = model.appId;
                this.callbackUrl = model.callbackUrl;
                this.channelIds = model.channelIds;
                this.createTime = model.createTime;
                this.subId = model.subId;
            } 

            /**
             * <p>The application ID. You can specify only one application ID.</p>
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
             * <p>The ID of the channel to which mixed-stream relay event callbacks are sent. Multiple channel IDs are separated by commas (,). If this parameter is not returned, mixed-stream relay event callbacks are sent to all channels.</p>
             * 
             * <strong>example:</strong>
             * <p>yourCh1,yourCh2</p>
             */
            public Builder channelIds(String channelIds) {
                this.channelIds = channelIds;
                return this;
            }

            /**
             * <p>The time when the event callback was fired. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-09 18:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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

            public SubInfo build() {
                return new SubInfo(this);
            } 

        } 

    }
}
