// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCartoonResponseBody} extends {@link TeaModel}
 *
 * <p>GetCartoonResponseBody</p>
 */
public class GetCartoonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCartoonResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
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

        public GetCartoonResponseBody build() {
            return new GetCartoonResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCartoonResponseBody} extends {@link TeaModel}
     *
     * <p>GetCartoonResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StartVideoMd5")
        private String startVideoMd5;

        @com.aliyun.core.annotation.NameInMap("StartVideoUrl")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.startVideoMd5 = model.startVideoMd5;
                this.startVideoUrl = model.startVideoUrl;
            } 

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
