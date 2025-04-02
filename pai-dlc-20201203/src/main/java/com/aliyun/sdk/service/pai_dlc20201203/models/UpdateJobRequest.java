// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.accessibility = builder.accessibility;
        this.priority = builder.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRequest create() {
        return builder().build();
    }

@Override
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String jobId; 
        private String accessibility; 
        private Integer priority; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.accessibility = request.accessibility;
            this.priority = request.priority;
        } 

        /**
         * <p>The job ID. For more information about how to obtain the ID of a job, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc*************</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job visibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: The job is visible to all members in the workspace.</li>
         * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The job priority. Valid values: 1 to 9.</p>
         * <ul>
         * <li>1: the lowest priority.</li>
         * <li>9: the highest priority.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
        } 

    } 

}
