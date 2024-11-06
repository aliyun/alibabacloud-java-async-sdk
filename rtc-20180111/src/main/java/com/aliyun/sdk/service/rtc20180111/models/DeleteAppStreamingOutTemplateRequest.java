// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppStreamingOutTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppStreamingOutTemplateRequest</p>
 */
public class DeleteAppStreamingOutTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamingOutTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wv7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link DeleteAppStreamingOutTemplateRequest} extends {@link TeaModel}
     *
     * <p>DeleteAppStreamingOutTemplateRequest</p>
     */
    public static class StreamingOutTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xd4c****</p>
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
