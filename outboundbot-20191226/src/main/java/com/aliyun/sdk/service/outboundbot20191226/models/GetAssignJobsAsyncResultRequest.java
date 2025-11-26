// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAssignJobsAsyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetAssignJobsAsyncResultRequest</p>
 */
public class GetAssignJobsAsyncResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String asyncTaskId;

    private GetAssignJobsAsyncResultRequest(Builder builder) {
        super(builder);
        this.asyncTaskId = builder.asyncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssignJobsAsyncResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public static final class Builder extends Request.Builder<GetAssignJobsAsyncResultRequest, Builder> {
        private String asyncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAssignJobsAsyncResultRequest request) {
            super(request);
            this.asyncTaskId = request.asyncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc79b0f9-a781-4305-85e2-d5d56679ae69</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.putQueryParameter("AsyncTaskId", asyncTaskId);
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        @Override
        public GetAssignJobsAsyncResultRequest build() {
            return new GetAssignJobsAsyncResultRequest(this);
        } 

    } 

}
