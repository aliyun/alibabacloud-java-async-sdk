// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

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
    @NameInMap("IdentityType")
    private String identityType;

    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PrincipalId")
    private String principalId;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("Arn")
    private String arn;

    @NameInMap("RoleId")
    private String roleId;

    private GetCallerIdentityResponseBody(Builder builder) {
        this.identityType = builder.identityType;
        this.accountId = builder.accountId;
        this.requestId = builder.requestId;
        this.principalId = builder.principalId;
        this.userId = builder.userId;
        this.arn = builder.arn;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallerIdentityResponseBody create() {
        return builder().build();
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder {
        private String identityType; 
        private String accountId; 
        private String requestId; 
        private String principalId; 
        private String userId; 
        private String arn; 
        private String roleId; 

        /**
         * The ID type. Valid values:
         * <p>
         * 
         * -Account: Alibaba Cloud Account (primary Account).
         * -RAMUser:RAM user.
         * -AssumedRoleUser:RAM role.
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the caller belongs.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
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
         * The ID.
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            return this;
        }

        /**
         * The user ID. The details are as follows:
         * <p>
         * -If the caller is an Alibaba Cloud account, the Alibaba Cloud account ID is returned.
         * -If the caller is a RAM user, the RAM user ID is returned.
         * > This parameter is returned only when the current caller is an Alibaba Cloud account or a RAM user.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * The ARN of the current caller.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The ID of the RAM role.
         * <p>
         * 
         * > This parameter is returned only when the current caller is a RAM role.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public GetCallerIdentityResponseBody build() {
            return new GetCallerIdentityResponseBody(this);
        } 

    } 

}
