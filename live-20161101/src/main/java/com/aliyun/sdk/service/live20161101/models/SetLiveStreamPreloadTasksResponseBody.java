// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SetLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
 *
 * <p>SetLiveStreamPreloadTasksResponseBody</p>
 */
public class SetLiveStreamPreloadTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedURL")
    private Integer failedURL;

    @com.aliyun.core.annotation.NameInMap("PreloadTasksMessages")
    private PreloadTasksMessages preloadTasksMessages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SuccessURL")
    private Integer successURL;

    @com.aliyun.core.annotation.NameInMap("TotalURL")
    private Integer totalURL;

    private SetLiveStreamPreloadTasksResponseBody(Builder builder) {
        this.failedURL = builder.failedURL;
        this.preloadTasksMessages = builder.preloadTasksMessages;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successURL = builder.successURL;
        this.totalURL = builder.totalURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamPreloadTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedURL
     */
    public Integer getFailedURL() {
        return this.failedURL;
    }

    /**
     * @return preloadTasksMessages
     */
    public PreloadTasksMessages getPreloadTasksMessages() {
        return this.preloadTasksMessages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successURL
     */
    public Integer getSuccessURL() {
        return this.successURL;
    }

    /**
     * @return totalURL
     */
    public Integer getTotalURL() {
        return this.totalURL;
    }

    public static final class Builder {
        private Integer failedURL; 
        private PreloadTasksMessages preloadTasksMessages; 
        private String requestId; 
        private String status; 
        private Integer successURL; 
        private Integer totalURL; 

        private Builder() {
        } 

        private Builder(SetLiveStreamPreloadTasksResponseBody model) {
            this.failedURL = model.failedURL;
            this.preloadTasksMessages = model.preloadTasksMessages;
            this.requestId = model.requestId;
            this.status = model.status;
            this.successURL = model.successURL;
            this.totalURL = model.totalURL;
        } 

        /**
         * <p>The number of URLs for which the prefetch task configuration failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedURL(Integer failedURL) {
            this.failedURL = failedURL;
            return this;
        }

        /**
         * <p>The details of the prefetch task.</p>
         */
        public Builder preloadTasksMessages(PreloadTasksMessages preloadTasksMessages) {
            this.preloadTasksMessages = preloadTasksMessages;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36E0E523-E0C6-5D95-A465-A8EA2DCBA2A5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the prefetch task. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * <blockquote>
         * <p> Success is returned only if the prefetch task is configured for all specified streaming URLs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of URLs for which the prefetch task is successfully configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successURL(Integer successURL) {
            this.successURL = successURL;
            return this;
        }

        /**
         * <p>The total number of URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalURL(Integer totalURL) {
            this.totalURL = totalURL;
            return this;
        }

        public SetLiveStreamPreloadTasksResponseBody build() {
            return new SetLiveStreamPreloadTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>SetLiveStreamPreloadTasksResponseBody</p>
     */
    public static class PreloadTasksMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PlayUrl")
        private String playUrl;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private PreloadTasksMessage(Builder builder) {
            this.description = builder.description;
            this.playUrl = builder.playUrl;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreloadTasksMessage create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return playUrl
         */
        public String getPlayUrl() {
            return this.playUrl;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String description; 
            private String playUrl; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(PreloadTasksMessage model) {
                this.description = model.description;
                this.playUrl = model.playUrl;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Indicates whether the prefetch task is successful. Valid values:</p>
             * <ul>
             * <li>Successfully</li>
             * <li>InternalError</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successfully</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The streaming URL.</p>
             */
            public Builder playUrl(String playUrl) {
                this.playUrl = playUrl;
                return this;
            }

            /**
             * <p>The ID of the prefetch task.</p>
             * 
             * <strong>example:</strong>
             * <p>yourTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public PreloadTasksMessage build() {
                return new PreloadTasksMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>SetLiveStreamPreloadTasksResponseBody</p>
     */
    public static class PreloadTasksMessages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreloadTasksMessage")
        private java.util.List<PreloadTasksMessage> preloadTasksMessage;

        private PreloadTasksMessages(Builder builder) {
            this.preloadTasksMessage = builder.preloadTasksMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreloadTasksMessages create() {
            return builder().build();
        }

        /**
         * @return preloadTasksMessage
         */
        public java.util.List<PreloadTasksMessage> getPreloadTasksMessage() {
            return this.preloadTasksMessage;
        }

        public static final class Builder {
            private java.util.List<PreloadTasksMessage> preloadTasksMessage; 

            private Builder() {
            } 

            private Builder(PreloadTasksMessages model) {
                this.preloadTasksMessage = model.preloadTasksMessage;
            } 

            /**
             * PreloadTasksMessage.
             */
            public Builder preloadTasksMessage(java.util.List<PreloadTasksMessage> preloadTasksMessage) {
                this.preloadTasksMessage = preloadTasksMessage;
                return this;
            }

            public PreloadTasksMessages build() {
                return new PreloadTasksMessages(this);
            } 

        } 

    }
}
