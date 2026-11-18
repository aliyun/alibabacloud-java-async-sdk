// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitVideoCharacterReplaceJobResponseBody</p>
 */
public class SubmitVideoCharacterReplaceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitVideoCharacterReplaceJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoCharacterReplaceJobResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitVideoCharacterReplaceJobResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The job ID returned by SubmitVideoCharacterReplaceJob.</p>
         * 
         * <strong>example:</strong>
         * <p>ag_83baeea38b534ee1937b8a4acd08****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitVideoCharacterReplaceJobResponseBody build() {
            return new SubmitVideoCharacterReplaceJobResponseBody(this);
        } 

    } 

}
