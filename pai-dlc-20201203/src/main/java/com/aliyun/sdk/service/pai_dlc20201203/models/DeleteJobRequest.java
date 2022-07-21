// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobRequest</p>
 */
public class DeleteJobRequest extends Request {
    @Path
    @NameInMap("JobId")
    private String jobId;

    private DeleteJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * 作业Id
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteJobRequest build() {
            return new DeleteJobRequest(this);
        } 

    } 

}
