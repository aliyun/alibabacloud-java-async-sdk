// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MassPushRequest} extends {@link RequestModel}
 *
 * <p>MassPushRequest</p>
 */
public class MassPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushTask")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PushTask> pushTask;

    private MassPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.pushTask = builder.pushTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MassPushRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return pushTask
     */
    public java.util.List < PushTask> getPushTask() {
        return this.pushTask;
    }

    public static final class Builder extends Request.Builder<MassPushRequest, Builder> {
        private Long appKey; 
        private java.util.List < PushTask> pushTask; 

        private Builder() {
            super();
        } 

        private Builder(MassPushRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.pushTask = request.pushTask;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pushTask(java.util.List < PushTask> pushTask) {
            this.putBodyParameter("PushTask", pushTask);
            this.pushTask = pushTask;
            return this;
        }

        @Override
        public MassPushRequest build() {
            return new MassPushRequest(this);
        } 

    } 

    /**
     * 
     * {@link MassPushRequest} extends {@link TeaModel}
     *
     * <p>MassPushRequest</p>
     */
    public static class PushTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidActivity")
        private String androidActivity;

        @com.aliyun.core.annotation.NameInMap("AndroidBadgeAddNum")
        private Integer androidBadgeAddNum;

        @com.aliyun.core.annotation.NameInMap("AndroidBadgeClass")
        private String androidBadgeClass;

        @com.aliyun.core.annotation.NameInMap("AndroidBadgeSetNum")
        private Integer androidBadgeSetNum;

        @com.aliyun.core.annotation.NameInMap("AndroidBigBody")
        private String androidBigBody;

        @com.aliyun.core.annotation.NameInMap("AndroidBigPictureUrl")
        private String androidBigPictureUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidBigTitle")
        private String androidBigTitle;

        @com.aliyun.core.annotation.NameInMap("AndroidExtParameters")
        private String androidExtParameters;

        @com.aliyun.core.annotation.NameInMap("AndroidHonorTargetUserType")
        private Integer androidHonorTargetUserType;

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiReceiptId")
        private String androidHuaweiReceiptId;

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiTargetUserType")
        private Integer androidHuaweiTargetUserType;

        @com.aliyun.core.annotation.NameInMap("AndroidImageUrl")
        private String androidImageUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidInboxBody")
        private String androidInboxBody;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiCategory")
        private String androidMessageHuaweiCategory;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiUrgency")
        private String androidMessageHuaweiUrgency;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageVivoCategory")
        private String androidMessageVivoCategory;

        @com.aliyun.core.annotation.NameInMap("AndroidMusic")
        private String androidMusic;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationBarPriority")
        private Integer androidNotificationBarPriority;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationBarType")
        private Integer androidNotificationBarType;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationChannel")
        private String androidNotificationChannel;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationGroup")
        private String androidNotificationGroup;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationHonorChannel")
        private String androidNotificationHonorChannel;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationHuaweiChannel")
        private String androidNotificationHuaweiChannel;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationNotifyId")
        private Integer androidNotificationNotifyId;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationThreadId")
        private String androidNotificationThreadId;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationVivoChannel")
        private String androidNotificationVivoChannel;

        @com.aliyun.core.annotation.NameInMap("AndroidNotificationXiaomiChannel")
        private String androidNotificationXiaomiChannel;

        @com.aliyun.core.annotation.NameInMap("AndroidNotifyType")
        private String androidNotifyType;

        @com.aliyun.core.annotation.NameInMap("AndroidOpenType")
        private String androidOpenType;

        @com.aliyun.core.annotation.NameInMap("AndroidOpenUrl")
        private String androidOpenUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidPopupActivity")
        private String androidPopupActivity;

        @com.aliyun.core.annotation.NameInMap("AndroidPopupBody")
        private String androidPopupBody;

        @com.aliyun.core.annotation.NameInMap("AndroidPopupTitle")
        private String androidPopupTitle;

        @com.aliyun.core.annotation.NameInMap("AndroidRemind")
        private Boolean androidRemind;

        @com.aliyun.core.annotation.NameInMap("AndroidRenderStyle")
        private String androidRenderStyle;

        @com.aliyun.core.annotation.NameInMap("AndroidTargetUserType")
        private Integer androidTargetUserType;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoPushMode")
        private Integer androidVivoPushMode;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoReceiptId")
        private String androidVivoReceiptId;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiActivity")
        @Deprecated
        private String androidXiaoMiActivity;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiNotifyBody")
        @Deprecated
        private String androidXiaoMiNotifyBody;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiNotifyTitle")
        @Deprecated
        private String androidXiaoMiNotifyTitle;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiBigPictureUrl")
        private String androidXiaomiBigPictureUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiImageUrl")
        private String androidXiaomiImageUrl;

        @com.aliyun.core.annotation.NameInMap("Body")
        @com.aliyun.core.annotation.Validation(required = true)
        private String body;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("HarmonyAction")
        private String harmonyAction;

        @com.aliyun.core.annotation.NameInMap("HarmonyActionType")
        private String harmonyActionType;

        @com.aliyun.core.annotation.NameInMap("HarmonyBadgeAddNum")
        private Integer harmonyBadgeAddNum;

        @com.aliyun.core.annotation.NameInMap("HarmonyBadgeSetNum")
        private Integer harmonyBadgeSetNum;

        @com.aliyun.core.annotation.NameInMap("HarmonyCategory")
        private String harmonyCategory;

        @com.aliyun.core.annotation.NameInMap("HarmonyExtParameters")
        private String harmonyExtParameters;

        @com.aliyun.core.annotation.NameInMap("HarmonyExtensionExtraData")
        private String harmonyExtensionExtraData;

        @com.aliyun.core.annotation.NameInMap("HarmonyExtensionPush")
        private Boolean harmonyExtensionPush;

        @com.aliyun.core.annotation.NameInMap("HarmonyImageUrl")
        private String harmonyImageUrl;

        @com.aliyun.core.annotation.NameInMap("HarmonyInboxContent")
        private String harmonyInboxContent;

        @com.aliyun.core.annotation.NameInMap("HarmonyNotificationSlotType")
        private String harmonyNotificationSlotType;

        @com.aliyun.core.annotation.NameInMap("HarmonyNotifyId")
        private Integer harmonyNotifyId;

        @com.aliyun.core.annotation.NameInMap("HarmonyReceiptId")
        private String harmonyReceiptId;

        @com.aliyun.core.annotation.NameInMap("HarmonyRemind")
        private Boolean harmonyRemind;

        @com.aliyun.core.annotation.NameInMap("HarmonyRemindBody")
        private String harmonyRemindBody;

        @com.aliyun.core.annotation.NameInMap("HarmonyRemindTitle")
        private String harmonyRemindTitle;

        @com.aliyun.core.annotation.NameInMap("HarmonyRenderStyle")
        private String harmonyRenderStyle;

        @com.aliyun.core.annotation.NameInMap("HarmonyTestMessage")
        private Boolean harmonyTestMessage;

        @com.aliyun.core.annotation.NameInMap("HarmonyUri")
        private String harmonyUri;

        @com.aliyun.core.annotation.NameInMap("JobKey")
        private String jobKey;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("PushType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pushType;

        @com.aliyun.core.annotation.NameInMap("SendChannels")
        private String sendChannels;

        @com.aliyun.core.annotation.NameInMap("SendSpeed")
        @Deprecated
        private Integer sendSpeed;

        @com.aliyun.core.annotation.NameInMap("StoreOffline")
        private Boolean storeOffline;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetValue;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Trim")
        private Boolean trim;

        @com.aliyun.core.annotation.NameInMap("iOSApnsEnv")
        private String iOSApnsEnv;

        @com.aliyun.core.annotation.NameInMap("iOSBadge")
        private Integer iOSBadge;

        @com.aliyun.core.annotation.NameInMap("iOSBadgeAutoIncrement")
        private Boolean iOSBadgeAutoIncrement;

        @com.aliyun.core.annotation.NameInMap("iOSExtParameters")
        private String iOSExtParameters;

        @com.aliyun.core.annotation.NameInMap("iOSInterruptionLevel")
        private String iOSInterruptionLevel;

        @com.aliyun.core.annotation.NameInMap("iOSMusic")
        private String iOSMusic;

        @com.aliyun.core.annotation.NameInMap("iOSMutableContent")
        private Boolean iOSMutableContent;

        @com.aliyun.core.annotation.NameInMap("iOSNotificationCategory")
        private String iOSNotificationCategory;

        @com.aliyun.core.annotation.NameInMap("iOSNotificationCollapseId")
        private String iOSNotificationCollapseId;

        @com.aliyun.core.annotation.NameInMap("iOSNotificationThreadId")
        private String iOSNotificationThreadId;

        @com.aliyun.core.annotation.NameInMap("iOSRelevanceScore")
        private Double iOSRelevanceScore;

        @com.aliyun.core.annotation.NameInMap("iOSRemind")
        private Boolean iOSRemind;

        @com.aliyun.core.annotation.NameInMap("iOSRemindBody")
        private String iOSRemindBody;

        @com.aliyun.core.annotation.NameInMap("iOSSilentNotification")
        private Boolean iOSSilentNotification;

        @com.aliyun.core.annotation.NameInMap("iOSSubtitle")
        private String iOSSubtitle;

        private PushTask(Builder builder) {
            this.androidActivity = builder.androidActivity;
            this.androidBadgeAddNum = builder.androidBadgeAddNum;
            this.androidBadgeClass = builder.androidBadgeClass;
            this.androidBadgeSetNum = builder.androidBadgeSetNum;
            this.androidBigBody = builder.androidBigBody;
            this.androidBigPictureUrl = builder.androidBigPictureUrl;
            this.androidBigTitle = builder.androidBigTitle;
            this.androidExtParameters = builder.androidExtParameters;
            this.androidHonorTargetUserType = builder.androidHonorTargetUserType;
            this.androidHuaweiReceiptId = builder.androidHuaweiReceiptId;
            this.androidHuaweiTargetUserType = builder.androidHuaweiTargetUserType;
            this.androidImageUrl = builder.androidImageUrl;
            this.androidInboxBody = builder.androidInboxBody;
            this.androidMessageHuaweiCategory = builder.androidMessageHuaweiCategory;
            this.androidMessageHuaweiUrgency = builder.androidMessageHuaweiUrgency;
            this.androidMessageVivoCategory = builder.androidMessageVivoCategory;
            this.androidMusic = builder.androidMusic;
            this.androidNotificationBarPriority = builder.androidNotificationBarPriority;
            this.androidNotificationBarType = builder.androidNotificationBarType;
            this.androidNotificationChannel = builder.androidNotificationChannel;
            this.androidNotificationGroup = builder.androidNotificationGroup;
            this.androidNotificationHonorChannel = builder.androidNotificationHonorChannel;
            this.androidNotificationHuaweiChannel = builder.androidNotificationHuaweiChannel;
            this.androidNotificationNotifyId = builder.androidNotificationNotifyId;
            this.androidNotificationThreadId = builder.androidNotificationThreadId;
            this.androidNotificationVivoChannel = builder.androidNotificationVivoChannel;
            this.androidNotificationXiaomiChannel = builder.androidNotificationXiaomiChannel;
            this.androidNotifyType = builder.androidNotifyType;
            this.androidOpenType = builder.androidOpenType;
            this.androidOpenUrl = builder.androidOpenUrl;
            this.androidPopupActivity = builder.androidPopupActivity;
            this.androidPopupBody = builder.androidPopupBody;
            this.androidPopupTitle = builder.androidPopupTitle;
            this.androidRemind = builder.androidRemind;
            this.androidRenderStyle = builder.androidRenderStyle;
            this.androidTargetUserType = builder.androidTargetUserType;
            this.androidVivoPushMode = builder.androidVivoPushMode;
            this.androidVivoReceiptId = builder.androidVivoReceiptId;
            this.androidXiaoMiActivity = builder.androidXiaoMiActivity;
            this.androidXiaoMiNotifyBody = builder.androidXiaoMiNotifyBody;
            this.androidXiaoMiNotifyTitle = builder.androidXiaoMiNotifyTitle;
            this.androidXiaomiBigPictureUrl = builder.androidXiaomiBigPictureUrl;
            this.androidXiaomiImageUrl = builder.androidXiaomiImageUrl;
            this.body = builder.body;
            this.deviceType = builder.deviceType;
            this.expireTime = builder.expireTime;
            this.harmonyAction = builder.harmonyAction;
            this.harmonyActionType = builder.harmonyActionType;
            this.harmonyBadgeAddNum = builder.harmonyBadgeAddNum;
            this.harmonyBadgeSetNum = builder.harmonyBadgeSetNum;
            this.harmonyCategory = builder.harmonyCategory;
            this.harmonyExtParameters = builder.harmonyExtParameters;
            this.harmonyExtensionExtraData = builder.harmonyExtensionExtraData;
            this.harmonyExtensionPush = builder.harmonyExtensionPush;
            this.harmonyImageUrl = builder.harmonyImageUrl;
            this.harmonyInboxContent = builder.harmonyInboxContent;
            this.harmonyNotificationSlotType = builder.harmonyNotificationSlotType;
            this.harmonyNotifyId = builder.harmonyNotifyId;
            this.harmonyReceiptId = builder.harmonyReceiptId;
            this.harmonyRemind = builder.harmonyRemind;
            this.harmonyRemindBody = builder.harmonyRemindBody;
            this.harmonyRemindTitle = builder.harmonyRemindTitle;
            this.harmonyRenderStyle = builder.harmonyRenderStyle;
            this.harmonyTestMessage = builder.harmonyTestMessage;
            this.harmonyUri = builder.harmonyUri;
            this.jobKey = builder.jobKey;
            this.pushTime = builder.pushTime;
            this.pushType = builder.pushType;
            this.sendChannels = builder.sendChannels;
            this.sendSpeed = builder.sendSpeed;
            this.storeOffline = builder.storeOffline;
            this.target = builder.target;
            this.targetValue = builder.targetValue;
            this.title = builder.title;
            this.trim = builder.trim;
            this.iOSApnsEnv = builder.iOSApnsEnv;
            this.iOSBadge = builder.iOSBadge;
            this.iOSBadgeAutoIncrement = builder.iOSBadgeAutoIncrement;
            this.iOSExtParameters = builder.iOSExtParameters;
            this.iOSInterruptionLevel = builder.iOSInterruptionLevel;
            this.iOSMusic = builder.iOSMusic;
            this.iOSMutableContent = builder.iOSMutableContent;
            this.iOSNotificationCategory = builder.iOSNotificationCategory;
            this.iOSNotificationCollapseId = builder.iOSNotificationCollapseId;
            this.iOSNotificationThreadId = builder.iOSNotificationThreadId;
            this.iOSRelevanceScore = builder.iOSRelevanceScore;
            this.iOSRemind = builder.iOSRemind;
            this.iOSRemindBody = builder.iOSRemindBody;
            this.iOSSilentNotification = builder.iOSSilentNotification;
            this.iOSSubtitle = builder.iOSSubtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushTask create() {
            return builder().build();
        }

        /**
         * @return androidActivity
         */
        public String getAndroidActivity() {
            return this.androidActivity;
        }

        /**
         * @return androidBadgeAddNum
         */
        public Integer getAndroidBadgeAddNum() {
            return this.androidBadgeAddNum;
        }

        /**
         * @return androidBadgeClass
         */
        public String getAndroidBadgeClass() {
            return this.androidBadgeClass;
        }

        /**
         * @return androidBadgeSetNum
         */
        public Integer getAndroidBadgeSetNum() {
            return this.androidBadgeSetNum;
        }

        /**
         * @return androidBigBody
         */
        public String getAndroidBigBody() {
            return this.androidBigBody;
        }

        /**
         * @return androidBigPictureUrl
         */
        public String getAndroidBigPictureUrl() {
            return this.androidBigPictureUrl;
        }

        /**
         * @return androidBigTitle
         */
        public String getAndroidBigTitle() {
            return this.androidBigTitle;
        }

        /**
         * @return androidExtParameters
         */
        public String getAndroidExtParameters() {
            return this.androidExtParameters;
        }

        /**
         * @return androidHonorTargetUserType
         */
        public Integer getAndroidHonorTargetUserType() {
            return this.androidHonorTargetUserType;
        }

        /**
         * @return androidHuaweiReceiptId
         */
        public String getAndroidHuaweiReceiptId() {
            return this.androidHuaweiReceiptId;
        }

        /**
         * @return androidHuaweiTargetUserType
         */
        public Integer getAndroidHuaweiTargetUserType() {
            return this.androidHuaweiTargetUserType;
        }

        /**
         * @return androidImageUrl
         */
        public String getAndroidImageUrl() {
            return this.androidImageUrl;
        }

        /**
         * @return androidInboxBody
         */
        public String getAndroidInboxBody() {
            return this.androidInboxBody;
        }

        /**
         * @return androidMessageHuaweiCategory
         */
        public String getAndroidMessageHuaweiCategory() {
            return this.androidMessageHuaweiCategory;
        }

        /**
         * @return androidMessageHuaweiUrgency
         */
        public String getAndroidMessageHuaweiUrgency() {
            return this.androidMessageHuaweiUrgency;
        }

        /**
         * @return androidMessageVivoCategory
         */
        public String getAndroidMessageVivoCategory() {
            return this.androidMessageVivoCategory;
        }

        /**
         * @return androidMusic
         */
        public String getAndroidMusic() {
            return this.androidMusic;
        }

        /**
         * @return androidNotificationBarPriority
         */
        public Integer getAndroidNotificationBarPriority() {
            return this.androidNotificationBarPriority;
        }

        /**
         * @return androidNotificationBarType
         */
        public Integer getAndroidNotificationBarType() {
            return this.androidNotificationBarType;
        }

        /**
         * @return androidNotificationChannel
         */
        public String getAndroidNotificationChannel() {
            return this.androidNotificationChannel;
        }

        /**
         * @return androidNotificationGroup
         */
        public String getAndroidNotificationGroup() {
            return this.androidNotificationGroup;
        }

        /**
         * @return androidNotificationHonorChannel
         */
        public String getAndroidNotificationHonorChannel() {
            return this.androidNotificationHonorChannel;
        }

        /**
         * @return androidNotificationHuaweiChannel
         */
        public String getAndroidNotificationHuaweiChannel() {
            return this.androidNotificationHuaweiChannel;
        }

        /**
         * @return androidNotificationNotifyId
         */
        public Integer getAndroidNotificationNotifyId() {
            return this.androidNotificationNotifyId;
        }

        /**
         * @return androidNotificationThreadId
         */
        public String getAndroidNotificationThreadId() {
            return this.androidNotificationThreadId;
        }

        /**
         * @return androidNotificationVivoChannel
         */
        public String getAndroidNotificationVivoChannel() {
            return this.androidNotificationVivoChannel;
        }

        /**
         * @return androidNotificationXiaomiChannel
         */
        public String getAndroidNotificationXiaomiChannel() {
            return this.androidNotificationXiaomiChannel;
        }

        /**
         * @return androidNotifyType
         */
        public String getAndroidNotifyType() {
            return this.androidNotifyType;
        }

        /**
         * @return androidOpenType
         */
        public String getAndroidOpenType() {
            return this.androidOpenType;
        }

        /**
         * @return androidOpenUrl
         */
        public String getAndroidOpenUrl() {
            return this.androidOpenUrl;
        }

        /**
         * @return androidPopupActivity
         */
        public String getAndroidPopupActivity() {
            return this.androidPopupActivity;
        }

        /**
         * @return androidPopupBody
         */
        public String getAndroidPopupBody() {
            return this.androidPopupBody;
        }

        /**
         * @return androidPopupTitle
         */
        public String getAndroidPopupTitle() {
            return this.androidPopupTitle;
        }

        /**
         * @return androidRemind
         */
        public Boolean getAndroidRemind() {
            return this.androidRemind;
        }

        /**
         * @return androidRenderStyle
         */
        public String getAndroidRenderStyle() {
            return this.androidRenderStyle;
        }

        /**
         * @return androidTargetUserType
         */
        public Integer getAndroidTargetUserType() {
            return this.androidTargetUserType;
        }

        /**
         * @return androidVivoPushMode
         */
        public Integer getAndroidVivoPushMode() {
            return this.androidVivoPushMode;
        }

        /**
         * @return androidVivoReceiptId
         */
        public String getAndroidVivoReceiptId() {
            return this.androidVivoReceiptId;
        }

        /**
         * @return androidXiaoMiActivity
         */
        public String getAndroidXiaoMiActivity() {
            return this.androidXiaoMiActivity;
        }

        /**
         * @return androidXiaoMiNotifyBody
         */
        public String getAndroidXiaoMiNotifyBody() {
            return this.androidXiaoMiNotifyBody;
        }

        /**
         * @return androidXiaoMiNotifyTitle
         */
        public String getAndroidXiaoMiNotifyTitle() {
            return this.androidXiaoMiNotifyTitle;
        }

        /**
         * @return androidXiaomiBigPictureUrl
         */
        public String getAndroidXiaomiBigPictureUrl() {
            return this.androidXiaomiBigPictureUrl;
        }

        /**
         * @return androidXiaomiImageUrl
         */
        public String getAndroidXiaomiImageUrl() {
            return this.androidXiaomiImageUrl;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return harmonyAction
         */
        public String getHarmonyAction() {
            return this.harmonyAction;
        }

        /**
         * @return harmonyActionType
         */
        public String getHarmonyActionType() {
            return this.harmonyActionType;
        }

        /**
         * @return harmonyBadgeAddNum
         */
        public Integer getHarmonyBadgeAddNum() {
            return this.harmonyBadgeAddNum;
        }

        /**
         * @return harmonyBadgeSetNum
         */
        public Integer getHarmonyBadgeSetNum() {
            return this.harmonyBadgeSetNum;
        }

        /**
         * @return harmonyCategory
         */
        public String getHarmonyCategory() {
            return this.harmonyCategory;
        }

        /**
         * @return harmonyExtParameters
         */
        public String getHarmonyExtParameters() {
            return this.harmonyExtParameters;
        }

        /**
         * @return harmonyExtensionExtraData
         */
        public String getHarmonyExtensionExtraData() {
            return this.harmonyExtensionExtraData;
        }

        /**
         * @return harmonyExtensionPush
         */
        public Boolean getHarmonyExtensionPush() {
            return this.harmonyExtensionPush;
        }

        /**
         * @return harmonyImageUrl
         */
        public String getHarmonyImageUrl() {
            return this.harmonyImageUrl;
        }

        /**
         * @return harmonyInboxContent
         */
        public String getHarmonyInboxContent() {
            return this.harmonyInboxContent;
        }

        /**
         * @return harmonyNotificationSlotType
         */
        public String getHarmonyNotificationSlotType() {
            return this.harmonyNotificationSlotType;
        }

        /**
         * @return harmonyNotifyId
         */
        public Integer getHarmonyNotifyId() {
            return this.harmonyNotifyId;
        }

        /**
         * @return harmonyReceiptId
         */
        public String getHarmonyReceiptId() {
            return this.harmonyReceiptId;
        }

        /**
         * @return harmonyRemind
         */
        public Boolean getHarmonyRemind() {
            return this.harmonyRemind;
        }

        /**
         * @return harmonyRemindBody
         */
        public String getHarmonyRemindBody() {
            return this.harmonyRemindBody;
        }

        /**
         * @return harmonyRemindTitle
         */
        public String getHarmonyRemindTitle() {
            return this.harmonyRemindTitle;
        }

        /**
         * @return harmonyRenderStyle
         */
        public String getHarmonyRenderStyle() {
            return this.harmonyRenderStyle;
        }

        /**
         * @return harmonyTestMessage
         */
        public Boolean getHarmonyTestMessage() {
            return this.harmonyTestMessage;
        }

        /**
         * @return harmonyUri
         */
        public String getHarmonyUri() {
            return this.harmonyUri;
        }

        /**
         * @return jobKey
         */
        public String getJobKey() {
            return this.jobKey;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return pushType
         */
        public String getPushType() {
            return this.pushType;
        }

        /**
         * @return sendChannels
         */
        public String getSendChannels() {
            return this.sendChannels;
        }

        /**
         * @return sendSpeed
         */
        public Integer getSendSpeed() {
            return this.sendSpeed;
        }

        /**
         * @return storeOffline
         */
        public Boolean getStoreOffline() {
            return this.storeOffline;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return trim
         */
        public Boolean getTrim() {
            return this.trim;
        }

        /**
         * @return iOSApnsEnv
         */
        public String getIOSApnsEnv() {
            return this.iOSApnsEnv;
        }

        /**
         * @return iOSBadge
         */
        public Integer getIOSBadge() {
            return this.iOSBadge;
        }

        /**
         * @return iOSBadgeAutoIncrement
         */
        public Boolean getIOSBadgeAutoIncrement() {
            return this.iOSBadgeAutoIncrement;
        }

        /**
         * @return iOSExtParameters
         */
        public String getIOSExtParameters() {
            return this.iOSExtParameters;
        }

        /**
         * @return iOSInterruptionLevel
         */
        public String getIOSInterruptionLevel() {
            return this.iOSInterruptionLevel;
        }

        /**
         * @return iOSMusic
         */
        public String getIOSMusic() {
            return this.iOSMusic;
        }

        /**
         * @return iOSMutableContent
         */
        public Boolean getIOSMutableContent() {
            return this.iOSMutableContent;
        }

        /**
         * @return iOSNotificationCategory
         */
        public String getIOSNotificationCategory() {
            return this.iOSNotificationCategory;
        }

        /**
         * @return iOSNotificationCollapseId
         */
        public String getIOSNotificationCollapseId() {
            return this.iOSNotificationCollapseId;
        }

        /**
         * @return iOSNotificationThreadId
         */
        public String getIOSNotificationThreadId() {
            return this.iOSNotificationThreadId;
        }

        /**
         * @return iOSRelevanceScore
         */
        public Double getIOSRelevanceScore() {
            return this.iOSRelevanceScore;
        }

        /**
         * @return iOSRemind
         */
        public Boolean getIOSRemind() {
            return this.iOSRemind;
        }

        /**
         * @return iOSRemindBody
         */
        public String getIOSRemindBody() {
            return this.iOSRemindBody;
        }

        /**
         * @return iOSSilentNotification
         */
        public Boolean getIOSSilentNotification() {
            return this.iOSSilentNotification;
        }

        /**
         * @return iOSSubtitle
         */
        public String getIOSSubtitle() {
            return this.iOSSubtitle;
        }

        public static final class Builder {
            private String androidActivity; 
            private Integer androidBadgeAddNum; 
            private String androidBadgeClass; 
            private Integer androidBadgeSetNum; 
            private String androidBigBody; 
            private String androidBigPictureUrl; 
            private String androidBigTitle; 
            private String androidExtParameters; 
            private Integer androidHonorTargetUserType; 
            private String androidHuaweiReceiptId; 
            private Integer androidHuaweiTargetUserType; 
            private String androidImageUrl; 
            private String androidInboxBody; 
            private String androidMessageHuaweiCategory; 
            private String androidMessageHuaweiUrgency; 
            private String androidMessageVivoCategory; 
            private String androidMusic; 
            private Integer androidNotificationBarPriority; 
            private Integer androidNotificationBarType; 
            private String androidNotificationChannel; 
            private String androidNotificationGroup; 
            private String androidNotificationHonorChannel; 
            private String androidNotificationHuaweiChannel; 
            private Integer androidNotificationNotifyId; 
            private String androidNotificationThreadId; 
            private String androidNotificationVivoChannel; 
            private String androidNotificationXiaomiChannel; 
            private String androidNotifyType; 
            private String androidOpenType; 
            private String androidOpenUrl; 
            private String androidPopupActivity; 
            private String androidPopupBody; 
            private String androidPopupTitle; 
            private Boolean androidRemind; 
            private String androidRenderStyle; 
            private Integer androidTargetUserType; 
            private Integer androidVivoPushMode; 
            private String androidVivoReceiptId; 
            private String androidXiaoMiActivity; 
            private String androidXiaoMiNotifyBody; 
            private String androidXiaoMiNotifyTitle; 
            private String androidXiaomiBigPictureUrl; 
            private String androidXiaomiImageUrl; 
            private String body; 
            private String deviceType; 
            private String expireTime; 
            private String harmonyAction; 
            private String harmonyActionType; 
            private Integer harmonyBadgeAddNum; 
            private Integer harmonyBadgeSetNum; 
            private String harmonyCategory; 
            private String harmonyExtParameters; 
            private String harmonyExtensionExtraData; 
            private Boolean harmonyExtensionPush; 
            private String harmonyImageUrl; 
            private String harmonyInboxContent; 
            private String harmonyNotificationSlotType; 
            private Integer harmonyNotifyId; 
            private String harmonyReceiptId; 
            private Boolean harmonyRemind; 
            private String harmonyRemindBody; 
            private String harmonyRemindTitle; 
            private String harmonyRenderStyle; 
            private Boolean harmonyTestMessage; 
            private String harmonyUri; 
            private String jobKey; 
            private String pushTime; 
            private String pushType; 
            private String sendChannels; 
            private Integer sendSpeed; 
            private Boolean storeOffline; 
            private String target; 
            private String targetValue; 
            private String title; 
            private Boolean trim; 
            private String iOSApnsEnv; 
            private Integer iOSBadge; 
            private Boolean iOSBadgeAutoIncrement; 
            private String iOSExtParameters; 
            private String iOSInterruptionLevel; 
            private String iOSMusic; 
            private Boolean iOSMutableContent; 
            private String iOSNotificationCategory; 
            private String iOSNotificationCollapseId; 
            private String iOSNotificationThreadId; 
            private Double iOSRelevanceScore; 
            private Boolean iOSRemind; 
            private String iOSRemindBody; 
            private Boolean iOSSilentNotification; 
            private String iOSSubtitle; 

            /**
             * AndroidActivity.
             */
            public Builder androidActivity(String androidActivity) {
                this.androidActivity = androidActivity;
                return this;
            }

            /**
             * AndroidBadgeAddNum.
             */
            public Builder androidBadgeAddNum(Integer androidBadgeAddNum) {
                this.androidBadgeAddNum = androidBadgeAddNum;
                return this;
            }

            /**
             * AndroidBadgeClass.
             */
            public Builder androidBadgeClass(String androidBadgeClass) {
                this.androidBadgeClass = androidBadgeClass;
                return this;
            }

            /**
             * AndroidBadgeSetNum.
             */
            public Builder androidBadgeSetNum(Integer androidBadgeSetNum) {
                this.androidBadgeSetNum = androidBadgeSetNum;
                return this;
            }

            /**
             * AndroidBigBody.
             */
            public Builder androidBigBody(String androidBigBody) {
                this.androidBigBody = androidBigBody;
                return this;
            }

            /**
             * AndroidBigPictureUrl.
             */
            public Builder androidBigPictureUrl(String androidBigPictureUrl) {
                this.androidBigPictureUrl = androidBigPictureUrl;
                return this;
            }

            /**
             * AndroidBigTitle.
             */
            public Builder androidBigTitle(String androidBigTitle) {
                this.androidBigTitle = androidBigTitle;
                return this;
            }

            /**
             * AndroidExtParameters.
             */
            public Builder androidExtParameters(String androidExtParameters) {
                this.androidExtParameters = androidExtParameters;
                return this;
            }

            /**
             * AndroidHonorTargetUserType.
             */
            public Builder androidHonorTargetUserType(Integer androidHonorTargetUserType) {
                this.androidHonorTargetUserType = androidHonorTargetUserType;
                return this;
            }

            /**
             * AndroidHuaweiReceiptId.
             */
            public Builder androidHuaweiReceiptId(String androidHuaweiReceiptId) {
                this.androidHuaweiReceiptId = androidHuaweiReceiptId;
                return this;
            }

            /**
             * AndroidHuaweiTargetUserType.
             */
            public Builder androidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
                this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
                return this;
            }

            /**
             * AndroidImageUrl.
             */
            public Builder androidImageUrl(String androidImageUrl) {
                this.androidImageUrl = androidImageUrl;
                return this;
            }

            /**
             * AndroidInboxBody.
             */
            public Builder androidInboxBody(String androidInboxBody) {
                this.androidInboxBody = androidInboxBody;
                return this;
            }

            /**
             * AndroidMessageHuaweiCategory.
             */
            public Builder androidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
                this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
                return this;
            }

            /**
             * AndroidMessageHuaweiUrgency.
             */
            public Builder androidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
                this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
                return this;
            }

            /**
             * AndroidMessageVivoCategory.
             */
            public Builder androidMessageVivoCategory(String androidMessageVivoCategory) {
                this.androidMessageVivoCategory = androidMessageVivoCategory;
                return this;
            }

            /**
             * AndroidMusic.
             */
            public Builder androidMusic(String androidMusic) {
                this.androidMusic = androidMusic;
                return this;
            }

            /**
             * AndroidNotificationBarPriority.
             */
            public Builder androidNotificationBarPriority(Integer androidNotificationBarPriority) {
                this.androidNotificationBarPriority = androidNotificationBarPriority;
                return this;
            }

            /**
             * AndroidNotificationBarType.
             */
            public Builder androidNotificationBarType(Integer androidNotificationBarType) {
                this.androidNotificationBarType = androidNotificationBarType;
                return this;
            }

            /**
             * AndroidNotificationChannel.
             */
            public Builder androidNotificationChannel(String androidNotificationChannel) {
                this.androidNotificationChannel = androidNotificationChannel;
                return this;
            }

            /**
             * AndroidNotificationGroup.
             */
            public Builder androidNotificationGroup(String androidNotificationGroup) {
                this.androidNotificationGroup = androidNotificationGroup;
                return this;
            }

            /**
             * AndroidNotificationHonorChannel.
             */
            public Builder androidNotificationHonorChannel(String androidNotificationHonorChannel) {
                this.androidNotificationHonorChannel = androidNotificationHonorChannel;
                return this;
            }

            /**
             * AndroidNotificationHuaweiChannel.
             */
            public Builder androidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
                this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
                return this;
            }

            /**
             * AndroidNotificationNotifyId.
             */
            public Builder androidNotificationNotifyId(Integer androidNotificationNotifyId) {
                this.androidNotificationNotifyId = androidNotificationNotifyId;
                return this;
            }

            /**
             * AndroidNotificationThreadId.
             */
            public Builder androidNotificationThreadId(String androidNotificationThreadId) {
                this.androidNotificationThreadId = androidNotificationThreadId;
                return this;
            }

            /**
             * AndroidNotificationVivoChannel.
             */
            public Builder androidNotificationVivoChannel(String androidNotificationVivoChannel) {
                this.androidNotificationVivoChannel = androidNotificationVivoChannel;
                return this;
            }

            /**
             * AndroidNotificationXiaomiChannel.
             */
            public Builder androidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
                this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
                return this;
            }

            /**
             * AndroidNotifyType.
             */
            public Builder androidNotifyType(String androidNotifyType) {
                this.androidNotifyType = androidNotifyType;
                return this;
            }

            /**
             * AndroidOpenType.
             */
            public Builder androidOpenType(String androidOpenType) {
                this.androidOpenType = androidOpenType;
                return this;
            }

            /**
             * AndroidOpenUrl.
             */
            public Builder androidOpenUrl(String androidOpenUrl) {
                this.androidOpenUrl = androidOpenUrl;
                return this;
            }

            /**
             * AndroidPopupActivity.
             */
            public Builder androidPopupActivity(String androidPopupActivity) {
                this.androidPopupActivity = androidPopupActivity;
                return this;
            }

            /**
             * AndroidPopupBody.
             */
            public Builder androidPopupBody(String androidPopupBody) {
                this.androidPopupBody = androidPopupBody;
                return this;
            }

            /**
             * AndroidPopupTitle.
             */
            public Builder androidPopupTitle(String androidPopupTitle) {
                this.androidPopupTitle = androidPopupTitle;
                return this;
            }

            /**
             * AndroidRemind.
             */
            public Builder androidRemind(Boolean androidRemind) {
                this.androidRemind = androidRemind;
                return this;
            }

            /**
             * AndroidRenderStyle.
             */
            public Builder androidRenderStyle(String androidRenderStyle) {
                this.androidRenderStyle = androidRenderStyle;
                return this;
            }

            /**
             * AndroidTargetUserType.
             */
            public Builder androidTargetUserType(Integer androidTargetUserType) {
                this.androidTargetUserType = androidTargetUserType;
                return this;
            }

            /**
             * AndroidVivoPushMode.
             */
            public Builder androidVivoPushMode(Integer androidVivoPushMode) {
                this.androidVivoPushMode = androidVivoPushMode;
                return this;
            }

            /**
             * AndroidVivoReceiptId.
             */
            public Builder androidVivoReceiptId(String androidVivoReceiptId) {
                this.androidVivoReceiptId = androidVivoReceiptId;
                return this;
            }

            /**
             * AndroidXiaoMiActivity.
             */
            public Builder androidXiaoMiActivity(String androidXiaoMiActivity) {
                this.androidXiaoMiActivity = androidXiaoMiActivity;
                return this;
            }

            /**
             * AndroidXiaoMiNotifyBody.
             */
            public Builder androidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
                this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
                return this;
            }

            /**
             * AndroidXiaoMiNotifyTitle.
             */
            public Builder androidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
                this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
                return this;
            }

            /**
             * AndroidXiaomiBigPictureUrl.
             */
            public Builder androidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
                this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
                return this;
            }

            /**
             * AndroidXiaomiImageUrl.
             */
            public Builder androidXiaomiImageUrl(String androidXiaomiImageUrl) {
                this.androidXiaomiImageUrl = androidXiaomiImageUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HarmonyAction.
             */
            public Builder harmonyAction(String harmonyAction) {
                this.harmonyAction = harmonyAction;
                return this;
            }

            /**
             * HarmonyActionType.
             */
            public Builder harmonyActionType(String harmonyActionType) {
                this.harmonyActionType = harmonyActionType;
                return this;
            }

            /**
             * HarmonyBadgeAddNum.
             */
            public Builder harmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
                this.harmonyBadgeAddNum = harmonyBadgeAddNum;
                return this;
            }

            /**
             * HarmonyBadgeSetNum.
             */
            public Builder harmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
                this.harmonyBadgeSetNum = harmonyBadgeSetNum;
                return this;
            }

            /**
             * HarmonyCategory.
             */
            public Builder harmonyCategory(String harmonyCategory) {
                this.harmonyCategory = harmonyCategory;
                return this;
            }

            /**
             * HarmonyExtParameters.
             */
            public Builder harmonyExtParameters(String harmonyExtParameters) {
                this.harmonyExtParameters = harmonyExtParameters;
                return this;
            }

            /**
             * HarmonyExtensionExtraData.
             */
            public Builder harmonyExtensionExtraData(String harmonyExtensionExtraData) {
                this.harmonyExtensionExtraData = harmonyExtensionExtraData;
                return this;
            }

            /**
             * HarmonyExtensionPush.
             */
            public Builder harmonyExtensionPush(Boolean harmonyExtensionPush) {
                this.harmonyExtensionPush = harmonyExtensionPush;
                return this;
            }

            /**
             * HarmonyImageUrl.
             */
            public Builder harmonyImageUrl(String harmonyImageUrl) {
                this.harmonyImageUrl = harmonyImageUrl;
                return this;
            }

            /**
             * HarmonyInboxContent.
             */
            public Builder harmonyInboxContent(String harmonyInboxContent) {
                this.harmonyInboxContent = harmonyInboxContent;
                return this;
            }

            /**
             * HarmonyNotificationSlotType.
             */
            public Builder harmonyNotificationSlotType(String harmonyNotificationSlotType) {
                this.harmonyNotificationSlotType = harmonyNotificationSlotType;
                return this;
            }

            /**
             * HarmonyNotifyId.
             */
            public Builder harmonyNotifyId(Integer harmonyNotifyId) {
                this.harmonyNotifyId = harmonyNotifyId;
                return this;
            }

            /**
             * HarmonyReceiptId.
             */
            public Builder harmonyReceiptId(String harmonyReceiptId) {
                this.harmonyReceiptId = harmonyReceiptId;
                return this;
            }

            /**
             * HarmonyRemind.
             */
            public Builder harmonyRemind(Boolean harmonyRemind) {
                this.harmonyRemind = harmonyRemind;
                return this;
            }

            /**
             * HarmonyRemindBody.
             */
            public Builder harmonyRemindBody(String harmonyRemindBody) {
                this.harmonyRemindBody = harmonyRemindBody;
                return this;
            }

            /**
             * HarmonyRemindTitle.
             */
            public Builder harmonyRemindTitle(String harmonyRemindTitle) {
                this.harmonyRemindTitle = harmonyRemindTitle;
                return this;
            }

            /**
             * HarmonyRenderStyle.
             */
            public Builder harmonyRenderStyle(String harmonyRenderStyle) {
                this.harmonyRenderStyle = harmonyRenderStyle;
                return this;
            }

            /**
             * HarmonyTestMessage.
             */
            public Builder harmonyTestMessage(Boolean harmonyTestMessage) {
                this.harmonyTestMessage = harmonyTestMessage;
                return this;
            }

            /**
             * HarmonyUri.
             */
            public Builder harmonyUri(String harmonyUri) {
                this.harmonyUri = harmonyUri;
                return this;
            }

            /**
             * JobKey.
             */
            public Builder jobKey(String jobKey) {
                this.jobKey = jobKey;
                return this;
            }

            /**
             * PushTime.
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MESSAGE</p>
             */
            public Builder pushType(String pushType) {
                this.pushType = pushType;
                return this;
            }

            /**
             * SendChannels.
             */
            public Builder sendChannels(String sendChannels) {
                this.sendChannels = sendChannels;
                return this;
            }

            /**
             * SendSpeed.
             */
            public Builder sendSpeed(Integer sendSpeed) {
                this.sendSpeed = sendSpeed;
                return this;
            }

            /**
             * StoreOffline.
             */
            public Builder storeOffline(Boolean storeOffline) {
                this.storeOffline = storeOffline;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEVICE</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>deviceid1,deviceid2</p>
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Trim.
             */
            public Builder trim(Boolean trim) {
                this.trim = trim;
                return this;
            }

            /**
             * iOSApnsEnv.
             */
            public Builder iOSApnsEnv(String iOSApnsEnv) {
                this.iOSApnsEnv = iOSApnsEnv;
                return this;
            }

            /**
             * iOSBadge.
             */
            public Builder iOSBadge(Integer iOSBadge) {
                this.iOSBadge = iOSBadge;
                return this;
            }

            /**
             * iOSBadgeAutoIncrement.
             */
            public Builder iOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
                this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
                return this;
            }

            /**
             * iOSExtParameters.
             */
            public Builder iOSExtParameters(String iOSExtParameters) {
                this.iOSExtParameters = iOSExtParameters;
                return this;
            }

            /**
             * iOSInterruptionLevel.
             */
            public Builder iOSInterruptionLevel(String iOSInterruptionLevel) {
                this.iOSInterruptionLevel = iOSInterruptionLevel;
                return this;
            }

            /**
             * iOSMusic.
             */
            public Builder iOSMusic(String iOSMusic) {
                this.iOSMusic = iOSMusic;
                return this;
            }

            /**
             * iOSMutableContent.
             */
            public Builder iOSMutableContent(Boolean iOSMutableContent) {
                this.iOSMutableContent = iOSMutableContent;
                return this;
            }

            /**
             * iOSNotificationCategory.
             */
            public Builder iOSNotificationCategory(String iOSNotificationCategory) {
                this.iOSNotificationCategory = iOSNotificationCategory;
                return this;
            }

            /**
             * iOSNotificationCollapseId.
             */
            public Builder iOSNotificationCollapseId(String iOSNotificationCollapseId) {
                this.iOSNotificationCollapseId = iOSNotificationCollapseId;
                return this;
            }

            /**
             * iOSNotificationThreadId.
             */
            public Builder iOSNotificationThreadId(String iOSNotificationThreadId) {
                this.iOSNotificationThreadId = iOSNotificationThreadId;
                return this;
            }

            /**
             * iOSRelevanceScore.
             */
            public Builder iOSRelevanceScore(Double iOSRelevanceScore) {
                this.iOSRelevanceScore = iOSRelevanceScore;
                return this;
            }

            /**
             * iOSRemind.
             */
            public Builder iOSRemind(Boolean iOSRemind) {
                this.iOSRemind = iOSRemind;
                return this;
            }

            /**
             * iOSRemindBody.
             */
            public Builder iOSRemindBody(String iOSRemindBody) {
                this.iOSRemindBody = iOSRemindBody;
                return this;
            }

            /**
             * iOSSilentNotification.
             */
            public Builder iOSSilentNotification(Boolean iOSSilentNotification) {
                this.iOSSilentNotification = iOSSilentNotification;
                return this;
            }

            /**
             * iOSSubtitle.
             */
            public Builder iOSSubtitle(String iOSSubtitle) {
                this.iOSSubtitle = iOSSubtitle;
                return this;
            }

            public PushTask build() {
                return new PushTask(this);
            } 

        } 

    }
}
