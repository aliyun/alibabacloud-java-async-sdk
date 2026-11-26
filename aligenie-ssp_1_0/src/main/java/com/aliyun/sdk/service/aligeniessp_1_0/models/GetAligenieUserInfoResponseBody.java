// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetAligenieUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAligenieUserInfoResponseBody</p>
 */
public class GetAligenieUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAligenieUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAligenieUserInfoResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAligenieUserInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
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
         * <p>Flag indicating whether the invocation succeeded</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAligenieUserInfoResponseBody build() {
            return new GetAligenieUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAligenieUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAligenieUserInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AligenieNickname")
        private String aligenieNickname;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Deletable")
        private Boolean deletable;

        private Result(Builder builder) {
            this.aligenieNickname = builder.aligenieNickname;
            this.avatar = builder.avatar;
            this.deletable = builder.deletable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aligenieNickname
         */
        public String getAligenieNickname() {
            return this.aligenieNickname;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        public static final class Builder {
            private String aligenieNickname; 
            private String avatar; 
            private Boolean deletable; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.aligenieNickname = model.aligenieNickname;
                this.avatar = model.avatar;
                this.deletable = model.deletable;
            } 

            /**
             * <p>Aligenie user nickname</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder aligenieNickname(String aligenieNickname) {
                this.aligenieNickname = aligenieNickname;
                return this;
            }

            /**
             * <p>URL of the Aligenie user profile picture</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.alicdn.com/xxx.jpg">http://img.alicdn.com/xxx.jpg</a></p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>Indicates whether the account can be logged off</p>
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
