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
 * {@link CreateRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRunResponseBody</p>
 */
public class CreateRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cancelledAt")
    private Long cancelledAt;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("createAt")
    private Long createAt;

    @com.aliyun.core.annotation.NameInMap("delta")
    private Delta delta;

    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("failedAt")
    private Long failedAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("lastErrorMsg")
    private String lastErrorMsg;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private Long startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    private CreateRunResponseBody(Builder builder) {
        this.cancelledAt = builder.cancelledAt;
        this.completedAt = builder.completedAt;
        this.content = builder.content;
        this.createAt = builder.createAt;
        this.delta = builder.delta;
        this.expiresAt = builder.expiresAt;
        this.failedAt = builder.failedAt;
        this.id = builder.id;
        this.lastErrorMsg = builder.lastErrorMsg;
        this.metadata = builder.metadata;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelledAt
     */
    public Long getCancelledAt() {
        return this.cancelledAt;
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return createAt
     */
    public Long getCreateAt() {
        return this.createAt;
    }

    /**
     * @return delta
     */
    public Delta getDelta() {
        return this.delta;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return failedAt
     */
    public Long getFailedAt() {
        return this.failedAt;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastErrorMsg
     */
    public String getLastErrorMsg() {
        return this.lastErrorMsg;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedAt
     */
    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder {
        private Long cancelledAt; 
        private Long completedAt; 
        private Content content; 
        private Long createAt; 
        private Delta delta; 
        private Long expiresAt; 
        private Long failedAt; 
        private String id; 
        private String lastErrorMsg; 
        private java.util.Map<String, ?> metadata; 
        private String object; 
        private String requestId; 
        private Long startedAt; 
        private String status; 
        private String threadId; 

        private Builder() {
        } 

        private Builder(CreateRunResponseBody model) {
            this.cancelledAt = model.cancelledAt;
            this.completedAt = model.completedAt;
            this.content = model.content;
            this.createAt = model.createAt;
            this.delta = model.delta;
            this.expiresAt = model.expiresAt;
            this.failedAt = model.failedAt;
            this.id = model.id;
            this.lastErrorMsg = model.lastErrorMsg;
            this.metadata = model.metadata;
            this.object = model.object;
            this.requestId = model.requestId;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.threadId = model.threadId;
        } 

        /**
         * cancelledAt.
         */
        public Builder cancelledAt(Long cancelledAt) {
            this.cancelledAt = cancelledAt;
            return this;
        }

        /**
         * completedAt.
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * createAt.
         */
        public Builder createAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }

        /**
         * delta.
         */
        public Builder delta(Delta delta) {
            this.delta = delta;
            return this;
        }

        /**
         * expiresAt.
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * failedAt.
         */
        public Builder failedAt(Long failedAt) {
            this.failedAt = failedAt;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * lastErrorMsg.
         */
        public Builder lastErrorMsg(String lastErrorMsg) {
            this.lastErrorMsg = lastErrorMsg;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
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
         * startedAt.
         */
        public Builder startedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        public CreateRunResponseBody build() {
            return new CreateRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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

            public ContentCardCallback build() {
                return new ContentCardCallback(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class ContentDingCard extends TeaModel {
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

            public ContentDingCard build() {
                return new ContentDingCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class DeltaContent extends TeaModel {
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
        private String type;

        private DeltaContent(Builder builder) {
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

        public static DeltaContent create() {
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

            private Builder(DeltaContent model) {
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DeltaContent build() {
                return new DeltaContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class Delta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private DeltaContent content;

        private Delta(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delta create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public DeltaContent getContent() {
            return this.content;
        }

        public static final class Builder {
            private DeltaContent content; 

            private Builder() {
            } 

            private Builder(Delta model) {
                this.content = model.content;
            } 

            /**
             * content.
             */
            public Builder content(DeltaContent content) {
                this.content = content;
                return this;
            }

            public Delta build() {
                return new Delta(this);
            } 

        } 

    }
}
