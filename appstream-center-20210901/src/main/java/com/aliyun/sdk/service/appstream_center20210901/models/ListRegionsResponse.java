// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListRegionsResponse</p>
 */
public class ListRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRegionsResponseBody body;

    private ListRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRegionsResponse create() {
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
    public ListRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRegionsResponseBody body);

        @Override
        ListRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRegionsResponse response) {
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
        public Builder body(ListRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRegionsResponse build() {
            return new ListRegionsResponse(this);
        } 

    } 

}
