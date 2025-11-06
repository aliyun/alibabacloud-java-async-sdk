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
 * {@link ModifyStreamingPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyStreamingPropertyRequest</p>
 */
public class ModifyStreamingPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewContent")
    private String viewContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewSubscribers")
    private java.util.List<String> viewSubscribers;

    private ModifyStreamingPropertyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.taskId = builder.taskId;
        this.viewContent = builder.viewContent;
        this.viewSubscribers = builder.viewSubscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStreamingPropertyRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return viewContent
     */
    public String getViewContent() {
        return this.viewContent;
    }

    /**
     * @return viewSubscribers
     */
    public java.util.List<String> getViewSubscribers() {
        return this.viewSubscribers;
    }

    public static final class Builder extends Request.Builder<ModifyStreamingPropertyRequest, Builder> {
        private String appId; 
        private String channelId; 
        private String taskId; 
        private String viewContent; 
        private java.util.List<String> viewSubscribers; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStreamingPropertyRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.taskId = request.taskId;
            this.viewContent = request.viewContent;
            this.viewSubscribers = request.viewSubscribers;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * ViewContent.
         */
        public Builder viewContent(String viewContent) {
            this.putQueryParameter("ViewContent", viewContent);
            this.viewContent = viewContent;
            return this;
        }

        /**
         * <p>ViewSubscribers。</p>
         */
        public Builder viewSubscribers(java.util.List<String> viewSubscribers) {
            String viewSubscribersShrink = shrink(viewSubscribers, "ViewSubscribers", "simple");
            this.putQueryParameter("ViewSubscribers", viewSubscribersShrink);
            this.viewSubscribers = viewSubscribers;
            return this;
        }

        @Override
        public ModifyStreamingPropertyRequest build() {
            return new ModifyStreamingPropertyRequest(this);
        } 

    } 

}
