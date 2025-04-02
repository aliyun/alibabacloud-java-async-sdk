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
 * {@link InvokeAssistantRequest} extends {@link RequestModel}
 *
 * <p>InvokeAssistantRequest</p>
 */
public class InvokeAssistantRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("history")
    private java.util.List<History> history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    private InvokeAssistantRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.assistantId = builder.assistantId;
        this.content = builder.content;
        this.history = builder.history;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAssistantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return history
     */
    public java.util.List<History> getHistory() {
        return this.history;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<InvokeAssistantRequest, Builder> {
        private String accountId; 
        private String assistantId; 
        private java.util.List<Content> content; 
        private java.util.List<History> history; 
        private String sessionId; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAssistantRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.assistantId = request.assistantId;
            this.content = request.content;
            this.history = request.history;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;type&quot;: &quot;text&quot;,
         *         &quot;text&quot;: &quot;你好&quot;
         *     }
         * ]</p>
         */
        public Builder content(java.util.List<Content> content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * history.
         */
        public Builder history(java.util.List<History> history) {
            this.putBodyParameter("history", history);
            this.history = history;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public InvokeAssistantRequest build() {
            return new InvokeAssistantRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;type&quot;: &quot;text&quot;,
             *         &quot;text&quot;: &quot;你好&quot;
             *     }
             * ]</p>
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
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class DingCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardDesc")
        private String cardDesc;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;type&quot;: &quot;text&quot;,
             *         &quot;text&quot;: &quot;你好&quot;
             *     }
             * ]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_card_schema</p>
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
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
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
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
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
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
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
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ContentCardCallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ContentCardCallback(Builder builder) {
            this.content = builder.content;
            this.templateId = builder.templateId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentCardCallback create() {
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

            private Builder(ContentCardCallback model) {
                this.content = model.content;
                this.templateId = model.templateId;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;type&quot;: &quot;text&quot;,
             *         &quot;text&quot;: &quot;你好&quot;
             *     }
             * ]</p>
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

            public ContentCardCallback build() {
                return new ContentCardCallback(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ContentDingCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardDesc")
        private String cardDesc;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private ContentDingCard(Builder builder) {
            this.cardDesc = builder.cardDesc;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.finished = builder.finished;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentDingCard create() {
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

            private Builder(ContentDingCard model) {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;type&quot;: &quot;text&quot;,
             *         &quot;text&quot;: &quot;你好&quot;
             *     }
             * ]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_card_schema</p>
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

            public ContentDingCard build() {
                return new ContentDingCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ContentImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("imageDesc")
        private String imageDesc;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ContentImageUrl(Builder builder) {
            this.detail = builder.detail;
            this.imageDesc = builder.imageDesc;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentImageUrl create() {
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

            private Builder(ContentImageUrl model) {
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

            public ContentImageUrl build() {
                return new ContentImageUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ContentMarkdown extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ContentMarkdown(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentMarkdown create() {
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

            private Builder(ContentMarkdown model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ContentMarkdown build() {
                return new ContentMarkdown(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ContentText extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ContentText(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentText create() {
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

            private Builder(ContentText model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ContentText build() {
                return new ContentText(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class HistoryContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardCallback")
        private ContentCardCallback cardCallback;

        @com.aliyun.core.annotation.NameInMap("dingCard")
        private ContentDingCard dingCard;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ContentImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("markdown")
        private ContentMarkdown markdown;

        @com.aliyun.core.annotation.NameInMap("text")
        private ContentText text;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private HistoryContent(Builder builder) {
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

        public static HistoryContent create() {
            return builder().build();
        }

        /**
         * @return cardCallback
         */
        public ContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        /**
         * @return dingCard
         */
        public ContentDingCard getDingCard() {
            return this.dingCard;
        }

        /**
         * @return imageUrl
         */
        public ContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return markdown
         */
        public ContentMarkdown getMarkdown() {
            return this.markdown;
        }

        /**
         * @return text
         */
        public ContentText getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ContentCardCallback cardCallback; 
            private ContentDingCard dingCard; 
            private ContentImageUrl imageUrl; 
            private ContentMarkdown markdown; 
            private ContentText text; 
            private String type; 

            private Builder() {
            } 

            private Builder(HistoryContent model) {
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
            public Builder cardCallback(ContentCardCallback cardCallback) {
                this.cardCallback = cardCallback;
                return this;
            }

            /**
             * dingCard.
             */
            public Builder dingCard(ContentDingCard dingCard) {
                this.dingCard = dingCard;
                return this;
            }

            /**
             * imageUrl.
             */
            public Builder imageUrl(ContentImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * markdown.
             */
            public Builder markdown(ContentMarkdown markdown) {
                this.markdown = markdown;
                return this;
            }

            /**
             * text.
             */
            public Builder text(ContentText text) {
                this.text = text;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HistoryContent build() {
                return new HistoryContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<HistoryContent> content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private History(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<HistoryContent> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<HistoryContent> content; 
            private String role; 

            private Builder() {
            } 

            private Builder(History model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;type&quot;: &quot;text&quot;,
             *         &quot;text&quot;: &quot;你好&quot;
             *     }
             * ]</p>
             */
            public Builder content(java.util.List<HistoryContent> content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
}
