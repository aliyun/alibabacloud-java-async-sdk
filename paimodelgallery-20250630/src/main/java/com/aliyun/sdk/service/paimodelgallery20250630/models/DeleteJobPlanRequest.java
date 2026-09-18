// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link DeleteJobPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobPlanRequest</p>
 */
public class DeleteJobPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobPlanId")
    private String jobPlanId;

    private DeleteJobPlanRequest(Builder builder) {
        super(builder);
        this.jobPlanId = builder.jobPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobPlanId
     */
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    public static final class Builder extends Request.Builder<DeleteJobPlanRequest, Builder> {
        private String jobPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobPlanRequest request) {
            super(request);
            this.jobPlanId = request.jobPlanId;
        } 

        /**
         * <p>The task plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jp-xxxxxx</p>
         */
        public Builder jobPlanId(String jobPlanId) {
            this.putPathParameter("JobPlanId", jobPlanId);
            this.jobPlanId = jobPlanId;
            return this;
        }

        @Override
        public DeleteJobPlanRequest build() {
            return new DeleteJobPlanRequest(this);
        } 

    } 

}
