// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProjectPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyProjectPolicyRequest</p>
 */
public class ModifyProjectPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private Integer clipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransfer")
    private Integer fileTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrameRate")
    private Integer frameRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAliveDuration")
    @com.aliyun.core.annotation.Validation(maximum = 300)
    private Integer keepAliveDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
    @com.aliyun.core.annotation.Validation(maximum = 4096, minimum = 500)
    private Integer sessionResolutionHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
    @com.aliyun.core.annotation.Validation(maximum = 4096, minimum = 500)
    private Integer sessionResolutionWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamingMode")
    private String streamingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalResolutionAdaptation")
    private Boolean terminalResolutionAdaptation;

    private ModifyProjectPolicyRequest(Builder builder) {
        super(builder);
        this.clipboard = builder.clipboard;
        this.fileTransfer = builder.fileTransfer;
        this.frameRate = builder.frameRate;
        this.keepAliveDuration = builder.keepAliveDuration;
        this.projectId = builder.projectId;
        this.sessionResolutionHeight = builder.sessionResolutionHeight;
        this.sessionResolutionWidth = builder.sessionResolutionWidth;
        this.streamingMode = builder.streamingMode;
        this.terminalResolutionAdaptation = builder.terminalResolutionAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProjectPolicyRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<ModifyProjectPolicyRequest, Builder> {
        private Integer clipboard; 
        private Integer fileTransfer; 
        private Integer frameRate; 
        private Integer keepAliveDuration; 
        private String projectId; 
        private Integer sessionResolutionHeight; 
        private Integer sessionResolutionWidth; 
        private String streamingMode; 
        private Boolean terminalResolutionAdaptation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProjectPolicyRequest request) {
            super(request);
            this.clipboard = request.clipboard;
            this.fileTransfer = request.fileTransfer;
            this.frameRate = request.frameRate;
            this.keepAliveDuration = request.keepAliveDuration;
            this.projectId = request.projectId;
            this.sessionResolutionHeight = request.sessionResolutionHeight;
            this.sessionResolutionWidth = request.sessionResolutionWidth;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public ModifyProjectPolicyRequest build() {
            return new ModifyProjectPolicyRequest(this);
        } 

    } 

}
