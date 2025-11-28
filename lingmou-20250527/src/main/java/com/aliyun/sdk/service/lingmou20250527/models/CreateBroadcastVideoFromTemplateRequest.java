// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateBroadcastVideoFromTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateBroadcastVideoFromTemplateRequest</p>
 */
public class CreateBroadcastVideoFromTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List<TemplateVariable> variables;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoOptions")
    private VideoOptions videoOptions;

    private CreateBroadcastVideoFromTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.variables = builder.variables;
        this.videoOptions = builder.videoOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBroadcastVideoFromTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return variables
     */
    public java.util.List<TemplateVariable> getVariables() {
        return this.variables;
    }

    /**
     * @return videoOptions
     */
    public VideoOptions getVideoOptions() {
        return this.videoOptions;
    }

    public static final class Builder extends Request.Builder<CreateBroadcastVideoFromTemplateRequest, Builder> {
        private String name; 
        private String templateId; 
        private java.util.List<TemplateVariable> variables; 
        private VideoOptions videoOptions; 

        private Builder() {
            super();
        } 

        private Builder(CreateBroadcastVideoFromTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templateId = request.templateId;
            this.variables = request.variables;
            this.videoOptions = request.videoOptions;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.List<TemplateVariable> variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * videoOptions.
         */
        public Builder videoOptions(VideoOptions videoOptions) {
            this.putBodyParameter("videoOptions", videoOptions);
            this.videoOptions = videoOptions;
            return this;
        }

        @Override
        public CreateBroadcastVideoFromTemplateRequest build() {
            return new CreateBroadcastVideoFromTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBroadcastVideoFromTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateBroadcastVideoFromTemplateRequest</p>
     */
    public static class VideoOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("watermark")
        private Boolean watermark;

        private VideoOptions(Builder builder) {
            this.fps = builder.fps;
            this.resolution = builder.resolution;
            this.watermark = builder.watermark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoOptions create() {
            return builder().build();
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return watermark
         */
        public Boolean getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private Integer fps; 
            private String resolution; 
            private Boolean watermark; 

            private Builder() {
            } 

            private Builder(VideoOptions model) {
                this.fps = model.fps;
                this.resolution = model.resolution;
                this.watermark = model.watermark;
            } 

            /**
             * fps.
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * watermark.
             */
            public Builder watermark(Boolean watermark) {
                this.watermark = watermark;
                return this;
            }

            public VideoOptions build() {
                return new VideoOptions(this);
            } 

        } 

    }
}
