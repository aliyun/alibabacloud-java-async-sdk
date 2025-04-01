// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

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
 * {@link GetCallerIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallerIdentityResponseBody</p>
 */
public class GetCallerIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("IdentityType")
    private String identityType;

    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    private String principalId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    @com.aliyun.core.annotation.NameInMap("UserId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCallerIdentityResponseBody model) {
            this.accountId = model.accountId;
            this.arn = model.arn;
            this.identityType = model.identityType;
            this.principalId = model.principalId;
            this.requestId = model.requestId;
            this.roleId = model.roleId;
            this.userId = model.userId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * IdentityType.
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * PrincipalId.
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
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
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * UserId.
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
