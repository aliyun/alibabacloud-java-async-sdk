// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceAuthsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceAuthsResponse</p>
 */
public class ListServiceAuthsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceAuthsResponseBody body;

    private ListServiceAuthsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceAuthsResponse create() {
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
    public ListServiceAuthsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceAuthsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceAuthsResponseBody body);

        @Override
        ListServiceAuthsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceAuthsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceAuthsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceAuthsResponse response) {
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
        public Builder body(ListServiceAuthsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceAuthsResponse build() {
            return new ListServiceAuthsResponse(this);
        } 

    } 

}
