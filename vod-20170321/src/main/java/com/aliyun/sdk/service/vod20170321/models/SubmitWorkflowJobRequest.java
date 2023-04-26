// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitWorkflowJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitWorkflowJobRequest</p>
 */
public class SubmitWorkflowJobRequest extends Request {
    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("WorkflowId")
    @Validation(required = true)
    private String workflowId;

    private SubmitWorkflowJobRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitWorkflowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<SubmitWorkflowJobRequest, Builder> {
        private String mediaId; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitWorkflowJobRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.workflowId = request.workflowId;
        } 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public SubmitWorkflowJobRequest build() {
            return new SubmitWorkflowJobRequest(this);
        } 

    } 

}
