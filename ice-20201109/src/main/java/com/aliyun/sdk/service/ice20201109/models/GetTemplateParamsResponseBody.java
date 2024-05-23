// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateParamsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParamsResponseBody</p>
 */
public class GetTemplateParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamList")
    private java.util.List < ParamList> paramList;

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

    /**
     * @return paramList
     */
    public java.util.List < ParamList> getParamList() {
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
        private java.util.List < ParamList> paramList; 
        private String requestId; 
        private String templateId; 

        /**
         * ParamList.
         */
        public Builder paramList(java.util.List < ParamList> paramList) {
            this.paramList = paramList;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public GetTemplateParamsResponseBody build() {
            return new GetTemplateParamsResponseBody(this);
        } 

    } 

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

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
                return this;
            }

            /**
             * Type.
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
