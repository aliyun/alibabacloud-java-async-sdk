// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTasksRequest} extends {@link RequestModel}
 *
 * <p>GetTasksRequest</p>
 */
public class GetTasksRequest extends Request {
    @Query
    @NameInMap("Status")
    private String status;

    private GetTasksRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetTasksRequest, Builder> {
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetTasksRequest request) {
            super(request);
            this.status = request.status;
        } 

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetTasksRequest build() {
            return new GetTasksRequest(this);
        } 

    } 

}
