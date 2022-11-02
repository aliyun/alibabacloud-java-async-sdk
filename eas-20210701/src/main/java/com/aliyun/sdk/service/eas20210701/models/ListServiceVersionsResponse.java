// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceVersionsResponse</p>
 */
public class ListServiceVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceVersionsResponseBody body;

    private ListServiceVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceVersionsResponse create() {
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
    public ListServiceVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceVersionsResponseBody body);

        @Override
        ListServiceVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceVersionsResponse response) {
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
        public Builder body(ListServiceVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceVersionsResponse build() {
            return new ListServiceVersionsResponse(this);
        } 

    } 

}
