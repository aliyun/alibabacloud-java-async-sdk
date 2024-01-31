// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppStreamingOutTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppStreamingOutTemplateRequest</p>
 */
public class DeleteAppStreamingOutTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("StreamingOutTemplate")
    @Validation(required = true)
    private StreamingOutTemplate streamingOutTemplate;

    private DeleteAppStreamingOutTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.streamingOutTemplate = builder.streamingOutTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppStreamingOutTemplateRequest create() {
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
     * @return streamingOutTemplate
     */
    public StreamingOutTemplate getStreamingOutTemplate() {
        return this.streamingOutTemplate;
    }

    public static final class Builder extends Request.Builder<DeleteAppStreamingOutTemplateRequest, Builder> {
        private String appId; 
        private StreamingOutTemplate streamingOutTemplate; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppStreamingOutTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.streamingOutTemplate = request.streamingOutTemplate;
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
         * StreamingOutTemplate.
         */
        public Builder streamingOutTemplate(StreamingOutTemplate streamingOutTemplate) {
            String streamingOutTemplateShrink = shrink(streamingOutTemplate, "StreamingOutTemplate", "json");
            this.putQueryParameter("StreamingOutTemplate", streamingOutTemplateShrink);
            this.streamingOutTemplate = streamingOutTemplate;
            return this;
        }

        @Override
        public DeleteAppStreamingOutTemplateRequest build() {
            return new DeleteAppStreamingOutTemplateRequest(this);
        } 

    } 

    public static class StreamingOutTemplate extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        private String templateId;

        private StreamingOutTemplate(Builder builder) {
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamingOutTemplate create() {
            return builder().build();
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String templateId; 

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public StreamingOutTemplate build() {
                return new StreamingOutTemplate(this);
            } 

        } 

    }
}
