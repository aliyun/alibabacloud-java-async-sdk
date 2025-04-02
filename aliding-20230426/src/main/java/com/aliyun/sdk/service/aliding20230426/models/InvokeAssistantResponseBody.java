// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeAssistantResponseBody</p>
 */
public class InvokeAssistantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("streamEnd")
    private Boolean streamEnd;

    private InvokeAssistantResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.streamEnd = builder.streamEnd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAssistantResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return streamEnd
     */
    public Boolean getStreamEnd() {
        return this.streamEnd;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private String requestId; 
        private String sessionId; 
        private Boolean streamEnd; 

        private Builder() {
        } 

        private Builder(InvokeAssistantResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.streamEnd = model.streamEnd;
        } 

        /**
         * content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * streamEnd.
         */
        public Builder streamEnd(Boolean streamEnd) {
            this.streamEnd = streamEnd;
            return this;
        }

        public InvokeAssistantResponseBody build() {
            return new InvokeAssistantResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class CardCallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private CardCallback(Builder builder) {
            this.content = builder.content;
            this.templateId = builder.templateId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardCallback create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String content; 
            private String templateId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(CardCallback model) {
                this.content = model.content;
                this.templateId = model.templateId;
                this.userId = model.userId;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public CardCallback build() {
                return new CardCallback(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class DingCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardDesc")
        private String cardDesc;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private DingCard(Builder builder) {
            this.cardDesc = builder.cardDesc;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.finished = builder.finished;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingCard create() {
            return builder().build();
        }

        /**
         * @return cardDesc
         */
        public String getCardDesc() {
            return this.cardDesc;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String cardDesc; 
            private String content; 
            private String contentType; 
            private Boolean finished; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(DingCard model) {
                this.cardDesc = model.cardDesc;
                this.content = model.content;
                this.contentType = model.contentType;
                this.finished = model.finished;
                this.templateId = model.templateId;
            } 

            /**
             * cardDesc.
             */
            public Builder cardDesc(String cardDesc) {
                this.cardDesc = cardDesc;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public DingCard build() {
                return new DingCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class ImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("imageDesc")
        private String imageDesc;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ImageUrl(Builder builder) {
            this.detail = builder.detail;
            this.imageDesc = builder.imageDesc;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrl create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return imageDesc
         */
        public String getImageDesc() {
            return this.imageDesc;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String detail; 
            private String imageDesc; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrl model) {
                this.detail = model.detail;
                this.imageDesc = model.imageDesc;
                this.url = model.url;
            } 

            /**
             * detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * imageDesc.
             */
            public Builder imageDesc(String imageDesc) {
                this.imageDesc = imageDesc;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrl build() {
                return new ImageUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class Markdown extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Markdown(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Markdown create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            private Builder() {
            } 

            private Builder(Markdown model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Markdown build() {
                return new Markdown(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class Text extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Text(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Text create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            private Builder() {
            } 

            private Builder(Text model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Text build() {
                return new Text(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAssistantResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardCallback")
        private CardCallback cardCallback;

        @com.aliyun.core.annotation.NameInMap("dingCard")
        private DingCard dingCard;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("markdown")
        private Markdown markdown;

        @com.aliyun.core.annotation.NameInMap("text")
        private Text text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Content(Builder builder) {
            this.cardCallback = builder.cardCallback;
            this.dingCard = builder.dingCard;
            this.imageUrl = builder.imageUrl;
            this.markdown = builder.markdown;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cardCallback
         */
        public CardCallback getCardCallback() {
            return this.cardCallback;
        }

        /**
         * @return dingCard
         */
        public DingCard getDingCard() {
            return this.dingCard;
        }

        /**
         * @return imageUrl
         */
        public ImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return markdown
         */
        public Markdown getMarkdown() {
            return this.markdown;
        }

        /**
         * @return text
         */
        public Text getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CardCallback cardCallback; 
            private DingCard dingCard; 
            private ImageUrl imageUrl; 
            private Markdown markdown; 
            private Text text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cardCallback = model.cardCallback;
                this.dingCard = model.dingCard;
                this.imageUrl = model.imageUrl;
                this.markdown = model.markdown;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * cardCallback.
             */
            public Builder cardCallback(CardCallback cardCallback) {
                this.cardCallback = cardCallback;
                return this;
            }

            /**
             * dingCard.
             */
            public Builder dingCard(DingCard dingCard) {
                this.dingCard = dingCard;
                return this;
            }

            /**
             * imageUrl.
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * markdown.
             */
            public Builder markdown(Markdown markdown) {
                this.markdown = markdown;
                return this;
            }

            /**
             * text.
             */
            public Builder text(Text text) {
                this.text = text;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
