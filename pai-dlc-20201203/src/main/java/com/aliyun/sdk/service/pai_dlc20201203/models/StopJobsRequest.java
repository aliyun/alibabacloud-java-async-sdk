// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopJobsRequest} extends {@link RequestModel}
 *
 * <p>StopJobsRequest</p>
 */
public class StopJobsRequest extends Request {
    @Body
    @NameInMap("JobIds")
    @Validation(required = true)
    private java.util.List < String > jobIds;

    private StopJobsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIds
     */
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<StopJobsRequest, Builder> {
        private java.util.List < String > jobIds; 

        private Builder() {
            super();
        } 

        private Builder(StopJobsRequest request) {
            super(request);
            this.jobIds = request.jobIds;
        } 

        /**
         * 作业ID列表
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putBodyParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public StopJobsRequest build() {
            return new StopJobsRequest(this);
        } 

    } 

}
