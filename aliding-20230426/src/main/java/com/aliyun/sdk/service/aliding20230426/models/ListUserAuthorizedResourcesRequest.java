// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link ListUserAuthorizedResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListUserAuthorizedResourcesRequest</p>
 */
public class ListUserAuthorizedResourcesRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PermissionCode")
    private String permissionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private ListUserAuthorizedResourcesRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.nextToken = builder.nextToken;
        this.permissionCode = builder.permissionCode;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAuthorizedResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return permissionCode
     */
    public String getPermissionCode() {
        return this.permissionCode;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListUserAuthorizedResourcesRequest, Builder> {
        private AccountContext accountContext; 
        private String nextToken; 
        private String permissionCode; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListUserAuthorizedResourcesRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.nextToken = request.nextToken;
            this.permissionCode = request.permissionCode;
            this.resourceType = request.resourceType;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PermissionCode.
         */
        public Builder permissionCode(String permissionCode) {
            this.putBodyParameter("PermissionCode", permissionCode);
            this.permissionCode = permissionCode;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListUserAuthorizedResourcesRequest build() {
            return new ListUserAuthorizedResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListUserAuthorizedResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListUserAuthorizedResourcesRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlidingSsoTicket")
        private String alidingSsoTicket;

        @com.aliyun.core.annotation.NameInMap("SsoTicket")
        private String ssoTicket;

        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.alidingSsoTicket = builder.alidingSsoTicket;
            this.ssoTicket = builder.ssoTicket;
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return alidingSsoTicket
         */
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        /**
         * @return ssoTicket
         */
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String alidingSsoTicket; 
            private String ssoTicket; 
            private String accountId; 

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.alidingSsoTicket = model.alidingSsoTicket;
                this.ssoTicket = model.ssoTicket;
                this.accountId = model.accountId;
            } 

            /**
             * AlidingSsoTicket.
             */
            public Builder alidingSsoTicket(String alidingSsoTicket) {
                this.alidingSsoTicket = alidingSsoTicket;
                return this;
            }

            /**
             * SsoTicket.
             */
            public Builder ssoTicket(String ssoTicket) {
                this.ssoTicket = ssoTicket;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
