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
 * {@link CreateScheduleConferenceRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduleConferenceRequest</p>
 */
public class CreateScheduleConferenceRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleConfSettingModel")
    private ScheduleConfSettingModel scheduleConfSettingModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateScheduleConferenceRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.endTime = builder.endTime;
        this.scheduleConfSettingModel = builder.scheduleConfSettingModel;
        this.startTime = builder.startTime;
        this.tenantContext = builder.tenantContext;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduleConferenceRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return scheduleConfSettingModel
     */
    public ScheduleConfSettingModel getScheduleConfSettingModel() {
        return this.scheduleConfSettingModel;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
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

    public static final class Builder extends Request.Builder<CreateScheduleConferenceRequest, Builder> {
        private AccountContext accountContext; 
        private Long endTime; 
        private ScheduleConfSettingModel scheduleConfSettingModel; 
        private Long startTime; 
        private TenantContext tenantContext; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduleConferenceRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.endTime = request.endTime;
            this.scheduleConfSettingModel = request.scheduleConfSettingModel;
            this.startTime = request.startTime;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687928400000L</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687924800000L</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
         * <p>预约会议标题</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateScheduleConferenceRequest build() {
            return new CreateScheduleConferenceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
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
    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
     */
    public static class MoziConfOpenRecordSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsFollowHost")
        private Boolean isFollowHost;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RecordAutoStart")
        private Integer recordAutoStart;

        @com.aliyun.core.annotation.NameInMap("RecordAutoStartType")
        private Integer recordAutoStartType;

        private MoziConfOpenRecordSetting(Builder builder) {
            this.isFollowHost = builder.isFollowHost;
            this.mode = builder.mode;
            this.recordAutoStart = builder.recordAutoStart;
            this.recordAutoStartType = builder.recordAutoStartType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoziConfOpenRecordSetting create() {
            return builder().build();
        }

        /**
         * @return isFollowHost
         */
        public Boolean getIsFollowHost() {
            return this.isFollowHost;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return recordAutoStart
         */
        public Integer getRecordAutoStart() {
            return this.recordAutoStart;
        }

        /**
         * @return recordAutoStartType
         */
        public Integer getRecordAutoStartType() {
            return this.recordAutoStartType;
        }

        public static final class Builder {
            private Boolean isFollowHost; 
            private String mode; 
            private Integer recordAutoStart; 
            private Integer recordAutoStartType; 

            private Builder() {
            } 

            private Builder(MoziConfOpenRecordSetting model) {
                this.isFollowHost = model.isFollowHost;
                this.mode = model.mode;
                this.recordAutoStart = model.recordAutoStart;
                this.recordAutoStartType = model.recordAutoStartType;
            } 

            /**
             * IsFollowHost.
             */
            public Builder isFollowHost(Boolean isFollowHost) {
                this.isFollowHost = isFollowHost;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * RecordAutoStart.
             */
            public Builder recordAutoStart(Integer recordAutoStart) {
                this.recordAutoStart = recordAutoStart;
                return this;
            }

            /**
             * RecordAutoStartType.
             */
            public Builder recordAutoStartType(Integer recordAutoStartType) {
                this.recordAutoStartType = recordAutoStartType;
                return this;
            }

            public MoziConfOpenRecordSetting build() {
                return new MoziConfOpenRecordSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
     */
    public static class MoziConfExtensionAppSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoOpenMode")
        private Integer autoOpenMode;

        @com.aliyun.core.annotation.NameInMap("CoolAppCode")
        private String coolAppCode;

        @com.aliyun.core.annotation.NameInMap("ExtensionAppBizData")
        private String extensionAppBizData;

        private MoziConfExtensionAppSettings(Builder builder) {
            this.autoOpenMode = builder.autoOpenMode;
            this.coolAppCode = builder.coolAppCode;
            this.extensionAppBizData = builder.extensionAppBizData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoziConfExtensionAppSettings create() {
            return builder().build();
        }

        /**
         * @return autoOpenMode
         */
        public Integer getAutoOpenMode() {
            return this.autoOpenMode;
        }

        /**
         * @return coolAppCode
         */
        public String getCoolAppCode() {
            return this.coolAppCode;
        }

        /**
         * @return extensionAppBizData
         */
        public String getExtensionAppBizData() {
            return this.extensionAppBizData;
        }

        public static final class Builder {
            private Integer autoOpenMode; 
            private String coolAppCode; 
            private String extensionAppBizData; 

            private Builder() {
            } 

            private Builder(MoziConfExtensionAppSettings model) {
                this.autoOpenMode = model.autoOpenMode;
                this.coolAppCode = model.coolAppCode;
                this.extensionAppBizData = model.extensionAppBizData;
            } 

            /**
             * AutoOpenMode.
             */
            public Builder autoOpenMode(Integer autoOpenMode) {
                this.autoOpenMode = autoOpenMode;
                return this;
            }

            /**
             * CoolAppCode.
             */
            public Builder coolAppCode(String coolAppCode) {
                this.coolAppCode = coolAppCode;
                return this;
            }

            /**
             * ExtensionAppBizData.
             */
            public Builder extensionAppBizData(String extensionAppBizData) {
                this.extensionAppBizData = extensionAppBizData;
                return this;
            }

            public MoziConfExtensionAppSettings build() {
                return new MoziConfExtensionAppSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
     */
    public static class MoziConfVirtualExtraSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudRecordOwnerUserId")
        private String cloudRecordOwnerUserId;

        @com.aliyun.core.annotation.NameInMap("EnableChat")
        private Integer enableChat;

        @com.aliyun.core.annotation.NameInMap("EnableWebAnonymousJoin")
        private Boolean enableWebAnonymousJoin;

        @com.aliyun.core.annotation.NameInMap("JoinBeforeHost")
        private Integer joinBeforeHost;

        @com.aliyun.core.annotation.NameInMap("LockMediaStatusMicMute")
        private Integer lockMediaStatusMicMute;

        @com.aliyun.core.annotation.NameInMap("LockNick")
        private Integer lockNick;

        @com.aliyun.core.annotation.NameInMap("MinutesOwnerUserId")
        private String minutesOwnerUserId;

        @com.aliyun.core.annotation.NameInMap("MoziConfExtensionAppSettings")
        private java.util.List<MoziConfExtensionAppSettings> moziConfExtensionAppSettings;

        @com.aliyun.core.annotation.NameInMap("PushAllMeetingRecords")
        private Boolean pushAllMeetingRecords;

        @com.aliyun.core.annotation.NameInMap("PushCloudRecordCard")
        private Boolean pushCloudRecordCard;

        @com.aliyun.core.annotation.NameInMap("PushMinutesCard")
        private Boolean pushMinutesCard;

        @com.aliyun.core.annotation.NameInMap("WaitingRoom")
        private Integer waitingRoom;

        private MoziConfVirtualExtraSetting(Builder builder) {
            this.cloudRecordOwnerUserId = builder.cloudRecordOwnerUserId;
            this.enableChat = builder.enableChat;
            this.enableWebAnonymousJoin = builder.enableWebAnonymousJoin;
            this.joinBeforeHost = builder.joinBeforeHost;
            this.lockMediaStatusMicMute = builder.lockMediaStatusMicMute;
            this.lockNick = builder.lockNick;
            this.minutesOwnerUserId = builder.minutesOwnerUserId;
            this.moziConfExtensionAppSettings = builder.moziConfExtensionAppSettings;
            this.pushAllMeetingRecords = builder.pushAllMeetingRecords;
            this.pushCloudRecordCard = builder.pushCloudRecordCard;
            this.pushMinutesCard = builder.pushMinutesCard;
            this.waitingRoom = builder.waitingRoom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoziConfVirtualExtraSetting create() {
            return builder().build();
        }

        /**
         * @return cloudRecordOwnerUserId
         */
        public String getCloudRecordOwnerUserId() {
            return this.cloudRecordOwnerUserId;
        }

        /**
         * @return enableChat
         */
        public Integer getEnableChat() {
            return this.enableChat;
        }

        /**
         * @return enableWebAnonymousJoin
         */
        public Boolean getEnableWebAnonymousJoin() {
            return this.enableWebAnonymousJoin;
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
         * @return minutesOwnerUserId
         */
        public String getMinutesOwnerUserId() {
            return this.minutesOwnerUserId;
        }

        /**
         * @return moziConfExtensionAppSettings
         */
        public java.util.List<MoziConfExtensionAppSettings> getMoziConfExtensionAppSettings() {
            return this.moziConfExtensionAppSettings;
        }

        /**
         * @return pushAllMeetingRecords
         */
        public Boolean getPushAllMeetingRecords() {
            return this.pushAllMeetingRecords;
        }

        /**
         * @return pushCloudRecordCard
         */
        public Boolean getPushCloudRecordCard() {
            return this.pushCloudRecordCard;
        }

        /**
         * @return pushMinutesCard
         */
        public Boolean getPushMinutesCard() {
            return this.pushMinutesCard;
        }

        /**
         * @return waitingRoom
         */
        public Integer getWaitingRoom() {
            return this.waitingRoom;
        }

        public static final class Builder {
            private String cloudRecordOwnerUserId; 
            private Integer enableChat; 
            private Boolean enableWebAnonymousJoin; 
            private Integer joinBeforeHost; 
            private Integer lockMediaStatusMicMute; 
            private Integer lockNick; 
            private String minutesOwnerUserId; 
            private java.util.List<MoziConfExtensionAppSettings> moziConfExtensionAppSettings; 
            private Boolean pushAllMeetingRecords; 
            private Boolean pushCloudRecordCard; 
            private Boolean pushMinutesCard; 
            private Integer waitingRoom; 

            private Builder() {
            } 

            private Builder(MoziConfVirtualExtraSetting model) {
                this.cloudRecordOwnerUserId = model.cloudRecordOwnerUserId;
                this.enableChat = model.enableChat;
                this.enableWebAnonymousJoin = model.enableWebAnonymousJoin;
                this.joinBeforeHost = model.joinBeforeHost;
                this.lockMediaStatusMicMute = model.lockMediaStatusMicMute;
                this.lockNick = model.lockNick;
                this.minutesOwnerUserId = model.minutesOwnerUserId;
                this.moziConfExtensionAppSettings = model.moziConfExtensionAppSettings;
                this.pushAllMeetingRecords = model.pushAllMeetingRecords;
                this.pushCloudRecordCard = model.pushCloudRecordCard;
                this.pushMinutesCard = model.pushMinutesCard;
                this.waitingRoom = model.waitingRoom;
            } 

            /**
             * CloudRecordOwnerUserId.
             */
            public Builder cloudRecordOwnerUserId(String cloudRecordOwnerUserId) {
                this.cloudRecordOwnerUserId = cloudRecordOwnerUserId;
                return this;
            }

            /**
             * EnableChat.
             */
            public Builder enableChat(Integer enableChat) {
                this.enableChat = enableChat;
                return this;
            }

            /**
             * EnableWebAnonymousJoin.
             */
            public Builder enableWebAnonymousJoin(Boolean enableWebAnonymousJoin) {
                this.enableWebAnonymousJoin = enableWebAnonymousJoin;
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
             * MinutesOwnerUserId.
             */
            public Builder minutesOwnerUserId(String minutesOwnerUserId) {
                this.minutesOwnerUserId = minutesOwnerUserId;
                return this;
            }

            /**
             * MoziConfExtensionAppSettings.
             */
            public Builder moziConfExtensionAppSettings(java.util.List<MoziConfExtensionAppSettings> moziConfExtensionAppSettings) {
                this.moziConfExtensionAppSettings = moziConfExtensionAppSettings;
                return this;
            }

            /**
             * PushAllMeetingRecords.
             */
            public Builder pushAllMeetingRecords(Boolean pushAllMeetingRecords) {
                this.pushAllMeetingRecords = pushAllMeetingRecords;
                return this;
            }

            /**
             * PushCloudRecordCard.
             */
            public Builder pushCloudRecordCard(Boolean pushCloudRecordCard) {
                this.pushCloudRecordCard = pushCloudRecordCard;
                return this;
            }

            /**
             * PushMinutesCard.
             */
            public Builder pushMinutesCard(Boolean pushMinutesCard) {
                this.pushMinutesCard = pushMinutesCard;
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
    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
     */
    public static class ScheduleConfSettingModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CohostUserIds")
        private java.util.List<String> cohostUserIds;

        @com.aliyun.core.annotation.NameInMap("ConfAllowedCorpId")
        private String confAllowedCorpId;

        @com.aliyun.core.annotation.NameInMap("HostUserId")
        private String hostUserId;

        @com.aliyun.core.annotation.NameInMap("LockRoom")
        private Integer lockRoom;

        @com.aliyun.core.annotation.NameInMap("MoziConfOpenRecordSetting")
        private MoziConfOpenRecordSetting moziConfOpenRecordSetting;

        @com.aliyun.core.annotation.NameInMap("MoziConfVirtualExtraSetting")
        private MoziConfVirtualExtraSetting moziConfVirtualExtraSetting;

        @com.aliyun.core.annotation.NameInMap("MuteOnJoin")
        private Integer muteOnJoin;

        @com.aliyun.core.annotation.NameInMap("ScreenShareForbidden")
        private Integer screenShareForbidden;

        private ScheduleConfSettingModel(Builder builder) {
            this.cohostUserIds = builder.cohostUserIds;
            this.confAllowedCorpId = builder.confAllowedCorpId;
            this.hostUserId = builder.hostUserId;
            this.lockRoom = builder.lockRoom;
            this.moziConfOpenRecordSetting = builder.moziConfOpenRecordSetting;
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
        public java.util.List<String> getCohostUserIds() {
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
         * @return moziConfOpenRecordSetting
         */
        public MoziConfOpenRecordSetting getMoziConfOpenRecordSetting() {
            return this.moziConfOpenRecordSetting;
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
            private java.util.List<String> cohostUserIds; 
            private String confAllowedCorpId; 
            private String hostUserId; 
            private Integer lockRoom; 
            private MoziConfOpenRecordSetting moziConfOpenRecordSetting; 
            private MoziConfVirtualExtraSetting moziConfVirtualExtraSetting; 
            private Integer muteOnJoin; 
            private Integer screenShareForbidden; 

            private Builder() {
            } 

            private Builder(ScheduleConfSettingModel model) {
                this.cohostUserIds = model.cohostUserIds;
                this.confAllowedCorpId = model.confAllowedCorpId;
                this.hostUserId = model.hostUserId;
                this.lockRoom = model.lockRoom;
                this.moziConfOpenRecordSetting = model.moziConfOpenRecordSetting;
                this.moziConfVirtualExtraSetting = model.moziConfVirtualExtraSetting;
                this.muteOnJoin = model.muteOnJoin;
                this.screenShareForbidden = model.screenShareForbidden;
            } 

            /**
             * CohostUserIds.
             */
            public Builder cohostUserIds(java.util.List<String> cohostUserIds) {
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
             * MoziConfOpenRecordSetting.
             */
            public Builder moziConfOpenRecordSetting(MoziConfOpenRecordSetting moziConfOpenRecordSetting) {
                this.moziConfOpenRecordSetting = moziConfOpenRecordSetting;
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
    /**
     * 
     * {@link CreateScheduleConferenceRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleConferenceRequest</p>
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

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

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
