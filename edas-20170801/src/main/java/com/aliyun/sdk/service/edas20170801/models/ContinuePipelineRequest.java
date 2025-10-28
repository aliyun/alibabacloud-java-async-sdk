// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ContinuePipelineRequest} extends {@link RequestModel}
 *
 * <p>ContinuePipelineRequest</p>
 */
public class ContinuePipelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Confirm")
    private Boolean confirm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to release the next batch. Valid values:</p>
         * <ul>
         * <li>true: releases the next batch.</li>
         * <li>false: does not release the next batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder confirm(Boolean confirm) {
            this.putQueryParameter("Confirm", confirm);
            this.confirm = confirm;
            return this;
        }

        /**
         * <p>The ID of the change process. You can call the GetChangeOrderInfo operation to query the ID of the change process that corresponds to a specific batch. For more information, see <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5648dbd7-df13********************</p>
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
