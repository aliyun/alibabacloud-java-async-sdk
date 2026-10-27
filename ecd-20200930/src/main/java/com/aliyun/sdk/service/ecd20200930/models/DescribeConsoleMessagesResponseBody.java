// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsoleMessagesResponseBody</p>
 */
public class DescribeConsoleMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageList")
    private java.util.List<MessageList> messageList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeConsoleMessagesResponseBody(Builder builder) {
        this.messageList = builder.messageList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsoleMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageList
     */
    public java.util.List<MessageList> getMessageList() {
        return this.messageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<MessageList> messageList; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeConsoleMessagesResponseBody model) {
            this.messageList = model.messageList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of console messages queried for the current page. If no messages match, an empty list is returned.</p>
         */
        public Builder messageList(java.util.List<MessageList> messageList) {
            this.messageList = messageList;
            return this;
        }

        /**
         * <p>The ID of the current request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9F1D7E42-06A8-4B50-9A21-6E0C8D3F5B72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of messages that match the query conditions, not the number of messages returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeConsoleMessagesResponseBody build() {
            return new DescribeConsoleMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class ContentConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("ContentText")
        private String contentText;

        @com.aliyun.core.annotation.NameInMap("LangType")
        private String langType;

        private ContentConfigs(Builder builder) {
            this.color = builder.color;
            this.contentText = builder.contentText;
            this.langType = builder.langType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentConfigs create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return contentText
         */
        public String getContentText() {
            return this.contentText;
        }

        /**
         * @return langType
         */
        public String getLangType() {
            return this.langType;
        }

        public static final class Builder {
            private String color; 
            private String contentText; 
            private String langType; 

            private Builder() {
            } 

            private Builder(ContentConfigs model) {
                this.color = model.color;
                this.contentText = model.contentText;
                this.langType = model.langType;
            } 

            /**
             * <p>The color of the body text. The color value saved when the message is created or modified is used.</p>
             * 
             * <strong>example:</strong>
             * <p>#666666</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The message body text in the specified language.</p>
             * 
             * <strong>example:</strong>
             * <p>The cloud computer will undergo routine maintenance. Please save your work in advance</p>
             */
            public Builder contentText(String contentText) {
                this.contentText = contentText;
                return this;
            }

            /**
             * <p>The body language. Valid values: CN (Chinese), EN (English), and JP (Japanese). The query returns the language value saved when the message is created or modified, retaining the original case.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder langType(String langType) {
                this.langType = langType;
                return this;
            }

            public ContentConfigs build() {
                return new ContentConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class HyperLinkConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private HyperLinkConfigs(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperLinkConfigs create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(HyperLinkConfigs model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * <p>The text displayed on the hyperlink button.</p>
             * 
             * <strong>example:</strong>
             * <p>View Details</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL accessed after the hyperlink button is clicked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/announcements/maintenance">https://example.com/announcements/maintenance</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public HyperLinkConfigs build() {
                return new HyperLinkConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class ImageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ImageFilePath")
        private String imageFilePath;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        private ImageInfoList(Builder builder) {
            this.fileName = builder.fileName;
            this.imageFilePath = builder.imageFilePath;
            this.imageType = builder.imageType;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfoList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return imageFilePath
         */
        public String getImageFilePath() {
            return this.imageFilePath;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String fileName; 
            private String imageFilePath; 
            private String imageType; 
            private String imageUrl; 

            private Builder() {
            } 

            private Builder(ImageInfoList model) {
                this.fileName = model.fileName;
                this.imageFilePath = model.imageFilePath;
                this.imageType = model.imageType;
                this.imageUrl = model.imageUrl;
            } 

            /**
             * <p>The name of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>img0.jpg</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The storage path of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>image_file/CUSTOM_WALLPAPER/00000000-0000-img0.jpg</p>
             */
            public Builder imageFilePath(String imageFilePath) {
                this.imageFilePath = imageFilePath;
                return this;
            }

            /**
             * <p>The image type. Configuration types defined by the backend include Operational (operational message image), WallpaperBasic (basic wallpaper image), and WallpaperAppend (appended wallpaper image). The query returns the image type value saved when the message is created or modified, retaining the original case.</p>
             * 
             * <strong>example:</strong>
             * <p>WallpaperBasic</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The temporary download URL of the image file. The link has a limited validity period. If the link expires, you can query again to obtain a new one.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/images/img0.jpg">https://example.com/images/img0.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public ImageInfoList build() {
                return new ImageInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Timer")
        private java.util.List<String> timer;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private MetaData(Builder builder) {
            this.adDomain = builder.adDomain;
            this.officeSiteId = builder.officeSiteId;
            this.timer = builder.timer;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return timer
         */
        public java.util.List<String> getTimer() {
            return this.timer;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String adDomain; 
            private String officeSiteId; 
            private java.util.List<String> timer; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(MetaData model) {
                this.adDomain = model.adDomain;
                this.officeSiteId = model.officeSiteId;
                this.timer = model.timer;
                this.timerType = model.timerType;
            } 

            /**
             * <p>The AD domain name associated with the message configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ad.example.com</p>
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * <p>The workspace ID associated with the message configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai+dir-example01</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The list of scheduled sending configurations. If TimerType is CRON, the elements are cron expressions. If TimerType is Timestamp, the elements are millisecond timestamps represented as strings.</p>
             */
            public Builder timer(java.util.List<String> timer) {
                this.timer = timer;
                return this;
            }

            /**
             * <p>The scheduled sending type. Valid values: CRON (cron expression) and Timestamp (timestamp). The configuration values are case-sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>CRON</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class TitleConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("LangType")
        private String langType;

        @com.aliyun.core.annotation.NameInMap("TitleText")
        private String titleText;

        private TitleConfigs(Builder builder) {
            this.color = builder.color;
            this.langType = builder.langType;
            this.titleText = builder.titleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TitleConfigs create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return langType
         */
        public String getLangType() {
            return this.langType;
        }

        /**
         * @return titleText
         */
        public String getTitleText() {
            return this.titleText;
        }

        public static final class Builder {
            private String color; 
            private String langType; 
            private String titleText; 

            private Builder() {
            } 

            private Builder(TitleConfigs model) {
                this.color = model.color;
                this.langType = model.langType;
                this.titleText = model.titleText;
            } 

            /**
             * <p>The color of the title text. The color value saved when the message is created or modified is used.</p>
             * 
             * <strong>example:</strong>
             * <p>#333333</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The title language. Valid values: CN (Chinese), EN (English), and JP (Japanese). The query returns the language value saved when the message is created or modified, retaining the original case.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder langType(String langType) {
                this.langType = langType;
                return this;
            }

            /**
             * <p>The message title text in the specified language.</p>
             * 
             * <strong>example:</strong>
             * <p>System Maintenance Notice</p>
             */
            public Builder titleText(String titleText) {
                this.titleText = titleText;
                return this;
            }

            public TitleConfigs build() {
                return new TitleConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConsoleMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsoleMessagesResponseBody</p>
     */
    public static class MessageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List<String> clientTypes;

        @com.aliyun.core.annotation.NameInMap("ContentConfigs")
        private java.util.List<ContentConfigs> contentConfigs;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HyperLinkConfigs")
        private java.util.List<HyperLinkConfigs> hyperLinkConfigs;

        @com.aliyun.core.annotation.NameInMap("ImageFilePath")
        private String imageFilePath;

        @com.aliyun.core.annotation.NameInMap("ImageInfoList")
        private java.util.List<ImageInfoList> imageInfoList;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MessageLevel")
        private String messageLevel;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetIds")
        private String targetIds;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TitleConfigs")
        private java.util.List<TitleConfigs> titleConfigs;

        private MessageList(Builder builder) {
            this.clientTypes = builder.clientTypes;
            this.contentConfigs = builder.contentConfigs;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hyperLinkConfigs = builder.hyperLinkConfigs;
            this.imageFilePath = builder.imageFilePath;
            this.imageInfoList = builder.imageInfoList;
            this.imageUrl = builder.imageUrl;
            this.messageId = builder.messageId;
            this.messageLevel = builder.messageLevel;
            this.messageType = builder.messageType;
            this.metaData = builder.metaData;
            this.position = builder.position;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetIds = builder.targetIds;
            this.targetType = builder.targetType;
            this.titleConfigs = builder.titleConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return clientTypes
         */
        public java.util.List<String> getClientTypes() {
            return this.clientTypes;
        }

        /**
         * @return contentConfigs
         */
        public java.util.List<ContentConfigs> getContentConfigs() {
            return this.contentConfigs;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hyperLinkConfigs
         */
        public java.util.List<HyperLinkConfigs> getHyperLinkConfigs() {
            return this.hyperLinkConfigs;
        }

        /**
         * @return imageFilePath
         */
        public String getImageFilePath() {
            return this.imageFilePath;
        }

        /**
         * @return imageInfoList
         */
        public java.util.List<ImageInfoList> getImageInfoList() {
            return this.imageInfoList;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageLevel
         */
        public String getMessageLevel() {
            return this.messageLevel;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return metaData
         */
        public MetaData getMetaData() {
            return this.metaData;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetIds
         */
        public String getTargetIds() {
            return this.targetIds;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return titleConfigs
         */
        public java.util.List<TitleConfigs> getTitleConfigs() {
            return this.titleConfigs;
        }

        public static final class Builder {
            private java.util.List<String> clientTypes; 
            private java.util.List<ContentConfigs> contentConfigs; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<HyperLinkConfigs> hyperLinkConfigs; 
            private String imageFilePath; 
            private java.util.List<ImageInfoList> imageInfoList; 
            private String imageUrl; 
            private String messageId; 
            private String messageLevel; 
            private String messageType; 
            private MetaData metaData; 
            private String position; 
            private String startTime; 
            private String status; 
            private String targetIds; 
            private String targetType; 
            private java.util.List<TitleConfigs> titleConfigs; 

            private Builder() {
            } 

            private Builder(MessageList model) {
                this.clientTypes = model.clientTypes;
                this.contentConfigs = model.contentConfigs;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hyperLinkConfigs = model.hyperLinkConfigs;
                this.imageFilePath = model.imageFilePath;
                this.imageInfoList = model.imageInfoList;
                this.imageUrl = model.imageUrl;
                this.messageId = model.messageId;
                this.messageLevel = model.messageLevel;
                this.messageType = model.messageType;
                this.metaData = model.metaData;
                this.position = model.position;
                this.startTime = model.startTime;
                this.status = model.status;
                this.targetIds = model.targetIds;
                this.targetType = model.targetType;
                this.titleConfigs = model.titleConfigs;
            } 

            /**
             * <p>The list of client types to which the message applies. Standard names are returned: Windows, Mac, Web, and Hardware.</p>
             */
            public Builder clientTypes(java.util.List<String> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>The list of message body configurations for each language.</p>
             */
            public Builder contentConfigs(java.util.List<ContentConfigs> contentConfigs) {
                this.contentConfigs = contentConfigs;
                return this;
            }

            /**
             * <p>The time when the operational message stops taking effect. The time is in ISO 8601 format. A time zone offset of +00:00 indicates UTC time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-11T02:00:00.000+00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the message was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T00:00:00.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the message was last modified. This time is also updated when the message status changes.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T01:00:00.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The list of hyperlink button configurations in the message.</p>
             */
            public Builder hyperLinkConfigs(java.util.List<HyperLinkConfigs> hyperLinkConfigs) {
                this.hyperLinkConfigs = hyperLinkConfigs;
                return this;
            }

            /**
             * <p>The storage path of the image file for the operational message.</p>
             * 
             * <strong>example:</strong>
             * <p>image_file/OPERATIONAL/00000000-0000-console-message.png</p>
             */
            public Builder imageFilePath(String imageFilePath) {
                this.imageFilePath = imageFilePath;
                return this;
            }

            /**
             * <p>The list of image configurations, which is mainly used for custom wallpaper messages. Each item includes the image name, image type, storage path, and temporary download URL.</p>
             */
            public Builder imageInfoList(java.util.List<ImageInfoList> imageInfoList) {
                this.imageInfoList = imageInfoList;
                return this;
            }

            /**
             * <p>The temporary download URL of the operational message image. The link has a limited validity period. If the link expires, you can query again to obtain a new one.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/images/console-message.png">https://example.com/images/console-message.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The message ID, which can be used to send, modify, or delete a specified message.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-123456</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message level of the notification message. Valid values: STRONG (strong message) and WEAK (weak message).</p>
             * 
             * <strong>example:</strong>
             * <p>STRONG</p>
             */
            public Builder messageLevel(String messageLevel) {
                this.messageLevel = messageLevel;
                return this;
            }

            /**
             * <p>The message type. Valid values: OPERATIONAL (client operational message), WALLPAPER (desktop wallpaper text message), NOTIFICATION (message center notification), and CUSTOM_WALLPAPER (custom desktop wallpaper).</p>
             * 
             * <strong>example:</strong>
             * <p>NOTIFICATION</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The additional configuration of the message, including the associated workspace, AD domain name, and scheduled sending configuration. Whether specific fields are returned depends on the message type and its saved configuration.</p>
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The display position of the message. For wallpaper text messages, valid values are CENTER (center), TOP_RIGHT (top right), BOTTOM_RIGHT (bottom right), and BOTTOM_LEFT (bottom left). For client operational messages, valid values are CLIENT_ENTERPRISE_RESOURCE_PAGE (Enterprise Edition client cloud resource page) and CLIENT_BUSINESS_RESOURCE_PAGE (Business Edition client cloud resource page).</p>
             * 
             * <strong>example:</strong>
             * <p>CENTER</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The time when the operational message starts taking effect. The time is in ISO 8601 format. A time zone offset of +00:00 indicates UTC time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T02:00:00.000+00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The current status of the message. Valid values: Init (initializing), Pushing (pushing), Published (published), Expired (expired), Deleting (deleting), and Failed (failed). Published indicates that the message has been published or the server-side push processing has finished, but it does not indicate that all target terminals have successfully received the message.</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The JSON string of the list of targets to which the message applies. For Organization and AdOrg, it is an array of objects containing orgId (organization ID) and orgName (organization name). The organization name may be empty, and records in the old format may not contain orgName. For Tag, it is an array of objects containing tagKey (tag key), tagValue (tag value), and regionId (region ID). For other target types, it is an array of strings. The all-users target is represented by ALL_USERS.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;user01&quot;]</p>
             */
            public Builder targetIds(String targetIds) {
                this.targetIds = targetIds;
                return this;
            }

            /**
             * <p>The type of the target to which the message applies. Valid values: AllUsers (all convenience users), EndUser (specified convenience user), Organization (specified convenience user organization), Desktop (cloud computer), ResourceGroup (resource group), Region (region), Tag (tag), AdAllUsers (all AD users), AdUser (specified AD user), and AdOrg (specified AD organization).</p>
             * 
             * <strong>example:</strong>
             * <p>EndUser</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The list of message title configurations for each language.</p>
             */
            public Builder titleConfigs(java.util.List<TitleConfigs> titleConfigs) {
                this.titleConfigs = titleConfigs;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
}
