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
 * {@link DeleteAvatarTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteAvatarTrainingJobRequest</p>
 */
public class DeleteAvatarTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private DeleteAvatarTrainingJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAvatarTrainingJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAvatarTrainingJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAvatarTrainingJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the digital human training job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteAvatarTrainingJobRequest build() {
            return new DeleteAvatarTrainingJobRequest(this);
        } 

    } 

}
