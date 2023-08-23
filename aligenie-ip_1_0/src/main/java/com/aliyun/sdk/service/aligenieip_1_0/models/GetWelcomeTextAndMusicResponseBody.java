// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWelcomeTextAndMusicResponseBody} extends {@link TeaModel}
 *
 * <p>GetWelcomeTextAndMusicResponseBody</p>
 */
public class GetWelcomeTextAndMusicResponseBody extends TeaModel {
    @NameInMap("Extentions")
    private java.util.Map < String, ? > extentions;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private GetWelcomeTextAndMusicResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWelcomeTextAndMusicResponseBody create() {
        return builder().build();
    }

    /**
     * @return extentions
     */
    public java.util.Map < String, ? > getExtentions() {
        return this.extentions;
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map < String, ? > extentions; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map < String, ? > extentions) {
            this.extentions = extentions;
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public GetWelcomeTextAndMusicResponseBody build() {
            return new GetWelcomeTextAndMusicResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("MusicUrl")
        private String musicUrl;

        @NameInMap("Text")
        private String text;

        private Result(Builder builder) {
            this.hotelId = builder.hotelId;
            this.musicUrl = builder.musicUrl;
            this.text = builder.text;
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
         * @return musicUrl
         */
        public String getMusicUrl() {
            return this.musicUrl;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String hotelId; 
            private String musicUrl; 
            private String text; 

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * MusicUrl.
             */
            public Builder musicUrl(String musicUrl) {
                this.musicUrl = musicUrl;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
