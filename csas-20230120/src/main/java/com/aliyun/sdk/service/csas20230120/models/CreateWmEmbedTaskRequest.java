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
    @com.aliyun.core.annotation.Query
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
    @com.aliyun.core.annotation.NameInMap("ImageEmbedJpegQuality")
    private Long imageEmbedJpegQuality;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageEmbedLevel")
    private Long imageEmbedLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoBitrate")
    private String videoBitrate;

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
        this.csvControl = builder.csvControl;
        this.documentControl = builder.documentControl;
        this.fileUrl = builder.fileUrl;
        this.filename = builder.filename;
        this.imageEmbedJpegQuality = builder.imageEmbedJpegQuality;
        this.imageEmbedLevel = builder.imageEmbedLevel;
        this.videoBitrate = builder.videoBitrate;
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
     * @return videoBitrate
     */
    public String getVideoBitrate() {
        return this.videoBitrate;
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
        private CsvControl csvControl; 
        private DocumentControl documentControl; 
        private String fileUrl; 
        private String filename; 
        private Long imageEmbedJpegQuality; 
        private Long imageEmbedLevel; 
        private String videoBitrate; 
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
            this.csvControl = request.csvControl;
            this.documentControl = request.documentControl;
            this.fileUrl = request.fileUrl;
            this.filename = request.filename;
            this.imageEmbedJpegQuality = request.imageEmbedJpegQuality;
            this.imageEmbedLevel = request.imageEmbedLevel;
            this.videoBitrate = request.videoBitrate;
            this.videoIsLong = request.videoIsLong;
            this.wmInfoBytesB64 = request.wmInfoBytesB64;
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
        } 

        /**
         * CsvControl.
         */
        public Builder csvControl(CsvControl csvControl) {
            String csvControlShrink = shrink(csvControl, "CsvControl", "json");
            this.putQueryParameter("CsvControl", csvControlShrink);
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
         * VideoBitrate.
         */
        public Builder videoBitrate(String videoBitrate) {
            this.putBodyParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
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
    public static class CsvControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbedColumn")
        private Long embedColumn;

        @com.aliyun.core.annotation.NameInMap("EmbedPrecision")
        private Long embedPrecision;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        private CsvControl(Builder builder) {
            this.embedColumn = builder.embedColumn;
            this.embedPrecision = builder.embedPrecision;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CsvControl create() {
            return builder().build();
        }

        /**
         * @return embedColumn
         */
        public Long getEmbedColumn() {
            return this.embedColumn;
        }

        /**
         * @return embedPrecision
         */
        public Long getEmbedPrecision() {
            return this.embedPrecision;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private Long embedColumn; 
            private Long embedPrecision; 
            private String method; 

            /**
             * EmbedColumn.
             */
            public Builder embedColumn(Long embedColumn) {
                this.embedColumn = embedColumn;
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
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
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
}
