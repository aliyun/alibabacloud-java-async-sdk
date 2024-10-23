// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTodoTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateTodoTaskRequest</p>
 */
public class UpdateTodoTaskRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("done")
    private Boolean done;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dueTime")
    private Long dueTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executorIds")
    private java.util.List < String > executorIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("participantIds")
    private java.util.List < String > participantIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subject")
    private String subject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private UpdateTodoTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.description = builder.description;
        this.done = builder.done;
        this.dueTime = builder.dueTime;
        this.executorIds = builder.executorIds;
        this.participantIds = builder.participantIds;
        this.subject = builder.subject;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTodoTaskRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return done
     */
    public Boolean getDone() {
        return this.done;
    }

    /**
     * @return dueTime
     */
    public Long getDueTime() {
        return this.dueTime;
    }

    /**
     * @return executorIds
     */
    public java.util.List < String > getExecutorIds() {
        return this.executorIds;
    }

    /**
     * @return participantIds
     */
    public java.util.List < String > getParticipantIds() {
        return this.participantIds;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateTodoTaskRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String description; 
        private Boolean done; 
        private Long dueTime; 
        private java.util.List < String > executorIds; 
        private java.util.List < String > participantIds; 
        private String subject; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTodoTaskRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.description = request.description;
            this.done = request.done;
            this.dueTime = request.dueTime;
            this.executorIds = request.executorIds;
            this.participantIds = request.participantIds;
            this.subject = request.subject;
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * done.
         */
        public Builder done(Boolean done) {
            this.putBodyParameter("done", done);
            this.done = done;
            return this;
        }

        /**
         * dueTime.
         */
        public Builder dueTime(Long dueTime) {
            this.putBodyParameter("dueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * executorIds.
         */
        public Builder executorIds(java.util.List < String > executorIds) {
            String executorIdsShrink = shrink(executorIds, "executorIds", "json");
            this.putBodyParameter("executorIds", executorIdsShrink);
            this.executorIds = executorIds;
            return this;
        }

        /**
         * participantIds.
         */
        public Builder participantIds(java.util.List < String > participantIds) {
            String participantIdsShrink = shrink(participantIds, "participantIds", "json");
            this.putBodyParameter("participantIds", participantIdsShrink);
            this.participantIds = participantIds;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>taskId</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateTodoTaskRequest build() {
            return new UpdateTodoTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTodoTaskRequest</p>
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
     * {@link UpdateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTodoTaskRequest</p>
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
}
