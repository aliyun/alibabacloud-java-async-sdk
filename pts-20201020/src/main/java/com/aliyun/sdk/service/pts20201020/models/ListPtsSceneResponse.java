// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>ListPtsSceneResponse</p>
 */
public class ListPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPtsSceneResponseBody body;

    private ListPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPtsSceneResponse create() {
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
    public ListPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPtsSceneResponseBody body);

        @Override
        ListPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPtsSceneResponse response) {
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
        public Builder body(ListPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPtsSceneResponse build() {
            return new ListPtsSceneResponse(this);
        } 

    } 

}
