// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListAppVersionsResponse</p>
 */
public class ListAppVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppVersionsResponseBody body;

    private ListAppVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppVersionsResponse create() {
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
    public ListAppVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppVersionsResponseBody body);

        @Override
        ListAppVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppVersionsResponse response) {
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
        public Builder body(ListAppVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppVersionsResponse build() {
            return new ListAppVersionsResponse(this);
        } 

    } 

}
