// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppTemplateResponseBody</p>
 */
public class CreateAppTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateAppTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppTemplateResponseBody create() {
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

        public CreateAppTemplateResponseBody build() {
            return new CreateAppTemplateResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppTemplateId")
        private String appTemplateId;

        private Result(Builder builder) {
            this.appTemplateId = builder.appTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appTemplateId
         */
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public static final class Builder {
            private String appTemplateId; 

            /**
             * 应用模板唯一标示
             */
            public Builder appTemplateId(String appTemplateId) {
                this.appTemplateId = appTemplateId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
