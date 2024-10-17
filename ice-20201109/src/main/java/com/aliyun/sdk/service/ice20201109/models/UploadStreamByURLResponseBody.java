// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadStreamByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadStreamByURLResponseBody</p>
 */
public class UploadStreamByURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceURL")
    private String sourceURL;

    private UploadStreamByURLResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
        this.sourceURL = builder.sourceURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadStreamByURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceURL
     */
    public String getSourceURL() {
        return this.sourceURL;
    }

    public static final class Builder {
        private String fileURL; 
        private String jobId; 
        private String mediaId; 
        private String requestId; 
        private String sourceURL; 

        /**
         * <p>The OSS URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The ID of the upload job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>411bed50018971edb60b0764a0ec6***</p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>89-C21D-4B78-AE24-3788B8</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL of the source file that is uploaded in the upload job.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/sample-stream.mp4">https://example.com/sample-stream.mp4</a></p>
         */
        public Builder sourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }

        public UploadStreamByURLResponseBody build() {
            return new UploadStreamByURLResponseBody(this);
        } 

    } 

}
