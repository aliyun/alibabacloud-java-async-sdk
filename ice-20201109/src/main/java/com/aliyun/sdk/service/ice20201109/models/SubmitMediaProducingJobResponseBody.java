// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaProducingJobResponseBody</p>
 */
public class SubmitMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VodMediaId")
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
