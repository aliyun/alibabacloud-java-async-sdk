// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushRequest} extends {@link RequestModel}
 *
 * <p>PushRequest</p>
 */
public class PushRequest extends Request {
    @Query
    @NameInMap("AndroidActivity")
    private String androidActivity;

    @Query
    @NameInMap("AndroidBigBody")
    private String androidBigBody;

    @Query
    @NameInMap("AndroidBigPictureUrl")
    private String androidBigPictureUrl;

    @Query
    @NameInMap("AndroidBigTitle")
    private String androidBigTitle;

    @Query
    @NameInMap("AndroidExtParameters")
    private String androidExtParameters;

    @Query
    @NameInMap("AndroidImageUrl")
    private String androidImageUrl;

    @Query
    @NameInMap("AndroidInboxBody")
    private String androidInboxBody;

    @Query
    @NameInMap("AndroidMessageHuaweiCategory")
    private String androidMessageHuaweiCategory;

    @Query
    @NameInMap("AndroidMessageHuaweiUrgency")
    private String androidMessageHuaweiUrgency;

    @Query
    @NameInMap("AndroidMusic")
    private String androidMusic;

    @Query
    @NameInMap("AndroidNotificationBarPriority")
    @Validation(maximum = 2)
    private Integer androidNotificationBarPriority;

    @Query
    @NameInMap("AndroidNotificationBarType")
    @Validation(maximum = 100)
    private Integer androidNotificationBarType;

    @Query
    @NameInMap("AndroidNotificationChannel")
    private String androidNotificationChannel;

    @Query
    @NameInMap("AndroidNotificationHuaweiChannel")
    private String androidNotificationHuaweiChannel;

    @Query
    @NameInMap("AndroidNotificationNotifyId")
    @Validation(maximum = 999999999)
    private Integer androidNotificationNotifyId;

    @Query
    @NameInMap("AndroidNotificationVivoChannel")
    private String androidNotificationVivoChannel;

    @Query
    @NameInMap("AndroidNotificationXiaomiChannel")
    private String androidNotificationXiaomiChannel;

    @Query
    @NameInMap("AndroidNotifyType")
    private String androidNotifyType;

    @Query
    @NameInMap("AndroidOpenType")
    private String androidOpenType;

    @Query
    @NameInMap("AndroidOpenUrl")
    private String androidOpenUrl;

    @Query
    @NameInMap("AndroidPopupActivity")
    private String androidPopupActivity;

    @Query
    @NameInMap("AndroidPopupBody")
    private String androidPopupBody;

    @Query
    @NameInMap("AndroidPopupTitle")
    private String androidPopupTitle;

    @Query
    @NameInMap("AndroidRemind")
    private Boolean androidRemind;

    @Query
    @NameInMap("AndroidRenderStyle")
    private Integer androidRenderStyle;

    @Query
    @NameInMap("AndroidXiaoMiActivity")
    private String androidXiaoMiActivity;

    @Query
    @NameInMap("AndroidXiaoMiNotifyBody")
    private String androidXiaoMiNotifyBody;

    @Query
    @NameInMap("AndroidXiaoMiNotifyTitle")
    private String androidXiaoMiNotifyTitle;

    @Query
    @NameInMap("AndroidXiaomiBigPictureUrl")
    private String androidXiaomiBigPictureUrl;

    @Query
    @NameInMap("AndroidXiaomiImageUrl")
    private String androidXiaomiImageUrl;

    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Query
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Query
    @NameInMap("ExpireTime")
    private String expireTime;

    @Query
    @NameInMap("JobKey")
    private String jobKey;

    @Query
    @NameInMap("PushTime")
    private String pushTime;

    @Query
    @NameInMap("PushType")
    @Validation(required = true)
    private String pushType;

    @Query
    @NameInMap("SendChannels")
    private String sendChannels;

    @Query
    @NameInMap("SendSpeed")
    private Integer sendSpeed;

    @Query
    @NameInMap("SmsDelaySecs")
    private Integer smsDelaySecs;

    @Query
    @NameInMap("SmsParams")
    private String smsParams;

    @Query
    @NameInMap("SmsSendPolicy")
    @Validation(maximum = 1)
    private Integer smsSendPolicy;

    @Query
    @NameInMap("SmsSignName")
    private String smsSignName;

    @Query
    @NameInMap("SmsTemplateName")
    private String smsTemplateName;

