// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTodoTaskExecutorStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateTodoTaskExecutorStatusRequest</p>
 */
public class UpdateTodoTaskExecutorStatusRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executorStatusList")
    private java.util.List < ExecutorStatusList> executorStatusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private UpdateTodoTaskExecutorStatusRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.executorStatusList = builder.executorStatusList;
        this.operatorId = builder.operatorId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTodoTaskExecutorStatusRequest create() {
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
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return executorStatusList
     */
    public java.util.List < ExecutorStatusList> getExecutorStatusList() {
        return this.executorStatusList;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateTodoTaskExecutorStatusRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private java.util.List < ExecutorStatusList> executorStatusList; 
        private String operatorId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTodoTaskExecutorStatusRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.executorStatusList = request.executorStatusList;
            this.operatorId = request.operatorId;
            this.taskId = request.taskId;
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
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * executorStatusList.
         */
        public Builder executorStatusList(java.util.List < ExecutorStatusList> executorStatusList) {
            String executorStatusListShrink = shrink(executorStatusList, "executorStatusList", "json");
            this.putBodyParameter("executorStatusList", executorStatusListShrink);
            this.executorStatusList = executorStatusList;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(String operatorId) {
            this.putBodyParameter("operatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15002141</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateTodoTaskExecutorStatusRequest build() {
            return new UpdateTodoTaskExecutorStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTodoTaskExecutorStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateTodoTaskExecutorStatusRequest</p>
     */
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
    /**
     * 
     * {@link UpdateTodoTaskExecutorStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateTodoTaskExecutorStatusRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTodoTaskExecutorStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateTodoTaskExecutorStatusRequest</p>
     */
    public static class ExecutorStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isDone")
        private Boolean isDone;

        private ExecutorStatusList(Builder builder) {
            this.id = builder.id;
            this.isDone = builder.isDone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorStatusList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
        }

        public static final class Builder {
            private String id; 
            private Boolean isDone; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * isDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
                return this;
            }

            public ExecutorStatusList build() {
                return new ExecutorStatusList(this);
            } 

        } 

    }
}
