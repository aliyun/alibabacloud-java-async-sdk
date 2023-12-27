// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMPUTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateMPUTaskRequest</p>
 */
public class UpdateMPUTaskRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("BackgroundColor")
    private Integer backgroundColor;

    @Query
    @NameInMap("Backgrounds")
    private java.util.List < Backgrounds> backgrounds;

    @Query
    @NameInMap("ClockWidgets")
    private java.util.List < ClockWidgets> clockWidgets;

    @Query
    @NameInMap("CropMode")
    private Integer cropMode;

    @Query
    @NameInMap("LayoutIds")
    private java.util.List < Long > layoutIds;

    @Query
    @NameInMap("MediaEncode")
    private Integer mediaEncode;

    @Query
    @NameInMap("MixMode")
    private Integer mixMode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    @Query
    @NameInMap("SubSpecAudioUsers")
    private java.util.List < String > subSpecAudioUsers;

    @Query
    @NameInMap("SubSpecCameraUsers")
    private java.util.List < String > subSpecCameraUsers;

    @Query
    @NameInMap("SubSpecShareScreenUsers")
    private java.util.List < String > subSpecShareScreenUsers;

    @Query
    @NameInMap("SubSpecUsers")
    private java.util.List < String > subSpecUsers;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("UnsubSpecAudioUsers")
    private java.util.List < String > unsubSpecAudioUsers;

    @Query
    @NameInMap("UnsubSpecCameraUsers")
    private java.util.List < String > unsubSpecCameraUsers;

    @Query
    @NameInMap("UnsubSpecShareScreenUsers")
    private java.util.List < String > unsubSpecShareScreenUsers;

    @Query
    @NameInMap("UserPanes")
    private java.util.List < UserPanes> userPanes;

    @Query
    @NameInMap("Watermarks")
    private java.util.List < Watermarks> watermarks;

    private UpdateMPUTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgroundColor = builder.backgroundColor;
        this.backgrounds = builder.backgrounds;
        this.clockWidgets = builder.clockWidgets;
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
        this.unsubSpecAudioUsers = builder.unsubSpecAudioUsers;
        this.unsubSpecCameraUsers = builder.unsubSpecCameraUsers;
        this.unsubSpecShareScreenUsers = builder.unsubSpecShareScreenUsers;
        this.userPanes = builder.userPanes;
        this.watermarks = builder.watermarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMPUTaskRequest create() {
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
     * @return backgroundColor
     */
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * @return backgrounds
     */
    public java.util.List < Backgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    /**
     * @return clockWidgets
     */
    public java.util.List < ClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    /**
     * @return cropMode
     */
    public Integer getCropMode() {
        return this.cropMode;
    }

    /**
     * @return layoutIds
     */
    public java.util.List < Long > getLayoutIds() {
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
    public java.util.List < String > getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    /**
     * @return subSpecCameraUsers
     */
    public java.util.List < String > getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    /**
     * @return subSpecShareScreenUsers
     */
    public java.util.List < String > getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    /**
     * @return subSpecUsers
     */
    public java.util.List < String > getSubSpecUsers() {
        return this.subSpecUsers;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return unsubSpecAudioUsers
     */
    public java.util.List < String > getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    /**
     * @return unsubSpecCameraUsers
     */
    public java.util.List < String > getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    /**
     * @return unsubSpecShareScreenUsers
     */
    public java.util.List < String > getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    /**
     * @return userPanes
     */
    public java.util.List < UserPanes> getUserPanes() {
        return this.userPanes;
    }

    /**
     * @return watermarks
     */
    public java.util.List < Watermarks> getWatermarks() {
        return this.watermarks;
    }

    public static final class Builder extends Request.Builder<UpdateMPUTaskRequest, Builder> {
        private String appId; 
        private Integer backgroundColor; 
        private java.util.List < Backgrounds> backgrounds; 
        private java.util.List < ClockWidgets> clockWidgets; 
        private Integer cropMode; 
        private java.util.List < Long > layoutIds; 
        private Integer mediaEncode; 
        private Integer mixMode; 
        private Long ownerId; 
        private String sourceType; 
        private Integer streamType; 
        private java.util.List < String > subSpecAudioUsers; 
        private java.util.List < String > subSpecCameraUsers; 
        private java.util.List < String > subSpecShareScreenUsers; 
        private java.util.List < String > subSpecUsers; 
        private String taskId; 
        private java.util.List < String > unsubSpecAudioUsers; 
        private java.util.List < String > unsubSpecCameraUsers; 
        private java.util.List < String > unsubSpecShareScreenUsers; 
        private java.util.List < UserPanes> userPanes; 
        private java.util.List < Watermarks> watermarks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMPUTaskRequest request) {
            super(request);
            this.appId = request.appId;
            this.backgroundColor = request.backgroundColor;
            this.backgrounds = request.backgrounds;
            this.clockWidgets = request.clockWidgets;
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
            this.unsubSpecAudioUsers = request.unsubSpecAudioUsers;
            this.unsubSpecCameraUsers = request.unsubSpecCameraUsers;
            this.unsubSpecShareScreenUsers = request.unsubSpecShareScreenUsers;
            this.userPanes = request.userPanes;
            this.watermarks = request.watermarks;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BackgroundColor.
         */
        public Builder backgroundColor(Integer backgroundColor) {
            this.putQueryParameter("BackgroundColor", backgroundColor);
            this.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * Backgrounds.
         */
        public Builder backgrounds(java.util.List < Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * ClockWidgets.
         */
        public Builder clockWidgets(java.util.List < ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * CropMode.
         */
        public Builder cropMode(Integer cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * LayoutIds.
         */
        public Builder layoutIds(java.util.List < Long > layoutIds) {
            this.putQueryParameter("LayoutIds", layoutIds);
            this.layoutIds = layoutIds;
            return this;
        }

        /**
         * MediaEncode.
         */
        public Builder mediaEncode(Integer mediaEncode) {
            this.putQueryParameter("MediaEncode", mediaEncode);
            this.mediaEncode = mediaEncode;
            return this;
        }

        /**
         * MixMode.
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
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * SubSpecAudioUsers.
         */
        public Builder subSpecAudioUsers(java.util.List < String > subSpecAudioUsers) {
            this.putQueryParameter("SubSpecAudioUsers", subSpecAudioUsers);
            this.subSpecAudioUsers = subSpecAudioUsers;
            return this;
        }

        /**
         * SubSpecCameraUsers.
         */
        public Builder subSpecCameraUsers(java.util.List < String > subSpecCameraUsers) {
            this.putQueryParameter("SubSpecCameraUsers", subSpecCameraUsers);
            this.subSpecCameraUsers = subSpecCameraUsers;
            return this;
        }

        /**
         * SubSpecShareScreenUsers.
         */
        public Builder subSpecShareScreenUsers(java.util.List < String > subSpecShareScreenUsers) {
            this.putQueryParameter("SubSpecShareScreenUsers", subSpecShareScreenUsers);
            this.subSpecShareScreenUsers = subSpecShareScreenUsers;
            return this;
        }

        /**
         * SubSpecUsers.
         */
        public Builder subSpecUsers(java.util.List < String > subSpecUsers) {
            this.putQueryParameter("SubSpecUsers", subSpecUsers);
            this.subSpecUsers = subSpecUsers;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UnsubSpecAudioUsers.
         */
        public Builder unsubSpecAudioUsers(java.util.List < String > unsubSpecAudioUsers) {
            this.putQueryParameter("UnsubSpecAudioUsers", unsubSpecAudioUsers);
            this.unsubSpecAudioUsers = unsubSpecAudioUsers;
            return this;
        }

        /**
         * UnsubSpecCameraUsers.
         */
        public Builder unsubSpecCameraUsers(java.util.List < String > unsubSpecCameraUsers) {
            this.putQueryParameter("UnsubSpecCameraUsers", unsubSpecCameraUsers);
            this.unsubSpecCameraUsers = unsubSpecCameraUsers;
            return this;
        }

        /**
         * UnsubSpecShareScreenUsers.
         */
        public Builder unsubSpecShareScreenUsers(java.util.List < String > unsubSpecShareScreenUsers) {
            this.putQueryParameter("UnsubSpecShareScreenUsers", unsubSpecShareScreenUsers);
            this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
            return this;
        }

        /**
         * UserPanes.
         */
        public Builder userPanes(java.util.List < UserPanes> userPanes) {
            this.putQueryParameter("UserPanes", userPanes);
            this.userPanes = userPanes;
            return this;
        }

        /**
         * Watermarks.
         */
        public Builder watermarks(java.util.List < Watermarks> watermarks) {
            this.putQueryParameter("Watermarks", watermarks);
            this.watermarks = watermarks;
            return this;
        }

        @Override
        public UpdateMPUTaskRequest build() {
            return new UpdateMPUTaskRequest(this);
        } 

    } 

    public static class Backgrounds extends TeaModel {
        @NameInMap("Display")
        private Integer display;

        @NameInMap("Height")
        private Float height;

        @NameInMap("Url")
        private String url;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer zOrder;

        private Backgrounds(Builder builder) {
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

        public static Backgrounds create() {
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

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Backgrounds build() {
                return new Backgrounds(this);
            } 

        } 

    }
    public static class ClockWidgets extends TeaModel {
        @NameInMap("Alpha")
        private Float alpha;

        @NameInMap("BorderColor")
        private Long borderColor;

        @NameInMap("BorderWidth")
        private Integer borderWidth;

        @NameInMap("Box")
        private Boolean box;

        @NameInMap("BoxBorderWidth")
        private Integer boxBorderWidth;

        @NameInMap("BoxColor")
        private Long boxColor;

        @NameInMap("FontColor")
        private Integer fontColor;

        @NameInMap("FontSize")
        private Integer fontSize;

        @NameInMap("FontType")
        private Integer fontType;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer zOrder;

        private ClockWidgets(Builder builder) {
            this.alpha = builder.alpha;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.box = builder.box;
            this.boxBorderWidth = builder.boxBorderWidth;
            this.boxColor = builder.boxColor;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockWidgets create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return borderColor
         */
        public Long getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return box
         */
        public Boolean getBox() {
            return this.box;
        }

        /**
         * @return boxBorderWidth
         */
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        /**
         * @return boxColor
         */
        public Long getBoxColor() {
            return this.boxColor;
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
            private Float alpha; 
            private Long borderColor; 
            private Integer borderWidth; 
            private Boolean box; 
            private Integer boxBorderWidth; 
            private Long boxColor; 
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            /**
             * Alpha.
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BorderColor.
             */
            public Builder borderColor(Long borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidth.
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * Box.
             */
            public Builder box(Boolean box) {
                this.box = box;
                return this;
            }

            /**
             * BoxBorderWidth.
             */
            public Builder boxBorderWidth(Integer boxBorderWidth) {
                this.boxBorderWidth = boxBorderWidth;
                return this;
            }

            /**
             * BoxColor.
             */
            public Builder boxColor(Long boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * FontType.
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public ClockWidgets build() {
                return new ClockWidgets(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Display")
        private Integer display;

        @NameInMap("Height")
        private Float height;

        @NameInMap("Url")
        private String url;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
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

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
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
    public static class Texts extends TeaModel {
        @NameInMap("Alpha")
        private Float alpha;

        @NameInMap("BorderColor")
        private Long borderColor;

        @NameInMap("BorderWidth")
        private Integer borderWidth;

        @NameInMap("Box")
        private Boolean box;

        @NameInMap("BoxBorderWidth")
        private Integer boxBorderWidth;

        @NameInMap("BoxColor")
        private Long boxColor;

        @NameInMap("FontColor")
        private Integer fontColor;

        @NameInMap("FontSize")
        private Integer fontSize;

        @NameInMap("FontType")
        private Integer fontType;

        @NameInMap("Text")
        private String text;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer zOrder;

        private Texts(Builder builder) {
            this.alpha = builder.alpha;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.box = builder.box;
            this.boxBorderWidth = builder.boxBorderWidth;
            this.boxColor = builder.boxColor;
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
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return borderColor
         */
        public Long getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return box
         */
        public Boolean getBox() {
            return this.box;
        }

        /**
         * @return boxBorderWidth
         */
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        /**
         * @return boxColor
         */
        public Long getBoxColor() {
            return this.boxColor;
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
            private Float alpha; 
            private Long borderColor; 
            private Integer borderWidth; 
            private Boolean box; 
            private Integer boxBorderWidth; 
            private Long boxColor; 
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private String text; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            /**
             * Alpha.
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BorderColor.
             */
            public Builder borderColor(Long borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidth.
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * Box.
             */
            public Builder box(Boolean box) {
                this.box = box;
                return this;
            }

            /**
             * BoxBorderWidth.
             */
            public Builder boxBorderWidth(Integer boxBorderWidth) {
                this.boxBorderWidth = boxBorderWidth;
                return this;
            }

            /**
             * BoxColor.
             */
            public Builder boxColor(Long boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * FontType.
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
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
    public static class UserPanes extends TeaModel {
        @NameInMap("Images")
        private java.util.List < Images> images;

        @NameInMap("PaneId")
        private Integer paneId;

        @NameInMap("SegmentType")
        private Integer segmentType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Texts")
        private java.util.List < Texts> texts;

        @NameInMap("UserId")
        private String userId;

        private UserPanes(Builder builder) {
            this.images = builder.images;
            this.paneId = builder.paneId;
            this.segmentType = builder.segmentType;
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
        public java.util.List < Images> getImages() {
            return this.images;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return segmentType
         */
        public Integer getSegmentType() {
            return this.segmentType;
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
        public java.util.List < Texts> getTexts() {
            return this.texts;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < Images> images; 
            private Integer paneId; 
            private Integer segmentType; 
            private String sourceType; 
            private java.util.List < Texts> texts; 
            private String userId; 

            /**
             * Images.
             */
            public Builder images(java.util.List < Images> images) {
                this.images = images;
                return this;
            }

            /**
             * PaneId.
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * SegmentType.
             */
            public Builder segmentType(Integer segmentType) {
                this.segmentType = segmentType;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Texts.
             */
            public Builder texts(java.util.List < Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * UserId.
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
    public static class Watermarks extends TeaModel {
        @NameInMap("Alpha")
        private Float alpha;

        @NameInMap("Display")
        private Integer display;

        @NameInMap("Height")
        private Float height;

        @NameInMap("Url")
        private String url;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer zOrder;

        private Watermarks(Builder builder) {
            this.alpha = builder.alpha;
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

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
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
            private Float alpha; 
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            /**
             * Alpha.
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
}
