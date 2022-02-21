// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubSceneResponse} extends {@link TeaModel}
 *
 * <p>ListSubSceneResponse</p>
 */
public class ListSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSubSceneResponseBody body;

    private ListSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSubSceneResponse create() {
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
    public ListSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSubSceneResponseBody body);

        @Override
        ListSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSubSceneResponse response) {
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
        public Builder body(ListSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSubSceneResponse build() {
            return new ListSubSceneResponse(this);
        } 

    } 

}
