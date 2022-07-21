// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobsRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobsRequest</p>
 */
public class DeleteJobsRequest extends Request {
    @Body
    @NameInMap("JobIds")
    @Validation(required = true)
    private java.util.List < String > jobIds;

    private DeleteJobsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteJobsRequest, Builder> {
        private java.util.List < String > jobIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobsRequest request) {
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
        public DeleteJobsRequest build() {
            return new DeleteJobsRequest(this);
        } 

    } 

}
