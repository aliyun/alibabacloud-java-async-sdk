// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSceneItemsResponse} extends {@link TeaModel}
 *
 * <p>ListSceneItemsResponse</p>
 */
public class ListSceneItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSceneItemsResponseBody body;

    private ListSceneItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSceneItemsResponse create() {
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
    public ListSceneItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSceneItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSceneItemsResponseBody body);

        @Override
        ListSceneItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSceneItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSceneItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSceneItemsResponse response) {
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
        public Builder body(ListSceneItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSceneItemsResponse build() {
            return new ListSceneItemsResponse(this);
        } 

    } 

}
