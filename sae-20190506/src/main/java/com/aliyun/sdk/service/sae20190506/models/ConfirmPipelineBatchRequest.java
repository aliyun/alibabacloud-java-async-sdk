// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmPipelineBatchRequest} extends {@link RequestModel}
 *
 * <p>ConfirmPipelineBatchRequest</p>
 */
public class ConfirmPipelineBatchRequest extends Request {
    @Query
    @NameInMap("Confirm")
    @Validation(required = true)
    private Boolean confirm;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    private ConfirmPipelineBatchRequest(Builder builder) {
        super(builder);
        this.confirm = builder.confirm;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmPipelineBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirm
     */
    public Boolean getConfirm() {
        return this.confirm;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<ConfirmPipelineBatchRequest, Builder> {
        private Boolean confirm; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmPipelineBatchRequest request) {
            super(request);
            this.confirm = request.confirm;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * Confirm.
         */
        public Builder confirm(Boolean confirm) {
            this.putQueryParameter("Confirm", confirm);
            this.confirm = confirm;
            return this;
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
        public ConfirmPipelineBatchRequest build() {
            return new ConfirmPipelineBatchRequest(this);
        } 

    } 

}
