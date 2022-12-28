// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataStreamResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataStreamResponseBody</p>
 */
public class UpdateDataStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private UpdateDataStreamResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStreamResponseBody create() {
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
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateDataStreamResponseBody build() {
            return new UpdateDataStreamResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("appName")
        private String appName;

        private Result(Builder builder) {
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appName; 

            /**
             * appName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
