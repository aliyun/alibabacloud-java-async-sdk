// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAppStreamingOutTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppStreamingOutTemplateRequest</p>
 */
public class ModifyAppStreamingOutTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamingOutTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private StreamingOutTemplate streamingOutTemplate;

    private ModifyAppStreamingOutTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.streamingOutTemplate = builder.streamingOutTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppStreamingOutTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyAppStreamingOutTemplateRequest, Builder> {
        private String appId; 
        private StreamingOutTemplate streamingOutTemplate; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppStreamingOutTemplateRequest request) {
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
        public ModifyAppStreamingOutTemplateRequest build() {
            return new ModifyAppStreamingOutTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppStreamingOutTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppStreamingOutTemplateRequest</p>
     */
    public static class StreamingOutTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > layoutIds;

        @com.aliyun.core.annotation.NameInMap("MediaEncode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer mediaEncode;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateId;

        private StreamingOutTemplate(Builder builder) {
            this.layoutIds = builder.layoutIds;
            this.mediaEncode = builder.mediaEncode;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamingOutTemplate create() {
            return builder().build();
        }

        /**
         * @return layoutIds
         */
        public java.util.List < String > getLayoutIds() {
            return this.layoutIds;
        }

        /**
         * @return mediaEncode
         */
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private java.util.List < String > layoutIds; 
            private Integer mediaEncode; 
            private String name; 
            private String templateId; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder layoutIds(java.util.List < String > layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>模版</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ac7N****</p>
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
