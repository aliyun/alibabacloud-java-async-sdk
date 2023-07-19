// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @Path
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("Priority")
    private Integer priority;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String jobId; 
        private Integer priority; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.priority = request.priority;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Priority.
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
