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
 * {@link GetHotelScreenSaverResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelScreenSaverResponseBody</p>
 */
public class GetHotelScreenSaverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetHotelScreenSaverResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelScreenSaverResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetHotelScreenSaverResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetHotelScreenSaverResponseBody build() {
            return new GetHotelScreenSaverResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotelScreenSaverResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelScreenSaverResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PicUrl")
        private String picUrl;

        @com.aliyun.core.annotation.NameInMap("StyleCode")
        private String styleCode;

        private Result(Builder builder) {
            this.picUrl = builder.picUrl;
            this.styleCode = builder.styleCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return styleCode
         */
        public String getStyleCode() {
            return this.styleCode;
        }

        public static final class Builder {
            private String picUrl; 
            private String styleCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.picUrl = model.picUrl;
                this.styleCode = model.styleCode;
            } 

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * StyleCode.
             */
            public Builder styleCode(String styleCode) {
                this.styleCode = styleCode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
