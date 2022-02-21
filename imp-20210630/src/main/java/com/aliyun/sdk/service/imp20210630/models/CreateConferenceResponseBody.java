// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConferenceResponseBody</p>
 */
public class CreateConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateConferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConferenceResponseBody create() {
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

        public CreateConferenceResponseBody build() {
            return new CreateConferenceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ConferenceId")
        private String conferenceId;

        private Result(Builder builder) {
            this.conferenceId = builder.conferenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        public static final class Builder {
            private String conferenceId; 

            /**
             * 会议的唯一标识ID。
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
