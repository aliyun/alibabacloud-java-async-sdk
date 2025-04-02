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
 * {@link GetProcessDefinitionRequest} extends {@link RequestModel}
 *
 * <p>GetProcessDefinitionRequest</p>
 */
public class GetProcessDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CorpId")
    private String corpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NameSpace")
    private String nameSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private String orderNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    private String systemToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemType")
    private String systemType;

    private GetProcessDefinitionRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.corpId = builder.corpId;
        this.groupId = builder.groupId;
        this.language = builder.language;
        this.nameSpace = builder.nameSpace;
        this.orderNumber = builder.orderNumber;
        this.processInstanceId = builder.processInstanceId;
        this.systemToken = builder.systemToken;
        this.systemType = builder.systemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProcessDefinitionRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    /**
     * @return orderNumber
     */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return systemType
     */
    public String getSystemType() {
        return this.systemType;
    }

    public static final class Builder extends Request.Builder<GetProcessDefinitionRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String corpId; 
        private String groupId; 
        private String language; 
        private String nameSpace; 
        private String orderNumber; 
        private String processInstanceId; 
        private String systemToken; 
        private String systemType; 

        private Builder() {
            super();
        } 

        private Builder(GetProcessDefinitionRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.corpId = request.corpId;
            this.groupId = request.groupId;
            this.language = request.language;
            this.nameSpace = request.nameSpace;
            this.orderNumber = request.orderNumber;
            this.processInstanceId = request.processInstanceId;
            this.systemToken = request.systemToken;
            this.systemType = request.systemType;
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
         * AppType.
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * NameSpace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putBodyParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * OrderNumber.
         */
        public Builder orderNumber(String orderNumber) {
            this.putBodyParameter("OrderNumber", orderNumber);
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * ProcessInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putBodyParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * SystemType.
         */
        public Builder systemType(String systemType) {
            this.putBodyParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        @Override
        public GetProcessDefinitionRequest build() {
            return new GetProcessDefinitionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetProcessDefinitionRequest} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionRequest</p>
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
