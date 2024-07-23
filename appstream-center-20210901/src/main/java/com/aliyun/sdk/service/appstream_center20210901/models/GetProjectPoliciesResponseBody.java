// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectPoliciesResponseBody</p>
 */
public class GetProjectPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetProjectPoliciesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetProjectPoliciesResponseBody build() {
            return new GetProjectPoliciesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private Integer clipboard;

        @com.aliyun.core.annotation.NameInMap("FileTransfer")
        private Integer fileTransfer;

        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private String frameRate;

        @com.aliyun.core.annotation.NameInMap("KeepAliveDuration")
        private Integer keepAliveDuration;

        @com.aliyun.core.annotation.NameInMap("MaxHours")
        private Integer maxHours;

        @com.aliyun.core.annotation.NameInMap("MaxSessions")
        private Integer maxSessions;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
        private Integer sessionResolutionHeight;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
        private Integer sessionResolutionWidth;

        @com.aliyun.core.annotation.NameInMap("SessionSpec")
        private String sessionSpec;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TerminalResolutionAdaptation")
        private Boolean terminalResolutionAdaptation;

        private Data(Builder builder) {
            this.clipboard = builder.clipboard;
            this.fileTransfer = builder.fileTransfer;
            this.frameRate = builder.frameRate;
            this.keepAliveDuration = builder.keepAliveDuration;
            this.maxHours = builder.maxHours;
            this.maxSessions = builder.maxSessions;
            this.projectId = builder.projectId;
            this.sessionResolutionHeight = builder.sessionResolutionHeight;
            this.sessionResolutionWidth = builder.sessionResolutionWidth;
            this.sessionSpec = builder.sessionSpec;
            this.streamingMode = builder.streamingMode;
            this.terminalResolutionAdaptation = builder.terminalResolutionAdaptation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
        public String getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return keepAliveDuration
         */
        public Integer getKeepAliveDuration() {
            return this.keepAliveDuration;
        }

        /**
         * @return maxHours
         */
        public Integer getMaxHours() {
            return this.maxHours;
        }

        /**
         * @return maxSessions
         */
        public Integer getMaxSessions() {
            return this.maxSessions;
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

        public static final class Builder {
            private Integer clipboard; 
            private Integer fileTransfer; 
            private String frameRate; 
            private Integer keepAliveDuration; 
            private Integer maxHours; 
            private Integer maxSessions; 
            private String projectId; 
            private Integer sessionResolutionHeight; 
            private Integer sessionResolutionWidth; 
            private String sessionSpec; 
            private String streamingMode; 
            private Boolean terminalResolutionAdaptation; 

            /**
             * Clipboard.
             */
            public Builder clipboard(Integer clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * FileTransfer.
             */
            public Builder fileTransfer(Integer fileTransfer) {
                this.fileTransfer = fileTransfer;
                return this;
            }

            /**
             * FrameRate.
             */
            public Builder frameRate(String frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * KeepAliveDuration.
             */
            public Builder keepAliveDuration(Integer keepAliveDuration) {
                this.keepAliveDuration = keepAliveDuration;
                return this;
            }

            /**
             * MaxHours.
             */
            public Builder maxHours(Integer maxHours) {
                this.maxHours = maxHours;
                return this;
            }

            /**
             * MaxSessions.
             */
            public Builder maxSessions(Integer maxSessions) {
                this.maxSessions = maxSessions;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SessionResolutionHeight.
             */
            public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
                this.sessionResolutionHeight = sessionResolutionHeight;
                return this;
            }

            /**
             * SessionResolutionWidth.
             */
            public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
                this.sessionResolutionWidth = sessionResolutionWidth;
                return this;
            }

            /**
             * SessionSpec.
             */
            public Builder sessionSpec(String sessionSpec) {
                this.sessionSpec = sessionSpec;
                return this;
            }

            /**
             * StreamingMode.
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * TerminalResolutionAdaptation.
             */
            public Builder terminalResolutionAdaptation(Boolean terminalResolutionAdaptation) {
                this.terminalResolutionAdaptation = terminalResolutionAdaptation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
