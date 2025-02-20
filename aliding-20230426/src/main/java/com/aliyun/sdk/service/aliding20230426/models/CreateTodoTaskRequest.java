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
 * {@link CreateTodoTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTodoTaskRequest</p>
 */
public class CreateTodoTaskRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("actionList")
    private java.util.List<ActionList> actionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentFieldList")
    private java.util.List<ContentFieldList> contentFieldList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("detailUrl")
    private DetailUrl detailUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dueTime")
    private Long dueTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executorIds")
    private java.util.List<String> executorIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isOnlyShowExecutor")
    private Boolean isOnlyShowExecutor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyConfigs")
    private NotifyConfigs notifyConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("participantIds")
    private java.util.List<String> participantIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    private CreateTodoTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.actionList = builder.actionList;
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
     * @return actionList
     */
    public java.util.List<ActionList> getActionList() {
        return this.actionList;
    }

    /**
     * @return contentFieldList
     */
    public java.util.List<ContentFieldList> getContentFieldList() {
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
    public java.util.List<String> getExecutorIds() {
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
    public java.util.List<String> getParticipantIds() {
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
        private java.util.List<ActionList> actionList; 
        private java.util.List<ContentFieldList> contentFieldList; 
        private String creatorId; 
        private String description; 
        private DetailUrl detailUrl; 
        private Long dueTime; 
        private java.util.List<String> executorIds; 
        private Boolean isOnlyShowExecutor; 
        private NotifyConfigs notifyConfigs; 
        private String operatorId; 
        private java.util.List<String> participantIds; 
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
            this.actionList = request.actionList;
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
         * actionList.
         */
        public Builder actionList(java.util.List<ActionList> actionList) {
            String actionListShrink = shrink(actionList, "actionList", "json");
            this.putBodyParameter("actionList", actionListShrink);
            this.actionList = actionList;
            return this;
        }

        /**
         * contentFieldList.
         */
        public Builder contentFieldList(java.util.List<ContentFieldList> contentFieldList) {
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
        public Builder executorIds(java.util.List<String> executorIds) {
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
        public Builder participantIds(java.util.List<String> participantIds) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>接入钉钉待办</p>
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

    /**
     * 
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
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
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
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
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("header")
        private java.util.Map<String, String> header;

        private Param(Builder builder) {
            this.body = builder.body;
            this.header = builder.header;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return header
         */
        public java.util.Map<String, String> getHeader() {
            return this.header;
        }

        public static final class Builder {
            private String body; 
            private java.util.Map<String, String> header; 

            /**
             * body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * header.
             */
            public Builder header(java.util.Map<String, String> header) {
                this.header = header;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
     */
    public static class ActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionKey")
        private String actionKey;

        @com.aliyun.core.annotation.NameInMap("actionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("buttonStyleType")
        private Integer buttonStyleType;

        @com.aliyun.core.annotation.NameInMap("param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("pcUrl")
        private String pcUrl;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ActionList(Builder builder) {
            this.actionKey = builder.actionKey;
            this.actionType = builder.actionType;
            this.buttonStyleType = builder.buttonStyleType;
            this.param = builder.param;
            this.pcUrl = builder.pcUrl;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return actionKey
         */
        public String getActionKey() {
            return this.actionKey;
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
        }

        /**
         * @return buttonStyleType
         */
        public Integer getButtonStyleType() {
            return this.buttonStyleType;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return pcUrl
         */
        public String getPcUrl() {
            return this.pcUrl;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String actionKey; 
            private Integer actionType; 
            private Integer buttonStyleType; 
            private Param param; 
            private String pcUrl; 
            private String title; 
            private String url; 

            /**
             * actionKey.
             */
            public Builder actionKey(String actionKey) {
                this.actionKey = actionKey;
                return this;
            }

            /**
             * actionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * buttonStyleType.
             */
            public Builder buttonStyleType(Integer buttonStyleType) {
                this.buttonStyleType = buttonStyleType;
                return this;
            }

            /**
             * param.
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * pcUrl.
             */
            public Builder pcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
     */
    public static class ContentFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldKey")
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
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
             * <p>fieldKey</p>
             * 
             * <strong>example:</strong>
             * <p>fieldKey</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>fieldValue</p>
             * 
             * <strong>example:</strong>
             * <p>fieldValue</p>
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
    /**
     * 
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
     */
    public static class DetailUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appUrl")
        private String appUrl;

        @com.aliyun.core.annotation.NameInMap("pcUrl")
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
    /**
     * 
     * {@link CreateTodoTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoTaskRequest</p>
     */
    public static class NotifyConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dingNotify")
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
