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
            this.channelId = request.channelId;
            this.customAttribute = request.customAttribute;
            this.interruptable = request.interruptable;
            this.message = request.message;
            this.priority = request.priority;
            this.taskId = request.taskId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CustomAttribute.
         */
        public Builder customAttribute(String customAttribute) {
            this.putQueryParameter("CustomAttribute", customAttribute);
            this.customAttribute = customAttribute;
            return this;
        }

        /**
         * Interruptable.
         */
        public Builder interruptable(Boolean interruptable) {
            this.putQueryParameter("Interruptable", interruptable);
            this.interruptable = interruptable;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * TaskId.
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

}
