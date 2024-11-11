// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private String customFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notify")
    private Notify notify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTeamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTeamId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTemplateBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTemplateBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessorUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > processorUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneContext")
    private SceneContext sceneContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.customFields = builder.customFields;
        this.notify = builder.notify;
        this.openTeamId = builder.openTeamId;
        this.openTemplateBizId = builder.openTemplateBizId;
        this.processorUserIds = builder.processorUserIds;
        this.scene = builder.scene;
        this.sceneContext = builder.sceneContext;
        this.tenantContext = builder.tenantContext;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
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
     * @return customFields
     */
    public String getCustomFields() {
        return this.customFields;
    }

    /**
     * @return notify
     */
    public Notify getNotify() {
        return this.notify;
    }

    /**
     * @return openTeamId
     */
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    /**
     * @return openTemplateBizId
     */
    public String getOpenTemplateBizId() {
        return this.openTemplateBizId;
    }

    /**
     * @return processorUserIds
     */
    public java.util.List < String > getProcessorUserIds() {
        return this.processorUserIds;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sceneContext
     */
    public SceneContext getSceneContext() {
        return this.sceneContext;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private AccountContext accountContext; 
        private String customFields; 
        private Notify notify; 
        private String openTeamId; 
        private String openTemplateBizId; 
        private java.util.List < String > processorUserIds; 
        private String scene; 
        private SceneContext sceneContext; 
        private TenantContext tenantContext; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.customFields = request.customFields;
            this.notify = request.notify;
            this.openTeamId = request.openTeamId;
            this.openTemplateBizId = request.openTemplateBizId;
            this.processorUserIds = request.processorUserIds;
            this.scene = request.scene;
            this.sceneContext = request.sceneContext;
            this.tenantContext = request.tenantContext;
            this.title = request.title;
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
         * CustomFields.
         */
        public Builder customFields(String customFields) {
            this.putBodyParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * Notify.
         */
        public Builder notify(Notify notify) {
            String notifyShrink = shrink(notify, "Notify", "json");
            this.putBodyParameter("Notify", notifyShrink);
            this.notify = notify;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>G3IOe205RLciE</p>
         */
        public Builder openTeamId(String openTeamId) {
            this.putBodyParameter("OpenTeamId", openTeamId);
            this.openTeamId = openTeamId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder openTemplateBizId(String openTemplateBizId) {
            this.putBodyParameter("OpenTemplateBizId", openTemplateBizId);
            this.openTemplateBizId = openTemplateBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder processorUserIds(java.util.List < String > processorUserIds) {
            String processorUserIdsShrink = shrink(processorUserIds, "ProcessorUserIds", "json");
            this.putBodyParameter("ProcessorUserIds", processorUserIdsShrink);
            this.processorUserIds = processorUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SG</p>
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * SceneContext.
         */
        public Builder sceneContext(SceneContext sceneContext) {
            String sceneContextShrink = shrink(sceneContext, "SceneContext", "json");
            this.putBodyParameter("SceneContext", sceneContextShrink);
            this.sceneContext = sceneContext;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Killer Ball Wo Mouichido</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
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
    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
     */
    public static class Notify extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupNoticeReceiverUserIds")
        private java.util.List < String > groupNoticeReceiverUserIds;

        @com.aliyun.core.annotation.NameInMap("NoticeAllGroupMember")
        private Boolean noticeAllGroupMember;

        @com.aliyun.core.annotation.NameInMap("WorkNoticeReceiverUserIds")
        private java.util.List < String > workNoticeReceiverUserIds;

        private Notify(Builder builder) {
            this.groupNoticeReceiverUserIds = builder.groupNoticeReceiverUserIds;
            this.noticeAllGroupMember = builder.noticeAllGroupMember;
            this.workNoticeReceiverUserIds = builder.workNoticeReceiverUserIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notify create() {
            return builder().build();
        }

        /**
         * @return groupNoticeReceiverUserIds
         */
        public java.util.List < String > getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        /**
         * @return noticeAllGroupMember
         */
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        /**
         * @return workNoticeReceiverUserIds
         */
        public java.util.List < String > getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

        public static final class Builder {
            private java.util.List < String > groupNoticeReceiverUserIds; 
            private Boolean noticeAllGroupMember; 
            private java.util.List < String > workNoticeReceiverUserIds; 

            /**
             * GroupNoticeReceiverUserIds.
             */
            public Builder groupNoticeReceiverUserIds(java.util.List < String > groupNoticeReceiverUserIds) {
                this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
                return this;
            }

            /**
             * NoticeAllGroupMember.
             */
            public Builder noticeAllGroupMember(Boolean noticeAllGroupMember) {
                this.noticeAllGroupMember = noticeAllGroupMember;
                return this;
            }

            /**
             * WorkNoticeReceiverUserIds.
             */
            public Builder workNoticeReceiverUserIds(java.util.List < String > workNoticeReceiverUserIds) {
                this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
                return this;
            }

            public Notify build() {
                return new Notify(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
     */
    public static class GroupMsgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Boolean anchor;

        @com.aliyun.core.annotation.NameInMap("OpenMsgId")
        private String openMsgId;

        private GroupMsgs(Builder builder) {
            this.anchor = builder.anchor;
            this.openMsgId = builder.openMsgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupMsgs create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Boolean getAnchor() {
            return this.anchor;
        }

        /**
         * @return openMsgId
         */
        public String getOpenMsgId() {
            return this.openMsgId;
        }

        public static final class Builder {
            private Boolean anchor; 
            private String openMsgId; 

            /**
             * Anchor.
             */
            public Builder anchor(Boolean anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * OpenMsgId.
             */
            public Builder openMsgId(String openMsgId) {
                this.openMsgId = openMsgId;
                return this;
            }

            public GroupMsgs build() {
                return new GroupMsgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
     */
    public static class SceneContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupMsgs")
        private java.util.List < GroupMsgs> groupMsgs;

        @com.aliyun.core.annotation.NameInMap("OpenConversationId")
        private String openConversationId;

        @com.aliyun.core.annotation.NameInMap("RelevantorUserIds")
        private java.util.List < String > relevantorUserIds;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private String topicId;

        private SceneContext(Builder builder) {
            this.groupMsgs = builder.groupMsgs;
            this.openConversationId = builder.openConversationId;
            this.relevantorUserIds = builder.relevantorUserIds;
            this.topicId = builder.topicId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneContext create() {
            return builder().build();
        }

        /**
         * @return groupMsgs
         */
        public java.util.List < GroupMsgs> getGroupMsgs() {
            return this.groupMsgs;
        }

        /**
         * @return openConversationId
         */
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        /**
         * @return relevantorUserIds
         */
        public java.util.List < String > getRelevantorUserIds() {
            return this.relevantorUserIds;
        }

        /**
         * @return topicId
         */
        public String getTopicId() {
            return this.topicId;
        }

        public static final class Builder {
            private java.util.List < GroupMsgs> groupMsgs; 
            private String openConversationId; 
            private java.util.List < String > relevantorUserIds; 
            private String topicId; 

            /**
             * GroupMsgs.
             */
            public Builder groupMsgs(java.util.List < GroupMsgs> groupMsgs) {
                this.groupMsgs = groupMsgs;
                return this;
            }

            /**
             * OpenConversationId.
             */
            public Builder openConversationId(String openConversationId) {
                this.openConversationId = openConversationId;
                return this;
            }

            /**
             * RelevantorUserIds.
             */
            public Builder relevantorUserIds(java.util.List < String > relevantorUserIds) {
                this.relevantorUserIds = relevantorUserIds;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(String topicId) {
                this.topicId = topicId;
                return this;
            }

            public SceneContext build() {
                return new SceneContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
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
