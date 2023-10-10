// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuePipelineRequest} extends {@link RequestModel}
 *
 * <p>ContinuePipelineRequest</p>
 */
public class ContinuePipelineRequest extends Request {
    @Query
    @NameInMap("Confirm")
    private Boolean confirm;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    private ContinuePipelineRequest(Builder builder) {
        super(builder);
        this.confirm = builder.confirm;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinuePipelineRequest create() {
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

    public static final class Builder extends Request.Builder<ContinuePipelineRequest, Builder> {
        private Boolean confirm; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(ContinuePipelineRequest request) {
            super(request);
            this.confirm = request.confirm;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * Specifies whether to release the next batch. Valid values:
         * <p>
         * 
         * *   true: releases the next batch.
         * *   false: does not release the next batch.
         */
        public Builder confirm(Boolean confirm) {
            this.putQueryParameter("Confirm", confirm);
            this.confirm = confirm;
            return this;
        }

        /**
         * The ID of the change process. You can call the GetChangeOrderInfo operation to query the ID of the change process that corresponds to a specific batch. For more information, see [GetChangeOrderInfo](~~62072~~).
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public ContinuePipelineRequest build() {
            return new ContinuePipelineRequest(this);
        } 

    } 

}
