// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePublicNetworkResponseBody</p>
 */
public class UpdatePublicNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdatePublicNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublicNetworkResponseBody create() {
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

        public UpdatePublicNetworkResponseBody build() {
            return new UpdatePublicNetworkResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("enablePublic")
        private Boolean enablePublic;

        private Result(Builder builder) {
            this.enablePublic = builder.enablePublic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return enablePublic
         */
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public static final class Builder {
            private Boolean enablePublic; 

            /**
             * enablePublic.
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
