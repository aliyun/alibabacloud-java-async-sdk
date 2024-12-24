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
 * {@link ExecuteBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteBatchTaskRequest</p>
 */
public class ExecuteBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskInformationList")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_PBKTxxx</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disagree</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hexxxx</p>
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;taskId&quot;:&quot;2291xxx&quot;,&quot;formInstId&quot;:&quot;d84a79xxx&quot;}, {&quot;taskId&quot;:&quot;2291xxx&quot;,&quot;formInstId&quot;:&quot;f8035e2axxx&quot;}]</p>
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

    /**
     * 
     * {@link ExecuteBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>ExecuteBatchTaskRequest</p>
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
