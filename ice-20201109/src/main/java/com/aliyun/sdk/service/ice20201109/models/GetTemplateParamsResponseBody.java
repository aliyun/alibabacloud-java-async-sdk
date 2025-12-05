// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetTemplateParamsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParamsResponseBody</p>
 */
public class GetTemplateParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamList")
    private java.util.List<ParamList> paramList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private GetTemplateParamsResponseBody(Builder builder) {
        this.paramList = builder.paramList;
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateParamsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramList
     */
    public java.util.List<ParamList> getParamList() {
        return this.paramList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private java.util.List<ParamList> paramList; 
        private String requestId; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(GetTemplateParamsResponseBody model) {
            this.paramList = model.paramList;
            this.requestId = model.requestId;
            this.templateId = model.templateId;
        } 

        /**
         * <p>The queried parameters.</p>
         */
        public Builder paramList(java.util.List<ParamList> paramList) {
            this.paramList = paramList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>419c8741c1b4325f035b</strong></strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public GetTemplateParamsResponseBody build() {
            return new GetTemplateParamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateParamsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParamsResponseBody</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("TimelineIn")
        private Float timelineIn;

        @com.aliyun.core.annotation.NameInMap("TimelineOut")
        private Float timelineOut;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private ParamList(Builder builder) {
            this.content = builder.content;
            this.coverUrl = builder.coverUrl;
            this.height = builder.height;
            this.key = builder.key;
            this.mediaUrl = builder.mediaUrl;
            this.timelineIn = builder.timelineIn;
            this.timelineOut = builder.timelineOut;
            this.type = builder.type;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        /**
         * @return timelineIn
         */
        public Float getTimelineIn() {
            return this.timelineIn;
        }

        /**
         * @return timelineOut
         */
        public Float getTimelineOut() {
            return this.timelineOut;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private String content; 
            private String coverUrl; 
            private Integer height; 
            private String key; 
            private String mediaUrl; 
            private Float timelineIn; 
            private Float timelineOut; 
            private String type; 
            private Integer width; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.content = model.content;
                this.coverUrl = model.coverUrl;
                this.height = model.height;
                this.key = model.key;
                this.mediaUrl = model.mediaUrl;
                this.timelineIn = model.timelineIn;
                this.timelineOut = model.timelineOut;
                this.type = model.type;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The original subtitle content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The thumbnail URL of the original material.</p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>video1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The URL of the original material.</p>
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
                return this;
            }

            /**
             * TimelineIn.
             */
            public Builder timelineIn(Float timelineIn) {
                this.timelineIn = timelineIn;
                return this;
            }

            /**
             * TimelineOut.
             */
            public Builder timelineOut(Float timelineOut) {
                this.timelineOut = timelineOut;
                return this;
            }

            /**
             * <p>The material type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Video</li>
             * <li>Text</li>
             * <li>Image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
}
