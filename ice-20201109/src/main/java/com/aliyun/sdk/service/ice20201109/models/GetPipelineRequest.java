// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineRequest</p>
 */
public class GetPipelineRequest extends Request {
    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    private GetPipelineRequest(Builder builder) {
        super(builder);
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<GetPipelineRequest, Builder> {
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineRequest request) {
            super(request);
            this.pipelineId = request.pipelineId;
        } 

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public GetPipelineRequest build() {
            return new GetPipelineRequest(this);
        } 

    } 

}
