// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
         * CsvControl.
         */
        public Builder csvControl(CsvControl csvControl) {
            String csvControlShrink = shrink(csvControl, "CsvControl", "json");
            this.putQueryParameter("CsvControl", csvControlShrink);
            this.csvControl = csvControl;
            return this;
        }

        /**
         * DocumentIsCapture.
         */
        public Builder documentIsCapture(Boolean documentIsCapture) {
            this.putBodyParameter("DocumentIsCapture", documentIsCapture);
            this.documentIsCapture = documentIsCapture;
            return this;
        }

        /**
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
         * VideoIsLong.
         */
        public Builder videoIsLong(Boolean videoIsLong) {
            this.putBodyParameter("VideoIsLong", videoIsLong);
            this.videoIsLong = videoIsLong;
            return this;
        }

        /**
         * VideoSpeed.
         */
        public Builder videoSpeed(String videoSpeed) {
            this.putBodyParameter("VideoSpeed", videoSpeed);
            this.videoSpeed = videoSpeed;
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
}
