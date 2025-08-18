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
 * {@link DeleteDeliveryHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeliveryHistoryJobRequest</p>
 */
public class DeleteDeliveryHistoryJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer jobId;

    private DeleteDeliveryHistoryJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeliveryHistoryJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Integer getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DeleteDeliveryHistoryJobRequest, Builder> {
        private Integer jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeliveryHistoryJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the historical event delivery task to be deleted.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188101.html">ListDeliveryHistoryJobs</a> operation to query task IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16602</p>
         */
        public Builder jobId(Integer jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteDeliveryHistoryJobRequest build() {
            return new DeleteDeliveryHistoryJobRequest(this);
        } 

    } 

}
