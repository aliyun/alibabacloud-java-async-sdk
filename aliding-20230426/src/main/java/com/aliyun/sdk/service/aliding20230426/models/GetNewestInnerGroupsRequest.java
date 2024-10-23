// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNewestInnerGroupsRequest} extends {@link RequestModel}
 *
 * <p>GetNewestInnerGroupsRequest</p>
 */
public class GetNewestInnerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    private java.util.Map < String, ? > request;

    private GetNewestInnerGroupsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNewestInnerGroupsRequest create() {
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
     * @return request
     */
    public java.util.Map < String, ? > getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<GetNewestInnerGroupsRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.Map < String, ? > request; 

        private Builder() {
            super();
        } 

        private Builder(GetNewestInnerGroupsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.request = request.request;
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
         * Request.
         */
        public Builder request(java.util.Map < String, ? > request) {
            String requestShrink = shrink(request, "Request", "json");
            this.putBodyParameter("Request", requestShrink);
            this.request = request;
            return this;
        }

        @Override
        public GetNewestInnerGroupsRequest build() {
            return new GetNewestInnerGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetNewestInnerGroupsRequest} extends {@link TeaModel}
     *
     * <p>GetNewestInnerGroupsRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

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
