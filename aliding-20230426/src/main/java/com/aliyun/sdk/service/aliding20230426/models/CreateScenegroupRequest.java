// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScenegroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScenegroupRequest</p>
 */
public class CreateScenegroupRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AddFriendForbidden")
    private Long addFriendForbidden;

    @Body
    @NameInMap("AllMembersCanCreateCalendar")
    private Long allMembersCanCreateCalendar;

    @Body
    @NameInMap("AllMembersCanCreateMcsConf")
    private Long allMembersCanCreateMcsConf;

    @Body
    @NameInMap("ChatBannedType")
    private Long chatBannedType;

    @Body
    @NameInMap("GroupEmailDisabled")
    private Long groupEmailDisabled;

    @Body
    @NameInMap("GroupLiveSwitch")
    private Long groupLiveSwitch;

    @Body
    @NameInMap("Icon")
    private String icon;

    @Body
    @NameInMap("ManagementType")
    private Long managementType;

    @Body
    @NameInMap("MembersToAdminChat")
    private Long membersToAdminChat;

    @Body
    @NameInMap("MentionAllAuthority")
    private Long mentionAllAuthority;

    @Body
    @NameInMap("OnlyAdminCanDing")
    private Long onlyAdminCanDing;

    @Body
    @NameInMap("OnlyAdminCanSetMsgTop")
    private Long onlyAdminCanSetMsgTop;

    @Body
    @NameInMap("Searchable")
    private Long searchable;

    @Body
    @NameInMap("ShowHistoryType")
    private Long showHistoryType;

    @Body
    @NameInMap("SubadminIds")
    private String subadminIds;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("UserIds")
    private String userIds;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    @Body
    @NameInMap("ValidationType")
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Title.
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
