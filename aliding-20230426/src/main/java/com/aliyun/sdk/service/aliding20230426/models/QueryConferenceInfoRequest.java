// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConferenceInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryConferenceInfoRequest</p>
 */
public class QueryConferenceInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceId;

    private QueryConferenceInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.conferenceId = builder.conferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConferenceInfoRequest create() {
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
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static final class Builder extends Request.Builder<QueryConferenceInfoRequest, Builder> {
        private AccountContext accountContext; 
        private String conferenceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryConferenceInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.conferenceId = request.conferenceId;
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
         * conferenceId.
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("conferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        @Override
        public QueryConferenceInfoRequest build() {
            return new QueryConferenceInfoRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
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
             * accountId.
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
