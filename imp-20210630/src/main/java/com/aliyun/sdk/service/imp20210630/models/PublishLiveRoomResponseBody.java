// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveRoomResponseBody} extends {@link TeaModel}
 *
 * <p>PublishLiveRoomResponseBody</p>
 */
public class PublishLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private PublishLiveRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishLiveRoomResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 创建场景化直播返回的结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public PublishLiveRoomResponseBody build() {
            return new PublishLiveRoomResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("LiveUrl")
        private String liveUrl;

        @NameInMap("PushUrl")
        private String pushUrl;

        private Result(Builder builder) {
            this.liveId = builder.liveId;
            this.liveUrl = builder.liveUrl;
            this.pushUrl = builder.pushUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return liveUrl
         */
        public String getLiveUrl() {
            return this.liveUrl;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
        }

        public static final class Builder {
            private String liveId; 
            private String liveUrl; 
            private String pushUrl; 

            /**
             * 直播ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 直播拉流地址。
             */
            public Builder liveUrl(String liveUrl) {
                this.liveUrl = liveUrl;
                return this;
            }

            /**
             * 直播推流地址。
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
