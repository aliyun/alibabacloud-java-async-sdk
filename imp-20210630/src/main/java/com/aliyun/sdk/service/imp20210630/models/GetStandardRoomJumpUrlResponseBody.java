// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStandardRoomJumpUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardRoomJumpUrlResponseBody</p>
 */
public class GetStandardRoomJumpUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetStandardRoomJumpUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardRoomJumpUrlResponseBody create() {
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

        public GetStandardRoomJumpUrlResponseBody build() {
            return new GetStandardRoomJumpUrlResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("StandardRoomJumpUrl")
        private String standardRoomJumpUrl;

        private Result(Builder builder) {
            this.standardRoomJumpUrl = builder.standardRoomJumpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return standardRoomJumpUrl
         */
        public String getStandardRoomJumpUrl() {
            return this.standardRoomJumpUrl;
        }

        public static final class Builder {
            private String standardRoomJumpUrl; 

            /**
             * 样板间跳转协议地址
             */
            public Builder standardRoomJumpUrl(String standardRoomJumpUrl) {
                this.standardRoomJumpUrl = standardRoomJumpUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
