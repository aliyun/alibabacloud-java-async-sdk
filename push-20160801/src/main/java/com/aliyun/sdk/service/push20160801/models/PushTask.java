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
 * {@link PushTask} extends {@link TeaModel}
 *
 * <p>PushTask</p>
 */
public class PushTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("Message")
    private Message message;

    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.NameInMap("Options")
    private Options options;

    @com.aliyun.core.annotation.NameInMap("Target")
    private Target target;

    private PushTask(Builder builder) {
        this.action = builder.action;
        this.message = builder.message;
        this.notification = builder.notification;
        this.options = builder.options;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    /**
     * @return target
     */
    public Target getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String action; 
        private Message message; 
        private Notification notification; 
        private Options options; 
        private Target target; 

        private Builder() {
        } 

        private Builder(PushTask model) {
            this.action = model.action;
            this.message = model.message;
            this.notification = model.notification;
            this.options = model.options;
            this.target = model.target;
        } 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(Options options) {
            this.options = options;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(Target target) {
            this.target = target;
            return this;
        }

        public PushTask build() {
            return new PushTask(this);
        } 

    } 

    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Message(Builder builder) {
            this.body = builder.body;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String body; 
            private String title; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.body = model.body;
                this.title = model.title;
            } 

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Accs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomStyle")
        private Integer customStyle;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        @com.aliyun.core.annotation.NameInMap("OpenActivity")
        private String openActivity;

        @com.aliyun.core.annotation.NameInMap("OpenType")
        private String openType;

        @com.aliyun.core.annotation.NameInMap("OpenUrl")
        private String openUrl;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        private Accs(Builder builder) {
            this.customStyle = builder.customStyle;
            this.notifyType = builder.notifyType;
            this.openActivity = builder.openActivity;
            this.openType = builder.openType;
            this.openUrl = builder.openUrl;
            this.priority = builder.priority;
            this.threadId = builder.threadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accs create() {
            return builder().build();
        }

        /**
         * @return customStyle
         */
        public Integer getCustomStyle() {
            return this.customStyle;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return openActivity
         */
        public String getOpenActivity() {
            return this.openActivity;
        }

        /**
         * @return openType
         */
        public String getOpenType() {
            return this.openType;
        }

        /**
         * @return openUrl
         */
        public String getOpenUrl() {
            return this.openUrl;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        public static final class Builder {
            private Integer customStyle; 
            private String notifyType; 
            private String openActivity; 
            private String openType; 
            private String openUrl; 
            private Integer priority; 
            private String threadId; 

            private Builder() {
            } 

            private Builder(Accs model) {
                this.customStyle = model.customStyle;
                this.notifyType = model.notifyType;
                this.openActivity = model.openActivity;
                this.openType = model.openType;
                this.openUrl = model.openUrl;
                this.priority = model.priority;
                this.threadId = model.threadId;
            } 

            /**
             * CustomStyle.
             */
            public Builder customStyle(Integer customStyle) {
                this.customStyle = customStyle;
                return this;
            }

            /**
             * NotifyType.
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * OpenActivity.
             */
            public Builder openActivity(String openActivity) {
                this.openActivity = openActivity;
                return this;
            }

            /**
             * OpenType.
             */
            public Builder openType(String openType) {
                this.openType = openType;
                return this;
            }

            /**
             * OpenUrl.
             */
            public Builder openUrl(String openUrl) {
                this.openUrl = openUrl;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ThreadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            public Accs build() {
                return new Accs(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Honor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        private Honor(Builder builder) {
            this.importance = builder.importance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Honor create() {
            return builder().build();
        }

        /**
         * @return importance
         */
        public Integer getImportance() {
            return this.importance;
        }

        public static final class Builder {
            private Integer importance; 

            private Builder() {
            } 

            private Builder(Honor model) {
                this.importance = model.importance;
            } 

            /**
             * Importance.
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            public Honor build() {
                return new Honor(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Huawei extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Integer businessType;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        @com.aliyun.core.annotation.NameInMap("LiveNotificationPayload")
        private String liveNotificationPayload;

        @com.aliyun.core.annotation.NameInMap("ReceiptId")
        private String receiptId;

        @com.aliyun.core.annotation.NameInMap("Urgency")
        private String urgency;

        private Huawei(Builder builder) {
            this.businessType = builder.businessType;
            this.category = builder.category;
            this.importance = builder.importance;
            this.liveNotificationPayload = builder.liveNotificationPayload;
            this.receiptId = builder.receiptId;
            this.urgency = builder.urgency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Huawei create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public Integer getBusinessType() {
            return this.businessType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return importance
         */
        public Integer getImportance() {
            return this.importance;
        }

        /**
         * @return liveNotificationPayload
         */
        public String getLiveNotificationPayload() {
            return this.liveNotificationPayload;
        }

        /**
         * @return receiptId
         */
        public String getReceiptId() {
            return this.receiptId;
        }

        /**
         * @return urgency
         */
        public String getUrgency() {
            return this.urgency;
        }

        public static final class Builder {
            private Integer businessType; 
            private String category; 
            private Integer importance; 
            private String liveNotificationPayload; 
            private String receiptId; 
            private String urgency; 

            private Builder() {
            } 

            private Builder(Huawei model) {
                this.businessType = model.businessType;
                this.category = model.category;
                this.importance = model.importance;
                this.liveNotificationPayload = model.liveNotificationPayload;
                this.receiptId = model.receiptId;
                this.urgency = model.urgency;
            } 

            /**
             * BusinessType.
             */
            public Builder businessType(Integer businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Importance.
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * LiveNotificationPayload.
             */
            public Builder liveNotificationPayload(String liveNotificationPayload) {
                this.liveNotificationPayload = liveNotificationPayload;
                return this;
            }

            /**
             * ReceiptId.
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * Urgency.
             */
            public Builder urgency(String urgency) {
                this.urgency = urgency;
                return this;
            }

            public Huawei build() {
                return new Huawei(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Meizu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoticeMsgType")
        private Integer noticeMsgType;

        private Meizu(Builder builder) {
            this.noticeMsgType = builder.noticeMsgType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meizu create() {
            return builder().build();
        }

        /**
         * @return noticeMsgType
         */
        public Integer getNoticeMsgType() {
            return this.noticeMsgType;
        }

        public static final class Builder {
            private Integer noticeMsgType; 

            private Builder() {
            } 

            private Builder(Meizu model) {
                this.noticeMsgType = model.noticeMsgType;
            } 

            /**
             * NoticeMsgType.
             */
            public Builder noticeMsgType(Integer noticeMsgType) {
                this.noticeMsgType = noticeMsgType;
                return this;
            }

            public Meizu build() {
                return new Meizu(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Oppo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteIntentData")
        private String deleteIntentData;

        @com.aliyun.core.annotation.NameInMap("IntelligentIntent")
        private String intelligentIntent;

        @com.aliyun.core.annotation.NameInMap("NotifyLevel")
        private Long notifyLevel;

        @com.aliyun.core.annotation.NameInMap("PrivateContentParameters")
        private String privateContentParameters;

        @com.aliyun.core.annotation.NameInMap("PrivateMsgTemplateId")
        private String privateMsgTemplateId;

        @com.aliyun.core.annotation.NameInMap("PrivateTitleParameters")
        private String privateTitleParameters;

        private Oppo(Builder builder) {
            this.category = builder.category;
            this.deleteIntentData = builder.deleteIntentData;
            this.intelligentIntent = builder.intelligentIntent;
            this.notifyLevel = builder.notifyLevel;
            this.privateContentParameters = builder.privateContentParameters;
            this.privateMsgTemplateId = builder.privateMsgTemplateId;
            this.privateTitleParameters = builder.privateTitleParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oppo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteIntentData
         */
        public String getDeleteIntentData() {
            return this.deleteIntentData;
        }

        /**
         * @return intelligentIntent
         */
        public String getIntelligentIntent() {
            return this.intelligentIntent;
        }

        /**
         * @return notifyLevel
         */
        public Long getNotifyLevel() {
            return this.notifyLevel;
        }

        /**
         * @return privateContentParameters
         */
        public String getPrivateContentParameters() {
            return this.privateContentParameters;
        }

        /**
         * @return privateMsgTemplateId
         */
        public String getPrivateMsgTemplateId() {
            return this.privateMsgTemplateId;
        }

        /**
         * @return privateTitleParameters
         */
        public String getPrivateTitleParameters() {
            return this.privateTitleParameters;
        }

        public static final class Builder {
            private String category; 
            private String deleteIntentData; 
            private String intelligentIntent; 
            private Long notifyLevel; 
            private String privateContentParameters; 
            private String privateMsgTemplateId; 
            private String privateTitleParameters; 

            private Builder() {
            } 

            private Builder(Oppo model) {
                this.category = model.category;
                this.deleteIntentData = model.deleteIntentData;
                this.intelligentIntent = model.intelligentIntent;
                this.notifyLevel = model.notifyLevel;
                this.privateContentParameters = model.privateContentParameters;
                this.privateMsgTemplateId = model.privateMsgTemplateId;
                this.privateTitleParameters = model.privateTitleParameters;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteIntentData.
             */
            public Builder deleteIntentData(String deleteIntentData) {
                this.deleteIntentData = deleteIntentData;
                return this;
            }

            /**
             * IntelligentIntent.
             */
            public Builder intelligentIntent(String intelligentIntent) {
                this.intelligentIntent = intelligentIntent;
                return this;
            }

            /**
             * NotifyLevel.
             */
            public Builder notifyLevel(Long notifyLevel) {
                this.notifyLevel = notifyLevel;
                return this;
            }

            /**
             * PrivateContentParameters.
             */
            public Builder privateContentParameters(String privateContentParameters) {
                this.privateContentParameters = privateContentParameters;
                return this;
            }

            /**
             * PrivateMsgTemplateId.
             */
            public Builder privateMsgTemplateId(String privateMsgTemplateId) {
                this.privateMsgTemplateId = privateMsgTemplateId;
                return this;
            }

            /**
             * PrivateTitleParameters.
             */
            public Builder privateTitleParameters(String privateTitleParameters) {
                this.privateTitleParameters = privateTitleParameters;
                return this;
            }

            public Oppo build() {
                return new Oppo(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Vivo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        @com.aliyun.core.annotation.NameInMap("ReceiptId")
        private String receiptId;

        private Vivo(Builder builder) {
            this.category = builder.category;
            this.importance = builder.importance;
            this.receiptId = builder.receiptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vivo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return importance
         */
        public Integer getImportance() {
            return this.importance;
        }

        /**
         * @return receiptId
         */
        public String getReceiptId() {
            return this.receiptId;
        }

        public static final class Builder {
            private String category; 
            private Integer importance; 
            private String receiptId; 

            private Builder() {
            } 

            private Builder(Vivo model) {
                this.category = model.category;
                this.importance = model.importance;
                this.receiptId = model.receiptId;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Importance.
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * ReceiptId.
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            public Vivo build() {
                return new Vivo(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Xiaomi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        private Xiaomi(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Xiaomi create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private String channel; 

            private Builder() {
            } 

            private Builder(Xiaomi model) {
                this.channel = model.channel;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            public Xiaomi build() {
                return new Xiaomi(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class AndroidOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accs")
        private Accs accs;

        @com.aliyun.core.annotation.NameInMap("Honor")
        private Honor honor;

        @com.aliyun.core.annotation.NameInMap("Huawei")
        private Huawei huawei;

        @com.aliyun.core.annotation.NameInMap("Meizu")
        private Meizu meizu;

        @com.aliyun.core.annotation.NameInMap("Oppo")
        private Oppo oppo;

        @com.aliyun.core.annotation.NameInMap("Vivo")
        private Vivo vivo;

        @com.aliyun.core.annotation.NameInMap("Xiaomi")
        private Xiaomi xiaomi;

        private AndroidOptions(Builder builder) {
            this.accs = builder.accs;
            this.honor = builder.honor;
            this.huawei = builder.huawei;
            this.meizu = builder.meizu;
            this.oppo = builder.oppo;
            this.vivo = builder.vivo;
            this.xiaomi = builder.xiaomi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AndroidOptions create() {
            return builder().build();
        }

        /**
         * @return accs
         */
        public Accs getAccs() {
            return this.accs;
        }

        /**
         * @return honor
         */
        public Honor getHonor() {
            return this.honor;
        }

        /**
         * @return huawei
         */
        public Huawei getHuawei() {
            return this.huawei;
        }

        /**
         * @return meizu
         */
        public Meizu getMeizu() {
            return this.meizu;
        }

        /**
         * @return oppo
         */
        public Oppo getOppo() {
            return this.oppo;
        }

        /**
         * @return vivo
         */
        public Vivo getVivo() {
            return this.vivo;
        }

        /**
         * @return xiaomi
         */
        public Xiaomi getXiaomi() {
            return this.xiaomi;
        }

        public static final class Builder {
            private Accs accs; 
            private Honor honor; 
            private Huawei huawei; 
            private Meizu meizu; 
            private Oppo oppo; 
            private Vivo vivo; 
            private Xiaomi xiaomi; 

            private Builder() {
            } 

            private Builder(AndroidOptions model) {
                this.accs = model.accs;
                this.honor = model.honor;
                this.huawei = model.huawei;
                this.meizu = model.meizu;
                this.oppo = model.oppo;
                this.vivo = model.vivo;
                this.xiaomi = model.xiaomi;
            } 

            /**
             * Accs.
             */
            public Builder accs(Accs accs) {
                this.accs = accs;
                return this;
            }

            /**
             * Honor.
             */
            public Builder honor(Honor honor) {
                this.honor = honor;
                return this;
            }

            /**
             * Huawei.
             */
            public Builder huawei(Huawei huawei) {
                this.huawei = huawei;
                return this;
            }

            /**
             * Meizu.
             */
            public Builder meizu(Meizu meizu) {
                this.meizu = meizu;
                return this;
            }

            /**
             * Oppo.
             */
            public Builder oppo(Oppo oppo) {
                this.oppo = oppo;
                return this;
            }

            /**
             * Vivo.
             */
            public Builder vivo(Vivo vivo) {
                this.vivo = vivo;
                return this;
            }

            /**
             * Xiaomi.
             */
            public Builder xiaomi(Xiaomi xiaomi) {
                this.xiaomi = xiaomi;
                return this;
            }

            public AndroidOptions build() {
                return new AndroidOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Android extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BadgeActivity")
        private String badgeActivity;

        @com.aliyun.core.annotation.NameInMap("BadgeAddNum")
        private Integer badgeAddNum;

        @com.aliyun.core.annotation.NameInMap("BadgeSetNum")
        private Integer badgeSetNum;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ExtParameters")
        private String extParameters;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InboxContent")
        private java.util.List<String> inboxContent;

        @com.aliyun.core.annotation.NameInMap("Music")
        private String music;

        @com.aliyun.core.annotation.NameInMap("NotifyId")
        private Integer notifyId;

        @com.aliyun.core.annotation.NameInMap("Options")
        private AndroidOptions options;

        @com.aliyun.core.annotation.NameInMap("PictureUrl")
        private String pictureUrl;

        @com.aliyun.core.annotation.NameInMap("RenderStyle")
        private String renderStyle;

        @com.aliyun.core.annotation.NameInMap("TestMessage")
        private Boolean testMessage;

        @com.aliyun.core.annotation.NameInMap("VendorChannelActivity")
        private String vendorChannelActivity;

        private Android(Builder builder) {
            this.badgeActivity = builder.badgeActivity;
            this.badgeAddNum = builder.badgeAddNum;
            this.badgeSetNum = builder.badgeSetNum;
            this.channelId = builder.channelId;
            this.extParameters = builder.extParameters;
            this.groupId = builder.groupId;
            this.imageUrl = builder.imageUrl;
            this.inboxContent = builder.inboxContent;
            this.music = builder.music;
            this.notifyId = builder.notifyId;
            this.options = builder.options;
            this.pictureUrl = builder.pictureUrl;
            this.renderStyle = builder.renderStyle;
            this.testMessage = builder.testMessage;
            this.vendorChannelActivity = builder.vendorChannelActivity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Android create() {
            return builder().build();
        }

        /**
         * @return badgeActivity
         */
        public String getBadgeActivity() {
            return this.badgeActivity;
        }

        /**
         * @return badgeAddNum
         */
        public Integer getBadgeAddNum() {
            return this.badgeAddNum;
        }

        /**
         * @return badgeSetNum
         */
        public Integer getBadgeSetNum() {
            return this.badgeSetNum;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return extParameters
         */
        public String getExtParameters() {
            return this.extParameters;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return inboxContent
         */
        public java.util.List<String> getInboxContent() {
            return this.inboxContent;
        }

        /**
         * @return music
         */
        public String getMusic() {
            return this.music;
        }

        /**
         * @return notifyId
         */
        public Integer getNotifyId() {
            return this.notifyId;
        }

        /**
         * @return options
         */
        public AndroidOptions getOptions() {
            return this.options;
        }

        /**
         * @return pictureUrl
         */
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        /**
         * @return renderStyle
         */
        public String getRenderStyle() {
            return this.renderStyle;
        }

        /**
         * @return testMessage
         */
        public Boolean getTestMessage() {
            return this.testMessage;
        }

        /**
         * @return vendorChannelActivity
         */
        public String getVendorChannelActivity() {
            return this.vendorChannelActivity;
        }

        public static final class Builder {
            private String badgeActivity; 
            private Integer badgeAddNum; 
            private Integer badgeSetNum; 
            private String channelId; 
            private String extParameters; 
            private String groupId; 
            private String imageUrl; 
            private java.util.List<String> inboxContent; 
            private String music; 
            private Integer notifyId; 
            private AndroidOptions options; 
            private String pictureUrl; 
            private String renderStyle; 
            private Boolean testMessage; 
            private String vendorChannelActivity; 

            private Builder() {
            } 

            private Builder(Android model) {
                this.badgeActivity = model.badgeActivity;
                this.badgeAddNum = model.badgeAddNum;
                this.badgeSetNum = model.badgeSetNum;
                this.channelId = model.channelId;
                this.extParameters = model.extParameters;
                this.groupId = model.groupId;
                this.imageUrl = model.imageUrl;
                this.inboxContent = model.inboxContent;
                this.music = model.music;
                this.notifyId = model.notifyId;
                this.options = model.options;
                this.pictureUrl = model.pictureUrl;
                this.renderStyle = model.renderStyle;
                this.testMessage = model.testMessage;
                this.vendorChannelActivity = model.vendorChannelActivity;
            } 

            /**
             * BadgeActivity.
             */
            public Builder badgeActivity(String badgeActivity) {
                this.badgeActivity = badgeActivity;
                return this;
            }

            /**
             * BadgeAddNum.
             */
            public Builder badgeAddNum(Integer badgeAddNum) {
                this.badgeAddNum = badgeAddNum;
                return this;
            }

            /**
             * BadgeSetNum.
             */
            public Builder badgeSetNum(Integer badgeSetNum) {
                this.badgeSetNum = badgeSetNum;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ExtParameters.
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * InboxContent.
             */
            public Builder inboxContent(java.util.List<String> inboxContent) {
                this.inboxContent = inboxContent;
                return this;
            }

            /**
             * Music.
             */
            public Builder music(String music) {
                this.music = music;
                return this;
            }

            /**
             * NotifyId.
             */
            public Builder notifyId(Integer notifyId) {
                this.notifyId = notifyId;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(AndroidOptions options) {
                this.options = options;
                return this;
            }

            /**
             * PictureUrl.
             */
            public Builder pictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
                return this;
            }

            /**
             * RenderStyle.
             */
            public Builder renderStyle(String renderStyle) {
                this.renderStyle = renderStyle;
                return this;
            }

            /**
             * TestMessage.
             */
            public Builder testMessage(Boolean testMessage) {
                this.testMessage = testMessage;
                return this;
            }

            /**
             * VendorChannelActivity.
             */
            public Builder vendorChannelActivity(String vendorChannelActivity) {
                this.vendorChannelActivity = vendorChannelActivity;
                return this;
            }

            public Android build() {
                return new Android(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Hmos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("BadgeAddNum")
        private Integer badgeAddNum;

        @com.aliyun.core.annotation.NameInMap("BadgeSetNum")
        private Integer badgeSetNum;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ExtParameters")
        private String extParameters;

        @com.aliyun.core.annotation.NameInMap("ExtensionExtraData")
        private String extensionExtraData;

        @com.aliyun.core.annotation.NameInMap("ExtensionPush")
        private Boolean extensionPush;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InboxContent")
        private java.util.List<String> inboxContent;

        @com.aliyun.core.annotation.NameInMap("LiveViewPayload")
        private String liveViewPayload;

        @com.aliyun.core.annotation.NameInMap("NotifyId")
        private Integer notifyId;

        @com.aliyun.core.annotation.NameInMap("ReceiptId")
        private String receiptId;

        @com.aliyun.core.annotation.NameInMap("RenderStyle")
        private String renderStyle;

        @com.aliyun.core.annotation.NameInMap("SlotType")
        private String slotType;

        @com.aliyun.core.annotation.NameInMap("Sound")
        private String sound;

        @com.aliyun.core.annotation.NameInMap("SoundDuration")
        private Integer soundDuration;

        @com.aliyun.core.annotation.NameInMap("TestMessage")
        private Boolean testMessage;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Hmos(Builder builder) {
            this.action = builder.action;
            this.badgeAddNum = builder.badgeAddNum;
            this.badgeSetNum = builder.badgeSetNum;
            this.category = builder.category;
            this.extParameters = builder.extParameters;
            this.extensionExtraData = builder.extensionExtraData;
            this.extensionPush = builder.extensionPush;
            this.imageUrl = builder.imageUrl;
            this.inboxContent = builder.inboxContent;
            this.liveViewPayload = builder.liveViewPayload;
            this.notifyId = builder.notifyId;
            this.receiptId = builder.receiptId;
            this.renderStyle = builder.renderStyle;
            this.slotType = builder.slotType;
            this.sound = builder.sound;
            this.soundDuration = builder.soundDuration;
            this.testMessage = builder.testMessage;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hmos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return badgeAddNum
         */
        public Integer getBadgeAddNum() {
            return this.badgeAddNum;
        }

        /**
         * @return badgeSetNum
         */
        public Integer getBadgeSetNum() {
            return this.badgeSetNum;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return extParameters
         */
        public String getExtParameters() {
            return this.extParameters;
        }

        /**
         * @return extensionExtraData
         */
        public String getExtensionExtraData() {
            return this.extensionExtraData;
        }

        /**
         * @return extensionPush
         */
        public Boolean getExtensionPush() {
            return this.extensionPush;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return inboxContent
         */
        public java.util.List<String> getInboxContent() {
            return this.inboxContent;
        }

        /**
         * @return liveViewPayload
         */
        public String getLiveViewPayload() {
            return this.liveViewPayload;
        }

        /**
         * @return notifyId
         */
        public Integer getNotifyId() {
            return this.notifyId;
        }

        /**
         * @return receiptId
         */
        public String getReceiptId() {
            return this.receiptId;
        }

        /**
         * @return renderStyle
         */
        public String getRenderStyle() {
            return this.renderStyle;
        }

        /**
         * @return slotType
         */
        public String getSlotType() {
            return this.slotType;
        }

        /**
         * @return sound
         */
        public String getSound() {
            return this.sound;
        }

        /**
         * @return soundDuration
         */
        public Integer getSoundDuration() {
            return this.soundDuration;
        }

        /**
         * @return testMessage
         */
        public Boolean getTestMessage() {
            return this.testMessage;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String action; 
            private Integer badgeAddNum; 
            private Integer badgeSetNum; 
            private String category; 
            private String extParameters; 
            private String extensionExtraData; 
            private Boolean extensionPush; 
            private String imageUrl; 
            private java.util.List<String> inboxContent; 
            private String liveViewPayload; 
            private Integer notifyId; 
            private String receiptId; 
            private String renderStyle; 
            private String slotType; 
            private String sound; 
            private Integer soundDuration; 
            private Boolean testMessage; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Hmos model) {
                this.action = model.action;
                this.badgeAddNum = model.badgeAddNum;
                this.badgeSetNum = model.badgeSetNum;
                this.category = model.category;
                this.extParameters = model.extParameters;
                this.extensionExtraData = model.extensionExtraData;
                this.extensionPush = model.extensionPush;
                this.imageUrl = model.imageUrl;
                this.inboxContent = model.inboxContent;
                this.liveViewPayload = model.liveViewPayload;
                this.notifyId = model.notifyId;
                this.receiptId = model.receiptId;
                this.renderStyle = model.renderStyle;
                this.slotType = model.slotType;
                this.sound = model.sound;
                this.soundDuration = model.soundDuration;
                this.testMessage = model.testMessage;
                this.uri = model.uri;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * BadgeAddNum.
             */
            public Builder badgeAddNum(Integer badgeAddNum) {
                this.badgeAddNum = badgeAddNum;
                return this;
            }

            /**
             * BadgeSetNum.
             */
            public Builder badgeSetNum(Integer badgeSetNum) {
                this.badgeSetNum = badgeSetNum;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ExtParameters.
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * ExtensionExtraData.
             */
            public Builder extensionExtraData(String extensionExtraData) {
                this.extensionExtraData = extensionExtraData;
                return this;
            }

            /**
             * ExtensionPush.
             */
            public Builder extensionPush(Boolean extensionPush) {
                this.extensionPush = extensionPush;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * InboxContent.
             */
            public Builder inboxContent(java.util.List<String> inboxContent) {
                this.inboxContent = inboxContent;
                return this;
            }

            /**
             * LiveViewPayload.
             */
            public Builder liveViewPayload(String liveViewPayload) {
                this.liveViewPayload = liveViewPayload;
                return this;
            }

            /**
             * NotifyId.
             */
            public Builder notifyId(Integer notifyId) {
                this.notifyId = notifyId;
                return this;
            }

            /**
             * ReceiptId.
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * RenderStyle.
             */
            public Builder renderStyle(String renderStyle) {
                this.renderStyle = renderStyle;
                return this;
            }

            /**
             * SlotType.
             */
            public Builder slotType(String slotType) {
                this.slotType = slotType;
                return this;
            }

            /**
             * Sound.
             */
            public Builder sound(String sound) {
                this.sound = sound;
                return this;
            }

            /**
             * SoundDuration.
             */
            public Builder soundDuration(Integer soundDuration) {
                this.soundDuration = soundDuration;
                return this;
            }

            /**
             * TestMessage.
             */
            public Builder testMessage(Boolean testMessage) {
                this.testMessage = testMessage;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Hmos build() {
                return new Hmos(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class LiveActivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("AttributesType")
        private String attributesType;

        @com.aliyun.core.annotation.NameInMap("ContentState")
        private String contentState;

        @com.aliyun.core.annotation.NameInMap("DismissalDate")
        private Long dismissalDate;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("StaleDate")
        private Long staleDate;

        private LiveActivity(Builder builder) {
            this.attributes = builder.attributes;
            this.attributesType = builder.attributesType;
            this.contentState = builder.contentState;
            this.dismissalDate = builder.dismissalDate;
            this.event = builder.event;
            this.id = builder.id;
            this.staleDate = builder.staleDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveActivity create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return attributesType
         */
        public String getAttributesType() {
            return this.attributesType;
        }

        /**
         * @return contentState
         */
        public String getContentState() {
            return this.contentState;
        }

        /**
         * @return dismissalDate
         */
        public Long getDismissalDate() {
            return this.dismissalDate;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return staleDate
         */
        public Long getStaleDate() {
            return this.staleDate;
        }

        public static final class Builder {
            private String attributes; 
            private String attributesType; 
            private String contentState; 
            private Long dismissalDate; 
            private String event; 
            private String id; 
            private Long staleDate; 

            private Builder() {
            } 

            private Builder(LiveActivity model) {
                this.attributes = model.attributes;
                this.attributesType = model.attributesType;
                this.contentState = model.contentState;
                this.dismissalDate = model.dismissalDate;
                this.event = model.event;
                this.id = model.id;
                this.staleDate = model.staleDate;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * AttributesType.
             */
            public Builder attributesType(String attributesType) {
                this.attributesType = attributesType;
                return this;
            }

            /**
             * ContentState.
             */
            public Builder contentState(String contentState) {
                this.contentState = contentState;
                return this;
            }

            /**
             * DismissalDate.
             */
            public Builder dismissalDate(Long dismissalDate) {
                this.dismissalDate = dismissalDate;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * StaleDate.
             */
            public Builder staleDate(Long staleDate) {
                this.staleDate = staleDate;
                return this;
            }

            public LiveActivity build() {
                return new LiveActivity(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Ios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApnsEnv")
        private String apnsEnv;

        @com.aliyun.core.annotation.NameInMap("Badge")
        private Integer badge;

        @com.aliyun.core.annotation.NameInMap("BadgeAutoIncrement")
        private Boolean badgeAutoIncrement;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CollapseId")
        private String collapseId;

        @com.aliyun.core.annotation.NameInMap("ExtParameters")
        private String extParameters;

        @com.aliyun.core.annotation.NameInMap("InterruptionLevel")
        private String interruptionLevel;

        @com.aliyun.core.annotation.NameInMap("LiveActivity")
        private LiveActivity liveActivity;

        @com.aliyun.core.annotation.NameInMap("Music")
        private String music;

        @com.aliyun.core.annotation.NameInMap("Mutable")
        private Boolean mutable;

        @com.aliyun.core.annotation.NameInMap("RelevanceScore")
        private Double relevanceScore;

        @com.aliyun.core.annotation.NameInMap("Silent")
        private Boolean silent;

        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private String subtitle;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        private Ios(Builder builder) {
            this.apnsEnv = builder.apnsEnv;
            this.badge = builder.badge;
            this.badgeAutoIncrement = builder.badgeAutoIncrement;
            this.category = builder.category;
            this.collapseId = builder.collapseId;
            this.extParameters = builder.extParameters;
            this.interruptionLevel = builder.interruptionLevel;
            this.liveActivity = builder.liveActivity;
            this.music = builder.music;
            this.mutable = builder.mutable;
            this.relevanceScore = builder.relevanceScore;
            this.silent = builder.silent;
            this.subtitle = builder.subtitle;
            this.threadId = builder.threadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ios create() {
            return builder().build();
        }

        /**
         * @return apnsEnv
         */
        public String getApnsEnv() {
            return this.apnsEnv;
        }

        /**
         * @return badge
         */
        public Integer getBadge() {
            return this.badge;
        }

        /**
         * @return badgeAutoIncrement
         */
        public Boolean getBadgeAutoIncrement() {
            return this.badgeAutoIncrement;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return collapseId
         */
        public String getCollapseId() {
            return this.collapseId;
        }

        /**
         * @return extParameters
         */
        public String getExtParameters() {
            return this.extParameters;
        }

        /**
         * @return interruptionLevel
         */
        public String getInterruptionLevel() {
            return this.interruptionLevel;
        }

        /**
         * @return liveActivity
         */
        public LiveActivity getLiveActivity() {
            return this.liveActivity;
        }

        /**
         * @return music
         */
        public String getMusic() {
            return this.music;
        }

        /**
         * @return mutable
         */
        public Boolean getMutable() {
            return this.mutable;
        }

        /**
         * @return relevanceScore
         */
        public Double getRelevanceScore() {
            return this.relevanceScore;
        }

        /**
         * @return silent
         */
        public Boolean getSilent() {
            return this.silent;
        }

        /**
         * @return subtitle
         */
        public String getSubtitle() {
            return this.subtitle;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        public static final class Builder {
            private String apnsEnv; 
            private Integer badge; 
            private Boolean badgeAutoIncrement; 
            private String category; 
            private String collapseId; 
            private String extParameters; 
            private String interruptionLevel; 
            private LiveActivity liveActivity; 
            private String music; 
            private Boolean mutable; 
            private Double relevanceScore; 
            private Boolean silent; 
            private String subtitle; 
            private String threadId; 

            private Builder() {
            } 

            private Builder(Ios model) {
                this.apnsEnv = model.apnsEnv;
                this.badge = model.badge;
                this.badgeAutoIncrement = model.badgeAutoIncrement;
                this.category = model.category;
                this.collapseId = model.collapseId;
                this.extParameters = model.extParameters;
                this.interruptionLevel = model.interruptionLevel;
                this.liveActivity = model.liveActivity;
                this.music = model.music;
                this.mutable = model.mutable;
                this.relevanceScore = model.relevanceScore;
                this.silent = model.silent;
                this.subtitle = model.subtitle;
                this.threadId = model.threadId;
            } 

            /**
             * ApnsEnv.
             */
            public Builder apnsEnv(String apnsEnv) {
                this.apnsEnv = apnsEnv;
                return this;
            }

            /**
             * Badge.
             */
            public Builder badge(Integer badge) {
                this.badge = badge;
                return this;
            }

            /**
             * BadgeAutoIncrement.
             */
            public Builder badgeAutoIncrement(Boolean badgeAutoIncrement) {
                this.badgeAutoIncrement = badgeAutoIncrement;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CollapseId.
             */
            public Builder collapseId(String collapseId) {
                this.collapseId = collapseId;
                return this;
            }

            /**
             * ExtParameters.
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * InterruptionLevel.
             */
            public Builder interruptionLevel(String interruptionLevel) {
                this.interruptionLevel = interruptionLevel;
                return this;
            }

            /**
             * LiveActivity.
             */
            public Builder liveActivity(LiveActivity liveActivity) {
                this.liveActivity = liveActivity;
                return this;
            }

            /**
             * Music.
             */
            public Builder music(String music) {
                this.music = music;
                return this;
            }

            /**
             * Mutable.
             */
            public Builder mutable(Boolean mutable) {
                this.mutable = mutable;
                return this;
            }

            /**
             * RelevanceScore.
             */
            public Builder relevanceScore(Double relevanceScore) {
                this.relevanceScore = relevanceScore;
                return this;
            }

            /**
             * Silent.
             */
            public Builder silent(Boolean silent) {
                this.silent = silent;
                return this;
            }

            /**
             * Subtitle.
             */
            public Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * ThreadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            public Ios build() {
                return new Ios(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Android")
        private Android android;

        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Hmos")
        private Hmos hmos;

        @com.aliyun.core.annotation.NameInMap("Ios")
        private Ios ios;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Notification(Builder builder) {
            this.android = builder.android;
            this.body = builder.body;
            this.hmos = builder.hmos;
            this.ios = builder.ios;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return android
         */
        public Android getAndroid() {
            return this.android;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return hmos
         */
        public Hmos getHmos() {
            return this.hmos;
        }

        /**
         * @return ios
         */
        public Ios getIos() {
            return this.ios;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Android android; 
            private String body; 
            private Hmos hmos; 
            private Ios ios; 
            private String title; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.android = model.android;
                this.body = model.body;
                this.hmos = model.hmos;
                this.ios = model.ios;
                this.title = model.title;
            } 

            /**
             * Android.
             */
            public Builder android(Android android) {
                this.android = android;
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
             * Hmos.
             */
            public Builder hmos(Hmos hmos) {
                this.hmos = hmos;
                return this;
            }

            /**
             * Ios.
             */
            public Builder ios(Ios ios) {
                this.ios = ios;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Sms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelaySecs")
        private Long delaySecs;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("SendPolicy")
        private String sendPolicy;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Sms(Builder builder) {
            this.delaySecs = builder.delaySecs;
            this.params = builder.params;
            this.sendPolicy = builder.sendPolicy;
            this.signName = builder.signName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sms create() {
            return builder().build();
        }

        /**
         * @return delaySecs
         */
        public Long getDelaySecs() {
            return this.delaySecs;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return sendPolicy
         */
        public String getSendPolicy() {
            return this.sendPolicy;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Long delaySecs; 
            private String params; 
            private String sendPolicy; 
            private String signName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Sms model) {
                this.delaySecs = model.delaySecs;
                this.params = model.params;
                this.sendPolicy = model.sendPolicy;
                this.signName = model.signName;
                this.templateName = model.templateName;
            } 

            /**
             * DelaySecs.
             */
            public Builder delaySecs(Long delaySecs) {
                this.delaySecs = delaySecs;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * SendPolicy.
             */
            public Builder sendPolicy(String sendPolicy) {
                this.sendPolicy = sendPolicy;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Sms build() {
                return new Sms(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("JobKey")
        private String jobKey;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private Long messageId;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("Sms")
        private Sms sms;

        @com.aliyun.core.annotation.NameInMap("Trim")
        private Boolean trim;

        @com.aliyun.core.annotation.NameInMap("UseChannels")
        private String useChannels;

        private Options(Builder builder) {
            this.expireTime = builder.expireTime;
            this.jobKey = builder.jobKey;
            this.messageId = builder.messageId;
            this.pushTime = builder.pushTime;
            this.sms = builder.sms;
            this.trim = builder.trim;
            this.useChannels = builder.useChannels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
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
         * @return messageId
         */
        public Long getMessageId() {
            return this.messageId;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return sms
         */
        public Sms getSms() {
            return this.sms;
        }

        /**
         * @return trim
         */
        public Boolean getTrim() {
            return this.trim;
        }

        /**
         * @return useChannels
         */
        public String getUseChannels() {
            return this.useChannels;
        }

        public static final class Builder {
            private String expireTime; 
            private String jobKey; 
            private Long messageId; 
            private String pushTime; 
            private Sms sms; 
            private Boolean trim; 
            private String useChannels; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.expireTime = model.expireTime;
                this.jobKey = model.jobKey;
                this.messageId = model.messageId;
                this.pushTime = model.pushTime;
                this.sms = model.sms;
                this.trim = model.trim;
                this.useChannels = model.useChannels;
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
             * MessageId.
             */
            public Builder messageId(Long messageId) {
                this.messageId = messageId;
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
             * Sms.
             */
            public Builder sms(Sms sms) {
                this.sms = sms;
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
             * UseChannels.
             */
            public Builder useChannels(String useChannels) {
                this.useChannels = useChannels;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushTask} extends {@link TeaModel}
     *
     * <p>PushTask</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Target(Builder builder) {
            this.platform = builder.platform;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String platform; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.platform = model.platform;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
}
