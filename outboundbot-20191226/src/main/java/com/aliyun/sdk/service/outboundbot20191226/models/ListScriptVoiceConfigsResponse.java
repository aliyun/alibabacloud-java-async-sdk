// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptVoiceConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListScriptVoiceConfigsResponse</p>
 */
public class ListScriptVoiceConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScriptVoiceConfigsResponseBody body;

    private ListScriptVoiceConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScriptVoiceConfigsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListScriptVoiceConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScriptVoiceConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScriptVoiceConfigsResponseBody body);

        @Override
        ListScriptVoiceConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScriptVoiceConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScriptVoiceConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScriptVoiceConfigsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListScriptVoiceConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScriptVoiceConfigsResponse build() {
            return new ListScriptVoiceConfigsResponse(this);
        } 

    } 

}
