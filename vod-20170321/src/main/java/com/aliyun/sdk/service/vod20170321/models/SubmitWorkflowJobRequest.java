// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitWorkflowJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitWorkflowJobRequest</p>
 */
public class SubmitWorkflowJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the media file. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of the VideoId parameter when you call the [CreateUploadVideo](~~55407~~) operation to upload media files.
         * *   Obtain the value of the VideoId parameter when you call the [SearchMedia](~~86044~~) operation after you upload media files.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
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
