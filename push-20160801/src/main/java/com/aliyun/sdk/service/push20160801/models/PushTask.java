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
         * <p>The push method. This parameter is optional. Default value: PUSH_IMMEDIATELY (push immediately).</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The MassPushV2 batch push API supports only the following push methods:</p>
         * <ul>
         * <li>PUSH_IMMEDIATELY (push immediately)</li>
         * <li>SCHEDULED_PUSH (scheduled push)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUSH_IMMEDIATELY</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The pass-through message data sent to the device. The total length cannot exceed 4,000 bytes.</p>
         * <blockquote>
         * <p>Length calculation rules</p>
         * <ul>
         * <li>The length is calculated based on the byte length of the UTF-8 encoded string after the Message object is serialized into JSON.</li>
         * <li>A Chinese character typically occupies 3 bytes in UTF-8 encoding.</li>
         * </ul>
         * </blockquote>
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The vendor notification data sent to the device.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>If both Message and Notification are configured, the device receives only one of them based on the following rules:</p>
         * <ul>
         * <li>If the device is online, the pass-through message data is sent.</li>
         * <li>If the device is offline, the system notification is sent.</li>
         * </ul>
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * <p>The push options.</p>
         */
        public Builder options(Options options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The target object for the message push. This parameter is optional when the Action parameter is set to CREATE_CONTINUOUS_PUSH (create a continuous push task).</p>
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
             * <p>The body of the message to be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;: &quot;value&quot;}</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The title of the message to be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
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
             * <p>The custom notification bar style for Android. Valid values: 1 to 100.</p>
             * <blockquote>
             * <p>The client must complete the style preset configuration. References: <a href="https://help.aliyun.com/document_detail/2834944.html">Custom notification style API</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customStyle(Integer customStyle) {
                this.customStyle = customStyle;
                return this;
            }

            /**
             * <p>The reminder method for the notification. Valid values:</p>
             * <ul>
             * <li>VIBRATE: Vibration (default).</li>
             * <li>SOUND: Sound.</li>
             * <li>BOTH: Sound and vibration.</li>
             * <li>NONE: Silent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * <p>Specifies the activity to open when the notification is clicked. Valid only when OpenType is set to ACTIVITY.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
             */
            public Builder openActivity(String openActivity) {
                this.openActivity = openActivity;
                return this;
            }

            /**
             * <p>The action to perform when the notification is clicked. Valid values:</p>
             * <ul>
             * <li>APPLICATION: Open the application (default).</li>
             * <li>ACTIVITY: Open the specified activity OpenActivity.</li>
             * <li>URL: Open a URL.</li>
             * <li>NONE: No redirection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPLICATION</p>
             */
            public Builder openType(String openType) {
                this.openType = openType;
                return this;
            }

            /**
             * <p>The URL to open when the notification is clicked after an Android device receives the push message. Valid only when OpenType is set to URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder openUrl(String openUrl) {
                this.openUrl = openUrl;
                return this;
            }

            /**
             * <p>The priority of the display position for Android notifications in the notification bar. Valid values: -2, -1, 0, 1, and 2.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The message group. Messages in the same group are collapsed and can be expanded in the notification bar. Notifications from different groups are displayed separately.</p>
             * <blockquote>
             * <p>Supported by Android SDK 3.9.2 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>order_ORD20231201001</p>
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
             * <p>Sets the importance parameter for Honor notification message classification, which determines the notification behavior on user devices. Valid values:</p>
             * <ul>
             * <li>0: Information and marketing messages.</li>
             * <li>1: Service and communication messages.</li>
             * </ul>
             * <p>You must apply on the Honor platform. See <a href="https://developer.honor.com/cn/docs/11002/guides/notification-class#%E8%87%AA%E5%88%86%E7%B1%BB%E6%9D%83%E7%9B%8A%E7%94%B3%E8%AF%B7">Application link</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Sets the Huawei fast notification parameter. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Send standard Huawei notifications (default).</li>
             * <li><strong>1</strong>: Send Huawei fast notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder businessType(Integer businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>Purpose 1: After applying for <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835?#section3410731125514">self-classification benefits</a>, this parameter is used to identify the message type, determine the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#ZH-CN_TOPIC_0000001149358835__p3850133955718">message reminder method</a>, and accelerate the delivery of specific types of messages. For valid values, refer to the <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section1076611477914">message classification standards</a> in the official Huawei push documentation, and fill in the &quot;Cloud notification category value&quot; or &quot;Local notification category value&quot; from the documentation table.</p>
             * <p>Purpose 2: After <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">applying for special permissions</a>, this parameter is used to identify high-priority pass-through scenarios. Valid values:</p>
             * <ul>
             * <li>VOIP: Audio and video calls.</li>
             * <li>PLAY_VOICE: Voice broadcast.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If the &quot;Cloud notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Alibaba Cloud proprietary channel.</li>
             * <li>If the &quot;Local notification category value&quot; is &quot;Not applicable&quot;, the message is sent through the Huawei channel.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>VOIP</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Sets the importance parameter for Huawei notification message classification, which determines the notification behavior on user devices. Valid values:</p>
             * <ul>
             * <li>0: Information and marketing messages.</li>
             * <li>1: Service and communication messages.</li>
             * </ul>
             * <blockquote>
             * <p>We recommend that you use Category for notification classification. You must apply on the Huawei platform. See <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/message-classification-0000001149358835#section893184112272">Application link</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * <p>The JSON string of the Huawei Android Live Window data structure <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References/rest-live-0000001562939968#ZH-CN_TOPIC_0000001700850537__p195121620102511">LiveNotificationPayload</a>. For development and integration, refer to the <a href="https://help.aliyun.com/document_detail/2983768.html">Huawei Live Window push guide</a>.</p>
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
            public Builder liveNotificationPayload(String liveNotificationPayload) {
                this.liveNotificationPayload = liveNotificationPayload;
                return this;
            }

            /**
             * <p>The receipt ID of the Huawei channel. You can view this receipt ID in the receipt parameter settings of the Huawei channel push operations platform.</p>
             * <blockquote>
             * <p>If the default receipt configuration on the Huawei channel push operations platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, we recommend that you configure the default receipt ID for the Huawei channel in the Alibaba Cloud EMAS shift push console first.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RCP4C123456</p>
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * <p>The delivery priority for Huawei channel notifications. Valid values:</p>
             * <ul>
             * <li>HIGH</li>
             * <li>NORMAL</li>
             * </ul>
             * <p>You must apply for permissions. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/development/HMSCore-Guides/faq-0000001050042183#section037425218509">Application link</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
             * <p>The Meizu message type. Valid values:</p>
             * <ul>
             * <li>0: Public message (default).</li>
             * <li>1: Private message.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>OPPO message categorization includes two categories for management: communication and service, and content and marketing. </p>
             * <p><strong>Communication and service (requires permission application):</strong></p>
             * <ul>
             * <li>IM: Instant messages.</li>
             * <li>ACCOUNT: Accounts and assets.</li>
             * <li>TODO: Schedules and to-do lists.</li>
             * <li>DEVICE_REMINDER: Device information.</li>
             * <li>ORDER: Orders and logistics.</li>
             * <li>SUBSCRIPTION: subscribe reminders.</li>
             * </ul>
             * <p><strong>Content and marketing:</strong></p>
             * <ul>
             * <li>NEWS: News.</li>
             * <li>CONTENT: Content recommendations.</li>
             * <li>MARKETING: operational activity.</li>
             * <li>SOCIAL: Social updates.</li>
             * </ul>
             * <p>For more information, see the <a href="https://open.oppomobile.com/new/developmentDoc/info?id=13189">OPPO categorization description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>NEWS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The JSON character string of the OPPO Fluid Cloud intent delete data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13578">data</a>. This parameter is invalid if the AndroidOppoIntelligentIntent parameter is already specified. For development and integration, References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
            public Builder deleteIntentData(String deleteIntentData) {
                this.deleteIntentData = deleteIntentData;
                return this;
            }

            /**
             * <p>The JSON character string of the OPPO Fluid Cloud intent sharing data structure <a href="https://open.oppomobile.com/documentation/page/info?id=13565">IntelligentIntent</a>. For development and integration, References: <a href="https://help.aliyun.com/document_detail/2997310.html">OPPO Fluid Cloud push guide</a>.</p>
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
            public Builder intelligentIntent(String intelligentIntent) {
                this.intelligentIntent = intelligentIntent;
                return this;
            }

            /**
             * <p>The reminder level for OPPO channel notification bar messages. Valid values:</p>
             * <ul>
             * <li>1: Notification bar.</li>
             * <li>2: Notification bar, lock screen, ringtone, and vibration (default notification level for communication and service messages).</li>
             * <li>16: Notification bar, lock screen, ringtone, vibration, and banner (requires permission application).</li>
             * </ul>
             * <blockquote>
             * <p>When you use the NotifyLevel parameter, you must also pass the Category parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notifyLevel(Long notifyLevel) {
                this.notifyLevel = notifyLevel;
                return this;
            }

            /**
             * <p>The OPPO private message template content parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;key1&quot;: &quot;value1&quot;,
             * &quot;key2&quot;: &quot;value2&quot;
             * }</p>
             */
            public Builder privateContentParameters(String privateContentParameters) {
                this.privateContentParameters = privateContentParameters;
                return this;
            }

            /**
             * <p>The OPPO private message template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>687557242b1634hzefs3d5013</p>
             */
            public Builder privateMsgTemplateId(String privateMsgTemplateId) {
                this.privateMsgTemplateId = privateMsgTemplateId;
                return this;
            }

            /**
             * <p>The OPPO private message template title parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;: &quot;Zhang San&quot;}</p>
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
        @com.aliyun.core.annotation.NameInMap("AddBadge")
        private Boolean addBadge;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        @com.aliyun.core.annotation.NameInMap("LiveMessage")
        private String liveMessage;

        @com.aliyun.core.annotation.NameInMap("ReceiptId")
        private String receiptId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateParams")
        private String templateParams;

        private Vivo(Builder builder) {
            this.addBadge = builder.addBadge;
            this.category = builder.category;
            this.importance = builder.importance;
            this.liveMessage = builder.liveMessage;
            this.receiptId = builder.receiptId;
            this.templateId = builder.templateId;
            this.templateParams = builder.templateParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vivo create() {
            return builder().build();
        }

        /**
         * @return addBadge
         */
        public Boolean getAddBadge() {
            return this.addBadge;
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
         * @return liveMessage
         */
        public String getLiveMessage() {
            return this.liveMessage;
        }

        /**
         * @return receiptId
         */
        public String getReceiptId() {
            return this.receiptId;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateParams
         */
        public String getTemplateParams() {
            return this.templateParams;
        }

        public static final class Builder {
            private Boolean addBadge; 
            private String category; 
            private Integer importance; 
            private String liveMessage; 
            private String receiptId; 
            private String templateId; 
            private String templateParams; 

            private Builder() {
            } 

            private Builder(Vivo model) {
                this.addBadge = model.addBadge;
                this.category = model.category;
                this.importance = model.importance;
                this.liveMessage = model.liveMessage;
                this.receiptId = model.receiptId;
                this.templateId = model.templateId;
                this.templateParams = model.templateParams;
            } 

            /**
             * <p>Sets the increment value for the vivo channel badge.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder addBadge(Boolean addBadge) {
                this.addBadge = addBadge;
                return this;
            }

            /**
             * <p>vivo message categorization includes two categories for management: system messages and operation messages. </p>
             * <p><strong>System messages:</strong></p>
             * <ul>
             * <li>IM: Instant messages.</li>
             * <li>ACCOUNT: Accounts and assets.</li>
             * <li>TODO: Schedules and to-do lists.</li>
             * <li>DEVICE_REMINDER: Device information.</li>
             * <li>ORDER: Orders and logistics.</li>
             * <li>SUBSCRIPTION: subscribe reminders.</li>
             * </ul>
             * <p><strong>Operation messages:</strong></p>
             * <ul>
             * <li>NEWS: News.</li>
             * <li>CONTENT: Content recommendations.</li>
             * <li>MARKETING: operational activity.</li>
             * <li>SOCIAL: Social updates.</li>
             * </ul>
             * <p>For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359#s-ef3qugc3">vivo categorization description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MARKETING</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Sets the vivo notification message classification. Valid values:</p>
             * <ul>
             * <li>0: Operation messages (default).</li>
             * <li>1: System messages.</li>
             * </ul>
             * <blockquote>
             * <p>We recommend that you use Category for notification classification. You must apply on the vivo platform. For more information, see <a href="https://dev.vivo.com.cn/documentCenter/doc/359">Application link</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * <p>The JSON character string of the vivo Atomic Island data structure <a href="https://dev.vivo.com.cn/documentCenter/doc/896#s-fdagzbd4">liveMessage</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3030718.html">vivo Atomic Island push guide</a>.</p>
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
            public Builder liveMessage(String liveMessage) {
                this.liveMessage = liveMessage;
                return this;
            }

            /**
             * <p>The message receipt identifier for the vivo vendor push channel, used to receive callback notifications for push results.</p>
             * <blockquote>
             * <ul>
             * <li>Location: vivo Open Platform &gt; Push Service &gt; Application Information &gt; Receipt Configuration.</li>
             * <li>Configuration recommendation: Configure the default receipt ID in the Alibaba Cloud EMAS console first.</li>
             * <li>Usage condition: Required only when the default receipt on the vivo platform is not the Alibaba Cloud receipt.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1232221</p>
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateParams.
             */
            public Builder templateParams(String templateParams) {
                this.templateParams = templateParams;
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

        @com.aliyun.core.annotation.NameInMap("FocusParam")
        private String focusParam;

        @com.aliyun.core.annotation.NameInMap("FocusPics")
        private String focusPics;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateParams")
        private String templateParams;

        private Xiaomi(Builder builder) {
            this.channel = builder.channel;
            this.focusParam = builder.focusParam;
            this.focusPics = builder.focusPics;
            this.templateId = builder.templateId;
            this.templateParams = builder.templateParams;
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

        /**
         * @return focusParam
         */
        public String getFocusParam() {
            return this.focusParam;
        }

        /**
         * @return focusPics
         */
        public String getFocusPics() {
            return this.focusPics;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateParams
         */
        public String getTemplateParams() {
            return this.templateParams;
        }

        public static final class Builder {
            private String channel; 
            private String focusParam; 
            private String focusPics; 
            private String templateId; 
            private String templateParams; 

            private Builder() {
            } 

            private Builder(Xiaomi model) {
                this.channel = model.channel;
                this.focusParam = model.focusParam;
                this.focusPics = model.focusPics;
                this.templateId = model.templateId;
                this.templateParams = model.templateParams;
            } 

            /**
             * <p>Sets the channel ID for the Xiaomi notification type. You must apply on the Xiaomi platform. For more information, see <a href="https://dev.mi.com/console/doc/detail?pId=2422#_4">Application link</a>.</p>
             * <blockquote>
             * <p>A single application can apply for a maximum of eight channels on the Xiaomi channel. Plan accordingly in advance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>michannel</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The JSON character string of the Xiaomi Super Island data structure <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.param</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
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
            public Builder focusParam(String focusParam) {
                this.focusParam = focusParam;
                return this;
            }

            /**
             * <p>The JSON character string of the Xiaomi Super Island data images <a href="https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2131">miui.focus.pic_xxx</a>. For development and integration, References: <a href="https://www.alibabacloud.com/help/en/document_detail/3037956.html">Xiaomi Super Island push guide</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;miui.focus.pic_ticker&quot;: &quot;<a href="https://example.com/ticker.jpg">https://example.com/ticker.jpg</a>&quot;,
             *     &quot;miui.focus.pic_aod&quot;: &quot;<a href="https://example.com/aod.jpg">https://example.com/aod.jpg</a>&quot;,
             *     &quot;miui.focus.pic_imageText&quot;: &quot;<a href="https://example.com/imageText.jpg">https://example.com/imageText.jpg</a>&quot;
             * }</p>
             */
            public Builder focusPics(String focusPics) {
                this.focusPics = focusPics;
                return this;
            }

            /**
             * <p>The Xiaomi private message template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P10645</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The Xiaomi private message template parameters, as a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;keywords1&quot;:&quot;Tom&quot;,&quot;keywords2&quot;:&quot;phone&quot;}</p>
             */
            public Builder templateParams(String templateParams) {
                this.templateParams = templateParams;
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
             * <p>The Alibaba Cloud proprietary configuration.</p>
             * <blockquote>
             * <p>Valid only when the Alibaba Cloud proprietary channel is used.</p>
             * </blockquote>
             */
            public Builder accs(Accs accs) {
                this.accs = accs;
                return this;
            }

            /**
             * <p>The Honor configuration.</p>
             */
            public Builder honor(Honor honor) {
                this.honor = honor;
                return this;
            }

            /**
             * <p>The Huawei configuration.</p>
             */
            public Builder huawei(Huawei huawei) {
                this.huawei = huawei;
                return this;
            }

            /**
             * <p>The Meizu configuration.</p>
             */
            public Builder meizu(Meizu meizu) {
                this.meizu = meizu;
                return this;
            }

            /**
             * <p>The OPPO configuration.</p>
             */
            public Builder oppo(Oppo oppo) {
                this.oppo = oppo;
                return this;
            }

            /**
             * <p>The vivo configuration.</p>
             */
            public Builder vivo(Vivo vivo) {
                this.vivo = vivo;
                return this;
            }

            /**
             * <p>The Xiaomi configuration.</p>
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
             * <p>The fully qualified class name of the application entry activity for badge settings.</p>
             * <blockquote>
             * <p>Valid only for Huawei and Honor vendor channel pushes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
             */
            public Builder badgeActivity(String badgeActivity) {
                this.badgeActivity = badgeActivity;
                return this;
            }

            /**
             * <p>Sets the increment value for the badge, which is added to the original badge number.</p>
             * <blockquote>
             * <ul>
             * <li>Supported by Huawei and Honor channels.</li>
             * <li>If both BadgeAddNum and BadgeSetNum are specified, BadgeSetNum takes precedence.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder badgeAddNum(Integer badgeAddNum) {
                this.badgeAddNum = badgeAddNum;
                return this;
            }

            /**
             * <p>Sets a fixed value for the badge number. Valid values: 1 to 99.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter takes effect only for Huawei and Honor vendor channel pushes. </li>
             * <li>For Alibaba Cloud proprietary channel pushes, this parameter takes effect only on Huawei, Honor, and vivo devices.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder badgeSetNum(Integer badgeSetNum) {
                this.badgeSetNum = badgeSetNum;
                return this;
            }

            /**
             * <p>Sets the channel ID of the Android application. The channel ID must match the channel ID in the vendor application.</p>
             * <blockquote>
             * <ul>
             * <li>Because the channel_id of the OPPO private message channel is the same as the channel ID of the application, this value is used as the channel_id when pushing through the OPPO channel.</li>
             * <li>This value is also used as the channel_id for Huawei, FCM, and Alibaba Cloud proprietary channel pushes.</li>
             * <li>For specific use cases, see the FAQ: <a href="https://help.aliyun.com/document_detail/67398.html">Notifications are not received on devices running Android 8.0 or later</a>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8.0up</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The custom extension attributes for Android notifications.</p>
             * <blockquote>
             * <ul>
             * <li>The parameter must be passed in standard JSON map format. Incorrect formats will cause parsing failures.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * <p>The message group. For messages in the same group, only the latest message and the total number of received messages in the group are displayed in the notification bar. All messages are not displayed and cannot be expanded. Currently supported by:</p>
             * <ul>
             * <li>Huawei vendor channel.</li>
             * <li>Honor vendor channel.</li>
             * <li>Proprietary channels with Android SDK 3.9.1 or earlier.</li>
             * </ul>
             * <blockquote>
             * <p>Proprietary channels no longer support this parameter in Android SDK 3.9.2 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>group-1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The URL of the icon on the right side. Currently supported by:</p>
             * <ul>
             * <li>Huawei EMUI (applicable only in long text mode and Inbox mode).</li>
             * <li>Honor Magic UI (applicable only in long text mode).</li>
             * <li>Proprietary channels (Android SDK 3.5.0 or later).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The body text in Inbox mode. The content must be a valid JSON array with a maximum of five elements. Currently supported by:</p>
             * <ul>
             * <li>Huawei: EMUI 9 or later.</li>
             * <li>Honor: Magic UI 4.0 or later.</li>
             * <li>Xiaomi: MIUI 10 or later.</li>
             * <li>OPPO: ColorOS 5.0 or later.</li>
             * <li>Proprietary channels: Android SDK 3.6.0 or later.</li>
             * </ul>
             */
            public Builder inboxContent(java.util.List<String> inboxContent) {
                this.inboxContent = inboxContent;
                return this;
            }

            /**
             * <p>The notification sound for the Huawei vendor channel. Specify the audio file name stored in the <code>app/src/main/res/raw/</code> directory of the client project. Do not include the file format extension. If not set, the default ringtone is used.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_notification_sound</p>
             */
            public Builder music(String music) {
                this.music = music;
                return this;
            }

            /**
             * <p>The unique identifier of the Android notification bar message, used to control the override and replacement behavior of notifications. A new notification with the same NotifyId automatically overrides the old notification.</p>
             * 
             * <strong>example:</strong>
             * <p>233856727</p>
             */
            public Builder notifyId(Integer notifyId) {
                this.notifyId = notifyId;
                return this;
            }

            /**
             * <p>The detailed channel configuration.</p>
             */
            public Builder options(AndroidOptions options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The image URL in large image mode. Currently supported by proprietary channels with Android SDK 3.6.0 or later.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imag.example.com/image.png">https://imag.example.com/image.png</a></p>
             */
            public Builder pictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
                return this;
            }

            /**
             * <p>The notification style. Valid values:</p>
             * <ul>
             * <li>0: Standard mode (default).</li>
             * <li>1: Long text mode (supported by Huawei, Honor, Xiaomi, OPPO, Meizu, and proprietary channels).</li>
             * <li>2: Large image mode (supported by proprietary channels).</li>
             * <li>3: List mode (supported by Huawei, Honor, Xiaomi, OPPO, and proprietary channels).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder renderStyle(String renderStyle) {
                this.renderStyle = renderStyle;
                return this;
            }

            /**
             * <p>Sets the notification type for vendor channels. Valid values:</p>
             * <ul>
             * <li>false: Formal notification (default).</li>
             * <li>true: Test notification.</li>
             * </ul>
             * <blockquote>
             * <p>Currently supported by Huawei channel, Honor channel, vivo channel, and OPPO Fluid Cloud.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder testMessage(Boolean testMessage) {
                this.testMessage = testMessage;
                return this;
            }

            /**
             * <p>Specifies the activity to open when the notification is clicked.</p>
             * <blockquote>
             * <p>Warning: This parameter is required when you use Android vendor channels.</warning></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.cloudpushdemo.bizactivity</p>
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
             * <p>The action corresponding to the ability of the in-app page.</p>
             * <blockquote>
             * <p>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.action</a> on the HarmonyOS official website.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>com.example.action</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The number to add to the HarmonyOS application badge.</p>
             * <blockquote>
             * <ul>
             * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
             * <li>For more information, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">addNum field description</a> for HarmonyOS badges.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder badgeAddNum(Integer badgeAddNum) {
                this.badgeAddNum = badgeAddNum;
                return this;
            }

            /**
             * <p>The number to set for the HarmonyOS application badge.</p>
             * <blockquote>
             * <ul>
             * <li>For more information, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section266310382145">setNum field</a> description for HarmonyOS badges.</li>
             * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder badgeSetNum(Integer badgeSetNum) {
                this.badgeSetNum = badgeSetNum;
                return this;
            }

            /**
             * <p>The category of the notification message. This parameter is optional. Default value: MARKETING.</p>
             * <blockquote>
             * <p>After you apply for the notification message auto-classification permission, this parameter is used to identify the message type. Different notification message types affect the message display and reminder methods. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.category</a> on the HarmonyOS official website.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IM</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Sets the custom extension attributes of the notification message to pass additional business data.</p>
             * <blockquote>
             * <p>The parameter must be passed in standard JSON map format. Incorrect formats will cause parsing failures.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;: &quot;value&quot;}</p>
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * <p>The additional data for notification extension messages.</p>
             * <blockquote>
             * <ul>
             * <li>Valid only when sending HarmonyOS notification extension messages.</li>
             * <li>Conceptually equivalent to the extraData field of HarmonyOS notification extension messages. For specific definitions, see the <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section161192514234">ExtensionPayload</a> description in HarmonyOS.</li>
             * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder extensionExtraData(String extensionExtraData) {
                this.extensionExtraData = extensionExtraData;
                return this;
            }

            /**
             * <p>Enables HarmonyOS notification extensions.</p>
             * <blockquote>
             * <ul>
             * <li>To send notification extension messages, you must first apply for permissions on the HarmonyOS official website. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/push-send-extend-noti-V5">HarmonyOS documentation</a>.</li>
             * <li>Supported by HarmonyOS SDK 1.2.0 and later.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder extensionPush(Boolean extensionPush) {
                this.extensionPush = extensionPush;
                return this;
            }

            /**
             * <p>The URL of the large icon on the right side of the notification. The URL must use the HTTPS protocol.</p>
             * <blockquote>
             * <ul>
             * <li>Supported image formats: PNG, JPG, JPEG, HEIF, GIF, and BMP. The total number of pixels (width × height) must be less than 25,000.</li>
             * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.image</a> on the HarmonyOS official website.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/xxx.png">https://example.com/xxx.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>When RenderStyle is set to MULTI_LINE, this field is required to define the content for the multi-line text style. A maximum of three content items are supported.</p>
             */
            public Builder inboxContent(java.util.List<String> inboxContent) {
                this.inboxContent = inboxContent;
                return this;
            }

            /**
             * <p>The JSON string of the HarmonyOS Live View data structure <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V13/push-scenariozed-api-request-param-V13#section66881469306">LiveViewPayload</a>. For development and integration, refer to the <a href="https://help.aliyun.com/document_detail/2982112.html">HarmonyOS Live View push guide</a>.</p>
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
            public Builder liveViewPayload(String liveViewPayload) {
                this.liveViewPayload = liveViewPayload;
                return this;
            }

            /**
             * <p>The unique identifier (notifyId) for each message displayed in the notification bar. If this parameter is not provided, the push service automatically generates a unique identifier. Different notification messages can use the same notifyId to allow new messages to overwrite old ones. For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section17371529101117">Notification.notifyId</a> on the HarmonyOS official website.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder notifyId(Integer notifyId) {
                this.notifyId = notifyId;
                return this;
            }

            /**
             * <p>The receipt ID of the HarmonyOS channel. You can view this receipt ID in the receipt parameter settings of the HarmonyOS channel push operations platform.</p>
             * <blockquote>
             * <ul>
             * <li>If the default receipt configuration on the HarmonyOS channel push operations platform is set to Alibaba Cloud receipt, you do not need to provide this parameter. Otherwise, we recommend that you configure the default receipt ID for the HarmonyOS channel in the Alibaba Cloud EMAS shift push console first.</li>
             * <li>For details, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">pushOptions.receiptId</a> on the HarmonyOS official website.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RCPB***DFD5</p>
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * <p>The notification message style. This parameter is optional. Default value: NORMAL.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder renderStyle(String renderStyle) {
                this.renderStyle = renderStyle;
                return this;
            }

            /**
             * <p>Uses a notification channel of the specified type.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is valid only for Alibaba Cloud proprietary channels.</li>
             * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/js-apis-notificationmanager-V5#slottype">SlotType</a> on the HarmonyOS official website.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SOCIAL_COMMUNICATION</p>
             */
            public Builder slotType(String slotType) {
                this.slotType = slotType;
                return this;
            }

            /**
             * <p>The custom ringtone file name for HarmonyOS.</p>
             * 
             * <strong>example:</strong>
             * <p>music.mp3</p>
             */
            public Builder sound(String sound) {
                this.sound = sound;
                return this;
            }

            /**
             * <p>The duration of the custom message notification ringtone, in seconds. Valid values: 1 to 60. If the ringtone duration is shorter than the notification display time, the ringtone loops.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder soundDuration(Integer soundDuration) {
                this.soundDuration = soundDuration;
                return this;
            }

            /**
             * <p>Enables test messages.</p>
             * <blockquote>
             * <ul>
             * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section418321011212">TestMessage</a> in the HarmonyOS push parameters.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder testMessage(Boolean testMessage) {
                this.testMessage = testMessage;
                return this;
            }

            /**
             * <p>The URI corresponding to the ability of the built-in app page.</p>
             * <blockquote>
             * <ul>
             * <li>If multiple abilities exist, specify the action and URI for each ability. The action is prioritized when searching for the corresponding built-in app page.</li>
             * <li>For more information, see <a href="https://developer.huawei.com/consumer/cn/doc/harmonyos-references-V5/push-scenariozed-api-request-param-V5#section152462191216">ClickAction.uri</a> on the HarmonyOS official website.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com:8080/push/example">https://www.example.com:8080/push/example</a></p>
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
             * <p>The static pass-through parameters for iOS Live Activity push, which are used to pass unchanged business identification information.</p>
             * <blockquote>
             * <p>This parameter is required when Event is set to start.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;orderId&quot;: &quot;ORD20231201001&quot;,
             *   &quot;restaurantName&quot;: &quot;Tasty Restaurant&quot;,
             *   &quot;customerAddress&quot;: &quot;No. xx, xx Road, xx District&quot;,
             *   &quot;orderType&quot;: &quot;delivery&quot;
             * }</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The type of the Live Activity to be started.</p>
             * <blockquote>
             * <p>This parameter is required when Event is set to start.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OrderActivityAttributes</p>
             */
            public Builder attributesType(String attributesType) {
                this.attributesType = attributesType;
                return this;
            }

            /**
             * <p>The dynamic pass-through parameters for the Live Activity, which contain status information and changing data that can be updated in real time.</p>
             * <blockquote>
             * <ul>
             * <li>Avoid excessively frequent updates. An interval of 5 seconds or more is recommended.</li>
             * <li>Update multiple fields in batches to reduce the number of pushes.</li>
             * <li>Consider the user experience and avoid interface flickering.</li>
             * <li>Must be a valid JSON string.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;status&quot;: &quot;delivering&quot;,
             *     &quot;estimatedTime&quot;: &quot;10 minutes&quot;,
             *     &quot;progress&quot;: 80,
             *     &quot;driverName&quot;: &quot;Driver Li&quot;,
             *     &quot;currentStep&quot;: &quot;The courier is on the way&quot;
             * }</p>
             */
            public Builder contentState(String contentState) {
                this.contentState = contentState;
                return this;
            }

            /**
             * <p>The retention time of a completed Live Activity on the Lock Screen, which allows users to view the information after the activity ends. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1701439800</p>
             */
            public Builder dismissalDate(Long dismissalDate) {
                this.dismissalDate = dismissalDate;
                return this;
            }

            /**
             * <p>Starts, updates, or ends a live activity.</p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>The unique identifier of the Live Activity, which is used to associate the activity instance on the device with the push target on the server.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li><p>The ID must be the same as the forActivityId parameter in the registerLiveActivityPushToken method of the client SDK.</p>
             * </li>
             * <li><p>The server uses this ID to locate the specific activity instance during a push.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FOOD_DELIVERY_ORD20231201001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The expiration timestamp for the content of the iOS Live Activity. The value is a UNIX timestamp in seconds.</p>
             * <blockquote>
             * <ul>
             * <li>After the specified time is reached, the system automatically marks the activity as stale.</li>
             * <li>Stale activities are removed from the Dynamic Island and the Lock Screen.</li>
             * <li>This prevents outdated information from occupying the user interface for a long time.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1701425400</p>
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
             * <p>To send iOS notifications through the APNs center, you must specify the corresponding environment context. This parameter is optional. Default value: production environment.</p>
             * <ul>
             * <li>DEV: the development environment, which applies to applications directly installed and debugged by using Xcode.</li>
             * <li>PRODUCT: the production environment, which applies to applications distributed through the App Store, TestFlight, Ad Hoc, and enterprise distribution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder apnsEnv(String apnsEnv) {
                this.apnsEnv = apnsEnv;
                return this;
            }

            /**
             * <p>The badge of the iOS application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder badge(Integer badge) {
                this.badge = badge;
                return this;
            }

            /**
             * <p>Specifies whether to enable the automatic badge increment feature. This parameter is optional. Default value: false.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter cannot be used together with the badge setting parameter.</li>
             * <li>The automatic badge increment feature maintains the badge count for each device on the Alibaba Cloud push server. You must use SDK version 1.9.5 or later to actively synchronize the badge count to the server.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder badgeAutoIncrement(Boolean badgeAutoIncrement) {
                this.badgeAutoIncrement = badgeAutoIncrement;
                return this;
            }

            /**
             * <p>The category identifier of the iOS notification, which is used to define the interactive behavior and display style of the notification.</p>
             * <blockquote>
             * <ul>
             * <li>The category must be pre-registered in the application to take effect.</li>
             * <li>Different categories can define different sets of actions.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MESSAGE_REPLY</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The unique identifier used to control notification grouping. Notifications with the same identifier are overwritten.</p>
             * 
             * <strong>example:</strong>
             * <p>order_status_update_12345</p>
             */
            public Builder collapseId(String collapseId) {
                this.collapseId = collapseId;
                return this;
            }

            /**
             * <p>The custom extension attributes of the iOS notification.</p>
             * <blockquote>
             * <ul>
             * <li>The parameter must be passed in standard JSON map format. Incorrect formats cause parsing failures.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;attachment&quot;: &quot;<a href="https://www.example.com/notification_pic.png%22%7D">https://www.example.com/notification_pic.png&quot;}</a></p>
             */
            public Builder extParameters(String extParameters) {
                this.extParameters = extParameters;
                return this;
            }

            /**
             * <p>The interruption level. This parameter is optional. Valid values:</p>
             * <ul>
             * <li>passive: The system adds the notification to the notification list without lighting up the screen or playing a sound.</li>
             * <li>active: The system displays the notification immediately, lights up the screen, and may play a sound.</li>
             * <li>time-sensitive: The system presents the notification immediately, lights up the screen, and may play a sound, but does not bypass the system notification controls.</li>
             * <li>critical: The system displays the notification immediately, lights up the screen, and plays a sound bypassing the silent switch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder interruptionLevel(String interruptionLevel) {
                this.interruptionLevel = interruptionLevel;
                return this;
            }

            /**
             * <p>The Live Activity parameter object.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li>Live Activity push supports pushing to a <strong>single device</strong> only by using the DEVICE type.</li>
             * <li>When pushing to a Live Activity, you do not need to specify the title and body parameters.</li>
             * </ul>
             */
            public Builder liveActivity(LiveActivity liveActivity) {
                this.liveActivity = liveActivity;
                return this;
            }

            /**
             * <p>The sound of the iOS notification. Specify the name of the audio file stored in the app bundle or the Library/Sounds directory of the sandbox. For more information, see <a href="https://help.aliyun.com/document_detail/48906.html">How to set the notification sound for iOS push</a>.</p>
             * <blockquote>
             * <ul>
             * <li>If an empty string (&quot;&quot;) is specified, the notification is silent.</li>
             * <li>If this parameter is not set, the default value default is used, which indicates the system prompt sound.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder music(String music) {
                this.music = music;
                return this;
            }

            /**
             * <p>Specifies whether to enable extended notifications and allow iOS notifications to be processed by the Notification Service Extension.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter must be set to true when sending silent notifications.</li>
             * <li>The processing time of the extension cannot exceed 30 seconds.</li>
             * <li>A timeout causes the notification to display the original content.</li>
             * <li>You must add the Notification Service Extension to your application.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mutable(Boolean mutable) {
                this.mutable = mutable;
                return this;
            }

            /**
             * <p>The relevance score of the notification message, which is used to control the priority and display strategy of the notification.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder relevanceScore(Double relevanceScore) {
                this.relevanceScore = relevanceScore;
                return this;
            }

            /**
             * <p>Specifies whether to enable the silent push mode.</p>
             * <blockquote>
             * <ul>
             * <li>When sending a silent notification, you do not need to specify the title and body parameters.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder silent(Boolean silent) {
                this.silent = silent;
                return this;
            }

            /**
             * <p>The subtitle of the iOS notification.</p>
             * 
             * <strong>example:</strong>
             * <p>Please check your order</p>
             */
            public Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The thread identifier for iOS notification grouping, which is used to group and collapse related notifications.</p>
             * <blockquote>
             * <ul>
             * <li>Notifications with the same thread ID are automatically grouped.</li>
             * <li>Multiple related notifications are collapsed into a single notification group.</li>
             * <li>Users can expand the group to view all notifications within it.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>news_category_tech</p>
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
             * <p>The Android notification configuration.</p>
             */
            public Builder android(Android android) {
                this.android = android;
                return this;
            }

            /**
             * <p>The body of the notification to be pushed.</p>
             * <blockquote>
             * <p>Length limits:</p>
             * <ul>
             * <li>iOS/HarmonyOS/Android: the <strong>character length</strong> cannot exceed 200.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Dear customer, your reservation has been successfully canceled</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>HarmonyOS notification configuration.</p>
             */
            public Builder hmos(Hmos hmos) {
                this.hmos = hmos;
                return this;
            }

            /**
             * <p>iOS notification configuration.</p>
             */
            public Builder ios(Ios ios) {
                this.ios = ios;
                return this;
            }

            /**
             * <p>The title of the notification to be pushed.</p>
             * <blockquote>
             * <p>Length limits:</p>
             * <ul>
             * <li>iOS/HarmonyOS: the <strong>byte length</strong> cannot exceed 200.</li>
             * <li>Android: the <strong>character length</strong> cannot exceed 50.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>You have a new message</p>
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
             * <p>The delay time before the SMS message is triggered. Unit: seconds.</p>
             * <p>If you use SMS linkage, this parameter is required. Set this parameter to at least 15 seconds and no more than 3 days to avoid duplicate SMS and push messages.</p>
             * <blockquote>
             * <p>When SMS linkage is used, the ExpireTime parameter becomes invalid. The expiration time of the notification is calculated based on the DelaySecs parameter. The expiration time is the current time plus the DelaySecs value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder delaySecs(Long delaySecs) {
                this.delaySecs = delaySecs;
                return this;
            }

            /**
             * <p>The key-value pairs of the variables in the SMS template.</p>
             * 
             * <strong>example:</strong>
             * <p>key1=value1&amp;key2=value2</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The SMS sending policy.</p>
             * 
             * <strong>example:</strong>
             * <p>PUSH_NOT_RECEIVED</p>
             */
            public Builder sendPolicy(String sendPolicy) {
                this.sendPolicy = sendPolicy;
                return this;
            }

            /**
             * <p>The SMS signature.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleTech</p>
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * <p>The name of the SMS template. You can obtain the name from the SMS template management page. The name is assigned by the system, not specified by the developer.</p>
             * 
             * <strong>example:</strong>
             * <p>SMS_123456789</p>
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
             * <p>The expiration time of the message. The message is not sent after it expires. The maximum retention period is 72 hours.</p>
             * <blockquote>
             * <ul>
             * <li>The time must follow the ISO 8601 standard and use UTC time in the YYYY-MM-DDThh:mm:ssZ format.</li>
             * <li>The expiration time must meet the following condition: ExpireTime &gt; PushTime + 3 seconds. The 3 seconds are reserved for network and system latency.</li>
             * <li>Set the expiration time to at least 1 minute for single-target push tasks and at least 10 minutes for full or batch push tasks.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Notice: For pass-through messages, if the expiration time is not set, the message is sent only to online devices. If the device is offline, the message is discarded.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-06-21T12:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The custom identifier of the push task. If JobKey is not empty, this field is included in the receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>jobkey1727749697913</p>
             */
            public Builder jobKey(String jobKey) {
                this.jobKey = jobKey;
                return this;
            }

            /**
             * <p>The unique identity of the message. This parameter is valid only when the Action parameter is set to CONTINUOUS_PUSH.</p>
             * 
             * <strong>example:</strong>
             * <p>1174754033128****</p>
             */
            public Builder messageId(Long messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>Specifies the sending time of the message, which can be up to seven days later. Valid only when the Action parameter is set to SCHEDULED_PUSH.</p>
             * <blockquote>
             * <p>The time must follow the ISO 8601 standard and use UTC time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-06-19T12:00:00Z</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>The fallback SMS message configuration.</p>
             * <blockquote>
             * <p>Currently, only Android and HarmonyOS devices are supported.</p>
             * </blockquote>
             */
            public Builder sms(Sms sms) {
                this.sms = sms;
                return this;
            }

            /**
             * <p>Specifies whether to automatically truncate excessively long titles and content.</p>
             * <blockquote>
             * <p>This parameter applies only to vendor channels that explicitly limit the title and content length. It does not apply to channels such as APNs, Huawei, and Honor, which do not limit the title and content length but only limit the total request body size.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder trim(Boolean trim) {
                this.trim = trim;
                return this;
            }

            /**
             * <p>Specifies the sending channels. Valid values:</p>
             * <ul>
             * <li>accs: Alibaba Cloud proprietary channel.</li>
             * <li>huawei: Huawei channel.</li>
             * <li>honor: Honor channel.</li>
             * <li>xiaomi: Xiaomi channel.</li>
             * <li>oppo: OPPO channel.</li>
             * <li>vivo: vivo channel.</li>
             * <li>meizu: Meizu channel.</li>
             * <li>fcm: Google Firebase channel (HTTP v1 API).</li>
             * <li>apns: APNs channel.</li>
             * <li>harmony: HarmonyOS channel.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is not configured, all channels are available.</li>
             * <li>If this parameter is configured, only the specified channels are used.</li>
             * <li>If the configured channels conflict with the sending policy (for example, iOS notifications only use the APNs channel, but apns is not included in this parameter), the message is not sent.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>accs,apns</p>
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
             * <p>The platform type. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>IOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The type of the push target.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <p>The MassPushV2 batch push API and the CONTINUOUS_PUSH continuous push support only the following three target types:</p>
             * <ul>
             * <li>DEVICE (device)</li>
             * <li>ACCOUNT (account)</li>
             * <li>ALIAS (alias)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEVICE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The push targets based on Target.Type. Separate multiple targets with commas. The following section describes the target types and target values in detail:</p>
             * <blockquote>
             * <ul>
             * <li>DEVICE: device IDs, such as deviceid1,deviceid2. Maximum of 1,000.</li>
             * <li>ACCOUNT: account IDs, such as account1,account2. Maximum of 1,000.</li>
             * <li>ALIAS: aliases, such as alias1,alias2. Maximum of 1,000.</li>
             * <li>TAG: one or more tags. For the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format specifications</a>.</li>
             * <li>ALL: all targets. No value is required. Pushing to all targets may increase costs. Use this option with caution.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
