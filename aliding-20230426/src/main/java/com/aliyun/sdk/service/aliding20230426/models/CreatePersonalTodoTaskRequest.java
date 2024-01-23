// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersonalTodoTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalTodoTaskRequest</p>
 */
public class CreatePersonalTodoTaskRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DueTime")
    private Long dueTime;

    @Body
    @NameInMap("ExecutorIds")
    @Validation(required = true)
    private java.util.List < String > executorIds;

    @Body
    @NameInMap("NotifyConfigs")
    private NotifyConfigs notifyConfigs;

    @Body
    @NameInMap("ParticipantIds")
    private java.util.List < String > participantIds;

    @Body
    @NameInMap("Subject")
    @Validation(required = true)
    private String subject;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private CreatePersonalTodoTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.description = builder.description;
        this.dueTime = builder.dueTime;
        this.executorIds = builder.executorIds;
        this.notifyConfigs = builder.notifyConfigs;
        this.participantIds = builder.participantIds;
        this.subject = builder.subject;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalTodoTaskRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return notifyConfigs
     */
    public NotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
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
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<CreatePersonalTodoTaskRequest, Builder> {
        private AccountContext accountContext; 
        private String description; 
        private Long dueTime; 
        private java.util.List < String > executorIds; 
        private NotifyConfigs notifyConfigs; 
        private java.util.List < String > participantIds; 
        private String subject; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalTodoTaskRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.description = request.description;
            this.dueTime = request.dueTime;
            this.executorIds = request.executorIds;
            this.notifyConfigs = request.notifyConfigs;
            this.participantIds = request.participantIds;
            this.subject = request.subject;
            this.tenantContext = request.tenantContext;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DueTime.
         */
        public Builder dueTime(Long dueTime) {
            this.putBodyParameter("DueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * ExecutorIds.
         */
        public Builder executorIds(java.util.List < String > executorIds) {
            String executorIdsShrink = shrink(executorIds, "ExecutorIds", "json");
            this.putBodyParameter("ExecutorIds", executorIdsShrink);
            this.executorIds = executorIds;
            return this;
        }

        /**
         * NotifyConfigs.
         */
        public Builder notifyConfigs(NotifyConfigs notifyConfigs) {
            String notifyConfigsShrink = shrink(notifyConfigs, "NotifyConfigs", "json");
            this.putBodyParameter("NotifyConfigs", notifyConfigsShrink);
            this.notifyConfigs = notifyConfigs;
            return this;
        }

        /**
         * ParticipantIds.
         */
        public Builder participantIds(java.util.List < String > participantIds) {
            String participantIdsShrink = shrink(participantIds, "ParticipantIds", "json");
            this.putBodyParameter("ParticipantIds", participantIdsShrink);
            this.participantIds = participantIds;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("Subject", subject);
            this.subject = subject;
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

        @Override
        public CreatePersonalTodoTaskRequest build() {
            return new CreatePersonalTodoTaskRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("userToken")
        private String userToken;

        private AccountContext(Builder builder) {
            this.userToken = builder.userToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return userToken
         */
        public String getUserToken() {
            return this.userToken;
        }

        public static final class Builder {
            private String userToken; 

            /**
             * userToken.
             */
            public Builder userToken(String userToken) {
                this.userToken = userToken;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    public static class NotifyConfigs extends TeaModel {
        @NameInMap("DingNotify")
        private String dingNotify;

        private NotifyConfigs(Builder builder) {
            this.dingNotify = builder.dingNotify;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyConfigs create() {
            return builder().build();
        }

        /**
         * @return dingNotify
         */
        public String getDingNotify() {
            return this.dingNotify;
        }

        public static final class Builder {
            private String dingNotify; 

            /**
             * DingNotify.
             */
            public Builder dingNotify(String dingNotify) {
                this.dingNotify = dingNotify;
                return this;
            }

            public NotifyConfigs build() {
                return new NotifyConfigs(this);
            } 

        } 

    }
    public static class TenantContext extends TeaModel {
        @NameInMap("tenantId")
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
