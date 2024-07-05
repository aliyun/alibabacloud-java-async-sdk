// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIMediaAuditJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAIMediaAuditJobResponseBody</p>
 */
public class SubmitAIMediaAuditJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitAIMediaAuditJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIMediaAuditJobResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String jobId; 
        private String mediaId; 
        private String requestId; 

        /**
         * The ID of the job.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the media file.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAIMediaAuditJobResponseBody build() {
            return new SubmitAIMediaAuditJobResponseBody(this);
        } 

    } 

}
