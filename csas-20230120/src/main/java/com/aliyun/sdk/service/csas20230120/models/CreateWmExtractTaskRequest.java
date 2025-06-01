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
 * {@link CreateWmExtractTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWmExtractTaskRequest</p>
 */
public class CreateWmExtractTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CsvControl")
    private CsvControl csvControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentIsCapture")
    private Boolean documentIsCapture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoIsLong")
    private Boolean videoIsLong;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoSpeed")
    private String videoSpeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 32)
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private CreateWmExtractTaskRequest(Builder builder) {
        super(builder);
        this.csvControl = builder.csvControl;
        this.documentIsCapture = builder.documentIsCapture;
        this.fileUrl = builder.fileUrl;
        this.filename = builder.filename;
        this.videoIsLong = builder.videoIsLong;
        this.videoSpeed = builder.videoSpeed;
        this.wmInfoSize = builder.wmInfoSize;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmExtractTaskRequest create() {
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
     * @return documentIsCapture
     */
    public Boolean getDocumentIsCapture() {
        return this.documentIsCapture;
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
     * @return videoIsLong
     */
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    /**
     * @return videoSpeed
     */
    public String getVideoSpeed() {
        return this.videoSpeed;
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<CreateWmExtractTaskRequest, Builder> {
        private CsvControl csvControl; 
        private Boolean documentIsCapture; 
        private String fileUrl; 
        private String filename; 
        private Boolean videoIsLong; 
        private String videoSpeed; 
        private Long wmInfoSize; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWmExtractTaskRequest request) {
            super(request);
            this.csvControl = request.csvControl;
            this.documentIsCapture = request.documentIsCapture;
            this.fileUrl = request.fileUrl;
            this.filename = request.filename;
            this.videoIsLong = request.videoIsLong;
            this.videoSpeed = request.videoSpeed;
            this.wmInfoSize = request.wmInfoSize;
            this.wmType = request.wmType;
        } 

        /**
         * <p>The CSV watermark control parameter. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
         */
        public Builder csvControl(CsvControl csvControl) {
            String csvControlShrink = shrink(csvControl, "CsvControl", "json");
            this.putQueryParameter("CsvControl", csvControlShrink);
            this.csvControl = csvControl;
            return this;
        }

        /**
         * <p>The document watermark parameter that specifies whether the file to be extracted is a screenshot of a document with a background watermark added. The system determines whether to use the extraction logic for document background watermarks based on whether the file to be extracted is an image file. By default, you do not need to configure this parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder documentIsCapture(Boolean documentIsCapture) {
            this.putBodyParameter("DocumentIsCapture", documentIsCapture);
            this.documentIsCapture = documentIsCapture;
            return this;
        }

        /**
         * <p>The URL used to download the file to be extracted. The URL must be accessible over the Internet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/test-****.pdf">https://example.com/test-****.pdf</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>The name of the file to be extracted. The system needs to check the file type based on the file name extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-****.pdf</p>
         */
        public Builder filename(String filename) {
            this.putBodyParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * <p>The watermark parameter for videos that specifies whether to use the long video watermark SDK. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
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
         * <p>The watermark parameter for long videos that specifies the video speed factor. The value can be a floating-point number or a string. Default value: 1. This parameter indicates the speed at which a watermark is added or the time-stretching rate for videos after a watermark is added.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder videoSpeed(String videoSpeed) {
            this.putBodyParameter("VideoSpeed", videoSpeed);
            this.videoSpeed = videoSpeed;
            return this;
        }

        /**
         * <p>The watermark information size. Default value: 32. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. For example, if a 40-bit watermark is used for watermark embedding, you must set this parameter to 40 for watermark extraction.</p>
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
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li><strong>PureWebappInvisible</strong>: web page watermark</li>
         * <li><strong>PureAppInvisible</strong>: app watermark</li>
         * <li><strong>PureScreenInvisible</strong>: screen watermark</li>
         * <li><strong>PureDocument</strong>: document watermark</li>
         * <li><strong>PureImage</strong>: image watermark</li>
         * <li><strong>PureAudio</strong>: audio watermark</li>
         * <li><strong>PureVideo</strong>: video watermark</li>
         * <li><strong>AigcWebappInvisible</strong>: artificial intelligence generated content (AIGC)-based webpage watermark</li>
         * <li><strong>AigcAppInvisible</strong>: AIGC-based app watermark</li>
         * <li><strong>AigcScreenInvisible</strong>: AIGC-based screen watermark</li>
         * <li><strong>AigcDocument</strong>: AIGC-based document watermark</li>
         * <li><strong>AigcImage</strong>: AIGC-based image watermark</li>
         * <li><strong>AigcAudio</strong>: AIGC-based audio watermark</li>
         * <li><strong>AigcVideo</strong>: AIGC-based video watermark</li>
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
        public CreateWmExtractTaskRequest build() {
            return new CreateWmExtractTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWmExtractTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateWmExtractTaskRequest</p>
     */
    public static class CsvControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbedBitsNumberInEachTime")
        @com.aliyun.core.annotation.Validation(maximum = 4, minimum = 1)
        private Long embedBitsNumberInEachTime;

        @com.aliyun.core.annotation.NameInMap("EmbedColumn")
        private Long embedColumn;

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
            private Long embedPrecision; 
            private String embedTimePosition; 
            private String method; 
            private String timeFormat; 

            private Builder() {
            } 

            private Builder(CsvControl model) {
                this.embedBitsNumberInEachTime = model.embedBitsNumberInEachTime;
                this.embedColumn = model.embedColumn;
                this.embedPrecision = model.embedPrecision;
                this.embedTimePosition = model.embedTimePosition;
                this.method = model.method;
                this.timeFormat = model.timeFormat;
            } 

            /**
             * <p>The timestamp watermark parameter that specifies how much information a single timestamp holds. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder embedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
                this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
                return this;
            }

            /**
             * <p>The lossy embedding control parameter that specifies columns to be modified You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder embedColumn(Long embedColumn) {
                this.embedColumn = embedColumn;
                return this;
            }

            /**
             * <p>The lossy embedding control parameter that specifies the modification precision. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder embedPrecision(Long embedPrecision) {
                this.embedPrecision = embedPrecision;
                return this;
            }

            /**
             * <p>The timestamp watermark parameter that specifies the embedding position of the timestamp watermarks. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Min</p>
             */
            public Builder embedTimePosition(String embedTimePosition) {
                this.embedTimePosition = embedTimePosition;
                return this;
            }

            /**
             * <p>The CSV watermark embedding method. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>lossless_row_shift_embed</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The timestamp watermark parameter that specifies the timestamp format. You must keep the value of this parameter consistent for watermark embedding and watermark extraction. Otherwise, the extraction fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Year-Mon-Day Hour:Min:Sec.MilSec</p>
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
}