    @Query
    @NameInMap("StoreOffline")
    private Boolean storeOffline;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("TargetValue")
    @Validation(required = true)
    private String targetValue;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("iOSApnsEnv")
    private String iOSApnsEnv;

    @Query
    @NameInMap("iOSBadge")
    private Integer iOSBadge;

    @Query
    @NameInMap("iOSBadgeAutoIncrement")
    private Boolean iOSBadgeAutoIncrement;

    @Query
    @NameInMap("iOSExtParameters")
    private String iOSExtParameters;

    @Query
    @NameInMap("iOSMusic")
    private String iOSMusic;

    @Query
    @NameInMap("iOSMutableContent")
    private Boolean iOSMutableContent;

    @Query
    @NameInMap("iOSNotificationCategory")
    private String iOSNotificationCategory;

    @Query
    @NameInMap("iOSNotificationCollapseId")
    private String iOSNotificationCollapseId;

    @Query
    @NameInMap("iOSNotificationThreadId")
    private String iOSNotificationThreadId;

    @Query
    @NameInMap("iOSRemind")
    private Boolean iOSRemind;

    @Query
    @NameInMap("iOSRemindBody")
    private String iOSRemindBody;

    @Query
    @NameInMap("iOSSilentNotification")
    private Boolean iOSSilentNotification;

    @Query
    @NameInMap("iOSSubtitle")
    private String iOSSubtitle;

