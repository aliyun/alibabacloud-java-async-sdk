// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link PreviewDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewDatasetVersionResponseBody</p>
 */
public class PreviewDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreviewResult")
    private PreviewResult previewResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PreviewDatasetVersionResponseBody(Builder builder) {
        this.previewResult = builder.previewResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewDatasetVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return previewResult
     */
    public PreviewResult getPreviewResult() {
        return this.previewResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PreviewResult previewResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PreviewDatasetVersionResponseBody model) {
            this.previewResult = model.previewResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Preview results</p>
         */
        public Builder previewResult(PreviewResult previewResult) {
            this.previewResult = previewResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A6C6B486-E3A2-5D52-9E76-D9380485DXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PreviewDatasetVersionResponseBody build() {
            return new PreviewDatasetVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewDatasetVersionResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewDatasetVersionResponseBody</p>
     */
    public static class PreviewResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("SupportPreview")
        private Boolean supportPreview;

        private PreviewResult(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.mimeType = builder.mimeType;
            this.supportPreview = builder.supportPreview;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreviewResult create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return supportPreview
         */
        public Boolean getSupportPreview() {
            return this.supportPreview;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String mimeType; 
            private Boolean supportPreview; 

            private Builder() {
            } 

            private Builder(PreviewResult model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.mimeType = model.mimeType;
                this.supportPreview = model.supportPreview;
            } 

            /**
             * <p>Content</p>
             * 
             * <strong>example:</strong>
             * <p>this is content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>File name</p>
             * 
             * <strong>example:</strong>
             * <p>parth/data.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The MIME type</p>
             * 
             * <strong>example:</strong>
             * <p>text/plain</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>Preview availability</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportPreview(Boolean supportPreview) {
                this.supportPreview = supportPreview;
                return this;
            }

            public PreviewResult build() {
                return new PreviewResult(this);
            } 

        } 

    }
}
