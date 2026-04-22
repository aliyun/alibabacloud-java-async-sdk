// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link PromptAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>PromptAgentSessionRequest</p>
 */
public class PromptAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private PromptAgentSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromptAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<PromptAgentSessionRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(PromptAgentSessionRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public PromptAgentSessionRequest build() {
            return new PromptAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link PromptAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private Object context;

        private Meta(Builder builder) {
            this.context = builder.context;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public Object getContext() {
            return this.context;
        }

        public static final class Builder {
            private Object context; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.context = model.context;
            } 

            /**
             * Context.
             */
            public Builder context(Object context) {
                this.context = context;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link PromptAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionRequest</p>
     */
    public static class PromptMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hide")
        private Boolean hide;

        private PromptMeta(Builder builder) {
            this.hide = builder.hide;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptMeta create() {
            return builder().build();
        }

        /**
         * @return hide
         */
        public Boolean getHide() {
            return this.hide;
        }

        public static final class Builder {
            private Boolean hide; 

            private Builder() {
            } 

            private Builder(PromptMeta model) {
                this.hide = model.hide;
            } 

            /**
             * Hide.
             */
            public Builder hide(Boolean hide) {
                this.hide = hide;
                return this;
            }

            public PromptMeta build() {
                return new PromptMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link PromptAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionRequest</p>
     */
    public static class Prompt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private PromptMeta meta;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Prompt(Builder builder) {
            this.description = builder.description;
            this.meta = builder.meta;
            this.mimeType = builder.mimeType;
            this.name = builder.name;
            this.size = builder.size;
            this.text = builder.text;
            this.title = builder.title;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prompt create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return meta
         */
        public PromptMeta getMeta() {
            return this.meta;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String description; 
            private PromptMeta meta; 
            private String mimeType; 
            private String name; 
            private Long size; 
            private String text; 
            private String title; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Prompt model) {
                this.description = model.description;
                this.meta = model.meta;
                this.mimeType = model.mimeType;
                this.name = model.name;
                this.size = model.size;
                this.text = model.text;
                this.title = model.title;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(PromptMeta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * MimeType.
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Prompt build() {
                return new Prompt(this);
            } 

        } 

    }
    /**
     * 
     * {@link PromptAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>PromptAgentSessionRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private java.util.List<Prompt> prompt;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Params(Builder builder) {
            this.meta = builder.meta;
            this.prompt = builder.prompt;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return prompt
         */
        public java.util.List<Prompt> getPrompt() {
            return this.prompt;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private Meta meta; 
            private java.util.List<Prompt> prompt; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.meta = model.meta;
                this.prompt = model.prompt;
                this.sessionId = model.sessionId;
            } 

            /**
             * Meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(java.util.List<Prompt> prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
