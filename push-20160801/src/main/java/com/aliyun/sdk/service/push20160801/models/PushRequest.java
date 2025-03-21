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
 * {@link PushRequest} extends {@link RequestModel}
 *
 * <p>PushRequest</p>
 */
public class PushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidActivity")
    private String androidActivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBadgeAddNum")
    @com.aliyun.core.annotation.Validation(maximum = 99, minimum = 1)
    private Integer androidBadgeAddNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBadgeClass")
    private String androidBadgeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBadgeSetNum")
    @com.aliyun.core.annotation.Validation(maximum = 99, minimum = 1)
    private Integer androidBadgeSetNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBigBody")
    private String androidBigBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBigPictureUrl")
    private String androidBigPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidBigTitle")
    private String androidBigTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidExtParameters")
    private String androidExtParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidHonorTargetUserType")
    private Integer androidHonorTargetUserType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidHuaweiReceiptId")
    private String androidHuaweiReceiptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidHuaweiTargetUserType")
    private Integer androidHuaweiTargetUserType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidImageUrl")
    private String androidImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInboxBody")
    private String androidInboxBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiCategory")
    private String androidMessageHuaweiCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMessageHuaweiUrgency")
    private String androidMessageHuaweiUrgency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMessageOppoCategory")
    private String androidMessageOppoCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMessageOppoNotifyLevel")
    private Integer androidMessageOppoNotifyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMessageVivoCategory")
    private String androidMessageVivoCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidMusic")
    private String androidMusic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationBarPriority")
    @com.aliyun.core.annotation.Validation(maximum = 2)
    private Integer androidNotificationBarPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationBarType")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer androidNotificationBarType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationChannel")
    private String androidNotificationChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationGroup")
    private String androidNotificationGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationHonorChannel")
    private String androidNotificationHonorChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationHuaweiChannel")
    private String androidNotificationHuaweiChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationNotifyId")
    private Integer androidNotificationNotifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationThreadId")
    private String androidNotificationThreadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationVivoChannel")
    private String androidNotificationVivoChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotificationXiaomiChannel")
    private String androidNotificationXiaomiChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidNotifyType")
    private String androidNotifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidOpenType")
    private String androidOpenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidOpenUrl")
    private String androidOpenUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidPopupActivity")
    private String androidPopupActivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidPopupBody")
    private String androidPopupBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidPopupTitle")
    private String androidPopupTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidRemind")
    private Boolean androidRemind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidRenderStyle")
    private Integer androidRenderStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidTargetUserType")
    private Integer androidTargetUserType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidVivoPushMode")
    private Integer androidVivoPushMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidVivoReceiptId")
    private String androidVivoReceiptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiActivity")
    @Deprecated
    private String androidXiaoMiActivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiNotifyBody")
    @Deprecated
    private String androidXiaoMiNotifyBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidXiaoMiNotifyTitle")
    @Deprecated
    private String androidXiaoMiNotifyTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidXiaomiBigPictureUrl")
    @Deprecated
    private String androidXiaomiBigPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidXiaomiImageUrl")
    @Deprecated
    private String androidXiaomiImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyAction")
    private String harmonyAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyActionType")
    private String harmonyActionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyBadgeAddNum")
    private Integer harmonyBadgeAddNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyBadgeSetNum")
    private Integer harmonyBadgeSetNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyCategory")
    private String harmonyCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyExtParameters")
    private String harmonyExtParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyExtensionExtraData")
    private String harmonyExtensionExtraData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyExtensionPush")
    private Boolean harmonyExtensionPush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyImageUrl")
    private String harmonyImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyInboxContent")
    private String harmonyInboxContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyNotificationSlotType")
    private String harmonyNotificationSlotType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyNotifyId")
    private Integer harmonyNotifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyReceiptId")
    private String harmonyReceiptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyRemind")
    private Boolean harmonyRemind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyRemindBody")
    private String harmonyRemindBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyRemindTitle")
    private String harmonyRemindTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyRenderStyle")
    private String harmonyRenderStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyTestMessage")
    private Boolean harmonyTestMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmonyUri")
    private String harmonyUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentToken")
    @com.aliyun.core.annotation.Validation(maxLength = 36, minLength = 36)
    private String idempotentToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobKey")
    private String jobKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushTime")
    private String pushTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendChannels")
    private String sendChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendSpeed")
    @Deprecated
    private Integer sendSpeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsDelaySecs")
    private Integer smsDelaySecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsParams")
    private String smsParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSendPolicy")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer smsSendPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignName")
    private String smsSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateName")
    private String smsTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoreOffline")
    private Boolean storeOffline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trim")
    private Boolean trim;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSApnsEnv")
    private String iOSApnsEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSBadge")
    private Integer iOSBadge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSBadgeAutoIncrement")
    private Boolean iOSBadgeAutoIncrement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSExtParameters")
    private String iOSExtParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSInterruptionLevel")
    private String iOSInterruptionLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityAttributes")
    private String iOSLiveActivityAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityAttributesType")
    private String iOSLiveActivityAttributesType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityContentState")
    private String iOSLiveActivityContentState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityDismissalDate")
    private Long iOSLiveActivityDismissalDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityEvent")
    private String iOSLiveActivityEvent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityId")
    private String iOSLiveActivityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSLiveActivityStaleDate")
    private Long iOSLiveActivityStaleDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSMusic")
    private String iOSMusic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSMutableContent")
    private Boolean iOSMutableContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSNotificationCategory")
    private String iOSNotificationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSNotificationCollapseId")
    private String iOSNotificationCollapseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSNotificationThreadId")
    private String iOSNotificationThreadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSRelevanceScore")
    private Double iOSRelevanceScore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSRemind")
    private Boolean iOSRemind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSRemindBody")
    private String iOSRemindBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSSilentNotification")
    private Boolean iOSSilentNotification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("iOSSubtitle")
    private String iOSSubtitle;

    private PushRequest(Builder builder) {
        super(builder);
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
        this.appKey = builder.appKey;
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
        this.idempotentToken = builder.idempotentToken;
        this.jobKey = builder.jobKey;
        this.pushTime = builder.pushTime;
        this.pushType = builder.pushType;
        this.sendChannels = builder.sendChannels;
        this.sendSpeed = builder.sendSpeed;
        this.smsDelaySecs = builder.smsDelaySecs;
        this.smsParams = builder.smsParams;
        this.smsSendPolicy = builder.smsSendPolicy;
        this.smsSignName = builder.smsSignName;
        this.smsTemplateName = builder.smsTemplateName;
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

    public static PushRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getAndroidRenderStyle() {
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
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
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
     * @return idempotentToken
     */
    public String getIdempotentToken() {
        return this.idempotentToken;
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
     * @return smsDelaySecs
     */
    public Integer getSmsDelaySecs() {
        return this.smsDelaySecs;
    }

    /**
     * @return smsParams
     */
    public String getSmsParams() {
        return this.smsParams;
    }

    /**
     * @return smsSendPolicy
     */
    public Integer getSmsSendPolicy() {
        return this.smsSendPolicy;
    }

    /**
     * @return smsSignName
     */
    public String getSmsSignName() {
        return this.smsSignName;
    }

    /**
     * @return smsTemplateName
     */
    public String getSmsTemplateName() {
        return this.smsTemplateName;
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

    public static final class Builder extends Request.Builder<PushRequest, Builder> {
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
        private String androidPopupActivity; 
        private String androidPopupBody; 
        private String androidPopupTitle; 
        private Boolean androidRemind; 
        private Integer androidRenderStyle; 
        private Integer androidTargetUserType; 
        private Integer androidVivoPushMode; 
        private String androidVivoReceiptId; 
        private String androidXiaoMiActivity; 
        private String androidXiaoMiNotifyBody; 
        private String androidXiaoMiNotifyTitle; 
        private String androidXiaomiBigPictureUrl; 
        private String androidXiaomiImageUrl; 
        private Long appKey; 
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
        private String idempotentToken; 
        private String jobKey; 
        private String pushTime; 
        private String pushType; 
        private String sendChannels; 
        private Integer sendSpeed; 
        private Integer smsDelaySecs; 
        private String smsParams; 
        private Integer smsSendPolicy; 
        private String smsSignName; 
        private String smsTemplateName; 
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
            super();
        } 

        private Builder(PushRequest request) {
            super(request);
            this.androidActivity = request.androidActivity;
            this.androidBadgeAddNum = request.androidBadgeAddNum;
            this.androidBadgeClass = request.androidBadgeClass;
            this.androidBadgeSetNum = request.androidBadgeSetNum;
            this.androidBigBody = request.androidBigBody;
            this.androidBigPictureUrl = request.androidBigPictureUrl;
            this.androidBigTitle = request.androidBigTitle;
            this.androidExtParameters = request.androidExtParameters;
            this.androidHonorTargetUserType = request.androidHonorTargetUserType;
            this.androidHuaweiReceiptId = request.androidHuaweiReceiptId;
            this.androidHuaweiTargetUserType = request.androidHuaweiTargetUserType;
            this.androidImageUrl = request.androidImageUrl;
            this.androidInboxBody = request.androidInboxBody;
            this.androidMessageHuaweiCategory = request.androidMessageHuaweiCategory;
            this.androidMessageHuaweiUrgency = request.androidMessageHuaweiUrgency;
            this.androidMessageOppoCategory = request.androidMessageOppoCategory;
            this.androidMessageOppoNotifyLevel = request.androidMessageOppoNotifyLevel;
            this.androidMessageVivoCategory = request.androidMessageVivoCategory;
            this.androidMusic = request.androidMusic;
            this.androidNotificationBarPriority = request.androidNotificationBarPriority;
            this.androidNotificationBarType = request.androidNotificationBarType;
            this.androidNotificationChannel = request.androidNotificationChannel;
            this.androidNotificationGroup = request.androidNotificationGroup;
            this.androidNotificationHonorChannel = request.androidNotificationHonorChannel;
            this.androidNotificationHuaweiChannel = request.androidNotificationHuaweiChannel;
            this.androidNotificationNotifyId = request.androidNotificationNotifyId;
            this.androidNotificationThreadId = request.androidNotificationThreadId;
            this.androidNotificationVivoChannel = request.androidNotificationVivoChannel;
            this.androidNotificationXiaomiChannel = request.androidNotificationXiaomiChannel;
            this.androidNotifyType = request.androidNotifyType;
            this.androidOpenType = request.androidOpenType;
            this.androidOpenUrl = request.androidOpenUrl;
            this.androidPopupActivity = request.androidPopupActivity;
            this.androidPopupBody = request.androidPopupBody;
            this.androidPopupTitle = request.androidPopupTitle;
            this.androidRemind = request.androidRemind;
            this.androidRenderStyle = request.androidRenderStyle;
            this.androidTargetUserType = request.androidTargetUserType;
            this.androidVivoPushMode = request.androidVivoPushMode;
            this.androidVivoReceiptId = request.androidVivoReceiptId;
            this.androidXiaoMiActivity = request.androidXiaoMiActivity;
            this.androidXiaoMiNotifyBody = request.androidXiaoMiNotifyBody;
            this.androidXiaoMiNotifyTitle = request.androidXiaoMiNotifyTitle;
            this.androidXiaomiBigPictureUrl = request.androidXiaomiBigPictureUrl;
            this.androidXiaomiImageUrl = request.androidXiaomiImageUrl;
            this.appKey = request.appKey;
            this.body = request.body;
            this.deviceType = request.deviceType;
            this.expireTime = request.expireTime;
            this.harmonyAction = request.harmonyAction;
            this.harmonyActionType = request.harmonyActionType;
            this.harmonyBadgeAddNum = request.harmonyBadgeAddNum;
            this.harmonyBadgeSetNum = request.harmonyBadgeSetNum;
            this.harmonyCategory = request.harmonyCategory;
            this.harmonyExtParameters = request.harmonyExtParameters;
            this.harmonyExtensionExtraData = request.harmonyExtensionExtraData;
            this.harmonyExtensionPush = request.harmonyExtensionPush;
            this.harmonyImageUrl = request.harmonyImageUrl;
            this.harmonyInboxContent = request.harmonyInboxContent;
            this.harmonyNotificationSlotType = request.harmonyNotificationSlotType;
            this.harmonyNotifyId = request.harmonyNotifyId;
            this.harmonyReceiptId = request.harmonyReceiptId;
            this.harmonyRemind = request.harmonyRemind;
            this.harmonyRemindBody = request.harmonyRemindBody;
            this.harmonyRemindTitle = request.harmonyRemindTitle;
            this.harmonyRenderStyle = request.harmonyRenderStyle;
            this.harmonyTestMessage = request.harmonyTestMessage;
            this.harmonyUri = request.harmonyUri;
            this.idempotentToken = request.idempotentToken;
            this.jobKey = request.jobKey;
            this.pushTime = request.pushTime;
            this.pushType = request.pushType;
            this.sendChannels = request.sendChannels;
            this.sendSpeed = request.sendSpeed;
            this.smsDelaySecs = request.smsDelaySecs;
            this.smsParams = request.smsParams;
            this.smsSendPolicy = request.smsSendPolicy;
            this.smsSignName = request.smsSignName;
            this.smsTemplateName = request.smsTemplateName;
            this.storeOffline = request.storeOffline;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
            this.trim = request.trim;
            this.iOSApnsEnv = request.iOSApnsEnv;
            this.iOSBadge = request.iOSBadge;
            this.iOSBadgeAutoIncrement = request.iOSBadgeAutoIncrement;
            this.iOSExtParameters = request.iOSExtParameters;
            this.iOSInterruptionLevel = request.iOSInterruptionLevel;
            this.iOSLiveActivityAttributes = request.iOSLiveActivityAttributes;
            this.iOSLiveActivityAttributesType = request.iOSLiveActivityAttributesType;
            this.iOSLiveActivityContentState = request.iOSLiveActivityContentState;
            this.iOSLiveActivityDismissalDate = request.iOSLiveActivityDismissalDate;
            this.iOSLiveActivityEvent = request.iOSLiveActivityEvent;
            this.iOSLiveActivityId = request.iOSLiveActivityId;
            this.iOSLiveActivityStaleDate = request.iOSLiveActivityStaleDate;
            this.iOSMusic = request.iOSMusic;
            this.iOSMutableContent = request.iOSMutableContent;
            this.iOSNotificationCategory = request.iOSNotificationCategory;
            this.iOSNotificationCollapseId = request.iOSNotificationCollapseId;
            this.iOSNotificationThreadId = request.iOSNotificationThreadId;
            this.iOSRelevanceScore = request.iOSRelevanceScore;
            this.iOSRemind = request.iOSRemind;
            this.iOSRemindBody = request.iOSRemindBody;
            this.iOSSilentNotification = request.iOSSilentNotification;
            this.iOSSubtitle = request.iOSSubtitle;
        } 

        /**
         * AndroidActivity.
         */
        public Builder androidActivity(String androidActivity) {
            this.putQueryParameter("AndroidActivity", androidActivity);
            this.androidActivity = androidActivity;
            return this;
        }

        /**
         * AndroidBadgeAddNum.
         */
        public Builder androidBadgeAddNum(Integer androidBadgeAddNum) {
            this.putQueryParameter("AndroidBadgeAddNum", androidBadgeAddNum);
            this.androidBadgeAddNum = androidBadgeAddNum;
            return this;
        }

        /**
         * AndroidBadgeClass.
         */
        public Builder androidBadgeClass(String androidBadgeClass) {
            this.putQueryParameter("AndroidBadgeClass", androidBadgeClass);
            this.androidBadgeClass = androidBadgeClass;
            return this;
        }

        /**
         * AndroidBadgeSetNum.
         */
        public Builder androidBadgeSetNum(Integer androidBadgeSetNum) {
            this.putQueryParameter("AndroidBadgeSetNum", androidBadgeSetNum);
            this.androidBadgeSetNum = androidBadgeSetNum;
            return this;
        }

        /**
         * AndroidBigBody.
         */
        public Builder androidBigBody(String androidBigBody) {
            this.putQueryParameter("AndroidBigBody", androidBigBody);
            this.androidBigBody = androidBigBody;
            return this;
        }

        /**
         * AndroidBigPictureUrl.
         */
        public Builder androidBigPictureUrl(String androidBigPictureUrl) {
            this.putQueryParameter("AndroidBigPictureUrl", androidBigPictureUrl);
            this.androidBigPictureUrl = androidBigPictureUrl;
            return this;
        }

        /**
         * AndroidBigTitle.
         */
        public Builder androidBigTitle(String androidBigTitle) {
            this.putQueryParameter("AndroidBigTitle", androidBigTitle);
            this.androidBigTitle = androidBigTitle;
            return this;
        }

        /**
         * AndroidExtParameters.
         */
        public Builder androidExtParameters(String androidExtParameters) {
            this.putQueryParameter("AndroidExtParameters", androidExtParameters);
            this.androidExtParameters = androidExtParameters;
            return this;
        }

        /**
         * AndroidHonorTargetUserType.
         */
        public Builder androidHonorTargetUserType(Integer androidHonorTargetUserType) {
            this.putQueryParameter("AndroidHonorTargetUserType", androidHonorTargetUserType);
            this.androidHonorTargetUserType = androidHonorTargetUserType;
            return this;
        }

        /**
         * AndroidHuaweiReceiptId.
         */
        public Builder androidHuaweiReceiptId(String androidHuaweiReceiptId) {
            this.putQueryParameter("AndroidHuaweiReceiptId", androidHuaweiReceiptId);
            this.androidHuaweiReceiptId = androidHuaweiReceiptId;
            return this;
        }

        /**
         * AndroidHuaweiTargetUserType.
         */
        public Builder androidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
            this.putQueryParameter("AndroidHuaweiTargetUserType", androidHuaweiTargetUserType);
            this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
            return this;
        }

        /**
         * AndroidImageUrl.
         */
        public Builder androidImageUrl(String androidImageUrl) {
            this.putQueryParameter("AndroidImageUrl", androidImageUrl);
            this.androidImageUrl = androidImageUrl;
            return this;
        }

        /**
         * AndroidInboxBody.
         */
        public Builder androidInboxBody(String androidInboxBody) {
            this.putQueryParameter("AndroidInboxBody", androidInboxBody);
            this.androidInboxBody = androidInboxBody;
            return this;
        }

        /**
         * AndroidMessageHuaweiCategory.
         */
        public Builder androidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
            this.putQueryParameter("AndroidMessageHuaweiCategory", androidMessageHuaweiCategory);
            this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
            return this;
        }

        /**
         * AndroidMessageHuaweiUrgency.
         */
        public Builder androidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
            this.putQueryParameter("AndroidMessageHuaweiUrgency", androidMessageHuaweiUrgency);
            this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
            return this;
        }

        /**
         * AndroidMessageOppoCategory.
         */
        public Builder androidMessageOppoCategory(String androidMessageOppoCategory) {
            this.putQueryParameter("AndroidMessageOppoCategory", androidMessageOppoCategory);
            this.androidMessageOppoCategory = androidMessageOppoCategory;
            return this;
        }

        /**
         * AndroidMessageOppoNotifyLevel.
         */
        public Builder androidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
            this.putQueryParameter("AndroidMessageOppoNotifyLevel", androidMessageOppoNotifyLevel);
            this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
            return this;
        }

        /**
         * AndroidMessageVivoCategory.
         */
        public Builder androidMessageVivoCategory(String androidMessageVivoCategory) {
            this.putQueryParameter("AndroidMessageVivoCategory", androidMessageVivoCategory);
            this.androidMessageVivoCategory = androidMessageVivoCategory;
            return this;
        }

        /**
         * AndroidMusic.
         */
        public Builder androidMusic(String androidMusic) {
            this.putQueryParameter("AndroidMusic", androidMusic);
            this.androidMusic = androidMusic;
            return this;
        }

        /**
         * AndroidNotificationBarPriority.
         */
        public Builder androidNotificationBarPriority(Integer androidNotificationBarPriority) {
            this.putQueryParameter("AndroidNotificationBarPriority", androidNotificationBarPriority);
            this.androidNotificationBarPriority = androidNotificationBarPriority;
            return this;
        }

        /**
         * AndroidNotificationBarType.
         */
        public Builder androidNotificationBarType(Integer androidNotificationBarType) {
            this.putQueryParameter("AndroidNotificationBarType", androidNotificationBarType);
            this.androidNotificationBarType = androidNotificationBarType;
            return this;
        }

        /**
         * AndroidNotificationChannel.
         */
        public Builder androidNotificationChannel(String androidNotificationChannel) {
            this.putQueryParameter("AndroidNotificationChannel", androidNotificationChannel);
            this.androidNotificationChannel = androidNotificationChannel;
            return this;
        }

        /**
         * AndroidNotificationGroup.
         */
        public Builder androidNotificationGroup(String androidNotificationGroup) {
            this.putQueryParameter("AndroidNotificationGroup", androidNotificationGroup);
            this.androidNotificationGroup = androidNotificationGroup;
            return this;
        }

        /**
         * AndroidNotificationHonorChannel.
         */
        public Builder androidNotificationHonorChannel(String androidNotificationHonorChannel) {
            this.putQueryParameter("AndroidNotificationHonorChannel", androidNotificationHonorChannel);
            this.androidNotificationHonorChannel = androidNotificationHonorChannel;
            return this;
        }

        /**
         * AndroidNotificationHuaweiChannel.
         */
        public Builder androidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
            this.putQueryParameter("AndroidNotificationHuaweiChannel", androidNotificationHuaweiChannel);
            this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
            return this;
        }

        /**
         * AndroidNotificationNotifyId.
         */
        public Builder androidNotificationNotifyId(Integer androidNotificationNotifyId) {
            this.putQueryParameter("AndroidNotificationNotifyId", androidNotificationNotifyId);
            this.androidNotificationNotifyId = androidNotificationNotifyId;
            return this;
        }

        /**
         * AndroidNotificationThreadId.
         */
        public Builder androidNotificationThreadId(String androidNotificationThreadId) {
            this.putQueryParameter("AndroidNotificationThreadId", androidNotificationThreadId);
            this.androidNotificationThreadId = androidNotificationThreadId;
            return this;
        }

        /**
         * AndroidNotificationVivoChannel.
         */
        public Builder androidNotificationVivoChannel(String androidNotificationVivoChannel) {
            this.putQueryParameter("AndroidNotificationVivoChannel", androidNotificationVivoChannel);
            this.androidNotificationVivoChannel = androidNotificationVivoChannel;
            return this;
        }

        /**
         * AndroidNotificationXiaomiChannel.
         */
        public Builder androidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
            this.putQueryParameter("AndroidNotificationXiaomiChannel", androidNotificationXiaomiChannel);
            this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
            return this;
        }

        /**
         * AndroidNotifyType.
         */
        public Builder androidNotifyType(String androidNotifyType) {
            this.putQueryParameter("AndroidNotifyType", androidNotifyType);
            this.androidNotifyType = androidNotifyType;
            return this;
        }

        /**
         * AndroidOpenType.
         */
        public Builder androidOpenType(String androidOpenType) {
            this.putQueryParameter("AndroidOpenType", androidOpenType);
            this.androidOpenType = androidOpenType;
            return this;
        }

        /**
         * AndroidOpenUrl.
         */
        public Builder androidOpenUrl(String androidOpenUrl) {
            this.putQueryParameter("AndroidOpenUrl", androidOpenUrl);
            this.androidOpenUrl = androidOpenUrl;
            return this;
        }

        /**
         * AndroidPopupActivity.
         */
        public Builder androidPopupActivity(String androidPopupActivity) {
            this.putQueryParameter("AndroidPopupActivity", androidPopupActivity);
            this.androidPopupActivity = androidPopupActivity;
            return this;
        }

        /**
         * AndroidPopupBody.
         */
        public Builder androidPopupBody(String androidPopupBody) {
            this.putQueryParameter("AndroidPopupBody", androidPopupBody);
            this.androidPopupBody = androidPopupBody;
            return this;
        }

        /**
         * AndroidPopupTitle.
         */
        public Builder androidPopupTitle(String androidPopupTitle) {
            this.putQueryParameter("AndroidPopupTitle", androidPopupTitle);
            this.androidPopupTitle = androidPopupTitle;
            return this;
        }

        /**
         * AndroidRemind.
         */
        public Builder androidRemind(Boolean androidRemind) {
            this.putQueryParameter("AndroidRemind", androidRemind);
            this.androidRemind = androidRemind;
            return this;
        }

        /**
         * AndroidRenderStyle.
         */
        public Builder androidRenderStyle(Integer androidRenderStyle) {
            this.putQueryParameter("AndroidRenderStyle", androidRenderStyle);
            this.androidRenderStyle = androidRenderStyle;
            return this;
        }

        /**
         * AndroidTargetUserType.
         */
        public Builder androidTargetUserType(Integer androidTargetUserType) {
            this.putQueryParameter("AndroidTargetUserType", androidTargetUserType);
            this.androidTargetUserType = androidTargetUserType;
            return this;
        }

        /**
         * AndroidVivoPushMode.
         */
        public Builder androidVivoPushMode(Integer androidVivoPushMode) {
            this.putQueryParameter("AndroidVivoPushMode", androidVivoPushMode);
            this.androidVivoPushMode = androidVivoPushMode;
            return this;
        }

        /**
         * AndroidVivoReceiptId.
         */
        public Builder androidVivoReceiptId(String androidVivoReceiptId) {
            this.putQueryParameter("AndroidVivoReceiptId", androidVivoReceiptId);
            this.androidVivoReceiptId = androidVivoReceiptId;
            return this;
        }

        /**
         * AndroidXiaoMiActivity.
         */
        public Builder androidXiaoMiActivity(String androidXiaoMiActivity) {
            this.putQueryParameter("AndroidXiaoMiActivity", androidXiaoMiActivity);
            this.androidXiaoMiActivity = androidXiaoMiActivity;
            return this;
        }

        /**
         * AndroidXiaoMiNotifyBody.
         */
        public Builder androidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
            this.putQueryParameter("AndroidXiaoMiNotifyBody", androidXiaoMiNotifyBody);
            this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
            return this;
        }

        /**
         * AndroidXiaoMiNotifyTitle.
         */
        public Builder androidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
            this.putQueryParameter("AndroidXiaoMiNotifyTitle", androidXiaoMiNotifyTitle);
            this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
            return this;
        }

        /**
         * AndroidXiaomiBigPictureUrl.
         */
        public Builder androidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
            this.putQueryParameter("AndroidXiaomiBigPictureUrl", androidXiaomiBigPictureUrl);
            this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
            return this;
        }

        /**
         * AndroidXiaomiImageUrl.
         */
        public Builder androidXiaomiImageUrl(String androidXiaomiImageUrl) {
            this.putQueryParameter("AndroidXiaomiImageUrl", androidXiaomiImageUrl);
            this.androidXiaomiImageUrl = androidXiaomiImageUrl;
            return this;
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
         * Body.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
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
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * HarmonyAction.
         */
        public Builder harmonyAction(String harmonyAction) {
            this.putQueryParameter("HarmonyAction", harmonyAction);
            this.harmonyAction = harmonyAction;
            return this;
        }

        /**
         * HarmonyActionType.
         */
        public Builder harmonyActionType(String harmonyActionType) {
            this.putQueryParameter("HarmonyActionType", harmonyActionType);
            this.harmonyActionType = harmonyActionType;
            return this;
        }

        /**
         * HarmonyBadgeAddNum.
         */
        public Builder harmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
            this.putQueryParameter("HarmonyBadgeAddNum", harmonyBadgeAddNum);
            this.harmonyBadgeAddNum = harmonyBadgeAddNum;
            return this;
        }

        /**
         * HarmonyBadgeSetNum.
         */
        public Builder harmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
            this.putQueryParameter("HarmonyBadgeSetNum", harmonyBadgeSetNum);
            this.harmonyBadgeSetNum = harmonyBadgeSetNum;
            return this;
        }

        /**
         * HarmonyCategory.
         */
        public Builder harmonyCategory(String harmonyCategory) {
            this.putQueryParameter("HarmonyCategory", harmonyCategory);
            this.harmonyCategory = harmonyCategory;
            return this;
        }

        /**
         * HarmonyExtParameters.
         */
        public Builder harmonyExtParameters(String harmonyExtParameters) {
            this.putQueryParameter("HarmonyExtParameters", harmonyExtParameters);
            this.harmonyExtParameters = harmonyExtParameters;
            return this;
        }

        /**
         * HarmonyExtensionExtraData.
         */
        public Builder harmonyExtensionExtraData(String harmonyExtensionExtraData) {
            this.putQueryParameter("HarmonyExtensionExtraData", harmonyExtensionExtraData);
            this.harmonyExtensionExtraData = harmonyExtensionExtraData;
            return this;
        }

        /**
         * HarmonyExtensionPush.
         */
        public Builder harmonyExtensionPush(Boolean harmonyExtensionPush) {
            this.putQueryParameter("HarmonyExtensionPush", harmonyExtensionPush);
            this.harmonyExtensionPush = harmonyExtensionPush;
            return this;
        }

        /**
         * HarmonyImageUrl.
         */
        public Builder harmonyImageUrl(String harmonyImageUrl) {
            this.putQueryParameter("HarmonyImageUrl", harmonyImageUrl);
            this.harmonyImageUrl = harmonyImageUrl;
            return this;
        }

        /**
         * HarmonyInboxContent.
         */
        public Builder harmonyInboxContent(String harmonyInboxContent) {
            this.putQueryParameter("HarmonyInboxContent", harmonyInboxContent);
            this.harmonyInboxContent = harmonyInboxContent;
            return this;
        }

        /**
         * HarmonyNotificationSlotType.
         */
        public Builder harmonyNotificationSlotType(String harmonyNotificationSlotType) {
            this.putQueryParameter("HarmonyNotificationSlotType", harmonyNotificationSlotType);
            this.harmonyNotificationSlotType = harmonyNotificationSlotType;
            return this;
        }

        /**
         * HarmonyNotifyId.
         */
        public Builder harmonyNotifyId(Integer harmonyNotifyId) {
            this.putQueryParameter("HarmonyNotifyId", harmonyNotifyId);
            this.harmonyNotifyId = harmonyNotifyId;
            return this;
        }

        /**
         * HarmonyReceiptId.
         */
        public Builder harmonyReceiptId(String harmonyReceiptId) {
            this.putQueryParameter("HarmonyReceiptId", harmonyReceiptId);
            this.harmonyReceiptId = harmonyReceiptId;
            return this;
        }

        /**
         * HarmonyRemind.
         */
        public Builder harmonyRemind(Boolean harmonyRemind) {
            this.putQueryParameter("HarmonyRemind", harmonyRemind);
            this.harmonyRemind = harmonyRemind;
            return this;
        }

        /**
         * HarmonyRemindBody.
         */
        public Builder harmonyRemindBody(String harmonyRemindBody) {
            this.putQueryParameter("HarmonyRemindBody", harmonyRemindBody);
            this.harmonyRemindBody = harmonyRemindBody;
            return this;
        }

        /**
         * HarmonyRemindTitle.
         */
        public Builder harmonyRemindTitle(String harmonyRemindTitle) {
            this.putQueryParameter("HarmonyRemindTitle", harmonyRemindTitle);
            this.harmonyRemindTitle = harmonyRemindTitle;
            return this;
        }

        /**
         * HarmonyRenderStyle.
         */
        public Builder harmonyRenderStyle(String harmonyRenderStyle) {
            this.putQueryParameter("HarmonyRenderStyle", harmonyRenderStyle);
            this.harmonyRenderStyle = harmonyRenderStyle;
            return this;
        }

        /**
         * HarmonyTestMessage.
         */
        public Builder harmonyTestMessage(Boolean harmonyTestMessage) {
            this.putQueryParameter("HarmonyTestMessage", harmonyTestMessage);
            this.harmonyTestMessage = harmonyTestMessage;
            return this;
        }

        /**
         * HarmonyUri.
         */
        public Builder harmonyUri(String harmonyUri) {
            this.putQueryParameter("HarmonyUri", harmonyUri);
            this.harmonyUri = harmonyUri;
            return this;
        }

        /**
         * IdempotentToken.
         */
        public Builder idempotentToken(String idempotentToken) {
            this.putQueryParameter("IdempotentToken", idempotentToken);
            this.idempotentToken = idempotentToken;
            return this;
        }

        /**
         * JobKey.
         */
        public Builder jobKey(String jobKey) {
            this.putQueryParameter("JobKey", jobKey);
            this.jobKey = jobKey;
            return this;
        }

        /**
         * PushTime.
         */
        public Builder pushTime(String pushTime) {
            this.putQueryParameter("PushTime", pushTime);
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
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * SendChannels.
         */
        public Builder sendChannels(String sendChannels) {
            this.putQueryParameter("SendChannels", sendChannels);
            this.sendChannels = sendChannels;
            return this;
        }

        /**
         * SendSpeed.
         */
        public Builder sendSpeed(Integer sendSpeed) {
            this.putQueryParameter("SendSpeed", sendSpeed);
            this.sendSpeed = sendSpeed;
            return this;
        }

        /**
         * SmsDelaySecs.
         */
        public Builder smsDelaySecs(Integer smsDelaySecs) {
            this.putQueryParameter("SmsDelaySecs", smsDelaySecs);
            this.smsDelaySecs = smsDelaySecs;
            return this;
        }

        /**
         * SmsParams.
         */
        public Builder smsParams(String smsParams) {
            this.putQueryParameter("SmsParams", smsParams);
            this.smsParams = smsParams;
            return this;
        }

        /**
         * SmsSendPolicy.
         */
        public Builder smsSendPolicy(Integer smsSendPolicy) {
            this.putQueryParameter("SmsSendPolicy", smsSendPolicy);
            this.smsSendPolicy = smsSendPolicy;
            return this;
        }

        /**
         * SmsSignName.
         */
        public Builder smsSignName(String smsSignName) {
            this.putQueryParameter("SmsSignName", smsSignName);
            this.smsSignName = smsSignName;
            return this;
        }

        /**
         * SmsTemplateName.
         */
        public Builder smsTemplateName(String smsTemplateName) {
            this.putQueryParameter("SmsTemplateName", smsTemplateName);
            this.smsTemplateName = smsTemplateName;
            return this;
        }

        /**
         * StoreOffline.
         */
        public Builder storeOffline(Boolean storeOffline) {
            this.putQueryParameter("StoreOffline", storeOffline);
            this.storeOffline = storeOffline;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Trim.
         */
        public Builder trim(Boolean trim) {
            this.putQueryParameter("Trim", trim);
            this.trim = trim;
            return this;
        }

        /**
         * iOSApnsEnv.
         */
        public Builder iOSApnsEnv(String iOSApnsEnv) {
            this.putQueryParameter("iOSApnsEnv", iOSApnsEnv);
            this.iOSApnsEnv = iOSApnsEnv;
            return this;
        }

        /**
         * iOSBadge.
         */
        public Builder iOSBadge(Integer iOSBadge) {
            this.putQueryParameter("iOSBadge", iOSBadge);
            this.iOSBadge = iOSBadge;
            return this;
        }

        /**
         * iOSBadgeAutoIncrement.
         */
        public Builder iOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
            this.putQueryParameter("iOSBadgeAutoIncrement", iOSBadgeAutoIncrement);
            this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
            return this;
        }

        /**
         * iOSExtParameters.
         */
        public Builder iOSExtParameters(String iOSExtParameters) {
            this.putQueryParameter("iOSExtParameters", iOSExtParameters);
            this.iOSExtParameters = iOSExtParameters;
            return this;
        }

        /**
         * iOSInterruptionLevel.
         */
        public Builder iOSInterruptionLevel(String iOSInterruptionLevel) {
            this.putQueryParameter("iOSInterruptionLevel", iOSInterruptionLevel);
            this.iOSInterruptionLevel = iOSInterruptionLevel;
            return this;
        }

        /**
         * iOSLiveActivityAttributes.
         */
        public Builder iOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
            this.putQueryParameter("iOSLiveActivityAttributes", iOSLiveActivityAttributes);
            this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
            return this;
        }

        /**
         * iOSLiveActivityAttributesType.
         */
        public Builder iOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
            this.putQueryParameter("iOSLiveActivityAttributesType", iOSLiveActivityAttributesType);
            this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
            return this;
        }

        /**
         * iOSLiveActivityContentState.
         */
        public Builder iOSLiveActivityContentState(String iOSLiveActivityContentState) {
            this.putQueryParameter("iOSLiveActivityContentState", iOSLiveActivityContentState);
            this.iOSLiveActivityContentState = iOSLiveActivityContentState;
            return this;
        }

        /**
         * iOSLiveActivityDismissalDate.
         */
        public Builder iOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
            this.putQueryParameter("iOSLiveActivityDismissalDate", iOSLiveActivityDismissalDate);
            this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
            return this;
        }

        /**
         * iOSLiveActivityEvent.
         */
        public Builder iOSLiveActivityEvent(String iOSLiveActivityEvent) {
            this.putQueryParameter("iOSLiveActivityEvent", iOSLiveActivityEvent);
            this.iOSLiveActivityEvent = iOSLiveActivityEvent;
            return this;
        }

        /**
         * iOSLiveActivityId.
         */
        public Builder iOSLiveActivityId(String iOSLiveActivityId) {
            this.putQueryParameter("iOSLiveActivityId", iOSLiveActivityId);
            this.iOSLiveActivityId = iOSLiveActivityId;
            return this;
        }

        /**
         * iOSLiveActivityStaleDate.
         */
        public Builder iOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
            this.putQueryParameter("iOSLiveActivityStaleDate", iOSLiveActivityStaleDate);
            this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
            return this;
        }

        /**
         * iOSMusic.
         */
        public Builder iOSMusic(String iOSMusic) {
            this.putQueryParameter("iOSMusic", iOSMusic);
            this.iOSMusic = iOSMusic;
            return this;
        }

        /**
         * iOSMutableContent.
         */
        public Builder iOSMutableContent(Boolean iOSMutableContent) {
            this.putQueryParameter("iOSMutableContent", iOSMutableContent);
            this.iOSMutableContent = iOSMutableContent;
            return this;
        }

        /**
         * iOSNotificationCategory.
         */
        public Builder iOSNotificationCategory(String iOSNotificationCategory) {
            this.putQueryParameter("iOSNotificationCategory", iOSNotificationCategory);
            this.iOSNotificationCategory = iOSNotificationCategory;
            return this;
        }

        /**
         * iOSNotificationCollapseId.
         */
        public Builder iOSNotificationCollapseId(String iOSNotificationCollapseId) {
            this.putQueryParameter("iOSNotificationCollapseId", iOSNotificationCollapseId);
            this.iOSNotificationCollapseId = iOSNotificationCollapseId;
            return this;
        }

        /**
         * iOSNotificationThreadId.
         */
        public Builder iOSNotificationThreadId(String iOSNotificationThreadId) {
            this.putQueryParameter("iOSNotificationThreadId", iOSNotificationThreadId);
            this.iOSNotificationThreadId = iOSNotificationThreadId;
            return this;
        }

        /**
         * iOSRelevanceScore.
         */
        public Builder iOSRelevanceScore(Double iOSRelevanceScore) {
            this.putQueryParameter("iOSRelevanceScore", iOSRelevanceScore);
            this.iOSRelevanceScore = iOSRelevanceScore;
            return this;
        }

        /**
         * iOSRemind.
         */
        public Builder iOSRemind(Boolean iOSRemind) {
            this.putQueryParameter("iOSRemind", iOSRemind);
            this.iOSRemind = iOSRemind;
            return this;
        }

        /**
         * iOSRemindBody.
         */
        public Builder iOSRemindBody(String iOSRemindBody) {
            this.putQueryParameter("iOSRemindBody", iOSRemindBody);
            this.iOSRemindBody = iOSRemindBody;
            return this;
        }

        /**
         * iOSSilentNotification.
         */
        public Builder iOSSilentNotification(Boolean iOSSilentNotification) {
            this.putQueryParameter("iOSSilentNotification", iOSSilentNotification);
            this.iOSSilentNotification = iOSSilentNotification;
            return this;
        }

        /**
         * iOSSubtitle.
         */
        public Builder iOSSubtitle(String iOSSubtitle) {
            this.putQueryParameter("iOSSubtitle", iOSSubtitle);
            this.iOSSubtitle = iOSSubtitle;
            return this;
        }

        @Override
        public PushRequest build() {
            return new PushRequest(this);
        } 

    } 

}
