// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetPolicyUserScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyUserScopeResponseBody</p>
 */
public class GetPolicyUserScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserScope")
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
     * @return userScope
     */
    public UserScope getUserScope() {
        return this.userScope;
    }

    public static final class Builder {
        private String requestId; 
        private UserScope userScope; 

        private Builder() {
        } 

        private Builder(GetPolicyUserScopeResponseBody model) {
            this.requestId = model.requestId;
            this.userScope = model.userScope;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The users to whom the control policy applies.</p>
         */
        public Builder userScope(UserScope userScope) {
            this.userScope = userScope;
            return this;
        }

        public GetPolicyUserScopeResponseBody build() {
            return new GetPolicyUserScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyUserScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyUserScopeResponseBody</p>
     */
    public static class UserScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

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
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private String scopeType; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(UserScope model) {
                this.scopeType = model.scopeType;
                this.userGroupIds = model.userGroupIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The scope of users to whom the control policy applies.</p>
             * <ul>
             * <li><p>If <strong>All</strong> is returned for this parameter, the control policy applies to all users.</p>
             * </li>
             * <li><p>If no value is returned for this parameter, the control policy applies to the assets specified in the return values of UserGroupIds and UserIds.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The user groups to which the control policy applies.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>The users to whom the control policy applies.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public UserScope build() {
                return new UserScope(this);
            } 

        } 

    }
}
