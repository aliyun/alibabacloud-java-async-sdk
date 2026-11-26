// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link NotifyAgentRequest} extends {@link RequestModel}
 *
 * <p>NotifyAgentRequest</p>
 */
public class NotifyAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundMusic")
    private BackgroundMusic backgroundMusic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAttribute")
    private String customAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interruptable")
    private Boolean interruptable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private NotifyAgentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgroundMusic = builder.backgroundMusic;
        this.channelId = builder.channelId;
        this.customAttribute = builder.customAttribute;
        this.interruptable = builder.interruptable;
        this.message = builder.message;
        this.priority = builder.priority;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return backgroundMusic
     */
    public BackgroundMusic getBackgroundMusic() {
        return this.backgroundMusic;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return customAttribute
     */
    public String getCustomAttribute() {
        return this.customAttribute;
    }

    /**
     * @return interruptable
     */
    public Boolean getInterruptable() {
        return this.interruptable;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<NotifyAgentRequest, Builder> {
        private String appId; 
        private BackgroundMusic backgroundMusic; 
        private String channelId; 
        private String customAttribute; 
        private Boolean interruptable; 
        private String message; 
        private Integer priority; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(NotifyAgentRequest request) {
            super(request);
            this.appId = request.appId;
            this.backgroundMusic = request.backgroundMusic;
            this.channelId = request.channelId;
            this.customAttribute = request.customAttribute;
            this.interruptable = request.interruptable;
            this.message = request.message;
            this.priority = request.priority;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The application ID. Create and query it in the console. Only a single ID is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>aec****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Background audio.</p>
         */
        public Builder backgroundMusic(BackgroundMusic backgroundMusic) {
            String backgroundMusicShrink = shrink(backgroundMusic, "BackgroundMusic", "json");
            this.putQueryParameter("BackgroundMusic", backgroundMusicShrink);
            this.backgroundMusic = backgroundMusic;
            return this;
        }

        /**
         * <p>The channel to join. Only a single ID is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>Custom parameters passed through to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;color&quot;:&quot;blue&quot;}</p>
         */
        public Builder customAttribute(String customAttribute) {
            this.putQueryParameter("CustomAttribute", customAttribute);
            this.customAttribute = customAttribute;
            return this;
        }

        /**
         * <p>Indicates whether the announcement can be interrupted. If false, the message cannot be interrupted by voice input, key presses, or other methods.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder interruptable(Boolean interruptable) {
            this.putQueryParameter("Interruptable", interruptable);
            this.interruptable = interruptable;
            return this;
        }

        /**
         * <p>The text content to announce.</p>
         * 
         * <strong>example:</strong>
         * <p>您好，现在是2025年4月16日，请问需要什么帮助</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The priority level for inserting the announcement:
         * 1 — Interrupt the current interaction and announce immediately.
         * 2 — Announce after the current interaction ends.
         * 3 — Announce only if no interaction is active.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public NotifyAgentRequest build() {
            return new NotifyAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link NotifyAgentRequest} extends {@link TeaModel}
     *
     * <p>NotifyAgentRequest</p>
     */
    public static class BackgroundMusic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("url")
        @com.aliyun.core.annotation.Validation(maxLength = 1000)
        private String url;

        private BackgroundMusic(Builder builder) {
            this.format = builder.format;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundMusic create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String format; 
            private String url; 

            private Builder() {
            } 

            private Builder(BackgroundMusic model) {
                this.format = model.format;
                this.url = model.url;
            } 

            /**
             * <p>The audio format.</p>
             * <ul>
             * <li>wav</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>wav</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The resource URL.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public BackgroundMusic build() {
                return new BackgroundMusic(this);
            } 

        } 

    }
}
