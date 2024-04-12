// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyUserScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyUserScopeResponseBody</p>
 */
public class GetPolicyUserScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserScope")
    private UserScope userScope;

    private GetPolicyUserScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userScope = builder.userScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyUserScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userScope
     */
    public UserScope getUserScope() {
        return this.userScope;
    }

    public static final class Builder {
        private String requestId; 
        private UserScope userScope; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserScope.
         */
        public Builder userScope(UserScope userScope) {
            this.userScope = userScope;
            return this;
        }

        public GetPolicyUserScopeResponseBody build() {
            return new GetPolicyUserScopeResponseBody(this);
        } 

    } 

    public static class UserScope extends TeaModel {
        @NameInMap("ScopeType")
        private String scopeType;

        @NameInMap("UserGroupIds")
        private java.util.List < String > userGroupIds;

        @NameInMap("UserIds")
        private java.util.List < String > userIds;

        private UserScope(Builder builder) {
            this.scopeType = builder.scopeType;
            this.userGroupIds = builder.userGroupIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserScope create() {
            return builder().build();
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List < String > getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return userIds
         */
        public java.util.List < String > getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private String scopeType; 
            private java.util.List < String > userGroupIds; 
            private java.util.List < String > userIds; 

            /**
             * ScopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List < String > userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List < String > userIds) {
                this.userIds = userIds;
                return this;
            }

            public UserScope build() {
                return new UserScope(this);
            } 

        } 

    }
}
