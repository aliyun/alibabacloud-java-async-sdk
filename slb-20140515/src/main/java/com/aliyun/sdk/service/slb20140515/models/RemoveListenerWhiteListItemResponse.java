// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveListenerWhiteListItemResponse} extends {@link TeaModel}
 *
 * <p>RemoveListenerWhiteListItemResponse</p>
 */
public class RemoveListenerWhiteListItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveListenerWhiteListItemResponseBody body;

    private RemoveListenerWhiteListItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveListenerWhiteListItemResponse create() {
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
    public RemoveListenerWhiteListItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveListenerWhiteListItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveListenerWhiteListItemResponseBody body);

        @Override
        RemoveListenerWhiteListItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveListenerWhiteListItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveListenerWhiteListItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveListenerWhiteListItemResponse response) {
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
        public Builder body(RemoveListenerWhiteListItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveListenerWhiteListItemResponse build() {
            return new RemoveListenerWhiteListItemResponse(this);
        } 

    } 

}
