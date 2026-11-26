// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link StartRecordTaskRequest} extends {@link RequestModel}
 *
 * <p>StartRecordTaskRequest</p>
 */
public class StartRecordTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CropMode")
    private Long cropMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutIds")
    private java.util.List<Long> layoutIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaEncode")
    private Integer mediaEncode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixMode")
    private Integer mixMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private Integer streamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecAudioUsers")
    private java.util.List<String> subSpecAudioUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecCameraUsers")
    private java.util.List<String> subSpecCameraUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecShareScreenUsers")
    private java.util.List<String> subSpecShareScreenUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecUsers")
    private java.util.List<String> subSpecUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskProfile")
    private String taskProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecAudioUsers")
    private java.util.List<String> unsubSpecAudioUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecCameraUsers")
    private java.util.List<String> unsubSpecCameraUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecShareScreenUsers")
    private java.util.List<String> unsubSpecShareScreenUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPanes")
    private java.util.List<UserPanes> userPanes;

    private StartRecordTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.cropMode = builder.cropMode;
        this.layoutIds = builder.layoutIds;
        this.mediaEncode = builder.mediaEncode;
        this.mixMode = builder.mixMode;
        this.ownerId = builder.ownerId;
        this.sourceType = builder.sourceType;
        this.streamType = builder.streamType;
        this.subSpecAudioUsers = builder.subSpecAudioUsers;
        this.subSpecCameraUsers = builder.subSpecCameraUsers;
        this.subSpecShareScreenUsers = builder.subSpecShareScreenUsers;
        this.subSpecUsers = builder.subSpecUsers;
        this.taskId = builder.taskId;
        this.taskProfile = builder.taskProfile;
        this.templateId = builder.templateId;
        this.unsubSpecAudioUsers = builder.unsubSpecAudioUsers;
        this.unsubSpecCameraUsers = builder.unsubSpecCameraUsers;
        this.unsubSpecShareScreenUsers = builder.unsubSpecShareScreenUsers;
        this.userPanes = builder.userPanes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRecordTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return cropMode
     */
    public Long getCropMode() {
        return this.cropMode;
    }

    /**
     * @return layoutIds
     */
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    /**
     * @return mediaEncode
     */
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    /**
     * @return mixMode
     */
    public Integer getMixMode() {
        return this.mixMode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    /**
     * @return subSpecAudioUsers
     */
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    /**
     * @return subSpecCameraUsers
     */
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    /**
     * @return subSpecShareScreenUsers
     */
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    /**
     * @return subSpecUsers
     */
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskProfile
     */
    public String getTaskProfile() {
        return this.taskProfile;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return unsubSpecAudioUsers
     */
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    /**
     * @return unsubSpecCameraUsers
     */
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    /**
     * @return unsubSpecShareScreenUsers
     */
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    /**
     * @return userPanes
     */
    public java.util.List<UserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static final class Builder extends Request.Builder<StartRecordTaskRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long cropMode; 
        private java.util.List<Long> layoutIds; 
        private Integer mediaEncode; 
        private Integer mixMode; 
        private Long ownerId; 
        private String sourceType; 
        private Integer streamType; 
        private java.util.List<String> subSpecAudioUsers; 
        private java.util.List<String> subSpecCameraUsers; 
        private java.util.List<String> subSpecShareScreenUsers; 
        private java.util.List<String> subSpecUsers; 
        private String taskId; 
        private String taskProfile; 
        private String templateId; 
        private java.util.List<String> unsubSpecAudioUsers; 
        private java.util.List<String> unsubSpecCameraUsers; 
        private java.util.List<String> unsubSpecShareScreenUsers; 
        private java.util.List<UserPanes> userPanes; 

        private Builder() {
            super();
        } 

        private Builder(StartRecordTaskRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.cropMode = request.cropMode;
            this.layoutIds = request.layoutIds;
            this.mediaEncode = request.mediaEncode;
            this.mixMode = request.mixMode;
            this.ownerId = request.ownerId;
            this.sourceType = request.sourceType;
            this.streamType = request.streamType;
            this.subSpecAudioUsers = request.subSpecAudioUsers;
            this.subSpecCameraUsers = request.subSpecCameraUsers;
            this.subSpecShareScreenUsers = request.subSpecShareScreenUsers;
            this.subSpecUsers = request.subSpecUsers;
            this.taskId = request.taskId;
            this.taskProfile = request.taskProfile;
            this.templateId = request.templateId;
            this.unsubSpecAudioUsers = request.unsubSpecAudioUsers;
            this.unsubSpecCameraUsers = request.unsubSpecCameraUsers;
            this.unsubSpecShareScreenUsers = request.unsubSpecShareScreenUsers;
            this.userPanes = request.userPanes;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The channel ID. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The cropping mode of the video. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: crops the video while maintaining the aspect ratio.</li>
         * <li><strong>2</strong> (default): adds padding to the video while maintaining the aspect ratio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cropMode(Long cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * <p>The list of layout IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder layoutIds(java.util.List<Long> layoutIds) {
            this.putQueryParameter("LayoutIds", layoutIds);
            this.layoutIds = layoutIds;
            return this;
        }

        /**
         * <p>The encoding option. For more information, see the MediaEncode enum values below.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder mediaEncode(Integer mediaEncode) {
            this.putQueryParameter("MediaEncode", mediaEncode);
            this.mediaEncode = mediaEncode;
            return this;
        }

        /**
         * <p>The recording mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: single-stream recording. Task parameters cannot be modified during the recording process. You cannot call the UpdateRecordTask operation to modify task parameters.</li>
         * <li><strong>1</strong> (default): mixed-stream recording. Multiple video streams are mixed and output.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Valid parameters in single-stream recording mode: StreamType and SourceType.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Valid parameters in mixed-stream recording mode: TaskProfile, MediaEncode, LayoutIds, BackgroundColor, SubSpecUsers, CropMode, UserPanes, Backgrounds, Watermarks, and ClockWidgets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mixMode(Integer mixMode) {
            this.putQueryParameter("MixMode", mixMode);
            this.mixMode = mixMode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The video source in single-stream recording mode. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong>: the camera.</li>
         * <li><strong>shareScreen</strong>: screen sharing.</li>
         * </ul>
         * <blockquote>
         * <p>If the video source is shareScreen and only the camera stream is ingested, the camera stream is recorded. If both the camera stream and the screen sharing stream are ingested, the screen sharing stream is recorded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The single-stream recording mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): records the original stream.</li>
         * <li><strong>1</strong>: records only the audio stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * <p>Specifies the users whose audio streams are subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
            this.putQueryParameter("SubSpecAudioUsers", subSpecAudioUsers);
            this.subSpecAudioUsers = subSpecAudioUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose camera streams are subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
            this.putQueryParameter("SubSpecCameraUsers", subSpecCameraUsers);
            this.subSpecCameraUsers = subSpecCameraUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose screen sharing streams are subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
            this.putQueryParameter("SubSpecShareScreenUsers", subSpecShareScreenUsers);
            this.subSpecShareScreenUsers = subSpecShareScreenUsers;
            return this;
        }

        /**
         * <p>Specifies the list of users to which the task subscribes.</p>
         * 
         * <strong>example:</strong>
         * <p>userID</p>
         */
        public Builder subSpecUsers(java.util.List<String> subSpecUsers) {
            this.putQueryParameter("SubSpecUsers", subSpecUsers);
            this.subSpecUsers = subSpecUsers;
            return this;
        }

        /**
         * <p>The task ID. Only a single ID is supported and the ID must be unique. The ID must be 1 to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The billing configuration of the task. You are charged based on your settings. For more information, see the TaskProfile enum values below.</p>
         * <blockquote>
         * <ul>
         * <li>The resolution of the MediaEncode encoding option must be less than or equal to the resolution of TaskProfile.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The maximum number of panes in the layout must be less than or equal to the number of input streams specified by TaskProfile.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4IN_1080P</p>
         */
        public Builder taskProfile(String taskProfile) {
            this.putQueryParameter("TaskProfile", taskProfile);
            this.taskProfile = taskProfile;
            return this;
        }

        /**
         * <p>The configuration template ID. For more information about how to obtain the template ID, see <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>76dasgb****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>Specifies the users whose audio streams are not subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
            this.putQueryParameter("UnsubSpecAudioUsers", unsubSpecAudioUsers);
            this.unsubSpecAudioUsers = unsubSpecAudioUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose camera streams are not subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
            this.putQueryParameter("UnsubSpecCameraUsers", unsubSpecCameraUsers);
            this.unsubSpecCameraUsers = unsubSpecCameraUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose screen sharing streams are not subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
            this.putQueryParameter("UnsubSpecShareScreenUsers", unsubSpecShareScreenUsers);
            this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
            return this;
        }

        /**
         * <p>The list of layout parameters.</p>
         */
        public Builder userPanes(java.util.List<UserPanes> userPanes) {
            this.putQueryParameter("UserPanes", userPanes);
            this.userPanes = userPanes;
            return this;
        }

        @Override
        public StartRecordTaskRequest build() {
            return new StartRecordTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartRecordTaskRequest} extends {@link TeaModel}
     *
     * <p>StartRecordTaskRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Images(Builder builder) {
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The display mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (None): The image is not displayed.</li>
             * <li><strong>1</strong> (Always): The image is always displayed.</li>
             * <li><strong>2</strong> (Backup): The image is displayed when the current user has no video stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the pane, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the pane, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X coordinate, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y coordinate, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRecordTaskRequest} extends {@link TeaModel}
     *
     * <p>StartRecordTaskRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FontColor")
        private Integer fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("FontType")
        private Integer fontType;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Texts(Builder builder) {
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.text = builder.text;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Texts create() {
            return builder().build();
        }

        /**
         * @return fontColor
         */
        public Integer getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return fontType
         */
        public Integer getFontType() {
            return this.fontType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private String text; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Texts model) {
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.fontType = model.fontType;
                this.text = model.text;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The text color in RGB format. The calculation formula is R + G × 256 + B × 65536. Valid values of R (red), G (green), and B (blue): <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size. Valid values: <strong>(0, 72]</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The font type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): NOTO_SERIF_CJKSC_REGULAR.</li>
             * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
             * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
             * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
             * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
             * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The X coordinate, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y coordinate, represented as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Texts build() {
                return new Texts(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRecordTaskRequest} extends {@link TeaModel}
     *
     * <p>StartRecordTaskRequest</p>
     */
    public static class UserPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<Texts> texts;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserPanes(Builder builder) {
            this.images = builder.images;
            this.paneId = builder.paneId;
            this.sourceType = builder.sourceType;
            this.texts = builder.texts;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPanes create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return texts
         */
        public java.util.List<Texts> getTexts() {
            return this.texts;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Images> images; 
            private Integer paneId; 
            private String sourceType; 
            private java.util.List<Texts> texts; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserPanes model) {
                this.images = model.images;
                this.paneId = model.paneId;
                this.sourceType = model.sourceType;
                this.texts = model.texts;
                this.userId = model.userId;
            } 

            /**
             * <p>The list of image panes in the current layout.</p>
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The pane ID. Valid values: <strong>0</strong> to <strong>15</strong>.</p>
             * <blockquote>
             * <ul>
             * <li>If the user specified by PaneId is not found, other streams are displayed by default. The streams are determined based on the order in which users join the channel.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>If a parameter related to UserPanes is required, all other related parameters are also required. Otherwise, none of them are required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>The user video input that corresponds to the layout. Valid values:</p>
             * <ul>
             * <li><strong>camera</strong> (default): the video stream.</li>
             * <li><strong>shareScreen</strong>: the screen sharing stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The list of text panes in the current layout.</p>
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>The ID of the user that corresponds to the layout pane. Valid values of N: <strong>1 to 16</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserPanes build() {
                return new UserPanes(this);
            } 

        } 

    }
}
