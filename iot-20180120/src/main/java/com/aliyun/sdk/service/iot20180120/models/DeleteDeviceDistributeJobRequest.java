// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeleteDeviceDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceDistributeJobRequest</p>
 */
public class DeleteDeviceDistributeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private DeleteDeviceDistributeJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceDistributeJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDeviceDistributeJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceDistributeJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the distribution task. The ID globally identifies the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UbmsMHmkqv0PiAG****010001</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteDeviceDistributeJobRequest build() {
            return new DeleteDeviceDistributeJobRequest(this);
        } 

    } 

}
