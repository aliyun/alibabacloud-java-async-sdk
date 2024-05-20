// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePipelineRequest} extends {@link RequestModel}
 *
 * <p>DescribePipelineRequest</p>
 */
public class DescribePipelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    private DescribePipelineRequest(Builder builder) {
        super(builder);
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePipelineRequest, Builder> {
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePipelineRequest request) {
            super(request);
            this.pipelineId = request.pipelineId;
        } 

        /**
         * The ID of the batch. You can call the [DescribeChangeOrder](~~126617~~) operation to obtain the ID.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public DescribePipelineRequest build() {
            return new DescribePipelineRequest(this);
        } 

    } 

}