    private PushRequest(Builder builder) {
        super(builder);
        this.androidActivity = builder.androidActivity;
        this.androidBigBody = builder.androidBigBody;
        this.androidBigPictureUrl = builder.androidBigPictureUrl;
        this.androidBigTitle = builder.androidBigTitle;
        this.androidExtParameters = builder.androidExtParameters;
        this.androidImageUrl = builder.androidImageUrl;
        this.androidInboxBody = builder.androidInboxBody;
        this.androidMessageHuaweiCategory = builder.androidMessageHuaweiCategory;
        this.androidMessageHuaweiUrgency = builder.androidMessageHuaweiUrgency;
        this.androidMusic = builder.androidMusic;
        this.androidNotificationBarPriority = builder.androidNotificationBarPriority;
        this.androidNotificationBarType = builder.androidNotificationBarType;
        this.androidNotificationChannel = builder.androidNotificationChannel;
        this.androidNotificationHuaweiChannel = builder.androidNotificationHuaweiChannel;
        this.androidNotificationNotifyId = builder.androidNotificationNotifyId;
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
        this.androidXiaoMiActivity = builder.androidXiaoMiActivity;
        this.androidXiaoMiNotifyBody = builder.androidXiaoMiNotifyBody;
        this.androidXiaoMiNotifyTitle = builder.androidXiaoMiNotifyTitle;
        this.androidXiaomiBigPictureUrl = builder.androidXiaomiBigPictureUrl;
        this.androidXiaomiImageUrl = builder.androidXiaomiImageUrl;
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.deviceType = builder.deviceType;
        this.expireTime = builder.expireTime;
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
        this.iOSApnsEnv = builder.iOSApnsEnv;
        this.iOSBadge = builder.iOSBadge;
        this.iOSBadgeAutoIncrement = builder.iOSBadgeAutoIncrement;
        this.iOSExtParameters = builder.iOSExtParameters;
        this.iOSMusic = builder.iOSMusic;
        this.iOSMutableContent = builder.iOSMutableContent;
        this.iOSNotificationCategory = builder.iOSNotificationCategory;
        this.iOSNotificationCollapseId = builder.iOSNotificationCollapseId;
        this.iOSNotificationThreadId = builder.iOSNotificationThreadId;
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
        private String androidBigBody; 
        private String androidBigPictureUrl; 
        private String androidBigTitle; 
        private String androidExtParameters; 
        private String androidImageUrl; 
        private String androidInboxBody; 
        private String androidMessageHuaweiCategory; 
        private String androidMessageHuaweiUrgency; 
        private String androidMusic; 
        private Integer androidNotificationBarPriority; 
        private Integer androidNotificationBarType; 
        private String androidNotificationChannel; 
        private String androidNotificationHuaweiChannel; 
        private Integer androidNotificationNotifyId; 
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
        private String androidXiaoMiActivity; 
        private String androidXiaoMiNotifyBody; 
        private String androidXiaoMiNotifyTitle; 
        private String androidXiaomiBigPictureUrl; 
        private String androidXiaomiImageUrl; 
        private Long appKey; 
        private String body; 
        private String deviceType; 
        private String expireTime; 
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
        private String iOSApnsEnv; 
        private Integer iOSBadge; 
        private Boolean iOSBadgeAutoIncrement; 
        private String iOSExtParameters; 
        private String iOSMusic; 
        private Boolean iOSMutableContent; 
        private String iOSNotificationCategory; 
        private String iOSNotificationCollapseId; 
        private String iOSNotificationThreadId; 
        private Boolean iOSRemind; 
        private String iOSRemindBody; 
        private Boolean iOSSilentNotification; 
        private String iOSSubtitle; 

        private Builder() {
            super();
        } 

        private Builder(PushRequest response) {
            super(response);
            this.androidActivity = response.androidActivity;
            this.androidBigBody = response.androidBigBody;
            this.androidBigPictureUrl = response.androidBigPictureUrl;
            this.androidBigTitle = response.androidBigTitle;
            this.androidExtParameters = response.androidExtParameters;
            this.androidImageUrl = response.androidImageUrl;
            this.androidInboxBody = response.androidInboxBody;
            this.androidMessageHuaweiCategory = response.androidMessageHuaweiCategory;
            this.androidMessageHuaweiUrgency = response.androidMessageHuaweiUrgency;
            this.androidMusic = response.androidMusic;
            this.androidNotificationBarPriority = response.androidNotificationBarPriority;
            this.androidNotificationBarType = response.androidNotificationBarType;
            this.androidNotificationChannel = response.androidNotificationChannel;
            this.androidNotificationHuaweiChannel = response.androidNotificationHuaweiChannel;
            this.androidNotificationNotifyId = response.androidNotificationNotifyId;
            this.androidNotificationVivoChannel = response.androidNotificationVivoChannel;
            this.androidNotificationXiaomiChannel = response.androidNotificationXiaomiChannel;
            this.androidNotifyType = response.androidNotifyType;
            this.androidOpenType = response.androidOpenType;
            this.androidOpenUrl = response.androidOpenUrl;
            this.androidPopupActivity = response.androidPopupActivity;
            this.androidPopupBody = response.androidPopupBody;
            this.androidPopupTitle = response.androidPopupTitle;
            this.androidRemind = response.androidRemind;
            this.androidRenderStyle = response.androidRenderStyle;
            this.androidXiaoMiActivity = response.androidXiaoMiActivity;
            this.androidXiaoMiNotifyBody = response.androidXiaoMiNotifyBody;
            this.androidXiaoMiNotifyTitle = response.androidXiaoMiNotifyTitle;
            this.androidXiaomiBigPictureUrl = response.androidXiaomiBigPictureUrl;
            this.androidXiaomiImageUrl = response.androidXiaomiImageUrl;
            this.appKey = response.appKey;
            this.body = response.body;
            this.deviceType = response.deviceType;
            this.expireTime = response.expireTime;
            this.jobKey = response.jobKey;
            this.pushTime = response.pushTime;
            this.pushType = response.pushType;
            this.sendChannels = response.sendChannels;
            this.sendSpeed = response.sendSpeed;
            this.smsDelaySecs = response.smsDelaySecs;
            this.smsParams = response.smsParams;
            this.smsSendPolicy = response.smsSendPolicy;
            this.smsSignName = response.smsSignName;
            this.smsTemplateName = response.smsTemplateName;
            this.storeOffline = response.storeOffline;
            this.target = response.target;
            this.targetValue = response.targetValue;
            this.title = response.title;
            this.iOSApnsEnv = response.iOSApnsEnv;
            this.iOSBadge = response.iOSBadge;
            this.iOSBadgeAutoIncrement = response.iOSBadgeAutoIncrement;
            this.iOSExtParameters = response.iOSExtParameters;
            this.iOSMusic = response.iOSMusic;
            this.iOSMutableContent = response.iOSMutableContent;
            this.iOSNotificationCategory = response.iOSNotificationCategory;
            this.iOSNotificationCollapseId = response.iOSNotificationCollapseId;
            this.iOSNotificationThreadId = response.iOSNotificationThreadId;
            this.iOSRemind = response.iOSRemind;
            this.iOSRemindBody = response.iOSRemindBody;
            this.iOSSilentNotification = response.iOSSilentNotification;
            this.iOSSubtitle = response.iOSSubtitle;
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
         * AppKey.
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
         * DeviceType.
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
         * PushType.
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
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetValue.
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
