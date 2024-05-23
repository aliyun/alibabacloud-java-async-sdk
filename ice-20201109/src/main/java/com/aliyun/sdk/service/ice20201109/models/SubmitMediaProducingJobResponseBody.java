// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaProducingJobResponseBody</p>
 */
public class SubmitMediaProducingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VodMediaId")
    private String vodMediaId;

    private SubmitMediaProducingJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.vodMediaId = builder.vodMediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaProducingJobResponseBody create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodMediaId
     */
    public String getVodMediaId() {
        return this.vodMediaId;
    }

    public static final class Builder {
        private String jobId; 
        private String mediaId; 
        private String projectId; 
        private String requestId; 
        private String vodMediaId; 

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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
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
         * VodMediaId.
         */
        public Builder vodMediaId(String vodMediaId) {
            this.vodMediaId = vodMediaId;
            return this;
        }

        public SubmitMediaProducingJobResponseBody build() {
            return new SubmitMediaProducingJobResponseBody(this);
        } 

    } 

}
