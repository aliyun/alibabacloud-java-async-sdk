// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MassPushRequest} extends {@link RequestModel}
 *
 * <p>MassPushRequest</p>
 */
public class MassPushRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Body
    @NameInMap("PushTask")
    @Validation(required = true)
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
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * PushTask.
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

    public static class PushTask extends TeaModel {
        @NameInMap("AndroidActivity")
        private String androidActivity;

        @NameInMap("AndroidBigBody")
        private String androidBigBody;

        @NameInMap("AndroidBigPictureUrl")
        private String androidBigPictureUrl;

        @NameInMap("AndroidBigTitle")
        private String androidBigTitle;

        @NameInMap("AndroidExtParameters")
        private String androidExtParameters;

        @NameInMap("AndroidImageUrl")
        private String androidImageUrl;

        @NameInMap("AndroidInboxBody")
        private String androidInboxBody;

        @NameInMap("AndroidMessageHuaweiCategory")
        private String androidMessageHuaweiCategory;

        @NameInMap("AndroidMessageHuaweiUrgency")
        private String androidMessageHuaweiUrgency;

        @NameInMap("AndroidMusic")
        private String androidMusic;

        @NameInMap("AndroidNotificationBarPriority")
        private Integer androidNotificationBarPriority;

        @NameInMap("AndroidNotificationBarType")
        private Integer androidNotificationBarType;

        @NameInMap("AndroidNotificationChannel")
        private String androidNotificationChannel;

        @NameInMap("AndroidNotificationHuaweiChannel")
        private String androidNotificationHuaweiChannel;

        @NameInMap("AndroidNotificationNotifyId")
        @Validation(maximum = 999999999)
        private Integer androidNotificationNotifyId;

        @NameInMap("AndroidNotificationVivoChannel")
        private String androidNotificationVivoChannel;

        @NameInMap("AndroidNotificationXiaomiChannel")
        private String androidNotificationXiaomiChannel;

        @NameInMap("AndroidNotifyType")
        private String androidNotifyType;

        @NameInMap("AndroidOpenType")
        private String androidOpenType;

        @NameInMap("AndroidOpenUrl")
        private String androidOpenUrl;

        @NameInMap("AndroidPopupActivity")
        private String androidPopupActivity;

        @NameInMap("AndroidPopupBody")
        private String androidPopupBody;

        @NameInMap("AndroidPopupTitle")
        private String androidPopupTitle;

        @NameInMap("AndroidRemind")
        private Boolean androidRemind;

        @NameInMap("AndroidRenderStyle")
        private String androidRenderStyle;

        @NameInMap("AndroidVivoPushMode")
        private Integer androidVivoPushMode;

        @NameInMap("AndroidXiaoMiActivity")
        private String androidXiaoMiActivity;

        @NameInMap("AndroidXiaoMiNotifyBody")
        private String androidXiaoMiNotifyBody;

        @NameInMap("AndroidXiaoMiNotifyTitle")
        private String androidXiaoMiNotifyTitle;

        @NameInMap("AndroidXiaomiBigPictureUrl")
        private String androidXiaomiBigPictureUrl;

        @NameInMap("AndroidXiaomiImageUrl")
        private String androidXiaomiImageUrl;

        @NameInMap("Body")
        @Validation(required = true)
        private String body;

        @NameInMap("DeviceType")
        @Validation(required = true)
        private String deviceType;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("JobKey")
        private String jobKey;

        @NameInMap("PushTime")
        private String pushTime;

        @NameInMap("PushType")
        @Validation(required = true)
        private String pushType;

        @NameInMap("SendChannels")
        private String sendChannels;

        @NameInMap("SendSpeed")
        private Integer sendSpeed;

        @NameInMap("StoreOffline")
        private Boolean storeOffline;

        @NameInMap("Target")
        @Validation(required = true)
        private String target;

        @NameInMap("TargetValue")
        @Validation(required = true)
        private String targetValue;

        @NameInMap("Title")
        private String title;

        @NameInMap("Trim")
        private Boolean trim;

        @NameInMap("iOSApnsEnv")
        private String iOSApnsEnv;

        @NameInMap("iOSBadge")
        private Integer iOSBadge;

        @NameInMap("iOSBadgeAutoIncrement")
        private Boolean iOSBadgeAutoIncrement;

        @NameInMap("iOSExtParameters")
        private String iOSExtParameters;

        @NameInMap("iOSInterruptionLevel")
        private String iOSInterruptionLevel;

        @NameInMap("iOSMusic")
        private String iOSMusic;

        @NameInMap("iOSMutableContent")
        private Boolean iOSMutableContent;

        @NameInMap("iOSNotificationCategory")
        private String iOSNotificationCategory;

        @NameInMap("iOSNotificationCollapseId")
        private String iOSNotificationCollapseId;

        @NameInMap("iOSNotificationThreadId")
        private String iOSNotificationThreadId;

        @NameInMap("iOSRelevanceScore")
        private Double iOSRelevanceScore;

        @NameInMap("iOSRemind")
        private Boolean iOSRemind;

        @NameInMap("iOSRemindBody")
        private String iOSRemindBody;

        @NameInMap("iOSSilentNotification")
        private Boolean iOSSilentNotification;

        @NameInMap("iOSSubtitle")
        private String iOSSubtitle;

        private PushTask(Builder builder) {
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
            this.androidVivoPushMode = builder.androidVivoPushMode;
            this.androidXiaoMiActivity = builder.androidXiaoMiActivity;
            this.androidXiaoMiNotifyBody = builder.androidXiaoMiNotifyBody;
            this.androidXiaoMiNotifyTitle = builder.androidXiaoMiNotifyTitle;
            this.androidXiaomiBigPictureUrl = builder.androidXiaomiBigPictureUrl;
            this.androidXiaomiImageUrl = builder.androidXiaomiImageUrl;
            this.body = builder.body;
            this.deviceType = builder.deviceType;
            this.expireTime = builder.expireTime;
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
        public String getAndroidRenderStyle() {
            return this.androidRenderStyle;
        }

        /**
         * @return androidVivoPushMode
         */
        public Integer getAndroidVivoPushMode() {
            return this.androidVivoPushMode;
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
            private String androidRenderStyle; 
            private Integer androidVivoPushMode; 
            private String androidXiaoMiActivity; 
            private String androidXiaoMiNotifyBody; 
            private String androidXiaoMiNotifyTitle; 
            private String androidXiaomiBigPictureUrl; 
            private String androidXiaomiImageUrl; 
            private String body; 
            private String deviceType; 
            private String expireTime; 
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
             * AndroidVivoPushMode.
             */
            public Builder androidVivoPushMode(Integer androidVivoPushMode) {
                this.androidVivoPushMode = androidVivoPushMode;
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
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * DeviceType.
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
             * PushType.
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
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetValue.
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
