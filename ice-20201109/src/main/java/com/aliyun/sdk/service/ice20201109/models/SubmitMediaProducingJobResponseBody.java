// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SubmitMediaProducingJobResponseBody model) {
            this.jobId = model.jobId;
            this.mediaId = model.mediaId;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.vodMediaId = model.vodMediaId;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The media asset ID of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The ID of the editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>b4549d46c88681030f6e</strong></strong></p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The media asset ID of the output file in ApsaraVideo VOD if the output file is stored in ApsaraVideo VOD.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d8s4h75ci975745c14b</strong></strong></p>
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
