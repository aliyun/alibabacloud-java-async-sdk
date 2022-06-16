// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnvironmentResponseBody</p>
 */
public class CreateEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private String errMsg; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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

        public CreateEnvironmentResponseBody build() {
            return new CreateEnvironmentResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppEnvId")
        private Long appEnvId;

        private Result(Builder builder) {
            this.appEnvId = builder.appEnvId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appEnvId
         */
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        public static final class Builder {
            private Long appEnvId; 

            /**
             * AppEnvId.
             */
            public Builder appEnvId(Long appEnvId) {
                this.appEnvId = appEnvId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
