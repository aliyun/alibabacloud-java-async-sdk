// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveResponseBody</p>
 */
public class CreateLiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateLiveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveResponseBody create() {
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
         * 请求ID。
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

        public CreateLiveResponseBody build() {
            return new CreateLiveResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("LiveId")
        private String liveId;

        private Result(Builder builder) {
            this.liveId = builder.liveId;
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

        public static final class Builder {
            private String liveId; 

            /**
             * 直播的唯一标识ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
