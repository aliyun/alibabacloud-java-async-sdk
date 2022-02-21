// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeliveryHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeliveryHistoryJobRequest</p>
 */
public class DeleteDeliveryHistoryJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true, maximum = 2147483647)
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

        private Builder(DeleteDeliveryHistoryJobRequest response) {
            super(response);
            this.jobId = response.jobId;
        } 

        /**
         * JobId.
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
