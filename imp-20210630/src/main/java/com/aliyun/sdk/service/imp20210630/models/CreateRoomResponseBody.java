// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoomResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoomResponseBody</p>
 */
public class CreateRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoomResponseBody create() {
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

        public CreateRoomResponseBody build() {
            return new CreateRoomResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("RoomId")
        private String roomId;

        private Result(Builder builder) {
            this.roomId = builder.roomId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        public static final class Builder {
            private String roomId; 

            /**
             * 房间id
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
