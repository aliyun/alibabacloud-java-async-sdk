// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateWmEmbedTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWmEmbedTaskRequest</p>
 */
public class CreateWmEmbedTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioControl")
    private AudioControl audioControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CsvControl")
    private CsvControl csvControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentControl")
    private DocumentControl documentControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageControl")
    private ImageControl imageControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageEmbedJpegQuality")
    private Long imageEmbedJpegQuality;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageEmbedLevel")
    private Long imageEmbedLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvisibleEnable")
    private Boolean invisibleEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoBitrate")
    private String videoBitrate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoControl")
    private VideoControl videoControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoIsLong")
    private Boolean videoIsLong;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
    @com.aliyun.core.annotation.Validation(maxLength = 400)
    private String wmInfoBytesB64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 32)
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoUint")
    private String wmInfoUint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private CreateWmEmbedTaskRequest(Builder builder) {
        super(builder);
        this.audioControl = builder.audioControl;
        this.csvControl = builder.csvControl;
        this.documentControl = builder.documentControl;
        this.fileUrl = builder.fileUrl;
        this.filename = builder.filename;
        this.imageControl = builder.imageControl;
        this.imageEmbedJpegQuality = builder.imageEmbedJpegQuality;
        this.imageEmbedLevel = builder.imageEmbedLevel;
        this.invisibleEnable = builder.invisibleEnable;
        this.videoBitrate = builder.videoBitrate;
        this.videoControl = builder.videoControl;
        this.videoIsLong = builder.videoIsLong;
        this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        this.wmInfoSize = builder.wmInfoSize;
        this.wmInfoUint = builder.wmInfoUint;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmEmbedTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioControl
     */
    public AudioControl getAudioControl() {
        return this.audioControl;
    }

    /**
     * @return csvControl
     */
    public CsvControl getCsvControl() {
        return this.csvControl;
    }

    /**
     * @return documentControl
     */
    public DocumentControl getDocumentControl() {
        return this.documentControl;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return imageControl
     */
    public ImageControl getImageControl() {
        return this.imageControl;
    }

    /**
     * @return imageEmbedJpegQuality
     */
    public Long getImageEmbedJpegQuality() {
        return this.imageEmbedJpegQuality;
    }

    /**
     * @return imageEmbedLevel
     */
    public Long getImageEmbedLevel() {
        return this.imageEmbedLevel;
    }

    /**
     * @return invisibleEnable
     */
    public Boolean getInvisibleEnable() {
        return this.invisibleEnable;
    }

    /**
     * @return videoBitrate
     */
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    /**
     * @return videoControl
     */
    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    /**
     * @return videoIsLong
     */
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    /**
     * @return wmInfoBytesB64
     */
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmInfoUint
     */
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<CreateWmEmbedTaskRequest, Builder> {
        private AudioControl audioControl; 
        private CsvControl csvControl; 
        private DocumentControl documentControl; 
        private String fileUrl; 
        private String filename; 
        private ImageControl imageControl; 
        private Long imageEmbedJpegQuality; 
        private Long imageEmbedLevel; 
        private Boolean invisibleEnable; 
        private String videoBitrate; 
        private VideoControl videoControl; 
        private Boolean videoIsLong; 
        private String wmInfoBytesB64; 
        private Long wmInfoSize; 
        private String wmInfoUint; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWmEmbedTaskRequest request) {
            super(request);
            this.audioControl = request.audioControl;
            this.csvControl = request.csvControl;
            this.documentControl = request.documentControl;
            this.fileUrl = request.fileUrl;
            this.filename = request.filename;
            this.imageControl = request.imageControl;
            this.imageEmbedJpegQuality = request.imageEmbedJpegQuality;
            this.imageEmbedLevel = request.imageEmbedLevel;
            this.invisibleEnable = request.invisibleEnable;
            this.videoBitrate = request.videoBitrate;
            this.videoControl = request.videoControl;
            this.videoIsLong = request.videoIsLong;
            this.wmInfoBytesB64 = request.wmInfoBytesB64;
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
        } 

        /**
         * AudioControl.
         */
        public Builder audioControl(AudioControl audioControl) {
            String audioControlShrink = shrink(audioControl, "AudioControl", "json");
            this.putBodyParameter("AudioControl", audioControlShrink);
            this.audioControl = audioControl;
            return this;
        }

        /**
         * CsvControl.
         */
        public Builder csvControl(CsvControl csvControl) {
            String csvControlShrink = shrink(csvControl, "CsvControl", "json");
            this.putBodyParameter("CsvControl", csvControlShrink);
            this.csvControl = csvControl;
            return this;
        }

        /**
         * DocumentControl.
         */
        public Builder documentControl(DocumentControl documentControl) {
            String documentControlShrink = shrink(documentControl, "DocumentControl", "json");
            this.putBodyParameter("DocumentControl", documentControlShrink);
            this.documentControl = documentControl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/abc****.pdf">https://example.com/abc****.pdf</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc****.pdf</p>
         */
        public Builder filename(String filename) {
            this.putBodyParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * ImageControl.
         */
        public Builder imageControl(ImageControl imageControl) {
            String imageControlShrink = shrink(imageControl, "ImageControl", "json");
            this.putBodyParameter("ImageControl", imageControlShrink);
            this.imageControl = imageControl;
            return this;
        }

        /**
         * ImageEmbedJpegQuality.
         */
        public Builder imageEmbedJpegQuality(Long imageEmbedJpegQuality) {
            this.putBodyParameter("ImageEmbedJpegQuality", imageEmbedJpegQuality);
            this.imageEmbedJpegQuality = imageEmbedJpegQuality;
            return this;
        }

        /**
         * ImageEmbedLevel.
         */
        public Builder imageEmbedLevel(Long imageEmbedLevel) {
            this.putBodyParameter("ImageEmbedLevel", imageEmbedLevel);
            this.imageEmbedLevel = imageEmbedLevel;
            return this;
        }

        /**
         * InvisibleEnable.
         */
        public Builder invisibleEnable(Boolean invisibleEnable) {
            this.putBodyParameter("InvisibleEnable", invisibleEnable);
            this.invisibleEnable = invisibleEnable;
            return this;
        }

        /**
         * VideoBitrate.
         */
        public Builder videoBitrate(String videoBitrate) {
            this.putBodyParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
            return this;
        }

        /**
         * VideoControl.
         */
        public Builder videoControl(VideoControl videoControl) {
            String videoControlShrink = shrink(videoControl, "VideoControl", "json");
            this.putBodyParameter("VideoControl", videoControlShrink);
            this.videoControl = videoControl;
            return this;
        }

        /**
         * VideoIsLong.
         */
        public Builder videoIsLong(Boolean videoIsLong) {
            this.putBodyParameter("VideoIsLong", videoIsLong);
            this.videoIsLong = videoIsLong;
            return this;
        }

        /**
         * WmInfoBytesB64.
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * WmInfoSize.
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * WmInfoUint.
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putBodyParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PureDocument</p>
         */
        public Builder wmType(String wmType) {
            this.putBodyParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        @Override
        public CreateWmEmbedTaskRequest build() {
            return new CreateWmEmbedTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class MetadataControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("XmpKvBase64")
        private String xmpKvBase64;

        private MetadataControl(Builder builder) {
            this.enable = builder.enable;
            this.xmpKvBase64 = builder.xmpKvBase64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetadataControl create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return xmpKvBase64
         */
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

        public static final class Builder {
            private Boolean enable; 
            private String xmpKvBase64; 

            private Builder() {
            } 

            private Builder(MetadataControl model) {
                this.enable = model.enable;
                this.xmpKvBase64 = model.xmpKvBase64;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * XmpKvBase64.
             */
            public Builder xmpKvBase64(String xmpKvBase64) {
                this.xmpKvBase64 = xmpKvBase64;
                return this;
            }

            public MetadataControl build() {
                return new MetadataControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class AudioControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetadataControl")
        private MetadataControl metadataControl;

        private AudioControl(Builder builder) {
            this.metadataControl = builder.metadataControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioControl create() {
            return builder().build();
        }

        /**
         * @return metadataControl
         */
        public MetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        public static final class Builder {
            private MetadataControl metadataControl; 

            private Builder() {
            } 

            private Builder(AudioControl model) {
                this.metadataControl = model.metadataControl;
            } 

            /**
             * MetadataControl.
             */
            public Builder metadataControl(MetadataControl metadataControl) {
                this.metadataControl = metadataControl;
                return this;
            }

            public AudioControl build() {
                return new AudioControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class CsvControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbedBitsNumberInEachTime")
        @com.aliyun.core.annotation.Validation(maximum = 4, minimum = 1)
        private Long embedBitsNumberInEachTime;

        @com.aliyun.core.annotation.NameInMap("EmbedColumn")
        private Long embedColumn;

        @com.aliyun.core.annotation.NameInMap("EmbedDensity")
        private String embedDensity;

        @com.aliyun.core.annotation.NameInMap("EmbedPrecision")
        private Long embedPrecision;

        @com.aliyun.core.annotation.NameInMap("EmbedTimePosition")
        private String embedTimePosition;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("TimeFormat")
        private String timeFormat;

        private CsvControl(Builder builder) {
            this.embedBitsNumberInEachTime = builder.embedBitsNumberInEachTime;
            this.embedColumn = builder.embedColumn;
            this.embedDensity = builder.embedDensity;
            this.embedPrecision = builder.embedPrecision;
            this.embedTimePosition = builder.embedTimePosition;
            this.method = builder.method;
            this.timeFormat = builder.timeFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CsvControl create() {
            return builder().build();
        }

        /**
         * @return embedBitsNumberInEachTime
         */
        public Long getEmbedBitsNumberInEachTime() {
            return this.embedBitsNumberInEachTime;
        }

        /**
         * @return embedColumn
         */
        public Long getEmbedColumn() {
            return this.embedColumn;
        }

        /**
         * @return embedDensity
         */
        public String getEmbedDensity() {
            return this.embedDensity;
        }

        /**
         * @return embedPrecision
         */
        public Long getEmbedPrecision() {
            return this.embedPrecision;
        }

        /**
         * @return embedTimePosition
         */
        public String getEmbedTimePosition() {
            return this.embedTimePosition;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return timeFormat
         */
        public String getTimeFormat() {
            return this.timeFormat;
        }

        public static final class Builder {
            private Long embedBitsNumberInEachTime; 
            private Long embedColumn; 
            private String embedDensity; 
            private Long embedPrecision; 
            private String embedTimePosition; 
            private String method; 
            private String timeFormat; 

            private Builder() {
            } 

            private Builder(CsvControl model) {
                this.embedBitsNumberInEachTime = model.embedBitsNumberInEachTime;
                this.embedColumn = model.embedColumn;
                this.embedDensity = model.embedDensity;
                this.embedPrecision = model.embedPrecision;
                this.embedTimePosition = model.embedTimePosition;
                this.method = model.method;
                this.timeFormat = model.timeFormat;
            } 

            /**
             * EmbedBitsNumberInEachTime.
             */
            public Builder embedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
                this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
                return this;
            }

            /**
             * EmbedColumn.
             */
            public Builder embedColumn(Long embedColumn) {
                this.embedColumn = embedColumn;
                return this;
            }

            /**
             * EmbedDensity.
             */
            public Builder embedDensity(String embedDensity) {
                this.embedDensity = embedDensity;
                return this;
            }

            /**
             * EmbedPrecision.
             */
            public Builder embedPrecision(Long embedPrecision) {
                this.embedPrecision = embedPrecision;
                return this;
            }

            /**
             * EmbedTimePosition.
             */
            public Builder embedTimePosition(String embedTimePosition) {
                this.embedTimePosition = embedTimePosition;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * TimeFormat.
             */
            public Builder timeFormat(String timeFormat) {
                this.timeFormat = timeFormat;
                return this;
            }

            public CsvControl build() {
                return new CsvControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class BgInvisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Opacity")
        @com.aliyun.core.annotation.Validation(maximum = 255, minimum = 1)
        private Long opacity;

        private BgInvisibleControl(Builder builder) {
            this.opacity = builder.opacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgInvisibleControl create() {
            return builder().build();
        }

        /**
         * @return opacity
         */
        public Long getOpacity() {
            return this.opacity;
        }

        public static final class Builder {
            private Long opacity; 

            private Builder() {
            } 

            private Builder(BgInvisibleControl model) {
                this.opacity = model.opacity;
            } 

            /**
             * Opacity.
             */
            public Builder opacity(Long opacity) {
                this.opacity = opacity;
                return this;
            }

            public BgInvisibleControl build() {
                return new BgInvisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class BgVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        @com.aliyun.core.annotation.Validation(maximum = 360)
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        @com.aliyun.core.annotation.Validation(maximum = 200)
        private Long fontSize;

        @com.aliyun.core.annotation.NameInMap("HorizontalNumber")
        @com.aliyun.core.annotation.Validation(maximum = 200)
        private Long horizontalNumber;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        @com.aliyun.core.annotation.Validation(maximum = 255, minimum = 1)
        private Long opacity;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private String posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private String posY;

        @com.aliyun.core.annotation.NameInMap("VerticalNumber")
        @com.aliyun.core.annotation.Validation(maximum = 200)
        private Long verticalNumber;

        @com.aliyun.core.annotation.NameInMap("VisibleText")
        @com.aliyun.core.annotation.Validation(maxLength = 1000)
        private String visibleText;

        private BgVisibleControl(Builder builder) {
            this.angle = builder.angle;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.horizontalNumber = builder.horizontalNumber;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.verticalNumber = builder.verticalNumber;
            this.visibleText = builder.visibleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgVisibleControl create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Long getFontSize() {
            return this.fontSize;
        }

        /**
         * @return horizontalNumber
         */
        public Long getHorizontalNumber() {
            return this.horizontalNumber;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Long getOpacity() {
            return this.opacity;
        }

        /**
         * @return posX
         */
        public String getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public String getPosY() {
            return this.posY;
        }

        /**
         * @return verticalNumber
         */
        public Long getVerticalNumber() {
            return this.verticalNumber;
        }

        /**
         * @return visibleText
         */
        public String getVisibleText() {
            return this.visibleText;
        }

        public static final class Builder {
            private Long angle; 
            private String fontColor; 
            private Long fontSize; 
            private Long horizontalNumber; 
            private String mode; 
            private Long opacity; 
            private String posX; 
            private String posY; 
            private Long verticalNumber; 
            private String visibleText; 

            private Builder() {
            } 

            private Builder(BgVisibleControl model) {
                this.angle = model.angle;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.horizontalNumber = model.horizontalNumber;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posX = model.posX;
                this.posY = model.posY;
                this.verticalNumber = model.verticalNumber;
                this.visibleText = model.visibleText;
            } 

            /**
             * Angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * HorizontalNumber.
             */
            public Builder horizontalNumber(Long horizontalNumber) {
                this.horizontalNumber = horizontalNumber;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Opacity.
             */
            public Builder opacity(Long opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(String posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(String posY) {
                this.posY = posY;
                return this;
            }

            /**
             * VerticalNumber.
             */
            public Builder verticalNumber(Long verticalNumber) {
                this.verticalNumber = verticalNumber;
                return this;
            }

            /**
             * VisibleText.
             */
            public Builder visibleText(String visibleText) {
                this.visibleText = visibleText;
                return this;
            }

            public BgVisibleControl build() {
                return new BgVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class BackgroundControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgAddInvisible")
        private Boolean bgAddInvisible;

        @com.aliyun.core.annotation.NameInMap("BgAddVisible")
        private Boolean bgAddVisible;

        @com.aliyun.core.annotation.NameInMap("BgInvisibleControl")
        private BgInvisibleControl bgInvisibleControl;

        @com.aliyun.core.annotation.NameInMap("BgVisibleControl")
        private BgVisibleControl bgVisibleControl;

        private BackgroundControl(Builder builder) {
            this.bgAddInvisible = builder.bgAddInvisible;
            this.bgAddVisible = builder.bgAddVisible;
            this.bgInvisibleControl = builder.bgInvisibleControl;
            this.bgVisibleControl = builder.bgVisibleControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundControl create() {
            return builder().build();
        }

        /**
         * @return bgAddInvisible
         */
        public Boolean getBgAddInvisible() {
            return this.bgAddInvisible;
        }

        /**
         * @return bgAddVisible
         */
        public Boolean getBgAddVisible() {
            return this.bgAddVisible;
        }

        /**
         * @return bgInvisibleControl
         */
        public BgInvisibleControl getBgInvisibleControl() {
            return this.bgInvisibleControl;
        }

        /**
         * @return bgVisibleControl
         */
        public BgVisibleControl getBgVisibleControl() {
            return this.bgVisibleControl;
        }

        public static final class Builder {
            private Boolean bgAddInvisible; 
            private Boolean bgAddVisible; 
            private BgInvisibleControl bgInvisibleControl; 
            private BgVisibleControl bgVisibleControl; 

            private Builder() {
            } 

            private Builder(BackgroundControl model) {
                this.bgAddInvisible = model.bgAddInvisible;
                this.bgAddVisible = model.bgAddVisible;
                this.bgInvisibleControl = model.bgInvisibleControl;
                this.bgVisibleControl = model.bgVisibleControl;
            } 

            /**
             * BgAddInvisible.
             */
            public Builder bgAddInvisible(Boolean bgAddInvisible) {
                this.bgAddInvisible = bgAddInvisible;
                return this;
            }

            /**
             * BgAddVisible.
             */
            public Builder bgAddVisible(Boolean bgAddVisible) {
                this.bgAddVisible = bgAddVisible;
                return this;
            }

            /**
             * BgInvisibleControl.
             */
            public Builder bgInvisibleControl(BgInvisibleControl bgInvisibleControl) {
                this.bgInvisibleControl = bgInvisibleControl;
                return this;
            }

            /**
             * BgVisibleControl.
             */
            public Builder bgVisibleControl(BgVisibleControl bgVisibleControl) {
                this.bgVisibleControl = bgVisibleControl;
                return this;
            }

            public BackgroundControl build() {
                return new BackgroundControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class DocumentControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundControl")
        private BackgroundControl backgroundControl;

        @com.aliyun.core.annotation.NameInMap("InvisibleAntiAllCopy")
        private Boolean invisibleAntiAllCopy;

        @com.aliyun.core.annotation.NameInMap("InvisibleAntiTextCopy")
        private Boolean invisibleAntiTextCopy;

        private DocumentControl(Builder builder) {
            this.backgroundControl = builder.backgroundControl;
            this.invisibleAntiAllCopy = builder.invisibleAntiAllCopy;
            this.invisibleAntiTextCopy = builder.invisibleAntiTextCopy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocumentControl create() {
            return builder().build();
        }

        /**
         * @return backgroundControl
         */
        public BackgroundControl getBackgroundControl() {
            return this.backgroundControl;
        }

        /**
         * @return invisibleAntiAllCopy
         */
        public Boolean getInvisibleAntiAllCopy() {
            return this.invisibleAntiAllCopy;
        }

        /**
         * @return invisibleAntiTextCopy
         */
        public Boolean getInvisibleAntiTextCopy() {
            return this.invisibleAntiTextCopy;
        }

        public static final class Builder {
            private BackgroundControl backgroundControl; 
            private Boolean invisibleAntiAllCopy; 
            private Boolean invisibleAntiTextCopy; 

            private Builder() {
            } 

            private Builder(DocumentControl model) {
                this.backgroundControl = model.backgroundControl;
                this.invisibleAntiAllCopy = model.invisibleAntiAllCopy;
                this.invisibleAntiTextCopy = model.invisibleAntiTextCopy;
            } 

            /**
             * BackgroundControl.
             */
            public Builder backgroundControl(BackgroundControl backgroundControl) {
                this.backgroundControl = backgroundControl;
                return this;
            }

            /**
             * InvisibleAntiAllCopy.
             */
            public Builder invisibleAntiAllCopy(Boolean invisibleAntiAllCopy) {
                this.invisibleAntiAllCopy = invisibleAntiAllCopy;
                return this;
            }

            /**
             * InvisibleAntiTextCopy.
             */
            public Builder invisibleAntiTextCopy(Boolean invisibleAntiTextCopy) {
                this.invisibleAntiTextCopy = invisibleAntiTextCopy;
                return this;
            }

            public DocumentControl build() {
                return new DocumentControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class Margin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Float bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Float left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Float right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Float top;

        private Margin(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Margin create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Float getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Float getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Float getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Float getTop() {
            return this.top;
        }

        public static final class Builder {
            private Float bottom; 
            private Float left; 
            private Float right; 
            private Float top; 

            private Builder() {
            } 

            private Builder(Margin model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * Bottom.
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * Right.
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Float top) {
                this.top = top;
                return this;
            }

            public Margin build() {
                return new Margin(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class LogoVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("Enhance")
        private Boolean enhance;

        @com.aliyun.core.annotation.NameInMap("LogoBase64")
        private String logoBase64;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private Margin margin;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        private Integer opacity;

        @com.aliyun.core.annotation.NameInMap("PosAx")
        private Float posAx;

        @com.aliyun.core.annotation.NameInMap("PosAy")
        private Float posAy;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private Long posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private Long posY;

        @com.aliyun.core.annotation.NameInMap("SpaceX")
        private Long spaceX;

        @com.aliyun.core.annotation.NameInMap("SpaceY")
        private Long spaceY;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        private LogoVisibleControl(Builder builder) {
            this.angle = builder.angle;
            this.enhance = builder.enhance;
            this.logoBase64 = builder.logoBase64;
            this.margin = builder.margin;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posAx = builder.posAx;
            this.posAy = builder.posAy;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.spaceX = builder.spaceX;
            this.spaceY = builder.spaceY;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoVisibleControl create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return enhance
         */
        public Boolean getEnhance() {
            return this.enhance;
        }

        /**
         * @return logoBase64
         */
        public String getLogoBase64() {
            return this.logoBase64;
        }

        /**
         * @return margin
         */
        public Margin getMargin() {
            return this.margin;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Integer getOpacity() {
            return this.opacity;
        }

        /**
         * @return posAx
         */
        public Float getPosAx() {
            return this.posAx;
        }

        /**
         * @return posAy
         */
        public Float getPosAy() {
            return this.posAy;
        }

        /**
         * @return posX
         */
        public Long getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public Long getPosY() {
            return this.posY;
        }

        /**
         * @return spaceX
         */
        public Long getSpaceX() {
            return this.spaceX;
        }

        /**
         * @return spaceY
         */
        public Long getSpaceY() {
            return this.spaceY;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Long angle; 
            private Boolean enhance; 
            private String logoBase64; 
            private Margin margin; 
            private String mode; 
            private Integer opacity; 
            private Float posAx; 
            private Float posAy; 
            private Long posX; 
            private Long posY; 
            private Long spaceX; 
            private Long spaceY; 
            private Boolean visible; 

            private Builder() {
            } 

            private Builder(LogoVisibleControl model) {
                this.angle = model.angle;
                this.enhance = model.enhance;
                this.logoBase64 = model.logoBase64;
                this.margin = model.margin;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posAx = model.posAx;
                this.posAy = model.posAy;
                this.posX = model.posX;
                this.posY = model.posY;
                this.spaceX = model.spaceX;
                this.spaceY = model.spaceY;
                this.visible = model.visible;
            } 

            /**
             * Angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * Enhance.
             */
            public Builder enhance(Boolean enhance) {
                this.enhance = enhance;
                return this;
            }

            /**
             * LogoBase64.
             */
            public Builder logoBase64(String logoBase64) {
                this.logoBase64 = logoBase64;
                return this;
            }

            /**
             * Margin.
             */
            public Builder margin(Margin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Opacity.
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosAx.
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * PosAy.
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * SpaceX.
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * SpaceY.
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public LogoVisibleControl build() {
                return new LogoVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class ImageControlMetadataControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("XmpKvBase64")
        private String xmpKvBase64;

        private ImageControlMetadataControl(Builder builder) {
            this.enable = builder.enable;
            this.xmpKvBase64 = builder.xmpKvBase64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageControlMetadataControl create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return xmpKvBase64
         */
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

        public static final class Builder {
            private Boolean enable; 
            private String xmpKvBase64; 

            private Builder() {
            } 

            private Builder(ImageControlMetadataControl model) {
                this.enable = model.enable;
                this.xmpKvBase64 = model.xmpKvBase64;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * XmpKvBase64.
             */
            public Builder xmpKvBase64(String xmpKvBase64) {
                this.xmpKvBase64 = xmpKvBase64;
                return this;
            }

            public ImageControlMetadataControl build() {
                return new ImageControlMetadataControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class TextVisibleControlMargin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Float bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Float left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Float right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Float top;

        private TextVisibleControlMargin(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextVisibleControlMargin create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Float getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Float getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Float getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Float getTop() {
            return this.top;
        }

        public static final class Builder {
            private Float bottom; 
            private Float left; 
            private Float right; 
            private Float top; 

            private Builder() {
            } 

            private Builder(TextVisibleControlMargin model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * Bottom.
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * Right.
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Float top) {
                this.top = top;
                return this;
            }

            public TextVisibleControlMargin build() {
                return new TextVisibleControlMargin(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class TextVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Long fontSize;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private TextVisibleControlMargin margin;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        private Integer opacity;

        @com.aliyun.core.annotation.NameInMap("PosAx")
        private Float posAx;

        @com.aliyun.core.annotation.NameInMap("PosAy")
        private Float posAy;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private Long posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private Long posY;

        @com.aliyun.core.annotation.NameInMap("SpaceX")
        private Long spaceX;

        @com.aliyun.core.annotation.NameInMap("SpaceY")
        private Long spaceY;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        @com.aliyun.core.annotation.NameInMap("VisibleText")
        private String visibleText;

        private TextVisibleControl(Builder builder) {
            this.angle = builder.angle;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.margin = builder.margin;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posAx = builder.posAx;
            this.posAy = builder.posAy;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.spaceX = builder.spaceX;
            this.spaceY = builder.spaceY;
            this.visible = builder.visible;
            this.visibleText = builder.visibleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextVisibleControl create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Long getFontSize() {
            return this.fontSize;
        }

        /**
         * @return margin
         */
        public TextVisibleControlMargin getMargin() {
            return this.margin;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Integer getOpacity() {
            return this.opacity;
        }

        /**
         * @return posAx
         */
        public Float getPosAx() {
            return this.posAx;
        }

        /**
         * @return posAy
         */
        public Float getPosAy() {
            return this.posAy;
        }

        /**
         * @return posX
         */
        public Long getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public Long getPosY() {
            return this.posY;
        }

        /**
         * @return spaceX
         */
        public Long getSpaceX() {
            return this.spaceX;
        }

        /**
         * @return spaceY
         */
        public Long getSpaceY() {
            return this.spaceY;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        /**
         * @return visibleText
         */
        public String getVisibleText() {
            return this.visibleText;
        }

        public static final class Builder {
            private Long angle; 
            private String fontColor; 
            private Long fontSize; 
            private TextVisibleControlMargin margin; 
            private String mode; 
            private Integer opacity; 
            private Float posAx; 
            private Float posAy; 
            private Long posX; 
            private Long posY; 
            private Long spaceX; 
            private Long spaceY; 
            private Boolean visible; 
            private String visibleText; 

            private Builder() {
            } 

            private Builder(TextVisibleControl model) {
                this.angle = model.angle;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.margin = model.margin;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posAx = model.posAx;
                this.posAy = model.posAy;
                this.posX = model.posX;
                this.posY = model.posY;
                this.spaceX = model.spaceX;
                this.spaceY = model.spaceY;
                this.visible = model.visible;
                this.visibleText = model.visibleText;
            } 

            /**
             * Angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Margin.
             */
            public Builder margin(TextVisibleControlMargin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Opacity.
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosAx.
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * PosAy.
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * SpaceX.
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * SpaceY.
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * VisibleText.
             */
            public Builder visibleText(String visibleText) {
                this.visibleText = visibleText;
                return this;
            }

            public TextVisibleControl build() {
                return new TextVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class ImageControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogoVisibleControl")
        private LogoVisibleControl logoVisibleControl;

        @com.aliyun.core.annotation.NameInMap("MetadataControl")
        private ImageControlMetadataControl metadataControl;

        @com.aliyun.core.annotation.NameInMap("TextVisibleControl")
        private TextVisibleControl textVisibleControl;

        private ImageControl(Builder builder) {
            this.logoVisibleControl = builder.logoVisibleControl;
            this.metadataControl = builder.metadataControl;
            this.textVisibleControl = builder.textVisibleControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageControl create() {
            return builder().build();
        }

        /**
         * @return logoVisibleControl
         */
        public LogoVisibleControl getLogoVisibleControl() {
            return this.logoVisibleControl;
        }

        /**
         * @return metadataControl
         */
        public ImageControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        /**
         * @return textVisibleControl
         */
        public TextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

        public static final class Builder {
            private LogoVisibleControl logoVisibleControl; 
            private ImageControlMetadataControl metadataControl; 
            private TextVisibleControl textVisibleControl; 

            private Builder() {
            } 

            private Builder(ImageControl model) {
                this.logoVisibleControl = model.logoVisibleControl;
                this.metadataControl = model.metadataControl;
                this.textVisibleControl = model.textVisibleControl;
            } 

            /**
             * LogoVisibleControl.
             */
            public Builder logoVisibleControl(LogoVisibleControl logoVisibleControl) {
                this.logoVisibleControl = logoVisibleControl;
                return this;
            }

            /**
             * MetadataControl.
             */
            public Builder metadataControl(ImageControlMetadataControl metadataControl) {
                this.metadataControl = metadataControl;
                return this;
            }

            /**
             * TextVisibleControl.
             */
            public Builder textVisibleControl(TextVisibleControl textVisibleControl) {
                this.textVisibleControl = textVisibleControl;
                return this;
            }

            public ImageControl build() {
                return new ImageControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class VideoControlMetadataControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("XmpKvBase64")
        private String xmpKvBase64;

        private VideoControlMetadataControl(Builder builder) {
            this.enable = builder.enable;
            this.xmpKvBase64 = builder.xmpKvBase64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoControlMetadataControl create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return xmpKvBase64
         */
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

        public static final class Builder {
            private Boolean enable; 
            private String xmpKvBase64; 

            private Builder() {
            } 

            private Builder(VideoControlMetadataControl model) {
                this.enable = model.enable;
                this.xmpKvBase64 = model.xmpKvBase64;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * XmpKvBase64.
             */
            public Builder xmpKvBase64(String xmpKvBase64) {
                this.xmpKvBase64 = xmpKvBase64;
                return this;
            }

            public VideoControlMetadataControl build() {
                return new VideoControlMetadataControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class VideoControlTextVisibleControlMargin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Integer bottom;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Integer right;

        private VideoControlTextVisibleControlMargin(Builder builder) {
            this.bottom = builder.bottom;
            this.right = builder.right;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoControlTextVisibleControlMargin create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Integer getBottom() {
            return this.bottom;
        }

        /**
         * @return right
         */
        public Integer getRight() {
            return this.right;
        }

        public static final class Builder {
            private Integer bottom; 
            private Integer right; 

            private Builder() {
            } 

            private Builder(VideoControlTextVisibleControlMargin model) {
                this.bottom = model.bottom;
                this.right = model.right;
            } 

            /**
             * Bottom.
             */
            public Builder bottom(Integer bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * Right.
             */
            public Builder right(Integer right) {
                this.right = right;
                return this;
            }

            public VideoControlTextVisibleControlMargin build() {
                return new VideoControlTextVisibleControlMargin(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class VideoControlTextVisibleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private VideoControlTextVisibleControlMargin margin;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Opacity")
        private Integer opacity;

        @com.aliyun.core.annotation.NameInMap("PosX")
        private Integer posX;

        @com.aliyun.core.annotation.NameInMap("PosY")
        private Integer posY;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        @com.aliyun.core.annotation.NameInMap("VisibleText")
        private String visibleText;

        private VideoControlTextVisibleControl(Builder builder) {
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.margin = builder.margin;
            this.mode = builder.mode;
            this.opacity = builder.opacity;
            this.posX = builder.posX;
            this.posY = builder.posY;
            this.visible = builder.visible;
            this.visibleText = builder.visibleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoControlTextVisibleControl create() {
            return builder().build();
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return margin
         */
        public VideoControlTextVisibleControlMargin getMargin() {
            return this.margin;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return opacity
         */
        public Integer getOpacity() {
            return this.opacity;
        }

        /**
         * @return posX
         */
        public Integer getPosX() {
            return this.posX;
        }

        /**
         * @return posY
         */
        public Integer getPosY() {
            return this.posY;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        /**
         * @return visibleText
         */
        public String getVisibleText() {
            return this.visibleText;
        }

        public static final class Builder {
            private String fontColor; 
            private Integer fontSize; 
            private VideoControlTextVisibleControlMargin margin; 
            private String mode; 
            private Integer opacity; 
            private Integer posX; 
            private Integer posY; 
            private Boolean visible; 
            private String visibleText; 

            private Builder() {
            } 

            private Builder(VideoControlTextVisibleControl model) {
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.margin = model.margin;
                this.mode = model.mode;
                this.opacity = model.opacity;
                this.posX = model.posX;
                this.posY = model.posY;
                this.visible = model.visible;
                this.visibleText = model.visibleText;
            } 

            /**
             * FontColor.
             */
            public Builder fontColor(String fontColor) {
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
             * Margin.
             */
            public Builder margin(VideoControlTextVisibleControlMargin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Opacity.
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * PosX.
             */
            public Builder posX(Integer posX) {
                this.posX = posX;
                return this;
            }

            /**
             * PosY.
             */
            public Builder posY(Integer posY) {
                this.posY = posY;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * VisibleText.
             */
            public Builder visibleText(String visibleText) {
                this.visibleText = visibleText;
                return this;
            }

            public VideoControlTextVisibleControl build() {
                return new VideoControlTextVisibleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWmEmbedTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmEmbedTaskRequest</p>
     */
    public static class VideoControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetadataControl")
        private VideoControlMetadataControl metadataControl;

        @com.aliyun.core.annotation.NameInMap("TextVisibleControl")
        private VideoControlTextVisibleControl textVisibleControl;

        private VideoControl(Builder builder) {
            this.metadataControl = builder.metadataControl;
            this.textVisibleControl = builder.textVisibleControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoControl create() {
            return builder().build();
        }

        /**
         * @return metadataControl
         */
        public VideoControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        /**
         * @return textVisibleControl
         */
        public VideoControlTextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

        public static final class Builder {
            private VideoControlMetadataControl metadataControl; 
            private VideoControlTextVisibleControl textVisibleControl; 

            private Builder() {
            } 

            private Builder(VideoControl model) {
                this.metadataControl = model.metadataControl;
                this.textVisibleControl = model.textVisibleControl;
            } 

            /**
             * MetadataControl.
             */
            public Builder metadataControl(VideoControlMetadataControl metadataControl) {
                this.metadataControl = metadataControl;
                return this;
            }

            /**
             * TextVisibleControl.
             */
            public Builder textVisibleControl(VideoControlTextVisibleControl textVisibleControl) {
                this.textVisibleControl = textVisibleControl;
                return this;
            }

            public VideoControl build() {
                return new VideoControl(this);
            } 

        } 

    }
}
