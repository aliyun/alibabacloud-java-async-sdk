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
 * {@link CreateScenegroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScenegroupRequest</p>
 */
public class CreateScenegroupRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddFriendForbidden")
    private Long addFriendForbidden;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllMembersCanCreateCalendar")
    private Long allMembersCanCreateCalendar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllMembersCanCreateMcsConf")
    private Long allMembersCanCreateMcsConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatBannedType")
    private Long chatBannedType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupEmailDisabled")
    private Long groupEmailDisabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupLiveSwitch")
    private Long groupLiveSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ManagementType")
    private Long managementType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MembersToAdminChat")
    private Long membersToAdminChat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MentionAllAuthority")
    private Long mentionAllAuthority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlyAdminCanDing")
    private Long onlyAdminCanDing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlyAdminCanSetMsgTop")
    private Long onlyAdminCanSetMsgTop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Searchable")
    private Long searchable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowHistoryType")
    private Long showHistoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubadminIds")
    private String subadminIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private String userIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidationType")
    private Long validationType;

    private CreateScenegroupRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.addFriendForbidden = builder.addFriendForbidden;
        this.allMembersCanCreateCalendar = builder.allMembersCanCreateCalendar;
        this.allMembersCanCreateMcsConf = builder.allMembersCanCreateMcsConf;
        this.chatBannedType = builder.chatBannedType;
        this.groupEmailDisabled = builder.groupEmailDisabled;
        this.groupLiveSwitch = builder.groupLiveSwitch;
        this.icon = builder.icon;
        this.managementType = builder.managementType;
        this.membersToAdminChat = builder.membersToAdminChat;
        this.mentionAllAuthority = builder.mentionAllAuthority;
        this.onlyAdminCanDing = builder.onlyAdminCanDing;
        this.onlyAdminCanSetMsgTop = builder.onlyAdminCanSetMsgTop;
        this.searchable = builder.searchable;
        this.showHistoryType = builder.showHistoryType;
        this.subadminIds = builder.subadminIds;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.userIds = builder.userIds;
        this.uuid = builder.uuid;
        this.validationType = builder.validationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScenegroupRequest create() {
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
     * @return addFriendForbidden
     */
    public Long getAddFriendForbidden() {
        return this.addFriendForbidden;
    }

    /**
     * @return allMembersCanCreateCalendar
     */
    public Long getAllMembersCanCreateCalendar() {
        return this.allMembersCanCreateCalendar;
    }

    /**
     * @return allMembersCanCreateMcsConf
     */
    public Long getAllMembersCanCreateMcsConf() {
        return this.allMembersCanCreateMcsConf;
    }

    /**
     * @return chatBannedType
     */
    public Long getChatBannedType() {
        return this.chatBannedType;
    }

    /**
     * @return groupEmailDisabled
     */
    public Long getGroupEmailDisabled() {
        return this.groupEmailDisabled;
    }

    /**
     * @return groupLiveSwitch
     */
    public Long getGroupLiveSwitch() {
        return this.groupLiveSwitch;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return managementType
     */
    public Long getManagementType() {
        return this.managementType;
    }

    /**
     * @return membersToAdminChat
     */
    public Long getMembersToAdminChat() {
        return this.membersToAdminChat;
    }

    /**
     * @return mentionAllAuthority
     */
    public Long getMentionAllAuthority() {
        return this.mentionAllAuthority;
    }

    /**
     * @return onlyAdminCanDing
     */
    public Long getOnlyAdminCanDing() {
        return this.onlyAdminCanDing;
    }

    /**
     * @return onlyAdminCanSetMsgTop
     */
    public Long getOnlyAdminCanSetMsgTop() {
        return this.onlyAdminCanSetMsgTop;
    }

    /**
     * @return searchable
     */
    public Long getSearchable() {
        return this.searchable;
    }

    /**
     * @return showHistoryType
     */
    public Long getShowHistoryType() {
        return this.showHistoryType;
    }

    /**
     * @return subadminIds
     */
    public String getSubadminIds() {
        return this.subadminIds;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return validationType
     */
    public Long getValidationType() {
        return this.validationType;
    }

    public static final class Builder extends Request.Builder<CreateScenegroupRequest, Builder> {
        private AccountContext accountContext; 
        private Long addFriendForbidden; 
        private Long allMembersCanCreateCalendar; 
        private Long allMembersCanCreateMcsConf; 
        private Long chatBannedType; 
        private Long groupEmailDisabled; 
        private Long groupLiveSwitch; 
        private String icon; 
        private Long managementType; 
        private Long membersToAdminChat; 
        private Long mentionAllAuthority; 
        private Long onlyAdminCanDing; 
        private Long onlyAdminCanSetMsgTop; 
        private Long searchable; 
        private Long showHistoryType; 
        private String subadminIds; 
        private String templateId; 
        private String title; 
        private String userIds; 
        private String uuid; 
        private Long validationType; 

        private Builder() {
            super();
        } 

        private Builder(CreateScenegroupRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.addFriendForbidden = request.addFriendForbidden;
            this.allMembersCanCreateCalendar = request.allMembersCanCreateCalendar;
            this.allMembersCanCreateMcsConf = request.allMembersCanCreateMcsConf;
            this.chatBannedType = request.chatBannedType;
            this.groupEmailDisabled = request.groupEmailDisabled;
            this.groupLiveSwitch = request.groupLiveSwitch;
            this.icon = request.icon;
            this.managementType = request.managementType;
            this.membersToAdminChat = request.membersToAdminChat;
            this.mentionAllAuthority = request.mentionAllAuthority;
            this.onlyAdminCanDing = request.onlyAdminCanDing;
            this.onlyAdminCanSetMsgTop = request.onlyAdminCanSetMsgTop;
            this.searchable = request.searchable;
            this.showHistoryType = request.showHistoryType;
            this.subadminIds = request.subadminIds;
            this.templateId = request.templateId;
            this.title = request.title;
            this.userIds = request.userIds;
            this.uuid = request.uuid;
            this.validationType = request.validationType;
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
         * AddFriendForbidden.
         */
        public Builder addFriendForbidden(Long addFriendForbidden) {
            this.putBodyParameter("AddFriendForbidden", addFriendForbidden);
            this.addFriendForbidden = addFriendForbidden;
            return this;
        }

        /**
         * AllMembersCanCreateCalendar.
         */
        public Builder allMembersCanCreateCalendar(Long allMembersCanCreateCalendar) {
            this.putBodyParameter("AllMembersCanCreateCalendar", allMembersCanCreateCalendar);
            this.allMembersCanCreateCalendar = allMembersCanCreateCalendar;
            return this;
        }

        /**
         * AllMembersCanCreateMcsConf.
         */
        public Builder allMembersCanCreateMcsConf(Long allMembersCanCreateMcsConf) {
            this.putBodyParameter("AllMembersCanCreateMcsConf", allMembersCanCreateMcsConf);
            this.allMembersCanCreateMcsConf = allMembersCanCreateMcsConf;
            return this;
        }

        /**
         * ChatBannedType.
         */
        public Builder chatBannedType(Long chatBannedType) {
            this.putBodyParameter("ChatBannedType", chatBannedType);
            this.chatBannedType = chatBannedType;
            return this;
        }

        /**
         * GroupEmailDisabled.
         */
        public Builder groupEmailDisabled(Long groupEmailDisabled) {
            this.putBodyParameter("GroupEmailDisabled", groupEmailDisabled);
            this.groupEmailDisabled = groupEmailDisabled;
            return this;
        }

        /**
         * GroupLiveSwitch.
         */
        public Builder groupLiveSwitch(Long groupLiveSwitch) {
            this.putBodyParameter("GroupLiveSwitch", groupLiveSwitch);
            this.groupLiveSwitch = groupLiveSwitch;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.putBodyParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * ManagementType.
         */
        public Builder managementType(Long managementType) {
            this.putBodyParameter("ManagementType", managementType);
            this.managementType = managementType;
            return this;
        }

        /**
         * MembersToAdminChat.
         */
        public Builder membersToAdminChat(Long membersToAdminChat) {
            this.putBodyParameter("MembersToAdminChat", membersToAdminChat);
            this.membersToAdminChat = membersToAdminChat;
            return this;
        }

        /**
         * MentionAllAuthority.
         */
        public Builder mentionAllAuthority(Long mentionAllAuthority) {
            this.putBodyParameter("MentionAllAuthority", mentionAllAuthority);
            this.mentionAllAuthority = mentionAllAuthority;
            return this;
        }

        /**
         * OnlyAdminCanDing.
         */
        public Builder onlyAdminCanDing(Long onlyAdminCanDing) {
            this.putBodyParameter("OnlyAdminCanDing", onlyAdminCanDing);
            this.onlyAdminCanDing = onlyAdminCanDing;
            return this;
        }

        /**
         * OnlyAdminCanSetMsgTop.
         */
        public Builder onlyAdminCanSetMsgTop(Long onlyAdminCanSetMsgTop) {
            this.putBodyParameter("OnlyAdminCanSetMsgTop", onlyAdminCanSetMsgTop);
            this.onlyAdminCanSetMsgTop = onlyAdminCanSetMsgTop;
            return this;
        }

        /**
         * Searchable.
         */
        public Builder searchable(Long searchable) {
            this.putBodyParameter("Searchable", searchable);
            this.searchable = searchable;
            return this;
        }

        /**
         * ShowHistoryType.
         */
        public Builder showHistoryType(Long showHistoryType) {
            this.putBodyParameter("ShowHistoryType", showHistoryType);
            this.showHistoryType = showHistoryType;
            return this;
        }

        /**
         * SubadminIds.
         */
        public Builder subadminIds(String subadminIds) {
            this.putBodyParameter("SubadminIds", subadminIds);
            this.subadminIds = subadminIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c354***-<em><strong>-</strong></em>-b4ea-6f1ab***65</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试群</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(String userIds) {
            this.putBodyParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * ValidationType.
         */
        public Builder validationType(Long validationType) {
            this.putBodyParameter("ValidationType", validationType);
            this.validationType = validationType;
            return this;
        }

        @Override
        public CreateScenegroupRequest build() {
            return new CreateScenegroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScenegroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScenegroupRequest</p>
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
