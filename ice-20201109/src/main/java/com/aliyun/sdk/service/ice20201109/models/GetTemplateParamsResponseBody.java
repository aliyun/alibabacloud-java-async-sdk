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

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ParamList(Builder builder) {
            this.content = builder.content;
            this.coverUrl = builder.coverUrl;
            this.key = builder.key;
            this.mediaUrl = builder.mediaUrl;
            this.type = builder.type;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String coverUrl; 
            private String key; 
            private String mediaUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.content = model.content;
                this.coverUrl = model.coverUrl;
                this.key = model.key;
                this.mediaUrl = model.mediaUrl;
                this.type = model.type;
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

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
}
