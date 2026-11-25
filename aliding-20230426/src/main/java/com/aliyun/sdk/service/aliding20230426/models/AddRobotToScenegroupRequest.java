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
 * {@link AddRobotToScenegroupRequest} extends {@link RequestModel}
 *
 * <p>AddRobotToScenegroupRequest</p>
 */
public class AddRobotToScenegroupRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openConversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotCode;

    private AddRobotToScenegroupRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.openConversationId = builder.openConversationId;
        this.robotCode = builder.robotCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRobotToScenegroupRequest create() {
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
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    /**
     * @return robotCode
     */
    public String getRobotCode() {
        return this.robotCode;
    }

    public static final class Builder extends Request.Builder<AddRobotToScenegroupRequest, Builder> {
        private AccountContext accountContext; 
        private String openConversationId; 
        private String robotCode; 

        private Builder() {
            super();
        } 

        private Builder(AddRobotToScenegroupRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.openConversationId = request.openConversationId;
            this.robotCode = request.robotCode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cidt*****Xa4K10w==</p>
         */
        public Builder openConversationId(String openConversationId) {
            this.putBodyParameter("OpenConversationId", openConversationId);
            this.openConversationId = openConversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dingxxxxxxxxxxxx</p>
         */
        public Builder robotCode(String robotCode) {
            this.putBodyParameter("RobotCode", robotCode);
            this.robotCode = robotCode;
            return this;
        }

        @Override
        public AddRobotToScenegroupRequest build() {
            return new AddRobotToScenegroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddRobotToScenegroupRequest} extends {@link TeaModel}
     *
     * <p>AddRobotToScenegroupRequest</p>
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
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
