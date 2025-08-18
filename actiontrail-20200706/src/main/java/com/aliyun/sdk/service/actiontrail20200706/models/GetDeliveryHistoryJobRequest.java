// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetDeliveryHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>GetDeliveryHistoryJobRequest</p>
 */
public class GetDeliveryHistoryJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    private GetDeliveryHistoryJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliveryHistoryJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetDeliveryHistoryJobRequest, Builder> {
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeliveryHistoryJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the historical event delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16602</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetDeliveryHistoryJobRequest build() {
            return new GetDeliveryHistoryJobRequest(this);
        } 

    } 

}
