// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallInfoResponseBody</p>
 */
public class DescribeCallInfoResponseBody extends TeaModel {
    @NameInMap("CallInfo")
    private CallInfo callInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCallInfoResponseBody(Builder builder) {
        this.callInfo = builder.callInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return callInfo
     */
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CallInfo callInfo; 
        private String requestId; 

        /**
         * CallInfo.
         */
        public Builder callInfo(CallInfo callInfo) {
            this.callInfo = callInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCallInfoResponseBody build() {
            return new DescribeCallInfoResponseBody(this);
        } 

    } 

    public static class CallInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CallStatus")
        private String callStatus;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("CreatedTs")
        private Long createdTs;

        @NameInMap("DestroyedTs")
        private Long destroyedTs;

        @NameInMap("Duration")
        private Long duration;

        private CallInfo(Builder builder) {
            this.appId = builder.appId;
            this.callStatus = builder.callStatus;
            this.channelId = builder.channelId;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String appId; 
            private String callStatus; 
            private String channelId; 
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CallStatus.
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public CallInfo build() {
                return new CallInfo(this);
            } 

        } 

    }
}
