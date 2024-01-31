// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppStreamingOutTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAppStreamingOutTemplateRequest</p>
 */
public class CreateAppStreamingOutTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("StreamingOutTemplate")
    @Validation(required = true)
    private StreamingOutTemplate streamingOutTemplate;

    private CreateAppStreamingOutTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.streamingOutTemplate = builder.streamingOutTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppStreamingOutTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAppStreamingOutTemplateRequest, Builder> {
        private String appId; 
        private StreamingOutTemplate streamingOutTemplate; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppStreamingOutTemplateRequest request) {
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
        public CreateAppStreamingOutTemplateRequest build() {
            return new CreateAppStreamingOutTemplateRequest(this);
        } 

    } 

    public static class StreamingOutTemplate extends TeaModel {
        @NameInMap("EnableVad")
        private Boolean enableVad;

        @NameInMap("LayoutIds")
        @Validation(required = true)
        private java.util.List < String > layoutIds;

        @NameInMap("MediaEncode")
        @Validation(required = true)
        private Integer mediaEncode;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        private StreamingOutTemplate(Builder builder) {
            this.enableVad = builder.enableVad;
            this.layoutIds = builder.layoutIds;
            this.mediaEncode = builder.mediaEncode;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamingOutTemplate create() {
            return builder().build();
        }

        /**
         * @return enableVad
         */
        public Boolean getEnableVad() {
            return this.enableVad;
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

        public static final class Builder {
            private Boolean enableVad; 
            private java.util.List < String > layoutIds; 
            private Integer mediaEncode; 
            private String name; 

            /**
             * EnableVad.
             */
            public Builder enableVad(Boolean enableVad) {
                this.enableVad = enableVad;
                return this;
            }

            /**
             * LayoutIds.
             */
            public Builder layoutIds(java.util.List < String > layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * MediaEncode.
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public StreamingOutTemplate build() {
                return new StreamingOutTemplate(this);
            } 

        } 

    }
}
