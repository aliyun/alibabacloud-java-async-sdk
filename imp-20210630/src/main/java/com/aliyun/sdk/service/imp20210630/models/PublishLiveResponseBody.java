// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveResponseBody} extends {@link TeaModel}
 *
 * <p>PublishLiveResponseBody</p>
 */
public class PublishLiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private PublishLiveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishLiveResponseBody create() {
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public PublishLiveResponseBody build() {
            return new PublishLiveResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("LiveUrl")
        private String liveUrl;

        @NameInMap("PushUrl")
        private String pushUrl;

        @NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.anchorId = builder.anchorId;
            this.liveId = builder.liveId;
            this.liveUrl = builder.liveUrl;
            this.pushUrl = builder.pushUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return anchorId
         */
        public String getAnchorId() {
            return this.anchorId;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String anchorId; 
            private String liveId; 
            private String liveUrl; 
            private String pushUrl; 
            private String status; 

            /**
             * 主播ID
             */
            public Builder anchorId(String anchorId) {
                this.anchorId = anchorId;
                return this;
            }

            /**
             * 直播资源的唯一标识ID
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 直播拉流地址
             */
            public Builder liveUrl(String liveUrl) {
                this.liveUrl = liveUrl;
                return this;
            }

            /**
             * 直播推流地址
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            /**
             * 直播状态：Created-已创建未开播，Living-直播中，End-直播结束
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
