// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link MassPushRequest} extends {@link RequestModel}
 *
 * <p>MassPushRequest</p>
 */
public class MassPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentToken")
    @com.aliyun.core.annotation.Validation(maxLength = 36, minLength = 36)
    private String idempotentToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushTask")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PushTask> pushTask;

    private MassPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.idempotentToken = builder.idempotentToken;
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
     * @return idempotentToken
     */
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    /**
     * @return pushTask
     */
    public java.util.List<PushTask> getPushTask() {
        return this.pushTask;
    }

    public static final class Builder extends Request.Builder<MassPushRequest, Builder> {
        private Long appKey; 
        private String idempotentToken; 
        private java.util.List<PushTask> pushTask; 

        private Builder() {
            super();
        } 

        private Builder(MassPushRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.idempotentToken = request.idempotentToken;
            this.pushTask = request.pushTask;
        } 

        /**
         * <p>The AppKey.</p>
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
         * <p>The idempotent parameter used to prevent duplicate pushes caused by API client retries. If the same IdempotentToken is used within 15 minutes, only one push is performed, and subsequent calls return the result of the first successful push.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range of 0-9 or a-f, and it is case-insensitive.</li>
         * <li>This parameter is only used to prevent duplicate pushes caused by retries. It cannot prevent duplicate pushes caused by concurrent calls.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c8016d13-6e76-410c-9bda-769383d11787</p>
         */
        public Builder idempotentToken(String idempotentToken) {
            this.putQueryParameter("IdempotentToken", idempotentToken);
            this.idempotentToken = idempotentToken;
            return this;
        }

        /**
         * <p>The array of independent push tasks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder pushTask(java.util.List<PushTask> pushTask) {
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

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiBusinessType")
        private Integer androidHuaweiBusinessType;

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiLiveNotificationPayload")
        private String androidHuaweiLiveNotificationPayload;

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiReceiptId")
        private String androidHuaweiReceiptId;

        @com.aliyun.core.annotation.NameInMap("AndroidHuaweiTargetUserType")
        private Integer androidHuaweiTargetUserType;

        @com.aliyun.core.annotation.NameInMap("AndroidImageUrl")
        private String androidImageUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidInboxBody")
        private String androidInboxBody;

        @com.aliyun.core.annotation.NameInMap("AndroidMeizuNoticeMsgType")
        private Integer androidMeizuNoticeMsgType;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiCategory")
        private String androidMessageHuaweiCategory;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiUrgency")
        private String androidMessageHuaweiUrgency;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageOppoCategory")
        private String androidMessageOppoCategory;

        @com.aliyun.core.annotation.NameInMap("AndroidMessageOppoNotifyLevel")
        private Integer androidMessageOppoNotifyLevel;

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

        @com.aliyun.core.annotation.NameInMap("AndroidOppoDeleteIntentData")
        private String androidOppoDeleteIntentData;

        @com.aliyun.core.annotation.NameInMap("AndroidOppoIntelligentIntent")
        private String androidOppoIntelligentIntent;

        @com.aliyun.core.annotation.NameInMap("AndroidOppoIntentEnv")
        private Integer androidOppoIntentEnv;

        @com.aliyun.core.annotation.NameInMap("AndroidOppoPrivateContentParameters")
        @Deprecated
        private java.util.Map<String, String> androidOppoPrivateContentParameters;

        @com.aliyun.core.annotation.NameInMap("AndroidOppoPrivateMsgTemplateId")
        @Deprecated
        private String androidOppoPrivateMsgTemplateId;

        @com.aliyun.core.annotation.NameInMap("AndroidOppoPrivateTitleParameters")
        @Deprecated
        private java.util.Map<String, String> androidOppoPrivateTitleParameters;

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

        @com.aliyun.core.annotation.NameInMap("AndroidVivoLiveMessage")
        private String androidVivoLiveMessage;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoPushMode")
        private Integer androidVivoPushMode;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoReceiptId")
        private String androidVivoReceiptId;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoTemplateId")
        private String androidVivoTemplateId;

        @com.aliyun.core.annotation.NameInMap("AndroidVivoTemplateParams")
        private String androidVivoTemplateParams;

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
        @Deprecated
        private String androidXiaomiBigPictureUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiFocusParam")
        private String androidXiaomiFocusParam;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiFocusPics")
        private String androidXiaomiFocusPics;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiImageUrl")
        @Deprecated
        private String androidXiaomiImageUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiTemplateId")
        private String androidXiaomiTemplateId;

        @com.aliyun.core.annotation.NameInMap("AndroidXiaomiTemplateParams")
        private String androidXiaomiTemplateParams;

        @com.aliyun.core.annotation.NameInMap("Body")
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

        @com.aliyun.core.annotation.NameInMap("HarmonyLiveViewPayload")
        private String harmonyLiveViewPayload;

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

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityAttributes")
        private String iOSLiveActivityAttributes;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityAttributesType")
        private String iOSLiveActivityAttributesType;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityContentState")
        private String iOSLiveActivityContentState;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityDismissalDate")
        private Long iOSLiveActivityDismissalDate;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityEvent")
        private String iOSLiveActivityEvent;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityId")
        private String iOSLiveActivityId;

        @com.aliyun.core.annotation.NameInMap("iOSLiveActivityStaleDate")
        private Long iOSLiveActivityStaleDate;

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
            this.androidHuaweiBusinessType = builder.androidHuaweiBusinessType;
            this.androidHuaweiLiveNotificationPayload = builder.androidHuaweiLiveNotificationPayload;
            this.androidHuaweiReceiptId = builder.androidHuaweiReceiptId;
            this.androidHuaweiTargetUserType = builder.androidHuaweiTargetUserType;
            this.androidImageUrl = builder.androidImageUrl;
            this.androidInboxBody = builder.androidInboxBody;
            this.androidMeizuNoticeMsgType = builder.androidMeizuNoticeMsgType;
            this.androidMessageHuaweiCategory = builder.androidMessageHuaweiCategory;
            this.androidMessageHuaweiUrgency = builder.androidMessageHuaweiUrgency;
            this.androidMessageOppoCategory = builder.androidMessageOppoCategory;
            this.androidMessageOppoNotifyLevel = builder.androidMessageOppoNotifyLevel;
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
            this.androidOppoDeleteIntentData = builder.androidOppoDeleteIntentData;
            this.androidOppoIntelligentIntent = builder.androidOppoIntelligentIntent;
            this.androidOppoIntentEnv = builder.androidOppoIntentEnv;
            this.androidOppoPrivateContentParameters = builder.androidOppoPrivateContentParameters;
            this.androidOppoPrivateMsgTemplateId = builder.androidOppoPrivateMsgTemplateId;
            this.androidOppoPrivateTitleParameters = builder.androidOppoPrivateTitleParameters;
            this.androidPopupActivity = builder.androidPopupActivity;
            this.androidPopupBody = builder.androidPopupBody;
            this.androidPopupTitle = builder.androidPopupTitle;
            this.androidRemind = builder.androidRemind;
            this.androidRenderStyle = builder.androidRenderStyle;
            this.androidTargetUserType = builder.androidTargetUserType;
            this.androidVivoLiveMessage = builder.androidVivoLiveMessage;
            this.androidVivoPushMode = builder.androidVivoPushMode;
            this.androidVivoReceiptId = builder.androidVivoReceiptId;
            this.androidVivoTemplateId = builder.androidVivoTemplateId;
            this.androidVivoTemplateParams = builder.androidVivoTemplateParams;
            this.androidXiaoMiActivity = builder.androidXiaoMiActivity;
            this.androidXiaoMiNotifyBody = builder.androidXiaoMiNotifyBody;
            this.androidXiaoMiNotifyTitle = builder.androidXiaoMiNotifyTitle;
            this.androidXiaomiBigPictureUrl = builder.androidXiaomiBigPictureUrl;
            this.androidXiaomiFocusParam = builder.androidXiaomiFocusParam;
            this.androidXiaomiFocusPics = builder.androidXiaomiFocusPics;
            this.androidXiaomiImageUrl = builder.androidXiaomiImageUrl;
            this.androidXiaomiTemplateId = builder.androidXiaomiTemplateId;
            this.androidXiaomiTemplateParams = builder.androidXiaomiTemplateParams;
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
            this.harmonyLiveViewPayload = builder.harmonyLiveViewPayload;
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
            this.iOSLiveActivityAttributes = builder.iOSLiveActivityAttributes;
            this.iOSLiveActivityAttributesType = builder.iOSLiveActivityAttributesType;
            this.iOSLiveActivityContentState = builder.iOSLiveActivityContentState;
            this.iOSLiveActivityDismissalDate = builder.iOSLiveActivityDismissalDate;
            this.iOSLiveActivityEvent = builder.iOSLiveActivityEvent;
            this.iOSLiveActivityId = builder.iOSLiveActivityId;
            this.iOSLiveActivityStaleDate = builder.iOSLiveActivityStaleDate;
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
         * @return androidHuaweiBusinessType
         */
        public Integer getAndroidHuaweiBusinessType() {
            return this.androidHuaweiBusinessType;
        }

        /**
         * @return androidHuaweiLiveNotificationPayload
         */
        public String getAndroidHuaweiLiveNotificationPayload() {
            return this.androidHuaweiLiveNotificationPayload;
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
         * @return androidMeizuNoticeMsgType
         */
        public Integer getAndroidMeizuNoticeMsgType() {
            return this.androidMeizuNoticeMsgType;
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
         * @return androidMessageOppoCategory
         */
        public String getAndroidMessageOppoCategory() {
            return this.androidMessageOppoCategory;
        }

        /**
         * @return androidMessageOppoNotifyLevel
         */
        public Integer getAndroidMessageOppoNotifyLevel() {
            return this.androidMessageOppoNotifyLevel;
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
         * @return androidOppoDeleteIntentData
         */
        public String getAndroidOppoDeleteIntentData() {
            return this.androidOppoDeleteIntentData;
        }

        /**
         * @return androidOppoIntelligentIntent
         */
        public String getAndroidOppoIntelligentIntent() {
            return this.androidOppoIntelligentIntent;
        }

        /**
         * @return androidOppoIntentEnv
         */
        public Integer getAndroidOppoIntentEnv() {
            return this.androidOppoIntentEnv;
        }

        /**
         * @return androidOppoPrivateContentParameters
         */
        public java.util.Map<String, String> getAndroidOppoPrivateContentParameters() {
            return this.androidOppoPrivateContentParameters;
        }

        /**
         * @return androidOppoPrivateMsgTemplateId
         */
        public String getAndroidOppoPrivateMsgTemplateId() {
            return this.androidOppoPrivateMsgTemplateId;
        }

        /**
         * @return androidOppoPrivateTitleParameters
         */
        public java.util.Map<String, String> getAndroidOppoPrivateTitleParameters() {
            return this.androidOppoPrivateTitleParameters;
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
         * @return androidVivoLiveMessage
         */
        public String getAndroidVivoLiveMessage() {
            return this.androidVivoLiveMessage;
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
         * @return androidVivoTemplateId
         */
        public String getAndroidVivoTemplateId() {
            return this.androidVivoTemplateId;
        }

        /**
         * @return androidVivoTemplateParams
         */
        public String getAndroidVivoTemplateParams() {
            return this.androidVivoTemplateParams;
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
         * @return androidXiaomiFocusParam
         */
        public String getAndroidXiaomiFocusParam() {
            return this.androidXiaomiFocusParam;
        }

        /**
         * @return androidXiaomiFocusPics
         */
        public String getAndroidXiaomiFocusPics() {
            return this.androidXiaomiFocusPics;
        }

        /**
         * @return androidXiaomiImageUrl
         */
        public String getAndroidXiaomiImageUrl() {
            return this.androidXiaomiImageUrl;
        }

        /**
         * @return androidXiaomiTemplateId
         */
        public String getAndroidXiaomiTemplateId() {
            return this.androidXiaomiTemplateId;
        }

        /**
         * @return androidXiaomiTemplateParams
         */
        public String getAndroidXiaomiTemplateParams() {
            return this.androidXiaomiTemplateParams;
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
         * @return harmonyLiveViewPayload
         */
        public String getHarmonyLiveViewPayload() {
            return this.harmonyLiveViewPayload;
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
         * @return iOSLiveActivityAttributes
         */
        public String getIOSLiveActivityAttributes() {
            return this.iOSLiveActivityAttributes;
        }

        /**
         * @return iOSLiveActivityAttributesType
         */
        public String getIOSLiveActivityAttributesType() {
            return this.iOSLiveActivityAttributesType;
        }

        /**
         * @return iOSLiveActivityContentState
         */
        public String getIOSLiveActivityContentState() {
            return this.iOSLiveActivityContentState;
        }

        /**
         * @return iOSLiveActivityDismissalDate
         */
        public Long getIOSLiveActivityDismissalDate() {
            return this.iOSLiveActivityDismissalDate;
        }

        /**
         * @return iOSLiveActivityEvent
         */
        public String getIOSLiveActivityEvent() {
            return this.iOSLiveActivityEvent;
        }

        /**
         * @return iOSLiveActivityId
         */
        public String getIOSLiveActivityId() {
            return this.iOSLiveActivityId;
        }

        /**
         * @return iOSLiveActivityStaleDate
         */
        public Long getIOSLiveActivityStaleDate() {
            return this.iOSLiveActivityStaleDate;
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
            private Integer androidHuaweiBusinessType; 
            private String androidHuaweiLiveNotificationPayload; 
            private String androidHuaweiReceiptId; 
            private Integer androidHuaweiTargetUserType; 
            private String androidImageUrl; 
            private String androidInboxBody; 
            private Integer androidMeizuNoticeMsgType; 
            private String androidMessageHuaweiCategory; 
            private String androidMessageHuaweiUrgency; 
            private String androidMessageOppoCategory; 
            private Integer androidMessageOppoNotifyLevel; 
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
            private String androidOppoDeleteIntentData; 
            private String androidOppoIntelligentIntent; 
            private Integer androidOppoIntentEnv; 
            private java.util.Map<String, String> androidOppoPrivateContentParameters; 
            private String androidOppoPrivateMsgTemplateId; 
            private java.util.Map<String, String> androidOppoPrivateTitleParameters; 
            private String androidPopupActivity; 
            private String androidPopupBody; 
            private String androidPopupTitle; 
            private Boolean androidRemind; 
            private String androidRenderStyle; 
            private Integer androidTargetUserType; 
            private String androidVivoLiveMessage; 
            private Integer androidVivoPushMode; 
            private String androidVivoReceiptId; 
            private String androidVivoTemplateId; 
            private String androidVivoTemplateParams; 
            private String androidXiaoMiActivity; 
            private String androidXiaoMiNotifyBody; 
            private String androidXiaoMiNotifyTitle; 
            private String androidXiaomiBigPictureUrl; 
            private String androidXiaomiFocusParam; 
            private String androidXiaomiFocusPics; 
            private String androidXiaomiImageUrl; 
            private String androidXiaomiTemplateId; 
            private String androidXiaomiTemplateParams; 
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
            private String harmonyLiveViewPayload; 
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
            private String iOSLiveActivityAttributes; 
            private String iOSLiveActivityAttributesType; 
            private String iOSLiveActivityContentState; 
            private Long iOSLiveActivityDismissalDate; 
            private String iOSLiveActivityEvent; 
            private String iOSLiveActivityId; 
            private Long iOSLiveActivityStaleDate; 
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

            private Builder() {
            } 

            private Builder(PushTask model) {
                this.androidActivity = model.androidActivity;
                this.androidBadgeAddNum = model.androidBadgeAddNum;
                this.androidBadgeClass = model.androidBadgeClass;
                this.androidBadgeSetNum = model.androidBadgeSetNum;
                this.androidBigBody = model.androidBigBody;
                this.androidBigPictureUrl = model.androidBigPictureUrl;
                this.androidBigTitle = model.androidBigTitle;
                this.androidExtParameters = model.androidExtParameters;
                this.androidHonorTargetUserType = model.androidHonorTargetUserType;
                this.androidHuaweiBusinessType = model.androidHuaweiBusinessType;
                this.androidHuaweiLiveNotificationPayload = model.androidHuaweiLiveNotificationPayload;
                this.androidHuaweiReceiptId = model.androidHuaweiReceiptId;
                this.androidHuaweiTargetUserType = model.androidHuaweiTargetUserType;
                this.androidImageUrl = model.androidImageUrl;
                this.androidInboxBody = model.androidInboxBody;
                this.androidMeizuNoticeMsgType = model.androidMeizuNoticeMsgType;
                this.androidMessageHuaweiCategory = model.androidMessageHuaweiCategory;
                this.androidMessageHuaweiUrgency = model.androidMessageHuaweiUrgency;
                this.androidMessageOppoCategory = model.androidMessageOppoCategory;
                this.androidMessageOppoNotifyLevel = model.androidMessageOppoNotifyLevel;
                this.androidMessageVivoCategory = model.androidMessageVivoCategory;
                this.androidMusic = model.androidMusic;
                this.androidNotificationBarPriority = model.androidNotificationBarPriority;
                this.androidNotificationBarType = model.androidNotificationBarType;
                this.androidNotificationChannel = model.androidNotificationChannel;
                this.androidNotificationGroup = model.androidNotificationGroup;
                this.androidNotificationHonorChannel = model.androidNotificationHonorChannel;
                this.androidNotificationHuaweiChannel = model.androidNotificationHuaweiChannel;
                this.androidNotificationNotifyId = model.androidNotificationNotifyId;
                this.androidNotificationThreadId = model.androidNotificationThreadId;
                this.androidNotificationVivoChannel = model.androidNotificationVivoChannel;
                this.androidNotificationXiaomiChannel = model.androidNotificationXiaomiChannel;
                this.androidNotifyType = model.androidNotifyType;
                this.androidOpenType = model.androidOpenType;
                this.androidOpenUrl = model.androidOpenUrl;
                this.androidOppoDeleteIntentData = model.androidOppoDeleteIntentData;
                this.androidOppoIntelligentIntent = model.androidOppoIntelligentIntent;
                this.androidOppoIntentEnv = model.androidOppoIntentEnv;
                this.androidOppoPrivateContentParameters = model.androidOppoPrivateContentParameters;
                this.androidOppoPrivateMsgTemplateId = model.androidOppoPrivateMsgTemplateId;
                this.androidOppoPrivateTitleParameters = model.androidOppoPrivateTitleParameters;
                this.androidPopupActivity = model.androidPopupActivity;
                this.androidPopupBody = model.androidPopupBody;
                this.androidPopupTitle = model.androidPopupTitle;
                this.androidRemind = model.androidRemind;
                this.androidRenderStyle = model.androidRenderStyle;
                this.androidTargetUserType = model.androidTargetUserType;
                this.androidVivoLiveMessage = model.androidVivoLiveMessage;
                this.androidVivoPushMode = model.androidVivoPushMode;
                this.androidVivoReceiptId = model.androidVivoReceiptId;
                this.androidVivoTemplateId = model.androidVivoTemplateId;
                this.androidVivoTemplateParams = model.androidVivoTemplateParams;
                this.androidXiaoMiActivity = model.androidXiaoMiActivity;
                this.androidXiaoMiNotifyBody = model.androidXiaoMiNotifyBody;
                this.androidXiaoMiNotifyTitle = model.androidXiaoMiNotifyTitle;
                this.androidXiaomiBigPictureUrl = model.androidXiaomiBigPictureUrl;
                this.androidXiaomiFocusParam = model.androidXiaomiFocusParam;
                this.androidXiaomiFocusPics = model.androidXiaomiFocusPics;
                this.androidXiaomiImageUrl = model.androidXiaomiImageUrl;
                this.androidXiaomiTemplateId = model.androidXiaomiTemplateId;
                this.androidXiaomiTemplateParams = model.androidXiaomiTemplateParams;
                this.body = model.body;
                this.deviceType = model.deviceType;
                this.expireTime = model.expireTime;
                this.harmonyAction = model.harmonyAction;
                this.harmonyActionType = model.harmonyActionType;
                this.harmonyBadgeAddNum = model.harmonyBadgeAddNum;
                this.harmonyBadgeSetNum = model.harmonyBadgeSetNum;
                this.harmonyCategory = model.harmonyCategory;
                this.harmonyExtParameters = model.harmonyExtParameters;
                this.harmonyExtensionExtraData = model.harmonyExtensionExtraData;
                this.harmonyExtensionPush = model.harmonyExtensionPush;
                this.harmonyImageUrl = model.harmonyImageUrl;
                this.harmonyInboxContent = model.harmonyInboxContent;
                this.harmonyLiveViewPayload = model.harmonyLiveViewPayload;
                this.harmonyNotificationSlotType = model.harmonyNotificationSlotType;
                this.harmonyNotifyId = model.harmonyNotifyId;
                this.harmonyReceiptId = model.harmonyReceiptId;
                this.harmonyRemind = model.harmonyRemind;
                this.harmonyRemindBody = model.harmonyRemindBody;
                this.harmonyRemindTitle = model.harmonyRemindTitle;
                this.harmonyRenderStyle = model.harmonyRenderStyle;
                this.harmonyTestMessage = model.harmonyTestMessage;
                this.harmonyUri = model.harmonyUri;
                this.jobKey = model.jobKey;
                this.pushTime = model.pushTime;
                this.pushType = model.pushType;
                this.sendChannels = model.sendChannels;
                this.sendSpeed = model.sendSpeed;
                this.storeOffline = model.storeOffline;
                this.target = model.target;
                this.targetValue = model.targetValue;
                this.title = model.title;
                this.trim = model.trim;
                this.iOSApnsEnv = model.iOSApnsEnv;
                this.iOSBadge = model.iOSBadge;
                this.iOSBadgeAutoIncrement = model.iOSBadgeAutoIncrement;
                this.iOSExtParameters = model.iOSExtParameters;
                this.iOSInterruptionLevel = model.iOSInterruptionLevel;
                this.iOSLiveActivityAttributes = model.iOSLiveActivityAttributes;
                this.iOSLiveActivityAttributesType = model.iOSLiveActivityAttributesType;
                this.iOSLiveActivityContentState = model.iOSLiveActivityContentState;
                this.iOSLiveActivityDismissalDate = model.iOSLiveActivityDismissalDate;
                this.iOSLiveActivityEvent = model.iOSLiveActivityEvent;
                this.iOSLiveActivityId = model.iOSLiveActivityId;
                this.iOSLiveActivityStaleDate = model.iOSLiveActivityStaleDate;
                this.iOSMusic = model.iOSMusic;
                this.iOSMutableContent = model.iOSMutableContent;
                this.iOSNotificationCategory = model.iOSNotificationCategory;
                this.iOSNotificationCollapseId = model.iOSNotificationCollapseId;
                this.iOSNotificationThreadId = model.iOSNotificationThreadId;
                this.iOSRelevanceScore = model.iOSRelevanceScore;
                this.iOSRemind = model.iOSRemind;
                this.iOSRemindBody = model.iOSRemindBody;
                this.iOSSilentNotification = model.iOSSilentNotification;
                this.iOSSubtitle = model.iOSSubtitle;
            } 

            /**
             * <p>The activity to be opened by the notification.</p>
             * <p>This parameter is valid only when PushTask.N.AndroidOpenType is set to ACTIVITY. Example: <code>com.alibaba.cloudpushdemo.bizactivity</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
             */
            public Builder androidActivity(String androidActivity) {
                this.androidActivity = androidActivity;
                return this;
            }

            /**
             * <p>Specifies the increment value for the badge. The value is added to the existing badge number. Valid values: 1 to 99.</p>
             * <blockquote>
             * <p>This parameter is valid only for push notifications sent through Huawei or Honor vendor channels. If both AndroidBadgeAddNum and AndroidBadgeSetNum are specified, AndroidBadgeSetNum takes precedence.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidBadgeAddNum(Integer androidBadgeAddNum) {
                this.androidBadgeAddNum = androidBadgeAddNum;
                return this;
            }

            /**
             * <p>The fully qualified class name of the entry Activity for badge settings.</p>
             * <blockquote>
             * <p>This parameter is valid only for push notifications sent through Huawei or Honor vendor channels.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
             */
            public Builder androidBadgeClass(String androidBadgeClass) {
                this.androidBadgeClass = androidBadgeClass;
                return this;
            }

            /**
             * <p>Specifies the fixed number for the badge. Valid values: 0 to 99.</p>
             * <blockquote>
             * <p>This parameter takes effect only on Huawei and Honor channels when push notifications are sent through vendor channels. When push notifications are sent through the Alibaba Cloud proprietary channel, this parameter takes effect only on Huawei, Honor, and vivo devices.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder androidBadgeSetNum(Integer androidBadgeSetNum) {
                this.androidBadgeSetNum = androidBadgeSetNum;
                return this;
            }

            /**
             * <p>The body in long text mode. Maximum length: 1,000 bytes. One Chinese character counts as 3 bytes. The actual limit is subject to the specific vendor channel during sending.</p>
             * <p>Currently supported by:</p>
             * <ul>
             * <li>Huawei: EMUI 10 or later</li>
             * <li>Honor: Magic UI 4.0 or later</li>
             * <li>Xiaomi: MIUI 10 or later</li>
             * <li>OPPO: ColorOS 5.0 or later</li>
             * <li>Meizu: Flyme</li>
             * <li>Proprietary channel: Android SDK 3.6.0 or later</li>
             * </ul>
             * <p>If this parameter is not provided in long text mode, the first non-empty value from Body and AndroidPopupBody is used.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample long text</p>
             */
            public Builder androidBigBody(String androidBigBody) {
                this.androidBigBody = androidBigBody;
                return this;
            }

            /**
             * <p>The image URL in big image mode. Currently supported by the proprietary channel with Android SDK 3.6.0 or later.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
             */
            public Builder androidBigPictureUrl(String androidBigPictureUrl) {
                this.androidBigPictureUrl = androidBigPictureUrl;
                return this;
            }

            /**
             * <p>The title in long text mode. Maximum length: 200 bytes. One Chinese character counts as 3 bytes.</p>
             * <ul>
             * <li><p>This parameter is currently supported only by the Honor channel and the Huawei channel with EMUI 11 or later.</p>
             * </li>
             * <li><p>If this parameter is not provided in long text mode, the first non-empty value from Title and AndroidPopupTitle is used.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sample long title</p>
             */
            public Builder androidBigTitle(String androidBigTitle) {
                this.androidBigTitle = androidBigTitle;
                return this;
            }

            /**
             * <p>The extended properties of the notification. This parameter does not take effect when the push type PushType is set to MESSAGE.</p>
             * <p>This parameter must be passed in JSON map format. Otherwise, a parsing error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
             */
            public Builder androidExtParameters(String androidExtParameters) {
                this.androidExtParameters = androidExtParameters;
                return this;
            }

            /**
             * <p>The notification type for the Honor channel. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Formal notification. This is the default value.</li>
             * <li><strong>1</strong>: Test notification.</li>
             * </ul>
             * <blockquote>
             * <p>Each application can send 1,000 test notifications per day, which is not subject to the daily push limit per device.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidHonorTargetUserType(Integer androidHonorTargetUserType) {
                this.androidHonorTargetUserType = androidHonorTargetUserType;
                return this;
            }

            /**
             * <p>The Huawei quick notification parameter. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Send a standard Huawei notification. This is the default value.</li>
             * <li><strong>1</strong>: Send a Huawei quick notification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidHuaweiBusinessType(Integer androidHuaweiBusinessType) {
                this.androidHuaweiBusinessType = androidHuaweiBusinessType;
                return this;
            }

            /**
             * <p>The JSON string of the Huawei Android Live Notification data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development integration, refer to <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Notification push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;activityId&quot;: 1,
             *   &quot;operation&quot;: 1,
             *   &quot;event&quot;: &quot;TAXI&quot;,
             *   &quot;activityData&quot;: {
             *     &quot;notificationData&quot;: {
             *       &quot;type&quot;: 3
             *     }
             *   }
             * }</p>
             */
            public Builder androidHuaweiLiveNotificationPayload(String androidHuaweiLiveNotificationPayload) {
                this.androidHuaweiLiveNotificationPayload = androidHuaweiLiveNotificationPayload;
                return this;
            }

            /**
             * <p>The receipt ID for the Huawei channel. You can view this receipt ID in the receipt parameter settings of the Huawei channel push operations platform.</p>
             * <blockquote>
             * <p>If the default receipt configuration on the Huawei channel push operations platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, configure the default receipt ID for the Huawei channel in the Alibaba Cloud EMAS Mobile Push console first.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RCP4C123456</p>
             */
            public Builder androidHuaweiReceiptId(String androidHuaweiReceiptId) {
                this.androidHuaweiReceiptId = androidHuaweiReceiptId;
                return this;
            }

            /**
             * <p>The notification type for the Huawei channel. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Formal notification. This is the default value.</li>
             * <li><strong>1</strong>: Test notification.</li>
             * </ul>
             * <blockquote>
             * <p>Each application can send 500 test notifications per day, which is not subject to the daily push limit per device.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
                this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
                return this;
            }

            /**
             * <p>The URL of the right-side icon. Currently supported by:</p>
             * <ul>
             * <li>Huawei EMUI: Applicable only in long text mode and inbox mode.</li>
             * <li>Honor Magic UI: Applicable only in long text mode.</li>
             * <li>Proprietary channel: Android SDK 3.5.0 or later.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
             */
            public Builder androidImageUrl(String androidImageUrl) {
                this.androidImageUrl = androidImageUrl;
                return this;
            }

            /**
             * <p>The body in inbox mode. The content must be a valid JSON array with no more than five elements. Currently supported by:</p>
             * <ul>
             * <li>Huawei: EMUI 9 or later</li>
             * <li>Honor: Magic UI 4.0 or later</li>
             * <li>Xiaomi: MIUI 10 or later</li>
             * <li>OPPO: ColorOS 5.0 or later</li>
             * <li>Proprietary channel: Android SDK 3.6.0 or later</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;First line&quot;,&quot;Second line&quot;]</p>
             */
            public Builder androidInboxBody(String androidInboxBody) {
                this.androidInboxBody = androidInboxBody;
                return this;
            }

            /**
             * <p>The Meizu message type. Valid values:</p>
             * <ul>
             * <li>0: Public message. This is the default value.</li>
             * <li>1: Private message.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder androidMeizuNoticeMsgType(Integer androidMeizuNoticeMsgType) {
                this.androidMeizuNoticeMsgType = androidMeizuNoticeMsgType;
                return this;
            }

            /**
             * <p>Purpose 1: After you complete the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification permission application</a>, this parameter is used to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>, and accelerate the sending of specific types of messages. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">Message classification standards</a> in the official Huawei push documentation, and fill in the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; in the document table.</p>
             * <p>Purpose 2: After you <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">apply for special permissions</a>, this parameter is used to identify high-priority pass-through scenarios. Valid values:</p>
             * <ul>
             * <li>VOIP: Audio and video calls.</li>
             * <li>PLAY_VOICE: Voice broadcast.</li>
             * </ul>
             * <blockquote>
             * <p>If the &quot;Cloud notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Alibaba Cloud proprietary channel. If the &quot;Local notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Huawei channel.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SUBSCRIPTION</p>
             */
            public Builder androidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
                this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
                return this;
            }

            /**
             * <p>The delivery priority for Huawei channel notifications. Valid values:</p>
             * <ul>
             * <li><p>HIGH</p>
             * </li>
             * <li><p>NORMAL</p>
             * </li>
             * </ul>
             * <p>You must apply for this permission. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder androidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
                this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
                return this;
            }

            /**
             * <p>OPPO message categorization includes two categories for management: Communication and Service, and Content and Marketing.</p>
             * <p>Communication and Service (requires permission application):</p>
             * <ul>
             * <li>IM: Instant chat, audio calls, and video calls.</li>
             * <li>ACCOUNT: Individual account and asset changes.</li>
             * <li>DEVICE_REMINDER: Personal device reminders.</li>
             * <li>ORDER: Personal order and logistics status changes.</li>
             * <li>TODO: Personal schedules and to-do lists.</li>
             * <li>SUBSCRIPTION: Personal subscriptions.</li>
             * </ul>
             * <p>Content and Marketing:</p>
             * <ul>
             * <li>NEWS: News and information.</li>
             * <li>CONTENT: Content recommendations.</li>
             * <li>MARKETING: Platform activities.</li>
             * <li>SOCIAL: Social updates.</li>
             * </ul>
             * <p>For more information, see <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPUSH message classification rules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MARKETING</p>
             */
            public Builder androidMessageOppoCategory(String androidMessageOppoCategory) {
                this.androidMessageOppoCategory = androidMessageOppoCategory;
                return this;
            }

            /**
             * <p>The notification bar message reminder level for the OPPO channel. Valid values:</p>
             * <ul>
             * <li>1: Notification bar.</li>
             * <li>2: Notification bar, lock screen, ringtone, and vibration. This is the default notification level for communication and service messages.</li>
             * <li>16: Notification bar, lock screen, ringtone, vibration, and banner. Requires permission application.</li>
             * </ul>
             * <blockquote>
             * <p>When you use the AndroidMessageOppoNotifyLevel parameter, you must also pass the AndroidMessageOppoCategory parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
                this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
                return this;
            }

            /**
             * <p>vivo message categorization includes two categories for management: System messages and Operational messages. </p>
             * <p>System messages:</p>
             * <ul>
             * <li>IM: Instant messages.</li>
             * <li>ACCOUNT: Accounts and assets.</li>
             * <li>TODO: Schedules and to-do lists.</li>
             * <li>DEVICE_REMINDER: Device information.</li>
             * <li>ORDER: Orders and logistics.</li>
             * <li>SUBSCRIPTION: Subscription reminders.</li>
             * </ul>
             * <p>Operational messages:</p>
             * <ul>
             * <li>NEWS: News.</li>
             * <li>CONTENT: Content recommendations.</li>
             * <li>MARKETING: Operational activities.</li>
             * <li>SOCIAL: Social updates.<blockquote>
             * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">Classification description</a>.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TODO</p>
             */
            public Builder androidMessageVivoCategory(String androidMessageVivoCategory) {
                this.androidMessageVivoCategory = androidMessageVivoCategory;
                return this;
            }

            /**
             * <p>The notification sound for the Huawei vendor channel. Specify the name of the audio file stored in the app/src/main/res/raw/ directory of the client project. Do not include the file extension.</p>
             * <p>If this parameter is not specified, the default ringtone is used.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_notification_sound</p>
             */
            public Builder androidMusic(String androidMusic) {
                this.androidMusic = androidMusic;
                return this;
            }

            /**
             * <p>The priority of the Android notification display position in the notification bar. Valid values: -2, -1, 0, 1, and 2.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder androidNotificationBarPriority(Integer androidNotificationBarPriority) {
                this.androidNotificationBarPriority = androidNotificationBarPriority;
                return this;
            }

            /**
             * <p>The custom notification bar style for Android. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder androidNotificationBarType(Integer androidNotificationBarType) {
                this.androidNotificationBarType = androidNotificationBarType;
                return this;
            }

            /**
             * <p>The channel ID of the Android application. This value must match the channel ID in the application.</p>
             * <ul>
             * <li>For more information about the NotificationChannel parameter, see <a href="https://help.aliyun.com/document_detail/67398.html">FAQ: Notifications are not received on devices running Android 8.0 or later</a>.</li>
             * <li>Because the channel_id of the OPPO private message channel is the same as the channel ID of the application, this value is used as the channel_id for OPPO channel pushes.</li>
             * <li>This value is used as the channel_id for Huawei, FCM, and Alibaba Cloud proprietary channel pushes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidNotificationChannel(String androidNotificationChannel) {
                this.androidNotificationChannel = androidNotificationChannel;
                return this;
            }

            /**
             * <p>The message group. For messages in the same group, only the latest message and the total number of received messages in the group are displayed in the notification bar. All messages are not displayed and cannot be expanded. Currently supported by:</p>
             * <ul>
             * <li>Huawei vendor channel</li>
             * <li>Honor vendor channel</li>
             * <li>Proprietary channel with Android SDK 3.9.1 or earlier</li>
             * </ul>
             * <blockquote>
             * <p>The proprietary channel no longer supports this parameter in Android SDK 3.9.2 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>group-1</p>
             */
            public Builder androidNotificationGroup(String androidNotificationGroup) {
                this.androidNotificationGroup = androidNotificationGroup;
                return this;
            }

            /**
             * <p>The importance parameter for Honor notification message classification, which determines the notification behavior on user devices. Valid values:</p>
             * <ul>
             * <li><p>LOW: Information and marketing messages.</p>
             * </li>
             * <li><p>NORMAL: Service and communication messages.</p>
             * </li>
             * </ul>
             * <p>You must apply for this permission on the Honor platform. For more information, see <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder androidNotificationHonorChannel(String androidNotificationHonorChannel) {
                this.androidNotificationHonorChannel = androidNotificationHonorChannel;
                return this;
            }

            /**
             * <p>The importance parameter for Huawei notification message classification, which determines the notification behavior on user devices. Valid values:</p>
             * <ul>
             * <li>LOW: Information and marketing messages.</li>
             * <li>NORMAL: Service and communication messages.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>For the Huawei channel, use AndroidMessageHuaweiCategory for notification classification instead of AndroidNotificationHuaweiChannel.</li>
             * <li>You must apply for this permission on the Huawei platform. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder androidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
                this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
                return this;
            }

            /**
             * <p>The unique identifier for each message when displayed in the notification bar. Different notification bar messages can share the same NotifyId, allowing new notification bar messages to overwrite old ones.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder androidNotificationNotifyId(Integer androidNotificationNotifyId) {
                this.androidNotificationNotifyId = androidNotificationNotifyId;
                return this;
            }

            /**
             * <p>The message thread ID. Messages in the same group are collapsed and can be expanded in the notification bar. Notifications in different groups are displayed separately. Currently supported by:</p>
             * <ul>
             * <li>Proprietary channel with Android SDK 3.9.2 or later</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>thread-1</p>
             */
            public Builder androidNotificationThreadId(String androidNotificationThreadId) {
                this.androidNotificationThreadId = androidNotificationThreadId;
                return this;
            }

            /**
             * <p>The vivo notification message classification. Valid values:</p>
             * <ul>
             * <li>0: Operational messages. This is the default value.</li>
             * <li>1: System messages.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>For the vivo channel, use AndroidMessageVivoCategory for notification classification instead of AndroidNotificationVivoChannel.</li>
             * <li>You must apply for this permission on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder androidNotificationVivoChannel(String androidNotificationVivoChannel) {
                this.androidNotificationVivoChannel = androidNotificationVivoChannel;
                return this;
            }

            /**
             * <p>The channel ID for Xiaomi notification types. You must apply for this permission on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
             * <blockquote>
             * <ul>
             * <li>A single application can apply for a maximum of eight channels on the Xiaomi channel. Plan ahead.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>michannel</p>
             */
            public Builder androidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
                this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
                return this;
            }

            /**
             * <p>The reminder method for the notification. Valid values:</p>
             * <ul>
             * <li><strong>VIBRATE</strong>: Vibration. This is the default value.</li>
             * <li><strong>SOUND</strong>: Sound.</li>
             * <li><strong>BOTH</strong>: Sound and vibration.</li>
             * <li><strong>NONE</strong>: Silent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VIBRATE</p>
             */
            public Builder androidNotifyType(String androidNotifyType) {
                this.androidNotifyType = androidNotifyType;
                return this;
            }

            /**
             * <p>The action to perform after the notification is clicked. Valid values:</p>
             * <ul>
             * <li>APPLICATION: Open the application. This is the default value.</li>
             * <li>ACTIVITY: Open the specified Android activity.</li>
             * <li>URL: Open the specified URL.</li>
             * <li>NONE: Perform no action.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPLICATION</p>
             */
            public Builder androidOpenType(String androidOpenType) {
                this.androidOpenType = androidOpenType;
                return this;
            }

            /**
             * <p>The URL to be opened after the Android device receives the push. This parameter is valid only when PushTask.N.AndroidOpenType is set to URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com">https://www.example.com</a></p>
             */
            public Builder androidOpenUrl(String androidOpenUrl) {
                this.androidOpenUrl = androidOpenUrl;
                return this;
            }

            /**
             * <p>The JSON character string of the OPPO Fluid Cloud intent delete data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the AndroidOppoIntelligentIntent parameter is already specified. For development integration, see References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;intentName&quot;: &quot;Example.Progress&quot;,
             *     &quot;entityIds&quot;: [
             *         &quot;A580202509130712&quot;
             *     ],
             *     &quot;serviceId&quot;: {
             *         &quot;launcher&quot;: &quot;999800001&quot;,
             *         &quot;fluidCloud&quot;: &quot;999900001&quot;
             *     }
             * }</p>
             */
            public Builder androidOppoDeleteIntentData(String androidOppoDeleteIntentData) {
                this.androidOppoDeleteIntentData = androidOppoDeleteIntentData;
                return this;
            }

            /**
             * <p>The JSON character string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development integration, see References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;intentName&quot;: &quot;Example.Progress&quot;,
             *     &quot;identifier&quot;: &quot;d71ebd3119877b12ecdb6c4fe96b068e&quot;,
             *     &quot;timestamp&quot;: 1729485000989,
             *     &quot;serviceId&quot;: {
             *         &quot;launcher&quot;: &quot;999800001&quot;,
             *         &quot;fluidCloud&quot;: &quot;999900001&quot;
             *     },
             *     &quot;intentAction&quot;: {
             *         &quot;actionStatus&quot;: 0
             *     },
             *     &quot;intentEntity&quot;: {
             *         &quot;entityName&quot;: &quot;TAXI&quot;
             *     }
             * }</p>
             */
            public Builder androidOppoIntelligentIntent(String androidOppoIntelligentIntent) {
                this.androidOppoIntelligentIntent = androidOppoIntelligentIntent;
                return this;
            }

            /**
             * <p>The push environment for OPPO Fluid Cloud. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Formal environment. This is the default value.</li>
             * <li><strong>1</strong>: Test environment.</li>
             * </ul>
             * <blockquote>
             * <p>To use the OPPO Fluid Cloud test environment, you must build it on the client side by referring to <a href="https://open.oppomobile.com/documentation/page/info?id=13590">Environment setup</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidOppoIntentEnv(Integer androidOppoIntentEnv) {
                this.androidOppoIntentEnv = androidOppoIntentEnv;
                return this;
            }

            /**
             * <p>The content parameter of the OPPO private message template.</p>
             */
            public Builder androidOppoPrivateContentParameters(java.util.Map<String, String> androidOppoPrivateContentParameters) {
                this.androidOppoPrivateContentParameters = androidOppoPrivateContentParameters;
                return this;
            }

            /**
             * <p>The OPPO private message template ID.</p>
             * <blockquote>
             * <p>Warning: The OPPO private message template feature is no longer supported by MaasPush. To use this feature, call the Push, PushV2, or MassPushV2 operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>687557242b1634hzef3zd5013</p>
             */
            public Builder androidOppoPrivateMsgTemplateId(String androidOppoPrivateMsgTemplateId) {
                this.androidOppoPrivateMsgTemplateId = androidOppoPrivateMsgTemplateId;
                return this;
            }

            /**
             * <p>The title parameter of the OPPO private message template.</p>
             */
            public Builder androidOppoPrivateTitleParameters(java.util.Map<String, String> androidOppoPrivateTitleParameters) {
                this.androidOppoPrivateTitleParameters = androidOppoPrivateTitleParameters;
                return this;
            }

            /**
             * <p>The activity to navigate to after the notification is clicked.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
             */
            public Builder androidPopupActivity(String androidPopupActivity) {
                this.androidPopupActivity = androidPopupActivity;
                return this;
            }

            /**
             * <p>The body content in auxiliary pop-up window mode. This parameter is required when the AndroidPopupActivity parameter is not empty.</p>
             * <p>Maximum length: 200 characters. Both Chinese and English characters count as one character.</p>
             * <p>If a vendor channel is used, the body must also meet the limits of the vendor channel. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder androidPopupBody(String androidPopupBody) {
                this.androidPopupBody = androidPopupBody;
                return this;
            }

            /**
             * <p>The title content in auxiliary pop-up window mode. This parameter is required when the AndroidPopupActivity parameter is not empty. </p>
             * <p>Maximum length: 50 characters. Both Chinese and English characters count as one character.</p>
             * <p>If a vendor channel is used, the title must also meet the limits of the vendor channel. For more information, see <a href="https://help.aliyun.com/document_detail/165253.html">Limits on auxiliary channel pushes for Android</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder androidPopupTitle(String androidPopupTitle) {
                this.androidPopupTitle = androidPopupTitle;
                return this;
            }

            /**
             * <p>Specifies whether to use the auxiliary pop-up window feature when the device is offline during a message push. Default value: false. This parameter takes effect only when PushType is set to MESSAGE.</p>
             * <p>If the message-to-notification push is successful, the data displayed in the received notification is the value of the AndroidPopupTitle and AndroidPopupBody parameters set on the server. When you click the notification, the data obtained in the onSysNoticeOpened method of the auxiliary pop-up window is the value of the Title and Body parameters set on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder androidRemind(Boolean androidRemind) {
                this.androidRemind = androidRemind;
                return this;
            }

            /**
             * <p>The notification style. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Standard mode. This is the default value.</li>
             * <li><strong>1</strong>: Long text mode. Supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and the proprietary channel.</li>
             * <li><strong>2</strong>: Big image mode. Supported by the proprietary channel, but not supported by Xiaomi devices.</li>
             * <li><strong>3</strong>: Inbox mode. Supported by Huawei, Honor, Xiaomi, OPPO, and the proprietary channel.<blockquote>
             * <p>This parameter is required if a non-standard mode is used.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidRenderStyle(String androidRenderStyle) {
                this.androidRenderStyle = androidRenderStyle;
                return this;
            }

            /**
             * <p>Settings for the vendor channel notification type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Formal notification. This is the default value.</li>
             * <li><strong>1</strong>: Test notification.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>The parameter settings are equivalent to configuring the AndroidHuaweiTargetUserType, AndroidHonorTargetUserType, AndroidVivoPushMode, and AndroidOppoIntentEnv parameters at the same time. The corresponding parameters for specific vendor channels can overwrite this parameter.</li>
             * <li>Currently supported by: Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidTargetUserType(Integer androidTargetUserType) {
                this.androidTargetUserType = androidTargetUserType;
                return this;
            }

            /**
             * <p>The JSON character string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3030718.html">vivo Atomic Island push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;operation&quot;: 0,
             *     &quot;scene&quot;: &quot;HEALTH_REGISTER&quot;,
             *     &quot;templateType&quot;: 1,
             *     &quot;showNotify&quot;: true,
             *     &quot;changeRecord&quot;: 999,
             *     &quot;capsuleData&quot;: {
             *         &quot;bgColor&quot;: &quot;#32d4d4&quot;
             *     }
             * }</p>
             */
            public Builder androidVivoLiveMessage(String androidVivoLiveMessage) {
                this.androidVivoLiveMessage = androidVivoLiveMessage;
                return this;
            }

            /**
             * <p>The notification type for the vivo channel. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Formal push. This is the default value.</li>
             * <li><strong>1</strong>: Test push.</li>
             * </ul>
             * <blockquote>
             * <p>For test pushes, configure the test devices in the vivo console in advance. You can obtain the RegId of the test device by searching for &quot;onReceiveRegId regId&quot; in the device startup log.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidVivoPushMode(Integer androidVivoPushMode) {
                this.androidVivoPushMode = androidVivoPushMode;
                return this;
            }

            /**
             * <p>The receipt ID for the vivo channel. You can view this receipt ID in the application information of the push service on the vivo open platform.</p>
             * <blockquote>
             * <p>If the default receipt configuration on the vivo open platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, configure the default receipt ID for the vivo channel in the Alibaba Cloud EMAS Mobile Push console first.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder androidVivoReceiptId(String androidVivoReceiptId) {
                this.androidVivoReceiptId = androidVivoReceiptId;
                return this;
            }

            /**
             * <p>The vivo template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t1-ge3-lq</p>
             */
            public Builder androidVivoTemplateId(String androidVivoTemplateId) {
                this.androidVivoTemplateId = androidVivoTemplateId;
                return this;
            }

            /**
             * <p>The parameters of the vivo template. The value is a JSON object string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;keywords1&quot;:&quot;S123&quot;}</p>
             */
            public Builder androidVivoTemplateParams(String androidVivoTemplateParams) {
                this.androidVivoTemplateParams = androidVivoTemplateParams;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupActivity</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder androidXiaoMiActivity(String androidXiaoMiActivity) {
                this.androidXiaoMiActivity = androidXiaoMiActivity;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupBody</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder androidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
                this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. All third-party auxiliary pop-up windows are uniformly supported by the new <strong>AndroidPopupTitle</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder androidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
                this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. Since August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, and big images during pushes on new devices or systems.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png">https://f6.market.xiaomi.com/download/MiPass/aaa/bbb.png</a></p>
             */
            public Builder androidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
                this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
                return this;
            }

            /**
             * <p>The JSON character string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;param_v2&quot;: {
             *         &quot;business&quot;: &quot;taxi&quot;,
             *         &quot;updatable&quot;: true,
             *         &quot;orderId&quot;: &quot;A580202509130712&quot;,
             *         &quot;param_island&quot;: {
             *             &quot;islandProperty&quot;: 1,
             *             &quot;bigIslandArea&quot;: {
             *                 &quot;imageTextInfoLeft&quot;: {
             *                     &quot;type&quot;: 1
             *                 }
             *             }
             *         }
             *     }
             * }</p>
             */
            public Builder androidXiaomiFocusParam(String androidXiaomiFocusParam) {
                this.androidXiaomiFocusParam = androidXiaomiFocusParam;
                return this;
            }

            /**
             * <p>The JSON character string of the Xiaomi Super Island data images <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development integration, see References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;miui.focus.pic_ticker&quot;: &quot;<a href="https://example.com/ticker.jpg">https://example.com/ticker.jpg</a>&quot;,
             *     &quot;miui.focus.pic_aod&quot;: &quot;<a href="https://example.com/aod.jpg">https://example.com/aod.jpg</a>&quot;,
             *     &quot;miui.focus.pic_imageText&quot;: &quot;<a href="https://example.com/imageText.jpg">https://example.com/imageText.jpg</a>&quot;
             * }</p>
             */
            public Builder androidXiaomiFocusPics(String androidXiaomiFocusPics) {
                this.androidXiaomiFocusPics = androidXiaomiFocusPics;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. Since August 2023, Xiaomi no longer supports dynamically setting small icons, right-side icons, and big images during pushes on new devices or systems.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
             */
            public Builder androidXiaomiImageUrl(String androidXiaomiImageUrl) {
                this.androidXiaomiImageUrl = androidXiaomiImageUrl;
                return this;
            }

            /**
             * <p>The Xiaomi private message template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P10645</p>
             */
            public Builder androidXiaomiTemplateId(String androidXiaomiTemplateId) {
                this.androidXiaomiTemplateId = androidXiaomiTemplateId;
                return this;
            }

            /**
             * <p>The parameters of the Xiaomi private message template. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;keywords1&quot;:&quot;Tom&quot;,&quot;keywords2&quot;:&quot;phone&quot;}</p>
             */
            public Builder androidXiaomiTemplateParams(String androidXiaomiTemplateParams) {
                this.androidXiaomiTemplateParams = androidXiaomiTemplateParams;
                return this;
            }

            /**
             * <p>The content of the notification or message for Android and HarmonyOS pushes, or the content of the message or notification for iOS pushes. The content size is limited. For more information, see <a href="https://help.aliyun.com/document_detail/92832.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The device type. Valid values:</p>
             * <ul>
             * <li>HARMONY: HarmonyOS device</li>
             * <li>iOS: iOS device</li>
             * <li>ANDROID: Android device</li>
             * <li>ALL: If the AppKey belongs to a legacy dual-platform application, this value indicates that the message is pushed to both Android and iOS devices. If the AppKey belongs to a new single-platform application, this value has the same effect as specifying the device type corresponding to the application type.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HARMONY</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The expiration time of the offline message or notification. This parameter is used together with StoreOffline. An expired message or notification is not sent. The maximum retention period is 72 hours. Default value: 72 hours.</p>
             * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. The expiration time cannot be earlier than the current time or 3 seconds after the scheduled sending time (ExpireTime &gt; PushTime + 3 seconds). The 3-second buffer is used to compensate for network and system latency. Set the expiration time to at least 1 minute for single pushes and at least 10 minutes for full pushes and batch pushes.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-20T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The action corresponding to the ability of the built-in page in the app.</p>
             * <blockquote>
             * <p>Notice: When HarmonyActionType is set to APP_CUSTOM_PAGE, you must specify at least one of the HarmonyUri and HarmonyAction fields.</p>
             * </blockquote>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>com.example.action</p>
             */
            public Builder harmonyAction(String harmonyAction) {
                this.harmonyAction = harmonyAction;
                return this;
            }

            /**
             * <p>The action to perform after the notification is clicked. Valid values:</p>
             * <ul>
             * <li>APP_HOME_PAGE: Opens the app home page.</li>
             * <li>APP_CUSTOM_PAGE: Opens a custom page in the app.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APP_HOME_PAGE</p>
             */
            public Builder harmonyActionType(String harmonyActionType) {
                this.harmonyActionType = harmonyActionType;
                return this;
            }

            /**
             * <p>The increment value for the badge of the HarmonyOS app. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">Description of the addNum field for HarmonyOS badges</a>.</br>
             * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder harmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
                this.harmonyBadgeAddNum = harmonyBadgeAddNum;
                return this;
            }

            /**
             * <p>The fixed number for the badge of the HarmonyOS app. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">Description of the setNum field for HarmonyOS badges</a>.</br>
             * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder harmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
                this.harmonyBadgeSetNum = harmonyBadgeSetNum;
                return this;
            }

            /**
             * <p>The category of the notification message. After you apply for the notification message self-categorization permission, this parameter is used as the identity of the message type. Different notification message types affect the display and reminder methods of messages. Valid values:</p>
             * <ul>
             * <li>IM: Instant chat.</li>
             * <li>VOIP: Audio and video calls.</li>
             * <li>SUBSCRIPTION: subscribe.</li>
             * <li>TRAVEL: Travel.</li>
             * <li>HEALTH: Health.</li>
             * <li>WORK: Work reminders.</li>
             * <li>ACCOUNT: Account updates.</li>
             * <li>EXPRESS: Orders and logistics.</li>
             * <li>FINANCE: Finance.</li>
             * <li>DEVICE_REMINDER: Device reminders.</li>
             * <li>MAIL: Emails.</li>
             * <li>CUSTOMER_SERVICE: Customer service messages.</li>
             * <li>MARKETING: News, content recommendations, social updates, product promotions, financial updates, lifestyle information, surveys, feature recommendations, and operational activity. This category only identifies the content and does not accelerate message sending. These are collectively referred to as information and marketing messages.</li>
             * </ul>
             * <p>For details, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>IM</p>
             */
            public Builder harmonyCategory(String harmonyCategory) {
                this.harmonyCategory = harmonyCategory;
                return this;
            }

            /**
             * <p>The extended properties of the notification. This parameter does not take effect when the push type PushType is set to MESSAGE.</p>
             * <p>This parameter must be passed in JSON map format. Otherwise, a parsing error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
             */
            public Builder harmonyExtParameters(String harmonyExtParameters) {
                this.harmonyExtParameters = harmonyExtParameters;
                return this;
            }

            /**
             * <p>The extra data of the extended notification message.</br>
             * This parameter is valid when you send HarmonyOS extended notification messages.</br>
             * This parameter is conceptually equivalent to the extraData field of a HarmonyOS extended notification message. For the specific definition, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">HarmonyOS ExtensionPayload description</a>.</br>
             * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample extra data</p>
             */
            public Builder harmonyExtensionExtraData(String harmonyExtensionExtraData) {
                this.harmonyExtensionExtraData = harmonyExtensionExtraData;
                return this;
            }

            /**
             * <p>Specifies whether to send a HarmonyOS extended notification message when PushType is set to NOTICE. Valid values:</p>
             * <ul>
             * <li>true: Sends an extended notification message.</li>
             * <li>false: Sends a normal notification. This is the default value.</li>
             * </ul>
             * <p>You must apply for permissions on the HarmonyOS side before you can send extended notification messages. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">Send extended notification messages</a> in the HarmonyOS documentation.</br>
             * This parameter is supported in HarmonyOS SDK 1.2.0 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder harmonyExtensionPush(Boolean harmonyExtensionPush) {
                this.harmonyExtensionPush = harmonyExtensionPush;
                return this;
            }

            /**
             * <p>The URL of the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
             * <blockquote>
             * <p>Supported image formats include PNG, JPG, JPEG, HEIF, GIF, and BMP. The product of the image width and height must be less than 25,000 pixels.</p>
             * </blockquote>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
             */
            public Builder harmonyImageUrl(String harmonyImageUrl) {
                this.harmonyImageUrl = harmonyImageUrl;
                return this;
            }

            /**
             * <p>The content in the multi-line text style. This field is required when HarmonyRenderStyle is set to MULTI_LINE. A maximum of three content items are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1.content1&quot;,&quot;2.content2&quot;,&quot;3.content3&quot;]</p>
             */
            public Builder harmonyInboxContent(String harmonyInboxContent) {
                this.harmonyInboxContent = harmonyInboxContent;
                return this;
            }

            /**
             * <p>The JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development integration, refer to <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;activityId&quot;: 1,
             *   &quot;operation&quot;: 0,
             *   &quot;event&quot;: &quot;TAXI&quot;,
             *   &quot;status&quot;: &quot;DRIVER_ON_THE_WAY&quot;,
             *   &quot;activityData&quot;: {
             *     &quot;notificationData&quot;: {
             *       &quot;type&quot;: 3
             *     }
             *   }
             * }</p>
             */
            public Builder harmonyLiveViewPayload(String harmonyLiveViewPayload) {
                this.harmonyLiveViewPayload = harmonyLiveViewPayload;
                return this;
            }

            /**
             * <p>The type of the notification channel to use. This parameter is valid only when the Alibaba Cloud proprietary channel is online. Valid values:</p>
             * <ul>
             * <li>SOCIAL_COMMUNICATION: Social communication.</li>
             * <li>SERVICE_INFORMATION: Service reminders.</li>
             * <li>CONTENT_INFORMATION: Content information.</li>
             * <li>CUSTOMER_SERVICE: Customer service messages. This type is used for customer service messages between users and merchants and must be initiated by the user.</li>
             * <li>OTHER_TYPES: Other types.</li>
             * </ul>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>SOCIAL_COMMUNICATION</p>
             */
            public Builder harmonyNotificationSlotType(String harmonyNotificationSlotType) {
                this.harmonyNotificationSlotType = harmonyNotificationSlotType;
                return this;
            }

            /**
             * <p>The unique identifier of each message when the notification is displayed. If this parameter is not specified, the push service automatically generates a unique identifier for each message. Different notification messages can have the same notifyId to allow new messages to overwrite old ones.</p>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder harmonyNotifyId(Integer harmonyNotifyId) {
                this.harmonyNotifyId = harmonyNotifyId;
                return this;
            }

            /**
             * <p>The receipt ID for the HarmonyOS channel. You can view this receipt ID in the receipt parameter settings of the HarmonyOS channel push operations platform.</p>
             * <blockquote>
             * <p>If the default receipt configured on the HarmonyOS channel push operations platform is the Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, we recommend that you configure the default receipt ID for the HarmonyOS channel in the Alibaba Cloud EMAS shift Push console first.</p>
             * </blockquote>
             * <p>For details, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>RCPB***DFD5</p>
             */
            public Builder harmonyReceiptId(String harmonyReceiptId) {
                this.harmonyReceiptId = harmonyReceiptId;
                return this;
            }

            /**
             * <p>Specifies whether to use the auxiliary pop-up window feature when a push notification of the message type is sent to an offline device. Default value: false. This parameter takes effect only when PushType is set to MESSAGE.</p>
             * <p>If the message is successfully converted to a notification and pushed, the received notification displays the data specified by the HarmonyRemindTitle and HarmonyRemindBody parameters on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder harmonyRemind(Boolean harmonyRemind) {
                this.harmonyRemind = harmonyRemind;
                return this;
            }

            /**
             * <p>The HarmonyOS notification content used when a message is converted to a notification. This parameter is valid only when HarmonyRemind is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>You have a new message. Please check it</p>
             */
            public Builder harmonyRemindBody(String harmonyRemindBody) {
                this.harmonyRemindBody = harmonyRemindBody;
                return this;
            }

            /**
             * <p>The HarmonyOS notification title used when a message is converted to a notification. This parameter is valid only when HarmonyRemind is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>New message</p>
             */
            public Builder harmonyRemindTitle(String harmonyRemindTitle) {
                this.harmonyRemindTitle = harmonyRemindTitle;
                return this;
            }

            /**
             * <p>The style of the notification message. Valid values:</p>
             * <ul>
             * <li>NORMAL: Normal notification. This is the default value.</li>
             * <li>MULTI_LINE: Multi-line text style.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder harmonyRenderStyle(String harmonyRenderStyle) {
                this.harmonyRenderStyle = harmonyRenderStyle;
                return this;
            }

            /**
             * <p>Specifies whether the message is a test message. Valid values:</p>
             * <ul>
             * <li>false: Normal message. This is the default value.</li>
             * <li>true: Test message.</li>
             * </ul>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.testMessage</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder harmonyTestMessage(Boolean harmonyTestMessage) {
                this.harmonyTestMessage = harmonyTestMessage;
                return this;
            }

            /**
             * <p>The URI corresponding to the ability of the built-in page in the app.</p>
             * <blockquote>
             * <p>Notice: When HarmonyActionType is set to APP_CUSTOM_PAGE, you must specify at least one of the HarmonyUri and HarmonyAction fields. If multiple abilities exist, specify the action and URI for each ability. The action is preferentially used to find the corresponding built-in page in the app.</p>
             * </blockquote>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
             */
            public Builder harmonyUri(String harmonyUri) {
                this.harmonyUri = harmonyUri;
                return this;
            }

            /**
             * <p>The custom identifier of the push task. If JobKey is not empty, this field is included in the receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder jobKey(String jobKey) {
                this.jobKey = jobKey;
                return this;
            }

            /**
             * <p>The scheduled sending time. If this parameter is not specified, the message is sent immediately.</p>
             * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-20T00:00:00Z</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>The push type. Valid values:</p>
             * <ul>
             * <li>MESSAGE: message</li>
             * <li>NOTICE: notification</li>
             * </ul>
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
             * <p>The sending channels. Valid values:</p>
             * <ul>
             * <li>accs: Alibaba Cloud proprietary channel</li>
             * <li>huawei: Huawei channel</li>
             * <li>honor: Honor channel</li>
             * <li>xiaomi: Xiaomi channel</li>
             * <li>oppo: OPPO channel</li>
             * <li>vivo: vivo channel</li>
             * <li>meizu: Meizu channel</li>
             * <li>gcm: Google GCM channel (legacy HTTP)</li>
             * <li>fcm: Google Firebase channel (HTTP v1 API)</li>
             * <li>apns: APNs channel</li>
             * <li>harmony: HarmonyOS channel</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is not configured, all channels are available.</li>
             * <li>If this parameter is configured, only the specified channels are used.</li>
             * <li>If the configured channels conflict with the sending policy (for example, iOS notifications can only be sent through the APNs channel, but apns is not included in this parameter), the message is not sent.</li>
             * <li>If gcm is configured, both Google GCM and FCM channels can be used. If fcm is configured, only the Google FCM channel can be used.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>accs,huawei,xiaomi</p>
             */
            public Builder sendChannels(String sendChannels) {
                this.sendChannels = sendChannels;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sendSpeed(Integer sendSpeed) {
                this.sendSpeed = sendSpeed;
                return this;
            }

            /**
             * <p>Specifies whether to save offline messages or notifications. Default value: false.</p>
             * <p>If this parameter is set to true and the user is offline during the push, the message or notification is sent again when the user comes online within the expiration time specified by ExpireTime. The default value of ExpireTime is 72 hours. iOS notifications are sent through the APNs channel and are not affected by the StoreOffline parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder storeOffline(Boolean storeOffline) {
                this.storeOffline = storeOffline;
                return this;
            }

            /**
             * <p>The push target. Valid values:</p>
             * <ul>
             * <li>DEVICE: device</li>
             * <li>ACCOUNT: account</li>
             * <li>ALIAS: alias</li>
             * </ul>
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
             * <p>The target value, which is specified based on the Target parameter. Separate multiple values with commas. If the number of values exceeds the limit, you must push the message in multiple batches.</p>
             * <ul>
             * <li>If Target is set to DEVICE, the value is in the format of <code>deviceid1,deviceid2</code>. A maximum of 1,000 devices are supported.</li>
             * <li>If Target is set to ACCOUNT, the value is in the format of <code>account1,account2</code>. A maximum of 1,000 accounts are supported.</li>
             * <li>If Target is set to ALIAS, the value is in the format of <code>alias1,alias2</code>. A maximum of 1,000 aliases are supported.</li>
             * </ul>
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
             * <p>The title of the notification or message. Maximum length: 200 bytes.
             * This parameter is required for Android and HarmonyOS pushes. This parameter is optional for iOS notification pushes. If you specify this parameter for iOS:</p>
             * <ul>
             * <li>For iOS 10 and later, the title is displayed in the notification.</li>
             * <li>For iOS 8.2 to iOS 9.x, the title replaces the application name in the notification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Specifies whether to automatically truncate excessively long titles and content.
             * Note: This parameter applies only to vendor channels that explicitly limit the length of titles and content. It does not apply to channels such as APNs, Huawei, and Honor, which do not limit the length of titles and content but only limit the total request body size.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder trim(Boolean trim) {
                this.trim = trim;
                return this;
            }

            /**
             * <p>To send iOS notifications through the APNs center, you must specify the corresponding environment context. Valid values:</p>
             * <ul>
             * <li>DEV: The development environment. This value applies to applications that are directly installed and debugged by using Xcode.</li>
             * <li>PRODUCT: The production environment. This value applies to applications distributed through the App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder iOSApnsEnv(String iOSApnsEnv) {
                this.iOSApnsEnv = iOSApnsEnv;
                return this;
            }

            /**
             * <p>The badge number displayed in the upper-right corner of the iOS application icon.</p>
             * <blockquote>
             * <p>If iOSBadgeAutoIncrement is set to true, this parameter must be left empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder iOSBadge(Integer iOSBadge) {
                this.iOSBadge = iOSBadge;
                return this;
            }

            /**
             * <p>Specifies whether to enable the automatic badge increment feature. Default value: false.</p>
             * <blockquote>
             * <p>When this parameter is set to true, iOSBadge must be left empty.</p>
             * </blockquote>
             * <p>The automatic badge increment feature maintains the badge count for each device on the push server. This feature requires SDK V1.9.5 or later, and users must actively synchronize the badge number to the server.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder iOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
                this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
                return this;
            }

            /**
             * <p>The extension property of the iOS notification.</p>
             * <p>For iOS 10 and later, you can specify the resource URL for rich media push notifications in this parameter: <code>{&quot;attachment&quot;: &quot;https://www.example.com/notification_pic.png&quot;}</code>. This parameter must be passed in JSON map format. Otherwise, a parse error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;attachment&quot;: &quot;<a href="https://www.example.com/notification_pic.png%22%7D">https://www.example.com/notification_pic.png&quot;}</a></p>
             */
            public Builder iOSExtParameters(String iOSExtParameters) {
                this.iOSExtParameters = iOSExtParameters;
                return this;
            }

            /**
             * <p>The interruption level. Valid values:</p>
             * <ul>
             * <li><p>passive: The system adds the notification to the notification list without turning on the screen or playing a sound.</p>
             * </li>
             * <li><p>active: The system displays the notification immediately, turns on the screen, and can play a sound.</p>
             * </li>
             * <li><p>time-sensitive: The system displays the notification immediately, turns on the screen, and can play a sound, but does not break through the system notification controls.</p>
             * </li>
             * <li><p>critical: The system displays the notification immediately, turns on the screen, and plays a sound bypassing the silent switch.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder iOSInterruptionLevel(String iOSInterruptionLevel) {
                this.iOSInterruptionLevel = iOSInterruptionLevel;
                return this;
            }

            /**
             * <p>The JSON string that contains the static pass-through parameters for Dynamic Island pushes. Static parameter includes static user-defined information, such as product IDs and order information.</p>
             * <blockquote>
             * <p>Static parameter is required when iOSLiveActivityEvent is set to start.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;orderId&quot;: &quot;12345&quot;, &quot;product&quot;: &quot;Shoes&quot;}</p>
             */
            public Builder iOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
                this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
                return this;
            }

            /**
             * <p>The type of the Live Activity to be started.</p>
             * <blockquote>
             * <p>This parameter is required when iOSLiveActivityEvent is set to start.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OrderActivityAttributes</p>
             */
            public Builder iOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
                this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
                return this;
            }

            /**
             * <p>The pass-through dynamic parameter for Dynamic Island pushes. This parameter includes real-time update information, such as price and inventory changes.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;: &quot;delivered&quot;, &quot;estimatedArrival&quot;: &quot;2023-12-31T12:00:00Z&quot;}</p>
             */
            public Builder iOSLiveActivityContentState(String iOSLiveActivityContentState) {
                this.iOSLiveActivityContentState = iOSLiveActivityContentState;
                return this;
            }

            /**
             * <p>The time until which the ended Live Activity remains on the Lock Screen. The maximum retention period is 4 hours.</p>
             * 
             * <strong>example:</strong>
             * <p>1743131967</p>
             */
            public Builder iOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
                this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
                return this;
            }

            /**
             * <p>The event to start, update, or end a Live Activity. Valid values: start, update, and end.</p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder iOSLiveActivityEvent(String iOSLiveActivityEvent) {
                this.iOSLiveActivityEvent = iOSLiveActivityEvent;
                return this;
            }

            /**
             * <p>The Live Activity ID reported by the device to the user server. This is the unique identifier of the Live Activity.</p>
             * 
             * <strong>example:</strong>
             * <p>66B94673-B32E-4CA7-863C-3E523054FD46</p>
             */
            public Builder iOSLiveActivityId(String iOSLiveActivityId) {
                this.iOSLiveActivityId = iOSLiveActivityId;
                return this;
            }

            /**
             * <p>The second-level timestamp that marks the expiration time of the activity content.</p>
             * 
             * <strong>example:</strong>
             * <p>1743131967</p>
             */
            public Builder iOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
                this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
                return this;
            }

            /**
             * <p>The sound of the iOS notification. Specify the name of the audio file stored in the app bundle or the sandbox Library/Sounds directory. For more information, see How to set the notification sound for iOS pushes.</p>
             * <p>If this parameter is set to an empty string (&quot;&quot;), the notification is silent. If this parameter is not specified, the default value &quot;default&quot; is used, which indicates the system prompt sound.</p>
             * 
             * <strong>example:</strong>
             * <p>””</p>
             */
            public Builder iOSMusic(String iOSMusic) {
                this.iOSMusic = iOSMusic;
                return this;
            }

            /**
             * <p>The iOS notification processing extension flag (iOS 10 and later). If this parameter is set to true, the notification pushed by APNs can be processed by the extension before it is displayed. This parameter must be set to true for silent notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder iOSMutableContent(Boolean iOSMutableContent) {
                this.iOSMutableContent = iOSMutableContent;
                return this;
            }

            /**
             * <p>The category of the iOS notification (iOS 10 and later).</p>
             * 
             * <strong>example:</strong>
             * <p>ios</p>
             */
            public Builder iOSNotificationCategory(String iOSNotificationCategory) {
                this.iOSNotificationCategory = iOSNotificationCategory;
                return this;
            }

            /**
             * <p>The collapse ID. If a device receives messages with the same CollapseId, the messages are merged into one. If the device is offline and continuously receives messages with the same CollapseId, only one notification is displayed in the notification bar. This parameter is supported in iOS 10 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>ZD2011</p>
             */
            public Builder iOSNotificationCollapseId(String iOSNotificationCollapseId) {
                this.iOSNotificationCollapseId = iOSNotificationCollapseId;
                return this;
            }

            /**
             * <p>The thread ID used to group iOS remote notifications and mark the identifier of the collapsed group. This parameter is supported only in iOS 12.0 and later.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder iOSNotificationThreadId(String iOSNotificationThreadId) {
                this.iOSNotificationThreadId = iOSNotificationThreadId;
                return this;
            }

            /**
             * <p>The relevance score for summary highlighting. Valid values: a floating-point number in the range of [0,1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder iOSRelevanceScore(Double iOSRelevanceScore) {
                this.iOSRelevanceScore = iOSRelevanceScore;
                return this;
            }

            /**
             * <p>If the device is offline during a message push (that is, the persistent connection to the Mobile Push server is disconnected), the message is delivered once as a notification through the Apple APNs channel.</p>
             * <blockquote>
             * <p>Offline message-to-notification conversion applies only to the production environment.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder iOSRemind(Boolean iOSRemind) {
                this.iOSRemind = iOSRemind;
                return this;
            }

            /**
             * <p>The iOS notification content used when an iOS message is converted to a notification. This parameter is valid only when iOSApnsEnv is set to PRODUCT and iOSRemind is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>iOS notification body</p>
             */
            public Builder iOSRemindBody(String iOSRemindBody) {
                this.iOSRemindBody = iOSRemindBody;
                return this;
            }

            /**
             * <p>Specifies whether to enable iOS silent notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder iOSSilentNotification(Boolean iOSSilentNotification) {
                this.iOSSilentNotification = iOSSilentNotification;
                return this;
            }

            /**
             * <p>The subtitle of the iOS notification (iOS 10 and later).</p>
             * 
             * <strong>example:</strong>
             * <p>subtitle</p>
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
