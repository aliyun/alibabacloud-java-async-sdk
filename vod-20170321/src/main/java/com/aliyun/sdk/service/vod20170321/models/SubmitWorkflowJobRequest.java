// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitWorkflowJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitWorkflowJobRequest</p>
 */
public class SubmitWorkflowJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInputs")
    private String extraInputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    private SubmitWorkflowJobRequest(Builder builder) {
        super(builder);
        this.extraInputs = builder.extraInputs;
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
     * @return extraInputs
     */
    public String getExtraInputs() {
        return this.extraInputs;
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
        private String extraInputs; 
        private String mediaId; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitWorkflowJobRequest request) {
            super(request);
            this.extraInputs = request.extraInputs;
            this.mediaId = request.mediaId;
            this.workflowId = request.workflowId;
        } 

        /**
         * ExtraInputs.
         */
        public Builder extraInputs(String extraInputs) {
            this.putQueryParameter("ExtraInputs", extraInputs);
            this.extraInputs = extraInputs;
            return this;
        }

        /**
         * <p>The media asset ID, which is the video ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Get the upload URL and credential for a video</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>058b39e75269da42b08f00459****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The workflow ID. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Workflow Management</strong> to view the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34d577eade633860bdf1237****</p>
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
