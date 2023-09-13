// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadStreamByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadStreamByURLResponseBody</p>
 */
public class UploadStreamByURLResponseBody extends TeaModel {
    @NameInMap("FileURL")
    private String fileURL;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceURL")
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
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceURL.
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
