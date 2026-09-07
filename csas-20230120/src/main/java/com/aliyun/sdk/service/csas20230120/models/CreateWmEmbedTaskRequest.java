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
         * <p>The audio control parameters.</p>
         */
        public Builder audioControl(AudioControl audioControl) {
            String audioControlShrink = shrink(audioControl, "AudioControl", "json");
            this.putBodyParameter("AudioControl", audioControlShrink);
            this.audioControl = audioControl;
            return this;
        }

        /**
         * <p>The CSV watermark embedding control parameters.</p>
         */
        public Builder csvControl(CsvControl csvControl) {
            String csvControlShrink = shrink(csvControl, "CsvControl", "json");
            this.putBodyParameter("CsvControl", csvControlShrink);
            this.csvControl = csvControl;
            return this;
        }

        /**
         * <p>The document watermark control parameters.</p>
         */
        public Builder documentControl(DocumentControl documentControl) {
            String documentControlShrink = shrink(documentControl, "DocumentControl", "json");
            this.putBodyParameter("DocumentControl", documentControlShrink);
            this.documentControl = documentControl;
            return this;
        }

        /**
         * <p>The URL for downloading the file to be embedded. The URL must be active for public network access.</p>
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
         * <p>The name of the file to be embedded. The backend validates the file type based on the file name extension.</p>
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
         * <p>The image watermark control parameters.</p>
         */
        public Builder imageControl(ImageControl imageControl) {
            String imageControlShrink = shrink(imageControl, "ImageControl", "json");
            this.putBodyParameter("ImageControl", imageControlShrink);
            this.imageControl = imageControl;
            return this;
        }

        /**
         * <p>The image watermark parameter that specifies the expected JPEG compression quality factor of the output image. Default value: 95. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        public Builder imageEmbedJpegQuality(Long imageEmbedJpegQuality) {
            this.putBodyParameter("ImageEmbedJpegQuality", imageEmbedJpegQuality);
            this.imageEmbedJpegQuality = imageEmbedJpegQuality;
            return this;
        }

        /**
         * <p>The image watermark parameter. A larger value indicates higher robustness but lower visual quality. Default value: 2. Valid values: 0 to 4.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder imageEmbedLevel(Long imageEmbedLevel) {
            this.putBodyParameter("ImageEmbedLevel", imageEmbedLevel);
            this.imageEmbedLevel = imageEmbedLevel;
            return this;
        }

        /**
         * <p>Specifies whether to enable invisible watermark embedding. Default value: true.</p>
         */
        public Builder invisibleEnable(Boolean invisibleEnable) {
            this.putBodyParameter("InvisibleEnable", invisibleEnable);
            this.invisibleEnable = invisibleEnable;
            return this;
        }

        /**
         * <p>The short video watermark parameter that specifies the video bitrate. By default, the video bitrate is automatically obtained. You can use this parameter to forcibly specify the bitrate used during extraction. Typically, you do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>3000k</p>
         */
        public Builder videoBitrate(String videoBitrate) {
            this.putBodyParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
            return this;
        }

        /**
         * <p>The video control parameters.</p>
         */
        public Builder videoControl(VideoControl videoControl) {
            String videoControlShrink = shrink(videoControl, "VideoControl", "json");
            this.putBodyParameter("VideoControl", videoControlShrink);
            this.videoControl = videoControl;
            return this;
        }

        /**
         * <p>Video watermark parameter. Specifies whether to use the long video watermark SDK. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The long video watermark SDK is used.</li>
         * <li><strong>false</strong>: The long video watermark SDK is not used.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder videoIsLong(Boolean videoIsLong) {
            this.putBodyParameter("VideoIsLong", videoIsLong);
            this.videoIsLong = videoIsLong;
            return this;
        }

        /**
         * <p>The watermark information in Base64-encoded string format. If this parameter is set, WmInfoUint cannot be set.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8gc2F*****</p>
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the 40-bit SDK is used for embedding, set this parameter to 40 during extraction as well.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * <p>The watermark information in decimal number format. If this parameter is set, WmInfoBytesB64 cannot be set.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putBodyParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li><strong>PureDocument</strong>: document watermark.</li>
         * <li><strong>PureImage</strong>: image watermark.</li>
         * <li><strong>PureAudio</strong>: audio watermark.</li>
         * <li><strong>PureVideo</strong>: video watermark.</li>
         * <li><strong>AigcDocument</strong>: AIGC document watermark.</li>
         * <li><strong>AigcImage</strong>: AIGC image watermark.</li>
         * <li><strong>AigcAudio</strong>: AIGC audio watermark.</li>
         * <li><strong>AigcVideo</strong>: AIGC video watermark.</li>
         * </ul>
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
             * <p>Specifies whether to enable this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The metadata in Base64 format. Encode the following string in Base64 format: AIGC={&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;}. Note: 1. The &quot;AIGC=&quot; prefix is required. Otherwise, the metadata cannot be added. The prefix differs from that of image metadata. 2. The Base64 encoding must be in standard format with padding.</p>
             * 
             * <strong>example:</strong>
             * <p>QUlHQz17IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
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
             * <p>The control parameters for audio metadata.</p>
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
             * <p>The timestamp watermark information bit width. Specifies how much information a single timestamp can contain. A larger value theoretically reduces the number of rows required for extraction, but increases the time modification magnitude. The magnitude range is 2^n, where n is this parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder embedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
                this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
                return this;
            }

            /**
             * <p>The column to embed the watermark. We recommend that you use a string content column. Counting starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder embedColumn(Long embedColumn) {
                this.embedColumn = embedColumn;
                return this;
            }

            /**
             * <p>The zero-width character watermark parameter that specifies the embedding density. Valid values: a floating-point number between 0 and 1. 0 indicates that only the first row is embedded. 1 indicates that all rows are embedded.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder embedDensity(String embedDensity) {
                this.embedDensity = embedDensity;
                return this;
            }

            /**
             * <p>The modification precision, which indicates the magnitude of modification as a power of 10. For example, 0 indicates a modification precision of 10^0 (the ones place), -1 indicates the first decimal place, and 1 indicates the tens place. If the float data does not have this precision, no modification is made.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder embedPrecision(Long embedPrecision) {
                this.embedPrecision = embedPrecision;
                return this;
            }

            /**
             * <p>The timestamp watermark parameter that specifies the watermark embedding position. Valid values: Min (minute), Sec (second), and MilSec (millisecond). Select one of the three. The algorithm modifies the data at the selected position.</p>
             * 
             * <strong>example:</strong>
             * <p>Sec</p>
             */
            public Builder embedTimePosition(String embedTimePosition) {
                this.embedTimePosition = embedTimePosition;
                return this;
            }

            /**
             * <p>The watermark embedding method.</p>
             * 
             * <strong>example:</strong>
             * <p>lossy_zero_width_embed</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The timestamp watermark parameter that specifies the format string for parsing timestamps in the CSV file. For example, if the timestamp in the CSV file is similar to &quot;2023-10-15 13:20:59:342&quot;, the corresponding format string is &quot;Year-Mon-Day Hour:Min:Sec.MilSec&quot;. The watermark output retains this format after embedding. If the format is incorrect, this method cannot be used. Year, month, day, hour, minute, second, and millisecond in the format string must follow the specified notation. Delimiters must be single non-alphabetic English characters, typically &quot;:&quot;, &quot;/&quot;, &quot;-&quot;, or &quot; &quot; (space). &quot;T&quot; and &quot;Z&quot; are also supported as delimiters. Other time formats are not currently supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Hour:Min:Sec</p>
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
             * <p>The opacity parameter of the background invisible watermark. Valid values: 1 to 13. A larger value indicates less transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The counterclockwise rotation angle of the visible watermark text. Valid values: 1 to 360.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>The font color of the visible watermark text. The format is 0xFFFFFF RGB color format. For example, 0x000000 indicates black.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000000</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size of the visible watermark text. A larger value indicates a larger font.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the number of times the visible watermark repeats horizontally.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder horizontalNumber(Long horizontalNumber) {
                this.horizontalNumber = horizontalNumber;
                return this;
            }

            /**
             * <p>The background visible watermark mode. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>pos</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity parameter of the visible watermark. Valid values: 1 to 255. A larger value indicates less transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder opacity(Long opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Controls the horizontal position of the visible watermark, with the lower-left corner as the origin. When the value is between 0 and 1, it represents proportional control. When the value is greater than 1, it represents precise pixel position control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder posX(String posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to pos. Controls the vertical position of the visible watermark, with the lower-left corner as the origin. When the value is between 0 and 1, it represents proportional control. When the value is greater than 1, it represents precise pixel position control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder posY(String posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>Takes effect when Mode is set to repeat. Specifies the number of times the visible watermark repeats vertically.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder verticalNumber(Long verticalNumber) {
                this.verticalNumber = verticalNumber;
                return this;
            }

            /**
             * <p>The background visible watermark text. The format is a UTF-8 string.</p>
             * 
             * <strong>example:</strong>
             * <p>hello ****</p>
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
             * <p>Specifies whether to add a background invisible watermark. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bgAddInvisible(Boolean bgAddInvisible) {
                this.bgAddInvisible = bgAddInvisible;
                return this;
            }

            /**
             * <p>Specifies whether to enable the background visible watermark. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bgAddVisible(Boolean bgAddVisible) {
                this.bgAddVisible = bgAddVisible;
                return this;
            }

            /**
             * <p>The background invisible watermark control parameters.</p>
             */
            public Builder bgInvisibleControl(BgInvisibleControl bgInvisibleControl) {
                this.bgInvisibleControl = bgInvisibleControl;
                return this;
            }

            /**
             * <p>The background visible watermark control parameters.</p>
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
             * <p>The background watermark control parameters.</p>
             */
            public Builder backgroundControl(BackgroundControl backgroundControl) {
                this.backgroundControl = backgroundControl;
                return this;
            }

            /**
             * <p>Specifies whether to enable component invisible watermark. The component invisible watermark can resist document addition, deletion, modification, save-as (same format), and full-select copy from docx to a new docx document. It cannot resist format conversion attacks. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder invisibleAntiAllCopy(Boolean invisibleAntiAllCopy) {
                this.invisibleAntiAllCopy = invisibleAntiAllCopy;
                return this;
            }

            /**
             * <p>Specifies whether to enable zero-width character invisible watermark. The zero-width character invisible watermark can resist document addition, deletion, modification, save-as (same format), partial text copy-paste, and CopytoTxt attacks. It cannot resist format conversion toPDF attacks. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>This parameter takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left or top-right. The top margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The clockwise rotation angle of the logo watermark. Valid values: 1 to 360.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>Specifies whether to enable enhanced visible watermarking. After this feature is enabled, the logo is processed so that information embedded in the logo can be extracted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enhance(Boolean enhance) {
                this.enhance = enhance;
                return this;
            }

            /**
             * <p>The logo watermark in Base64 format. The logo file is a PNG image converted to Base64 format.</p>
             * 
             * <strong>example:</strong>
             * <p>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</p>
             */
            public Builder logoBase64(String logoBase64) {
                this.logoBase64 = logoBase64;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
             */
            public Builder margin(Margin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The display mode of the logo watermark. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>pos</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity of the logo watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>The horizontal anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the watermark is drawn with the upper-left corner as the anchor point. When the value is 0.5, the watermark is drawn at the center. When (PosAx, PosAy) is set to (1, 1), the watermark is drawn at the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * <p>The vertical anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the watermark is drawn with the upper-left corner as the anchor point. When the value is 0.5, the watermark is drawn at the center. When (PosAx, PosAy) is set to (1, 1), the watermark is drawn at the lower-right corner.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the horizontal position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the vertical position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled visible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled visible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>Specifies whether to enable this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The metadata in Base64 format. Encode the following string in Base64 format: AIGC:{&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;}. Note: 1. The &quot;AIGC:&quot; prefix is required. Otherwise, the metadata cannot be added. The format differs from that of audio and video metadata. 2. The Base64 encoding must be in standard format with padding.</p>
             * 
             * <strong>example:</strong>
             * <p>QUlHQzp7IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
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
             * <p>This parameter takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bottom(Float bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder left(Float left) {
                this.left = left;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder right(Float right) {
                this.right = right;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left or top-right. The top margin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The clockwise rotation angle of the text watermark. Valid values: 0 to 360.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>The font color of the text watermark. The format is 0xFFFFFF or #FFFFFF RGB color format. For example, 0x000000 or #000000 indicates black.</p>
             * 
             * <strong>example:</strong>
             * <p>#FF0000</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size of the text watermark. A larger value indicates a larger font.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Long fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
             */
            public Builder margin(TextVisibleControlMargin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The display mode of the text watermark. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>pos</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>The horizontal anchor point of the text watermark.
             * Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn with the upper-left corner as the anchor point. When the value is 0.5, the text is drawn at the center point. When (PosAx, PosAy) is set to (1, 1), the text is drawn with the lower-right corner as the anchor point.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAx(Float posAx) {
                this.posAx = posAx;
                return this;
            }

            /**
             * <p>The vertical anchor point of the text watermark.
             * Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn with the upper-left corner as the anchor point. When the value is 0.5, the text is drawn from the center point. When (PosAx, PosAy) is set to (1, 1), the text is drawn with the lower-right corner as the anchor point.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posAy(Float posAy) {
                this.posAy = posAy;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the horizontal position of the text watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posX(Long posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the vertical position of the text watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder posY(Long posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled text watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spaceX(Long spaceX) {
                this.spaceX = spaceX;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled text watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spaceY(Long spaceY) {
                this.spaceY = spaceY;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * <p>The text watermark content. The format is a UTF-8 string.</p>
             * 
             * <strong>example:</strong>
             * <p>WatermarkText</p>
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
             * <p>The control parameters for logo watermarks.</p>
             */
            public Builder logoVisibleControl(LogoVisibleControl logoVisibleControl) {
                this.logoVisibleControl = logoVisibleControl;
                return this;
            }

            /**
             * <p>The metadata control parameters. This parameter takes effect when WmType is set to PureImage or AigcImage.</p>
             */
            public Builder metadataControl(ImageControlMetadataControl metadataControl) {
                this.metadataControl = metadataControl;
                return this;
            }

            /**
             * <p>The control parameters for image text watermarks.</p>
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
             * <p>Specifies whether to enable this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The metadata in Base64 format. Encode the following string in Base64 format: AIGC={&quot;Label&quot;:&quot;1&quot;,&quot;ContentProducer&quot;:&quot;AXXXX&quot;,&quot;ProduceID&quot;:&quot;BXXXX,&quot;ReservedCode1&quot;:&quot;CXXX&quot;,&quot;ContentPropagator&quot;:&quot;DXXX&quot;,&quot;PropagateID&quot;:&quot;EXXX&quot;,&quot;ReservedCode2&quot;:&quot;FXXXX&quot;}. Note: 1. The &quot;AIGC=&quot; prefix is required. Otherwise, the metadata cannot be added. The prefix differs from that of image metadata. 2. The Base64 encoding must be in standard format with padding.</p>
             * 
             * <strong>example:</strong>
             * <p>QUlHQz17IkxhYmVsIjoiMSIsIkNvbnRlbnRQcm9kdWNlciI6IkFYWFhYIiwiUHJvZHVjZUlEIjoiQlhYWFgsIlJlc2VydmVkQ29kZTEiOiJDWFhYIiwiQ29udGVudFByb3BhZ2F0b3IiOiJEWFhYIiwiUHJvcGFnYXRlSUQiOiJFWFhYIiwiUmVzZXJ2ZWRDb2RlMiI6IkZYWFhYIn0=</p>
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
             * <p>This parameter takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bottom(Integer bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The font color of the text watermark. The format is 0xFFFFFF or #FFFFFF RGB color format.</p>
             * 
             * <strong>example:</strong>
             * <p>#FF0000</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
             */
            public Builder margin(VideoControlTextVisibleControlMargin margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The display mode of the text watermark. Valid values:</p>
             * <ul>
             * <li><strong>pos</strong>: fixed position, with the upper-left corner as the origin.</li>
             * <li><strong>bottom-right</strong>: lower-left mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bottom-right</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder opacity(Integer opacity) {
                this.opacity = opacity;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the horizontal position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder posX(Integer posX) {
                this.posX = posX;
                return this;
            }

            /**
             * <p>This parameter takes effect when Mode is set to pos. Specifies the vertical position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder posY(Integer posY) {
                this.posY = posY;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            /**
             * <p>The text watermark content. The format is a UTF-8 string.</p>
             * 
             * <strong>example:</strong>
             * <p>WatermarkTest</p>
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
             * <p>The metadata control parameters.</p>
             */
            public Builder metadataControl(VideoControlMetadataControl metadataControl) {
                this.metadataControl = metadataControl;
                return this;
            }

            /**
             * <p>The control parameters for video text watermarks.</p>
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
