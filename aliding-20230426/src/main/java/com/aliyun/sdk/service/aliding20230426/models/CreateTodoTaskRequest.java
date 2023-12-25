// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTodoTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTodoTaskRequest</p>
 */
public class CreateTodoTaskRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("contentFieldList")
    private java.util.List < ContentFieldList> contentFieldList;

    @Body
    @NameInMap("creatorId")
    private String creatorId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("detailUrl")
    private DetailUrl detailUrl;

    @Body
    @NameInMap("dueTime")
    private Long dueTime;

    @Body
    @NameInMap("executorIds")
    private java.util.List < String > executorIds;

    @Body
    @NameInMap("isOnlyShowExecutor")
    private Boolean isOnlyShowExecutor;

    @Body
    @NameInMap("notifyConfigs")
    private NotifyConfigs notifyConfigs;

    @Query
    @NameInMap("operatorId")
    private String operatorId;

    @Body
    @NameInMap("participantIds")
    private java.util.List < String > participantIds;

    @Body
    @NameInMap("priority")
    private Integer priority;

    @Body
    @NameInMap("sourceId")
    private String sourceId;

    @Body
    @NameInMap("subject")
    @Validation(required = true)
    private String subject;

    private CreateTodoTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.contentFieldList = builder.contentFieldList;
        this.creatorId = builder.creatorId;
        this.description = builder.description;
        this.detailUrl = builder.detailUrl;
        this.dueTime = builder.dueTime;
        this.executorIds = builder.executorIds;
        this.isOnlyShowExecutor = builder.isOnlyShowExecutor;
        this.notifyConfigs = builder.notifyConfigs;
        this.operatorId = builder.operatorId;
        this.participantIds = builder.participantIds;
        this.priority = builder.priority;
        this.sourceId = builder.sourceId;
        this.subject = builder.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTodoTaskRequest create() {
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
     * @return contentFieldList
     */
    public java.util.List < ContentFieldList> getContentFieldList() {
        return this.contentFieldList;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detailUrl
     */
    public DetailUrl getDetailUrl() {
        return this.detailUrl;
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
     * @return isOnlyShowExecutor
     */
    public Boolean getIsOnlyShowExecutor() {
        return this.isOnlyShowExecutor;
    }

    /**
     * @return notifyConfigs
     */
    public NotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return participantIds
     */
    public java.util.List < String > getParticipantIds() {
        return this.participantIds;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    public static final class Builder extends Request.Builder<CreateTodoTaskRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private java.util.List < ContentFieldList> contentFieldList; 
        private String creatorId; 
        private String description; 
        private DetailUrl detailUrl; 
        private Long dueTime; 
        private java.util.List < String > executorIds; 
        private Boolean isOnlyShowExecutor; 
        private NotifyConfigs notifyConfigs; 
        private String operatorId; 
        private java.util.List < String > participantIds; 
        private Integer priority; 
        private String sourceId; 
        private String subject; 

        private Builder() {
            super();
        } 

        private Builder(CreateTodoTaskRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.contentFieldList = request.contentFieldList;
            this.creatorId = request.creatorId;
            this.description = request.description;
            this.detailUrl = request.detailUrl;
            this.dueTime = request.dueTime;
            this.executorIds = request.executorIds;
            this.isOnlyShowExecutor = request.isOnlyShowExecutor;
            this.notifyConfigs = request.notifyConfigs;
            this.operatorId = request.operatorId;
            this.participantIds = request.participantIds;
            this.priority = request.priority;
            this.sourceId = request.sourceId;
            this.subject = request.subject;
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
         * contentFieldList.
         */
        public Builder contentFieldList(java.util.List < ContentFieldList> contentFieldList) {
            String contentFieldListShrink = shrink(contentFieldList, "contentFieldList", "json");
            this.putBodyParameter("contentFieldList", contentFieldListShrink);
            this.contentFieldList = contentFieldList;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("creatorId", creatorId);
            this.creatorId = creatorId;
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
         * detailUrl.
         */
        public Builder detailUrl(DetailUrl detailUrl) {
            String detailUrlShrink = shrink(detailUrl, "detailUrl", "json");
            this.putBodyParameter("detailUrl", detailUrlShrink);
            this.detailUrl = detailUrl;
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
         * isOnlyShowExecutor.
         */
        public Builder isOnlyShowExecutor(Boolean isOnlyShowExecutor) {
            this.putBodyParameter("isOnlyShowExecutor", isOnlyShowExecutor);
            this.isOnlyShowExecutor = isOnlyShowExecutor;
            return this;
        }

        /**
         * notifyConfigs.
         */
        public Builder notifyConfigs(NotifyConfigs notifyConfigs) {
            String notifyConfigsShrink = shrink(notifyConfigs, "notifyConfigs", "json");
            this.putBodyParameter("notifyConfigs", notifyConfigsShrink);
            this.notifyConfigs = notifyConfigs;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("operatorId", operatorId);
            this.operatorId = operatorId;
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
         * priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * sourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
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

        @Override
        public CreateTodoTaskRequest build() {
            return new CreateTodoTaskRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
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
    public static class ContentFieldList extends TeaModel {
        @NameInMap("fieldKey")
        private String fieldKey;

        @NameInMap("fieldValue")
        private String fieldValue;

        private ContentFieldList(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentFieldList create() {
            return builder().build();
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldKey; 
            private String fieldValue; 

            /**
             * fieldKey
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * fieldValue
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public ContentFieldList build() {
                return new ContentFieldList(this);
            } 

        } 

    }
    public static class DetailUrl extends TeaModel {
        @NameInMap("appUrl")
        private String appUrl;

        @NameInMap("pcUrl")
        private String pcUrl;

        private DetailUrl(Builder builder) {
            this.appUrl = builder.appUrl;
            this.pcUrl = builder.pcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailUrl create() {
            return builder().build();
        }

        /**
         * @return appUrl
         */
        public String getAppUrl() {
            return this.appUrl;
        }

        /**
         * @return pcUrl
         */
        public String getPcUrl() {
            return this.pcUrl;
        }

        public static final class Builder {
            private String appUrl; 
            private String pcUrl; 

            /**
             * appUrl.
             */
            public Builder appUrl(String appUrl) {
                this.appUrl = appUrl;
                return this;
            }

            /**
             * pcUrl.
             */
            public Builder pcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
                return this;
            }

            public DetailUrl build() {
                return new DetailUrl(this);
            } 

        } 

    }
    public static class NotifyConfigs extends TeaModel {
        @NameInMap("dingNotify")
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
             * dingNotify.
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
}
