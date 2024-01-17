// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteBatchTaskRequest</p>
 */
public class ExecuteBatchTaskRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Body
    @NameInMap("OutResult")
    @Validation(required = true)
    private String outResult;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("SystemToken")
    @Validation(required = true)
    private String systemToken;

    @Body
    @NameInMap("TaskInformationList")
    @Validation(required = true)
    private String taskInformationList;

    private ExecuteBatchTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.outResult = builder.outResult;
        this.remark = builder.remark;
        this.systemToken = builder.systemToken;
        this.taskInformationList = builder.taskInformationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteBatchTaskRequest create() {
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
     * @return outResult
     */
    public String getOutResult() {
        return this.outResult;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return taskInformationList
     */
    public String getTaskInformationList() {
        return this.taskInformationList;
    }

    public static final class Builder extends Request.Builder<ExecuteBatchTaskRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String outResult; 
        private String remark; 
        private String systemToken; 
        private String taskInformationList; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteBatchTaskRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.outResult = request.outResult;
            this.remark = request.remark;
            this.systemToken = request.systemToken;
            this.taskInformationList = request.taskInformationList;
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
         * OutResult.
         */
        public Builder outResult(String outResult) {
            this.putBodyParameter("OutResult", outResult);
            this.outResult = outResult;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
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
         * TaskInformationList.
         */
        public Builder taskInformationList(String taskInformationList) {
            this.putBodyParameter("TaskInformationList", taskInformationList);
            this.taskInformationList = taskInformationList;
            return this;
        }

        @Override
        public ExecuteBatchTaskRequest build() {
            return new ExecuteBatchTaskRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
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
