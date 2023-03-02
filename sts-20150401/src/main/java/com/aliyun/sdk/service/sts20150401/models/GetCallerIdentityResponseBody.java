// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallerIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallerIdentityResponseBody</p>
 */
public class GetCallerIdentityResponseBody extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("Arn")
    private String arn;

    @NameInMap("IdentityType")
    private String identityType;

    @NameInMap("PrincipalId")
    private String principalId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleId")
    private String roleId;

    @NameInMap("UserId")
    private String userId;

    private GetCallerIdentityResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.arn = builder.arn;
        this.identityType = builder.identityType;
        this.principalId = builder.principalId;
        this.requestId = builder.requestId;
        this.roleId = builder.roleId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallerIdentityResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String accountId; 
        private String arn; 
        private String identityType; 
        private String principalId; 
        private String requestId; 
        private String roleId; 
        private String userId; 

        /**
         * The ID of the Alibaba Cloud account to which the current requester belongs.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the current requester.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The type of the identity. Valid values:
         * <p>
         * 
         * - Account: an Alibaba Cloud account
         * - RamUser: a RAM user
         * - AssumedRoleUser: a RAM role
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * The ID of the principal.
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the RAM role.
         * <p>
         * 
         * > This parameter is returned only when the current requester uses a RAM role.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * The ID of the current requester.
         * <p>
         * 
         * - If the requester uses an Alibaba Cloud account to call the operation, the ID of the Alibaba Cloud account is returned.
         * - If the requester uses a RAM user to call the operation, the ID of the RAM user is returned.
         * 
         * > This parameter is returned only when the current requester uses an Alibaba Cloud account or a RAM user.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetCallerIdentityResponseBody build() {
            return new GetCallerIdentityResponseBody(this);
        } 

    } 

}
