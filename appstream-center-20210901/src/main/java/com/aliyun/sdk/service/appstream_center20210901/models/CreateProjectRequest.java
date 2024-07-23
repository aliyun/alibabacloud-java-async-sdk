// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private Integer clipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudEnvId")
    private String cloudEnvId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentId")
    private String contentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransfer")
    private Integer fileTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrameRate")
    private Integer frameRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAliveDuration")
    private Integer keepAliveDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
    private Integer sessionResolutionHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
    private Integer sessionResolutionWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionSpec")
    private String sessionSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamingMode")
    private String streamingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalResolutionAdaptation")
    private Boolean terminalResolutionAdaptation;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.clipboard = builder.clipboard;
        this.cloudEnvId = builder.cloudEnvId;
        this.contentId = builder.contentId;
        this.description = builder.description;
        this.fileTransfer = builder.fileTransfer;
        this.frameRate = builder.frameRate;
        this.keepAliveDuration = builder.keepAliveDuration;
        this.projectName = builder.projectName;
        this.sessionResolutionHeight = builder.sessionResolutionHeight;
        this.sessionResolutionWidth = builder.sessionResolutionWidth;
        this.sessionSpec = builder.sessionSpec;
        this.streamingMode = builder.streamingMode;
        this.terminalResolutionAdaptation = builder.terminalResolutionAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clipboard
     */
    public Integer getClipboard() {
        return this.clipboard;
    }

    /**
     * @return cloudEnvId
     */
    public String getCloudEnvId() {
        return this.cloudEnvId;
    }

    /**
     * @return contentId
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileTransfer
     */
    public Integer getFileTransfer() {
        return this.fileTransfer;
    }

    /**
     * @return frameRate
     */
    public Integer getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return keepAliveDuration
     */
    public Integer getKeepAliveDuration() {
        return this.keepAliveDuration;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sessionResolutionHeight
     */
    public Integer getSessionResolutionHeight() {
        return this.sessionResolutionHeight;
    }

    /**
     * @return sessionResolutionWidth
     */
    public Integer getSessionResolutionWidth() {
        return this.sessionResolutionWidth;
    }

    /**
     * @return sessionSpec
     */
    public String getSessionSpec() {
        return this.sessionSpec;
    }

    /**
     * @return streamingMode
     */
    public String getStreamingMode() {
        return this.streamingMode;
    }

    /**
     * @return terminalResolutionAdaptation
     */
    public Boolean getTerminalResolutionAdaptation() {
        return this.terminalResolutionAdaptation;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private Integer clipboard; 
        private String cloudEnvId; 
        private String contentId; 
        private String description; 
        private Integer fileTransfer; 
        private Integer frameRate; 
        private Integer keepAliveDuration; 
        private String projectName; 
        private Integer sessionResolutionHeight; 
        private Integer sessionResolutionWidth; 
        private String sessionSpec; 
        private String streamingMode; 
        private Boolean terminalResolutionAdaptation; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.clipboard = request.clipboard;
            this.cloudEnvId = request.cloudEnvId;
            this.contentId = request.contentId;
            this.description = request.description;
            this.fileTransfer = request.fileTransfer;
            this.frameRate = request.frameRate;
            this.keepAliveDuration = request.keepAliveDuration;
            this.projectName = request.projectName;
            this.sessionResolutionHeight = request.sessionResolutionHeight;
            this.sessionResolutionWidth = request.sessionResolutionWidth;
            this.sessionSpec = request.sessionSpec;
            this.streamingMode = request.streamingMode;
            this.terminalResolutionAdaptation = request.terminalResolutionAdaptation;
        } 

        /**
         * Clipboard.
         */
        public Builder clipboard(Integer clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * CloudEnvId.
         */
        public Builder cloudEnvId(String cloudEnvId) {
            this.putQueryParameter("CloudEnvId", cloudEnvId);
            this.cloudEnvId = cloudEnvId;
            return this;
        }

        /**
         * ContentId.
         */
        public Builder contentId(String contentId) {
            this.putQueryParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileTransfer.
         */
        public Builder fileTransfer(Integer fileTransfer) {
            this.putQueryParameter("FileTransfer", fileTransfer);
            this.fileTransfer = fileTransfer;
            return this;
        }

        /**
         * FrameRate.
         */
        public Builder frameRate(Integer frameRate) {
            this.putQueryParameter("FrameRate", frameRate);
            this.frameRate = frameRate;
            return this;
        }

        /**
         * KeepAliveDuration.
         */
        public Builder keepAliveDuration(Integer keepAliveDuration) {
            this.putQueryParameter("KeepAliveDuration", keepAliveDuration);
            this.keepAliveDuration = keepAliveDuration;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SessionResolutionHeight.
         */
        public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
            this.putQueryParameter("SessionResolutionHeight", sessionResolutionHeight);
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }

        /**
         * SessionResolutionWidth.
         */
        public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
            this.putQueryParameter("SessionResolutionWidth", sessionResolutionWidth);
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }

        /**
         * SessionSpec.
         */
        public Builder sessionSpec(String sessionSpec) {
            this.putQueryParameter("SessionSpec", sessionSpec);
            this.sessionSpec = sessionSpec;
            return this;
        }

        /**
         * StreamingMode.
         */
        public Builder streamingMode(String streamingMode) {
            this.putQueryParameter("StreamingMode", streamingMode);
            this.streamingMode = streamingMode;
            return this;
        }

        /**
         * TerminalResolutionAdaptation.
         */
        public Builder terminalResolutionAdaptation(Boolean terminalResolutionAdaptation) {
            this.putQueryParameter("TerminalResolutionAdaptation", terminalResolutionAdaptation);
            this.terminalResolutionAdaptation = terminalResolutionAdaptation;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
