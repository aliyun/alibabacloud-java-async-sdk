// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryUserByMobileAccountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserByMobileAccountResponseBody</p>
 */
public class QueryUserByMobileAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserByMobileAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserByMobileAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryUserByMobileAccountResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46e53***********270</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user information bound to the third-party account.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserByMobileAccountResponseBody build() {
            return new QueryUserByMobileAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserByMobileAccountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserByMobileAccountResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundUserId")
        private String boundUserId;

        @com.aliyun.core.annotation.NameInMap("ThirdAccountName")
        private String thirdAccountName;

        private Result(Builder builder) {
            this.boundUserId = builder.boundUserId;
            this.thirdAccountName = builder.thirdAccountName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return boundUserId
         */
        public String getBoundUserId() {
            return this.boundUserId;
        }

        /**
         * @return thirdAccountName
         */
        public String getThirdAccountName() {
            return this.thirdAccountName;
        }

        public static final class Builder {
            private String boundUserId; 
            private String thirdAccountName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.boundUserId = model.boundUserId;
                this.thirdAccountName = model.thirdAccountName;
            } 

            /**
             * <p>The Quick BI user ID of the bound account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder boundUserId(String boundUserId) {
                this.boundUserId = boundUserId;
                return this;
            }

            /**
             * <p>The mobile account name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder thirdAccountName(String thirdAccountName) {
                this.thirdAccountName = thirdAccountName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
