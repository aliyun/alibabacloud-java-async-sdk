// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveVideoSummaryTaskVideoRequest} extends {@link RequestModel}
 *
 * <p>SaveVideoSummaryTaskVideoRequest</p>
 */
public class SaveVideoSummaryTaskVideoRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("SaveVideo")
    @Validation(required = true)
    private Boolean saveVideo;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true, minimum = 1)
    private Long taskId;

    private SaveVideoSummaryTaskVideoRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.saveVideo = builder.saveVideo;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveVideoSummaryTaskVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return saveVideo
     */
    public Boolean getSaveVideo() {
        return this.saveVideo;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SaveVideoSummaryTaskVideoRequest, Builder> {
        private String corpId; 
        private Boolean saveVideo; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(SaveVideoSummaryTaskVideoRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.saveVideo = response.saveVideo;
            this.taskId = response.taskId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * SaveVideo.
         */
        public Builder saveVideo(Boolean saveVideo) {
            this.putBodyParameter("SaveVideo", saveVideo);
            this.saveVideo = saveVideo;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SaveVideoSummaryTaskVideoRequest build() {
            return new SaveVideoSummaryTaskVideoRequest(this);
        } 

    } 

}
