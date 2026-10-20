// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link GetWorkloadAccessTokenForUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkloadAccessTokenForUserIdResponseBody</p>
 */
public class GetWorkloadAccessTokenForUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserContext")
    private UserContext userContext;

    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
    private String workloadIdentityArn;

    private GetWorkloadAccessTokenForUserIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userContext = builder.userContext;
        this.workloadAccessToken = builder.workloadAccessToken;
        this.workloadIdentityArn = builder.workloadIdentityArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenForUserIdResponseBody create() {
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
     * @return userContext
     */
    public UserContext getUserContext() {
        return this.userContext;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    /**
     * @return workloadIdentityArn
     */
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

    public static final class Builder {
        private String requestId; 
        private UserContext userContext; 
        private String workloadAccessToken; 
        private String workloadIdentityArn; 

        private Builder() {
        } 

        private Builder(GetWorkloadAccessTokenForUserIdResponseBody model) {
            this.requestId = model.requestId;
            this.userContext = model.userContext;
            this.workloadAccessToken = model.workloadAccessToken;
            this.workloadIdentityArn = model.workloadIdentityArn;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserContext.
         */
        public Builder userContext(UserContext userContext) {
            this.userContext = userContext;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        /**
         * WorkloadIdentityArn.
         */
        public Builder workloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }

        public GetWorkloadAccessTokenForUserIdResponseBody build() {
            return new GetWorkloadAccessTokenForUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkloadAccessTokenForUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkloadAccessTokenForUserIdResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserContext(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserContext create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(UserContext model) {
                this.userId = model.userId;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserContext build() {
                return new UserContext(this);
            } 

        } 

    }
}
