// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReleaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReleaseResponseBody</p>
 */
public class CreateReleaseResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateReleaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReleaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String code; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public CreateReleaseResponseBody build() {
            return new CreateReleaseResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ReleaseId")
        private String releaseId;

        private Result(Builder builder) {
            this.releaseId = builder.releaseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return releaseId
         */
        public String getReleaseId() {
            return this.releaseId;
        }

        public static final class Builder {
            private String releaseId; 

            /**
             * ReleaseId.
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
