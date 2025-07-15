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
 * {@link GetEdgeTranscodeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeTranscodeTemplateResponseBody</p>
 */
public class GetEdgeTranscodeTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    private GetEdgeTranscodeTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeTranscodeTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String requestId; 
        private Template template; 

        private Builder() {
        } 

        private Builder(GetEdgeTranscodeTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.template = model.template;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the edge transcoding template.</p>
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public GetEdgeTranscodeTemplateResponseBody build() {
            return new GetEdgeTranscodeTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeTranscodeTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeTranscodeTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Template(Builder builder) {
            this.bitrate = builder.bitrate;
            this.codec = builder.codec;
            this.createTime = builder.createTime;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.name = builder.name;
            this.resolution = builder.resolution;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bitrate; 
            private String codec; 
            private String createTime; 
            private String fps; 
            private String gop; 
            private String name; 
            private String resolution; 
            private String templateId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.bitrate = model.bitrate;
                this.codec = model.codec;
                this.createTime = model.createTime;
                this.fps = model.fps;
                this.gop = model.gop;
                this.name = model.name;
                this.resolution = model.resolution;
                this.templateId = model.templateId;
                this.type = model.type;
            } 

            /**
             * <p>The bitrate. If a numeric value is returned, a fixed bitrate is configured for the output stream. If ws is returned, the output stream maintains the same bitrate as the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The video encoding format. Valid values:</p>
             * <ul>
             * <li>H.264</li>
             * <li>H.265</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T02:48:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The frame rate. If a numeric value is returned, a fixed frame rate is configured for the output stream. If ws is returned, the output stream maintains the same frame rate as the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The group of pictures (GOP) size. The GOP size can be defined by the number of frames or the time interval between I-frames. If ws is returned, the output stream maintains the same GOP size as the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>2s</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>my_template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resolution. If width and height values are returned, a fixed resolution is configured for the output stream. If ws is returned, the output stream maintains the same resolution as the input stream.</p>
             * <blockquote>
             * <p> If the width value is -1, the width of the output stream is adapted to the height. If the height value is -2, the height of the output stream is adapted to the width.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1920*1080</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9b1571b513cb44f7a1ba6ae561ff****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The type of edge transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
