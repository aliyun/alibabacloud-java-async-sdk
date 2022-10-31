// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageUserInfoResponseBody</p>
 */
public class GetMessageUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetMessageUserInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageUserInfoResponseBody create() {
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageUserInfoResponseBody build() {
            return new GetMessageUserInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("HasOrderedIM")
        private Boolean hasOrderedIM;

        @NameInMap("IsNewIMUser")
        private Boolean isNewIMUser;

        private Result(Builder builder) {
            this.hasOrderedIM = builder.hasOrderedIM;
            this.isNewIMUser = builder.isNewIMUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hasOrderedIM
         */
        public Boolean getHasOrderedIM() {
            return this.hasOrderedIM;
        }

        /**
         * @return isNewIMUser
         */
        public Boolean getIsNewIMUser() {
            return this.isNewIMUser;
        }

        public static final class Builder {
            private Boolean hasOrderedIM; 
            private Boolean isNewIMUser; 

            /**
             * HasOrderedIM.
             */
            public Builder hasOrderedIM(Boolean hasOrderedIM) {
                this.hasOrderedIM = hasOrderedIM;
                return this;
            }

            /**
             * IsNewIMUser.
             */
            public Builder isNewIMUser(Boolean isNewIMUser) {
                this.isNewIMUser = isNewIMUser;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
