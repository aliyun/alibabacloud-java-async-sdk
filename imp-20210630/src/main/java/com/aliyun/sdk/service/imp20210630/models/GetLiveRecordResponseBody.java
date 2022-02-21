// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRecordResponseBody</p>
 */
public class GetLiveRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveRecordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRecordResponseBody create() {
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
         * API请求的返回结果结构体。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetLiveRecordResponseBody build() {
            return new GetLiveRecordResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("PlaybackUrlMap")
        private java.util.Map < String, java.util.List<String>> playbackUrlMap;

        private Result(Builder builder) {
            this.playbackUrlMap = builder.playbackUrlMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return playbackUrlMap
         */
        public java.util.Map < String, java.util.List<String>> getPlaybackUrlMap() {
            return this.playbackUrlMap;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.List<String>> playbackUrlMap; 

            /**
             * PlaybackUrlMap.
             */
            public Builder playbackUrlMap(java.util.Map < String, java.util.List<String>> playbackUrlMap) {
                this.playbackUrlMap = playbackUrlMap;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
