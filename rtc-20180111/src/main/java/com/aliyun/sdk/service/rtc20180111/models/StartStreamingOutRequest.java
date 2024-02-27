// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartStreamingOutRequest} extends {@link RequestModel}
 *
 * <p>StartStreamingOutRequest</p>
 */
public class StartStreamingOutRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("Panes")
    private java.util.List < Panes> panes;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("Url")
    private String url;

    private StartStreamingOutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.panes = builder.panes;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartStreamingOutRequest create() {
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
     * @return panes
     */
    public java.util.List < Panes> getPanes() {
        return this.panes;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<StartStreamingOutRequest, Builder> {
        private String appId; 
        private String channelId; 
        private java.util.List < Panes> panes; 
        private String taskId; 
        private String templateId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(StartStreamingOutRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.panes = request.panes;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.url = request.url;
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
         * Panes.
         */
        public Builder panes(java.util.List < Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
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

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public StartStreamingOutRequest build() {
            return new StartStreamingOutRequest(this);
        } 

    } 

    public static class Panes extends TeaModel {
        @NameInMap("PaneId")
        @Validation(required = true)
        private String paneId;

        @NameInMap("Source")
        @Validation(required = true)
        private String source;

        @NameInMap("SourceType")
        private String sourceType;

        private Panes(Builder builder) {
            this.paneId = builder.paneId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return paneId
         */
        public String getPaneId() {
            return this.paneId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String paneId; 
            private String source; 
            private String sourceType; 

            /**
             * PaneId.
             */
            public Builder paneId(String paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
}
