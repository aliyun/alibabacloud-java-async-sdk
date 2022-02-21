// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResponseBody</p>
 */
public class CreateAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateAppResponseBody build() {
            return new CreateAppResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        private Result(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * 应用唯一标示
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
