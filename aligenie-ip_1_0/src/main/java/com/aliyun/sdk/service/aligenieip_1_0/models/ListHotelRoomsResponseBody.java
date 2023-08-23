// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelRoomsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelRoomsResponseBody</p>
 */
public class ListHotelRoomsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListHotelRoomsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelRoomsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListHotelRoomsResponseBody build() {
            return new ListHotelRoomsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("RoomNo")
        private String roomNo;

        private Result(Builder builder) {
            this.hotelId = builder.hotelId;
            this.roomNo = builder.roomNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        public static final class Builder {
            private String hotelId; 
            private String roomNo; 

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
