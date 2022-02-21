// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInfoResponseBody</p>
 */
public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetUserInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoResponseBody create() {
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

        public GetUserInfoResponseBody build() {
            return new GetUserInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("HasOrderedImp")
        private Boolean hasOrderedImp;

        @NameInMap("IsOverdue")
        private Boolean isOverdue;

        @NameInMap("IsPayByWatchTimeLengthUser")
        private Boolean isPayByWatchTimeLengthUser;

        private Result(Builder builder) {
            this.hasOrderedImp = builder.hasOrderedImp;
            this.isOverdue = builder.isOverdue;
            this.isPayByWatchTimeLengthUser = builder.isPayByWatchTimeLengthUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hasOrderedImp
         */
        public Boolean getHasOrderedImp() {
            return this.hasOrderedImp;
        }

        /**
         * @return isOverdue
         */
        public Boolean getIsOverdue() {
            return this.isOverdue;
        }

        /**
         * @return isPayByWatchTimeLengthUser
         */
        public Boolean getIsPayByWatchTimeLengthUser() {
            return this.isPayByWatchTimeLengthUser;
        }

        public static final class Builder {
            private Boolean hasOrderedImp; 
            private Boolean isOverdue; 
            private Boolean isPayByWatchTimeLengthUser; 

            /**
             * 是否开通服务
             */
            public Builder hasOrderedImp(Boolean hasOrderedImp) {
                this.hasOrderedImp = hasOrderedImp;
                return this;
            }

            /**
             * 是否欠费
             */
            public Builder isOverdue(Boolean isOverdue) {
                this.isOverdue = isOverdue;
                return this;
            }

            /**
             * 是否购买时长套餐
             */
            public Builder isPayByWatchTimeLengthUser(Boolean isPayByWatchTimeLengthUser) {
                this.isPayByWatchTimeLengthUser = isPayByWatchTimeLengthUser;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
