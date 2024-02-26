// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScheduleConfSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduleConfSettingsRequest</p>
 */
public class UpdateScheduleConfSettingsRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("ScheduleConfSettingModel")
    private ScheduleConfSettingModel scheduleConfSettingModel;

    @Body
    @NameInMap("ScheduleConferenceId")
    private String scheduleConferenceId;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private UpdateScheduleConfSettingsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.scheduleConfSettingModel = builder.scheduleConfSettingModel;
        this.scheduleConferenceId = builder.scheduleConferenceId;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduleConfSettingsRequest create() {
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
     * @return scheduleConfSettingModel
     */
    public ScheduleConfSettingModel getScheduleConfSettingModel() {
        return this.scheduleConfSettingModel;
    }

    /**
     * @return scheduleConferenceId
     */
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<UpdateScheduleConfSettingsRequest, Builder> {
        private AccountContext accountContext; 
        private ScheduleConfSettingModel scheduleConfSettingModel; 
        private String scheduleConferenceId; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduleConfSettingsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.scheduleConfSettingModel = request.scheduleConfSettingModel;
            this.scheduleConferenceId = request.scheduleConferenceId;
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
         * ScheduleConfSettingModel.
         */
        public Builder scheduleConfSettingModel(ScheduleConfSettingModel scheduleConfSettingModel) {
            String scheduleConfSettingModelShrink = shrink(scheduleConfSettingModel, "ScheduleConfSettingModel", "json");
            this.putBodyParameter("ScheduleConfSettingModel", scheduleConfSettingModelShrink);
            this.scheduleConfSettingModel = scheduleConfSettingModel;
            return this;
        }

        /**
         * ScheduleConferenceId.
         */
        public Builder scheduleConferenceId(String scheduleConferenceId) {
            this.putBodyParameter("ScheduleConferenceId", scheduleConferenceId);
            this.scheduleConferenceId = scheduleConferenceId;
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
        public UpdateScheduleConfSettingsRequest build() {
            return new UpdateScheduleConfSettingsRequest(this);
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
    public static class MoziConfVirtualExtraSetting extends TeaModel {
        @NameInMap("EnableChat")
        private Integer enableChat;

        @NameInMap("JoinBeforeHost")
        private Integer joinBeforeHost;

        @NameInMap("LockMediaStatusMicMute")
        private Integer lockMediaStatusMicMute;

        @NameInMap("LockNick")
        private Integer lockNick;

        @NameInMap("WaitingRoom")
        private Integer waitingRoom;

        private MoziConfVirtualExtraSetting(Builder builder) {
            this.enableChat = builder.enableChat;
            this.joinBeforeHost = builder.joinBeforeHost;
            this.lockMediaStatusMicMute = builder.lockMediaStatusMicMute;
            this.lockNick = builder.lockNick;
            this.waitingRoom = builder.waitingRoom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoziConfVirtualExtraSetting create() {
            return builder().build();
        }

        /**
         * @return enableChat
         */
        public Integer getEnableChat() {
            return this.enableChat;
        }

        /**
         * @return joinBeforeHost
         */
        public Integer getJoinBeforeHost() {
            return this.joinBeforeHost;
        }

        /**
         * @return lockMediaStatusMicMute
         */
        public Integer getLockMediaStatusMicMute() {
            return this.lockMediaStatusMicMute;
        }

        /**
         * @return lockNick
         */
        public Integer getLockNick() {
            return this.lockNick;
        }

        /**
         * @return waitingRoom
         */
        public Integer getWaitingRoom() {
            return this.waitingRoom;
        }

        public static final class Builder {
            private Integer enableChat; 
            private Integer joinBeforeHost; 
            private Integer lockMediaStatusMicMute; 
            private Integer lockNick; 
            private Integer waitingRoom; 

            /**
             * EnableChat.
             */
            public Builder enableChat(Integer enableChat) {
                this.enableChat = enableChat;
                return this;
            }

            /**
             * JoinBeforeHost.
             */
            public Builder joinBeforeHost(Integer joinBeforeHost) {
                this.joinBeforeHost = joinBeforeHost;
                return this;
            }

            /**
             * LockMediaStatusMicMute.
             */
            public Builder lockMediaStatusMicMute(Integer lockMediaStatusMicMute) {
                this.lockMediaStatusMicMute = lockMediaStatusMicMute;
                return this;
            }

            /**
             * LockNick.
             */
            public Builder lockNick(Integer lockNick) {
                this.lockNick = lockNick;
                return this;
            }

            /**
             * WaitingRoom.
             */
            public Builder waitingRoom(Integer waitingRoom) {
                this.waitingRoom = waitingRoom;
                return this;
            }

            public MoziConfVirtualExtraSetting build() {
                return new MoziConfVirtualExtraSetting(this);
            } 

        } 

    }
    public static class ScheduleConfSettingModel extends TeaModel {
        @NameInMap("CohostUserIds")
        private java.util.List < String > cohostUserIds;

        @NameInMap("ConfAllowedCorpId")
        private String confAllowedCorpId;

        @NameInMap("HostUserId")
        private String hostUserId;

        @NameInMap("LockRoom")
        private Integer lockRoom;

        @NameInMap("MoziConfVirtualExtraSetting")
        private MoziConfVirtualExtraSetting moziConfVirtualExtraSetting;

        @NameInMap("MuteOnJoin")
        private Integer muteOnJoin;

        @NameInMap("ScreenShareForbidden")
        private Integer screenShareForbidden;

        private ScheduleConfSettingModel(Builder builder) {
            this.cohostUserIds = builder.cohostUserIds;
            this.confAllowedCorpId = builder.confAllowedCorpId;
            this.hostUserId = builder.hostUserId;
            this.lockRoom = builder.lockRoom;
            this.moziConfVirtualExtraSetting = builder.moziConfVirtualExtraSetting;
            this.muteOnJoin = builder.muteOnJoin;
            this.screenShareForbidden = builder.screenShareForbidden;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfSettingModel create() {
            return builder().build();
        }

        /**
         * @return cohostUserIds
         */
        public java.util.List < String > getCohostUserIds() {
            return this.cohostUserIds;
        }

        /**
         * @return confAllowedCorpId
         */
        public String getConfAllowedCorpId() {
            return this.confAllowedCorpId;
        }

        /**
         * @return hostUserId
         */
        public String getHostUserId() {
            return this.hostUserId;
        }

        /**
         * @return lockRoom
         */
        public Integer getLockRoom() {
            return this.lockRoom;
        }

        /**
         * @return moziConfVirtualExtraSetting
         */
        public MoziConfVirtualExtraSetting getMoziConfVirtualExtraSetting() {
            return this.moziConfVirtualExtraSetting;
        }

        /**
         * @return muteOnJoin
         */
        public Integer getMuteOnJoin() {
            return this.muteOnJoin;
        }

        /**
         * @return screenShareForbidden
         */
        public Integer getScreenShareForbidden() {
            return this.screenShareForbidden;
        }

        public static final class Builder {
            private java.util.List < String > cohostUserIds; 
            private String confAllowedCorpId; 
            private String hostUserId; 
            private Integer lockRoom; 
            private MoziConfVirtualExtraSetting moziConfVirtualExtraSetting; 
            private Integer muteOnJoin; 
            private Integer screenShareForbidden; 

            /**
             * CohostUserIds.
             */
            public Builder cohostUserIds(java.util.List < String > cohostUserIds) {
                this.cohostUserIds = cohostUserIds;
                return this;
            }

            /**
             * ConfAllowedCorpId.
             */
            public Builder confAllowedCorpId(String confAllowedCorpId) {
                this.confAllowedCorpId = confAllowedCorpId;
                return this;
            }

            /**
             * HostUserId.
             */
            public Builder hostUserId(String hostUserId) {
                this.hostUserId = hostUserId;
                return this;
            }

            /**
             * LockRoom.
             */
            public Builder lockRoom(Integer lockRoom) {
                this.lockRoom = lockRoom;
                return this;
            }

            /**
             * MoziConfVirtualExtraSetting.
             */
            public Builder moziConfVirtualExtraSetting(MoziConfVirtualExtraSetting moziConfVirtualExtraSetting) {
                this.moziConfVirtualExtraSetting = moziConfVirtualExtraSetting;
                return this;
            }

            /**
             * MuteOnJoin.
             */
            public Builder muteOnJoin(Integer muteOnJoin) {
                this.muteOnJoin = muteOnJoin;
                return this;
            }

            /**
             * ScreenShareForbidden.
             */
            public Builder screenShareForbidden(Integer screenShareForbidden) {
                this.screenShareForbidden = screenShareForbidden;
                return this;
            }

            public ScheduleConfSettingModel build() {
                return new ScheduleConfSettingModel(this);
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
