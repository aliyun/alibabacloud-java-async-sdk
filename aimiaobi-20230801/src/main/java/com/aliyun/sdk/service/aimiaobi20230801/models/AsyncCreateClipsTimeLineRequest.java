// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncCreateClipsTimeLineRequest} extends {@link RequestModel}
 *
 * <p>AsyncCreateClipsTimeLineRequest</p>
 */
public class AsyncCreateClipsTimeLineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdditionalContent")
    private String additionalContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomContent")
    private String customContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoRefVideo")
    private Boolean noRefVideo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessPrompt")
    private String processPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncCreateClipsTimeLineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.additionalContent = builder.additionalContent;
        this.customContent = builder.customContent;
        this.noRefVideo = builder.noRefVideo;
        this.processPrompt = builder.processPrompt;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncCreateClipsTimeLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return additionalContent
     */
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return noRefVideo
     */
    public Boolean getNoRefVideo() {
        return this.noRefVideo;
    }

    /**
     * @return processPrompt
     */
    public String getProcessPrompt() {
        return this.processPrompt;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncCreateClipsTimeLineRequest, Builder> {
        private String regionId; 
        private String additionalContent; 
        private String customContent; 
        private Boolean noRefVideo; 
        private String processPrompt; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncCreateClipsTimeLineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.additionalContent = request.additionalContent;
            this.customContent = request.customContent;
            this.noRefVideo = request.noRefVideo;
            this.processPrompt = request.processPrompt;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AdditionalContent.
         */
        public Builder additionalContent(String additionalContent) {
            this.putBodyParameter("AdditionalContent", additionalContent);
            this.additionalContent = additionalContent;
            return this;
        }

        /**
         * CustomContent.
         */
        public Builder customContent(String customContent) {
            this.putBodyParameter("CustomContent", customContent);
            this.customContent = customContent;
            return this;
        }

        /**
         * NoRefVideo.
         */
        public Builder noRefVideo(Boolean noRefVideo) {
            this.putBodyParameter("NoRefVideo", noRefVideo);
            this.noRefVideo = noRefVideo;
            return this;
        }

        /**
         * ProcessPrompt.
         */
        public Builder processPrompt(String processPrompt) {
            this.putBodyParameter("ProcessPrompt", processPrompt);
            this.processPrompt = processPrompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncCreateClipsTimeLineRequest build() {
            return new AsyncCreateClipsTimeLineRequest(this);
        } 

    } 

}
