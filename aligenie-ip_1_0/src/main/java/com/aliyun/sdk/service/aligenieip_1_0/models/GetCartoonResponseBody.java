// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCartoonResponseBody} extends {@link TeaModel}
 *
 * <p>GetCartoonResponseBody</p>
 */
public class GetCartoonResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private GetCartoonResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCartoonResponseBody create() {
        return builder().build();
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
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

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

        public GetCartoonResponseBody build() {
            return new GetCartoonResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("StartVideoMd5")
        private String startVideoMd5;

        @NameInMap("StartVideoUrl")
        private String startVideoUrl;

        private Result(Builder builder) {
            this.startVideoMd5 = builder.startVideoMd5;
            this.startVideoUrl = builder.startVideoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return startVideoMd5
         */
        public String getStartVideoMd5() {
            return this.startVideoMd5;
        }

        /**
         * @return startVideoUrl
         */
        public String getStartVideoUrl() {
            return this.startVideoUrl;
        }

        public static final class Builder {
            private String startVideoMd5; 
            private String startVideoUrl; 

            /**
             * StartVideoMd5.
             */
            public Builder startVideoMd5(String startVideoMd5) {
                this.startVideoMd5 = startVideoMd5;
                return this;
            }

            /**
             * StartVideoUrl.
             */
            public Builder startVideoUrl(String startVideoUrl) {
                this.startVideoUrl = startVideoUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
